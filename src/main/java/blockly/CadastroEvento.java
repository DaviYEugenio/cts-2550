package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class CadastroEvento {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// CadastroEvento
public static Var EventoMedico() throws Exception {
 return new Callable<Var>() {

   private Var idmedico = Var.VAR_NULL;
   private Var titulo = Var.VAR_NULL;
   private Var inicio = Var.VAR_NULL;
   private Var fim = Var.VAR_NULL;
   private Var eventodiainteiro = Var.VAR_NULL;
   private Var repetir = Var.VAR_NULL;
   private Var descricao = Var.VAR_NULL;

   public Var call() throws Exception {

    idmedico =
    cronapi.util.Operations.generateUUID();

    titulo =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("vars.titulo"));

    inicio =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("vars.inicio"));

    fim =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("vars.fim"));

    eventodiainteiro =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("vars.evento"));

    repetir =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("vars.repetir"));

    descricao =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("vars.descricao"));

    cronapi.database.Operations.insert(Var.valueOf("app.entity.Agenda"),Var.valueOf("dataEHoraDoFimDoEvento",fim),Var.valueOf("dataEHoraDeInicioDoEvento",inicio),Var.valueOf("titulo",titulo),Var.valueOf("eventosDeDiaInteiro",eventodiainteiro),Var.valueOf("id",idmedico),Var.valueOf("descricaoDoEvento",descricao),Var.valueOf("user",
    cronapi.list.Operations.getFirst((
    cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select u.id from User u where u.userName = :userName"),Var.valueOf("userName",
    cronapi.util.Operations.getCurrentUserName()))))));
    return Var.VAR_NULL;
   }
 }.call();
}

}

