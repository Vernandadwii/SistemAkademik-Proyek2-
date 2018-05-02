/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vernanda.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author AsusPC
 */
public class DKBSController implements Initializable {

    @FXML
    private TextField txtProyekPend;
    @FXML
    private TextField txtProgStud;
    @FXML
    private TextField txtNama;
    @FXML
    private TextField txtNRP;
    @FXML
    private TableColumn<?, ?> colAlokasiWaktu;
    @FXML
    private TableColumn<?, ?> colCode;
    @FXML
    private TableColumn<?, ?> colNama;
    @FXML
    private TableColumn<?, ?> colKelas;
    @FXML
    private Label labelDKBS;
    @FXML
    private Label labelProg;
    @FXML
    private Label labelProyek;
    @FXML
    private Label labelNama;
    @FXML
    private Label labelNRP;
    @FXML
    private TableColumn<?, ?> colSKS;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
