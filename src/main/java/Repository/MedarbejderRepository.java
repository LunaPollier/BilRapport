package Repository;
import Klasser.Medarbejder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;


public interface MedarbejderRepository extends CrudRepository<Medarbejder, Integer>{

    }
