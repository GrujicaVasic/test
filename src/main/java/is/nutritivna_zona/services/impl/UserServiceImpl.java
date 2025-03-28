package is.nutritivna_zona.services.impl;

import is.nutritivna_zona.exceptions.NotFoundException;
import is.nutritivna_zona.models.requests.UserRequest;
import is.nutritivna_zona.models.User;
import is.nutritivna_zona.models.UserFull;
import is.nutritivna_zona.models.entities.UserEntity;
import is.nutritivna_zona.repositories.UserEntityRepository;
import is.nutritivna_zona.services.UserService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    private final ModelMapper modelMapper;
    private final UserEntityRepository clientRepository;

    @PersistenceContext
    private EntityManager em;

    public UserServiceImpl(ModelMapper modelMapper, UserEntityRepository clientRepository) {
        this.modelMapper = modelMapper;
        this.clientRepository = clientRepository;
    }

    @Override
    public List<User> findAll() {
        return clientRepository.findAll().stream().map(c -> modelMapper.map(c, User.class)).collect(Collectors.toList());
    }

    @Override
    public User findById(Integer id) throws NotFoundException {
        return modelMapper.map(clientRepository.findById(id).orElseThrow(NotFoundException::new), User.class);
    }

    @Override
    public void delete(Integer id) {
        clientRepository.deleteById(id);
    }

    @Override
    public User insert(UserRequest userRequest) throws NotFoundException {
        UserEntity userEntity = modelMapper.map(userRequest, UserEntity.class);
        userEntity.setId(null);
        userEntity = clientRepository.saveAndFlush(userEntity);
        em.refresh(userEntity);
        return findById(userEntity.getId());
    }

    @Override
    public User update(Integer id, UserRequest userRequest) throws NotFoundException {
        UserEntity userEntity = modelMapper.map(userRequest, UserEntity.class);
        userEntity.setId(id );
        userEntity = clientRepository.saveAndFlush(userEntity);
        em.refresh(userEntity);
        return findById(userEntity.getId());
    }

    @Override
    public List<UserFull> findAllFull() {
        return clientRepository.findAll().stream().map(c -> modelMapper.map(c, UserFull.class)).collect(Collectors.toList());
    }
}
