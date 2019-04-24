package fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment implements View.OnClickListener {

    private Button btnRadius;
    private EditText txtRadius;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate ( R.layout.fragment_second, container, false );

        txtRadius = view.findViewById(R.id.txtRadius);
        btnRadius = view.findViewById(R.id.btnRadius);

        btnRadius.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        float radius = Float.parseFloat(txtRadius.getText().toString());
        float area = 3.14f* radius * radius;

        Toast.makeText(getActivity(), "Area of Circle is: " + area, Toast.LENGTH_LONG).show();

    }
}
