
 (async function load() {
            
        async function getData(url) {
        const response = await fetch(url);
        const data = await response.json();
        return data;
        }
    
        const publicacionesList=await getData('http://localhost:8080/Sesion01-02/cliente.do')
              
        function PublicacionesTemplate(p) {
            return (
                `<tr>
                    <td>${p.idPais}</td>
                    <td>${p.nombPais}</td>
                </tr>`              
            )
        }

        function AbrirTabla(){
            return (
                `<table id="tabla2" border="3">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>NombPais</th>
                    </tr>
                 </thead>
                 <tbody>`               
            )
        }

        function cerrarTabla(){
            return (
                `</tbody>
                </table>`
            )
        }

        var respaldohtml=AbrirTabla();

        
        publicacionesList.forEach((p)=>{
            const HTMLString=PublicacionesTemplate(p);
            respaldohtml+=HTMLString;
        })

        mostrarTabla();

        function mostrarTabla(){

            respaldohtml+=cerrarTabla();
            const $containerbody=document.getElementsByTagName('body')[0];
            const htmlbody=document.implementation.createHTMLDocument();
            htmlbody.body.innerHTML=respaldohtml
            console.log(respaldohtml)
            $containerbody.append(htmlbody.body.children[0]);

        }


})()



