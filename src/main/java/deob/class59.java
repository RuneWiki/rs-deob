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

@ObfuscatedName("bp")
public abstract class class59 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bp.m")
    public static class59 field696 = null;

    @ObfuscatedName("bp.e")
    public static int field694 = 0;

    @ObfuscatedName("bp.t")
    public static long field695 = 0L;

    @ObfuscatedName("bp.z")
    public static boolean field707 = false;

    @ObfuscatedName("bp.j")
    public boolean field713 = false;

    @ObfuscatedName("bp.f")
    public static int field693 = 20;

    @ObfuscatedName("bp.c")
    public static int field715 = 1;

    @ObfuscatedName("bp.o")
    public static int field714 = 0;

    @ObfuscatedName("bp.a")
    public static long[] field703 = new long[32];

    @ObfuscatedName("bp.v")
    public static long[] field704 = new long[32];

    @ObfuscatedName("bp.k")
    public int field705;

    @ObfuscatedName("bp.r")
    public int field706;

    @ObfuscatedName("bp.l")
    public int field702 = 0;

    @ObfuscatedName("bp.h")
    public int field699 = 0;

    @ObfuscatedName("bp.u")
    public int field709;

    @ObfuscatedName("bp.av")
    public int field710;

    @ObfuscatedName("bp.ax")
    public int field711;

    @ObfuscatedName("bp.af")
    public int field712;

    @ObfuscatedName("bp.ak")
    public Frame field701;

    @ObfuscatedName("bp.al")
    public Canvas field724;

    @ObfuscatedName("bp.ab")
    public volatile boolean field700 = true;

    @ObfuscatedName("bp.ar")
    public static int field717 = 500;

    @ObfuscatedName("bp.ao")
    public boolean field718 = false;

    @ObfuscatedName("bp.ac")
    public volatile boolean field719 = false;

    @ObfuscatedName("bp.aa")
    public volatile long field720 = 0L;

    @ObfuscatedName("bp.ag")
    public class50 field721;

    @ObfuscatedName("bp.aq")
    public Clipboard field722;

    @ObfuscatedName("bp.as")
    public final EventQueue field723;

    @ObfuscatedName("bp.an")
    public static volatile boolean field697 = true;

    public class59() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field723 = var1;
        class110.method34(new class52());
    }

    @ObfuscatedName("bp.z(IIB)V")
    public final void method726(int arg0, int arg1) {
        if (this.field711 != arg0 || this.field712 != arg1) {
            this.method788();
        }
        this.field711 = arg0;
        this.field712 = arg1;
    }

    @ObfuscatedName("bp.j(Ljava/lang/Object;I)V")
    public final void method756(Object arg0) {
        if (this.field723 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field723.peekEvent() != null; var2++) {
            class182.method2791(1L);
        }
        if (arg0 != null) {
            this.field723.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bp.c(I)Lfg;")
    public class157 method741() {
        if (this.field721 == null) {
            this.field721 = new class50();
            this.field721.method625(this.field724);
        }
        return this.field721;
    }

    @ObfuscatedName("bp.o(I)V")
    public void method729() {
        this.field722 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bp.q(Ljava/lang/String;I)V")
    public void method744(String arg0) {
        this.field722.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bp.n(B)V")
    public final void method731() {
        if (Statics.field2243.toLowerCase().indexOf("microsoft") == -1) {
            class51.field663[44] = 71;
            class51.field663[45] = 26;
            class51.field663[46] = 72;
            class51.field663[47] = 73;
            class51.field663[59] = 57;
            class51.field663[61] = 27;
            class51.field663[91] = 42;
            class51.field663[92] = 74;
            class51.field663[93] = 43;
            class51.field663[192] = 28;
            class51.field663[222] = 58;
            class51.field663[520] = 59;
        } else {
            class51.field663[186] = 57;
            class51.field663[187] = 27;
            class51.field663[188] = 71;
            class51.field663[189] = 26;
            class51.field663[190] = 72;
            class51.field663[191] = 73;
            class51.field663[192] = 58;
            class51.field663[219] = 42;
            class51.field663[220] = 74;
            class51.field663[221] = 43;
            class51.field663[222] = 59;
            class51.field663[223] = 28;
        }
        class51.method93(this.field724);
    }

    @ObfuscatedName("bp.a(I)V")
    public final void method766() {
        Canvas var1 = this.field724;
        var1.addMouseListener(class60.field746);
        var1.addMouseMotionListener(class60.field746);
        var1.addFocusListener(class60.field746);
    }

    @ObfuscatedName("bp.g(I)V")
    public final void method733() {
        Container var1 = this.method757();
        if (var1 == null) {
            return;
        }
        class279 var2 = this.method758();
        this.field705 = Math.max(var2.field3741, this.field709);
        this.field706 = Math.max(var2.field3740, this.field710);
        if (this.field705 <= 0) {
            this.field705 = 1;
        }
        if (this.field706 <= 0) {
            this.field706 = 1;
        }
        Statics.field264 = Math.min(this.field705, this.field711);
        Statics.field12 = Math.min(this.field706, this.field712);
        this.field702 = (this.field705 - Statics.field264) / 2;
        this.field699 = 0;
        this.field724.setSize(Statics.field264, Statics.field12);
        Statics.field1297 = new class58(Statics.field264, Statics.field12, this.field724);
        if (this.field701 == var1) {
            Insets var3 = this.field701.getInsets();
            this.field724.setLocation(this.field702 + var3.left, this.field699 + var3.top);
        } else {
            this.field724.setLocation(this.field702, this.field699);
        }
        this.field700 = true;
        this.method789();
    }

    @ObfuscatedName("bp.s(I)V")
    public void method809() {
        int var1 = this.field702;
        int var2 = this.field699;
        int var3 = this.field705 - Statics.field264 - var1;
        int var4 = this.field706 - Statics.field12 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method757();
            int var6 = 0;
            int var7 = 0;
            if (this.field701 == var5) {
                Insets var8 = this.field701.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field706);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field705, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field705 + var6 - var3, var7, var3, this.field706);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field706 + var7 - var4, this.field705, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bp.k(B)V")
    public final void method735() {
        Canvas var1 = this.field724;
        var1.removeKeyListener(class51.field648);
        var1.removeFocusListener(class51.field648);
        class51.field654 = -1;
        Canvas var2 = this.field724;
        var2.removeMouseListener(class60.field746);
        var2.removeMouseMotionListener(class60.field746);
        var2.removeFocusListener(class60.field746);
        class60.field744 = 0;
        if (this.field721 != null) {
            this.field721.method626(this.field724);
        }
        this.method791();
        class51.method93(this.field724);
        Canvas var3 = this.field724;
        var3.addMouseListener(class60.field746);
        var3.addMouseMotionListener(class60.field746);
        var3.addFocusListener(class60.field746);
        if (this.field721 != null) {
            this.field721.method625(this.field724);
        }
        this.method788();
    }

    @ObfuscatedName("bp.r(IIII)V")
    public final void method746(int arg0, int arg1, int arg2) {
        try {
            if (field696 != null) {
                field694++;
                if (field694 >= 3) {
                    this.method747("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field696 = this;
            Statics.field264 = arg0;
            Statics.field12 = arg1;
            Statics.field2225 = arg2;
            Statics.field2226 = this;
            if (Statics.field692 == null) {
                Statics.field692 = new class155();
            }
            Statics.field692.method2617(this, 1);
        } catch (Exception var5) {
            class153.method40((String) null, var5);
            this.method747("crash");
        }
    }

    @ObfuscatedName("bp.u(B)V")
    public final synchronized void method791() {
        Container var1 = this.method757();
        if (this.field724 != null) {
            this.field724.removeFocusListener(this);
            var1.remove(this.field724);
        }
        Statics.field264 = Math.max(var1.getWidth(), this.field709);
        Statics.field12 = Math.max(var1.getHeight(), this.field710);
        if (this.field701 != null) {
            Insets var2 = this.field701.getInsets();
            Statics.field264 -= var2.right + var2.left;
            Statics.field12 -= var2.top + var2.bottom;
        }
        this.field724 = new class54(this);
        var1.add(this.field724);
        this.field724.setSize(Statics.field264, Statics.field12);
        this.field724.setVisible(true);
        this.field724.setBackground(Color.BLACK);
        if (this.field701 == var1) {
            Insets var3 = this.field701.getInsets();
            this.field724.setLocation(this.field702 + var3.left, this.field699 + var3.top);
        } else {
            this.field724.setLocation(this.field702, this.field699);
        }
        this.field724.addFocusListener(this);
        this.field724.requestFocus();
        this.field700 = true;
        if (Statics.field1297 != null && Statics.field264 == Statics.field1297.field3761 && Statics.field12 == Statics.field1297.field3762) {
            ((class58) Statics.field1297).method707(this.field724);
            Statics.field1297.method708(0, 0);
        } else {
            Statics.field1297 = new class58(Statics.field264, Statics.field12, this.field724);
        }
        this.field719 = false;
        this.field720 = class176.method2747();
    }

    @ObfuscatedName("bp.av(I)Z")
    public final boolean method738() {
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
                this.method747("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2243 != null) {
                String var1 = Statics.field2243.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2244;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method747("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class271.method2582(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class271.method2693(var4) && class271.method1856(var4) < 10) {
                            this.method747("wrongjava");
                            return;
                        }
                    }
                    field715 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method791();
            this.method750();
            class159 var5;
            try {
                var5 = new class151();
            } catch (Throwable var9) {
                var5 = new class152();
            }
            Statics.field708 = var5;
            while (field695 == 0L || class176.method2747() < field695) {
                Statics.field698 = Statics.field708.method2596(field693, field715);
                for (int var7 = 0; var7 < Statics.field698; var7++) {
                    this.method725();
                }
                this.method740();
                this.method756(this.field724);
            }
        } catch (Exception var10) {
            class153.method40((String) null, var10);
            this.method747("crash");
        }
        this.method742();
    }

    @ObfuscatedName("bp.ax(I)V")
    public void method725() {
        long var1 = class176.method2747();
        long var3 = field704[Statics.field2503];
        field704[Statics.field2503] = var1;
        Statics.field2503 = Statics.field2503 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1391 = field697;
        }
        this.method860();
    }

    @ObfuscatedName("bp.af(I)V")
    public void method740() {
        Container var1 = this.method757();
        long var2 = class176.method2747();
        long var4 = field703[Statics.field2054];
        field703[Statics.field2054] = var2;
        Statics.field2054 = Statics.field2054 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field714 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field717 - 1 > 50) {
            field717 -= 50;
            this.field700 = true;
            this.field724.setSize(Statics.field264, Statics.field12);
            this.field724.setVisible(true);
            if (this.field701 == var1) {
                Insets var7 = this.field701.getInsets();
                this.field724.setLocation(this.field702 + var7.left, this.field699 + var7.top);
            } else {
                this.field724.setLocation(this.field702, this.field699);
            }
        }
        if (this.field719) {
            this.method735();
        }
        this.method751();
        this.method829(this.field700);
        if (this.field700) {
            this.method809();
        }
        this.field700 = false;
    }

    @ObfuscatedName("bp.ae(I)V")
    public final void method751() {
        class279 var1 = this.method758();
        if (this.field705 != var1.field3741 || this.field706 != var1.field3740 || this.field718) {
            this.method733();
            this.field718 = false;
        }
    }

    @ObfuscatedName("bp.ap(I)V")
    public final void method788() {
        this.field718 = true;
    }

    @ObfuscatedName("bp.ak(B)V")
    public final synchronized void method742() {
        if (field707) {
            return;
        }
        field707 = true;
        try {
            this.field724.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method753();
        } catch (Exception var7) {
        }
        if (this.field701 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field692 != null) {
            try {
                Statics.field692.method2627();
            } catch (Exception var5) {
            }
        }
        this.method749();
    }

    public final void start() {
        if (field696 == this && !field707) {
            field695 = 0L;
        }
    }

    public final void stop() {
        if (field696 == this && !field707) {
            field695 = class176.method2747() + 4000L;
        }
    }

    public final void destroy() {
        if (field696 == this && !field707) {
            field695 = class176.method2747();
            class182.method2791(5000L);
            this.method742();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field696 != this || field707) {
            return;
        }
        this.field700 = true;
        if (class176.method2747() - this.field720 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field264 && var2.height >= Statics.field12) {
                this.field719 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field697 = true;
        this.field700 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field697 = false;
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

    @ObfuscatedName("bp.ao(ILjava/lang/String;ZI)V")
    public final void method754(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field724.getGraphics();
            if (Statics.field5 == null) {
                Statics.field5 = new Font("Helvetica", 1, 13);
                Statics.field3278 = this.field724.getFontMetrics(Statics.field5);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field264, Statics.field12);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field716 == null) {
                    Statics.field716 = this.field724.createImage(304, 34);
                }
                Graphics var6 = Statics.field716.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field5);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field3278.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field716, Statics.field264 / 2 - 152, Statics.field12 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field264 / 2 - 152;
                int var9 = Statics.field12 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field5);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field3278.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field724.repaint();
        }
    }

    @ObfuscatedName("bp.ac(B)V")
    public final void method755() {
        Statics.field716 = null;
        Statics.field5 = null;
        Statics.field3278 = null;
    }

    @ObfuscatedName("bp.aa(Ljava/lang/String;I)V")
    public void method747(String arg0) {
        if (this.field713) {
            return;
        }
        this.field713 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bp.ay(I)Ljava/awt/Container;")
    public Container method757() {
        return this.field701 == null ? this : this.field701;
    }

    @ObfuscatedName("bp.aj(I)Ljn;")
    public class279 method758() {
        Container var1 = this.method757();
        int var2 = Math.max(var1.getWidth(), this.field709);
        int var3 = Math.max(var1.getHeight(), this.field710);
        if (this.field701 != null) {
            Insets var4 = this.field701.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class279(var2, var3);
    }

    @ObfuscatedName("bp.ag(B)Z")
    public final boolean method759() {
        return this.field701 != null;
    }

    @ObfuscatedName("bp.aq(I)V")
    public abstract void method749();

    public abstract void init();

    @ObfuscatedName("bp.al(I)V")
    public abstract void method750();

    @ObfuscatedName("bp.ar(I)V")
    public abstract void method753();

    @ObfuscatedName("bp.v(I)V")
    public abstract void method789();

    @ObfuscatedName("bp.am(ZB)V")
    public abstract void method829(boolean arg0);

    @ObfuscatedName("bp.ab(I)V")
    public abstract void method860();
}
