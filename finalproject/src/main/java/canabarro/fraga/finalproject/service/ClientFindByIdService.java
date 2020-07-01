package canabarro.fraga.finalproject.service;

import canabarro.fraga.finalproject.model.ClientEntity;
import canabarro.fraga.finalproject.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientFindByIdService {

    @Autowired
    private ClientRepository clientRepository;

    public ClientEntity findById(long id) {
        return this.clientRepository.findById(id).get();
    }
}
