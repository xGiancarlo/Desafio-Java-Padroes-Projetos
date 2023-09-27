package DIO.LabsPadroesProjetos.Model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EndereçoRepository extends CrudRepository<Endereco, String> {
}
