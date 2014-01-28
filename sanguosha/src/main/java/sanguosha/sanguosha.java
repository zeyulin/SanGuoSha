package sanguosha;

import sanguosha.card.Card;
import sanguosha.general.General;
import sanguosha.pile.Pile;
import sanguosha.pile.Piles;
import sanguosha.player.Player;

import java.util.LinkedList;
import java.util.List;

public class sanguosha {

    //TODO: to be remove
    //static data to be remove
                            public ToBeDeleted_StaticData staticData=new ToBeDeleted_StaticData();



    //static data
    short STARTING_HAND_CARD_NUMBER=4;

    public Piles piles;
    public Pile newPile;
    public Pile discardPile;

    // init pile
    public void initPiles(){

    }

    // init players
    public void initPlayers(){
            //choose generals
        List<Player> players=new LinkedList<Player>();
        for (int i=0;i<staticData.getGenerals().size();i++){
            Player player=new Player();
            player.general=(General)staticData.getGenerals().get(i);
            player.cards=new LinkedList<Card>(newPile.get(STARTING_HAND_CARD_NUMBER));
            players.add(new Player());
        }

            //resist skills

            //draw cards
    }


    //Start!




}
