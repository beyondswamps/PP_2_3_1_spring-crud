package web.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    final private EntityManagerFactory emf;

    public UserDaoImp(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    @Transactional
    public void addUser(User user) {
        EntityManager em = emf.createEntityManager();
//        em.getTransaction().begin();
        em.persist(user);
//        em.getTransaction().commit();
//        em.close();
    }

    @Override
    public List<User> getUsers() {
        return emf
                .createEntityManager()
                .createQuery("from User", User.class)
                .getResultList();
    }

    @Override
    public User getUser(Long id) {
        return emf.createEntityManager().find(User.class, id);
    }
}
