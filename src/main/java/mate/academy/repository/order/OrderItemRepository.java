package mate.academy.repository.order;

import java.util.List;
import java.util.Optional;
import mate.academy.model.OrderItem;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    List<OrderItem> findByOrderId(Long orderId, Pageable pageable);

    Optional<OrderItem> findByIdAndOrderId(Long itemId, Long orderId);
}
