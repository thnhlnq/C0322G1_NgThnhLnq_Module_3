<%--
  Created by IntelliJ IDEA.
  User: Thành Lonq
  Date: 02/07/2022
  Time: 9:12 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Nguyễn Thành Lonq</title>
    <link rel="shortcut icon" href="1905504.ico" type="image/x-icon">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    <style>
        [class*="col-"] {
            float: left;
            padding: 5px;
        }

        .avatar {
            display: inline-block;
            vertical-align: middle;
            position: relative;
            border-radius: 50%;
            height: 40px;
            width: 40px;
        }

        .avatar_letters {
            left: 50%;
            position: absolute;
            top: 50%;
            transform: translate(-50%, -50%);
        }

        .gradient-header {
            background: #6a85b6;
            background: -webkit-linear-gradient(to right, rgba(106, 133, 182, 0.5), rgba(186, 200, 224, 0.5));
            background: linear-gradient(to right, rgba(106, 133, 182, 0.5), rgba(186, 200, 224, 0.5))
        }

        .gradient-body {
            background: #30cfd0;
            background: -webkit-linear-gradient(to left, rgba(48, 207, 208, 0.5), rgba(51, 8, 103, 0.5));
            background: linear-gradient(to left, rgba(48, 207, 208, 0.5), rgba(51, 8, 103, 0.5))
        }

        .gradient-footer {
            background: #30cfd0;
            background: -webkit-linear-gradient(to right, rgba(48, 207, 208, 0.5), rgba(51, 8, 103, 0.5));
            background: linear-gradient(to right, rgba(48, 207, 208, 0.5), rgba(51, 8, 103, 0.5))
        }
    </style>
</head>
<body>
<div class="container-fluid">
    <div class="col-lg-12 gradient-header p-2 text-light bg-opacity-25">
        <div class="col-lg-3 px-5 py-2">
            <img src="https://furamavietnam.com/wp-content/uploads/2018/10/logo.png" alt="Furama" width="75px"
                 height="100px">
        </div>
        <div class="col-lg-3 text-success py-3">
            <img src="https://cdn-icons-png.flaticon.com/512/4743/4743044.png" alt="map" width="20" height="20">
            <span>&nbsp; 103 – 105 Đường Võ Nguyên Giáp,<br> Phường Khuê Mỹ, Quận Ngũ hành Sơn,<br> Tp. Đà Nẵng, Việt Nam<br></span>
            <img src="https://cdn-icons-png.flaticon.com/512/503/503054.png" alt="distance" width="20" height="20">
            <span>&nbsp; 7.0 km từ Sân bay Quốc tế Đà Nẵng</span>
        </div>
        <div class="col-lg-3 text-success py-4">
            <img src="https://cdn-icons.flaticon.com/png/512/3059/premium/3059457.png?token=exp=1656165905~hmac=d204db81b7f6417d76769bb2fe01de8d"
                 alt="phone" width="20" height="20">
            <span>&nbsp; 84-236-3847 333/888 <br></span>
            <img src="https://cdn-icons.flaticon.com/png/512/3059/premium/3059421.png?token=exp=1656165843~hmac=de685b43ba77b868275bdcb80a5445e0"
                 alt="email" width="20" height="20">
            <span>&nbsp; reservation@furamavietnam.com</span>
        </div>
        <div class="col-lg-3 text-end p-5 fw-bold text-success">Nguyễn Thành Lonq
            <div class="avatar bg-success ms-2">
                <div class="avatar_letters text-light">L</div>
            </div>
        </div>
    </div>
</div>

<div class="container-fluid">
    <div class="col-lg-12 bg-success gradient-body">
        <nav class="navbar navbar-expand-lg bg-success p-2 text-light gradient-body">
            <div class="container-fluid">
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                        data-bs-target="#navbarTogglerDemo03"
                        aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <a class="navbar-brand" href="#"> </a>
                <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-5">
                        <li class="nav-item">
                            <a class="nav-link active text-white" aria-current="page" href="#">
                                Home</a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle text-light" href="#" role="button"
                               data-bs-toggle="dropdown" aria-expanded="false">
                                Employee
                            </a>
                            <ul class="dropdown-menu">
                                <li><a class="dropdown-item" href="employees?action=list">List Employee</a></li>
                                <li><a class="dropdown-item" href="employees?action=create">Add New Employee</a></li>
                            </ul>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle text-light" href="#" role="button"
                               data-bs-toggle="dropdown" aria-expanded="false">
                                Customer
                            </a>
                            <ul class="dropdown-menu">
                                <li><a class="dropdown-item" href="customers?action=list">List Customer</a></li>
                                <li><a class="dropdown-item" href="customers?action=create">Add New Customer</a></li>
                            </ul>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle text-light" href="#" role="button"
                               data-bs-toggle="dropdown" aria-expanded="false">
                                Service
                            </a>
                            <ul class="dropdown-menu">
                                <li><a class="dropdown-item" href="service?action=list">List Service</a></li>
                                <li><a class="dropdown-item" href="service?action=create">Add New Service</a></li>
                            </ul>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active text-white" aria-current="page" href="#">
                                Contract</a>
                        </li>
                    </ul>
                    <form class="d-flex" role="search">
                        <label><input class="form-control me-2" type="search" placeholder="Search"></label>
                        <button class="btn bg-light text-success ms-1" type="submit">Search</button>
                    </form>
                </div>
            </div>
        </nav>
    </div>
</div>

<div class="container-fluid">
    <div class="col-lg-12 gradient-header">
        <div class="col-lg-12 border border-2 text-center gradient-custom" style="width: 100%; height: 500px">Body</div>
    </div>
</div>

<div class="container-fluid">
    <div class="col-lg-12 border border-1 text-center fw-bold gradient-footer">Footer</div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
        crossorigin="anonymous"></script>
</body>
</html>

