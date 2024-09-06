/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function login() { 
    
console.log("sss");
 $.ajax({
            url:'<%=request.getContextPath()%>/CtrlLogin',
            type: 'POST',
            data: {'bnd': 1},
            success: function (response) {
                const array = eval("(" + response + ")");
                console.log(array);
                
            },
            error: function () {
                console.log("Error");
            }
        });
}

