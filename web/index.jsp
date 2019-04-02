<%-- 
    Document   : index
    Created on : 23/03/2019, 11:04:38 PM
    Author     : Alexis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap/css/csslogin.css" rel="stylesheet" type="text/css"/>
        <script src="bootstrap/js/Validar.js" type="text/javascript"></script>
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>

           </head>
 
    <body>
        <div class="container well" id="contlogin">
            <center><img src="bootstrap/people.png" alt="" class="img-circle" style="width:120px; height:120px; "/></center>
           
            <form id="form1" onsubmit="return login();" action="Login">
                 
                <div class="form-group">

                    <label for="exampleInputEmail1">Email address</label>
                    <input type="email" class="form-control" name="txtemail" placeholder="Email" id="mail">
                </div> 
                <div class="form-group">
                    <label for="exampleInputPassword1">Password</label>
                    <input type="password" class="form-control"name="txtpassword"  placeholder="Password" id="pass">
                </div>
                <div class="checkbox">
                    <a href="#myModal" data-toggle="modal">Olvidé mi contraseña</a>
                </div>
                <button type="submit" class="btn btn-primary"id="btnstar">Entrar</button>
            </form>
                 <div class="modal fade" id="myModal">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                                    <h1 class="text-c   enter">Recuperar mi contraseña</h1>
                                </div>
                                <div class="modal-body">
                                    <div class="col-md-12">
                                        <div class="panel panel-default">
                                            <div class="panel-body">
                                                <div class="text-center">

                                                    <p>Ingresa tu correo corporativo</p>
                                                    <form id="form1"  onsubmit="return validar();" action="correo" method="POST" >
                                                        <div class="panel-body">

                                                            <div class="form-group">
                                                                <input class="form-control input-lg" placeholder="Email" id="email2" name="cuenta" type="email">  
                                                            </div>
                                                            <input class="btn btn-lg btn-primary btn-block" type="submit">
                                                        </div>
                                                        
                                                    </form>   
                                                     
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="modal-footer">
                                    <div class="col-md-12">
                                        <button class="btn btn-danger" data-dismiss="modal" aria-hidden="true">Cancel</button>
                                    </div>  
                                </div>
                            </div>
                        </div>
                 </div>
        </div>  
        <script src="bootstrap/js/jquery.js" type="text/javascript"></script>
        <script src="bootstrap/js/bootstrap.js" type="text/javascript"></script>
       
    </body>
</html>
