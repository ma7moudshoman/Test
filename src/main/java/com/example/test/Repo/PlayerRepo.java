package com.example.test.Repo;

import com.example.test.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface PlayerRepo extends JpaRepository<Player,Long> {

    Player findByName(@RequestParam String name);
/*

==============> http://localhost:8088/api
Get   http://localhost:8088/api/players
Get   http://localhost:8088/api/players/id


* */
}
