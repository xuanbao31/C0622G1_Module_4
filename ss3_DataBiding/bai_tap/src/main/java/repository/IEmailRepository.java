package repository;

import com.model.Email;

import java.util.List;

public interface IEmailRepository {
    List<String> language();
    List<Integer> pageSize();
    List<String> spamsFilter();

}
