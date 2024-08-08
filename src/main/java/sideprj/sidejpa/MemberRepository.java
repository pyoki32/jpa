package sideprj.sidejpa;

import jakarta.persistence.*;

import org.springframework.stereotype.Repository;
import sideprj.sidejpa.domain.Member;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(Member member) {
        em.persist(member);
        return member.getId();
    }

    public Member find(long id) {
        return em.find(Member.class, id);
    }
}
