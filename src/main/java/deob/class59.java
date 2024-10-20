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

    @ObfuscatedName("bp.n")
    public static class59 field707 = null;

    @ObfuscatedName("bp.g")
    public static int field689 = 0;

    @ObfuscatedName("bp.k")
    public static long field686 = 0L;

    @ObfuscatedName("bp.v")
    public static boolean field700 = false;

    @ObfuscatedName("bp.z")
    public boolean field676 = false;

    @ObfuscatedName("bp.u")
    public static int field677 = 20;

    @ObfuscatedName("bp.d")
    public static int field696 = 1;

    @ObfuscatedName("bp.o")
    public static int field678 = 0;

    @ObfuscatedName("bp.s")
    public static long[] field680 = new long[32];

    @ObfuscatedName("bp.m")
    public static long[] field709 = new long[32];

    @ObfuscatedName("bp.t")
    public int field683;

    @ObfuscatedName("bp.p")
    public int field705;

    @ObfuscatedName("bp.f")
    public int field685 = 0;

    @ObfuscatedName("bp.b")
    public int field681 = 0;

    @ObfuscatedName("bp.q")
    public int field674;

    @ObfuscatedName("bp.ag")
    public int field675;

    @ObfuscatedName("bp.ay")
    public int field687;

    @ObfuscatedName("bp.au")
    public int field690;

    @ObfuscatedName("bp.al")
    public Frame field692;

    @ObfuscatedName("bp.ae")
    public Canvas field693;

    @ObfuscatedName("bp.ax")
    public volatile boolean field694 = true;

    @ObfuscatedName("bp.aw")
    public static int field695 = 500;

    @ObfuscatedName("bp.av")
    public boolean field699 = false;

    @ObfuscatedName("bp.ac")
    public volatile boolean field697 = false;

    @ObfuscatedName("bp.ak")
    public volatile long field698 = 0L;

    @ObfuscatedName("bp.af")
    public class50 field672;

    @ObfuscatedName("bp.am")
    public Clipboard field684;

    @ObfuscatedName("bp.aq")
    public final EventQueue field701;

    @ObfuscatedName("bp.as")
    public static volatile boolean field702 = true;

    @ObfuscatedName("bp.ai")
    public static long field703 = -1L;

    @ObfuscatedName("bp.an")
    public static long field704 = -1L;

    public class59() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field701 = var1;
        class52 var3 = new class52();
        Statics.field2045 = var3;
    }

    @ObfuscatedName("bp.z(III)V")
    public final void method745(int arg0, int arg1) {
        if (this.field687 != arg0 || this.field690 != arg1) {
            this.method763();
        }
        this.field687 = arg0;
        this.field690 = arg1;
    }

    @ObfuscatedName("bp.r(Ljava/lang/Object;I)V")
    public final void method746(Object arg0) {
        if (this.field701 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field701.peekEvent() != null; var2++) {
            class183.method534(1L);
        }
        if (arg0 != null) {
            this.field701.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bp.u(I)Lfw;")
    public class158 method747() {
        if (this.field672 == null) {
            this.field672 = new class50();
            this.field672.method638(this.field693);
        }
        return this.field672;
    }

    @ObfuscatedName("bp.d(B)V")
    public void method861() {
        this.field684 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bp.o(Ljava/lang/String;I)V")
    public void method765(String arg0) {
        this.field684.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bp.s(I)V")
    public final void method850() {
        class51.method1609();
        Canvas var1 = this.field693;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class51.field622);
        var1.addFocusListener(class51.field622);
    }

    @ObfuscatedName("bp.c(B)V")
    public final void method748() {
        class60.method2707(this.field693);
    }

    @ObfuscatedName("bp.m(I)V")
    public final void method752() {
        Container var1 = this.method831();
        if (var1 == null) {
            return;
        }
        class280 var2 = this.method844();
        this.field683 = Math.max(var2.field3725, this.field674);
        this.field705 = Math.max(var2.field3726, this.field675);
        if (this.field683 <= 0) {
            this.field683 = 1;
        }
        if (this.field705 <= 0) {
            this.field705 = 1;
        }
        Statics.field1365 = Math.min(this.field683, this.field687);
        Statics.field3269 = Math.min(this.field705, this.field690);
        this.field685 = (this.field683 - Statics.field1365) / 2;
        this.field681 = 0;
        this.field693.setSize(Statics.field1365, Statics.field3269);
        Statics.field323 = new class58(Statics.field1365, Statics.field3269, this.field693);
        if (this.field692 == var1) {
            Insets var3 = this.field692.getInsets();
            this.field693.setLocation(this.field685 + var3.left, this.field681 + var3.top);
        } else {
            this.field693.setLocation(this.field685, this.field681);
        }
        this.field694 = true;
        this.method859();
    }

    @ObfuscatedName("bp.t(B)V")
    public void method798() {
        int var1 = this.field685;
        int var2 = this.field681;
        int var3 = this.field683 - Statics.field1365 - var1;
        int var4 = this.field705 - Statics.field3269 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method831();
            int var6 = 0;
            int var7 = 0;
            if (this.field692 == var5) {
                Insets var8 = this.field692.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field705);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field683, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field683 + var6 - var3, var7, var3, this.field705);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field705 + var7 - var4, this.field683, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bp.p(I)V")
    public final void method755() {
        Canvas var1 = this.field693;
        var1.removeKeyListener(class51.field622);
        var1.removeFocusListener(class51.field622);
        class51.field635 = -1;
        class60.method3908(this.field693);
        if (this.field672 != null) {
            this.field672.method639(this.field693);
        }
        this.method757();
        Canvas var2 = this.field693;
        var2.setFocusTraversalKeysEnabled(false);
        var2.addKeyListener(class51.field622);
        var2.addFocusListener(class51.field622);
        class60.method2707(this.field693);
        if (this.field672 != null) {
            this.field672.method638(this.field693);
        }
        this.method763();
    }

    @ObfuscatedName("bp.f(IIII)V")
    public final void method830(int arg0, int arg1, int arg2) {
        try {
            if (field707 != null) {
                field689++;
                if (field689 >= 3) {
                    this.method816("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field707 = this;
            Statics.field1365 = arg0;
            Statics.field3269 = arg1;
            Statics.field2200 = arg2;
            Statics.field2202 = this;
            if (Statics.field299 == null) {
                Statics.field299 = new class156();
            }
            Statics.field299.method2731(this, 1);
        } catch (Exception var5) {
            class154.method1592((String) null, var5);
            this.method816("crash");
        }
    }

    @ObfuscatedName("bp.x(I)V")
    public final synchronized void method757() {
        Container var1 = this.method831();
        if (this.field693 != null) {
            this.field693.removeFocusListener(this);
            var1.remove(this.field693);
        }
        Statics.field1365 = Math.max(var1.getWidth(), this.field674);
        Statics.field3269 = Math.max(var1.getHeight(), this.field675);
        if (this.field692 != null) {
            Insets var2 = this.field692.getInsets();
            Statics.field1365 -= var2.right + var2.left;
            Statics.field3269 -= var2.top + var2.bottom;
        }
        this.field693 = new class54(this);
        var1.add(this.field693);
        this.field693.setSize(Statics.field1365, Statics.field3269);
        this.field693.setVisible(true);
        this.field693.setBackground(Color.BLACK);
        if (this.field692 == var1) {
            Insets var3 = this.field692.getInsets();
            this.field693.setLocation(this.field685 + var3.left, this.field681 + var3.top);
        } else {
            this.field693.setLocation(this.field685, this.field681);
        }
        this.field693.addFocusListener(this);
        this.field693.requestFocus();
        this.field694 = true;
        if (Statics.field323 != null && Statics.field1365 == Statics.field323.field3747 && Statics.field3269 == Statics.field323.field3748) {
            ((class58) Statics.field323).method726(this.field693);
            Statics.field323.method727(0, 0);
        } else {
            Statics.field323 = new class58(Statics.field1365, Statics.field3269, this.field693);
        }
        this.field697 = false;
        this.field698 = class177.method2903();
    }

    @ObfuscatedName("bp.q(I)Z")
    public final boolean method829() {
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
                this.method816("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2225 != null) {
                String var1 = Statics.field2225.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field3711;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method816("wrongjava");
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
                        if (class272.method4148(var6)) {
                            int var7 = class272.method4007(var6, 10, true);
                            if (var7 < 10) {
                                this.method816("wrongjava");
                                return;
                            }
                        }
                    }
                    field696 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method757();
            this.method769();
            Statics.field3173 = class160.method1570();
            while (field686 == 0L || class177.method2903() < field686) {
                Statics.field2581 = Statics.field3173.method2717(field677, field696);
                for (int var8 = 0; var8 < Statics.field2581; var8++) {
                    this.method806();
                }
                this.method761();
                this.method746(this.field693);
            }
        } catch (Exception var10) {
            class154.method1592((String) null, var10);
            this.method816("crash");
        }
        this.method812();
    }

    @ObfuscatedName("bp.ag(B)V")
    public void method806() {
        long var1 = class177.method2903();
        long var3 = field709[Statics.field682];
        field709[Statics.field682] = var1;
        Statics.field682 = Statics.field682 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field227 = field702;
        }
        this.method770();
    }

    @ObfuscatedName("bp.ax(I)V")
    public void method761() {
        Container var1 = this.method831();
        long var2 = class177.method2903();
        long var4 = field680[Statics.field3667];
        field680[Statics.field3667] = var2;
        Statics.field3667 = Statics.field3667 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field678 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field695 - 1 > 50) {
            field695 -= 50;
            this.field694 = true;
            this.field693.setSize(Statics.field1365, Statics.field3269);
            this.field693.setVisible(true);
            if (this.field692 == var1) {
                Insets var7 = this.field692.getInsets();
                this.field693.setLocation(this.field685 + var7.left, this.field681 + var7.top);
            } else {
                this.field693.setLocation(this.field685, this.field681);
            }
        }
        if (this.field697) {
            this.method755();
        }
        this.method762();
        this.method771(this.field694);
        if (this.field694) {
            this.method798();
        }
        this.field694 = false;
    }

    @ObfuscatedName("bp.az(I)V")
    public final void method762() {
        class280 var1 = this.method844();
        if (this.field683 != var1.field3725 || this.field705 != var1.field3726 || this.field699) {
            this.method752();
            this.field699 = false;
        }
    }

    @ObfuscatedName("bp.aw(I)V")
    public final void method763() {
        this.field699 = true;
    }

    @ObfuscatedName("bp.av(I)V")
    public final synchronized void method812() {
        if (field700) {
            return;
        }
        field700 = true;
        try {
            this.field693.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method772();
        } catch (Exception var7) {
        }
        if (this.field692 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field299 != null) {
            try {
                Statics.field299.method2738();
            } catch (Exception var5) {
            }
        }
        this.method749();
    }

    public final void start() {
        if (field707 == this && !field700) {
            field686 = 0L;
        }
    }

    public final void stop() {
        if (field707 == this && !field700) {
            field686 = class177.method2903() + 4000L;
        }
    }

    public final void destroy() {
        if (field707 == this && !field700) {
            field686 = class177.method2903();
            class183.method534(5000L);
            this.method812();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field707 != this || field700) {
            return;
        }
        this.field694 = true;
        if (class177.method2903() - this.field698 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1365 && var2.height >= Statics.field3269) {
                this.field697 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field702 = true;
        this.field694 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field702 = false;
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

    @ObfuscatedName("bp.af(ILjava/lang/String;ZB)V")
    public final void method773(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field693.getGraphics();
            if (Statics.field746 == null) {
                Statics.field746 = new Font("Helvetica", 1, 13);
                Statics.field691 = this.field693.getFontMetrics(Statics.field746);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field1365, Statics.field3269);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field869 == null) {
                    Statics.field869 = this.field693.createImage(304, 34);
                }
                Graphics var6 = Statics.field869.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field746);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field691.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field869, Statics.field1365 / 2 - 152, Statics.field3269 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field1365 / 2 - 152;
                int var9 = Statics.field3269 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field746);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field691.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field693.repaint();
        }
    }

    @ObfuscatedName("bp.am(B)V")
    public final void method774() {
        Statics.field869 = null;
        Statics.field746 = null;
        Statics.field691 = null;
    }

    @ObfuscatedName("bp.aq(Ljava/lang/String;B)V")
    public void method816(String arg0) {
        if (this.field676) {
            return;
        }
        this.field676 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bp.as(B)Ljava/awt/Container;")
    public Container method831() {
        return this.field692 == null ? this : this.field692;
    }

    @ObfuscatedName("bp.ab(I)Ljs;")
    public class280 method844() {
        Container var1 = this.method831();
        int var2 = Math.max(var1.getWidth(), this.field674);
        int var3 = Math.max(var1.getHeight(), this.field675);
        if (this.field692 != null) {
            Insets var4 = this.field692.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class280(var2, var3);
    }

    @ObfuscatedName("bp.ap(I)Z")
    public final boolean method778() {
        return this.field692 != null;
    }

    @ObfuscatedName("bp.ai(I)V")
    public abstract void method749();

    @ObfuscatedName("bp.ac(I)V")
    public abstract void method769();

    @ObfuscatedName("bp.ak(I)V")
    public abstract void method770();

    @ObfuscatedName("bp.ad(ZI)V")
    public abstract void method771(boolean arg0);

    @ObfuscatedName("bp.at(I)V")
    public abstract void method772();

    @ObfuscatedName("bp.a(I)V")
    public abstract void method859();

    public abstract void init();
}
