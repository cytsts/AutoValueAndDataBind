package net.luskan.test1.modelo;

import android.view.View;

/**
 * Created by Clayton on 21/02/2017.
 */

public class PresenterPessoa implements View.OnClickListener{
    Pessoa pessoa;
    IViewMain view;

    public PresenterPessoa(Pessoa pessoa, IViewMain viewMain) {
        this.pessoa = pessoa;
        this.view  = viewMain;
    }


    @Override
    public void onClick(View view) {
        pessoa = Pessoa.builder().Id(  pessoa.Id()+1L).Name(pessoa.Name()).Email(pessoa.Email()).build();
        this.view.OnAtualizaPessoa(pessoa);
    }
}

