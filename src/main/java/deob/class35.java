package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.URL;
import java.util.Iterator;

@ObfuscatedName("bx")
public abstract class class35 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bx.ah")
    public static class35 field181 = null;

    @ObfuscatedName("bx.af")
    public static int field169 = 0;

    @ObfuscatedName("bx.at")
    public static long field170 = 0L;

    @ObfuscatedName("bx.an")
    public static boolean field171 = false;

    @ObfuscatedName("bx.ao")
    public boolean field172 = false;

    @ObfuscatedName("bx.aw")
    public static int field187 = 20;

    @ObfuscatedName("bx.ad")
    public static int field174 = 1;

    @ObfuscatedName("bx.al")
    public static int field175 = 0;

    @ObfuscatedName("bx.ai")
    public static long[] field177 = new long[32];

    @ObfuscatedName("bx.ar")
    public static long[] field178 = new long[32];

    @ObfuscatedName("bx.au")
    public int field179;

    @ObfuscatedName("bx.ay")
    public int field180;

    @ObfuscatedName("bx.ap")
    public int field203 = 0;

    @ObfuscatedName("bx.av")
    public int field182 = 0;

    @ObfuscatedName("bx.am")
    public int field189;

    @ObfuscatedName("bx.ac")
    public int field190;

    @ObfuscatedName("bx.ae")
    public int field185;

    @ObfuscatedName("bx.ak")
    public int field168;

    @ObfuscatedName("bx.bp")
    public boolean field173 = false;

    @ObfuscatedName("bx.bf")
    public Frame field188;

    @ObfuscatedName("bx.be")
    public Canvas field195;

    @ObfuscatedName("bx.bn")
    public volatile boolean field183 = true;

    @ObfuscatedName("bx.bo")
    public static int field191 = 500;

    @ObfuscatedName("bx.bx")
    public boolean field201 = false;

    @ObfuscatedName("bx.bl")
    public volatile boolean field193 = false;

    @ObfuscatedName("bx.bh")
    public volatile long field194 = 0L;

    @ObfuscatedName("bx.bu")
    public class22 field192;

    @ObfuscatedName("bx.br")
    public Clipboard field196;

    @ObfuscatedName("bx.bb")
    public final EventQueue field197;

    @ObfuscatedName("bx.by")
    public static volatile boolean field198 = true;

    @ObfuscatedName("bx.bt")
    public static class26 field199 = new class26();

    @ObfuscatedName("bx.bi")
    public static long field200 = -1L;

    @ObfuscatedName("bx.bw")
    public static long field184 = -1L;

    public class35() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field197 = var1;
        class23 var3 = new class23();
        Statics.field1552 = var3;
    }

    @ObfuscatedName("bx.af(III)V")
    public final void method455(int arg0, int arg1) {
        if (this.field185 != arg0 || this.field168 != arg1) {
            this.method476();
        }
        this.field185 = arg0;
        this.field168 = arg1;
    }

    @ObfuscatedName("bx.at(Ljava/lang/Object;I)V")
    public final void method488(Object arg0) {
        if (this.field197 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field197.peekEvent() != null; var2++) {
            class319.method7909(1L);
        }
        if (arg0 != null) {
            this.field197.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bx.an(I)Lge;")
    public class177 method513() {
        if (this.field192 == null) {
            this.field192 = new class22();
            this.field192.method278(this.field195);
        }
        return this.field192;
    }

    @ObfuscatedName("bx.ao(I)V")
    public void method458() {
        this.field196 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bx.ab(Ljava/lang/String;I)V")
    public void method459(String arg0) {
        this.field196.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bx.aw(I)Ljava/awt/datatransfer/Clipboard;")
    public Clipboard method460() {
        return this.field196;
    }

    @ObfuscatedName("bx.ad(B)V")
    public final void method461() {
        if (Statics.field1872.toLowerCase().indexOf("microsoft") == -1) {
            class29.field142[44] = 71;
            class29.field142[45] = 26;
            class29.field142[46] = 72;
            class29.field142[47] = 73;
            class29.field142[59] = 57;
            class29.field142[61] = 27;
            class29.field142[91] = 42;
            class29.field142[92] = 74;
            class29.field142[93] = 43;
            class29.field142[192] = 28;
            class29.field142[222] = 58;
            class29.field142[520] = 59;
        } else {
            class29.field142[186] = 57;
            class29.field142[187] = 27;
            class29.field142[188] = 71;
            class29.field142[189] = 26;
            class29.field142[190] = 72;
            class29.field142[191] = 73;
            class29.field142[192] = 58;
            class29.field142[219] = 42;
            class29.field142[220] = 74;
            class29.field142[221] = 43;
            class29.field142[222] = 59;
            class29.field142[223] = 28;
        }
        field199.method319(this.field195);
    }

    @ObfuscatedName("bx.al(S)V")
    public final void method526() {
        field199.method349();
    }

    @ObfuscatedName("bx.as(Lbf;II)V")
    public void method462(class30 arg0, int arg1) {
        field199.method317(arg0, arg1);
    }

    @ObfuscatedName("bx.ag(S)V")
    public final void method609() {
        class36.method2573(this.field195);
    }

    @ObfuscatedName("bx.ai(I)V")
    public final void method464() {
        Container var1 = this.method550();
        if (var1 == null) {
            return;
        }
        class466 var2 = this.method597();
        this.field179 = Math.max(var2.field4855, this.field189);
        this.field180 = Math.max(var2.field4856, this.field190);
        if (this.field179 <= 0) {
            this.field179 = 1;
        }
        if (this.field180 <= 0) {
            this.field180 = 1;
        }
        Statics.field1700 = Math.min(this.field179, this.field185);
        Statics.field3661 = Math.min(this.field180, this.field168);
        this.field203 = (this.field179 - Statics.field1700) / 2;
        this.field182 = 0;
        this.field195.setSize(Statics.field1700, Statics.field3661);
        Statics.field1496 = new class33(Statics.field1700, Statics.field3661, this.field195, this.field173);
        if (this.field188 == var1) {
            Insets var3 = this.field188.getInsets();
            this.field195.setLocation(this.field203 + var3.left, this.field182 + var3.top);
        } else {
            this.field195.setLocation(this.field203, this.field182);
        }
        this.field183 = true;
        this.method465();
    }

    @ObfuscatedName("bx.ar(I)V")
    public void method466() {
        int var1 = this.field203;
        int var2 = this.field182;
        int var3 = this.field179 - Statics.field1700 - var1;
        int var4 = this.field180 - Statics.field3661 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method550();
            int var6 = 0;
            int var7 = 0;
            if (this.field188 == var5) {
                Insets var8 = this.field188.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field180);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field179, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field179 + var6 - var3, var7, var3, this.field180);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field180 + var7 - var4, this.field179, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bx.aj(B)V")
    public final void method537() {
        field199.method327(this.field195);
        class36.method3370(this.field195);
        if (this.field192 != null) {
            this.field192.method281(this.field195);
        }
        this.method469();
        field199.method319(this.field195);
        class36.method2573(this.field195);
        if (this.field192 != null) {
            this.field192.method278(this.field195);
        }
        this.method476();
    }

    @ObfuscatedName("bx.au(IIIII)V")
    public final void method468(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (field181 != null) {
                field169++;
                if (field169 >= 3) {
                    this.method486("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field181 = this;
            Statics.field1700 = arg0;
            Statics.field3661 = arg1;
            Statics.field5391 = arg2;
            Statics.field912 = arg3;
            Statics.field5392 = this;
            if (Statics.field3897 == null) {
                Statics.field3897 = new class174();
            }
            Statics.field3897.method3208(this, 1);
        } catch (Exception var6) {
            class561.method3291((String) null, var6);
            this.method486("crash");
        }
    }

    @ObfuscatedName("bx.ay(I)V")
    public final synchronized void method469() {
        Container var1 = this.method550();
        if (this.field195 != null) {
            this.field195.removeFocusListener(this);
            var1.remove(this.field195);
        }
        Statics.field1700 = Math.max(var1.getWidth(), this.field189);
        Statics.field3661 = Math.max(var1.getHeight(), this.field190);
        if (this.field188 != null) {
            Insets var2 = this.field188.getInsets();
            Statics.field1700 -= var2.right + var2.left;
            Statics.field3661 -= var2.top + var2.bottom;
        }
        this.field195 = new class24(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field195);
        this.field195.setSize(Statics.field1700, Statics.field3661);
        this.field195.setVisible(true);
        this.field195.setBackground(Color.BLACK);
        if (this.field188 == var1) {
            Insets var3 = this.field188.getInsets();
            this.field195.setLocation(this.field203 + var3.left, this.field182 + var3.top);
        } else {
            this.field195.setLocation(this.field203, this.field182);
        }
        this.field195.addFocusListener(this);
        this.field195.requestFocus();
        this.field183 = true;
        if (Statics.field1496 != null && Statics.field1700 == Statics.field1496.field5312 && Statics.field3661 == Statics.field1496.field5311) {
            ((class33) Statics.field1496).method438(this.field195);
            Statics.field1496.method439(0, 0);
        } else {
            Statics.field1496 = new class33(Statics.field1700, Statics.field3661, this.field195, this.field173);
        }
        this.field193 = false;
        this.field194 = class318.method3596();
    }

    @ObfuscatedName("bx.ap(ZI)V")
    public void method506(boolean arg0) {
        if (this.field173 != arg0) {
            this.field173 = arg0;
            Statics.field1496.method8860(arg0);
            Statics.field1496.method8858();
        }
    }

    @ObfuscatedName("bx.av(I)Z")
    public final boolean method529() {
        String var1 = this.getDocumentBase().getHost().toLowerCase();
        if (var1.equals("jagex.com") || var1.endsWith(".jagex.com")) {
            return true;
        } else if (var1.equals("runescape.com") || var1.endsWith(".runescape.com")) {
            return true;
        } else if (var1.endsWith("127.0.0.1")) {
            return true;
        } else {
            while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
                var1 = var1.substring(0, var1.length() - 1);
            }
            if (var1.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method486("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1872 != null) {
                String var1 = Statics.field1872.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1867;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method486("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class407.method6479(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (Statics.method4033(var4) && class407.method3456(var4) < 10) {
                            this.method486("wrongjava");
                            return;
                        }
                    }
                    field174 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method469();
            this.method481();
            Statics.field176 = class187.method2958();
            while (field170 == 0L || class318.method3596() < field170) {
                Statics.field2876 = Statics.field176.method3133(field187, field174);
                for (int var5 = 0; var5 < Statics.field2876; var5++) {
                    this.method472();
                }
                this.method474();
                this.method488(this.field195);
            }
        } catch (Exception var7) {
            class561.method3291((String) null, var7);
            this.method486("crash");
        }
        this.method477();
    }

    @ObfuscatedName("bx.aa(I)V")
    public void method472() {
        long var1 = class318.method3596();
        long var3 = field178[Statics.field1900];
        field178[Statics.field1900] = var1;
        Statics.field1900 = Statics.field1900 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field3023 = field198;
        }
        this.method473();
    }

    @ObfuscatedName("bx.aq(I)V")
    public final void method587() {
        this.field183 = true;
    }

    @ObfuscatedName("bx.am(I)V")
    public void method474() {
        Container var1 = this.method550();
        long var2 = class318.method3596();
        long var4 = field177[Statics.field3923];
        field177[Statics.field3923] = var2;
        Statics.field3923 = Statics.field3923 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field175 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field191 - 1 > 50) {
            field191 -= 50;
            this.field183 = true;
            this.field195.setSize(Statics.field1700, Statics.field3661);
            this.field195.setVisible(true);
            if (this.field188 == var1) {
                Insets var7 = this.field188.getInsets();
                this.field195.setLocation(this.field203 + var7.left, this.field182 + var7.top);
            } else {
                this.field195.setLocation(this.field203, this.field182);
            }
        }
        if (this.field193) {
            this.method537();
        }
        this.method487();
        this.method483(this.field183);
        if (this.field183) {
            this.method466();
        }
        this.field183 = false;
    }

    @ObfuscatedName("bx.ac(S)V")
    public final void method487() {
        class466 var1 = this.method597();
        if (this.field179 != var1.field4855 || this.field180 != var1.field4856 || this.field201) {
            this.method464();
            this.field201 = false;
        }
    }

    @ObfuscatedName("bx.ae(I)V")
    public final void method476() {
        this.field201 = true;
    }

    @ObfuscatedName("bx.ak(B)V")
    public final synchronized void method477() {
        if (field171) {
            return;
        }
        field171 = true;
        try {
            this.field195.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method484();
        } catch (Exception var7) {
        }
        if (this.field188 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field3897 != null) {
            try {
                Statics.field3897.method3209();
            } catch (Exception var5) {
            }
        }
        this.method479();
    }

    @ObfuscatedName("ag.bp(B)V")
    public static final void method99() {
        Statics.field176.method3134();
        for (int var0 = 0; var0 < 32; var0++) {
            field177[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field178[var1] = 0L;
        }
        Statics.field2876 = 0;
    }

    public final void start() {
        if (field181 == this && !field171) {
            field170 = 0L;
        }
    }

    public final void stop() {
        if (field181 == this && !field171) {
            field170 = class318.method3596() + 4000L;
        }
    }

    public final void destroy() {
        if (field181 == this && !field171) {
            field170 = class318.method3596();
            class319.method7909(5000L);
            this.method477();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field181 != this || field171) {
            return;
        }
        this.field183 = true;
        if (class318.method3596() - this.field194 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1700 && var2.height >= Statics.field3661) {
                this.field193 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field198 = true;
        this.field183 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field198 = false;
    }

    public final void windowActivated(WindowEvent arg0) {
    }

    public final void windowClosed(WindowEvent arg0) {
    }

    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    public final void windowDeactivated(WindowEvent arg0) {
    }

    public final void windowDeiconified(WindowEvent arg0) {
    }

    public final void windowIconified(WindowEvent arg0) {
    }

    public final void windowOpened(WindowEvent arg0) {
    }

    @ObfuscatedName("bx.bu(ILjava/lang/String;ZZB)V")
    public final void method570(int arg0, String arg1, boolean arg2, boolean arg3) {
        try {
            Graphics var5 = this.field195.getGraphics();
            if (Statics.field290 == null) {
                Statics.field290 = new Font("Helvetica", 1, 13);
                Statics.field430 = this.field195.getFontMetrics(Statics.field290);
            }
            if (arg2 && !arg3) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, Statics.field1700, Statics.field3661);
            }
            Color var6 = new Color(140, 17, 17);
            try {
                if (Statics.field148 == null) {
                    Statics.field148 = this.field195.createImage(304, 34);
                }
                Graphics var7 = Statics.field148.getGraphics();
                var7.setColor(var6);
                var7.drawRect(0, 0, 303, 33);
                var7.fillRect(2, 2, arg0 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(1, 1, 301, 31);
                var7.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var7.setFont(Statics.field290);
                var7.setColor(Color.white);
                var7.drawString(arg1, (304 - Statics.field430.stringWidth(arg1)) / 2, 22);
                var5.drawImage(Statics.field148, Statics.field1700 / 2 - 152, Statics.field3661 / 2 + (arg3 ? 50 : -18), (ImageObserver) null);
            } catch (Exception var12) {
                int var9 = Statics.field1700 / 2 - 152;
                int var10 = Statics.field3661 / 2 - 18;
                var5.setColor(var6);
                var5.drawRect(var9, var10, 303, 33);
                var5.fillRect(var9 + 2, var10 + 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var9 + 1, var10 + 1, 301, 31);
                var5.fillRect(arg0 * 3 + var9 + 2, var10 + 2, 300 - arg0 * 3, 30);
                var5.setFont(Statics.field290);
                var5.setColor(Color.white);
                var5.drawString(arg1, var9 + (304 - Statics.field430.stringWidth(arg1)) / 2, var10 + 22);
            }
        } catch (Exception var13) {
            this.field195.repaint();
        }
    }

    @ObfuscatedName("bx.br(B)V")
    public final void method485() {
        Statics.field148 = null;
        Statics.field290 = null;
        Statics.field430 = null;
    }

    @ObfuscatedName("bx.bb(Ljava/lang/String;I)V")
    public void method486(String arg0) {
        if (this.field172) {
            return;
        }
        this.field172 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bx.by(B)Ljava/awt/Container;")
    public Container method550() {
        return this.field188 == null ? this : this.field188;
    }

    @ObfuscatedName("bx.bk(I)Lrz;")
    public class466 method597() {
        Container var1 = this.method550();
        int var2 = Math.max(var1.getWidth(), this.field189);
        int var3 = Math.max(var1.getHeight(), this.field190);
        if (this.field188 != null) {
            Insets var4 = this.field188.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class466(var2, var3);
    }

    @ObfuscatedName("bx.bt(I)Z")
    public final boolean method489() {
        return this.field188 != null;
    }

    @ObfuscatedName("ff.bq(I)I")
    public static int method2869() {
        int var0 = 0;
        if (Statics.field2743 == null || !Statics.field2743.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field2743 = var2;
                        field184 = -1L;
                        field200 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field2743 != null) {
            long var4 = class318.method3596();
            long var6 = Statics.field2743.getCollectionTime();
            if (field200 != -1L) {
                long var8 = var6 - field200;
                long var10 = var4 - field184;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field200 = var6;
            field184 = var4;
        }
        return var0;
    }

    @ObfuscatedName("bx.ax(B)V")
    public abstract void method465();

    @ObfuscatedName("bx.bh(I)V")
    public abstract void method473();

    @ObfuscatedName("bx.bi(I)V")
    public abstract void method479();

    public abstract void init();

    @ObfuscatedName("bx.bz(I)V")
    public abstract void method481();

    @ObfuscatedName("bx.bs(ZB)V")
    public abstract void method483(boolean arg0);

    @ObfuscatedName("bx.bj(I)V")
    public abstract void method484();
}
