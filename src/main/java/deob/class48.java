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
import java.net.URL;

@ObfuscatedName("am")
public abstract class class48 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("am.q")
    public static class48 field423 = null;

    @ObfuscatedName("am.m")
    public static int field428 = 0;

    @ObfuscatedName("am.j")
    public static long field425 = 0L;

    @ObfuscatedName("am.g")
    public static boolean field426 = false;

    @ObfuscatedName("am.i")
    public boolean field427 = false;

    @ObfuscatedName("am.l")
    public static int field429 = 20;

    @ObfuscatedName("am.d")
    public static int field430 = 1;

    @ObfuscatedName("am.o")
    public static int field431 = 0;

    @ObfuscatedName("am.v")
    public static long[] field432 = new long[32];

    @ObfuscatedName("am.n")
    public static long[] field434 = new long[32];

    @ObfuscatedName("am.r")
    public int field435;

    @ObfuscatedName("am.b")
    public int field454;

    @ObfuscatedName("am.e")
    public int field436 = 0;

    @ObfuscatedName("am.a")
    public int field438 = 0;

    @ObfuscatedName("am.f")
    public int field439;

    @ObfuscatedName("am.at")
    public int field440;

    @ObfuscatedName("am.ay")
    public int field441;

    @ObfuscatedName("am.ak")
    public int field453;

    @ObfuscatedName("am.af")
    public Frame field443;

    @ObfuscatedName("am.ah")
    public Canvas field444;

    @ObfuscatedName("am.ab")
    public volatile boolean field445 = true;

    @ObfuscatedName("am.ac")
    public static int field446 = 500;

    @ObfuscatedName("am.ad")
    public boolean field422 = false;

    @ObfuscatedName("am.aq")
    public volatile boolean field424 = false;

    @ObfuscatedName("am.ax")
    public volatile long field457 = 0L;

    @ObfuscatedName("am.ap")
    public class39 field450;

    @ObfuscatedName("am.aw")
    public Clipboard field437;

    @ObfuscatedName("am.al")
    public final EventQueue field452;

    @ObfuscatedName("am.ar")
    public static volatile boolean field456 = true;

    @ObfuscatedName("am.am")
    public static long field451 = -1L;

    @ObfuscatedName("am.ao")
    public static long field455 = -1L;

    public class48() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field452 = var1;
        class98.method4206(new class41());
    }

    @ObfuscatedName("am.l(III)V")
    public final void method723(int arg0, int arg1) {
        if (this.field441 != arg0 || this.field453 != arg1) {
            this.method739();
        }
        this.field441 = arg0;
        this.field453 = arg1;
    }

    @ObfuscatedName("am.o(Ljava/lang/Object;S)V")
    public final void method724(Object arg0) {
        if (this.field452 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field452.peekEvent() != null; var2++) {
            class194.method672(1L);
        }
        if (arg0 != null) {
            this.field452.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("am.k(I)Lfl;")
    public class159 method725() {
        if (this.field450 == null) {
            this.field450 = new class39();
            this.field450.method629(this.field444);
        }
        return this.field450;
    }

    @ObfuscatedName("am.v(I)V")
    public void method787() {
        this.field437 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("am.p(Ljava/lang/String;I)V")
    public void method726(String arg0) {
        this.field437.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("am.n(I)V")
    public final void method746() {
        if (Statics.field3766.toLowerCase().indexOf("microsoft") == -1) {
            class40.field375[44] = 71;
            class40.field375[45] = 26;
            class40.field375[46] = 72;
            class40.field375[47] = 73;
            class40.field375[59] = 57;
            class40.field375[61] = 27;
            class40.field375[91] = 42;
            class40.field375[92] = 74;
            class40.field375[93] = 43;
            class40.field375[192] = 28;
            class40.field375[222] = 58;
            class40.field375[520] = 59;
        } else {
            class40.field375[186] = 57;
            class40.field375[187] = 27;
            class40.field375[188] = 71;
            class40.field375[189] = 26;
            class40.field375[190] = 72;
            class40.field375[191] = 73;
            class40.field375[192] = 58;
            class40.field375[219] = 42;
            class40.field375[220] = 74;
            class40.field375[221] = 43;
            class40.field375[222] = 59;
            class40.field375[223] = 28;
        }
        class40.method2829(this.field444);
    }

    @ObfuscatedName("am.t(I)V")
    public final void method728() {
        Canvas var1 = this.field444;
        var1.addMouseListener(class49.field460);
        var1.addMouseMotionListener(class49.field460);
        var1.addFocusListener(class49.field460);
    }

    @ObfuscatedName("am.r(I)V")
    public final void method812() {
        Container var1 = this.method753();
        if (var1 == null) {
            return;
        }
        class316 var2 = this.method754();
        this.field435 = Math.max(var2.field3808, this.field439);
        this.field454 = Math.max(var2.field3803, this.field440);
        if (this.field435 <= 0) {
            this.field435 = 1;
        }
        if (this.field454 <= 0) {
            this.field454 = 1;
        }
        Statics.field1983 = Math.min(this.field435, this.field441);
        Statics.field42 = Math.min(this.field454, this.field453);
        this.field436 = (this.field435 - Statics.field1983) / 2;
        this.field438 = 0;
        this.field444.setSize(Statics.field1983, Statics.field42);
        Statics.field1928 = new class47(Statics.field1983, Statics.field42, this.field444);
        if (this.field443 == var1) {
            Insets var3 = this.field443.getInsets();
            this.field444.setLocation(this.field436 + var3.left, this.field438 + var3.top);
        } else {
            this.field444.setLocation(this.field436, this.field438);
        }
        this.field445 = true;
        this.method730();
    }

    @ObfuscatedName("am.b(I)V")
    public void method731() {
        int var1 = this.field436;
        int var2 = this.field438;
        int var3 = this.field435 - Statics.field1983 - var1;
        int var4 = this.field454 - Statics.field42 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method753();
            int var6 = 0;
            int var7 = 0;
            if (this.field443 == var5) {
                Insets var8 = this.field443.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field454);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field435, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field435 + var6 - var3, var7, var3, this.field454);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field454 + var7 - var4, this.field435, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("am.w(B)V")
    public final void method732() {
        class40.method882(this.field444);
        Canvas var1 = this.field444;
        var1.removeMouseListener(class49.field460);
        var1.removeMouseMotionListener(class49.field460);
        var1.removeFocusListener(class49.field460);
        class49.field476 = 0;
        if (this.field450 != null) {
            this.field450.method630(this.field444);
        }
        this.method734();
        class40.method2829(this.field444);
        Canvas var2 = this.field444;
        var2.addMouseListener(class49.field460);
        var2.addMouseMotionListener(class49.field460);
        var2.addFocusListener(class49.field460);
        if (this.field450 != null) {
            this.field450.method629(this.field444);
        }
        this.method739();
    }

    @ObfuscatedName("am.a(IIIB)V")
    public final void method733(int arg0, int arg1, int arg2) {
        try {
            if (field423 != null) {
                field428++;
                if (field428 >= 3) {
                    this.method752("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field423 = this;
            Statics.field1983 = arg0;
            Statics.field42 = arg1;
            Statics.field1992 = arg2;
            Statics.field1995 = this;
            if (Statics.field442 == null) {
                Statics.field442 = new class157();
            }
            Statics.field442.method2986(this, 1);
        } catch (Exception var5) {
            class155.method1451((String) null, var5);
            this.method752("crash");
        }
    }

    @ObfuscatedName("am.z(B)V")
    public final synchronized void method734() {
        Container var1 = this.method753();
        if (this.field444 != null) {
            this.field444.removeFocusListener(this);
            var1.remove(this.field444);
        }
        Statics.field1983 = Math.max(var1.getWidth(), this.field439);
        Statics.field42 = Math.max(var1.getHeight(), this.field440);
        if (this.field443 != null) {
            Insets var2 = this.field443.getInsets();
            Statics.field1983 -= var2.right + var2.left;
            Statics.field42 -= var2.top + var2.bottom;
        }
        this.field444 = new class43(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field444);
        this.field444.setSize(Statics.field1983, Statics.field42);
        this.field444.setVisible(true);
        this.field444.setBackground(Color.BLACK);
        if (this.field443 == var1) {
            Insets var3 = this.field443.getInsets();
            this.field444.setLocation(this.field436 + var3.left, this.field438 + var3.top);
        } else {
            this.field444.setLocation(this.field436, this.field438);
        }
        this.field444.addFocusListener(this);
        this.field444.requestFocus();
        this.field445 = true;
        if (Statics.field1928 != null && Statics.field1983 == Statics.field1928.field3832 && Statics.field42 == Statics.field1928.field3834) {
            ((class47) Statics.field1928).method710(this.field444);
            Statics.field1928.method711(0, 0);
        } else {
            Statics.field1928 = new class47(Statics.field1983, Statics.field42, this.field444);
        }
        this.field424 = false;
        this.field457 = class187.method918();
    }

    @ObfuscatedName("am.y(I)Z")
    public final boolean method735() {
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
                this.method752("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field3766 != null) {
                String var1 = Statics.field3766.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field483;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method752("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class308.method1672(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class308.method954(var4) && class308.method4393(var4) < 10) {
                            this.method752("wrongjava");
                            return;
                        }
                    }
                    field430 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method734();
            this.method747();
            Statics.field304 = class163.method468();
            while (field425 == 0L || class187.method918() < field425) {
                Statics.field447 = Statics.field304.method2955(field429, field430);
                for (int var5 = 0; var5 < Statics.field447; var5++) {
                    this.method805();
                }
                this.method727();
                this.method724(this.field444);
            }
        } catch (Exception var7) {
            class155.method1451((String) null, var7);
            this.method752("crash");
        }
        this.method809();
    }

    @ObfuscatedName("am.u(I)V")
    public void method805() {
        long var1 = class187.method918();
        long var3 = field434[Statics.field94];
        field434[Statics.field94] = var1;
        Statics.field94 = Statics.field94 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field3252 = field456;
        }
        this.method861();
    }

    @ObfuscatedName("am.ah(B)V")
    public void method727() {
        Container var1 = this.method753();
        long var2 = class187.method918();
        long var4 = field432[Statics.field449];
        field432[Statics.field449] = var2;
        Statics.field449 = Statics.field449 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field431 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field446 - 1 > 50) {
            field446 -= 50;
            this.field445 = true;
            this.field444.setSize(Statics.field1983, Statics.field42);
            this.field444.setVisible(true);
            if (this.field443 == var1) {
                Insets var7 = this.field443.getInsets();
                this.field444.setLocation(this.field436 + var7.left, this.field438 + var7.top);
            } else {
                this.field444.setLocation(this.field436, this.field438);
            }
        }
        if (this.field424) {
            this.method732();
        }
        this.method738();
        this.method748(this.field445);
        if (this.field445) {
            this.method731();
        }
        this.field445 = false;
    }

    @ObfuscatedName("am.ab(I)V")
    public final void method738() {
        class316 var1 = this.method754();
        if (this.field435 != var1.field3808 || this.field454 != var1.field3803 || this.field422) {
            this.method812();
            this.field422 = false;
        }
    }

    @ObfuscatedName("am.aa(B)V")
    public final void method739() {
        this.field422 = true;
    }

    @ObfuscatedName("am.ac(I)V")
    public final synchronized void method809() {
        if (field426) {
            return;
        }
        field426 = true;
        try {
            this.field444.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method794();
        } catch (Exception var7) {
        }
        if (this.field443 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field442 != null) {
            try {
                Statics.field442.method2983();
            } catch (Exception var5) {
            }
        }
        this.method756();
    }

    @ObfuscatedName("ac.ad(I)V")
    public static final void method619() {
        Statics.field304.method2950();
        for (int var0 = 0; var0 < 32; var0++) {
            field432[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field434[var1] = 0L;
        }
        Statics.field447 = 0;
    }

    public final void start() {
        if (field423 == this && !field426) {
            field425 = 0L;
        }
    }

    public final void stop() {
        if (field423 == this && !field426) {
            field425 = class187.method918() + 4000L;
        }
    }

    public final void destroy() {
        if (field423 == this && !field426) {
            field425 = class187.method918();
            class194.method672(5000L);
            this.method809();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field423 != this || field426) {
            return;
        }
        this.field445 = true;
        if (class187.method918() - this.field457 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1983 && var2.height >= Statics.field42) {
                this.field424 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field456 = true;
        this.field445 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field456 = false;
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

    @ObfuscatedName("am.ap(ILjava/lang/String;ZI)V")
    public final void method750(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field444.getGraphics();
            if (Statics.field328 == null) {
                Statics.field328 = new Font("Helvetica", 1, 13);
                Statics.field3312 = this.field444.getFontMetrics(Statics.field328);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field1983, Statics.field42);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field3624 == null) {
                    Statics.field3624 = this.field444.createImage(304, 34);
                }
                Graphics var6 = Statics.field3624.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field328);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field3312.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field3624, Statics.field1983 / 2 - 152, Statics.field42 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field1983 / 2 - 152;
                int var9 = Statics.field42 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field328);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field3312.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field444.repaint();
        }
    }

    @ObfuscatedName("am.aw(I)V")
    public final void method751() {
        Statics.field3624 = null;
        Statics.field328 = null;
        Statics.field3312 = null;
    }

    @ObfuscatedName("am.al(Ljava/lang/String;I)V")
    public void method752(String arg0) {
        if (this.field427) {
            return;
        }
        this.field427 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("am.ar(I)Ljava/awt/Container;")
    public Container method753() {
        return this.field443 == null ? this : this.field443;
    }

    @ObfuscatedName("am.au(I)Lll;")
    public class316 method754() {
        Container var1 = this.method753();
        int var2 = Math.max(var1.getWidth(), this.field439);
        int var3 = Math.max(var1.getHeight(), this.field440);
        if (this.field443 != null) {
            Insets var4 = this.field443.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class316(var2, var3);
    }

    @ObfuscatedName("am.av(I)Z")
    public final boolean method755() {
        return this.field443 != null;
    }

    @ObfuscatedName("am.x(B)V")
    public abstract void method730();

    public abstract void init();

    @ObfuscatedName("am.aq(I)V")
    public abstract void method747();

    @ObfuscatedName("am.an(ZI)V")
    public abstract void method748(boolean arg0);

    @ObfuscatedName("am.am(I)V")
    public abstract void method756();

    @ObfuscatedName("am.ag(B)V")
    public abstract void method794();

    @ObfuscatedName("am.ax(I)V")
    public abstract void method861();
}
