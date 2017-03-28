package ucuenca.registrocapacitaciones;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class informe implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "INFORME_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(name = "INFORME_ID_GENERATOR", sequenceName = "INFORME_ID_SEQ")
   private java.lang.Long id;

   private java.lang.String cargo;

   private java.lang.String dependencia;

   @org.kie.api.definition.type.Label(value = "Elaborado por")
   private java.lang.String elaborado;

   @javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.EAGER, cascade = { javax.persistence.CascadeType.ALL })
   @org.kie.api.definition.type.Label(value = "Evento")
   private ucuenca.registrocapacitaciones.evento evento;

   private java.util.Date fecha;

   public informe()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.lang.String getCargo()
   {
      return this.cargo;
   }

   public void setCargo(java.lang.String cargo)
   {
      this.cargo = cargo;
   }

   public java.lang.String getDependencia()
   {
      return this.dependencia;
   }

   public void setDependencia(java.lang.String dependencia)
   {
      this.dependencia = dependencia;
   }

   public java.lang.String getElaborado()
   {
      return this.elaborado;
   }

   public void setElaborado(java.lang.String elaborado)
   {
      this.elaborado = elaborado;
   }

   public ucuenca.registrocapacitaciones.evento getEvento()
   {
      return this.evento;
   }

   public void setEvento(ucuenca.registrocapacitaciones.evento evento)
   {
      this.evento = evento;
   }

   public java.util.Date getFecha()
   {
      return this.fecha;
   }

   public void setFecha(java.util.Date fecha)
   {
      this.fecha = fecha;
   }

   public informe(java.lang.Long id, java.lang.String cargo,
         java.lang.String dependencia, java.lang.String elaborado,
         ucuenca.registrocapacitaciones.evento evento, java.util.Date fecha)
   {
      this.id = id;
      this.cargo = cargo;
      this.dependencia = dependencia;
      this.elaborado = elaborado;
      this.evento = evento;
      this.fecha = fecha;
   }

}