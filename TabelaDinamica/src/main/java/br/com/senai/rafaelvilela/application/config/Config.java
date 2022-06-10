package br.com.senai.rafaelvilela.application.config;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;
import javax.faces.annotation.FacesConfig.Version;
@FacesConfig( version = Version.JSF_2_3) //faz o jsf usar a função descrita
@ApplicationScoped //fica funcionando enquanto o servidor estiver em uso
public class Config {

}
