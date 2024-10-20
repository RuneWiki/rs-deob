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

@ObfuscatedName("aj")
public abstract class class48 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("aj.s")
    public static class48 field387 = null;

    @ObfuscatedName("aj.l")
    public static int field388 = 0;

    @ObfuscatedName("aj.u")
    public static long field389 = 0L;

    @ObfuscatedName("aj.q")
    public static boolean field390 = false;

    @ObfuscatedName("aj.k")
    public boolean field402 = false;

    @ObfuscatedName("aj.e")
    public static int field392 = 20;

    @ObfuscatedName("aj.p")
    public static int field386 = 1;

    @ObfuscatedName("aj.b")
    public static int field394 = 0;

    @ObfuscatedName("aj.g")
    public static long[] field395 = new long[32];

    @ObfuscatedName("aj.r")
    public static long[] field405 = new long[32];

    @ObfuscatedName("aj.o")
    public int field397;

    @ObfuscatedName("aj.a")
    public int field398;

    @ObfuscatedName("aj.j")
    public int field399 = 0;

    @ObfuscatedName("aj.d")
    public int field412 = 0;

    @ObfuscatedName("aj.v")
    public int field396;

    @ObfuscatedName("aj.af")
    public int field403;

    @ObfuscatedName("aj.ah")
    public int field401;

    @ObfuscatedName("aj.ab")
    public int field415;

    @ObfuscatedName("aj.as")
    public Frame field404;

    @ObfuscatedName("aj.an")
    public Canvas field406;

    @ObfuscatedName("aj.ao")
    public volatile boolean field407 = true;

    @ObfuscatedName("aj.ai")
    public static int field414 = 500;

    @ObfuscatedName("aj.ac")
    public boolean field409 = false;

    @ObfuscatedName("aj.ap")
    public volatile boolean field410 = false;

    @ObfuscatedName("aj.aa")
    public volatile long field411 = 0L;

    @ObfuscatedName("aj.av")
    public class39 field408;

    @ObfuscatedName("aj.al")
    public Clipboard field413;

    @ObfuscatedName("aj.ae")
    public final EventQueue field400;

    @ObfuscatedName("aj.az")
    public static volatile boolean field391 = true;

    @ObfuscatedName("aj.aj")
    public static long field416 = -1L;

    @ObfuscatedName("aj.ax")
    public static long field417 = -1L;

    public class48() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field400 = var1;
        class41 var3 = new class41();
        Statics.field1298 = var3;
    }

    @ObfuscatedName("aj.q(III)V")
    public final void method827(int arg0, int arg1) {
        if (this.field401 != arg0 || this.field415 != arg1) {
            this.method705();
        }
        this.field401 = arg0;
        this.field415 = arg1;
    }

    @ObfuscatedName("aj.i(Ljava/lang/Object;B)V")
    public final void method689(Object arg0) {
        if (this.field400 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field400.peekEvent() != null; var2++) {
            class192.method1435(1L);
        }
        if (arg0 != null) {
            this.field400.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("aj.x(B)Lfp;")
    public class157 method690() {
        if (this.field408 == null) {
            this.field408 = new class39();
            this.field408.method586(this.field406);
        }
        return this.field408;
    }

    @ObfuscatedName("aj.e(I)V")
    public void method691() {
        this.field413 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("aj.p(Ljava/lang/String;S)V")
    public void method692(String arg0) {
        this.field413.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("aj.b(B)V")
    public final void method693() {
        if (Statics.field1961.toLowerCase().indexOf("microsoft") == -1) {
            class40.field335[44] = 71;
            class40.field335[45] = 26;
            class40.field335[46] = 72;
            class40.field335[47] = 73;
            class40.field335[59] = 57;
            class40.field335[61] = 27;
            class40.field335[91] = 42;
            class40.field335[92] = 74;
            class40.field335[93] = 43;
            class40.field335[192] = 28;
            class40.field335[222] = 58;
            class40.field335[520] = 59;
        } else {
            class40.field335[186] = 57;
            class40.field335[187] = 27;
            class40.field335[188] = 71;
            class40.field335[189] = 26;
            class40.field335[190] = 72;
            class40.field335[191] = 73;
            class40.field335[192] = 58;
            class40.field335[219] = 42;
            class40.field335[220] = 74;
            class40.field335[221] = 43;
            class40.field335[222] = 59;
            class40.field335[223] = 28;
        }
        Canvas var1 = this.field406;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class40.field338);
        var1.addFocusListener(class40.field338);
    }

    @ObfuscatedName("aj.n(I)V")
    public final void method712() {
        Canvas var1 = this.field406;
        var1.addMouseListener(class49.field430);
        var1.addMouseMotionListener(class49.field430);
        var1.addFocusListener(class49.field430);
    }

    @ObfuscatedName("aj.f(I)V")
    public final void method775() {
        Container var1 = this.method720();
        if (var1 == null) {
            return;
        }
        class311 var2 = this.method721();
        this.field397 = Math.max(var2.field3748, this.field396);
        this.field398 = Math.max(var2.field3746, this.field403);
        if (this.field397 <= 0) {
            this.field397 = 1;
        }
        if (this.field398 <= 0) {
            this.field398 = 1;
        }
        Statics.field1180 = Math.min(this.field397, this.field401);
        Statics.field3139 = Math.min(this.field398, this.field415);
        this.field399 = (this.field397 - Statics.field1180) / 2;
        this.field412 = 0;
        this.field406.setSize(Statics.field1180, Statics.field3139);
        Statics.field2015 = new class47(Statics.field1180, Statics.field3139, this.field406);
        if (this.field404 == var1) {
            Insets var3 = this.field404.getInsets();
            this.field406.setLocation(this.field399 + var3.left, this.field412 + var3.top);
        } else {
            this.field406.setLocation(this.field399, this.field412);
        }
        this.field407 = true;
        this.method696();
    }

    @ObfuscatedName("aj.a(I)V")
    public void method697() {
        int var1 = this.field399;
        int var2 = this.field412;
        int var3 = this.field397 - Statics.field1180 - var1;
        int var4 = this.field398 - Statics.field3139 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method720();
            int var6 = 0;
            int var7 = 0;
            if (this.field404 == var5) {
                Insets var8 = this.field404.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field398);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field397, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field397 + var6 - var3, var7, var3, this.field398);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field398 + var7 - var4, this.field397, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("aj.c(B)V")
    public final void method698() {
        Canvas var1 = this.field406;
        var1.removeKeyListener(class40.field338);
        var1.removeFocusListener(class40.field338);
        class40.field330 = -1;
        Canvas var2 = this.field406;
        var2.removeMouseListener(class49.field430);
        var2.removeMouseMotionListener(class49.field430);
        var2.removeFocusListener(class49.field430);
        class49.field425 = 0;
        if (this.field408 != null) {
            this.field408.method589(this.field406);
        }
        this.method700();
        Canvas var3 = this.field406;
        var3.setFocusTraversalKeysEnabled(false);
        var3.addKeyListener(class40.field338);
        var3.addFocusListener(class40.field338);
        Canvas var4 = this.field406;
        var4.addMouseListener(class49.field430);
        var4.addMouseMotionListener(class49.field430);
        var4.addFocusListener(class49.field430);
        if (this.field408 != null) {
            this.field408.method586(this.field406);
        }
        this.method705();
    }

    @ObfuscatedName("aj.v(IIII)V")
    public final void method699(int arg0, int arg1, int arg2) {
        try {
            if (field387 != null) {
                field388++;
                if (field388 >= 3) {
                    this.method709("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field387 = this;
            Statics.field1180 = arg0;
            Statics.field3139 = arg1;
            Statics.field363 = arg2;
            Statics.field1939 = this;
            if (Statics.field393 == null) {
                Statics.field393 = new class155();
            }
            Statics.field393.method3008(this, 1);
        } catch (Exception var5) {
            class153.method66((String) null, var5);
            this.method709("crash");
        }
    }

    @ObfuscatedName("aj.af(I)V")
    public final synchronized void method700() {
        Container var1 = this.method720();
        if (this.field406 != null) {
            this.field406.removeFocusListener(this);
            var1.remove(this.field406);
        }
        Statics.field1180 = Math.max(var1.getWidth(), this.field396);
        Statics.field3139 = Math.max(var1.getHeight(), this.field403);
        if (this.field404 != null) {
            Insets var2 = this.field404.getInsets();
            Statics.field1180 -= var2.right + var2.left;
            Statics.field3139 -= var2.top + var2.bottom;
        }
        this.field406 = new class43(this);
        var1.add(this.field406);
        this.field406.setSize(Statics.field1180, Statics.field3139);
        this.field406.setVisible(true);
        this.field406.setBackground(Color.BLACK);
        if (this.field404 == var1) {
            Insets var3 = this.field404.getInsets();
            this.field406.setLocation(this.field399 + var3.left, this.field412 + var3.top);
        } else {
            this.field406.setLocation(this.field399, this.field412);
        }
        this.field406.addFocusListener(this);
        this.field406.requestFocus();
        this.field407 = true;
        if (Statics.field2015 != null && Statics.field1180 == Statics.field2015.field3768 && Statics.field3139 == Statics.field2015.field3770) {
            ((class47) Statics.field2015).method672(this.field406);
            Statics.field2015.method673(0, 0);
        } else {
            Statics.field2015 = new class47(Statics.field1180, Statics.field3139, this.field406);
        }
        this.field410 = false;
        this.field411 = class185.method3250();
    }

    @ObfuscatedName("aj.ah(I)Z")
    public final boolean method695() {
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
                this.method709("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1961 != null) {
                String var1 = Statics.field1961.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1955;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method709("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length(); var3++) {
                            char var4 = var2.charAt(var3);
                            boolean var5 = var4 >= '0' && var4 <= '9';
                            if (!var5) {
                                break;
                            }
                        }
                        String var6 = var2.substring(6, var3);
                        if (class306.method2093(var6)) {
                            int var7 = class306.method1586(var6, 10, true);
                            if (var7 < 10) {
                                this.method709("wrongjava");
                                return;
                            }
                        }
                    }
                    field386 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method700();
            this.method776();
            Statics.field369 = class161.method633();
            while (field389 == 0L || class185.method3250() < field389) {
                Statics.field49 = Statics.field369.method2970(field392, field386);
                for (int var8 = 0; var8 < Statics.field49; var8++) {
                    this.method702();
                }
                this.method703();
                this.method689(this.field406);
            }
        } catch (Exception var10) {
            class153.method66((String) null, var10);
            this.method709("crash");
        }
        this.method706();
    }

    @ObfuscatedName("aj.ab(I)V")
    public void method702() {
        long var1 = class185.method3250();
        long var3 = field405[Statics.field173];
        field405[Statics.field173] = var1;
        Statics.field173 = Statics.field173 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field147 = field391;
        }
        this.method714();
    }

    @ObfuscatedName("aj.aw(I)V")
    public void method703() {
        Container var1 = this.method720();
        long var2 = class185.method3250();
        long var4 = field395[Statics.field3260];
        field395[Statics.field3260] = var2;
        Statics.field3260 = Statics.field3260 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field394 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field414 - 1 > 50) {
            field414 -= 50;
            this.field407 = true;
            this.field406.setSize(Statics.field1180, Statics.field3139);
            this.field406.setVisible(true);
            if (this.field404 == var1) {
                Insets var7 = this.field404.getInsets();
                this.field406.setLocation(this.field399 + var7.left, this.field412 + var7.top);
            } else {
                this.field406.setLocation(this.field399, this.field412);
            }
        }
        if (this.field410) {
            this.method698();
        }
        this.method704();
        this.method715(this.field407);
        if (this.field407) {
            this.method697();
        }
        this.field407 = false;
    }

    @ObfuscatedName("aj.ak(I)V")
    public final void method704() {
        class311 var1 = this.method721();
        if (this.field397 != var1.field3748 || this.field398 != var1.field3746 || this.field409) {
            this.method775();
            this.field409 = false;
        }
    }

    @ObfuscatedName("aj.as(B)V")
    public final void method705() {
        this.field409 = true;
    }

    @ObfuscatedName("aj.an(I)V")
    public final synchronized void method706() {
        if (field390) {
            return;
        }
        field390 = true;
        try {
            this.field406.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method716();
        } catch (Exception var7) {
        }
        if (this.field404 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field393 != null) {
            try {
                Statics.field393.method3015();
            } catch (Exception var5) {
            }
        }
        this.method723();
    }

    public final void start() {
        if (field387 == this && !field390) {
            field389 = 0L;
        }
    }

    public final void stop() {
        if (field387 == this && !field390) {
            field389 = class185.method3250() + 4000L;
        }
    }

    public final void destroy() {
        if (field387 == this && !field390) {
            field389 = class185.method3250();
            class192.method1435(5000L);
            this.method706();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field387 != this || field390) {
            return;
        }
        this.field407 = true;
        if (class185.method3250() - this.field411 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1180 && var2.height >= Statics.field3139) {
                this.field410 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field391 = true;
        this.field407 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field391 = false;
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

    @ObfuscatedName("aj.ap(ILjava/lang/String;ZI)V")
    public final void method717(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field406.getGraphics();
            if (Statics.field1962 == null) {
                Statics.field1962 = new Font("Helvetica", 1, 13);
                Statics.field257 = this.field406.getFontMetrics(Statics.field1962);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field1180, Statics.field3139);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field1029 == null) {
                    Statics.field1029 = this.field406.createImage(304, 34);
                }
                Graphics var6 = Statics.field1029.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field1962);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field257.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field1029, Statics.field1180 / 2 - 152, Statics.field3139 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field1180 / 2 - 152;
                int var9 = Statics.field3139 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1962);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field257.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field406.repaint();
        }
    }

    @ObfuscatedName("aj.aa(B)V")
    public final void method763() {
        Statics.field1029 = null;
        Statics.field1962 = null;
        Statics.field257 = null;
    }

    @ObfuscatedName("aj.ar(Ljava/lang/String;I)V")
    public void method709(String arg0) {
        if (this.field402) {
            return;
        }
        this.field402 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("aj.au(I)Ljava/awt/Container;")
    public Container method720() {
        return this.field404 == null ? this : this.field404;
    }

    @ObfuscatedName("aj.av(B)Lkg;")
    public class311 method721() {
        Container var1 = this.method720();
        int var2 = Math.max(var1.getWidth(), this.field396);
        int var3 = Math.max(var1.getHeight(), this.field403);
        if (this.field404 != null) {
            Insets var4 = this.field404.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class311(var2, var3);
    }

    @ObfuscatedName("aj.al(I)Z")
    public final boolean method722() {
        return this.field404 != null;
    }

    @ObfuscatedName("ap.ae(I)I")
    public static int method583() {
        int var0 = 0;
        if (Statics.field1661 == null || !Statics.field1661.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field1661 = var2;
                        field417 = -1L;
                        field416 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field1661 != null) {
            long var4 = class185.method3250();
            long var6 = Statics.field1661.getCollectionTime();
            if (field416 != -1L) {
                long var8 = var6 - field416;
                long var10 = var4 - field417;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field416 = var6;
            field417 = var4;
        }
        return var0;
    }

    @ObfuscatedName("aj.y(I)V")
    public abstract void method696();

    @ObfuscatedName("aj.at(I)V")
    public abstract void method714();

    @ObfuscatedName("aj.ai(ZB)V")
    public abstract void method715(boolean arg0);

    @ObfuscatedName("aj.ac(I)V")
    public abstract void method716();

    @ObfuscatedName("aj.az(I)V")
    public abstract void method723();

    @ObfuscatedName("aj.ao(I)V")
    public abstract void method776();

    public abstract void init();
}
