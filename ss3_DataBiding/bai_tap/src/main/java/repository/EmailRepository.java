package repository;

import com.model.Email;

import java.util.ArrayList;
import java.util.List;

public class EmailRepository implements IEmailRepository {

private static List<String> languages=new ArrayList<>();
private static List<Integer> pageSize=new ArrayList<>();
private static List<Email> emailList=new ArrayList<>();


static {
    languages.add("English");
    languages.add("Vietnamese");
    languages.add("Japanese");
    languages.add("Korean");

    pageSize.add(5);
    pageSize.add(10);
    pageSize.add(15);
    pageSize.add(25);
    pageSize.add(50);
    pageSize.add(100);

    emailList.add(new Email(1,"English",5,true,"CCC"));
    emailList.add(new Email(2,"Japanese",50,false,"AAA"));
    emailList.add(new Email(3,"Vietnamese",15,true,"VVV"));
    emailList.add(new Email(4,"Korean",25,false,"BBB"));
}

    @Override
    public List<String> findAllLanguages() {
        return languages;
    }

    @Override
    public List<Integer> findAllPageSize() {
        return pageSize;
    }

    @Override
    public List<Email> findAllEmail() {
        return emailList;
    }

    @Override
    public void update(Email email) {

    }

    @Override
    public Email findById(int id) {
        return null;
    }
}
