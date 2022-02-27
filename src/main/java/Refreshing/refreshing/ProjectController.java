/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Refreshing.refreshing;


import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 *
 * @author HIKMATFATHURRAHMAN
 */
@Controller
public class ProjectController {
    @CrossOrigin
    @RequestMapping(value = "/mamat", produces = (MediaType.APPLICATION_XML_VALUE))
    @ResponseBody
    public List<DataMamat> getDataMamatXML(){
        List<DataMamat> datamamat = new.ArrayList<>();
        
        DatamamatJpaController controller = new DatamamatJpaController();
        
        try {
            datamamat = controller.findDatamamatEntities();
        } catch(Exception e){}
        return datamamat;
    }
    
}
