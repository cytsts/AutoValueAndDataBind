package net.luskan.test1;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import net.luskan.test1.databinding.ActivityMainBinding;
import net.luskan.test1.modelo.IPessoa;
import net.luskan.test1.modelo.IViewMain;
import net.luskan.test1.modelo.Pessoa;
import net.luskan.test1.modelo.PresenterPessoa;

public class MainActivity extends AppCompatActivity implements IViewMain {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        Pessoa.Builder builderPessoa = Pessoa.builder()
                .Id(1L)
                .Name("Teste")
                .Email("email@teste.com");

        Pessoa pessoa = builderPessoa.build();
        PresenterPessoa presenterPessoa = new PresenterPessoa(pessoa, this);
        binding.setPessoa(pessoa);
        binding.setPresenter(presenterPessoa);

    }

    @Override
    public void OnAtualizaPessoa(IPessoa pessoa) {
        binding.setPessoa(pessoa);
    }
}
