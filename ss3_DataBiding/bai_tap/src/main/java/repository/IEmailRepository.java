package repository;

import com.model.Email;

import java.util.List;

public interface IEmailRepository {
    List<String> findAllLanguages();
    List<Integer> findAllPageSize();
    List<Email> findAllEmail();
    void update(Email email);
    Email findById(int id);


}
