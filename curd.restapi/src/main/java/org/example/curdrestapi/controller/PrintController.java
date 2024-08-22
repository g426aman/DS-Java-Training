package org.example.curdrestapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrintController {

    //create api using endpoint
    @GetMapping(value = "/vlog")
    public String printData() {
        int vlogid = 4 ;
        String blogtitle = "Spring Boot";
        String blogDescription = "Workon";
        String AuthorName="Aman";
        String Date="22 Aug 2024";
        return String.valueOf(vlogid) + "<br> " + blogtitle + "<br> " + blogDescription + "<br> " + AuthorName + "<br> " + Date;

    }
}







