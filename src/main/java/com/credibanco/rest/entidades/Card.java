package com.credibanco.rest.entidades;

import com.pharos.credibanco.checkout.ws.UserCard;

public class Card {
    
    public String alias;
    public boolean favorite;
    public String franchise;
    public boolean internationalCard;
    public String state;
    
    public Card() {
        //Empty
    }

    public Card(UserCard userCard) {
        this.alias = userCard.getAlias();
        this.favorite = userCard.isFavorite();
        this.franchise = userCard.getFranchise();
        this.internationalCard = userCard.isInternationalCard();
        this.state = userCard.getState();
    }

       
    
    
}