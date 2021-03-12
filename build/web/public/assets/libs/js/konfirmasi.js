/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
jQuery(document).ready(function($){
        $(".logout").on("click",function(){        
            Swal.fire({            
                type: 'warning',
                text : 'Anda yakin akan keluar?',
                showCancelButton: true,
                confirmButtonColor: '#d33',
                cancelButtonColor: '#3085d6',
                confirmButtonText: 'Logout',
                cancelButtonText: 'Cancel'
            }).then((result) => {
                if (result.value) {                        
                    window.location.href="../login.jsp";
                }
            });
            return false;
        });
    });


