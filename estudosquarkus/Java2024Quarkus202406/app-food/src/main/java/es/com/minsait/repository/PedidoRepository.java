package escom.minsait.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import es.com.minsait.model.Pedido;

@ApplicationScoped
public class PedidoRepository implements PanacheRepository<Pedido> {
    
}