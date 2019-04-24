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
public class FirstFragment extends Fragment implements View.OnClickListener {

    private Button btnCalc;
    private EditText txtFirst, txtSec;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate ( R.layout.fragment_first, container, false );

        txtFirst = view.findViewById(R.id.txtFirst);
        txtSec = view.findViewById(R.id.txtSec);
        btnCalc = view.findViewById(R.id.btnCalc);

        btnCalc.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        int first = Integer.parseInt(txtFirst.getText().toString());
        int second = Integer.parseInt(txtSec.getText().toString());
        int result = first+second;

        Toast.makeText(getActivity(), "Sum is: " + result, Toast.LENGTH_LONG).show();

    }
}
