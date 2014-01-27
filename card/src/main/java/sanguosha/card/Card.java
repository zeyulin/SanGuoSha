package sanguosha.card;

enum Colour{
    SPADE,HEART,CLUB,DIAMOND
}

enum Category{
    BASIC,EQUIPMENT,TIP
}

enum Name{
    SHA,SHAN,TAO,   //BASIC
                     //EQUIPMENT
                    //TIP
}

public abstract class Card {
    public Colour colour;
    public short point;
    public Name name;
    public Category category;
}
