<%-- 
    Document   : formulario
    Created on : 4/06/2024, 04:48:34 PM
    Author     : Pepe Ybad
--%>

<div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                        <div class="section-block" id="basicform">
                            <h3 class="section-title">Basic Form Elements</h3>
                            <p>Use custom button styles for actions in forms, dialogs, and more with support for multiple sizes, states, and more.</p>
                        </div>
                        <div class="card">
                            <h5 class="card-header">Basic Form</h5>
                            <div class="card-body">
                                <form>
                                    <div class="form-group">
                                        <label for="genero">Fecha de Nacimiento</label>
                                        <div class="input-group date" id="datetimepicker4" data-target-input="nearest">
                                            <input type="text" id="cFechaNacimiento" class="form-control datetimepicker-input">
                                            <div class="input-group-append" data-target="#datetimepicker4" data-toggle="datetimepicker">
                                                <div class="input-group-text"><i class="far fa-calendar-alt"></i></div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="cNombre" class="col-form-label">Nombres</label>
                                        <input id="cNombre" type="text" class="form-control" onchange="consultarfc()">
                                    </div>
                                    <div class="form-group">
                                        <label for="cApellidoPaterno" class="col-form-label">Apellido Paterno</label>
                                        <input id="cApellidoPaterno" type="text" class="form-control" onchange="consultarfc()">
                                    </div>
                                    <div class="form-group">
                                        <label for="cApellidoMaterno" class="col-form-label">Apellido Materno</label>
                                        <input id="cApellidoMaterno" type="text" class="form-control" onchange="consultarfc()">
                                    </div>
                                    <div class="form-group">
                                           <label for="genero">genero</label>
                                           <select class="form-control" id="cSexo" onchange="consultarfc()">
                                               <option value="0" selected>Seleccionar Opcion</option>
                                               <option value="MASCULINO">HOMBRE</option>
                                               <option value="FEMENINO">MUJER</option>
                                           </select>
                                       </div>
                                    <div class="form-group">
                                           <label for="input-select">Estados</label>
                                           <select class="form-control" id="cLugarNacimiento" onchange="consultarfc()">
                                               <option value="0" selected>Seleccionar Opcion</option>
                                           </select>
                                       </div>
                                    
                                    <div class="form-group">
                                        <label for="cNombre"  class="col-form-label">CURP</label>
                                        <input id="CURP" readonly type="text" class="form-control" >
                                    </div>
                                       <div class="form-group">
                                        <label for="cNombre" class="col-form-label">RFC</label>
                                        <input id="RFC" type="text" readonly class="form-control" >
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>