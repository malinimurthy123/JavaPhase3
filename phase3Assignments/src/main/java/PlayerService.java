

import java.util.List;


public interface PlayerService {

    public Player getPlayerById(int id);
    public List<Player> getPlayersByAge(int age);
}