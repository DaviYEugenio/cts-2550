package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class ExcluirEvento {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// ExcluirEvento
public static Var ExcluindoEvento() throws Exception {
 return new Callable<Var>() {

   private Var evento = Var.VAR_NULL;

   public Var call() throws Exception {

    evento =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("vars.excluirevento"));

    cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"), evento);

    cronapi.database.Operations.execute(Var.valueOf("app.entity.Agenda"), Var.valueOf("delete from Agenda where titulo = :titulo"),Var.valueOf("titulo",evento));
    return Var.VAR_NULL;
   }
 }.call();
}

}

