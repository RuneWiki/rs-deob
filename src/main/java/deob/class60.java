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
import java.net.URL;

@ObfuscatedName("br")
public abstract class class60 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("br.k")
    public static class60 field706 = null;

    @ObfuscatedName("br.t")
    public static int field711 = 0;

    @ObfuscatedName("br.d")
    public static long field682 = 0L;

    @ObfuscatedName("br.h")
    public static boolean field691 = false;

    @ObfuscatedName("br.m")
    public boolean field684 = false;

    @ObfuscatedName("br.i")
    public static int field686 = 20;

    @ObfuscatedName("br.u")
    public static int field687 = 1;

    @ObfuscatedName("br.a")
    public static int field699 = 0;

    @ObfuscatedName("br.s")
    public static long[] field689 = new long[32];

    @ObfuscatedName("br.q")
    public static long[] field710 = new long[32];

    @ObfuscatedName("br.j")
    public int field681;

    @ObfuscatedName("br.b")
    public int field713;

    @ObfuscatedName("br.g")
    public int field693 = 0;

    @ObfuscatedName("br.f")
    public int field694 = 0;

    @ObfuscatedName("br.c")
    public int field679;

    @ObfuscatedName("br.ab")
    public int field695;

    @ObfuscatedName("br.ap")
    public int field697;

    @ObfuscatedName("br.ag")
    public int field690;

    @ObfuscatedName("br.al")
    public Frame field680;

    @ObfuscatedName("br.ah")
    public Canvas field700;

    @ObfuscatedName("br.af")
    public volatile boolean field701 = true;

    @ObfuscatedName("br.ai")
    public static int field702 = 500;

    @ObfuscatedName("br.az")
    public boolean field703 = false;

    @ObfuscatedName("br.aa")
    public volatile boolean field704 = false;

    @ObfuscatedName("br.av")
    public volatile long field705 = 0L;

    @ObfuscatedName("br.ax")
    public class51 field688;

    @ObfuscatedName("br.ad")
    public Clipboard field707;

    @ObfuscatedName("br.au")
    public final EventQueue field708;

    @ObfuscatedName("br.ar")
    public static volatile boolean field709 = true;

    @ObfuscatedName("br.aw")
    public static long field692 = -1L;

    @ObfuscatedName("br.ak")
    public static long field698 = -1L;

    public class60() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field708 = var1;
        class53 var3 = new class53();
        Statics.field1565 = var3;
    }

    @ObfuscatedName("br.d(III)V")
    public final void method781(int arg0, int arg1) {
        if (this.field697 != arg0 || this.field690 != arg1) {
            this.method798();
        }
        this.field697 = arg0;
        this.field690 = arg1;
    }

    @ObfuscatedName("br.h(Ljava/lang/Object;I)V")
    public final void method889(Object arg0) {
        if (this.field708 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field708.peekEvent() != null; var2++) {
            class204.method12(1L);
        }
        if (arg0 != null) {
            this.field708.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("br.m(B)Lfp;")
    public class169 method783() {
        if (this.field688 == null) {
            this.field688 = new class51();
            this.field688.method670(this.field700);
        }
        return this.field688;
    }

    @ObfuscatedName("br.z(I)V")
    public void method879() {
        this.field707 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("br.i(Ljava/lang/String;I)V")
    public void method785(String arg0) {
        this.field707.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("br.u(I)V")
    public final void method786() {
        if (Statics.field2215.toLowerCase().indexOf("microsoft") == -1) {
            class52.field615[44] = 71;
            class52.field615[45] = 26;
            class52.field615[46] = 72;
            class52.field615[47] = 73;
            class52.field615[59] = 57;
            class52.field615[61] = 27;
            class52.field615[91] = 42;
            class52.field615[92] = 74;
            class52.field615[93] = 43;
            class52.field615[192] = 28;
            class52.field615[222] = 58;
            class52.field615[520] = 59;
        } else {
            class52.field615[186] = 57;
            class52.field615[187] = 27;
            class52.field615[188] = 71;
            class52.field615[189] = 26;
            class52.field615[190] = 72;
            class52.field615[191] = 73;
            class52.field615[192] = 58;
            class52.field615[219] = 42;
            class52.field615[220] = 74;
            class52.field615[221] = 43;
            class52.field615[222] = 59;
            class52.field615[223] = 28;
        }
        class52.method175(this.field700);
    }

    @ObfuscatedName("br.x(B)V")
    public final void method787() {
        Canvas var1 = this.field700;
        var1.addMouseListener(class61.field718);
        var1.addMouseMotionListener(class61.field718);
        var1.addFocusListener(class61.field718);
    }

    @ObfuscatedName("br.y(I)V")
    public final void method788() {
        Container var1 = this.method827();
        if (var1 == null) {
            return;
        }
        class324 var2 = this.method812();
        this.field681 = Math.max(var2.field3943, this.field679);
        this.field713 = Math.max(var2.field3945, this.field695);
        if (this.field681 <= 0) {
            this.field681 = 1;
        }
        if (this.field713 <= 0) {
            this.field713 = 1;
        }
        Statics.field472 = Math.min(this.field681, this.field697);
        Statics.field3509 = Math.min(this.field713, this.field690);
        this.field693 = (this.field681 - Statics.field472) / 2;
        this.field694 = 0;
        this.field700.setSize(Statics.field472, Statics.field3509);
        Statics.field535 = new class59(Statics.field472, Statics.field3509, this.field700);
        if (this.field680 == var1) {
            Insets var3 = this.field680.getInsets();
            this.field700.setLocation(this.field693 + var3.left, this.field694 + var3.top);
        } else {
            this.field700.setLocation(this.field693, this.field694);
        }
        this.field701 = true;
        this.method789();
    }

    @ObfuscatedName("br.v(I)V")
    public void method790() {
        int var1 = this.field693;
        int var2 = this.field694;
        int var3 = this.field681 - Statics.field472 - var1;
        int var4 = this.field713 - Statics.field3509 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method827();
            int var6 = 0;
            int var7 = 0;
            if (this.field680 == var5) {
                Insets var8 = this.field680.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field713);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field681, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field681 + var6 - var3, var7, var3, this.field713);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field713 + var7 - var4, this.field681, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("br.q(I)V")
    public final void method791() {
        class52.method2318(this.field700);
        Canvas var1 = this.field700;
        var1.removeMouseListener(class61.field718);
        var1.removeMouseMotionListener(class61.field718);
        var1.removeFocusListener(class61.field718);
        class61.field720 = 0;
        if (this.field688 != null) {
            this.field688.method664(this.field700);
        }
        this.method858();
        class52.method175(this.field700);
        Canvas var2 = this.field700;
        var2.addMouseListener(class61.field718);
        var2.addMouseMotionListener(class61.field718);
        var2.addFocusListener(class61.field718);
        if (this.field688 != null) {
            this.field688.method670(this.field700);
        }
        this.method798();
    }

    @ObfuscatedName("br.r(IIIB)V")
    public final void method877(int arg0, int arg1, int arg2) {
        try {
            if (field706 != null) {
                field711++;
                if (field711 >= 3) {
                    this.method810("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field706 = this;
            Statics.field472 = arg0;
            Statics.field3509 = arg1;
            Statics.field2197 = arg2;
            Statics.field2199 = this;
            if (Statics.field683 == null) {
                Statics.field683 = new class167();
            }
            Statics.field683.method2972(this, 1);
        } catch (Exception var5) {
            class165.method1744((String) null, var5);
            this.method810("crash");
        }
    }

    @ObfuscatedName("br.j(I)V")
    public final synchronized void method858() {
        Container var1 = this.method827();
        if (this.field700 != null) {
            this.field700.removeFocusListener(this);
            var1.remove(this.field700);
        }
        Statics.field472 = Math.max(var1.getWidth(), this.field679);
        Statics.field3509 = Math.max(var1.getHeight(), this.field695);
        if (this.field680 != null) {
            Insets var2 = this.field680.getInsets();
            Statics.field472 -= var2.right + var2.left;
            Statics.field3509 -= var2.top + var2.bottom;
        }
        this.field700 = new class55(this);
        var1.add(this.field700);
        this.field700.setSize(Statics.field472, Statics.field3509);
        this.field700.setVisible(true);
        this.field700.setBackground(Color.BLACK);
        if (this.field680 == var1) {
            Insets var3 = this.field680.getInsets();
            this.field700.setLocation(this.field693 + var3.left, this.field694 + var3.top);
        } else {
            this.field700.setLocation(this.field693, this.field694);
        }
        this.field700.addFocusListener(this);
        this.field700.requestFocus();
        this.field701 = true;
        if (Statics.field535 != null && Statics.field472 == Statics.field535.field3965 && Statics.field3509 == Statics.field535.field3963) {
            ((class59) Statics.field535).method761(this.field700);
            Statics.field535.method762(0, 0);
        } else {
            Statics.field535 = new class59(Statics.field472, Statics.field3509, this.field700);
        }
        this.field704 = false;
        this.field705 = class197.method1005();
    }

    @ObfuscatedName("br.b(B)Z")
    public final boolean method794() {
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
                this.method810("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2215 != null) {
                String var1 = Statics.field2215.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2210;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method810("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class319.method998(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class319.method26(var4)) {
                            int var5 = class319.method2871(var4, 10, true);
                            if (var5 < 10) {
                                this.method810("wrongjava");
                                return;
                            }
                        }
                    }
                    field687 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method858();
            this.method914();
            class173 var6;
            try {
                var6 = new class162();
            } catch (Throwable var10) {
                var6 = new class163();
            }
            Statics.field2131 = var6;
            while (field682 == 0L || class197.method1005() < field682) {
                Statics.field685 = Statics.field2131.method2933(field686, field687);
                for (int var8 = 0; var8 < Statics.field685; var8++) {
                    this.method902();
                }
                this.method797();
                this.method889(this.field700);
            }
        } catch (Exception var11) {
            class165.method1744((String) null, var11);
            this.method810("crash");
        }
        this.method799();
    }

    @ObfuscatedName("br.g(I)V")
    public void method902() {
        long var1 = class197.method1005();
        long var3 = field710[Statics.field1349];
        field710[Statics.field1349] = var1;
        Statics.field1349 = Statics.field1349 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field2799 = field709;
        }
        this.method805();
    }

    @ObfuscatedName("br.f(I)V")
    public void method797() {
        Container var1 = this.method827();
        long var2 = class197.method1005();
        long var4 = field689[Statics.field3023];
        field689[Statics.field3023] = var2;
        Statics.field3023 = Statics.field3023 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field699 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field702 - 1 > 50) {
            field702 -= 50;
            this.field701 = true;
            this.field700.setSize(Statics.field472, Statics.field3509);
            this.field700.setVisible(true);
            if (this.field680 == var1) {
                Insets var7 = this.field680.getInsets();
                this.field700.setLocation(this.field693 + var7.left, this.field694 + var7.top);
            } else {
                this.field700.setLocation(this.field693, this.field694);
            }
        }
        if (this.field704) {
            this.method791();
        }
        this.method819();
        this.method892(this.field701);
        if (this.field701) {
            this.method790();
        }
        this.field701 = false;
    }

    @ObfuscatedName("br.p(I)V")
    public final void method819() {
        class324 var1 = this.method812();
        if (this.field681 != var1.field3943 || this.field713 != var1.field3945 || this.field703) {
            this.method788();
            this.field703 = false;
        }
    }

    @ObfuscatedName("br.e(B)V")
    public final void method798() {
        this.field703 = true;
    }

    @ObfuscatedName("br.c(I)V")
    public final synchronized void method799() {
        if (field691) {
            return;
        }
        field691 = true;
        try {
            this.field700.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method807();
        } catch (Exception var7) {
        }
        if (this.field680 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field683 != null) {
            try {
                Statics.field683.method2969();
            } catch (Exception var5) {
            }
        }
        this.method814();
    }

    public final void start() {
        if (field706 == this && !field691) {
            field682 = 0L;
        }
    }

    public final void stop() {
        if (field706 == this && !field691) {
            field682 = class197.method1005() + 4000L;
        }
    }

    public final void destroy() {
        if (field706 == this && !field691) {
            field682 = class197.method1005();
            class204.method12(5000L);
            this.method799();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field706 != this || field691) {
            return;
        }
        this.field701 = true;
        if (class197.method1005() - this.field705 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field472 && var2.height >= Statics.field3509) {
                this.field704 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field709 = true;
        this.field701 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field709 = false;
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

    @ObfuscatedName("br.av(ILjava/lang/String;ZI)V")
    public final void method808(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field700.getGraphics();
            if (Statics.field1601 == null) {
                Statics.field1601 = new Font("Helvetica", 1, 13);
                Statics.field1480 = this.field700.getFontMetrics(Statics.field1601);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field472, Statics.field3509);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field305 == null) {
                    Statics.field305 = this.field700.createImage(304, 34);
                }
                Graphics var6 = Statics.field305.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field1601);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field1480.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field305, Statics.field472 / 2 - 152, Statics.field3509 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field472 / 2 - 152;
                int var9 = Statics.field3509 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1601);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field1480.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field700.repaint();
        }
    }

    @ObfuscatedName("br.am(I)V")
    public final void method809() {
        Statics.field305 = null;
        Statics.field1601 = null;
        Statics.field1480 = null;
    }

    @ObfuscatedName("br.ao(Ljava/lang/String;I)V")
    public void method810(String arg0) {
        if (this.field684) {
            return;
        }
        this.field684 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("br.ax(I)Ljava/awt/Container;")
    public Container method827() {
        return this.field680 == null ? this : this.field680;
    }

    @ObfuscatedName("br.ad(I)Llx;")
    public class324 method812() {
        Container var1 = this.method827();
        int var2 = Math.max(var1.getWidth(), this.field679);
        int var3 = Math.max(var1.getHeight(), this.field695);
        if (this.field680 != null) {
            Insets var4 = this.field680.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class324(var2, var3);
    }

    @ObfuscatedName("br.au(I)Z")
    public final boolean method813() {
        return this.field680 != null;
    }

    @ObfuscatedName("br.a(I)V")
    public abstract void method789();

    public abstract void init();

    @ObfuscatedName("br.at(B)V")
    public abstract void method805();

    @ObfuscatedName("br.aa(B)V")
    public abstract void method807();

    @ObfuscatedName("br.ar(I)V")
    public abstract void method814();

    @ObfuscatedName("br.ac(ZB)V")
    public abstract void method892(boolean arg0);

    @ObfuscatedName("br.ag(B)V")
    public abstract void method914();
}
