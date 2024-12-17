<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Enhanced Page with Bootstrap</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .change-color {
            background-color: lightblue;
        }
        .logo {
            height: 50px;
        }
    </style>
</head>
<body>
    <div class="container-fluid">
        <!-- Header Section -->
        <div class="d-flex justify-content-between align-items-center py-3">
            <div>
                <img src="data:image/jpeg;base64,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" alt="Logo" class="logo">
            </div>
            <div>
                <a href="AdminPage.jsp" class="btn btn-primary">Login</a>
            </div>
        </div>

        <!-- Content Section -->
        <div class="text-center mt-5">
            <h2 class="text-primary"></h2>

            <h1 id="heading" class="text-center">Hi, Welcome</h1>


        </div>
    </div>

    <!-- Bootstrap and JavaScript -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

    <!-- Custom JavaScript -->
    <script>
        document.getElementById("heading").addEventListener("click", function() {
            this.classList.toggle("change-color");
        });
    </script>
</body>
</html>
