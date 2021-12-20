package com.example.reto1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    /**Declaracion de variables globales de la clase **/

    Menu menu;
    /**Variable para manejo de items*/
    MenuItem item;
    /**Variable para manejo de items*/
    ImageView item1;
    /**Variable para manejo de items*/
    ImageView item2;
    /**Variable para manejo de items*/
    ImageView item3;
    /**Variable para manejo de botones*/
    Button pedir,
            bt_item2,
            bt_item3;

    /**Metodo que inicializa todos los componentes iniciales*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    /**Cargue de imagenes**/
       Resources res = getResources();
        Drawable drawable=res.getDrawable(R.drawable.foim,getTheme());
        item1=findViewById(R.id.hamburguesa);
        item1.setImageDrawable(drawable);

        Drawable drawable2=res.getDrawable(R.drawable.chorizo2,getTheme());
        item2=findViewById(R.id.chorizo);

        item2.setImageDrawable(drawable2);

        Drawable drawable3=res.getDrawable(R.drawable.costillas,getTheme());
        item3=findViewById(R.id.picada);
        item3.setImageDrawable(drawable3);

        /*************ACCIONES DE BOTONES*******************/

        pedir= (Button) findViewById(R.id.pedir);
        pedir.setOnClickListener(this);

        bt_item2 =(Button) findViewById(R.id.bt_item2);
        bt_item2.setOnClickListener(this);

        bt_item3 =(Button) findViewById(R.id.bt_item3);
        bt_item3.setOnClickListener(this);

}
    @Override
    public void onClick(View v) {
        Toast.makeText(this, "En implementacion", Toast.LENGTH_SHORT).show();
    }

    /*************METODOS DE INICIALIZACON DE MENUS*******************/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuopciones, menu);
        return true;
    }

    /*************ACCIONES DE BOTONES DEL MENU SUPERIOR*******************/
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id= item.getItemId();
        if (id==R.id.opcion1){
            Toast.makeText(this,"Se seleccionó la primera opción",Toast.LENGTH_LONG).show();
        }
        if (id==R.id.opcion2) {
            Toast.makeText(this,"Se seleccionó la segunda opción",Toast.LENGTH_LONG).show();
        }
        if (id==R.id.opcion3) {
            Toast.makeText(this,"Se seleccionó la tercera opción", Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }



}