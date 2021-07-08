package it.polito.tdp.anagram;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import it.polito.tdp.anagram.model.Anagram;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField parola;

    @FXML
    private Button button;

    @FXML
    private TextArea anagrammi;

    @FXML
    void doAnagram(ActionEvent event) {
    	anagrammi.clear();
    	String p=parola.getText();
    	Anagram a=new Anagram();
    	List<String> risultato=a.anagrammi(p);
    	for(String r:risultato) {
    		anagrammi.appendText(r+"\n");
    	}
    	anagrammi.appendText(""+risultato.size());
    	parola.clear();
    }

    @FXML
    void initialize() {
        assert parola != null : "fx:id=\"parola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert button != null : "fx:id=\"button\" was not injected: check your FXML file 'Scene.fxml'.";
        assert anagrammi != null : "fx:id=\"anagrammi\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
