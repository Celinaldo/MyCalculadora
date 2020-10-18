package com.example.mycalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    // variaveis

    private TextView ponto;
    private TextView zero;
    private ImageView limpar1;
    private TextView igual;
    private TextView um;
    private TextView dois;
    private TextView tres;
    private TextView mais;
    private TextView quatro;
    private TextView cinco;
    private TextView seis;
    private TextView menos;
    private TextView sete;
    private TextView oito;
    private TextView nove;
    private TextView multiĺicacao;
    private TextView limpartudo;
    private TextView divisao;
    private TextView resultado;
    private TextView expressao;


    public TextView getPonto() {
        return ponto;
    }

    public void setPonto(TextView ponto) {
        this.ponto = ponto;
    }

    public TextView getZero() {
        return zero;
    }

    public void setZero(TextView zero) {
        this.zero = zero;
    }

    public ImageView getLimpar1() {
        return limpar1;
    }

    public void setLimpar1(ImageView limpar1) {
        this.limpar1 = limpar1;
    }

    public TextView getIgual() {
        return igual;
    }

    public void setIgual(TextView igual) {
        this.igual = igual;
    }

    public TextView getUm() {
        return um;
    }

    public void setUm(TextView um) {
        this.um = um;
    }

    public TextView getDois() {
        return dois;
    }

    public void setDois(TextView dois) {
        this.dois = dois;
    }

    public TextView getTres() {
        return tres;
    }

    public void setTres(TextView tres) {
        this.tres = tres;
    }

    public TextView getMais() {
        return mais;
    }

    public void setMais(TextView mais) {
        this.mais = mais;
    }

    public TextView getQuatro() {
        return quatro;
    }

    public void setQuatro(TextView quatro) {
        this.quatro = quatro;
    }

    public TextView getCinco() {
        return cinco;
    }

    public void setCinco(TextView cinco) {
        this.cinco = cinco;
    }

    public TextView getSeis() {
        return seis;
    }

    public void setSeis(TextView seis) {
        this.seis = seis;
    }

    public TextView getMenos() {
        return menos;
    }

    public void setMenos(TextView menos) {
        this.menos = menos;
    }

    public TextView getSete() {
        return sete;
    }

    public void setSete(TextView sete) {
        this.sete = sete;
    }

    public TextView getOito() {
        return oito;
    }

    public void setOito(TextView oito) {
        this.oito = oito;
    }

    public TextView getNove() {
        return nove;
    }

    public void setNove(TextView nove) {
        this.nove = nove;
    }

    public TextView getMultiĺicacao() {
        return multiĺicacao;
    }

    public void setMultiĺicacao(TextView multiĺicacao) {
        this.multiĺicacao = multiĺicacao;
    }

    public TextView getLimpartudo() {
        return limpartudo;
    }

    public void setLimpartudo(TextView limpartudo) {
        this.limpartudo = limpartudo;
    }

    public TextView getDivisao() {
        return divisao;
    }

    public void setDivisao(TextView divisao) {
        this.divisao = divisao;
    }

    public TextView getResultado() {
        return resultado;
    }

    public void setResultado(TextView resultado) {
        this.resultado = resultado;
    }

    public TextView getExpressao() {
        return expressao;
    }

    public void setExpressao(TextView expressao) {
        this.expressao = expressao;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ponto = findViewById(R.id.ponto);
        zero = findViewById(R.id.zero);
        limpar1 = findViewById(R.id.backspace);
        igual = findViewById(R.id.igual);
        um = findViewById(R.id.um);
        dois = findViewById(R.id.dois);
        tres = findViewById(R.id.tres);
        mais = findViewById(R.id.mais);
        quatro = findViewById(R.id.quatro);
        cinco = findViewById(R.id.five);
        seis = findViewById(R.id.six);
        menos = findViewById(R.id.menos);
        sete = findViewById(R.id.seven);
        oito = findViewById(R.id.eight);
        nove = findViewById(R.id.nine);
        multiĺicacao = findViewById(R.id.multiplication);
        limpartudo = findViewById(R.id.clear);
        divisao = findViewById(R.id.division);
        resultado = findViewById(R.id.result);
        expressao = findViewById(R.id.expression);

        //criando os eventos de click dos buttons

        ponto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acrescentarNumero(".", true);
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acrescentarNumero("0", true);
            }
        });
        um.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acrescentarNumero("1", true);
            }
        });
        dois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acrescentarNumero("2", true);
            }
        });
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acrescentarNumero("3", true);
            }
        });
        quatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acrescentarNumero("4", true);
            }
        });
        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acrescentarNumero("5", true);
            }
        });
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acrescentarNumero("6", true);
            }
        });
        sete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acrescentarNumero("7", true);
            }
        });
        oito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acrescentarNumero("8", true);
            }
        });
        nove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acrescentarNumero("9", true);
            }
        });
        mais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acrescentarNumero("+", false);
            }
        });
        menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acrescentarNumero("-", false);
            }
        });
        divisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acrescentarNumero("/", false);
            }
        });
        multiĺicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acrescentarNumero("x", false);
            }
        });
        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acrescentarNumero("=", false);
            }
        });

        limpartudo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressao.setText(" ");
                resultado.setText(" ");
            }
        });
        limpar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String limpar = expressao.getText().toString();
                if (limpar != " ") {
                    expressao.setText(limpar.substring(0, limpar.length() - 1));
                }
                resultado.setText(" ");

            }
        });
    }
    // metodo para adicionar e limpar na tela de expressão e resultado

    public void acrescentarNumero(String dado, boolean limparDados) {
        if (resultado.getText().toString().isEmpty()) {
            expressao.setText("");
        }
        if (limparDados) {
            resultado.setText(" ");
            expressao.append(dado);
        } else {
            expressao.append(resultado.getText());
            expressao.append(dado);
            resultado.setText(" ");
        }


    }


}

