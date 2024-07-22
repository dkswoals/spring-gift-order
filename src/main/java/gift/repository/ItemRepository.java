package gift.repository;

import gift.model.item.Item;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

    Page<Item> findAll(Pageable pageable);

    Page<Item> findAllByCategoryId(Long categoryId, Pageable pageable);

    Optional<Item> findById(Long id);

    void deleteById(Long id);

    boolean existsById(Long id);
}
