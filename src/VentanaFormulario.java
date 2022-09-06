import java.awt.Color;
import java.io.File;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miguel
 */
public class VentanaFormulario extends javax.swing.JFrame 
{
    DOM dom = new DOM();
    SAX sax = new SAX();
    JAXB jaxb = new JAXB();
    XPATH xpath = new XPATH();
    VentanaAñadir ventana = new VentanaAñadir(this, true);
    VentanaModificar ventana2 = new VentanaModificar(this, true);
    /**
     * Creates new form VentaPrincipal
     */
    public VentanaFormulario() 
    {
        initComponents();
        this.getContentPane().setBackground(new Color (235, 184, 255));
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/resources/xml.png")).getImage());
        deshabilitarBotones(false);//deshabilito los botones al inicio
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser = new javax.swing.JFileChooser();
        jMenuItem1 = new javax.swing.JMenuItem();
        grupoBotones = new javax.swing.ButtonGroup();
        TextoMensaje = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        CuadroTexto = new javax.swing.JTextArea();
        BotonMostrar = new javax.swing.JButton();
        TextoConsulta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CuadroTexto2 = new javax.swing.JTextArea();
        BotonEjecutar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Opcion1 = new javax.swing.JRadioButton();
        Opcion2 = new javax.swing.JRadioButton();
        Opcion3 = new javax.swing.JRadioButton();
        Opcion4 = new javax.swing.JRadioButton();
        Opcion5 = new javax.swing.JRadioButton();
        Opcion6 = new javax.swing.JRadioButton();
        Opcion7 = new javax.swing.JRadioButton();
        respuestaPelicula = new javax.swing.JTextField();
        opcionesBusqueda = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        opcionesAtributo = new javax.swing.JComboBox<>();
        BotonLimpiar = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        BotonNuevo = new javax.swing.JMenuItem();
        BotonAbrir = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        BotonBuscador = new javax.swing.JMenuItem();
        BotonAñadir = new javax.swing.JMenuItem();

        jFileChooser.setCurrentDirectory(new java.io.File("C:\\"));

            jMenuItem1.setText("jMenuItem1");

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setBackground(new java.awt.Color(204, 153, 255));
            setResizable(false);

            TextoMensaje.setBackground(new java.awt.Color(204, 153, 255));
            TextoMensaje.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            TextoMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            TextoMensaje.setText("<Fichero XML no seleccionado>");
            TextoMensaje.setOpaque(true);

            CuadroTexto.setEditable(false);
            CuadroTexto.setColumns(20);
            CuadroTexto.setFont(new java.awt.Font("Monospaced", 0, 10)); // NOI18N
            CuadroTexto.setLineWrap(true);
            CuadroTexto.setRows(5);
            CuadroTexto.setMargin(new java.awt.Insets(5, 5, 5, 5));
            jScrollPane.setViewportView(CuadroTexto);

            BotonMostrar.setBackground(new java.awt.Color(204, 110, 253));
            BotonMostrar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
            BotonMostrar.setText("Mostrar Contenido");
            BotonMostrar.setFocusPainted(false);
            BotonMostrar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    BotonMostrarActionPerformed(evt);
                }
            });

            TextoConsulta.setBackground(new java.awt.Color(204, 153, 255));
            TextoConsulta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            TextoConsulta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            TextoConsulta.setText("Escriba la consulta aquí");
            TextoConsulta.setOpaque(true);

            CuadroTexto2.setColumns(20);
            CuadroTexto2.setRows(3);
            jScrollPane1.setViewportView(CuadroTexto2);

            BotonEjecutar.setBackground(new java.awt.Color(204, 110, 253));
            BotonEjecutar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            BotonEjecutar.setText("Ejecutar");
            BotonEjecutar.setFocusPainted(false);
            BotonEjecutar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    BotonEjecutarActionPerformed(evt);
                }
            });

            jPanel1.setBackground(new java.awt.Color(204, 153, 255));

            Opcion1.setBackground(new java.awt.Color(204, 153, 255));
            grupoBotones.add(Opcion1);
            Opcion1.setText("Título");

            Opcion2.setBackground(new java.awt.Color(204, 153, 255));
            grupoBotones.add(Opcion2);
            Opcion2.setText("Año Estreno");

            Opcion3.setBackground(new java.awt.Color(204, 153, 255));
            grupoBotones.add(Opcion3);
            Opcion3.setText("País");

            Opcion4.setBackground(new java.awt.Color(204, 153, 255));
            grupoBotones.add(Opcion4);
            Opcion4.setText("Reparto");
            Opcion4.setToolTipText("");

            Opcion5.setBackground(new java.awt.Color(204, 153, 255));
            grupoBotones.add(Opcion5);
            Opcion5.setText("Géneros");

            Opcion6.setBackground(new java.awt.Color(204, 153, 255));
            grupoBotones.add(Opcion6);
            Opcion6.setText("Director");

            Opcion7.setBackground(new java.awt.Color(204, 153, 255));
            grupoBotones.add(Opcion7);
            Opcion7.setText("Pelicula");

            respuestaPelicula.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

            opcionesBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Título", "Director", "Género", "Actor", "Compositor", "Año Estreno", "País Origen", "Edad Director" }));

            jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            jLabel1.setText("Buscar por:");

            opcionesAtributo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            opcionesAtributo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=", "<", ">" }));

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Opcion2)
                                .addComponent(Opcion1)
                                .addComponent(Opcion3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Opcion4)
                                .addComponent(Opcion5)
                                .addComponent(Opcion6))
                            .addGap(40, 40, 40))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Opcion7)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(jLabel1)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(opcionesBusqueda, 0, 110, Short.MAX_VALUE)
                                .addComponent(respuestaPelicula))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(opcionesAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Opcion4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Opcion1, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Opcion2)
                        .addComponent(Opcion5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Opcion6)
                        .addComponent(Opcion3))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Opcion7)
                        .addComponent(respuestaPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(opcionesBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(opcionesAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(36, 36, 36))
            );

            BotonLimpiar.setBackground(new java.awt.Color(204, 110, 253));
            BotonLimpiar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            BotonLimpiar.setText("Limpiar");
            BotonLimpiar.setFocusPainted(false);
            BotonLimpiar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    BotonLimpiarActionPerformed(evt);
                }
            });

            jMenuBar.setBackground(new java.awt.Color(204, 110, 253));

            jMenu.setBackground(new java.awt.Color(204, 110, 253));
            jMenu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
            jMenu.setText("Ficheros XML");
            jMenu.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
            jMenu.setOpaque(true);

            BotonNuevo.setBackground(new java.awt.Color(204, 110, 253));
            BotonNuevo.setText("Nuevo");
            BotonNuevo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
            BotonNuevo.setOpaque(true);
            BotonNuevo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    BotonNuevoActionPerformed(evt);
                }
            });
            jMenu.add(BotonNuevo);

            BotonAbrir.setBackground(new java.awt.Color(204, 110, 253));
            BotonAbrir.setText("Abrir");
            BotonAbrir.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
            BotonAbrir.setOpaque(true);
            BotonAbrir.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    BotonAbrirActionPerformed(evt);
                }
            });
            jMenu.add(BotonAbrir);

            jMenuBar.add(jMenu);

            jMenu1.setBackground(new java.awt.Color(204, 110, 253));
            jMenu1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
            jMenu1.setText("Edición");
            jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
            jMenu1.setOpaque(true);

            BotonBuscador.setBackground(new java.awt.Color(204, 110, 253));
            BotonBuscador.setText("Buscador");
            BotonBuscador.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
            BotonBuscador.setOpaque(true);
            BotonBuscador.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    BotonBuscadorActionPerformed(evt);
                }
            });
            jMenu1.add(BotonBuscador);

            BotonAñadir.setBackground(new java.awt.Color(204, 110, 253));
            BotonAñadir.setText("Añadir");
            BotonAñadir.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
            BotonAñadir.setOpaque(true);
            BotonAñadir.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    BotonAñadirActionPerformed(evt);
                }
            });
            jMenu1.add(BotonAñadir);

            jMenuBar.add(jMenu1);

            setJMenuBar(jMenuBar);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BotonMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TextoMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TextoConsulta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addComponent(BotonEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(BotonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TextoMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(4, 4, 4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(BotonMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BotonEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BotonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(26, 26, 26)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 178, Short.MAX_VALUE)))
                    .addContainerGap())
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void BotonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNuevoActionPerformed
        //Con este botón se reinicia el estado de la app
        deshabilitarBotones(false);
        CuadroTexto.setText("");
        TextoMensaje.setText("<Fichero XML no seleccionado>");
        this.setTitle("");
        deshabilitarBotones(false);
        BotonMostrar.setText("Mostrar Contenido");
        BotonLimpiarActionPerformed(evt);
    }//GEN-LAST:event_BotonNuevoActionPerformed

    private void BotonBuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscadorActionPerformed
        //Este botón abre un buscador con el que poniendo el título del libro que queramos modificar se nos abrirá una ventana para hacerlo
        String identificador = "";
        identificador = JOptionPane.showInputDialog(CuadroTexto, "Introduce el título de la película", "");
        if(identificador!=null && !identificador.equals(""))
        {
            if(jaxb.compruebaTitulo(identificador)==0)
            {
                ventana2.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "La busqueda es erronea", "", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_BotonBuscadorActionPerformed

    private void BotonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMostrarActionPerformed
        asignaTexto();
    }//GEN-LAST:event_BotonMostrarActionPerformed

    private void BotonAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAbrirActionPerformed
        //Con este método comprobamos si se puede abrir el archivo, y lo dejamos todo listo para abrirlo.
        File ficheroXML = seleccionarFichero();//La ruta del archivo que queramos abrir
        if(ficheroXML==null)
        {
            TextoMensaje.setText("Vuelve a elegir el fichero XML");
        }
        else
        {
            if(sax.abrirSAX(ficheroXML)==-1 || dom.abrirDOM(ficheroXML)==-1 || jaxb.abrirJAXB(ficheroXML)==-1 || xpath.EjecutaXPath(ficheroXML, "//Pelicula").equals("Error"))
            {
                TextoMensaje.setText("Error el archivo no se ha abierto correctamente");
            }
            else
            {
                TextoMensaje.setText("El archivo se ha abierto correctamente");
                deshabilitarBotones(true);
                this.setTitle(ficheroXML.getName());
                BotonMostrar.setText("Mostrar Contenido");
            }
        }
    }//GEN-LAST:event_BotonAbrirActionPerformed

    private void BotonEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEjecutarActionPerformed
        //Con este botón ejecutamos la consulta que proporcione el usuario o una predefinida
        try
        {
            String consulta = CuadroTexto2.getText();
            String botonElegido = getSelectedButtonText(grupoBotones);
            if(consulta.equals(""))
            {
                switch(botonElegido)//Dependiendo del botón seleccionado se hará una consulta u otra
                {
                    case ("Título"):
                        consulta="//Titulo";
                        break;
                    case("Reparto"):
                        consulta="//Reparto";
                        break;
                    case("Año Estreno"):
                        consulta="//@año_estreno";
                        break;
                    case("Géneros"):
                        consulta="//Generos";
                        break;
                    case("País"):
                        consulta="//@pais_origen";
                        break;
                    case("Director"):
                        consulta="//Director";
                        break;
                    case("Pelicula"):
                        if(respuestaPelicula.getText().equals(""))
                        {
                            consulta="//Pelicula";
                            break;
                        }
                        else
                        {
                            String opcionElegida = opcionesBusqueda.getSelectedItem().toString();
                            switch(opcionElegida)//Dependiendo del valor por el que quiera buscar una película el usuario se realizará una consulta u otra
                            {
                                case("Título"):
                                {
                                    consulta="/Peliculas/Pelicula[./Titulo='" + respuestaPelicula.getText() + "']"; 
                                    break;
                                }
                                case("Director"):
                                {
                                    consulta="/Peliculas/Pelicula[./Director='" + respuestaPelicula.getText() + "']"; 
                                    break;
                                }
                                case("Género"):
                                {
                                    consulta="/Peliculas/Pelicula[./Generos/Genero='" + respuestaPelicula.getText() + "']"; 
                                    break;
                                }
                                case("Actor"):
                                {
                                    consulta="/Peliculas/Pelicula[./Reparto/Actor='" + respuestaPelicula.getText() + "']"; 
                                    break;
                                }
                                case("Compositor"):
                                {
                                    consulta="/Peliculas/Pelicula[./Reparto/Compositor='" + respuestaPelicula.getText() + "']"; 
                                    break;
                                }
                                case("Año Estreno"):
                                {
                                    consulta = consultarAtributo("@año_estreno"); 
                                    break;
                                }
                                case("País Origen"):
                                    consulta = "/Peliculas/Pelicula[./@pais_origen='" + respuestaPelicula.getText() + "']";
                                    break;
                                case("Edad Director"):
                                {
                                    consulta = consultarAtributo("/Director/@edad"); 
                                    break;
                                }
                            }
                            
                        }
                        break;
                }
            }
            CuadroTexto.setText(xpath.recogeConsulta(consulta));//Las consultas por texto tienen prioridad
        }
        catch(NullPointerException e)
        {
            JOptionPane.showMessageDialog(null, "La consulta realizada es incorrecta", "", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BotonEjecutarActionPerformed

    private void BotonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAñadirActionPerformed
        //Botón que abre la ventana para añadir una nueva película
        ventana.setVisible(true);
    }//GEN-LAST:event_BotonAñadirActionPerformed

    private void BotonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLimpiarActionPerformed
        //Con este botón limpiamos el texto de la consulta y deseleccionamos las consultas predefinidas
        CuadroTexto2.setText("");
        grupoBotones.clearSelection();
        respuestaPelicula.setText("");
        opcionesAtributo.setSelectedItem("=");
        opcionesBusqueda.setSelectedItem("Título");
    }//GEN-LAST:event_BotonLimpiarActionPerformed
    
    public String consultarAtributo(String consulta)//Método con el cual podremos hacer diferentes consultas de atributos con valores numericos
    {
        String opcionAtributo = opcionesAtributo.getSelectedItem().toString();
        String salida = "";
        switch(opcionAtributo)
        {
            case("="):
                salida = "/Peliculas/Pelicula[./" + consulta + "='" + respuestaPelicula.getText() + "']";
                break;
            case("<"): case(">"):
                salida = "/Peliculas/Pelicula[./" + consulta + opcionAtributo + respuestaPelicula.getText() + "]"; 
                break;        
        }
        return salida;
    }
    
    public void asignaTexto()//Con este método mostramos por pantalla el SAX
    {
        jaxb.cambioJAXB();
        CuadroTexto.setText(sax.recorrerSAX());
    }
    
    public File seleccionarFichero()//Método usado para que el usuario pueda elegir la ruta del archivo para abrirlo
    {
        File file = null;
        int respuesta = jFileChooser.showOpenDialog(this); 
        if(respuesta == JFileChooser.APPROVE_OPTION)
        {
            file = jFileChooser.getSelectedFile();
        }   
        return file;
    }
    
    public String getSelectedButtonText(ButtonGroup buttonGroup) //Método usado para obtener el texto de un boton seleccionado y así poder diferenciarlo
    {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) 
        {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) 
            {
                return button.getText();
            }
        }
        return null;
    }
    
    public void deshabilitarBotones(Boolean b)//Método que deshabilita o habilita todos los botones de la app.
    {
        BotonMostrar.setEnabled(b);
        BotonLimpiar.setEnabled(b);
        BotonBuscador.setEnabled(b);
        BotonAñadir.setEnabled(b);
        BotonEjecutar.setEnabled(b);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaFormulario().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BotonAbrir;
    private javax.swing.JMenuItem BotonAñadir;
    private javax.swing.JMenuItem BotonBuscador;
    private javax.swing.JButton BotonEjecutar;
    private javax.swing.JButton BotonLimpiar;
    private javax.swing.JButton BotonMostrar;
    private javax.swing.JMenuItem BotonNuevo;
    private javax.swing.JTextArea CuadroTexto;
    private javax.swing.JTextArea CuadroTexto2;
    private javax.swing.JRadioButton Opcion1;
    private javax.swing.JRadioButton Opcion2;
    private javax.swing.JRadioButton Opcion3;
    private javax.swing.JRadioButton Opcion4;
    private javax.swing.JRadioButton Opcion5;
    private javax.swing.JRadioButton Opcion6;
    private javax.swing.JRadioButton Opcion7;
    private javax.swing.JLabel TextoConsulta;
    private javax.swing.JLabel TextoMensaje;
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.JFileChooser jFileChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> opcionesAtributo;
    private javax.swing.JComboBox<String> opcionesBusqueda;
    private javax.swing.JTextField respuestaPelicula;
    // End of variables declaration//GEN-END:variables
}
