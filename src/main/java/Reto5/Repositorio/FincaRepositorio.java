package Reto5.Repositorio;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import Reto5.Interface.InterfaceFinca;
import Reto5.Modelo.Finca;

@Repository
public class FincaRepositorio {

    @Autowired
    private InterfaceFinca crud;

    public List<Finca> getAll() {
        return (List<Finca>) crud.findAll();
    }

    public Optional<Finca> getFinca(int id) {
        return crud.findById(id);
    }

    public Finca save(Finca finca) {
        return crud.save(finca);
    }

    public void delete(Finca finca) {
        crud.delete(finca);
    }

}
