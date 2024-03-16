package koffiamonnindanielelie.diahouyapocharlesemmanuel.ycditcalculatrice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.util.Timer;
import java.util.TimerTask;

public class CalculatriceController {

    @FXML
    private Button ac;

    @FXML
    private Button add;

    @FXML
    private Button cinq;

    @FXML
    private Button del;

    @FXML
    private Button deux;

    @FXML
    private Button div;

    @FXML
    private Label ecran;

    @FXML
    private Label ans;

    @FXML
    private Button egal;

    @FXML
    private Button huit;

    @FXML
    private Button mod;

    @FXML
    private Button moins;

    @FXML
    private Button mult;

    @FXML
    private Button neuf;

    @FXML
    private Button point;

    @FXML
    private Button quatre;

    @FXML
    private Button sept;

    @FXML
    private Button six;

    @FXML
    private Button sous;

    @FXML
    private Button trois;

    @FXML
    private Button un;

    @FXML
    private Button zero;

    //Variable pratique
    int operateur=0;
    int resultat=0;
    int nbr1=0;
    int nbr2=0;
    boolean check=true;
    boolean moinsU = true;

    @FXML
    protected void add(ActionEvent event) {
        String text = ecran.getText();
        moinsU=true;

        if (operateur == 0) {
            nbr1 = Integer.parseInt(text);
            ecran.setText(text + "+");
            operateur = 1;
            check=false;
            ans.setText(nbr1+"+");

        } else if (operateur == 1) {
            nbr2= Integer.parseInt(text);
            resultat = nbr1 + nbr2;
            ecran.setText(Integer.toString(resultat));
            operateur = 0;
        }
    }


    @FXML
    protected void sous(ActionEvent event) {
        String text = ecran.getText();
        moinsU=true;

        if (operateur == 0) {
            nbr1 = Integer.parseInt(text);
            ecran.setText(text + "-");
            operateur = 2;
            check=false;
            ans.setText(nbr1+"-");


        } else if (operateur == 2) {
            nbr2= Integer.parseInt(text);
            resultat = nbr1 - nbr2;
            text = Integer.toString(resultat);
            ecran.setText(text);
            operateur = 0;
        }
    }

    @FXML
    protected void mult(ActionEvent event) {
        String text = ecran.getText();
        moinsU=true;

        if (operateur == 0) {
            nbr1 = Integer.parseInt(text);
            ecran.setText(text + "*");
            operateur = 3;
            check=false;
            ans.setText(nbr1+"*");

        } else if (operateur == 3) {
            nbr2= Integer.parseInt(text);
            resultat = nbr1 * nbr2;
            ecran.setText(Integer.toString(resultat));
            operateur = 0;
        }}

    @FXML
    protected void div(ActionEvent event) {
        String text = ecran.getText();
        moinsU=true;

        if (operateur == 0) {
            nbr1 = Integer.parseInt(text);
            ecran.setText(text + "/");
            operateur = 4;
            check=false;
            ans.setText(nbr1+"/");

        } else if (operateur == 4) {
            if (Integer.parseInt(text) != 0) {
                nbr2= Integer.parseInt(text);
                resultat = nbr1 / nbr2;
                nbr1=resultat;
                ecran.setText(Integer.toString(resultat) + "/");
                check=false;

            }else{
                ecran.setText("Erreur: Press A/C");
            }
        }
    }

    @FXML
    protected void mod(ActionEvent event) {
        String text = ecran.getText();
        if (operateur == 0) {
            nbr1 = Integer.parseInt(text);
            ecran.setText(text + "%");
            operateur = 5;
            check=false;
            ans.setText(nbr1+"%");

        } else if (operateur == 5) {
            nbr2= Integer.parseInt(text);
            resultat = nbr1 % nbr2;
            ecran.setText(Integer.toString(resultat));
            operateur = 0;
        }
    }

    @FXML
    protected void ac(ActionEvent event) {
        ans.setText("");

        ecran.setText("0");
        operateur = 0;
        check=true;

    }
    @FXML
    protected void del(ActionEvent event) {
        String text = ecran.getText();
        // Supprimer le dernier caractère de la chaîne
        if (!text.isEmpty()) {
            text = text.substring(0, text.length() - 1);
            // Mettre à jour le texte de l'écran
            ecran.setText(text);
        }
    }


    @FXML
    protected void exit(ActionEvent event) {
        Stage stage = (Stage) ac.getScene().getWindow();
        stage.close();    }

    @FXML
    protected void moins(ActionEvent event) {
        if (moinsU) {
            ecran.setText( "-");
            check=true;
            moinsU=false;
        }
    }

    @FXML
    protected void egal(ActionEvent event) {
        String text = ecran.getText();
        moinsU=true;
        if (operateur == 1) {
            ans.setText(nbr1+"+"+Integer.parseInt(text)+"=");

            nbr2= Integer.parseInt(text);
            resultat = nbr1 + nbr2;
            ecran.setText(Integer.toString(resultat));
        }else if (operateur == 2) {
            ans.setText(nbr1+"-"+Integer.parseInt(text)+"=");

            nbr2= Integer.parseInt(text);
            resultat = nbr1 - nbr2;
            text = Integer.toString(resultat);
            ecran.setText(text);
        }else if (operateur == 3) {
            ans.setText(nbr1+"*"+Integer.parseInt(text)+"=");

            nbr2= Integer.parseInt(text);
            resultat = nbr1 * nbr2;
            ecran.setText(Integer.toString(resultat));
        }else if (operateur == 4) {
            if (Integer.parseInt(text) != 0) {
                ans.setText(nbr1+"/"+Integer.parseInt(text)+"=");

                nbr2= Integer.parseInt(text);
                resultat = nbr1 / nbr2;
                ecran.setText(Integer.toString(resultat));
                check=false;
            }else{
                Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                    public void run() {

                        ecran.setText("Erreur: Press A/C");                    }
                }, 1000); // 1000 ms = 1 seconde



            }
        }else if (operateur == 5) {
            ans.setText(nbr1+"%"+Integer.parseInt(text)+"=");

            nbr2= Integer.parseInt(text);
            resultat = nbr1 % nbr2;
            ecran.setText(Integer.toString(resultat));
        }
        operateur = 0;
    }

    @FXML
    protected void un(ActionEvent event) {
        handleDigitInput("1");
    }

    @FXML
    protected void deux(ActionEvent event) {
        handleDigitInput("2");
    }

    @FXML
    protected void trois(ActionEvent event) {
        handleDigitInput("3");
    }

    @FXML
    protected void quatre(ActionEvent event) {
        handleDigitInput("4");
    }

    @FXML
    protected void cinq(ActionEvent event) {
        handleDigitInput("5");
    }

    @FXML
    protected void six(ActionEvent event) {
        handleDigitInput("6");
    }

    @FXML
    protected void sept(ActionEvent event) {
        handleDigitInput("7");
    }

    @FXML
    protected void huit(ActionEvent event) {
        handleDigitInput("8");
    }

    @FXML
    protected void neuf(ActionEvent event) {
        handleDigitInput("9");
    }

    @FXML
    protected void zero(ActionEvent event) {
        handleDigitInput("0");
    }

    private void appendToScreen(String value) {
        String text = ecran.getText();

        if (text.equals("0")) {
            ecran.setText(value);
        } else {
            ecran.setText(text + value);
        }
    }
    private void handleDigitInput(String digit) {
        if (check) {
            appendToScreen(digit);
        } else {
            check = true;
            ecran.setText("");
            appendToScreen(digit);
        }
    }

}
