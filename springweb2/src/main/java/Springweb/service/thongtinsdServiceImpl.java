package Springweb.service;

import Springweb.entity.thongtinsd;
import Springweb.repository.thongtinsdRepository;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

@Service
public class thongtinsdServiceImpl implements thongtinsdService {

    private final thongtinsdRepository ttsdRepository;

    @Autowired
    public thongtinsdServiceImpl(thongtinsdRepository thongtinsdRepository) {
        this.ttsdRepository = thongtinsdRepository;
    }

    @Override
    public Iterable<thongtinsd> findAll() {
        return ttsdRepository.findAll();
    }

    @Override
    public Optional<thongtinsd> findById(Integer id) {
        return ttsdRepository.findById(id);
    }

    @Override
    public boolean existsById(Integer id) {
        return ttsdRepository.existsById(id);
    }

    @Override
    public long count() {
        return ttsdRepository.count();
    }

    @Override
    public void deleteById(Integer id) {
        ttsdRepository.deleteById(id);
    }

    @Override
    public void delete(thongtinsd entity) {
        ttsdRepository.delete(entity);
    }

    @Override
    public void deleteAll() {
        ttsdRepository.deleteAll();
    }
    
//    @Override
//    public List<thongtinsd> searchTTSD(int keyword){
//        return ttsdRepository.searchTTSD(keyword);
//    }
    
    public List<thongtinsd> findByMaTB(int maTB){
        return ttsdRepository.findByMaTB(maTB);
    }
    
    @Override
    public List<thongtinsd>getListsd(){
        return ttsdRepository.getListsd();
    }
    
    @Override
    public List <thongtinsd> getListdangmuon(){
        return ttsdRepository.getListdangmuon();
    }
    
    @Override 
     public List<thongtinsd> getListdamuon(){
    return ttsdRepository.getListdamuon();
    }
    

}
