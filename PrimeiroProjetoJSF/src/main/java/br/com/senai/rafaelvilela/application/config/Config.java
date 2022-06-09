package br.com.senai.rafaelvilela.application.config;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;
import javax.faces.annotation.FacesConfig.Version;
@FacesConfig( version = Version.JSF_2_3)
@ApplicationScoped //Permite que a classe funcione enquanto o servidor estiver ligado
public class Config {

}
