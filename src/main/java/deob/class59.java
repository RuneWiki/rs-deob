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

@ObfuscatedName("bs")
public abstract class class59 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bs.k")
    public static class59 field679 = null;

    @ObfuscatedName("bs.z")
    public static int field660 = 0;

    @ObfuscatedName("bs.v")
    public static long field661 = 0L;

    @ObfuscatedName("bs.m")
    public static boolean field689 = false;

    @ObfuscatedName("bs.b")
    public boolean field663 = false;

    @ObfuscatedName("bs.p")
    public static int field665 = 20;

    @ObfuscatedName("bs.r")
    public static int field666 = 1;

    @ObfuscatedName("bs.l")
    public static int field667 = 0;

    @ObfuscatedName("bs.c")
    public static long[] field668 = new long[32];

    @ObfuscatedName("bs.f")
    public static long[] field669 = new long[32];

    @ObfuscatedName("bs.e")
    public int field671;

    @ObfuscatedName("bs.q")
    public int field664;

    @ObfuscatedName("bs.h")
    public int field672 = 0;

    @ObfuscatedName("bs.i")
    public int field673 = 0;

    @ObfuscatedName("bs.a")
    public int field675;

    @ObfuscatedName("bs.ah")
    public int field662;

    @ObfuscatedName("bs.ak")
    public int field677;

    @ObfuscatedName("bs.aa")
    public int field678;

    @ObfuscatedName("bs.au")
    public Frame field680;

    @ObfuscatedName("bs.al")
    public Canvas field681;

    @ObfuscatedName("bs.ae")
    public volatile boolean field693 = true;

    @ObfuscatedName("bs.as")
    public static int field683 = 500;

    @ObfuscatedName("bs.am")
    public boolean field684 = false;

    @ObfuscatedName("bs.ag")
    public volatile boolean field685 = false;

    @ObfuscatedName("bs.aw")
    public volatile long field686 = 0L;

    @ObfuscatedName("bs.an")
    public class50 field687;

    @ObfuscatedName("bs.ai")
    public Clipboard field688;

    @ObfuscatedName("bs.ay")
    public final EventQueue field670;

    @ObfuscatedName("bs.ar")
    public static volatile boolean field690 = true;

    @ObfuscatedName("bs.ao")
    public static long field659 = -1L;

    @ObfuscatedName("bs.av")
    public static long field692 = -1L;

    public class59() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field670 = var1;
        class109.method182(new class52());
    }

    @ObfuscatedName("bs.z(III)V")
    public final void method761(int arg0, int arg1) {
        if (this.field677 != arg0 || this.field678 != arg1) {
            this.method777();
        }
        this.field677 = arg0;
        this.field678 = arg1;
    }

    @ObfuscatedName("bs.v(Ljava/lang/Object;I)V")
    public final void method762(Object arg0) {
        if (this.field670 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field670.peekEvent() != null; var2++) {
            class189.method13(1L);
        }
        if (arg0 != null) {
            this.field670.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bs.m(I)Lfi;")
    public class158 method763() {
        if (this.field687 == null) {
            this.field687 = new class50();
            this.field687.method655(this.field681);
        }
        return this.field687;
    }

    @ObfuscatedName("bs.b(B)V")
    public void method764() {
        this.field688 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bs.t(Ljava/lang/String;I)V")
    public void method774(String arg0) {
        this.field688.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bs.p(I)V")
    public final void method765() {
        Statics.method2802();
        class51.method42(this.field681);
    }

    @ObfuscatedName("bs.r(S)V")
    public final void method766() {
        Canvas var1 = this.field681;
        var1.addMouseListener(class60.field697);
        var1.addMouseMotionListener(class60.field697);
        var1.addFocusListener(class60.field697);
    }

    @ObfuscatedName("bs.l(I)V")
    public final void method768() {
        Container var1 = this.method790();
        if (var1 == null) {
            return;
        }
        class288 var2 = this.method782();
        this.field671 = Math.max(var2.field3794, this.field675);
        this.field664 = Math.max(var2.field3792, this.field662);
        if (this.field671 <= 0) {
            this.field671 = 1;
        }
        if (this.field664 <= 0) {
            this.field664 = 1;
        }
        Statics.field1308 = Math.min(this.field671, this.field677);
        Statics.field674 = Math.min(this.field664, this.field678);
        this.field672 = (this.field671 - Statics.field1308) / 2;
        this.field673 = 0;
        this.field681.setSize(Statics.field1308, Statics.field674);
        Statics.field1310 = new class58(Statics.field1308, Statics.field674, this.field681);
        if (this.field680 == var1) {
            Insets var3 = this.field680.getInsets();
            this.field681.setLocation(this.field672 + var3.left, this.field673 + var3.top);
        } else {
            this.field681.setLocation(this.field672, this.field673);
        }
        this.field693 = true;
        this.method837();
    }

    @ObfuscatedName("bs.c(I)V")
    public void method905() {
        int var1 = this.field672;
        int var2 = this.field673;
        int var3 = this.field671 - Statics.field1308 - var1;
        int var4 = this.field664 - Statics.field674 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method790();
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
                var9.fillRect(var6, var7, var1, this.field664);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field671, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field671 + var6 - var3, var7, var3, this.field664);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field664 + var7 - var4, this.field671, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bs.j(B)V")
    public final void method767() {
        class51.method3559(this.field681);
        class60.method38(this.field681);
        if (this.field687 != null) {
            this.field687.method652(this.field681);
        }
        this.method808();
        class51.method42(this.field681);
        Canvas var1 = this.field681;
        var1.addMouseListener(class60.field697);
        var1.addMouseMotionListener(class60.field697);
        var1.addFocusListener(class60.field697);
        if (this.field687 != null) {
            this.field687.method655(this.field681);
        }
        this.method777();
    }

    @ObfuscatedName("bs.f(IIIB)V")
    public final void method884(int arg0, int arg1, int arg2) {
        try {
            if (field679 != null) {
                field660++;
                if (field660 >= 3) {
                    this.method789("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field679 = this;
            Statics.field1308 = arg0;
            Statics.field674 = arg1;
            Statics.field2129 = arg2;
            Statics.field2127 = this;
            if (Statics.field3738 == null) {
                Statics.field3738 = new class156();
            }
            Statics.field3738.method2824(this, 1);
        } catch (Exception var5) {
            class154.method1684((String) null, var5);
            this.method789("crash");
        }
    }

    @ObfuscatedName("bs.s(B)V")
    public final synchronized void method808() {
        Container var1 = this.method790();
        if (this.field681 != null) {
            this.field681.removeFocusListener(this);
            var1.remove(this.field681);
        }
        Statics.field1308 = Math.max(var1.getWidth(), this.field675);
        Statics.field674 = Math.max(var1.getHeight(), this.field662);
        if (this.field680 != null) {
            Insets var2 = this.field680.getInsets();
            Statics.field1308 -= var2.right + var2.left;
            Statics.field674 -= var2.top + var2.bottom;
        }
        this.field681 = new class54(this);
        var1.add(this.field681);
        this.field681.setSize(Statics.field1308, Statics.field674);
        this.field681.setVisible(true);
        this.field681.setBackground(Color.BLACK);
        if (this.field680 == var1) {
            Insets var3 = this.field680.getInsets();
            this.field681.setLocation(this.field672 + var3.left, this.field673 + var3.top);
        } else {
            this.field681.setLocation(this.field672, this.field673);
        }
        this.field681.addFocusListener(this);
        this.field681.requestFocus();
        this.field693 = true;
        if (Statics.field1310 != null && Statics.field1308 == Statics.field1310.field3816 && Statics.field674 == Statics.field1310.field3817) {
            ((class58) Statics.field1310).method745(this.field681);
            Statics.field1310.method756(0, 0);
        } else {
            Statics.field1310 = new class58(Statics.field1308, Statics.field674, this.field681);
        }
        this.field685 = false;
        this.field686 = class183.method2932();
    }

    @ObfuscatedName("bs.e(S)Z")
    public final boolean method852() {
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
                this.method789("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2149 != null) {
                String var1 = Statics.field2149.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2143;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method789("wrongjava");
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
                        if (class278.method1570(var6) && class278.method477(var6) < 10) {
                            this.method789("wrongjava");
                            return;
                        }
                    }
                    field666 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method808();
            this.method783();
            Statics.field1295 = class160.method1098();
            while (field661 == 0L || class183.method2932() < field661) {
                Statics.field682 = Statics.field1295.method2804(field665, field666);
                for (int var7 = 0; var7 < Statics.field682; var7++) {
                    this.method794();
                }
                this.method911();
                this.method762(this.field681);
            }
        } catch (Exception var9) {
            class154.method1684((String) null, var9);
            this.method789("crash");
        }
        this.method803();
    }

    @ObfuscatedName("bs.q(I)V")
    public void method794() {
        long var1 = class183.method2932();
        long var3 = field669[Statics.field719];
        field669[Statics.field719] = var1;
        Statics.field719 = Statics.field719 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field549 = field690;
        }
        this.method901();
    }

    @ObfuscatedName("bs.h(I)V")
    public void method911() {
        Container var1 = this.method790();
        long var2 = class183.method2932();
        long var4 = field668[Statics.field31];
        field668[Statics.field31] = var2;
        Statics.field31 = Statics.field31 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field667 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field683 - 1 > 50) {
            field683 -= 50;
            this.field693 = true;
            this.field681.setSize(Statics.field1308, Statics.field674);
            this.field681.setVisible(true);
            if (this.field680 == var1) {
                Insets var7 = this.field680.getInsets();
                this.field681.setLocation(this.field672 + var7.left, this.field673 + var7.top);
            } else {
                this.field681.setLocation(this.field672, this.field673);
            }
        }
        if (this.field685) {
            this.method767();
        }
        this.method776();
        this.method785(this.field693);
        if (this.field693) {
            this.method905();
        }
        this.field693 = false;
    }

    @ObfuscatedName("bs.i(B)V")
    public final void method776() {
        class288 var1 = this.method782();
        if (this.field671 != var1.field3794 || this.field664 != var1.field3792 || this.field684) {
            this.method768();
            this.field684 = false;
        }
    }

    @ObfuscatedName("bs.o(B)V")
    public final void method777() {
        this.field684 = true;
    }

    @ObfuscatedName("bs.w(B)V")
    public final synchronized void method803() {
        if (field689) {
            return;
        }
        field689 = true;
        try {
            this.field681.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method786();
        } catch (Exception var7) {
        }
        if (this.field680 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field3738 != null) {
            try {
                Statics.field3738.method2818();
            } catch (Exception var5) {
            }
        }
        this.method792();
    }

    public final void start() {
        if (field679 == this && !field689) {
            field661 = 0L;
        }
    }

    public final void stop() {
        if (field679 == this && !field689) {
            field661 = class183.method2932() + 4000L;
        }
    }

    public final void destroy() {
        if (field679 == this && !field689) {
            field661 = class183.method2932();
            class189.method13(5000L);
            this.method803();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field679 != this || field689) {
            return;
        }
        this.field693 = true;
        if (class183.method2932() - this.field686 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1308 && var2.height >= Statics.field674) {
                this.field685 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field690 = true;
        this.field693 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field690 = false;
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

    @ObfuscatedName("bs.am(ILjava/lang/String;ZI)V")
    public final void method787(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field681.getGraphics();
            if (Statics.field691 == null) {
                Statics.field691 = new Font("Helvetica", 1, 13);
                Statics.field2046 = this.field681.getFontMetrics(Statics.field691);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field1308, Statics.field674);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field1409 == null) {
                    Statics.field1409 = this.field681.createImage(304, 34);
                }
                Graphics var6 = Statics.field1409.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field691);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field2046.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field1409, Statics.field1308 / 2 - 152, Statics.field674 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field1308 / 2 - 152;
                int var9 = Statics.field674 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field691);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field2046.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field681.repaint();
        }
    }

    @ObfuscatedName("bs.ag(I)V")
    public final void method788() {
        Statics.field1409 = null;
        Statics.field691 = null;
        Statics.field2046 = null;
    }

    @ObfuscatedName("bs.aw(Ljava/lang/String;I)V")
    public void method789(String arg0) {
        if (this.field663) {
            return;
        }
        this.field663 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bs.ap(S)Ljava/awt/Container;")
    public Container method790() {
        return this.field680 == null ? this : this.field680;
    }

    @ObfuscatedName("bs.ad(I)Lke;")
    public class288 method782() {
        Container var1 = this.method790();
        int var2 = Math.max(var1.getWidth(), this.field675);
        int var3 = Math.max(var1.getHeight(), this.field662);
        if (this.field680 != null) {
            Insets var4 = this.field680.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class288(var2, var3);
    }

    @ObfuscatedName("bs.an(I)Z")
    public final boolean method791() {
        return this.field680 != null;
    }

    public abstract void init();

    @ObfuscatedName("bs.al(I)V")
    public abstract void method783();

    @ObfuscatedName("bs.aj(ZI)V")
    public abstract void method785(boolean arg0);

    @ObfuscatedName("bs.as(S)V")
    public abstract void method786();

    @ObfuscatedName("bs.ai(I)V")
    public abstract void method792();

    @ObfuscatedName("bs.u(I)V")
    public abstract void method837();

    @ObfuscatedName("bs.ae(I)V")
    public abstract void method901();
}
