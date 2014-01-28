package sanguosha;

import sanguosha.general.General;

import java.util.LinkedList;
import java.util.List;

public class ToBeDeleted_StaticData {
    final static int PLAYER_NUMBER = 8;

    public List getGenerals() {
        List<General> generals = new LinkedList<General>();
        for (int i = 0; i < PLAYER_NUMBER; i++) {
            generals.add(new General());
        }
        return generals;
    }
}
