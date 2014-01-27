package sanguosha.player;

import sanguosha.card.Card;
import sanguosha.general.General;

enum Faction{
    ZHU_GONG,ZHONG_CHEN,FAN_ZEI,NEI_JIAN
}

public class Player {
    public short position;
    public short faction;
    public General general;
    public Card card;

}
