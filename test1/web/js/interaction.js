/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function abrirSitio() { 
//    alert("hosssañ"); 
   document.getElementById('modal').style.display = 'block';
   var iframe = document.getElementById('ventanaModal');
			iframe.src = 'http://10.63.17.235:9001/trabajo_social_cem/poa/login.jsp';
                        
}
