package alexfragoso.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    //VARIAVEIS

    private TextView telaResultado;
    private TextView telaExpressao;

    //botoes numericos
    private Button botaoUm;
    private Button botaoDois;
    private Button botaoTres;
    private Button botaoQuatro;
    private Button botaoCinco;
    private Button botaoSeis;
    private Button botaoSete;
    private Button botaoOito;
    private Button botaoNove;
    private Button botaoZero;

    //botoes de operadores
    private Button botaoSomar;
    private Button botaoSubtrair;
    private Button botaoDividir;
    private Button botaoMultiplicar;

    private Button botaoIgual;
    private Button botaoPonto;
    private Button botaoClear;
    private Button botaoBackspace;

    private Button botaoAbreParenteses;
    private Button botaoFechaParenteses;

    private Button botaoRaiz;
    private Button botaoPorcentagem;
    private Button botaoXquadrado;
    private Button botaoMaisMenos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        telaResultado = (TextView) findViewById(R.id.textView_campo_resultado);
        telaExpressao = (TextView) findViewById(R.id.textView_expressao);

        botaoZero = (Button) findViewById(R.id.button_numero0);
        botaoUm = (Button) findViewById(R.id.button_numero1);
        botaoDois = (Button) findViewById(R.id.button_numero2);
        botaoTres = (Button) findViewById(R.id.button_numero3);
        botaoQuatro = (Button) findViewById(R.id.button_numero4);
        botaoCinco = (Button) findViewById(R.id.button_numero5);
        botaoSeis = (Button) findViewById(R.id.button_numero6);
        botaoSete = (Button) findViewById(R.id.button_numero7);
        botaoOito = (Button) findViewById(R.id.button_numero8);
        botaoNove = (Button) findViewById(R.id.button_numero9);

        botaoSomar = (Button) findViewById(R.id.button_sinal_soma);
        botaoSubtrair = (Button) findViewById(R.id.button_sinal_subtracao);
        botaoDividir = (Button) findViewById(R.id.button_sinal_divisao);
        botaoMultiplicar = (Button) findViewById(R.id.button_sinal_multiplicacao);

        botaoIgual = (Button) findViewById(R.id.button_sinal_igual);
        botaoPonto = (Button) findViewById(R.id.button_ponto);
        botaoClear = (Button) findViewById(R.id.button_limpar);
        botaoBackspace = (Button) findViewById(R.id.button_bsp);

        botaoAbreParenteses = (Button) findViewById(R.id.button_abre_parenteses);
        botaoFechaParenteses = (Button) findViewById(R.id.button_fecha_parenteses);

        botaoRaiz = (Button) findViewById(R.id.button_sinal_raiz);
        botaoPorcentagem = (Button) findViewById(R.id.button_sinal_porcentagem);
        botaoXquadrado = (Button) findViewById(R.id.button_x_quadrado);
        botaoMaisMenos = (Button) findViewById(R.id.button_sinal_mais_menos);

        botaoZero.setOnClickListener(this);
        botaoUm.setOnClickListener(this);
        botaoDois.setOnClickListener(this);
        botaoTres.setOnClickListener(this);
        botaoQuatro.setOnClickListener(this);
        botaoCinco.setOnClickListener(this);
        botaoSeis.setOnClickListener(this);
        botaoSete.setOnClickListener(this);
        botaoOito.setOnClickListener(this);
        botaoNove.setOnClickListener(this);

        botaoSomar.setOnClickListener(this);
        botaoSubtrair.setOnClickListener(this);
        botaoDividir.setOnClickListener(this);
        botaoMultiplicar.setOnClickListener(this);

        botaoIgual.setOnClickListener(this);
        botaoPonto.setOnClickListener(this);
        botaoClear.setOnClickListener(this);
        botaoBackspace.setOnClickListener(this);

        botaoAbreParenteses.setOnClickListener(this);
        botaoFechaParenteses.setOnClickListener(this);

        botaoRaiz.setOnClickListener(this);
        botaoPorcentagem.setOnClickListener(this);
        botaoXquadrado.setOnClickListener(this);
        botaoMaisMenos.setOnClickListener(this);









    }

    @Override
    public void onClick(View v) {

        Button botao = (Button) v;

        if (botao != null) {

            if (botao == botaoZero || botao == botaoUm || botao == botaoDois ||
                    botao == botaoTres || botao == botaoQuatro || botao == botaoCinco ||
                    botao == botaoSeis || botao == botaoSete || botao == botaoOito ||
                    botao == botaoNove) {

                telaExpressao.append(botao.getText().toString());
                telaResultado.append(botao.getText().toString());


            }else{

                if(botao == botaoClear){
                    telaResultado.setText("0");
                    telaExpressao.setText("------------");
                }
            }

        }
    }
}