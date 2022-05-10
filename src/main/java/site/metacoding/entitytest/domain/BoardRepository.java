package site.metacoding.entitytest.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Integer>{
    //CRUD를 갖고 있다. 
}
