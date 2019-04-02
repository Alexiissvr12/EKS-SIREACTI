<%-- 
    Document   : Inicio
    Created on : 26/03/2019, 05:39:50 PM
    Author     : Nahun Bravo
--%>

<%@page import="Model.login"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% login l = (login)request.getSession().getAttribute("login"); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../../bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>    
        <link href="../../bootstrap/css/Estilo.css" rel="stylesheet" type="text/css"/>
        <script src="../../bootstrap/js/bootstrap.js" type="text/javascript"></script>
        <script src="../../bootstrap/js/jquery.js" type="text/javascript"></script>
        <link rel="shortcut icon" type="image/png" href="../../Imagen/eks-solutions-en.png"/>
           <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="../../bootstrap/js/bootstrap.min.js"></script>
        <title>Inicio - EKS Temps</title>        
    </head>
    <body>

        <nav class="navbar navbar-default">
                    <div class="navbar-header ">
                        <button type="button" class="navbar-toggle navbar-left alinear-izq" >
                            <span class="sr-only">Menu Completo</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                    </div>
                        <div class="collapse navbar-collapse navbar-ex1-collapse">
                            <ul class="nav navbar-nav">
                                <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-menu-hamburger"></span><b class="caret"></b></a>
                                    <ul class="dropdown-menu">
                                        <li><a href="#" >Módulo Registros</a></li>
                                        <li><a href="../MOD2/Reg_Usuario.jsp" ><span class="glyphicon glyphicon-record"/>  Usuario</a></li>
                                        <li><a href="#" ><span class="glyphicon glyphicon-record"/>  Consultor</a></li>
                                        <li><a href="#" ><span class="glyphicon glyphicon-record"/>  Cliente</a></li>
                                        <li><a href="#" ><span class="glyphicon glyphicon-record"/>  Contacto</a></li>
                                        <li><a href="#" ><span class="glyphicon glyphicon-record"/>  Proyecto</a></li>
                                        <li><a href="#" ><span class="glyphicon glyphicon-record"/>  Actividad</a></li>
                                        <li><a href="#" >Mis catálogos</a></li>
                                        <li><a href="../MOD3/Cat_Usuarios.jsp" ><span class="glyphicon glyphicon-record"/>  Usuario</a></li>
                                        <li><a href="#" ><span class="glyphicon glyphicon-record"/>  Consultor</a></li>
                                        <li><a href="#" ><span class="glyphicon glyphicon-record"/>  Cliente</a></li>
                                        <li><a href="#" ><span class="glyphicon glyphicon-record"/>  Contacto</a></li>
                                        <li><a href="#" ><span class="glyphicon glyphicon-record"/>  Proyecto</a></li>
                                        <li><a href="#" ><span class="glyphicon glyphicon-record"/>  Actividad</a></li>
                                    </ul>
                                </li>
                                 <a href="../MOD1/Inicio.jsp" class="navbar-brand"><samp><img src="../../Image/eks-solutions-en.png" alt="" height="30px"/></samp>  TIEMPS</a>
                                <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-user"></span><b class="caret"></b></a>
                                    <ul class="dropdown-menu">
                                        <li><a href="#" >Mi perfil</a></li>
                                        <li><a href="#" >Actualizar datos personales</a></li>
                                        <li><a href="#" >Actualizar contraseña</a></li>
                                    </ul>
                                </li>
                                <li><a href="../MOD1/Inicio.jsp" ><span class="glyphicon glyphicon-home"></span></a></li>
                                <li><a href="#" ><span class="glyphicon glyphicon-bell"></span></a></li>
                                <li><a href="#" ><span class="glyphicon glyphicon-folder-open"></span></a></li>
                                <li><a href="#" ><span class="glyphicon glyphicon-comment"></span></a></li>
                            </ul>
                            <ul class="nav navbar-nav navbar-right">
                                <li><a href="../../index.xhtml" ><span class="glyphicon glyphicon-log-out"></span></a></li>
                            </ul>
                        </div>
        </nav>
        <div id="body">
            <div id="juntar" class="container  perfil-izq col-xs-7">
                <div class="row col-xs-12 ">
                        <div id="juntar" class="col-xs-6">
                            <button class="btn btn-primary col-xs-12 center-block" type="button" >Entrar</button>
                        </div>
                        <div id="juntar" class="col-xs-6">
                            <button class="btn btn-primary col-xs-12 center-block" type="submit" >Salir</button>
                        </div>
                </div>
                <div class="row col-xs-12 perfil">
                    <div class="perfil2">
                    <div class="row col-xs-8 col-xs-offset-2">
                        <img src="../../Image/icon/Perfil.png" class="foto-perfil"/>
                    </div>
                    <div class="row col-xs-11 col-xs-offset-1">
                        <span><h4 class="margen-text"><b><%=l.getEmail()%></b></h4></span>
                        <b><h5><span class="glyphicon glyphicon-plane"/> 3 Saldo Vacaciones</h5></b>
                        <div id="bodymenu">
                            <div id="juntar"><div id="juntar2"><b><h6> Asistencias </h6></b></div><div id="juntar2"><b><h6> <span class="glyphicon glyphicon-sunglasses"/> 6 </h6></b></div></div>
                            <div id="juntar"><div id="juntar2"><b><h6> Retardos </h6></b></div><div id="juntar2"><b><h6> <span class="glyphicon glyphicon-dashboard"/> 2 </h6></b></div></div>
                            <div id="juntar"><div id="juntar2"><b><h6> Faltas </h6></b></div><div id="juntar2"><b><h6> <span class="glyphicon glyphicon-thumbs-down"/> 0 </h6></b></div></div>
                        </div>
                        <div><img src="../../Image/icon/41977.png" class="Img-Grafica"/></div>
                        <b><h5><span class="glyphicon glyphicon-folder-open"/> Documentos</h5></b>
                        <b><h5><span class="glyphicon glyphicon-comment"/> Quejas/sugerencias</h5></b>
                        </div>
                    </div>
                    </div>
                </div>
                <div class="container contenido col-xs-7">
                     <div id="bodymenu">
                        <div id="juntar" class="margen-cuadro" onclick="location.href='../MOD3/Cat_Usuarios.jsp'">   
                            <div id="bodymenu">
                               
                                <div id='atras'><img src="../../Image/icon/Img-Menu.png" class="Img-Menu"/></div>
                                <div id='adelante'><b>Catálogo usuarios</b></div>
                            </div>
                        </div>
                        <div id="juntar" class="margen-cuadro" onclick="location.href='../MOD2/Reg_Usuario.jsp'">   
                            <div id="bodymenu">
                                <div id='atras'><img src="../../Image/icon/Img-Menu.png" class="Img-Menu"/></div>
                                <div id='adelante'><b>Registrar usuarios</b></div>
                            </div>
                        </div>
                        <div id="juntar" class="margen-cuadro" onclick="location.href='../MOD2/Reg_Usuario.jsp'">   
                            <div id="bodymenu">
                                <div id='atras'><img src="../../Image/icon/Img-Menu.png" class="Img-Menu"/></div>
                                <div id='adelante'><b>Registrar usuarios</b></div>
                            </div>
                        </div>
                        <div id="juntar" class="margen-cuadro" onclick="location.href='../MOD2/Reg_Usuario.jsp'">   
                            <div id="bodymenu">
                                <div id='atras'><img src="../../Image/icon/Img-Menu.png" class="Img-Menu"/></div>
                                <div id='adelante'><b>Registrar usuarios</b></div>
                            </div>
                        </div>
                        <div id="juntar" class="margen-cuadro" onclick="location.href='../MOD2/Reg_Usuario.jsp'">   
                            <div id="bodymenu">
                                <div id='atras'><img src="../../Image/icon/Img-Menu.png" class="Img-Menu"/></div>
                                <div id='adelante'><b>Registrar usuarios</b></div>
                            </div>
                        </div>
                        <div id="juntar" class="margen-cuadro" onclick="location.href='../MOD2/Reg_Usuario.jsp'">   
                            <div id="bodymenu">
                                <div id='atras'><img src="../../Image/icon/Img-Menu.png" class="Img-Menu"/></div>
                                <div id='adelante'><b>Registrar usuarios</b></div>
                            </div>
                        </div>
                    <div id="juntar" class="margen-cuadro" onclick="location.href='../MOD2/Reg_Usuario.jsp'">   
                            <div id="bodymenu">
                                <div id='atras'><img src="../../Image/icon/Img-Menu.png" class="Img-Menu"/></div>
                                <div id='adelante'><b>Registrar usuarios</b></div>
                            </div>
                        </div>
                        <div id="juntar" class="margen-cuadro" onclick="location.href='../MOD2/Reg_Usuario.jsp'">   
                            <div id="bodymenu">
                                <div id='atras'><img src="../../Image/icon/Img-Menu.png" class="Img-Menu"/></div>
                                <div id='adelante'><b>Registrar usuarios</b></div>
                            </div>
                        </div>
                        <div id="juntar" class="margen-cuadro" onclick="location.href='../MOD2/Reg_Usuario.jsp'">   
                            <div id="bodymenu">
                                <div id='atras'><img src="../../Image/icon/Img-Menu.png" class="Img-Menu"/></div>
                                <div id='adelante'><b>Registrar usuarios</b></div>
                            </div>
                        </div>
                        <div id="juntar" class="margen-cuadro" onclick="location.href='../MOD2/Reg_Usuario.jsp'">   
                            <div id="bodymenu">
                                <div id='atras'><img src="../../Image/icon/Img-Menu.png" class="Img-Menu"/></div>
                                <div id='adelante'><b>Registrar usuarios</b></div>
                            </div>
                        </div>
                        <div id="juntar" class="margen-cuadro" onclick="location.href='../MOD2/Reg_Usuario.jsp'">   
                            <div id="bodymenu">
                                <div id='atras'><img src="../../Image/icon/Img-Menu.png" class="Img-Menu"/></div>
                                <div id='adelante'><b>Registrar usuarios</b></div>
                            </div>
                        </div>
                        <div id="juntar" class="margen-cuadro" onclick="location.href='../MOD2/Reg_Usuario.jsp'">   
                            <div id="bodymenu">
                                <div id='atras'><img src="../../Image/icon/Img-Menu.png" class="Img-Menu"/></div>
                                <div id='adelante'><b>Registrar usuarios</b></div>
                            </div>
                        </div>
                        <div id="juntar" class="margen-cuadro" onclick="location.href='../MOD2/Reg_Usuario.jsp'">   
                            <div id="bodymenu">
                                <div id='atras'><img src="../../Image/icon/Img-Menu.png" class="Img-Menu"/></div>
                                <div id='adelante'><b>Registrar usuarios</b></div>
                            </div>
                        </div>
                        <div id="juntar" class="margen-cuadro" onclick="location.href='../MOD2/Reg_Usuario.jsp'">   
                            <div id="bodymenu">
                                <div id='atras'><img src="../../Image/icon/Img-Menu.png" class="Img-Menu"/></div>
                                <div id='adelante'><b>Registrar usuarios</b></div>
                            </div>
                        </div>
                        <div id="juntar" class="margen-cuadro" onclick="location.href='../MOD2/Reg_Usuario.jsp'">   
                            <div id="bodymenu">
                                <div id='atras'><img src="../../Image/icon/Img-Menu.png" class="Img-Menu"/></div>
                                <div id='adelante'><b>Registrar usuarios</b></div>
                            </div>
                        </div>
                    </div>
                </div>
        </div> 
    </body>
</html>
