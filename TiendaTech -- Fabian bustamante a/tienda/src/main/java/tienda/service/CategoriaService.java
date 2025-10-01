package tienda.service;

import tienda.domain.Categoria;
import tienda.repository.CategoriaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Transactional(readOnly = true)
    public List<Categoria> getCategorias(boolean activo) {
        var lista = categoriaRepository.findAll();
        if (activo) {
            lista.removeIf(c -> !c.getActivo());
        }
        return lista;
    }
}

