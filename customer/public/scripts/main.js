var OrderNS = (function () {
    function Order() {
        //****************************** private var
        var self = this
        	currentPage = 0,
        	hasOrders = true;

        //****************************** public var
        //self.menu_html = undefined;

        //****************************** private functions

        function initEvents() {
        	$('.pager .prev').on('click', function () {
        		if(currentPage > 0){
        			currentPage--;
        			loadOrders();
        		}
        	});
        	
        	$('.pager .next').on('click', function () {
        		if(hasOrders){
        			currentPage++;
        			loadOrders();
        		}
        	});
        }
        
        function loadOrders() {
        	$.ajax({
                type: "get",
                url: '/orders',
                data: {
                	page: currentPage,
                	perPage: 10
                },
                success: function (response) {
                	if(response.length > 0){
                		hasOrders = true;
                		$('.table tbody').empty();
                		for(var i = 0; i < response.length; i++){
                			$('.table tbody').append('<tr><th scope="row">1</th><td>'+response[i]['orderNr']+'</td><td>'+response[i]['productName']+'</td><td>'+response[i]['createdAt']+'</td></tr>');
                		}
                	} else {
                		hasOrders = false;
                		$('.table tbody').html('<td>Empty</td>');
                	}
                }
            });
        };

        //****************************** public functions
        self.init = function () {
        	initEvents();
        	
        	loadOrders();
        };
    }

    //Singleton
    var instance = new Order();
    return instance;
})();
