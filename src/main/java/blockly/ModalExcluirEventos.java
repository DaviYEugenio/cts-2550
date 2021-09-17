package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class ModalExcluirEventos {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// ModalExxcluirEventos
public static Var Abrir() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.showModal"),
    Var.valueOf("ExcluirEvento"));
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 */
// Descreva esta função...
public static void Fechar() throws Exception {
  new Callable<Var>() {

   public Var call() throws Exception {

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.hideModal"),
    Var.valueOf("ExcluirEvento"));
   return Var.VAR_NULL;
   }
 }.call();
}

}

