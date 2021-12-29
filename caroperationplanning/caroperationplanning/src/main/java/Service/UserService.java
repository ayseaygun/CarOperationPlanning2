package Service;

import com.cchcaroperationplanning.caroperationplanning.DTO.UserViewDTO;
import com.cchcaroperationplanning.caroperationplanning.Model.User;

public interface UserService {
    UserViewDTO getUserById(Long id);
}
