package com.example.mwongera.papyread;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.internal.CardHeader;
import it.gmariotti.cardslib.library.internal.CardThumbnail;
import it.gmariotti.cardslib.library.view.CardView;

/**
 * Created by mwongera on 4/27/16.
 */
public class Main2Activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Create a Card
        Card card = new Card(this, R.layout.row_card);

        // Create a CardHeader
        CardHeader header = new CardHeader(this);
        header.setTitle("Hello world");

        card.setTitle("Simple card demo");
        CardThumbnail thumb = new CardThumbnail(this);
        thumb.setDrawableResource(R.drawable.ic_launcher);

        card.addCardThumbnail(thumb);

        // Add Header to card
        card.addCardHeader(header);

        // Set card in the cardView
        CardView cardView = (CardView) findViewById(R.id.myList);
        cardView.setCard(card);

    }

    /**
     * Card list button clicker
     * @param v
     */
    public void btnCardListDemoClick(View v){
        Intent intent = new Intent(this, Cardlistactivity.class);
        startActivity(intent);
    }


}
