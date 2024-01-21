<?php
function ketNoiDB(){
          return new mysqli('localhost','root','','apr');
}
funtion themSanPhamDB($MaSP,$TenSP,$DVT,$DonGia,$NCC)
{
          $con=ketNoiDB();
          $i=$con->query('INSERT INTO sanpham VALUES
           ("'.$MaSP.'","'.$TenSP.'","'.$DVT.'","'.$DonGia.'","'.$NCC.'")');
          return $i;
}
funtion hienThiSanPham()
{
          $con=ketNoiDB();
          $result=$con->query('SELECT * FROM SanPham');
          return $result;
}
funtion updateSanPhamDB($MaSP,$TenSP,$DVT,$DonGia,$NCC)
{
          $con=ketNoiDB();
          $i=$con->query('UPDATE sanpham SET TenSP=$TenSP, DVT=$DVT, DonGia=$DonGia, NCC=$NCC
          WHERE MaSP=$MaSP');
          return $i;
}