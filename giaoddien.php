<!doctype html>
<?php
session_start();
require_once('SanPham.php');
global $result;
?>
<html lang="en">
  <head>
    <title>Quan tri san pham</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
 
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <div class="jumbotron">
        <h1 class="display-3">Quan Tri San Pham</h1>
      
        <hr class="my-4">
      </div>
  </head>
  <body>
    <div class="card-columns">
        <div class="card">
            <img class="card-img-top" src="" alt="">
            <div class="card-body">
                <h4 class="card-title"> Thong tin san pham</h4>
                <form action="" method="post">
                    <div class="form-group"> 
                        <label for="">Ma SP</label>
                        <input type="text" 
                              class="form-control" name="txtMaSP" id="txtMaSP" aria-activedescendant="helpId" placeholder="txtMaSP">
                    </div>
                    <div class="form-group"> 
                              <label for="">Ten SP</label>
                              <input type="text" 
                                    class="form-control" name="txtTenSP" id="txtTenSP" aria-activedescendant="helpId" placeholder="txtTenSP">
                    </div>
                    <div class="form-group"> 
                              <label for="">DVT</label>
                              <input type="text" 
                                    class="form-control" name="txtDVT" id="txtDVT" aria-activedescendant="helpId" placeholder="txtDVT">
                    </div>
                    <div class="form-group"> 
                              <label for="">DonGia</label>
                              <input type="text" 
                                    class="form-control" name="txtDonGia" id="txtDonGia" aria-activedescendant="helpId" placeholder="txtDonGia">
                    </div>
                    <div class="form-group"> 
                              <label for="">NhaCC</label>
                              <input type="text" 
                                    class="form-control" name="txtNCC" id="txtNCC" aria-activedescendant="helpId" placeholder="txtNCC">
                    </div>
                    <button type="submit" name="btnthem" value="btnthem" id="" class="btn btn-primary btn-lg brn-block">Them</button>
                    <button type="submit" name="btnHienThi" value="btnHienThi" id="" class="btn btn-primary btn-lg brn-block">Hien Thi</button>
                    <button type="submit" name="btnUpdate" value="btnUpdate" id="" class="btn btn-primary btn-lg brn-block">Update</button>
                </form>
            </div>
        </div>
        <div class="card">
            <img class="card-img-top" src="holder.js/100x180/" alt="">
            <div class="card-body">
                <h4 class="card-title"> hien thi san pham</h4>
                <table class="table">
                    <thead>
                      <tr>
                        <th>MaSP</th>
                        <th>TenSP</th>
                        <th>DVT</th>
                        <th>DonGia</th>
                        <th>NhaCC</th> 
                        
                      </tr>
                    </thead>
                    <tbody>
                      <?php
                        if(isset($_POST['btnHienThi']))
                        {
                          $result=hienThiSanPham();
                          while($row=$result->fetch_assoc())
                          {
                            echo '<tr>';
                            echo '<td>' .row['MaSP'].'</td>';
                            echo '<td>' .row['TenSP'].'</td>';
                            echo '<td>' .row['DVT'].'</td>';
                            echo '<td>' .row['DonGia'].'</td>';
                            echo '<td>' .row['NCC'].'</td>';
                            echo '<tr>';
                          }
                        }
                      ?>         
                    </tbody>
                  </table>
            </div>
        </div>
    </div>
    <?php
      if($_POST('btnThem')!==null)
      {
        $MaSP=$_POST['txtMaSP'];
        $TenSP=$_POST['txtTenSP'];
        $DVT=$_POST['txtDVT'];
        $DonGia=$_POST['txtDonGia'];
        $NCC=$_POST['txtNCC'];
        $i=themSanPhamDB($MaSP,$TenSP,$DVT,$DonGia,$NCC);
        if($i<0)
        {
          echo "them that bai";
        }
        else
        {
          echo "them thanh cong"
        }
      }
    ?>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>