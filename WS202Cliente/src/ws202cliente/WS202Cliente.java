/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws202cliente;


public class WS202Cliente {

    
    public static void main(String[] args) {
        // TODO code application logic here
        String mensaje=obtenerCodigo("123cuatrocinco6");
        System.out.println("Resultado de la Ws : " +mensaje);
    }

    private static String obtenerCodigo(java.lang.String codigo) {
        com.empresa.proyecto.ws.WS2021_Service service = new com.empresa.proyecto.ws.WS2021_Service();
        com.empresa.proyecto.ws.WS2021 port = service.getWS2021Port();
        return port.obtenerCodigo(codigo);
    }
    
}
