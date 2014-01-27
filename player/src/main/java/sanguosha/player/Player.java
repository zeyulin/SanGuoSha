package sanguosha.player;

import sanguosha.card.Card;
import sanguosha.equipment.Equipments;
import sanguosha.general.General;

import java.util.List;

enum Faction{
    ZHU_GONG,ZHONG_CHEN,FAN_ZEI,NEI_JIAN
}

public class Player {
    public short position;
    public short physical;
    public Faction faction;
    public General general;


    //status buffers
    //le,bing,shandian


    //equipment
    public Equipments equipments;
    public List<Card> cards;                   //......................................................TODO



}
