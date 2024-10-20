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

@ObfuscatedName("bd")
public abstract class class59 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bd.v")
    public static class59 field668 = null;

    @ObfuscatedName("bd.r")
    public static int field660 = 0;

    @ObfuscatedName("bd.h")
    public static long field661 = 0L;

    @ObfuscatedName("bd.d")
    public static boolean field693 = false;

    @ObfuscatedName("bd.s")
    public boolean field663 = false;

    @ObfuscatedName("bd.e")
    public static int field667 = 20;

    @ObfuscatedName("bd.f")
    public static int field691 = 1;

    @ObfuscatedName("bd.z")
    public static int field666 = 0;

    @ObfuscatedName("bd.t")
    public static long[] field674 = new long[32];

    @ObfuscatedName("bd.a")
    public static long[] field690 = new long[32];

    @ObfuscatedName("bd.m")
    public int field669;

    @ObfuscatedName("bd.l")
    public int field670;

    @ObfuscatedName("bd.j")
    public int field671 = 0;

    @ObfuscatedName("bd.g")
    public int field659 = 0;

    @ObfuscatedName("bd.q")
    public int field679;

    @ObfuscatedName("bd.ac")
    public int field662;

    @ObfuscatedName("bd.aw")
    public int field664;

    @ObfuscatedName("bd.at")
    public int field676;

    @ObfuscatedName("bd.af")
    public Frame field678;

    @ObfuscatedName("bd.az")
    public Canvas field675;

    @ObfuscatedName("bd.ae")
    public volatile boolean field688 = true;

    @ObfuscatedName("bd.am")
    public static int field681 = 500;

    @ObfuscatedName("bd.ax")
    public boolean field682 = false;

    @ObfuscatedName("bd.ah")
    public volatile boolean field680 = false;

    @ObfuscatedName("bd.ab")
    public volatile long field684 = 0L;

    @ObfuscatedName("bd.ao")
    public class50 field685;

    @ObfuscatedName("bd.al")
    public Clipboard field686;

    @ObfuscatedName("bd.ay")
    public final EventQueue field687;

    @ObfuscatedName("bd.aq")
    public static volatile boolean field665 = true;

    @ObfuscatedName("bd.au")
    public static long field689 = -1L;

    @ObfuscatedName("bd.an")
    public static long field673 = -1L;

    public class59() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field687 = var1;
        class109.method200(new class52());
    }

    @ObfuscatedName("bd.h(IIB)V")
    public final void method735(int arg0, int arg1) {
        if (this.field664 != arg0 || this.field676 != arg1) {
            this.method752();
        }
        this.field664 = arg0;
        this.field676 = arg1;
    }

    @ObfuscatedName("bd.d(Ljava/lang/Object;I)V")
    public final void method827(Object arg0) {
        if (this.field687 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field687.peekEvent() != null; var2++) {
            class193.method980(1L);
        }
        if (arg0 != null) {
            this.field687.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bd.s(B)Lfk;")
    public class159 method823() {
        if (this.field685 == null) {
            this.field685 = new class50();
            this.field685.method627(this.field675);
        }
        return this.field685;
    }

    @ObfuscatedName("bd.b(I)V")
    public void method737() {
        this.field686 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bd.e(Ljava/lang/String;S)V")
    public void method738(String arg0) {
        this.field686.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bd.f(B)V")
    public final void method739() {
        class51.method2428();
        class51.method1071(this.field675);
    }

    @ObfuscatedName("bd.u(I)V")
    public final void method892() {
        Canvas var1 = this.field675;
        var1.addMouseListener(class60.field699);
        var1.addMouseMotionListener(class60.field699);
        var1.addFocusListener(class60.field699);
    }

    @ObfuscatedName("bd.t(B)V")
    public final void method741() {
        Container var1 = this.method765();
        if (var1 == null) {
            return;
        }
        class292 var2 = this.method766();
        this.field669 = Math.max(var2.field3819, this.field679);
        this.field670 = Math.max(var2.field3820, this.field662);
        if (this.field669 <= 0) {
            this.field669 = 1;
        }
        if (this.field670 <= 0) {
            this.field670 = 1;
        }
        Statics.field1320 = Math.min(this.field669, this.field664);
        Statics.field358 = Math.min(this.field670, this.field676);
        this.field671 = (this.field669 - Statics.field1320) / 2;
        this.field659 = 0;
        this.field675.setSize(Statics.field1320, Statics.field358);
        Statics.field475 = new class58(Statics.field1320, Statics.field358, this.field675);
        if (this.field678 == var1) {
            Insets var3 = this.field678.getInsets();
            this.field675.setLocation(this.field671 + var3.left, this.field659 + var3.top);
        } else {
            this.field675.setLocation(this.field671, this.field659);
        }
        this.field688 = true;
        this.method736();
    }

    @ObfuscatedName("bd.a(I)V")
    public void method867() {
        int var1 = this.field671;
        int var2 = this.field659;
        int var3 = this.field669 - Statics.field1320 - var1;
        int var4 = this.field670 - Statics.field358 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method765();
            int var6 = 0;
            int var7 = 0;
            if (this.field678 == var5) {
                Insets var8 = this.field678.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field670);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field669, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field669 + var6 - var3, var7, var3, this.field670);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field670 + var7 - var4, this.field669, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bd.i(I)V")
    public final void method744() {
        Canvas var1 = this.field675;
        var1.removeKeyListener(class51.field618);
        var1.removeFocusListener(class51.field618);
        class51.field612 = -1;
        class60.method550(this.field675);
        if (this.field685 != null) {
            this.field685.method628(this.field675);
        }
        this.method742();
        class51.method1071(this.field675);
        Canvas var2 = this.field675;
        var2.addMouseListener(class60.field699);
        var2.addMouseMotionListener(class60.field699);
        var2.addFocusListener(class60.field699);
        if (this.field685 != null) {
            this.field685.method627(this.field675);
        }
        this.method752();
    }

    @ObfuscatedName("bd.m(IIII)V")
    public final void method745(int arg0, int arg1, int arg2) {
        try {
            if (field668 != null) {
                field660++;
                if (field660 >= 3) {
                    this.method834("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field668 = this;
            Statics.field1320 = arg0;
            Statics.field358 = arg1;
            Statics.field301 = arg2;
            Statics.field2141 = this;
            if (Statics.field2480 == null) {
                Statics.field2480 = new class157();
            }
            Statics.field2480.method2782(this, 1);
        } catch (Exception var5) {
            class155.method4721((String) null, var5);
            this.method834("crash");
        }
    }

    @ObfuscatedName("bd.x(I)V")
    public final synchronized void method742() {
        Container var1 = this.method765();
        if (this.field675 != null) {
            this.field675.removeFocusListener(this);
            var1.remove(this.field675);
        }
        Statics.field1320 = Math.max(var1.getWidth(), this.field679);
        Statics.field358 = Math.max(var1.getHeight(), this.field662);
        if (this.field678 != null) {
            Insets var2 = this.field678.getInsets();
            Statics.field1320 -= var2.right + var2.left;
            Statics.field358 -= var2.top + var2.bottom;
        }
        this.field675 = new class54(this);
        var1.add(this.field675);
        this.field675.setSize(Statics.field1320, Statics.field358);
        this.field675.setVisible(true);
        this.field675.setBackground(Color.BLACK);
        if (this.field678 == var1) {
            Insets var3 = this.field678.getInsets();
            this.field675.setLocation(this.field671 + var3.left, this.field659 + var3.top);
        } else {
            this.field675.setLocation(this.field671, this.field659);
        }
        this.field675.addFocusListener(this);
        this.field675.requestFocus();
        this.field688 = true;
        if (Statics.field475 != null && Statics.field1320 == Statics.field475.field3839 && Statics.field358 == Statics.field475.field3840) {
            ((class58) Statics.field475).method716(this.field675);
            Statics.field475.method717(0, 0);
        } else {
            Statics.field475 = new class58(Statics.field1320, Statics.field358, this.field675);
        }
        this.field680 = false;
        this.field684 = class187.method938();
    }

    @ObfuscatedName("bd.j(I)Z")
    public final boolean method747() {
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
                this.method834("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2158 != null) {
                String var1 = Statics.field2158.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2153;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method834("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class282.method3673(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class282.method3262(var4)) {
                            int var5 = class282.method2944(var4, 10, true);
                            if (var5 < 10) {
                                this.method834("wrongjava");
                                return;
                            }
                        }
                    }
                    field691 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method742();
            this.method811();
            Statics.field2160 = class163.method460();
            while (field661 == 0L || class187.method938() < field661) {
                Statics.field524 = Statics.field2160.method2744(field667, field691);
                for (int var6 = 0; var6 < Statics.field524; var6++) {
                    this.method749();
                }
                this.method750();
                this.method827(this.field675);
            }
        } catch (Exception var8) {
            class155.method4721((String) null, var8);
            this.method834("crash");
        }
        this.method757();
    }

    @ObfuscatedName("bd.at(I)V")
    public void method749() {
        long var1 = class187.method938();
        long var3 = field690[Statics.field255];
        field690[Statics.field255] = var1;
        Statics.field255 = Statics.field255 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field2534 = field665;
        }
        this.method759();
    }

    @ObfuscatedName("bd.ag(I)V")
    public void method750() {
        Container var1 = this.method765();
        long var2 = class187.method938();
        long var4 = field674[Statics.field542];
        field674[Statics.field542] = var2;
        Statics.field542 = Statics.field542 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field666 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field681 - 1 > 50) {
            field681 -= 50;
            this.field688 = true;
            this.field675.setSize(Statics.field1320, Statics.field358);
            this.field675.setVisible(true);
            if (this.field678 == var1) {
                Insets var7 = this.field678.getInsets();
                this.field675.setLocation(this.field671 + var7.left, this.field659 + var7.top);
            } else {
                this.field675.setLocation(this.field671, this.field659);
            }
        }
        if (this.field680) {
            this.method744();
        }
        this.method818();
        this.method878(this.field688);
        if (this.field688) {
            this.method867();
        }
        this.field688 = false;
    }

    @ObfuscatedName("bd.ad(I)V")
    public final void method818() {
        class292 var1 = this.method766();
        if (this.field669 != var1.field3819 || this.field670 != var1.field3820 || this.field682) {
            this.method741();
            this.field682 = false;
        }
    }

    @ObfuscatedName("bd.af(B)V")
    public final void method752() {
        this.field682 = true;
    }

    @ObfuscatedName("bd.az(I)V")
    public final synchronized void method757() {
        if (field693) {
            return;
        }
        field693 = true;
        try {
            this.field675.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method754();
        } catch (Exception var7) {
        }
        if (this.field678 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field2480 != null) {
            try {
                Statics.field2480.method2778();
            } catch (Exception var5) {
            }
        }
        this.method884();
    }

    @ObfuscatedName("il.ae(I)V")
    public static final void method3934() {
        Statics.field2160.method2743();
        for (int var0 = 0; var0 < 32; var0++) {
            field674[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field690[var1] = 0L;
        }
        Statics.field524 = 0;
    }

    public final void start() {
        if (field668 == this && !field693) {
            field661 = 0L;
        }
    }

    public final void stop() {
        if (field668 == this && !field693) {
            field661 = class187.method938() + 4000L;
        }
    }

    public final void destroy() {
        if (field668 == this && !field693) {
            field661 = class187.method938();
            class193.method980(5000L);
            this.method757();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field668 != this || field693) {
            return;
        }
        this.field688 = true;
        if (class187.method938() - this.field684 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1320 && var2.height >= Statics.field358) {
                this.field680 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field665 = true;
        this.field688 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field665 = false;
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

    @ObfuscatedName("bd.ab(ILjava/lang/String;ZB)V")
    public final void method762(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field675.getGraphics();
            if (Statics.field677 == null) {
                Statics.field677 = new Font("Helvetica", 1, 13);
                Statics.field1429 = this.field675.getFontMetrics(Statics.field677);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field1320, Statics.field358);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field3321 == null) {
                    Statics.field3321 = this.field675.createImage(304, 34);
                }
                Graphics var6 = Statics.field3321.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field677);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field1429.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field3321, Statics.field1320 / 2 - 152, Statics.field358 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field1320 / 2 - 152;
                int var9 = Statics.field358 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field677);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field1429.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field675.repaint();
        }
    }

    @ObfuscatedName("bd.aj(I)V")
    public final void method763() {
        Statics.field3321 = null;
        Statics.field677 = null;
        Statics.field1429 = null;
    }

    @ObfuscatedName("bd.aa(Ljava/lang/String;I)V")
    public void method834(String arg0) {
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

    @ObfuscatedName("bd.ao(I)Ljava/awt/Container;")
    public Container method765() {
        return this.field678 == null ? this : this.field678;
    }

    @ObfuscatedName("bd.al(I)Lkk;")
    public class292 method766() {
        Container var1 = this.method765();
        int var2 = Math.max(var1.getWidth(), this.field679);
        int var3 = Math.max(var1.getHeight(), this.field662);
        if (this.field678 != null) {
            Insets var4 = this.field678.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class292(var2, var3);
    }

    @ObfuscatedName("bd.ay(I)Z")
    public final boolean method767() {
        return this.field678 != null;
    }

    @ObfuscatedName("ad.aq(I)I")
    public static int method235() {
        int var0 = 0;
        if (Statics.field1676 == null || !Statics.field1676.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field1676 = var2;
                        field673 = -1L;
                        field689 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field1676 != null) {
            long var4 = class187.method938();
            long var6 = Statics.field1676.getCollectionTime();
            if (field689 != -1L) {
                long var8 = var6 - field689;
                long var10 = var4 - field673;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field689 = var6;
            field673 = var4;
        }
        return var0;
    }

    @ObfuscatedName("bd.o(B)V")
    public abstract void method736();

    @ObfuscatedName("bd.ah(B)V")
    public abstract void method754();

    @ObfuscatedName("bd.am(I)V")
    public abstract void method759();

    public abstract void init();

    @ObfuscatedName("bd.av(I)V")
    public abstract void method811();

    @ObfuscatedName("bd.ax(ZI)V")
    public abstract void method878(boolean arg0);

    @ObfuscatedName("bd.ak(B)V")
    public abstract void method884();
}
