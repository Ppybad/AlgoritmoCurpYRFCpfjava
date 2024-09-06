<%-- 
    Document   : login
    Created on : 4/01/2024, 12:00:32 PM
    Author     : Pepe Ybad
--%>

<!doctype html>
<html lang="en">
 
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-15">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximun-scale=1.0, minimun-scale=1.0">
    <title>Login</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/assets/vendor/bootstrap/css/bootstrap.min.css">
    <link href="<%=request.getContextPath()%>/assets/vendor/fonts/circular-std/style.css" rel="stylesheet">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/assets/libs/css/style.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/assets/vendor/fonts/fontawesome/css/fontawesome-all.css">
    <style>
    html,
    body {
        height: 100%;
    }

    body {
        display: -ms-flexbox;
        display: flex;
        -ms-flex-align: center;
        align-items: center;
        padding-top: 40px;
        padding-bottom: 40px;
    }
    </style>
    <!-- SweetAlert -->
        <link rel="stylesheet" href="<%=request.getContextPath()%>/plugins/sweetalert2/sweetalert2.min.css">
        <script src="<%=request.getContextPath()%>/plugins/sweetalert2/sweetalert2.all.min.js"></script>
</head>

<body>
    <!-- ============================================================== -->
    <!-- login page  -->
    <!-- ============================================================== -->
    <div class="splash-container">
        <div class="card ">
            <div class="card-header text-center"><a href="<%=request.getContextPath()%>/webResponsive/dashboard.jsp"><img class="img-fluid" src="assets/images/logo2.png" alt="logo"></a><span class="splash-description">Instituto de Seguridad Social del Estado de Tabasco.</span></div>
            <div class="card-body">
                <form>
                    <div class="form-group ">
                        <label for="userProgram">Programas externos</label>
                        <select class="form-control" id="bnd" onchange="consultarfc()">
                            <option value="0" selected>Seleccionar Opcion</option>
                            <option value="1">USUARIO SIPEM</option>
                            <option value="4">USUARIO FARMACIA</option>
                        </select>
                                       </div>
                    <div class="form-group">
                        <input class="form-control form-control-lg" id="username" type="text" placeholder="Usuario" autocomplete="off">
                    </div>
                    <div class="form-group">
                        <input class="form-control form-control-lg" id="password" type="password" placeholder="Contraseña">
                    </div>
                    <div class="form-group">
                        <label class="custom-control custom-checkbox">
                            <input class="custom-control-input" type="checkbox"><span class="custom-control-label">Recordarme</span>
                        </label>
                    </div>
                    <button id="entrar" type="button" onclick="login()" class="btn btn-primary btn-lg btn-block">Entrar</button>
                </form>
            </div>
            <div class="card-footer bg-white p-0  ">
                <div class="card-footer-item card-footer-item-bordered">
                    <a href="#" class="footer-link">Crear Cuenta</a></div>
                <div class="card-footer-item card-footer-item-bordered">
                    <a href="#" class="footer-link">Olvide mi Contraseña</a>
                </div>
            </div>
        </div>
    </div>
  
    <!-- ============================================================== -->
    <!-- end login page  -->
    <!-- ============================================================== -->
    <!-- Optional JavaScript -->
    <script src="<%=request.getContextPath()%>/plugins/jquery/jquery.min.js"></script>
    <script src="<%=request.getContextPath()%>/assets/vendor/bootstrap/js/bootstrap.bundle.js"></script>
    <script src="<%=request.getContextPath()%>/js/utilsJS/sha1.min.js"></script>
    <!-- ============================================================== -->
    <!-- Plugins jQuery -->
    <script src="<%=request.getContextPath()%>/assets/vendor/jquery/jquery-3.3.1.min.js"></script>
    <!-- ============================================================== -->
    <!-- Codigo funcional  -->
    <script  type="text/javascript">
    function login() { 
       
        var username = document.getElementById('username').value; 
        var password =document.getElementById('password').value;
        var bnd = document.getElementById('bnd').value;
        var passEncript = sha1(password);
        var url = window.location.href;
        var nuevaUrl = url.replace("?", "");
         
        if (username == "" || password == "" || bnd == 0) {
            Swal.fire("Es necesario ingresar todos los campos", "", "error");
        } else {
         
           const data = {'bnd':bnd,'username':username, 'passEncript':passEncript, 'password': password,};
           $.ajax({//Cuando lleguen los campos con nombre
            url: nuevaUrl+'CtrlLogin',
            type: 'POST',
            data: data,
            success: function (response) {
                const array = eval("(" + response + ")");
                if(array.success === true){
                        //console.log(array)
                        sessionStorage.setItem("usuario", array.idUsuario);
                        window.location.href = "<%=request.getContextPath()%>/webResponsive/dashboard.jsp";
                    }else{
                        Swal.fire("No se encontro al usuario", "", "error");
                    }
            },
            error: function () {
                console.log("Error");
            }
        }).done(function () {
            //reiniciarVal();
        }); 
       }
      
}
</script>
</body>
 
</html>
