import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;
import java.security.SecureRandom;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("passapplet!passwordapp_de")
public class passwordapp_de extends Applet implements ActionListener, KeyListener, TextListener, Runnable {
   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "allowedlist",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] allowedlist = new String[]{"http://recovery_questions.runescape.com/", "http://webtestwip1.runescape.com:16304/", "http://webtestrc1.runescape.com:16304/", "http://local.runescape.com:16304/"};
   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "codebase",
      descriptor = "Ljava/lang/String;"
   )
   private String codebase;
   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "question",
      descriptor = "[Ljava/awt/TextField;"
   )
   private TextField[] question = new TextField[5];
   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "recov",
      descriptor = "[Ljava/awt/TextField;"
   )
   private TextField[] recov = new TextField[5];
   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "norecovcheck",
      descriptor = "Ljava/awt/Checkbox;"
   )
   private Checkbox norecovcheck;
   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "password1",
      descriptor = "Ljava/awt/TextField;"
   )
   private TextField password1;
   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "key_e",
      descriptor = "Ljava/math/BigInteger;"
   )
   private BigInteger key_e = new BigInteger("78609176622342907144495556282156869501821674615375259616632158913026262002609");
   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "key_n",
      descriptor = "Ljava/math/BigInteger;"
   )
   private BigInteger key_n = new BigInteger("8520946092827349680104442275636555624577884266514482949166183637641027716807216207253679971387983199046976999249798814352350744205728948100629864118760909");
   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "onreversepath",
      descriptor = "Z"
   )
   private boolean onreversepath;
   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "hidepanel",
      descriptor = "Ljava/awt/Panel;"
   )
   private Panel hidepanel;
   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "showpanel",
      descriptor = "Ljava/awt/Panel;"
   )
   private Panel showpanel;
   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "PROTOCOL_VERSION",
      descriptor = "I"
   )
   private static final int PROTOCOL_VERSION = 2;
   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "TYPE_CHANGEQUESTIONS",
      descriptor = "I"
   )
   private static final int TYPE_CHANGEQUESTIONS = 2;
   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "TYPE_DEBUG",
      descriptor = "I"
   )
   private static final int TYPE_DEBUG = 4;
   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "type",
      descriptor = "I"
   )
   private int type;
   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "username",
      descriptor = "Ljava/lang/String;"
   )
   private String username;
   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "uid",
      descriptor = "I"
   )
   private int uid;
   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "processingpage",
      descriptor = "Ljava/awt/Panel;"
   )
   private Panel processingpage;
   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "system_error_page",
      descriptor = "Ljava/awt/Panel;"
   )
   private Panel system_error_page;
   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "blocked_query_page",
      descriptor = "Ljava/awt/Panel;"
   )
   private Panel blocked_query_page;
   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "blocked_attack_page",
      descriptor = "Ljava/awt/Panel;"
   )
   private Panel blocked_attack_page;
   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "wrongpassword_page",
      descriptor = "Ljava/awt/Panel;"
   )
   private Panel wrongpassword_page;
   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "change_questions_success_page_active",
      descriptor = "Ljava/awt/Panel;"
   )
   private Panel change_questions_success_page_active;
   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "change_questions_success_page_pending",
      descriptor = "Ljava/awt/Panel;"
   )
   private Panel change_questions_success_page_pending;
   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "change_questions_tooshort_page",
      descriptor = "Ljava/awt/Panel;"
   )
   private Panel change_questions_tooshort_page;
   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "change_questions_samequestions_page",
      descriptor = "Ljava/awt/Panel;"
   )
   private Panel change_questions_samequestions_page;
   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "change_questions_sameanswers_page",
      descriptor = "Ljava/awt/Panel;"
   )
   private Panel change_questions_sameanswers_page;
   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "change_questions_qandamatch_page",
      descriptor = "Ljava/awt/Panel;"
   )
   private Panel change_questions_qandamatch_page;
   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "change_questions_page",
      descriptor = "Ljava/awt/Panel;"
   )
   private Panel change_questions_page;
   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "example_questions",
      descriptor = "[Ljava/lang/String;"
   )
   private String[] example_questions = new String[]{"Wo wurden Sie geboren?", "Wie hieß Ihr erster Lehrer (Nachname)?", "Welchen 2. Vornamen hat Ihr Vater?", "Welchen 2. Vornamen hat Ihre Mutter?", "Wie hieß Ihr erster bester Freund?", "Wie heißt Ihr Lieblingsurlaubsort?", "Wie hieß Ihr erstes Haustier?", "Wie lautet der Name Ihrer ersten Schule?", "Wie lautet der Mädchenname Ihrer Mutter?", "Wie hieß Ihr(e) erste(r) Freund(in)?", "Wer ist Ihr/e Lieblingsschauspieler/in?", "Wer ist Ihr/e Lieblingsautor/in?", "Wer ist Ihr/e Lieblingsmusiker/in?", "Wer ist Ihre Lieblingscomicfigur?", "Wie heißt Ihr Lieblingsbuch?", "Was ist Ihr Leibgericht?", "Wie heißt Ihr Lieblingsfilm?"};
   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "initialised",
      descriptor = "Z"
   )
   public boolean initialised = false;
   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "debug_panel",
      descriptor = "I"
   )
   private int debug_panel;

   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "init",
      descriptor = "()V",
      line = 68
   )
   public void init() {
      System.out.println("Version: 3 DE");
      Thread var1 = new Thread(this);
      var1.setDaemon(true);
      var1.start();
   }

   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "init_messages",
      descriptor = "()V",
      line = 75
   )
   private void init_messages() {
      this.processingpage = new Panel((LayoutManager)null);
      this.processingpage.setSize(this.getSize());
      Label var1 = this.getLabel("Ihre Anfrage wird bearbeitet.", 180, this.getSize().height / 2 - 10);
      var1.setFont(new Font("Arial", 1, 13));
      this.processingpage.add(var1);
      this.processingpage.setVisible(false);
      this.add(this.processingpage);
      this.change_questions_success_page_active = new Panel((LayoutManager)null);
      this.change_questions_success_page_active.setSize(this.getSize());
      this.change_questions_success_page_active.add(this.getLabel("Ihre Sicherheitsfragen und -antworten sind auf dem neuesten", 30, this.getSize().height / 2 - 10));
      this.change_questions_success_page_active.add(this.getLabel("Stand und aktiviert worden. ", 30, this.getSize().height / 2 + 10));
      this.change_questions_success_page_active.setVisible(false);
      this.add(this.change_questions_success_page_active);
      this.change_questions_success_page_pending = new Panel((LayoutManager)null);
      this.change_questions_success_page_pending.setSize(this.getSize());
      this.change_questions_success_page_pending.add(this.getLabel("Ihre Sicherheitsfragen und -antworten sind eingestellt worden.", 30, this.getSize().height / 2 - 10));
      this.change_questions_success_page_pending.add(this.getLabel("In 14 Tagen werden sie aktiviert.", 30, this.getSize().height / 2 + 10));
      this.change_questions_success_page_pending.setVisible(false);
      this.add(this.change_questions_success_page_pending);
      int var2 = this.getSize().height / 2 - 50;
      this.system_error_page = new Panel((LayoutManager)null);
      this.system_error_page.setSize(this.getSize());
      Label var4 = this.getLabel("Bei der Bearbeitung Ihrer Anfrage ist ein Fehler aufgetreten.", 55, var2);
      var4.setFont(new Font("Arial", 1, 13));
      this.system_error_page.add(var4);
      this.system_error_page.add(this.getLabel("Leider ist bei der Bearbeitung Ihrer Anfrage ein Fehler aufgetreten.", 55, var2 + 30));
      this.system_error_page.add(this.getLabel("Bitte versuchen Sie es später noch einmal.", 130, var2 + 50));
      Button var3 = new Button("Gehen Sie zurück und versuchen Sie es erneut.");
      var3.setBounds(110, var2 + 80, 300, 22);
      var3.addActionListener(this);
      this.system_error_page.add(var3);
      this.system_error_page.setVisible(false);
      this.add(this.system_error_page);
      this.blocked_query_page = new Panel((LayoutManager)null);
      this.blocked_query_page.setSize(this.getSize());
      this.blocked_query_page.add(this.getLabel("Aufgrund vermehrter Probleme mit diesem Spielkonto ist es nicht mehr", 80, this.getSize().height / 2 - 20));
      this.blocked_query_page.add(this.getLabel("möglich, Passwort-Anfragen für dieses Spielkonto zu bearbeiten.", 95, this.getSize().height / 2));
      this.blocked_query_page.setVisible(false);
      this.add(this.blocked_query_page);
      this.blocked_attack_page = new Panel((LayoutManager)null);
      this.blocked_attack_page.setSize(this.getSize());
      this.blocked_attack_page.add(this.getLabel("Aufgrund wiederholter Versuche von Ihrer IP-Adresse, das Passwort", 80, this.getSize().height / 2 - 40));
      this.blocked_attack_page.add(this.getLabel("dieses Spielkontos zu ändern, wurde Ihre Anfrage abgelehnt.", 100, this.getSize().height / 2 - 20));
      this.blocked_attack_page.add(this.getLabel("Bitte versuchen Sie es später noch einmal.", 150, this.getSize().height / 2));
      this.blocked_attack_page.setVisible(false);
      this.add(this.blocked_attack_page);
      int var5 = this.getSize().height / 2 - 20;
      this.wrongpassword_page = new Panel((LayoutManager)null);
      this.wrongpassword_page.setSize(this.getSize());
      this.wrongpassword_page.add(this.getLabel("Sie haben Ihr derzeitiges Passwort falsch eingegeben.", 90, var5));
      this.wrongpassword_page.setVisible(false);
      Button var6 = new Button("Zurück");
      var6.setBounds(150, var5 + 30, 200, 22);
      var6.addActionListener(this);
      this.wrongpassword_page.add(var6);
      this.add(this.wrongpassword_page);
      this.change_questions_tooshort_page = new Panel((LayoutManager)null);
      this.change_questions_tooshort_page.setSize(this.getSize());
      this.change_questions_tooshort_page.add(this.getLabel("Eine oder mehrere Ihrer Fragen oder Antworten", 110, 200));
      this.change_questions_tooshort_page.add(this.getLabel("waren zu kurz oder nicht vorhanden.", 145, 220));
      this.change_questions_tooshort_page.setVisible(false);
      Button var7 = new Button("Zurück");
      var7.setBounds(150, 250, 200, 22);
      var7.addActionListener(this);
      this.change_questions_tooshort_page.add(var7);
      this.add(this.change_questions_tooshort_page);
      this.change_questions_samequestions_page = new Panel((LayoutManager)null);
      this.change_questions_samequestions_page.setSize(this.getSize());
      this.change_questions_samequestions_page.add(this.getLabel("Zwei oder mehr der von Ihnen eingestellten Fragen waren", 80, 200));
      this.change_questions_samequestions_page.add(this.getLabel("identisch. Bitte wählen Sie unterschiedliche Fragen.", 100, 220));
      this.change_questions_samequestions_page.setVisible(false);
      Button var8 = new Button("Zurück");
      var8.setBounds(150, 250, 200, 22);
      var8.addActionListener(this);
      this.change_questions_samequestions_page.add(var8);
      this.add(this.change_questions_samequestions_page);
      this.change_questions_sameanswers_page = new Panel((LayoutManager)null);
      this.change_questions_sameanswers_page.setSize(this.getSize());
      this.change_questions_sameanswers_page.add(this.getLabel("Zwei oder mehr der von Ihnen eingetragenen Antworten waren", 70, 200));
      this.change_questions_sameanswers_page.add(this.getLabel("identisch. Bitte wählen Sie unterschiedliche Antworten.", 90, 220));
      this.change_questions_sameanswers_page.setVisible(false);
      Button var9 = new Button("Zurück");
      var9.setBounds(150, 250, 200, 22);
      var9.addActionListener(this);
      this.change_questions_sameanswers_page.add(var9);
      this.add(this.change_questions_sameanswers_page);
      this.change_questions_qandamatch_page = new Panel((LayoutManager)null);
      this.change_questions_qandamatch_page.setSize(this.getSize());
      this.change_questions_qandamatch_page.add(this.getLabel("Eine oder mehrere Ihrer Fragen hat den gleichen Wortlaut", 120, 200));
      this.change_questions_qandamatch_page.add(this.getLabel("wie eine der Antworten, die Sie angegeben haben.", 130, 220));
      this.change_questions_qandamatch_page.add(this.getLabel("Bitte achten Sie darauf, dass die die Antworten", 130, 240));
      this.change_questions_qandamatch_page.add(this.getLabel("nicht genauso wie die Fragen lauten.", 130, 260));
      this.change_questions_qandamatch_page.setVisible(false);
      Button var10 = new Button("Zurück");
      var10.setBounds(150, 290, 200, 22);
      var10.addActionListener(this);
      this.change_questions_qandamatch_page.add(var10);
      this.add(this.change_questions_qandamatch_page);
   }

   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "init_change_questions",
      descriptor = "()V",
      line = 196
   )
   private void init_change_questions() {
      this.change_questions_page = new Panel((LayoutManager)null);
      byte var1 = 100;
      this.password1 = this.getTextField(20, 150, 0, 150, 20, true);
      this.question[0] = this.getTextField(40, var1, 70, 250, 20, false);
      this.question[0].setText(this.example_questions[0]);
      this.recov[0] = this.getTextField(40, var1, 100, 250, 20, true);
      this.question[1] = this.getTextField(40, var1, 170, 250, 20, false);
      this.question[1].setText(this.example_questions[1]);
      this.recov[1] = this.getTextField(40, var1, 200, 250, 20, true);
      this.question[2] = this.getTextField(40, var1, 270, 250, 20, false);
      this.question[2].setText(this.example_questions[2]);
      this.recov[2] = this.getTextField(40, var1, 300, 250, 20, true);
      this.question[3] = this.getTextField(40, var1, 370, 250, 20, false);
      this.question[3].setText(this.example_questions[3]);
      this.recov[3] = this.getTextField(40, var1, 400, 250, 20, true);
      this.question[4] = this.getTextField(40, var1, 470, 250, 20, false);
      this.question[4].setText(this.example_questions[4]);
      this.recov[4] = this.getTextField(40, var1, 500, 250, 20, true);
      this.change_questions_page.setBackground(Color.black);
      this.change_questions_page.add(this.getLabel("Momentanes Passwort:", 0, 0, 150, 20));
      this.change_questions_page.add(this.password1);
      Label var2 = this.getLabel("Sicherheitsfrage 1", 0, 40);
      var2.setFont(new Font("Arial", 1, 13));
      this.change_questions_page.add(var2);
      this.change_questions_page.add(this.getLabel("Frage:", 0, 70, 100, 20));
      this.change_questions_page.add(this.question[0]);
      Button var3 = new Button("Neue Frage:");
      var3.setActionCommand("NEWRQ1");
      var3.setBounds(360, 70, 140, 22);
      var3.addActionListener(this);
      this.change_questions_page.add(var3);
      this.change_questions_page.add(this.getLabel("Antwort:", 0, 100, 100, 20));
      this.change_questions_page.add(this.recov[0]);
      Label var5 = this.getLabel("Sicherheitsfrage 2", 0, 140);
      var5.setFont(new Font("Arial", 1, 13));
      this.change_questions_page.add(var5);
      this.change_questions_page.add(this.getLabel("Frage:", 0, 170, 100, 20));
      this.change_questions_page.add(this.question[1]);
      Button var8 = new Button("Neue Frage:");
      var8.setActionCommand("NEWRQ2");
      var8.setBounds(360, 170, 140, 22);
      var8.addActionListener(this);
      this.change_questions_page.add(var8);
      this.change_questions_page.add(this.getLabel("Antwort:", 0, 200, 100, 20));
      this.change_questions_page.add(this.recov[1]);
      Label var6 = this.getLabel("Sicherheitsfrage 3", 0, 240);
      var6.setFont(new Font("Arial", 1, 13));
      this.change_questions_page.add(var6);
      this.change_questions_page.add(this.getLabel("Frage:", 0, 270, 100, 20));
      this.change_questions_page.add(this.question[2]);
      Button var10 = new Button("Neue Frage:");
      var10.setActionCommand("NEWRQ3");
      var10.setBounds(360, 270, 140, 22);
      var10.addActionListener(this);
      this.change_questions_page.add(var10);
      this.change_questions_page.add(this.getLabel("Antwort:", 0, 300, 100, 20));
      this.change_questions_page.add(this.recov[2]);
      Label var7 = this.getLabel("Sicherheitsfrage 4", 0, 340);
      var7.setFont(new Font("Arial", 1, 13));
      this.change_questions_page.add(var7);
      this.change_questions_page.add(this.getLabel("Frage:", 0, 370, 100, 20));
      this.change_questions_page.add(this.question[3]);
      Button var11 = new Button("Neue Frage:");
      var11.setActionCommand("NEWRQ4");
      var11.setBounds(360, 370, 140, 22);
      var11.addActionListener(this);
      this.change_questions_page.add(var11);
      this.change_questions_page.add(this.getLabel("Antwort:", 0, 400, 100, 20));
      this.change_questions_page.add(this.recov[3]);
      Label var9 = this.getLabel("Sicherheitsfrage 5", 0, 440);
      var9.setFont(new Font("Arial", 1, 13));
      this.change_questions_page.add(var9);
      this.change_questions_page.add(this.getLabel("Frage:", 0, 470, 100, 20));
      this.change_questions_page.add(this.question[4]);
      Button var12 = new Button("Neue Frage:");
      var12.setActionCommand("NEWRQ5");
      var12.setBounds(360, 470, 140, 22);
      var12.addActionListener(this);
      this.change_questions_page.add(var12);
      this.change_questions_page.add(this.getLabel("Antwort:", 0, 500, 100, 20));
      this.change_questions_page.add(this.recov[4]);
      Button var4 = new Button("Abschicken");
      var4.setBounds(150, 540, 200, 22);
      var4.addActionListener(this);
      this.change_questions_page.add(var4);
      this.change_questions_page.setSize(this.getSize());
      this.add(this.change_questions_page);
   }

   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "getLabel",
      descriptor = "(Ljava/lang/String;II)Ljava/awt/Label;",
      line = 305
   )
   private Label getLabel(String arg0, int arg1, int arg2) {
      return this.getLabel(arg0, arg1, arg2, arg0.length() * 8, 20);
   }

   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "getLabel",
      descriptor = "(Ljava/lang/String;IIII)Ljava/awt/Label;",
      line = 312
   )
   private Label getLabel(String arg0, int arg1, int arg2, int arg3, int arg4) {
      Label var6 = new Label(arg0, 0);
      var6.setForeground(Color.white);
      var6.setBackground(Color.black);
      var6.setFont(new Font("Arial", 0, 13));
      var6.setBounds(arg1, arg2, arg3, arg4);
      return var6;
   }

   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "getTextField",
      descriptor = "(IIIIIZ)Ljava/awt/TextField;",
      line = 321
   )
   private TextField getTextField(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      TextField var7 = new TextField(arg0);
      var7.setBounds(arg1, arg2, arg3, arg4);
      if (arg5) {
         var7.setEchoChar('*');
      }

      var7.addTextListener(this);
      var7.addKeyListener(this);
      var7.setForeground(Color.black);
      var7.setBackground(Color.white);
      return var7;
   }

   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "safesizestring",
      descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
      line = 336
   )
   private String safesizestring(String arg0, int arg1) {
      String var3 = arg0.trim();
      return var3.length() > arg1 ? var3.substring(0, arg1) : var3;
   }

   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "tidyrecoveryanswer",
      descriptor = "(Ljava/lang/String;)Ljava/lang/String;",
      line = 345
   )
   public static String tidyrecoveryanswer(String arg0) {
      String var4 = arg0.toLowerCase();
      StringBuffer var1 = new StringBuffer();

      for(int var2 = 0; var2 < var4.length() && var2 < 50; ++var2) {
         char var3 = var4.charAt(var2);
         if (var3 >= 'a' && var3 <= 'z') {
            var1.append(var3);
         }

         if (var3 >= '0' && var3 <= '9') {
            var1.append(var3);
         }
      }

      return var1.toString();
   }

   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "urlencode",
      descriptor = "(Ljava/lang/String;)Ljava/lang/String;",
      line = 360
   )
   public static String urlencode(String arg0) {
      StringBuffer var1 = new StringBuffer(arg0.length());

      for(int var2 = 0; var2 < arg0.length(); ++var2) {
         char var3 = arg0.charAt(var2);
         if ((var3 < '0' || var3 > '9') && (var3 < 'a' || var3 > 'z') && (var3 < 'A' || var3 > 'Z')) {
            var1.append("%");
            int var4 = var3 >> 4 & 15;
            if (var4 >= 0 && var4 <= 9) {
               var1.append((char)(var4 + 48));
            } else if (var4 >= 10 && var4 <= 15) {
               var1.append((char)(var4 - 10 + 65));
            }

            var4 = var3 & 15;
            if (var4 >= 0 && var4 <= 9) {
               var1.append((char)(var4 + 48));
            } else if (var4 >= 10 && var4 <= 15) {
               var1.append((char)(var4 - 10 + 65));
            }
         } else {
            var1.append(var3);
         }
      }

      return var1.toString();
   }

   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "actionPerformed",
      descriptor = "(Ljava/awt/event/ActionEvent;)V",
      line = 383
   )
   public void actionPerformed(ActionEvent arg0) {
      if (this.onreversepath) {
         if (this.hidepanel != null) {
            this.hidepanel.setVisible(false);
            this.hidepanel = null;
         }

         if (this.showpanel != null) {
            this.showpanel.setVisible(true);
            this.showpanel = null;
         }

         this.onreversepath = false;
      } else {
         if (this.type == 2) {
            String var2 = arg0.getActionCommand();
            if (var2 != null && var2.startsWith("NEWRQ")) {
               String var10 = this.example_questions[(int)(Math.random() * (double)this.example_questions.length)];
               if (var2.equals("NEWRQ1")) {
                  this.question[0].setText(var10);
                  return;
               }

               if (var2.equals("NEWRQ2")) {
                  this.question[1].setText(var10);
                  return;
               }

               if (var2.equals("NEWRQ3")) {
                  this.question[2].setText(var10);
                  return;
               }

               if (var2.equals("NEWRQ4")) {
                  this.question[3].setText(var10);
                  return;
               }

               if (var2.equals("NEWRQ5")) {
                  this.question[4].setText(var10);
               }

               return;
            }

            this.change_questions_page.setVisible(false);
            if (this.password1.getText().length() < 1 || this.password1.getText().length() > 20) {
               this.wrongpassword_page.setVisible(true);
               this.onreversepath = true;
               this.showpanel = this.change_questions_page;
               this.hidepanel = this.wrongpassword_page;
               return;
            }

            int var3 = 0;

            label142:
            while(true) {
               if (var3 >= 5) {
                  int var6;
                  for(int var4 = 0; var4 < 5; ++var4) {
                     String var5 = this.question[var4].getText().trim();
                     if (!var5.equals("")) {
                        for(var6 = var4 + 1; var6 < 5; ++var6) {
                           if (var5.equalsIgnoreCase(this.question[var6].getText())) {
                              this.change_questions_samequestions_page.setVisible(true);
                              this.onreversepath = true;
                              this.showpanel = this.change_questions_page;
                              this.hidepanel = this.change_questions_samequestions_page;
                              return;
                           }
                        }
                     }
                  }

                  for(int var11 = 0; var11 < 5; ++var11) {
                     String var12 = tidyrecoveryanswer(this.recov[var11].getText()).trim();
                     if (!var12.equals("")) {
                        for(int var7 = var11 + 1; var7 < 5; ++var7) {
                           if (tidyrecoveryanswer(var12).equalsIgnoreCase(tidyrecoveryanswer(this.recov[var7].getText()))) {
                              this.change_questions_sameanswers_page.setVisible(true);
                              this.onreversepath = true;
                              this.showpanel = this.change_questions_page;
                              this.hidepanel = this.change_questions_sameanswers_page;
                              return;
                           }
                        }
                     }
                  }

                  var6 = 0;

                  while(true) {
                     if (var6 >= 5) {
                        break label142;
                     }

                     String var13 = tidyrecoveryanswer(this.recov[var6].getText()).trim();
                     if (!var13.equals("")) {
                        for(int var8 = 0; var8 < 5; ++var8) {
                           if (var13.equalsIgnoreCase(tidyrecoveryanswer(this.question[var8].getText()))) {
                              this.change_questions_qandamatch_page.setVisible(true);
                              this.onreversepath = true;
                              this.showpanel = this.change_questions_page;
                              this.hidepanel = this.change_questions_qandamatch_page;
                              return;
                           }
                        }
                     }

                     ++var6;
                  }
               }

               if (this.question[var3].getText().trim().length() < 3 || tidyrecoveryanswer(this.recov[var3].getText()).length() < 3) {
                  this.change_questions_tooshort_page.setVisible(true);
                  this.onreversepath = true;
                  this.showpanel = this.change_questions_page;
                  this.hidepanel = this.change_questions_tooshort_page;
                  return;
               }

               ++var3;
            }
         }

         this.processingpage.setVisible(true);
         Thread var9 = new Thread(this);
         var9.setDaemon(true);
         var9.start();
      }
   }

   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "run",
      descriptor = "()V",
      line = 497
   )
   public void run() {
      if (!this.initialised) {
         this.codebase = this.getCodeBase().toString();
         boolean var19 = false;

         for(int var20 = 0; var20 < allowedlist.length; ++var20) {
            if (this.codebase.startsWith(allowedlist[var20])) {
               var19 = true;
               break;
            }
         }

         if (!var19) {
            this.codebase = "http://recovery_questions.runescape.com/";
         }

         this.setLayout((LayoutManager)null);
         this.setBackground(Color.black);
         this.init_messages();
         this.type = Integer.parseInt(this.getParameter("type"));
         this.username = this.getParameter("username");
         this.uid = getuid(findcachedir());
         if (this.type == 2) {
            this.init_change_questions();
         } else {
            if (this.type != 4) {
               throw new RuntimeException("Not enough parameters");
            }

            this.init_change_questions();
            this.addKeyListener(this);
         }

         this.initialised = true;
      } else {
         SecureRandom var1 = new SecureRandom();
         int[] var2 = new int[4];

         for(int var3 = 0; var3 < var2.length; ++var3) {
            var2[var3] = var1.nextInt();
         }

         packet var4 = new packet(new byte[66]);
         var4.method1(1);

         for(int var5 = 0; var5 < var2.length; ++var5) {
            var4.method4(var2[var5]);
         }

         var4.rsaenc(this.key_e, this.key_n);
         int var6 = var4.pos;
         var4.pos = 0;
         String var7 = var4.g64encoded(var6);
         packet var8 = new packet(new byte[2048]);
         var8.method4(2);
         var8.pjstr(this.username);
         var8.method4(this.uid);
         if (this.type == 2) {
            var8.pjstr(this.safesizestring(this.password1.getText(), 20));
            var8.pjstr(this.safesizestring(this.question[0].getText(), 40));
            var8.pjstr(this.safesizestring(tidyrecoveryanswer(this.recov[0].getText()), 40));
            var8.pjstr(this.safesizestring(this.question[1].getText(), 40));
            var8.pjstr(this.safesizestring(tidyrecoveryanswer(this.recov[1].getText()), 40));
            var8.pjstr(this.safesizestring(this.question[2].getText(), 40));
            var8.pjstr(this.safesizestring(tidyrecoveryanswer(this.recov[2].getText()), 40));
            var8.pjstr(this.safesizestring(this.question[3].getText(), 40));
            var8.pjstr(this.safesizestring(tidyrecoveryanswer(this.recov[3].getText()), 40));
            var8.pjstr(this.safesizestring(this.question[4].getText(), 40));
            var8.pjstr(this.safesizestring(tidyrecoveryanswer(this.recov[4].getText()), 40));
            String var9 = "changequestions.cgi";
            var8.addcrc();
            int var10 = var8.pos;
            var8.tinyenc(var2);
            var8.pos = 0;
            String var11 = var8.g64encoded(var10);
            String var12 = this.codebase + var9;

            try {
               URL var13 = new URL(var12);
               URLConnection var14 = var13.openConnection();
               var14.setDoInput(true);
               var14.setDoOutput(true);
               OutputStreamWriter var15 = new OutputStreamWriter(var14.getOutputStream());
               var15.write("data1=" + urlencode(var7) + "&data2=" + urlencode(var11));
               var15.flush();
               InputStream var16 = var14.getInputStream();
               var8.pos = 0;

               while(var8.pos < var8.data.length && var16.read(var8.data, var8.pos, var8.data.length - var8.pos) != -1) {
               }

               var8.pos = 0;
               var15.close();
               var16.close();
               String var17 = var8.gstr();
               this.processingpage.setVisible(false);
               if (var17.startsWith("ATTACK")) {
                  this.blocked_attack_page.setVisible(true);
                  return;
               }

               if (this.type == 2) {
                  if (var17.startsWith("PENDING")) {
                     this.change_questions_success_page_pending.setVisible(true);
                     return;
                  }

                  if (var17.startsWith("ACTIVE")) {
                     this.change_questions_success_page_active.setVisible(true);
                     return;
                  }

                  if (var17.startsWith("WRONG")) {
                     this.wrongpassword_page.setVisible(true);
                     this.onreversepath = true;
                     this.showpanel = this.change_questions_page;
                     this.hidepanel = this.wrongpassword_page;
                     return;
                  }

                  this.system_error_page.setVisible(true);
                  this.onreversepath = true;
                  this.showpanel = this.change_questions_page;
                  this.hidepanel = this.system_error_page;
                  return;
               }
            } catch (Throwable var18) {
               var18.printStackTrace();
               this.processingpage.setVisible(false);
               this.system_error_page.setVisible(true);
               this.onreversepath = true;
               this.hidepanel = this.system_error_page;
               if (this.type == 2) {
                  this.showpanel = this.change_questions_page;
               }
            }

         }
      }
   }

   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "keyReleased",
      descriptor = "(Ljava/awt/event/KeyEvent;)V",
      line = 635
   )
   public void keyReleased(KeyEvent arg0) {
   }

   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "keyTyped",
      descriptor = "(Ljava/awt/event/KeyEvent;)V",
      line = 638
   )
   public void keyTyped(KeyEvent arg0) {
   }

   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "keyPressed",
      descriptor = "(Ljava/awt/event/KeyEvent;)V",
      line = 645
   )
   public void keyPressed(KeyEvent arg0) {
      int var2 = arg0.getKeyCode();
      if (this.type == 4) {
         boolean var3 = false;
         if (var2 == 37) {
            this.debug_panel = this.debug_panel-- % 28;
            var3 = true;
         } else if (var2 == 39) {
            ++this.debug_panel;
            var3 = true;
         }

         if (var3) {
            this.processingpage.setVisible(false);
            this.system_error_page.setVisible(false);
            this.blocked_query_page.setVisible(false);
            this.blocked_attack_page.setVisible(false);
            this.wrongpassword_page.setVisible(false);
            this.change_questions_tooshort_page.setVisible(false);
            this.change_questions_samequestions_page.setVisible(false);
            this.change_questions_sameanswers_page.setVisible(false);
            this.change_questions_page.setVisible(false);
            switch(this.debug_panel) {
            case 0:
               this.processingpage.setVisible(true);
               break;
            case 1:
               this.system_error_page.setVisible(true);
               break;
            case 2:
               this.blocked_query_page.setVisible(true);
               break;
            case 3:
               this.blocked_attack_page.setVisible(true);
               break;
            case 4:
               this.wrongpassword_page.setVisible(true);
               break;
            case 5:
               this.change_questions_tooshort_page.setVisible(true);
               break;
            case 6:
               this.change_questions_samequestions_page.setVisible(true);
               break;
            case 7:
               this.change_questions_sameanswers_page.setVisible(true);
               break;
            case 8:
               this.change_questions_page.setVisible(true);
            }

            this.validate();
            arg0.consume();
            return;
         }

         System.out.println("Didn't call change_panel!");
      }

      if (var2 != 8 && var2 != 127 && !arg0.isActionKey() && (arg0.getModifiers() & 2) == 0 && (arg0.getModifiers() & 8) == 0) {
         Object var5 = arg0.getSource();
         if (var5 instanceof TextField) {
            TextField var4 = (TextField)var5;
            if (var4.getText().length() >= var4.getColumns() && var4.getSelectedText().equals("")) {
               arg0.consume();
               return;
            }
         } else if (var5 instanceof TextArea) {
            TextArea var6 = (TextArea)var5;
            if (var6.getText().length() >= 400 && var6.getSelectedText().equals("")) {
               arg0.consume();
            }
         }

      }
   }

   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "textValueChanged",
      descriptor = "(Ljava/awt/event/TextEvent;)V",
      line = 719
   )
   public void textValueChanged(TextEvent arg0) {
      Object var2 = arg0.getSource();
      if (var2 instanceof TextField) {
         TextField var3 = (TextField)var2;
         if (var3.getText().length() > var3.getColumns()) {
            var3.setText(var3.getText().substring(0, var3.getColumns()));
            var3.setCaretPosition(var3.getColumns());
            return;
         }
      } else if (var2 instanceof TextArea) {
         TextArea var4 = (TextArea)var2;
         if (var4.getText().length() > 400) {
            var4.setText(var4.getText().substring(0, 400));
            var4.setCaretPosition(400);
         }
      }

   }

   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "destroy",
      descriptor = "()V",
      line = 736
   )
   public void destroy() {
   }

   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "findcachedir",
      descriptor = "()Ljava/lang/String;",
      line = 742
   )
   public static final String findcachedir() {
      String[] var0 = new String[]{"c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", "~/", "/tmp/", ""};
      String var1 = ".file_store_32";

      for(int var2 = 0; var2 < var0.length; ++var2) {
         try {
            String var3 = var0[var2];
            File var4;
            if (var3.length() > 0) {
               var4 = new File(var3);
               if (!var4.exists()) {
                  continue;
               }
            }

            var4 = new File(var3 + var1);
            if (var4.exists() || var4.mkdir()) {
               return var3 + var1 + "/";
            }
         } catch (Exception var5) {
         }
      }

      return null;
   }

   @OriginalMember(
      owner = "passapplet!passwordapp_de",
      name = "getuid",
      descriptor = "(Ljava/lang/String;)I",
      line = 762
   )
   private static final int getuid(String arg0) {
      try {
         File var1 = new File(arg0 + "uid.dat");
         if (!var1.exists() || var1.length() < 4L) {
            DataOutputStream var2 = new DataOutputStream(new FileOutputStream(arg0 + "uid.dat"));
            var2.writeInt((int)(Math.random() * 9.9999999E7D));
            var2.close();
         }
      } catch (Exception var4) {
      }

      try {
         DataInputStream var5 = new DataInputStream(new FileInputStream(arg0 + "uid.dat"));
         int var6 = var5.readInt();
         var5.close();
         return var6 + 1;
      } catch (Exception var3) {
         return 0;
      }
   }
}
