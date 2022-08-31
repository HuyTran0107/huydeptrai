<%-- 
    Document   : signup
    Created on : Aug 28, 2022, 1:13:22 PM
    Author     : ManhHuy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="/resources/CSS/css.css">
        <title>Signup</title>
    </head>
    <body>
        <section class="vh-100">
            <div class="container py-5 h-100">
                <div class="row d-flex align-items-center justify-content-center h-100">
                    <div class="col-md-8 col-lg-7 col-xl-6">
                        <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.svg"
                             class="img-fluid" alt="Phone image">
                    </div>
                    <div class="col-md-7 col-lg-5 col-xl-5 offset-xl-1">
                        <form>
                            <h1>Sign up</h1><br>
                            <!-- Email input -->
                            <div class="form-outline mb-4">
                                <input type="email" id="form1Example13" class="form-control form-control-lg" />
                                <label class="form-label" for="form1Example13">Fist name</label>
                            </div>
                            <div class="form-outline mb-4">
                                <input type="email" id="form1Example13" class="form-control form-control-lg" />
                                <label class="form-label" for="form1Example13">Last name</label>
                            </div>
                            <div class="form-outline mb-4">
                                <input type="email" id="form1Example13" class="form-control form-control-lg" />
                                <label class="form-label" for="form1Example13">Username</label>
                            </div>
                            <!-- Password input -->
                            <div class="form-outline mb-4">
                                <input type="password" id="form1Example23" class="form-control form-control-lg" />
                                <label class="form-label" for="form1Example23">Password</label>
                            </div>
                            <div class="form-outline mb-4">
                                <input type="email" id="form1Example13" class="form-control form-control-lg" />
                                <label class="form-label" for="form1Example13">Email</label>
                            </div>
                            <!-- Submit button -->
                            <button type="submit" class="btn btn-primary btn-lg btn-block">Sign up</button>
                        </form>
                    </div>
                </div>
            </div>
        </section>
    </body>
</html>
