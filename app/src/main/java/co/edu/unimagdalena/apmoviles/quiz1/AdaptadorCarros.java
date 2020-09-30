package co.edu.unimagdalena.apmoviles.quiz1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AdaptadorCarros extends ArrayAdapter<Carro> {
    private Context context;
    private ArrayList<Carro> carros;
    private LayoutInflater inflater;
    public AdaptadorCarros(@NonNull Context context, ArrayList<Carro> carros) {
        super(context,0, carros);
        this.context = context;
        this.carros = carros;
        inflater= LayoutInflater.from(context);
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Nullable
    @Override
    public Carro getItem(int position) {
        return super.getItem(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView==null){
            convertView = inflater.inflate(R.layout.fila_carro,null);

        }
        Carro p = getItem(position);
        TextView pl = convertView.findViewById(R.id.txtplaca);
        TextView mar = convertView.findViewById(R.id.txtmarca);
        TextView mod = convertView.findViewById(R.id.txtmodelo);
        pl.setText(p.getPlaca());
        mar.setText(p.getMarca());
        mod.setText(p.getModelo());
        return convertView;
    }
}
