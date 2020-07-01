package canabarro.fraga.finalproject.service;

import canabarro.fraga.finalproject.model.ClientEntity;
import canabarro.fraga.finalproject.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientSaveService {

    @Autowired
    private ClientRepository clientRepository;

    public ClientEntity save(ClientEntity clientEntity) {
        return this.clientRepository.save(clientEntity);
    }
}
