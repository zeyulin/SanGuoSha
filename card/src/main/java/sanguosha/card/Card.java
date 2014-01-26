package java.sanguosha.card;

enum Colour{
    spade,heart,club,diamond
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
