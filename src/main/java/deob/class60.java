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

@ObfuscatedName("bf")
public abstract class class60 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bf.i")
    public static class60 field659 = null;

    @ObfuscatedName("bf.o")
    public static int field662 = 0;

    @ObfuscatedName("bf.j")
    public static long field672 = 0L;

    @ObfuscatedName("bf.k")
    public static boolean field687 = false;

    @ObfuscatedName("bf.z")
    public boolean field663 = false;

    @ObfuscatedName("bf.r")
    public static int field685 = 20;

    @ObfuscatedName("bf.d")
    public static int field664 = 1;

    @ObfuscatedName("bf.a")
    public static int field667 = 0;

    @ObfuscatedName("bf.l")
    public static long[] field668 = new long[32];

    @ObfuscatedName("bf.b")
    public static long[] field665 = new long[32];

    @ObfuscatedName("bf.t")
    public int field670;

    @ObfuscatedName("bf.v")
    public int field671;

    @ObfuscatedName("bf.n")
    public int field661 = 0;

    @ObfuscatedName("bf.u")
    public int field658 = 0;

    @ObfuscatedName("bf.s")
    public int field673;

    @ObfuscatedName("bf.ac")
    public int field675;

    @ObfuscatedName("bf.ap")
    public int field676;

    @ObfuscatedName("bf.al")
    public int field677;

    @ObfuscatedName("bf.ak")
    public Frame field678;

    @ObfuscatedName("bf.as")
    public Canvas field679;

    @ObfuscatedName("bf.aa")
    public volatile boolean field693 = true;

    @ObfuscatedName("bf.ao")
    public static int field681 = 500;

    @ObfuscatedName("bf.am")
    public boolean field682 = false;

    @ObfuscatedName("bf.aq")
    public volatile boolean field683 = false;

    @ObfuscatedName("bf.ae")
    public volatile long field666 = 0L;

    @ObfuscatedName("bf.ax")
    public class51 field660;

    @ObfuscatedName("bf.ag")
    public Clipboard field686;

    @ObfuscatedName("bf.ay")
    public final EventQueue field680;

    @ObfuscatedName("bf.ad")
    public static volatile boolean field688 = true;

    @ObfuscatedName("bf.az")
    public static long field690 = -1L;

    @ObfuscatedName("bf.aj")
    public static long field691 = -1L;

    public class60() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field680 = var1;
        class53 var3 = new class53();
        Statics.field323 = var3;
    }

    @ObfuscatedName("bf.z(IIB)V")
    public final void method794(int arg0, int arg1) {
        if (this.field676 != arg0 || this.field677 != arg1) {
            this.method788();
        }
        this.field676 = arg0;
        this.field677 = arg1;
    }

    @ObfuscatedName("bf.p(Ljava/lang/Object;I)V")
    public final void method772(Object arg0) {
        if (this.field680 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field680.peekEvent() != null; var2++) {
            class204.method2982(1L);
        }
        if (arg0 != null) {
            this.field680.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bf.w(I)Lfz;")
    public class169 method773() {
        if (this.field660 == null) {
            this.field660 = new class51();
            this.field660.method676(this.field679);
        }
        return this.field660;
    }

    @ObfuscatedName("bf.r(I)V")
    public void method774() {
        this.field686 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bf.d(Ljava/lang/String;B)V")
    public void method797(String arg0) {
        this.field686.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bf.a(I)V")
    public final void method776() {
        if (Statics.field2801.toLowerCase().indexOf("microsoft") == -1) {
            class52.field620[44] = 71;
            class52.field620[45] = 26;
            class52.field620[46] = 72;
            class52.field620[47] = 73;
            class52.field620[59] = 57;
            class52.field620[61] = 27;
            class52.field620[91] = 42;
            class52.field620[92] = 74;
            class52.field620[93] = 43;
            class52.field620[192] = 28;
            class52.field620[222] = 58;
            class52.field620[520] = 59;
        } else {
            class52.field620[186] = 57;
            class52.field620[187] = 27;
            class52.field620[188] = 71;
            class52.field620[189] = 26;
            class52.field620[190] = 72;
            class52.field620[191] = 73;
            class52.field620[192] = 58;
            class52.field620[219] = 42;
            class52.field620[220] = 74;
            class52.field620[221] = 43;
            class52.field620[222] = 59;
            class52.field620[223] = 28;
        }
        Canvas var1 = this.field679;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class52.field623);
        var1.addFocusListener(class52.field623);
    }

    @ObfuscatedName("bf.b(I)V")
    public final void method793() {
        class61.method4426(this.field679);
    }

    @ObfuscatedName("bf.h(I)V")
    public final void method778() {
        Container var1 = this.method790();
        if (var1 == null) {
            return;
        }
        class324 var2 = this.method798();
        this.field670 = Math.max(var2.field3937, this.field673);
        this.field671 = Math.max(var2.field3938, this.field675);
        if (this.field670 <= 0) {
            this.field670 = 1;
        }
        if (this.field671 <= 0) {
            this.field671 = 1;
        }
        Statics.field3766 = Math.min(this.field670, this.field676);
        Statics.field554 = Math.min(this.field671, this.field677);
        this.field661 = (this.field670 - Statics.field3766) / 2;
        this.field658 = 0;
        this.field679.setSize(Statics.field3766, Statics.field554);
        Statics.field3942 = new class59(Statics.field3766, Statics.field554, this.field679);
        if (this.field678 == var1) {
            Insets var3 = this.field678.getInsets();
            this.field679.setLocation(this.field661 + var3.left, this.field658 + var3.top);
        } else {
            this.field679.setLocation(this.field661, this.field658);
        }
        this.field693 = true;
        this.method823();
    }

    @ObfuscatedName("bf.y(I)V")
    public void method780() {
        int var1 = this.field661;
        int var2 = this.field658;
        int var3 = this.field670 - Statics.field3766 - var1;
        int var4 = this.field671 - Statics.field554 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method790();
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
                var9.fillRect(var6, var7, var1, this.field671);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field670, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field670 + var6 - var3, var7, var3, this.field671);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field671 + var7 - var4, this.field670, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bf.s(I)V")
    public final void method816() {
        Canvas var1 = this.field679;
        var1.removeKeyListener(class52.field623);
        var1.removeFocusListener(class52.field623);
        class52.field611 = -1;
        class61.method991(this.field679);
        if (this.field660 != null) {
            this.field660.method675(this.field679);
        }
        this.method783();
        Canvas var2 = this.field679;
        var2.setFocusTraversalKeysEnabled(false);
        var2.addKeyListener(class52.field623);
        var2.addFocusListener(class52.field623);
        class61.method4426(this.field679);
        if (this.field660 != null) {
            this.field660.method676(this.field679);
        }
        this.method788();
    }

    @ObfuscatedName("bf.ac(IIIB)V")
    public final void method782(int arg0, int arg1, int arg2) {
        try {
            if (field659 != null) {
                field662++;
                if (field662 >= 3) {
                    this.method803("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field659 = this;
            Statics.field3766 = arg0;
            Statics.field554 = arg1;
            Statics.field2180 = arg2;
            Statics.field2179 = this;
            if (Statics.field684 == null) {
                Statics.field684 = new class167();
            }
            Statics.field684.method2989(this, 1);
        } catch (Exception var5) {
            class165.method2883((String) null, var5);
            this.method803("crash");
        }
    }

    @ObfuscatedName("bf.ap(I)V")
    public final synchronized void method783() {
        Container var1 = this.method790();
        if (this.field679 != null) {
            this.field679.removeFocusListener(this);
            var1.remove(this.field679);
        }
        Statics.field3766 = Math.max(var1.getWidth(), this.field673);
        Statics.field554 = Math.max(var1.getHeight(), this.field675);
        if (this.field678 != null) {
            Insets var2 = this.field678.getInsets();
            Statics.field3766 -= var2.right + var2.left;
            Statics.field554 -= var2.top + var2.bottom;
        }
        this.field679 = new class55(this);
        var1.add(this.field679);
        this.field679.setSize(Statics.field3766, Statics.field554);
        this.field679.setVisible(true);
        this.field679.setBackground(Color.BLACK);
        if (this.field678 == var1) {
            Insets var3 = this.field678.getInsets();
            this.field679.setLocation(this.field661 + var3.left, this.field658 + var3.top);
        } else {
            this.field679.setLocation(this.field661, this.field658);
        }
        this.field679.addFocusListener(this);
        this.field679.requestFocus();
        this.field693 = true;
        if (Statics.field3942 != null && Statics.field3766 == Statics.field3942.field3961 && Statics.field554 == Statics.field3942.field3960) {
            ((class59) Statics.field3942).method756(this.field679);
            Statics.field3942.method764(0, 0);
        } else {
            Statics.field3942 = new class59(Statics.field3766, Statics.field554, this.field679);
        }
        this.field683 = false;
        this.field666 = class197.method26();
    }

    @ObfuscatedName("bf.al(I)Z")
    public final boolean method884() {
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
                this.method803("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2801 != null) {
                String var1 = Statics.field2801.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2196;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method803("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class319.method1(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class319.method4904(var4)) {
                            int var5 = class319.method2664(var4, 10, true);
                            if (var5 < 10) {
                                this.method803("wrongjava");
                                return;
                            }
                        }
                    }
                    field664 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method783();
            this.method909();
            Statics.field2178 = class173.method1448();
            while (field672 == 0L || class197.method26() < field672) {
                Statics.field669 = Statics.field2178.method2957(field685, field664);
                for (int var6 = 0; var6 < Statics.field669; var6++) {
                    this.method822();
                }
                this.method786();
                this.method772(this.field679);
            }
        } catch (Exception var8) {
            class165.method2883((String) null, var8);
            this.method803("crash");
        }
        this.method789();
    }

    @ObfuscatedName("bf.ai(I)V")
    public void method822() {
        long var1 = class197.method26();
        long var3 = field665[Statics.field1252];
        field665[Statics.field1252] = var1;
        Statics.field1252 = Statics.field1252 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field509 = field688;
        }
        this.method799();
    }

    @ObfuscatedName("bf.ab(I)V")
    public void method786() {
        Container var1 = this.method790();
        long var2 = class197.method26();
        long var4 = field668[Statics.field2243];
        field668[Statics.field2243] = var2;
        Statics.field2243 = Statics.field2243 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field667 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field681 - 1 > 50) {
            field681 -= 50;
            this.field693 = true;
            this.field679.setSize(Statics.field3766, Statics.field554);
            this.field679.setVisible(true);
            if (this.field678 == var1) {
                Insets var7 = this.field678.getInsets();
                this.field679.setLocation(this.field661 + var7.left, this.field658 + var7.top);
            } else {
                this.field679.setLocation(this.field661, this.field658);
            }
        }
        if (this.field683) {
            this.method816();
        }
        this.method787();
        this.method818(this.field693);
        if (this.field693) {
            this.method780();
        }
        this.field693 = false;
    }

    @ObfuscatedName("bf.ak(I)V")
    public final void method787() {
        class324 var1 = this.method798();
        if (this.field670 != var1.field3937 || this.field671 != var1.field3938 || this.field682) {
            this.method778();
            this.field682 = false;
        }
    }

    @ObfuscatedName("bf.as(I)V")
    public final void method788() {
        this.field682 = true;
    }

    @ObfuscatedName("bf.aa(I)V")
    public final synchronized void method789() {
        if (field687) {
            return;
        }
        field687 = true;
        try {
            this.field679.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method801();
        } catch (Exception var7) {
        }
        if (this.field678 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field684 != null) {
            try {
                Statics.field684.method2990();
            } catch (Exception var5) {
            }
        }
        this.method879();
    }

    @ObfuscatedName("aw.ah(I)V")
    public static final void method517() {
        Statics.field2178.method2956();
        for (int var0 = 0; var0 < 32; var0++) {
            field668[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field665[var1] = 0L;
        }
        Statics.field669 = 0;
    }

    public final void start() {
        if (field659 == this && !field687) {
            field672 = 0L;
        }
    }

    public final void stop() {
        if (field659 == this && !field687) {
            field672 = class197.method26() + 4000L;
        }
    }

    public final void destroy() {
        if (field659 == this && !field687) {
            field672 = class197.method26();
            class204.method2982(5000L);
            this.method789();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field659 != this || field687) {
            return;
        }
        this.field693 = true;
        if (class197.method26() - this.field666 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field3766 && var2.height >= Statics.field554) {
                this.field683 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field688 = true;
        this.field693 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field688 = false;
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

    @ObfuscatedName("bf.af(ILjava/lang/String;ZI)V")
    public final void method779(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field679.getGraphics();
            if (Statics.field2250 == null) {
                Statics.field2250 = new Font("Helvetica", 1, 13);
                Statics.field1677 = this.field679.getFontMetrics(Statics.field2250);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field3766, Statics.field554);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field349 == null) {
                    Statics.field349 = this.field679.createImage(304, 34);
                }
                Graphics var6 = Statics.field349.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field2250);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field1677.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field349, Statics.field3766 / 2 - 152, Statics.field554 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field3766 / 2 - 152;
                int var9 = Statics.field554 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field2250);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field1677.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field679.repaint();
        }
    }

    @ObfuscatedName("bf.aw(I)V")
    public final void method802() {
        Statics.field349 = null;
        Statics.field2250 = null;
        Statics.field1677 = null;
    }

    @ObfuscatedName("bf.ax(Ljava/lang/String;I)V")
    public void method803(String arg0) {
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

    @ObfuscatedName("bf.ag(B)Ljava/awt/Container;")
    public Container method790() {
        return this.field678 == null ? this : this.field678;
    }

    @ObfuscatedName("bf.ay(I)Llg;")
    public class324 method798() {
        Container var1 = this.method790();
        int var2 = Math.max(var1.getWidth(), this.field673);
        int var3 = Math.max(var1.getHeight(), this.field675);
        if (this.field678 != null) {
            Insets var4 = this.field678.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class324(var2, var3);
    }

    @ObfuscatedName("bf.ad(I)Z")
    public final boolean method883() {
        return this.field678 != null;
    }

    @ObfuscatedName("ei.at(S)I")
    public static int method2577() {
        int var0 = 0;
        if (Statics.field689 == null || !Statics.field689.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field689 = var2;
                        field691 = -1L;
                        field690 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field689 != null) {
            long var4 = class197.method26();
            long var6 = Statics.field689.getCollectionTime();
            if (field690 != -1L) {
                long var8 = var6 - field690;
                long var10 = var4 - field691;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field690 = var6;
            field691 = var4;
        }
        return var0;
    }

    @ObfuscatedName("bf.am(I)V")
    public abstract void method799();

    @ObfuscatedName("bf.ae(I)V")
    public abstract void method801();

    @ObfuscatedName("bf.aq(ZI)V")
    public abstract void method818(boolean arg0);

    @ObfuscatedName("bf.n(I)V")
    public abstract void method823();

    public abstract void init();

    @ObfuscatedName("bf.av(B)V")
    public abstract void method879();

    @ObfuscatedName("bf.ao(I)V")
    public abstract void method909();
}
