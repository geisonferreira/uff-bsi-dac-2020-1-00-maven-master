package persistencia;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import persistencia.EVENTO;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-03-15T13:25:31")
@StaticMetamodel(EDICAO.class)
public class EDICAO_ { 

    public static volatile SingularAttribute<EDICAO, String> DATAFIM;
    public static volatile SingularAttribute<EDICAO, String> ANO;
    public static volatile SingularAttribute<EDICAO, EVENTO> evento;
    public static volatile SingularAttribute<EDICAO, String> DATAINICIO;
    public static volatile SingularAttribute<EDICAO, String> NUMERO;
    public static volatile SingularAttribute<EDICAO, Long> id;
    public static volatile SingularAttribute<EDICAO, String> CIDADE;
    public static volatile SingularAttribute<EDICAO, String> PAIS;

}