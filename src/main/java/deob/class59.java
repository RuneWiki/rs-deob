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

@ObfuscatedName("bn")
public abstract class class59 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bn.p")
    public static class59 field660 = null;

    @ObfuscatedName("bn.i")
    public static int field661 = 0;

    @ObfuscatedName("bn.j")
    public static long field662 = 0L;

    @ObfuscatedName("bn.v")
    public static boolean field680 = false;

    @ObfuscatedName("bn.e")
    public boolean field664 = false;

    @ObfuscatedName("bn.b")
    public static int field665 = 20;

    @ObfuscatedName("bn.n")
    public static int field666 = 1;

    @ObfuscatedName("bn.c")
    public static int field694 = 0;

    @ObfuscatedName("bn.t")
    public static long[] field670 = new long[32];

    @ObfuscatedName("bn.u")
    public static long[] field672 = new long[32];

    @ObfuscatedName("bn.g")
    public int field674;

    @ObfuscatedName("bn.z")
    public int field675;

    @ObfuscatedName("bn.o")
    public int field676 = 0;

    @ObfuscatedName("bn.d")
    public int field677 = 0;

    @ObfuscatedName("bn.q")
    public int field678;

    @ObfuscatedName("bn.al")
    public int field682;

    @ObfuscatedName("bn.ao")
    public int field679;

    @ObfuscatedName("bn.aq")
    public int field683;

    @ObfuscatedName("bn.ag")
    public Frame field663;

    @ObfuscatedName("bn.ap")
    public Canvas field668;

    @ObfuscatedName("bn.av")
    public volatile boolean field684 = true;

    @ObfuscatedName("bn.at")
    public static int field686 = 500;

    @ObfuscatedName("bn.an")
    public boolean field687 = false;

    @ObfuscatedName("bn.ah")
    public volatile boolean field685 = false;

    @ObfuscatedName("bn.am")
    public volatile long field689 = 0L;

    @ObfuscatedName("bn.aw")
    public class50 field659;

    @ObfuscatedName("bn.au")
    public Clipboard field667;

    @ObfuscatedName("bn.ac")
    public final EventQueue field692;

    @ObfuscatedName("bn.ai")
    public static volatile boolean field693 = true;

    @ObfuscatedName("bn.aa")
    public static long field681 = -1L;

    @ObfuscatedName("bn.ad")
    public static long field695 = -1L;

    public class59() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field692 = var1;
        class52 var3 = new class52();
        Statics.field1568 = var3;
    }

    @ObfuscatedName("bn.v(IIB)V")
    public final void method790(int arg0, int arg1) {
        if (this.field679 != arg0 || this.field683 != arg1) {
            this.method913();
        }
        this.field679 = arg0;
        this.field683 = arg1;
    }

    @ObfuscatedName("bn.x(Ljava/lang/Object;I)V")
    public final void method824(Object arg0) {
        if (this.field692 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field692.peekEvent() != null; var2++) {
            class189.method1011(1L);
        }
        if (arg0 != null) {
            this.field692.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bn.e(I)Lfq;")
    public class158 method791() {
        if (this.field659 == null) {
            this.field659 = new class50();
            this.field659.method693(this.field668);
        }
        return this.field659;
    }

    @ObfuscatedName("bn.l(B)V")
    public void method792() {
        this.field667 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bn.b(Ljava/lang/String;I)V")
    public void method840(String arg0) {
        this.field667.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bn.n(S)V")
    public final void method865() {
        if (Statics.field2151.toLowerCase().indexOf("microsoft") == -1) {
            class51.field624[44] = 71;
            class51.field624[45] = 26;
            class51.field624[46] = 72;
            class51.field624[47] = 73;
            class51.field624[59] = 57;
            class51.field624[61] = 27;
            class51.field624[91] = 42;
            class51.field624[92] = 74;
            class51.field624[93] = 43;
            class51.field624[192] = 28;
            class51.field624[222] = 58;
            class51.field624[520] = 59;
        } else {
            class51.field624[186] = 57;
            class51.field624[187] = 27;
            class51.field624[188] = 71;
            class51.field624[189] = 26;
            class51.field624[190] = 72;
            class51.field624[191] = 73;
            class51.field624[192] = 58;
            class51.field624[219] = 42;
            class51.field624[220] = 74;
            class51.field624[221] = 43;
            class51.field624[222] = 59;
            class51.field624[223] = 28;
        }
        Canvas var1 = this.field668;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class51.field610);
        var1.addFocusListener(class51.field610);
    }

    @ObfuscatedName("bn.c(B)V")
    public final void method795() {
        class60.method266(this.field668);
    }

    @ObfuscatedName("bn.a(I)V")
    public final void method906() {
        Container var1 = this.method818();
        if (var1 == null) {
            return;
        }
        class288 var2 = this.method875();
        this.field674 = Math.max(var2.field3796, this.field678);
        this.field675 = Math.max(var2.field3797, this.field682);
        if (this.field674 <= 0) {
            this.field674 = 1;
        }
        if (this.field675 <= 0) {
            this.field675 = 1;
        }
        Statics.field1842 = Math.min(this.field674, this.field679);
        Statics.field1324 = Math.min(this.field675, this.field683);
        this.field676 = (this.field674 - Statics.field1842) / 2;
        this.field677 = 0;
        this.field668.setSize(Statics.field1842, Statics.field1324);
        Statics.field780 = new class58(Statics.field1842, Statics.field1324, this.field668);
        if (this.field663 == var1) {
            Insets var3 = this.field663.getInsets();
            this.field668.setLocation(this.field676 + var3.left, this.field677 + var3.top);
        } else {
            this.field668.setLocation(this.field676, this.field677);
        }
        this.field684 = true;
        this.method809();
    }

    @ObfuscatedName("bn.w(I)V")
    public void method929() {
        int var1 = this.field676;
        int var2 = this.field677;
        int var3 = this.field674 - Statics.field1842 - var1;
        int var4 = this.field675 - Statics.field1324 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method818();
            int var6 = 0;
            int var7 = 0;
            if (this.field663 == var5) {
                Insets var8 = this.field663.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field675);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field674, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field674 + var6 - var3, var7, var3, this.field675);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field675 + var7 - var4, this.field674, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bn.k(B)V")
    public final void method806() {
        Canvas var1 = this.field668;
        var1.removeKeyListener(class51.field610);
        var1.removeFocusListener(class51.field610);
        class51.field612 = -1;
        class60.method739(this.field668);
        if (this.field659 != null) {
            this.field659.method686(this.field668);
        }
        this.method801();
        Canvas var2 = this.field668;
        var2.setFocusTraversalKeysEnabled(false);
        var2.addKeyListener(class51.field610);
        var2.addFocusListener(class51.field610);
        class60.method266(this.field668);
        if (this.field659 != null) {
            this.field659.method693(this.field668);
        }
        this.method913();
    }

    @ObfuscatedName("bn.t(IIII)V")
    public final void method800(int arg0, int arg1, int arg2) {
        try {
            if (field660 != null) {
                field661++;
                if (field661 >= 3) {
                    this.method901("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field660 = this;
            Statics.field1842 = arg0;
            Statics.field1324 = arg1;
            Statics.field2136 = arg2;
            Statics.field2134 = this;
            if (Statics.field671 == null) {
                Statics.field671 = new class156();
            }
            Statics.field671.method2797(this, 1);
        } catch (Exception var5) {
            class154.method355((String) null, var5);
            this.method901("crash");
        }
    }

    @ObfuscatedName("bn.h(I)V")
    public final synchronized void method801() {
        Container var1 = this.method818();
        if (this.field668 != null) {
            this.field668.removeFocusListener(this);
            var1.remove(this.field668);
        }
        Statics.field1842 = Math.max(var1.getWidth(), this.field678);
        Statics.field1324 = Math.max(var1.getHeight(), this.field682);
        if (this.field663 != null) {
            Insets var2 = this.field663.getInsets();
            Statics.field1842 -= var2.right + var2.left;
            Statics.field1324 -= var2.top + var2.bottom;
        }
        this.field668 = new class54(this);
        var1.add(this.field668);
        this.field668.setSize(Statics.field1842, Statics.field1324);
        this.field668.setVisible(true);
        this.field668.setBackground(Color.BLACK);
        if (this.field663 == var1) {
            Insets var3 = this.field663.getInsets();
            this.field668.setLocation(this.field676 + var3.left, this.field677 + var3.top);
        } else {
            this.field668.setLocation(this.field676, this.field677);
        }
        this.field668.addFocusListener(this);
        this.field668.requestFocus();
        this.field684 = true;
        if (Statics.field780 != null && Statics.field1842 == Statics.field780.field3821 && Statics.field1324 == Statics.field780.field3820) {
            ((class58) Statics.field780).method775(this.field668);
            Statics.field780.method776(0, 0);
        } else {
            Statics.field780 = new class58(Statics.field1842, Statics.field1324, this.field668);
        }
        this.field685 = false;
        this.field689 = class183.method4541();
    }

    @ObfuscatedName("bn.u(S)Z")
    public final boolean method860() {
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
                this.method901("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2151 != null) {
                String var1 = Statics.field2151.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2149;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method901("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class278.method1483(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        boolean var5 = class278.method713(var4, 10, true);
                        if (var5 && class278.method1706(var4) < 10) {
                            this.method901("wrongjava");
                            return;
                        }
                    }
                    field666 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method801();
            this.method878();
            class160 var6;
            try {
                var6 = new class152();
            } catch (Throwable var10) {
                var6 = new class153();
            }
            Statics.field698 = var6;
            while (field662 == 0L || class183.method4541() < field662) {
                Statics.field250 = Statics.field698.method2779(field665, field666);
                for (int var8 = 0; var8 < Statics.field250; var8++) {
                    this.method803();
                }
                this.method804();
                this.method824(this.field668);
            }
        } catch (Exception var11) {
            class154.method355((String) null, var11);
            this.method901("crash");
        }
        this.method807();
    }

    @ObfuscatedName("bn.as(B)V")
    public void method803() {
        long var1 = class183.method4541();
        long var3 = field672[Statics.field673];
        field672[Statics.field673] = var1;
        Statics.field673 = Statics.field673 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field475 = field693;
        }
        this.method817();
    }

    @ObfuscatedName("bn.ag(I)V")
    public void method804() {
        Container var1 = this.method818();
        long var2 = class183.method4541();
        long var4 = field670[Statics.field688];
        field670[Statics.field688] = var2;
        Statics.field688 = Statics.field688 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field694 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field686 - 1 > 50) {
            field686 -= 50;
            this.field684 = true;
            this.field668.setSize(Statics.field1842, Statics.field1324);
            this.field668.setVisible(true);
            if (this.field663 == var1) {
                Insets var7 = this.field663.getInsets();
                this.field668.setLocation(this.field676 + var7.left, this.field677 + var7.top);
            } else {
                this.field668.setLocation(this.field676, this.field677);
            }
        }
        if (this.field685) {
            this.method806();
        }
        this.method814();
        this.method884(this.field684);
        if (this.field684) {
            this.method929();
        }
        this.field684 = false;
    }

    @ObfuscatedName("bn.ap(B)V")
    public final void method814() {
        class288 var1 = this.method875();
        if (this.field674 != var1.field3796 || this.field675 != var1.field3797 || this.field687) {
            this.method906();
            this.field687 = false;
        }
    }

    @ObfuscatedName("bn.av(S)V")
    public final void method913() {
        this.field687 = true;
    }

    @ObfuscatedName("bn.ak(I)V")
    public final synchronized void method807() {
        if (field680) {
            return;
        }
        field680 = true;
        try {
            this.field668.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method863();
        } catch (Exception var7) {
        }
        if (this.field663 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field671 != null) {
            try {
                Statics.field671.method2795();
            } catch (Exception var5) {
            }
        }
        this.method820();
    }

    public final void start() {
        if (field660 == this && !field680) {
            field662 = 0L;
        }
    }

    public final void stop() {
        if (field660 == this && !field680) {
            field662 = class183.method4541() + 4000L;
        }
    }

    public final void destroy() {
        if (field660 == this && !field680) {
            field662 = class183.method4541();
            class189.method1011(5000L);
            this.method807();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field660 != this || field680) {
            return;
        }
        this.field684 = true;
        if (class183.method4541() - this.field689 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1842 && var2.height >= Statics.field1324) {
                this.field685 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field693 = true;
        this.field684 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field693 = false;
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

    @ObfuscatedName("bn.ay(ILjava/lang/String;ZI)V")
    public final void method816(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field668.getGraphics();
            if (Statics.field3414 == null) {
                Statics.field3414 = new Font("Helvetica", 1, 13);
                Statics.field3433 = this.field668.getFontMetrics(Statics.field3414);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field1842, Statics.field1324);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field691 == null) {
                    Statics.field691 = this.field668.createImage(304, 34);
                }
                Graphics var6 = Statics.field691.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field3414);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field3433.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field691, Statics.field1842 / 2 - 152, Statics.field1324 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field1842 / 2 - 152;
                int var9 = Statics.field1324 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field3414);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field3433.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field668.repaint();
        }
    }

    @ObfuscatedName("bn.az(I)V")
    public final void method877() {
        Statics.field691 = null;
        Statics.field3414 = null;
        Statics.field3433 = null;
    }

    @ObfuscatedName("bn.aw(Ljava/lang/String;B)V")
    public void method901(String arg0) {
        if (this.field664) {
            return;
        }
        this.field664 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bn.au(B)Ljava/awt/Container;")
    public Container method818() {
        return this.field663 == null ? this : this.field663;
    }

    @ObfuscatedName("bn.ac(B)Lkp;")
    public class288 method875() {
        Container var1 = this.method818();
        int var2 = Math.max(var1.getWidth(), this.field678);
        int var3 = Math.max(var1.getHeight(), this.field682);
        if (this.field663 != null) {
            Insets var4 = this.field663.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class288(var2, var3);
    }

    @ObfuscatedName("bn.ai(I)Z")
    public final boolean method805() {
        return this.field663 != null;
    }

    @ObfuscatedName("ei.ax(I)I")
    public static int method2737() {
        int var0 = 0;
        if (Statics.field1281 == null || !Statics.field1281.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field1281 = var2;
                        field695 = -1L;
                        field681 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field1281 != null) {
            long var4 = class183.method4541();
            long var6 = Statics.field1281.getCollectionTime();
            if (field681 != -1L) {
                long var8 = var6 - field681;
                long var10 = var4 - field695;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field681 = var6;
            field695 = var4;
        }
        return var0;
    }

    @ObfuscatedName("bn.y(I)V")
    public abstract void method809();

    public abstract void init();

    @ObfuscatedName("bn.an(I)V")
    public abstract void method817();

    @ObfuscatedName("bn.af(I)V")
    public abstract void method820();

    @ObfuscatedName("bn.am(B)V")
    public abstract void method863();

    @ObfuscatedName("bn.at(I)V")
    public abstract void method878();

    @ObfuscatedName("bn.ah(ZI)V")
    public abstract void method884(boolean arg0);
}
