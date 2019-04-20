$(function(){
    $("#frmCliente").bind("submit", function () {
        return Create();
    });

    function Create() {
        $.ajax({
            url: 'cliente.do',
            type: 'POST',
            data: {
                nomPais: $("#txtNombPais").val()
            },
            success: function () {

            }
        });
    }
    // List();
    // function List(){
    //     $.ajax({
    //         url:'cliente.do',
    //         data:{},
    //         type:'GET',
    //         dataType:'json',
    //         success:function(respJson){
    //             $("#tblList").html("");
    //             $("#tblList").html(
    //                     "<thead>" +
    //                     "<tr>" +
    //                     "<th>Id</th>" +
    //                     "<th>NombPais</th>" +
    //                     "</tr>" +
    //                     "</thead>"+
    //                     "<tbody>"+
    //                     "</tbody>"
    //                     );
    //             for (var i in respJson){
    //                 var pais=respJson[i];
    //                 $("#tblList tbody").append(
    //                     "<tr>"+
    //                         "<td>"+pais.idPais+"</td>"+
    //                         "<td>"+pais.nombPais+"</td>"+
    //                     "</tr>" 
    //                 );
    //             }
                
    //         }
    //     });
    // }
    
});

