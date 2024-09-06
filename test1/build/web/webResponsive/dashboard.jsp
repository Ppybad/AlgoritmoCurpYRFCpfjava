<%-- 
    Document   : dashboard
    Created on : 4/01/2024, 12:13:29 PM
    Author     : Pepe Ybad
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
 
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="../assets/vendor/bootstrap/css/bootstrap.min.css">
    <link href="../assets/vendor/fonts/circular-std/style.css" rel="stylesheet">
    <link rel="stylesheet" href="../assets/libs/css/style.css">
    <link rel="stylesheet" href="../assets/vendor/fonts/fontawesome/css/fontawesome-all.css">
    <link rel="stylesheet" href="../assets/vendor/fonts/material-design-iconic-font/css/materialdesignicons.min.css">
    <title>.:: SISTEMA DE LOGIN ISSET::.</title>
</head>

<body>
    <!-- ============================================================== -->
    <!-- main wrapper -->
    <!-- ============================================================== -->
    <div class="dashboard-main-wrapper">
        <!-- ============================================================== -->
        <!-- navbar -->
        <!-- ============================================================== -->
        <div class="dashboard-header">
             <nav class="navbar navbar-expand-lg bg-white fixed-top">
                <a class="navbar-brand" href="index.html">ISSET</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav ml-auto navbar-right-top">
                        <li class="nav-item">
                            <div id="custom-search" class="top-search-bar">
                                <input class="form-control" type="text" placeholder="Search..">
                            </div>
                        </li>
                        <li class="nav-item dropdown notification">
                            <a class="nav-link nav-icons" href="#" id="navbarDropdownMenuLink1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fas fa-fw fa-bell"></i> <span class="indicator"></span></a>
                            <ul class="dropdown-menu dropdown-menu-right notification-dropdown">
                                <li>
                                    <div class="notification-title"> Notification</div>
                                    <div class="notification-list">
                                        <div class="list-group">
                                            <a href="#" class="list-group-item list-group-item-action active">
                                                <div class="notification-info">
                                                    <div class="notification-list-user-img"><img src="assets/images/avatar-2.jpg" alt="" class="user-avatar-md rounded-circle"></div>
                                                    <div class="notification-list-user-block"><span class="notification-list-user-name">Jeremy Rakestraw</span>accepted your invitation to join the team.
                                                        <div class="notification-date">2 min ago</div>
                                                    </div>
                                                </div>
                                            </a>
                                            <a href="#" class="list-group-item list-group-item-action">
                                                <div class="notification-info">
                                                    <div class="notification-list-user-img"><img src="assets/images/avatar-3.jpg" alt="" class="user-avatar-md rounded-circle"></div>
                                                    <div class="notification-list-user-block"><span class="notification-list-user-name">John Abraham </span>is now following you
                                                        <div class="notification-date">2 days ago</div>
                                                    </div>
                                                </div>
                                            </a>
                                            <a href="#" class="list-group-item list-group-item-action">
                                                <div class="notification-info">
                                                    <div class="notification-list-user-img"><img src="assets/images/avatar-4.jpg" alt="" class="user-avatar-md rounded-circle"></div>
                                                    <div class="notification-list-user-block"><span class="notification-list-user-name">Monaan Pechi</span> is watching your main repository
                                                        <div class="notification-date">2 min ago</div>
                                                    </div>
                                                </div>
                                            </a>
                                            <a href="#" class="list-group-item list-group-item-action">
                                                <div class="notification-info">
                                                    <div class="notification-list-user-img"><img src="assets/images/avatar-5.jpg" alt="" class="user-avatar-md rounded-circle"></div>
                                                    <div class="notification-list-user-block"><span class="notification-list-user-name">Jessica Caruso</span>accepted your invitation to join the team.
                                                        <div class="notification-date">2 min ago</div>
                                                    </div>
                                                </div>
                                            </a>
                                        </div>
                                    </div>
                                </li>
                                <li>
                                    <div class="list-footer"> <a href="#">View all notifications</a></div>
                                </li>
                            </ul>
                        </li>
                        <li class="nav-item dropdown connection">
                            <a class="nav-link" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="fas fa-fw fa-th"></i> </a>
                            <ul class="dropdown-menu dropdown-menu-right connection-dropdown">
                                <li class="connection-list">
                                    <div class="row">
                                        <div class="col-xl-4 col-lg-4 col-md-6 col-sm-12 col-12 ">
                                            <a href="#" class="connection-item"><img src="assets/images/github.png" alt="" > <span>Github</span></a>
                                        </div>
                                        <div class="col-xl-4 col-lg-4 col-md-6 col-sm-12 col-12 ">
                                            <a href="#" class="connection-item"><img src="assets/images/dribbble.png" alt="" > <span>Dribbble</span></a>
                                        </div>
                                        <div class="col-xl-4 col-lg-4 col-md-6 col-sm-12 col-12 ">
                                            <a href="#" class="connection-item"><img src="assets/images/dropbox.png" alt="" > <span>Dropbox</span></a>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-xl-4 col-lg-4 col-md-6 col-sm-12 col-12 ">
                                            <a href="#" class="connection-item"><img src="assets/images/bitbucket.png" alt=""> <span>Bitbucket</span></a>
                                        </div>
                                        <div class="col-xl-4 col-lg-4 col-md-6 col-sm-12 col-12 ">
                                            <a href="#" class="connection-item"><img src="assets/images/mail_chimp.png" alt="" ><span>Mail chimp</span></a>
                                        </div>
                                        <div class="col-xl-4 col-lg-4 col-md-6 col-sm-12 col-12 ">
                                            <a href="#" class="connection-item"><img src="assets/images/slack.png" alt="" > <span>Slack</span></a>
                                        </div>
                                    </div>
                                </li>
                                <li>
                                    <div class="conntection-footer"><a href="#">More</a></div>
                                </li>
                            </ul>
                        </li>
                        <li class="nav-item dropdown nav-user">
                            <a class="nav-link nav-user-img" href="#" id="navbarDropdownMenuLink2" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><img src="assets/images/avatar-1.jpg" alt="" class="user-avatar-md rounded-circle"></a>
                            <div class="dropdown-menu dropdown-menu-right nav-user-dropdown" aria-labelledby="navbarDropdownMenuLink2">
                                <div class="nav-user-info">
                                    <h5 class="mb-0 text-white nav-user-name">John Abraham </h5>
                                    <span class="status"></span><span class="ml-2">Available</span>
                                </div>
                                <a class="dropdown-item" href="#"><i class="fas fa-user mr-2"></i>Account</a>
                                <a class="dropdown-item" href="#"><i class="fas fa-cog mr-2"></i>Setting</a>
                                <a class="dropdown-item" href="<%=request.getContextPath()%>"><i class="fas fa-power-off mr-2"></i>Logout</a>
                            </div>
                        </li>
                    </ul>
                </div>
            </nav>
        </div>
        <!-- ============================================================== -->
        <!-- end navbar -->
        <!-- ============================================================== -->
        <!-- ============================================================== -->
        <!-- left sidebar -->
        <!-- ============================================================== -->
        <div class="nav-left-sidebar sidebar-dark">
          <%@ include file = "menu.jsp" %>
        </div>
        <!-- ============================================================== -->
        <!-- end left sidebar -->
        <!-- ============================================================== -->
        <!-- ============================================================== -->
        <!-- wrapper  -->
        <!-- ============================================================== -->
        <div class="dashboard-wrapper">
            <div class="dashboard-ecommerce">
                <div class="container-fluid dashboard-content ">
                    <!-- ============================================================== -->
                    <!-- pageheader  -->
                    <!-- ============================================================== -->
                    <div class="row">
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                            <div class="page-header">
                                <h2 class="pageheader-title">Módulos ISSET </h2>
                                <p class="pageheader-text">Nulla euismod urna eros, sit amet scelerisque torton lectus vel mauris facilisis faucibus at enim quis massa lobortis rutrum.</p>
                                <div class="page-breadcrumb">
                                    <nav aria-label="breadcrumb">
                                        <ol class="breadcrumb">
                                            <li class="breadcrumb-item"><a href="#" class="breadcrumb-link">Dashboard</a></li>
                                            <li class="breadcrumb-item active" aria-current="page">Módulos ISSET</li>
                                        </ol>
                                    </nav>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- ============================================================== -->
                    <!-- end pageheader  -->
                    <!-- ============================================================== -->
                    <div class="ecommerce-widget">
                         
                       <div class="row">
                        
                        <div class="col-xl-4 col-lg-4 col-md-6 col-sm-12 col-12">
                                <div class="card">
                                    <div class="card-header d-flex">
                                        <h4 class="mb-0">Sistema Trabajo social</h4>
                                        <div class="dropdown ml-auto">
                                            <a class="toolbar" href="#" role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="mdi mdi-dots-vertical"></i>  </a>
                                            <div class="dropdown-menu dropdown-menu-right" aria-labelledby="dropdownMenuLink">
                                                <a class="dropdown-item" href="#">Action</a>
                                                <a class="dropdown-item" href="#">Another action</a>
                                                <a class="dropdown-item" href="#">Something else here</a>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="card-body">
                                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                                        <a onclick="abrirSitio()" href="#" class="btn btn-primary">Ir al sitio</a>
                                    </div>
                                </div>
                            </div>

                            <div class="col-xl-4 col-lg-4 col-md-6 col-sm-12 col-12">
                                <div class="card">
                                    <div class="card-header d-flex">
                                        <h4 class="mb-0">Sistema Auditoria Médica</h4>
                                        <div class="dropdown ml-auto">
                                            <a class="toolbar" href="#" role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="mdi mdi-dots-vertical"></i>  </a>
                                            <div class="dropdown-menu dropdown-menu-right" aria-labelledby="dropdownMenuLink">
                                                <a class="dropdown-item" href="#">Action</a>
                                                <a class="dropdown-item" href="#">Another action</a>
                                                <a class="dropdown-item" href="#">Something else here</a>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="card-body">
                                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                                        <a href="#" class="btn btn-primary">Ir al sitio</a>
                                    </div>
                                </div>
                            </div>

                            <div class="col-xl-4 col-lg-4 col-md-6 col-sm-12 col-12">
                                <div class="card">
                                    <div class="card-header d-flex">
                                        <h4 class="mb-0">Sistema Integral de Prestaciones Médicas</h4>
                                        <div class="dropdown ml-auto">
                                            <a class="toolbar" href="#" role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="mdi mdi-dots-vertical"></i>  </a>
                                            <div class="dropdown-menu dropdown-menu-right" aria-labelledby="dropdownMenuLink">
                                                <a class="dropdown-item" href="#">Action</a>
                                                <a class="dropdown-item" href="#">Another action</a>
                                                <a class="dropdown-item" href="#">Something else here</a>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="card-body">
                                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                                        <a href="#" class="btn btn-primary">Ir al sitio</a>
                                    </div>
                                </div>
                            </div>
                           
                           <div  class="col-xl-4 col-lg-4 col-md-6 col-sm-12 col-12">
                                <div class="card">
                                    <div class="card-header d-flex">
                                        <h4 class="mb-0">Sistema Trabajo social</h4>
                                        <div class="dropdown ml-auto">
                                            <a class="toolbar" href="#" role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="mdi mdi-dots-vertical"></i>  </a>
                                            <div class="dropdown-menu dropdown-menu-right" aria-labelledby="dropdownMenuLink">
                                                <a class="dropdown-item" href="#">Action</a>
                                                <a class="dropdown-item" href="#">Another action</a>
                                                <a class="dropdown-item" href="#">Something else here</a>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="card-body">
                                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                                        <a onclick="imprimirTicket()" href="#" class="btn btn-primary">Ir al sitio</a>
                                    </div>
                                </div>
                            </div>
                           
                           
                        </div> 
                        
                        
                        
                        
                        
                        
                        
                        
                        
            <!-- ============================================================== -->
            <!-- RFC procesor de sitios -->
            <!-- ============================================================== -->
                    <div class="row">
                    <%@ include file = "formulario.jsp" %>
                </div>

                        

                    </div>
                </div>
            </div>
            <!-- ============================================================== -->
            <!-- iframe de sitios -->
            <!-- ============================================================== -->
            <div id="modal" draggable="true">
                <button onclick="document.getElementById('modal').style.display = 'none'">Cerrar ventana modal</button>
                <iframe id="ventanaModal" src=""></iframe>
            </div>
           <div id="ticket" class=""></div>
           <applet 
                name="imprimir_ficha" id="imprimir_ficha"
		code="mx.com.lmp.erp.print.AppletPrint" 	
                width="0" height="0">
              <param value="/trabajo_social_umf/ServletReport" name="urlService" id="urlService">
           </applet>
           
               
               
               
               
            </div>
            <!-- ============================================================== -->
            <!-- footer -->
            <!-- ============================================================== -->
            <div class="footer">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12 col-12">
                             Copyright © 2018 Concept. All rights reserved. Dashboard by <a href="https://colorlib.com/wp/">Colorlib</a>.
                        </div>
                        <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12 col-12">
                            <div class="text-md-right footer-links d-none d-sm-block">
                                <a href="javascript: void(0);">About</a>
                                <a href="javascript: void(0);">Support</a>
                                <a href="javascript: void(0);">Contact Us</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- ============================================================== -->
            <!-- end footer -->
            <!-- ============================================================== -->
        </div>
        <!-- ============================================================== -->
        <!-- end wrapper  -->
        <!-- ============================================================== -->
    </div>
    <!-- ============================================================== -->
    <!-- end main wrapper  -->
    <!-- ============================================================== -->
    <!-- Funcional JavaScript -->
    <script src="<%=request.getContextPath()%>/js/interaction.js"></script>
    <script src="<%=request.getContextPath()%>/js/utilsJS/sha1.min.js"></script>
    <!-- ============================================================== -->
    <!-- Plugins jQuery -->
    <script src="<%=request.getContextPath()%>/assets/vendor/jquery/jquery-3.3.1.min.js"></script>
    <script src="<%=request.getContextPath()%>/assets/vendor/bootstrap/js/bootstrap.bundle.js"></script>
    <script src="<%=request.getContextPath()%>/assets/vendor/slimscroll/jquery.slimscroll.js"></script>
    <script src="<%=request.getContextPath()%>/assets/libs/js/main-js.js"></script>
    <!-- ============================================================== -->
    <script src="<%=request.getContextPath()%>/assets/vendor/datepicker/moment.js"></script>
    <script src="<%=request.getContextPath()%>/assets/vendor/datepicker/tempusdominus-bootstrap-4.js"></script>
    <script src="<%=request.getContextPath()%>/assets/vendor/datepicker/datepicker.js"></script>

    
    

      
    
    
    
    <script type="text/javascript">
        document.onloand = main();
        function main(){
            estadosCgar();
            document.getElementById("CURP").value = ""; 
            document.getElementById("RFC").value = "";
        }
        function estadosCgar() { 
            console.log("cargar estados");
         $.ajax({
            url:'<%=request.getContextPath()%>/CtrlLogin',
            type: 'POST',
            data: {'bnd': 2},
            success: function (response) {
                const array = eval("(" + response + ")");
                console.log(array);
                
                
                array.data.forEach(estado => {
                    const opcion = document.createElement('option');
                    opcion.value = estado.descripcion;
                    opcion.innerText = estado.idestado +" - "+ estado.descripcion;
                    document.querySelector('#cLugarNacimiento').appendChild(opcion);
                });
                
            },
            error: function () {
                console.log("Error");
            }
        });
        }
        
         function validarCampos(campos) {
            contarVacios = 0;
            campos.forEach(campo => {
                if (campo.value === "" || campo.value === "0") {
                    campo.style.border = "1px solid red";
                    contarVacios++;
                } else {
                    campo.style.border = "1px solid #ced4da";
                }
            });
      }
        
          var contarVacios = 0;
         function consultarfc() { 

          const camposPaciente = [
                document.getElementById("cNombre"),
                document.getElementById("cApellidoPaterno"),
                document.getElementById("cApellidoMaterno"),
                document.getElementById("cSexo"),
                document.getElementById("cFechaNacimiento"),
                document.getElementById("cLugarNacimiento")
            ];
        validarCampos(camposPaciente);
        
          formData = {'bnd': 3, 
              'cNombre': document.getElementById("cNombre").value, 
              'cApellidoPaterno': document.getElementById("cApellidoPaterno").value, 
              'cApellidoMaterno': document.getElementById("cApellidoMaterno").value, 
              'cFechaNacimiento': document.getElementById("cFechaNacimiento").value, 
              'cSexo': document.getElementById("cSexo").value, 
              'cLugarNacimiento': document.getElementById("cLugarNacimiento").value
              };
        
        $.ajax({
            url:'<%=request.getContextPath()%>/CtrlLogin',
            type: 'POST',
            data: formData,
            success: function (response) {
              const array = eval("(" + response + ")");
                console.log(array.data[0]);
                console.log(array.data[0].rfc);

                document.getElementById("CURP").value = array.data[0].CURP; 
                document.getElementById("RFC").value = array.data[0].RFC;
                
//                imprimirTicket();
                
                
//                 window.print();
                
                
            },
            error: function () {
                console.log("Error");
            }
        });
    
    }
        
        
   function imprimirTicket() {

    formData = {'bnd': 5,
      'chkseleccionavalues': '9,34,38,40,42,43',
      'nombreReporte': 'classic', };
   
         $.ajax({
            url:'<%=request.getContextPath()%>/ServletReport',
            type: 'POST',
            data: formData,
            success: function (response) {
            
            alert(response.trim());
//            console.log(response);
//            
            var ventana = window.open('', 'PRINT', 'height=600,width=800');
            ventana.document.write('<pre>' + response + '</pre>');
            ventana.document.close(); // necesario para IE >= 10
            ventana.focus(); // necesario para IE >= 10

            // Imprimir el contenido de la ventana emergente
            ventana.print();
            ventana.close();
            
},
            error: function () {
                
                console.log("Error");
            }
        });
   
   
   
   
   // Contenido del ticket
//  var contenido = document.getElementById('ticket').innerHTML;
//  var ventanaImpresion = window.open('', '_blank');
//  ventanaImpresion.document.write(divContenedor);
//  ventanaImpresion.document.close();
//  ventanaImpresion.focus();
//  ventanaImpresion.print();
//  ventanaImpresion.close();
   }

        
        
    </script>
</body>
 
</html>

