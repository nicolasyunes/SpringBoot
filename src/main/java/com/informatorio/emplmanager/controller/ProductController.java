import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ProductController {
    @Autowired
    private  ProductRespository productorepository;
    
    @GetMapping ("/producto")
    public String hello(){
        return "HOLA MUNDOO";
    }  

}