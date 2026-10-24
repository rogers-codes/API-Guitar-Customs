package br.com.guitarcustoms.apiguitarcustoms.repository;

import br.com.guitarcustoms.apiguitarcustoms.entity.GuitarCustoms;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GuitarRepository extends JpaRepository<GuitarCustoms, UUID> {
}
