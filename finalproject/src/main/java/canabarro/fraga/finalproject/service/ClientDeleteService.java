package canabarro.fraga.finalproject.service;

import canabarro.fraga.finalproject.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientDeleteService {

    @Autowired
    private ClientRepository clientRepository;

    public void delete(long id) {
        this.clientRepository.deleteById(id);
    }
}
