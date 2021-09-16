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

   private Var listaEventos = Var.VAR_NULL;

   public Var call() throws Exception {

    listaEventos =
    cronapi.list.Operations.newList(
    cronapi.database.Operations.query(Var.valueOf("app.entity.Agenda"),Var.valueOf("select a from Agenda a where a.id IS NOT NULL")));

    System.out.println(listaEventos.getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

}

