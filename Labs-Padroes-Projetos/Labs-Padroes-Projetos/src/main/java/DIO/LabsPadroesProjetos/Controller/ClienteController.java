package DIO.LabsPadroesProjetos.Controller;

import DIO.LabsPadroesProjetos.Model.Cliente;
import DIO.LabsPadroesProjetos.Service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private ClienteService clienteservice;

    @GetMapping
    public ResponseEntity<Iterable<Cliente>> buscarTodos() {
        return ResponseEntity.ok(clienteservice.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(clienteservice.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Cliente> inserir(@RequestBody Cliente cliente) {
        clienteservice.inserir(cliente);
        return ResponseEntity.ok(cliente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizar(@PathVariable Long id, @RequestBody Cliente cliente) {
        clienteservice.atualizar(id, cliente);
        return ResponseEntity.ok(cliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        clienteservice.deletar(id);
        return ResponseEntity.ok().build();
    }
    /*@PostMapping
    public ResponseEntity<Cliente> inserir(@RequestBody @Valid Cliente cliente, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            // Existem erros de validação
        }

        clienteservice.inserir(cliente);
        return ResponseEntity.ok(cliente);
    }*/
}
