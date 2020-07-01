package canabarro.fraga.finalproject.service;

import canabarro.fraga.finalproject.model.ClientEntity;
import canabarro.fraga.finalproject.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientFindAllService {

    @Autowired
    private ClientRepository clientRepository;

    public List<ClientEntity> findAll() {
        return (List<ClientEntity>) this.clientRepository.findAll();
    }
}
