package.com.example.demo.service.Impl;
import org.springframework.stereotype.Service;
import com.example.demo.service.studentservice;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class studentserviceimpl implements studentservice{
    @Autowired studentrepo student;
    
   public studententity postdata(studententity stu){

        }
}