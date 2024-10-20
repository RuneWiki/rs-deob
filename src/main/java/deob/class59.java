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

@ObfuscatedName("bx")
public abstract class class59 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bx.j")
    public static class59 field703 = null;

    @ObfuscatedName("bx.a")
    public static int field704 = 0;

    @ObfuscatedName("bx.r")
    public static long field705 = 0L;

    @ObfuscatedName("bx.o")
    public static boolean field737 = false;

    @ObfuscatedName("bx.n")
    public boolean field724 = false;

    @ObfuscatedName("bx.b")
    public static int field708 = 20;

    @ObfuscatedName("bx.k")
    public static int field717 = 1;

    @ObfuscatedName("bx.s")
    public static int field710 = 0;

    @ObfuscatedName("bx.t")
    public static long[] field712 = new long[32];

    @ObfuscatedName("bx.c")
    public static long[] field707 = new long[32];

    @ObfuscatedName("bx.u")
    public int field702;

    @ObfuscatedName("bx.e")
    public int field715;

    @ObfuscatedName("bx.p")
    public int field716 = 0;

    @ObfuscatedName("bx.m")
    public int field709 = 0;

    @ObfuscatedName("bx.g")
    public int field726;

    @ObfuscatedName("bx.ar")
    public int field720;

    @ObfuscatedName("bx.ax")
    public int field713;

    @ObfuscatedName("bx.al")
    public int field721;

    @ObfuscatedName("bx.ab")
    public Frame field722;

    @ObfuscatedName("bx.am")
    public Canvas field723;

    @ObfuscatedName("bx.aq")
    public volatile boolean field728 = true;

    @ObfuscatedName("bx.az")
    public static int field718 = 500;

    @ObfuscatedName("bx.ac")
    public boolean field714 = false;

    @ObfuscatedName("bx.aa")
    public volatile boolean field727 = false;

    @ObfuscatedName("bx.aj")
    public volatile long field725 = 0L;

    @ObfuscatedName("bx.ao")
    public class50 field729;

    @ObfuscatedName("bx.aw")
    public Clipboard field730;

    @ObfuscatedName("bx.ah")
    public final EventQueue field731;

    @ObfuscatedName("bx.an")
    public static volatile boolean field732 = true;

    @ObfuscatedName("bx.as")
    public static long field734 = -1L;

    @ObfuscatedName("bx.ap")
    public static long field735 = -1L;

    public class59() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field731 = var1;
        class52 var3 = new class52();
        Statics.field587 = var3;
    }

    @ObfuscatedName("bx.o(IIB)V")
    public final void method775(int arg0, int arg1) {
        if (this.field713 != arg0 || this.field721 != arg1) {
            this.method799();
        }
        this.field713 = arg0;
        this.field721 = arg1;
    }

    @ObfuscatedName("bx.n(Ljava/lang/Object;I)V")
    public final void method776(Object arg0) {
        if (this.field731 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field731.peekEvent() != null; var2++) {
            Statics.method1558(1L);
        }
        if (arg0 != null) {
            this.field731.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bx.q(I)Lfo;")
    public class158 method777() {
        if (this.field729 == null) {
            this.field729 = new class50();
            this.field729.method663(this.field723);
        }
        return this.field729;
    }

    @ObfuscatedName("bx.b(I)V")
    public void method842() {
        this.field730 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bx.k(Ljava/lang/String;I)V")
    public void method803(String arg0) {
        this.field730.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bx.s(I)V")
    public final void method908() {
        class51.method37();
        Canvas var1 = this.field723;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class51.field660);
        var1.addFocusListener(class51.field660);
    }

    @ObfuscatedName("bx.d(I)V")
    public final void method849() {
        class60.method3951(this.field723);
    }

    @ObfuscatedName("bx.l(I)V")
    public final void method853() {
        Container var1 = this.method807();
        if (var1 == null) {
            return;
        }
        class280 var2 = this.method808();
        this.field702 = Math.max(var2.field3742, this.field726);
        this.field715 = Math.max(var2.field3743, this.field720);
        if (this.field702 <= 0) {
            this.field702 = 1;
        }
        if (this.field715 <= 0) {
            this.field715 = 1;
        }
        Statics.field1467 = Math.min(this.field702, this.field713);
        Statics.field801 = Math.min(this.field715, this.field721);
        this.field716 = (this.field702 - Statics.field1467) / 2;
        this.field709 = 0;
        this.field723.setSize(Statics.field1467, Statics.field801);
        Statics.field343 = new class58(Statics.field1467, Statics.field801, this.field723);
        if (this.field722 == var1) {
            Insets var3 = this.field722.getInsets();
            this.field723.setLocation(this.field716 + var3.left, this.field709 + var3.top);
        } else {
            this.field723.setLocation(this.field716, this.field709);
        }
        this.field728 = true;
        this.method783();
    }

    @ObfuscatedName("bx.u(B)V")
    public void method834() {
        int var1 = this.field716;
        int var2 = this.field709;
        int var3 = this.field702 - Statics.field1467 - var1;
        int var4 = this.field715 - Statics.field801 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method807();
            int var6 = 0;
            int var7 = 0;
            if (this.field722 == var5) {
                Insets var8 = this.field722.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field715);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field702, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field702 + var6 - var3, var7, var3, this.field715);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field715 + var7 - var4, this.field702, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bx.e(I)V")
    public final void method784() {
        Canvas var1 = this.field723;
        var1.removeKeyListener(class51.field660);
        var1.removeFocusListener(class51.field660);
        class51.field655 = -1;
        class60.method3654(this.field723);
        if (this.field729 != null) {
            this.field729.method665(this.field723);
        }
        this.method786();
        Canvas var2 = this.field723;
        var2.setFocusTraversalKeysEnabled(false);
        var2.addKeyListener(class51.field660);
        var2.addFocusListener(class51.field660);
        class60.method3951(this.field723);
        if (this.field729 != null) {
            this.field729.method663(this.field723);
        }
        this.method799();
    }

    @ObfuscatedName("bx.p(IIIB)V")
    public final void method785(int arg0, int arg1, int arg2) {
        try {
            if (field703 != null) {
                field704++;
                if (field704 >= 3) {
                    this.method819("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field703 = this;
            Statics.field1467 = arg0;
            Statics.field801 = arg1;
            Statics.field36 = arg2;
            Statics.field2229 = this;
            if (Statics.field706 == null) {
                Statics.field706 = new class156();
            }
            Statics.field706.method2770(this, 1);
        } catch (Exception var5) {
            class154.method2746((String) null, var5);
            this.method819("crash");
        }
    }

    @ObfuscatedName("bx.m(I)V")
    public final synchronized void method786() {
        Container var1 = this.method807();
        if (this.field723 != null) {
            this.field723.removeFocusListener(this);
            var1.remove(this.field723);
        }
        Statics.field1467 = Math.max(var1.getWidth(), this.field726);
        Statics.field801 = Math.max(var1.getHeight(), this.field720);
        if (this.field722 != null) {
            Insets var2 = this.field722.getInsets();
            Statics.field1467 -= var2.right + var2.left;
            Statics.field801 -= var2.top + var2.bottom;
        }
        this.field723 = new class54(this);
        var1.add(this.field723);
        this.field723.setSize(Statics.field1467, Statics.field801);
        this.field723.setVisible(true);
        this.field723.setBackground(Color.BLACK);
        if (this.field722 == var1) {
            Insets var3 = this.field722.getInsets();
            this.field723.setLocation(this.field716 + var3.left, this.field709 + var3.top);
        } else {
            this.field723.setLocation(this.field716, this.field709);
        }
        this.field723.addFocusListener(this);
        this.field723.requestFocus();
        this.field728 = true;
        if (Statics.field343 != null && Statics.field1467 == Statics.field343.field3767 && Statics.field801 == Statics.field343.field3769) {
            ((class58) Statics.field343).method759(this.field723);
            Statics.field343.method760(0, 0);
        } else {
            Statics.field343 = new class58(Statics.field1467, Statics.field801, this.field723);
        }
        this.field727 = false;
        this.field725 = class177.method608();
    }

    @ObfuscatedName("bx.x(I)Z")
    public final boolean method780() {
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
                this.method819("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2243 != null) {
                String var1 = Statics.field2243.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2343;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method819("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class272.method715(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        boolean var5 = false;
                        boolean var6 = false;
                        int var7 = 0;
                        int var8 = var4.length();
                        int var9 = 0;
                        boolean var11;
                        while (true) {
                            if (var9 >= var8) {
                                var11 = var6;
                                break;
                            }
                            label171: {
                                char var10 = var4.charAt(var9);
                                if (var9 == 0) {
                                    if (var10 == '-') {
                                        var5 = true;
                                        break label171;
                                    }
                                    if (var10 == '+') {
                                        break label171;
                                    }
                                }
                                int var21;
                                if (var10 >= '0' && var10 <= '9') {
                                    var21 = var10 - '0';
                                } else if (var10 >= 'A' && var10 <= 'Z') {
                                    var21 = var10 - '7';
                                } else {
                                    if (var10 < 'a' || var10 > 'z') {
                                        var11 = false;
                                        break;
                                    }
                                    var21 = var10 - 'W';
                                }
                                if (var21 >= 10) {
                                    var11 = false;
                                    break;
                                }
                                if (var5) {
                                    var21 = -var21;
                                }
                                int var12 = var7 * 10 + var21;
                                if (var12 / 10 != var7) {
                                    var11 = false;
                                    break;
                                }
                                var7 = var12;
                                var6 = true;
                            }
                            var9++;
                        }
                        if (var11) {
                            int var14 = class272.method3811(var4, 10, true);
                            if (var14 < 10) {
                                this.method819("wrongjava");
                                return;
                            }
                        }
                    }
                    field717 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method786();
            this.method883();
            class160 var15;
            try {
                var15 = new class152();
            } catch (Throwable var19) {
                var15 = new class153();
            }
            Statics.field711 = var15;
            while (field705 == 0L || class177.method608() < field705) {
                Statics.field306 = Statics.field711.method2748(field708, field717);
                for (int var17 = 0; var17 < Statics.field306; var17++) {
                    this.method789();
                }
                this.method790();
                this.method776(this.field723);
            }
        } catch (Exception var20) {
            class154.method2746((String) null, var20);
            this.method819("crash");
        }
        this.method793();
    }

    @ObfuscatedName("bx.g(I)V")
    public void method789() {
        long var1 = class177.method608();
        long var3 = field707[Statics.field617];
        field707[Statics.field617] = var1;
        Statics.field617 = Statics.field617 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field733 = field732;
        }
        this.method817();
    }

    @ObfuscatedName("bx.w(I)V")
    public void method790() {
        Container var1 = this.method807();
        long var2 = class177.method608();
        long var4 = field712[Statics.field21];
        field712[Statics.field21] = var2;
        Statics.field21 = Statics.field21 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field710 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field718 - 1 > 50) {
            field718 -= 50;
            this.field728 = true;
            this.field723.setSize(Statics.field1467, Statics.field801);
            this.field723.setVisible(true);
            if (this.field722 == var1) {
                Insets var7 = this.field722.getInsets();
                this.field723.setLocation(this.field716 + var7.left, this.field709 + var7.top);
            } else {
                this.field723.setLocation(this.field716, this.field709);
            }
        }
        if (this.field727) {
            this.method784();
        }
        this.method791();
        this.method844(this.field728);
        if (this.field728) {
            this.method834();
        }
        this.field728 = false;
    }

    @ObfuscatedName("bx.ar(I)V")
    public final void method791() {
        class280 var1 = this.method808();
        if (this.field702 != var1.field3742 || this.field715 != var1.field3743 || this.field714) {
            this.method853();
            this.field714 = false;
        }
    }

    @ObfuscatedName("bx.ax(B)V")
    public final void method799() {
        this.field714 = true;
    }

    @ObfuscatedName("bx.at(B)V")
    public final synchronized void method793() {
        if (field737) {
            return;
        }
        field737 = true;
        try {
            this.field723.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method804();
        } catch (Exception var7) {
        }
        if (this.field722 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field706 != null) {
            try {
                Statics.field706.method2772();
            } catch (Exception var5) {
            }
        }
        this.method881();
    }

    public final void start() {
        if (field703 == this && !field737) {
            field705 = 0L;
        }
    }

    public final void stop() {
        if (field703 == this && !field737) {
            field705 = class177.method608() + 4000L;
        }
    }

    public final void destroy() {
        if (field703 == this && !field737) {
            field705 = class177.method608();
            Statics.method1558(5000L);
            this.method793();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field703 != this || field737) {
            return;
        }
        this.field728 = true;
        if (class177.method608() - this.field725 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1467 && var2.height >= Statics.field801) {
                this.field727 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field732 = true;
        this.field728 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field732 = false;
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

    @ObfuscatedName("bx.ay(ILjava/lang/String;ZB)V")
    public final void method795(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field723.getGraphics();
            if (Statics.field355 == null) {
                Statics.field355 = new Font("Helvetica", 1, 13);
                Statics.field2855 = this.field723.getFontMetrics(Statics.field355);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field1467, Statics.field801);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field461 == null) {
                    Statics.field461 = this.field723.createImage(304, 34);
                }
                Graphics var6 = Statics.field461.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field355);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field2855.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field461, Statics.field1467 / 2 - 152, Statics.field801 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field1467 / 2 - 152;
                int var9 = Statics.field801 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field355);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field2855.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field723.repaint();
        }
    }

    @ObfuscatedName("bx.av(I)V")
    public final void method805() {
        Statics.field461 = null;
        Statics.field355 = null;
        Statics.field2855 = null;
    }

    @ObfuscatedName("bx.ao(Ljava/lang/String;B)V")
    public void method819(String arg0) {
        if (this.field724) {
            return;
        }
        this.field724 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bx.aw(I)Ljava/awt/Container;")
    public Container method807() {
        return this.field722 == null ? this : this.field722;
    }

    @ObfuscatedName("bx.ah(S)Ljd;")
    public class280 method808() {
        Container var1 = this.method807();
        int var2 = Math.max(var1.getWidth(), this.field726);
        int var3 = Math.max(var1.getHeight(), this.field720);
        if (this.field722 != null) {
            Insets var4 = this.field722.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class280(var2, var3);
    }

    @ObfuscatedName("bx.an(I)Z")
    public final boolean method809() {
        return this.field722 != null;
    }

    @ObfuscatedName("bx.c(B)V")
    public abstract void method783();

    @ObfuscatedName("bx.aj(I)V")
    public abstract void method804();

    public abstract void init();

    @ObfuscatedName("bx.ac(I)V")
    public abstract void method817();

    @ObfuscatedName("bx.aa(ZI)V")
    public abstract void method844(boolean arg0);

    @ObfuscatedName("bx.af(I)V")
    public abstract void method881();

    @ObfuscatedName("bx.az(I)V")
    public abstract void method883();
}
