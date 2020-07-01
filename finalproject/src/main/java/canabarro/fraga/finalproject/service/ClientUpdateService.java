package canabarro.fraga.finalproject.service;

import canabarro.fraga.finalproject.model.ClientEntity;
import canabarro.fraga.finalproject.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientUpdateService {

    @Autowired
    private ClientRepository clientRepository;

    public ClientEntity update(ClientEntity clientEntity) {
        return this.clientRepository.save(clientEntity);
    }
}
