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
        </div>
        <div class="col-lg-3 text-success py-3">
        </div>
        <div class="col-lg-3 text-success py-4">
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
                <button class="navbar-toggler" type="button">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <a class="navbar-brand" href="#"> </a>
                <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
                    <a class="nav-link text-light" href="/hokhaus">Customer</a>
                    <form class="d-flex" role="search" style="margin-bottom: auto; height: 38px;">
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
        <div class="gradient-custom" style="text-align: center; width: 100%; height: auto">
            <form method="post" class="d-flex justify-content-center">
                <fieldset>
                    <legend>
                        <h2>Create Ho Khau</h2>
                    </legend>
                    <table>
                        <tr>
                            <td>
                                <div class="input-group flex-nowrap">
                                    <span class="input-group-text">Ma Ho Khau</span>
                                    <input style="width: 100%" type="text" class="form-control" name="maHoKhau"
                                           placeholder="Enter Ma Ho Khau">
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <div class="input-group flex-nowrap">
                                    <span class="input-group-text">Ten Chu Ho</span>
                                    <input type="text" class="form-control" name="tenChuHo"
                                           placeholder="Enter Ten Chu Ho">
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <div class="input-group flex-nowrap">
                                    <span class="input-group-text">So Thanh Vien</span>
                                    <input type="text" class="form-control" name="soThanhVien"
                                           placeholder="Enter So Thanh Vien">
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <div class="input-group flex-nowrap">
                                    <span class="input-group-text">Ngay Lap Ho Khau</span>
                                    <input type="date" class="form-control" name="ngayLapHoKhau"
                                           placeholder="Enter Ngay Lap Ho Khau">
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <div class="input-group flex-nowrap">
                                    <span class="input-group-text">Dia Chi</span>
                                    <input type="text" class="form-control" name="diaChi"
                                           placeholder="Enter Dia Chi">
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <div class="col-12">
                                <td>
                                    <div class="vstack gap-2 col-12 mx-6">
                                        <input type="submit" class="btn btn-secondary" value="Create">
                                        <a class="text-decoration-none text-secondary" href="/hokhaus?action=list">
                                            <button type="button" class="btn btn-outline-secondary col-12">Cancel
                                            </button>
                                        </a>
                                    </div>
                                </td>
                            </div>
                        </tr>
                    </table>
                </fieldset>
            </form>
        </div>
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

