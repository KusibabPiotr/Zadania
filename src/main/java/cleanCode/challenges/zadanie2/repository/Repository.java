package cleanCode.challenges.zadanie2.repository;

import java.util.List;

public interface Repository<T> {

    List<T> findAll();
    void save(T something);

}
