package itc.teams.backend.demo.models;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MemberRepository extends CrudRepository<Member, Long> {

    @SuppressWarnings("null")
    List<Member> findAll();

}
