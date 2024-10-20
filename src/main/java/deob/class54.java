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
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.URL;
import java.util.Iterator;

@ObfuscatedName("bf")
public abstract class class54 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bf.t")
    public static class54 field446 = null;

    @ObfuscatedName("bf.o")
    public static int field449 = 0;

    @ObfuscatedName("bf.e")
    public static long field445 = 0L;

    @ObfuscatedName("bf.i")
    public static boolean field447 = false;

    @ObfuscatedName("bf.g")
    public boolean field448 = false;

    @ObfuscatedName("bf.l")
    public static int field469 = 20;

    @ObfuscatedName("bf.j")
    public static int field450 = 1;

    @ObfuscatedName("bf.m")
    public static int field451 = 0;

    @ObfuscatedName("bf.v")
    public static long[] field461 = new long[32];

    @ObfuscatedName("bf.k")
    public static long[] field455 = new long[32];

    @ObfuscatedName("bf.z")
    public int field473;

    @ObfuscatedName("bf.f")
    public int field443;

    @ObfuscatedName("bf.b")
    public int field456 = 0;

    @ObfuscatedName("bf.r")
    public int field459 = 0;

    @ObfuscatedName("bf.u")
    public int field460;

    @ObfuscatedName("bf.ae")
    public int field465;

    @ObfuscatedName("bf.af")
    public int field462;

    @ObfuscatedName("bf.az")
    public int field452;

    @ObfuscatedName("bf.au")
    public Frame field444;

    @ObfuscatedName("bf.ay")
    public Canvas field466;

    @ObfuscatedName("bf.aa")
    public volatile boolean field467 = true;

    @ObfuscatedName("bf.as")
    public static int field468 = 500;

    @ObfuscatedName("bf.ak")
    public boolean field458 = false;

    @ObfuscatedName("bf.ac")
    public volatile boolean field470 = false;

    @ObfuscatedName("bf.aw")
    public volatile long field471 = 0L;

    @ObfuscatedName("bf.al")
    public class45 field472;

    @ObfuscatedName("bf.ad")
    public Clipboard field474;

    @ObfuscatedName("bf.am")
    public final EventQueue field457;

    @ObfuscatedName("bf.ao")
    public static volatile boolean field475 = true;

    @ObfuscatedName("bf.ag")
    public static long field476 = -1L;

    @ObfuscatedName("bf.ai")
    public static long field477 = -1L;

    public class54() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field457 = var1;
        class106.method3163(new class47());
    }

    @ObfuscatedName("bf.i(III)V")
    public final void method817(int arg0, int arg1) {
        if (this.field462 != arg0 || this.field452 != arg1) {
            this.method800();
        }
        this.field462 = arg0;
        this.field452 = arg1;
    }

    @ObfuscatedName("bf.g(Ljava/lang/Object;I)V")
    public final void method868(Object arg0) {
        if (this.field457 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field457.peekEvent() != null; var2++) {
            class299.method4884(1L);
        }
        if (arg0 != null) {
            this.field457.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bf.d(I)Lfi;")
    public class169 method776() {
        if (this.field472 == null) {
            this.field472 = new class45();
            this.field472.method672(this.field466);
        }
        return this.field472;
    }

    @ObfuscatedName("bf.l(B)V")
    public void method912() {
        this.field474 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bf.j(Ljava/lang/String;I)V")
    public void method788(String arg0) {
        this.field474.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bf.m(I)V")
    public final void method779() {
        class46.method3152();
        Canvas var1 = this.field466;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class46.field392);
        var1.addFocusListener(class46.field392);
    }

    @ObfuscatedName("bf.p(I)V")
    public final void method810() {
        Canvas var1 = this.field466;
        var1.addMouseListener(class55.field502);
        var1.addMouseMotionListener(class55.field502);
        var1.addFocusListener(class55.field502);
    }

    @ObfuscatedName("bf.h(I)V")
    public final void method781() {
        Container var1 = this.method807();
        if (var1 == null) {
            return;
        }
        class320 var2 = this.method808();
        this.field473 = Math.max(var2.field3838, this.field460);
        this.field443 = Math.max(var2.field3839, this.field465);
        if (this.field473 <= 0) {
            this.field473 = 1;
        }
        if (this.field443 <= 0) {
            this.field443 = 1;
        }
        Statics.field3615 = Math.min(this.field473, this.field462);
        Statics.field345 = Math.min(this.field443, this.field452);
        this.field456 = (this.field473 - Statics.field3615) / 2;
        this.field459 = 0;
        this.field466.setSize(Statics.field3615, Statics.field345);
        Statics.field418 = new class53(Statics.field3615, Statics.field345, this.field466);
        if (this.field444 == var1) {
            Insets var3 = this.field444.getInsets();
            this.field466.setLocation(this.field456 + var3.left, this.field459 + var3.top);
        } else {
            this.field466.setLocation(this.field456, this.field459);
        }
        this.field467 = true;
        this.method782();
    }

    @ObfuscatedName("bf.n(I)V")
    public void method885() {
        int var1 = this.field456;
        int var2 = this.field459;
        int var3 = this.field473 - Statics.field3615 - var1;
        int var4 = this.field443 - Statics.field345 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method807();
            int var6 = 0;
            int var7 = 0;
            if (this.field444 == var5) {
                Insets var8 = this.field444.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field443);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field473, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field473 + var6 - var3, var7, var3, this.field443);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field443 + var7 - var4, this.field473, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bf.x(I)V")
    public final void method784() {
        Canvas var1 = this.field466;
        var1.removeKeyListener(class46.field392);
        var1.removeFocusListener(class46.field392);
        class46.field388 = -1;
        Canvas var2 = this.field466;
        var2.removeMouseListener(class55.field502);
        var2.removeMouseMotionListener(class55.field502);
        var2.removeFocusListener(class55.field502);
        class55.field479 = 0;
        if (this.field472 != null) {
            this.field472.method673(this.field466);
        }
        this.method786();
        Canvas var3 = this.field466;
        var3.setFocusTraversalKeysEnabled(false);
        var3.addKeyListener(class46.field392);
        var3.addFocusListener(class46.field392);
        class55.method3206(this.field466);
        if (this.field472 != null) {
            this.field472.method672(this.field466);
        }
        this.method800();
    }

    @ObfuscatedName("bf.w(IIIB)V")
    public final void method831(int arg0, int arg1, int arg2) {
        try {
            if (field446 != null) {
                field449++;
                if (field449 >= 3) {
                    this.method806("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field446 = this;
            Statics.field3615 = arg0;
            Statics.field345 = arg1;
            Statics.field4008 = arg2;
            Statics.field4047 = this;
            if (Statics.field464 == null) {
                Statics.field464 = new class167();
            }
            Statics.field464.method3238(this, 1);
        } catch (Exception var5) {
            Statics.method3817((String) null, var5);
            this.method806("crash");
        }
    }

    @ObfuscatedName("bf.q(B)V")
    public final synchronized void method786() {
        Container var1 = this.method807();
        if (this.field466 != null) {
            this.field466.removeFocusListener(this);
            var1.remove(this.field466);
        }
        Statics.field3615 = Math.max(var1.getWidth(), this.field460);
        Statics.field345 = Math.max(var1.getHeight(), this.field465);
        if (this.field444 != null) {
            Insets var2 = this.field444.getInsets();
            Statics.field3615 -= var2.right + var2.left;
            Statics.field345 -= var2.top + var2.bottom;
        }
        this.field466 = new class49(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field466);
        this.field466.setSize(Statics.field3615, Statics.field345);
        this.field466.setVisible(true);
        this.field466.setBackground(Color.BLACK);
        if (this.field444 == var1) {
            Insets var3 = this.field444.getInsets();
            this.field466.setLocation(this.field456 + var3.left, this.field459 + var3.top);
        } else {
            this.field466.setLocation(this.field456, this.field459);
        }
        this.field466.addFocusListener(this);
        this.field466.requestFocus();
        this.field467 = true;
        if (Statics.field418 != null && Statics.field3615 == Statics.field418.field3852 && Statics.field345 == Statics.field418.field3851) {
            ((class53) Statics.field418).method757(this.field466);
            Statics.field418.method759(0, 0);
        } else {
            Statics.field418 = new class53(Statics.field3615, Statics.field345, this.field466);
        }
        this.field470 = false;
        this.field471 = Statics.method184();
    }

    @ObfuscatedName("bf.z(I)Z")
    public final boolean method874() {
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
                this.method806("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2029 != null) {
                String var1 = Statics.field2029.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2556;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method806("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class292.method147(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class292.method4169(var4) && Statics.method4020(var4) < 10) {
                            this.method806("wrongjava");
                            return;
                        }
                    }
                    field450 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method786();
            this.method801();
            Statics.field453 = class171.method1270();
            while (field445 == 0L || Statics.method184() < field445) {
                Statics.field3668 = Statics.field453.method3222(field469, field450);
                for (int var5 = 0; var5 < Statics.field3668; var5++) {
                    this.method789();
                }
                this.method780();
                this.method868(this.field466);
            }
        } catch (Exception var7) {
            Statics.method3817((String) null, var7);
            this.method806("crash");
        }
        this.method837();
    }

    @ObfuscatedName("bf.ax(B)V")
    public void method789() {
        long var1 = Statics.method184();
        long var3 = field455[Statics.field107];
        field455[Statics.field107] = var1;
        Statics.field107 = Statics.field107 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field49 = field475;
        }
        this.method802();
    }

    @ObfuscatedName("bf.aj(I)V")
    public void method780() {
        Container var1 = this.method807();
        long var2 = Statics.method184();
        long var4 = field461[Statics.field454];
        field461[Statics.field454] = var2;
        Statics.field454 = Statics.field454 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field451 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field468 - 1 > 50) {
            field468 -= 50;
            this.field467 = true;
            this.field466.setSize(Statics.field3615, Statics.field345);
            this.field466.setVisible(true);
            if (this.field444 == var1) {
                Insets var7 = this.field444.getInsets();
                this.field466.setLocation(this.field456 + var7.left, this.field459 + var7.top);
            } else {
                this.field466.setLocation(this.field456, this.field459);
            }
        }
        if (this.field470) {
            this.method784();
        }
        this.method791();
        this.method899(this.field467);
        if (this.field467) {
            this.method885();
        }
        this.field467 = false;
    }

    @ObfuscatedName("bf.au(I)V")
    public final void method791() {
        class320 var1 = this.method808();
        if (this.field473 != var1.field3838 || this.field443 != var1.field3839 || this.field458) {
            this.method781();
            this.field458 = false;
        }
    }

    @ObfuscatedName("bf.ay(B)V")
    public final void method800() {
        this.field458 = true;
    }

    @ObfuscatedName("bf.aa(B)V")
    public final synchronized void method837() {
        if (field447) {
            return;
        }
        field447 = true;
        try {
            this.field466.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method804();
        } catch (Exception var7) {
        }
        if (this.field444 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field464 != null) {
            try {
                Statics.field464.method3230();
            } catch (Exception var5) {
            }
        }
        this.method847();
    }

    @ObfuscatedName("o.aq(B)V")
    public static final void method15() {
        Statics.field453.method3223();
        for (int var0 = 0; var0 < 32; var0++) {
            field461[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field455[var1] = 0L;
        }
        Statics.field3668 = 0;
    }

    public final void start() {
        if (field446 == this && !field447) {
            field445 = 0L;
        }
    }

    public final void stop() {
        if (field446 == this && !field447) {
            field445 = Statics.method184() + 4000L;
        }
    }

    public final void destroy() {
        if (field446 == this && !field447) {
            field445 = Statics.method184();
            class299.method4884(5000L);
            this.method837();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field446 != this || field447) {
            return;
        }
        this.field467 = true;
        if (Statics.method184() - this.field471 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field3615 && var2.height >= Statics.field345) {
                this.field470 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field475 = true;
        this.field467 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field475 = false;
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

    @ObfuscatedName("bf.ar(ILjava/lang/String;ZI)V")
    public final void method823(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field466.getGraphics();
            if (Statics.field463 == null) {
                Statics.field463 = new Font("Helvetica", 1, 13);
                Statics.field379 = this.field466.getFontMetrics(Statics.field463);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field3615, Statics.field345);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field255 == null) {
                    Statics.field255 = this.field466.createImage(304, 34);
                }
                Graphics var6 = Statics.field255.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field463);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field379.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field255, Statics.field3615 / 2 - 152, Statics.field345 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field3615 / 2 - 152;
                int var9 = Statics.field345 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field463);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field379.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field466.repaint();
        }
    }

    @ObfuscatedName("bf.av(B)V")
    public final void method805() {
        Statics.field255 = null;
        Statics.field463 = null;
        Statics.field379 = null;
    }

    @ObfuscatedName("bf.al(Ljava/lang/String;B)V")
    public void method806(String arg0) {
        if (this.field448) {
            return;
        }
        this.field448 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bf.ad(I)Ljava/awt/Container;")
    public Container method807() {
        return this.field444 == null ? this : this.field444;
    }

    @ObfuscatedName("bf.am(I)Lll;")
    public class320 method808() {
        Container var1 = this.method807();
        int var2 = Math.max(var1.getWidth(), this.field460);
        int var3 = Math.max(var1.getHeight(), this.field465);
        if (this.field444 != null) {
            Insets var4 = this.field444.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class320(var2, var3);
    }

    @ObfuscatedName("bf.ao(B)Z")
    public final boolean method809() {
        return this.field444 != null;
    }

    @ObfuscatedName("l.at(I)I")
    public static int method74() {
        int var0 = 0;
        if (Statics.field1231 == null || !Statics.field1231.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field1231 = var2;
                        field477 = -1L;
                        field476 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field1231 != null) {
            long var4 = Statics.method184();
            long var6 = Statics.field1231.getCollectionTime();
            if (field476 != -1L) {
                long var8 = var6 - field476;
                long var10 = var4 - field477;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field476 = var6;
            field477 = var4;
        }
        return var0;
    }

    @ObfuscatedName("bf.v(I)V")
    public abstract void method782();

    @ObfuscatedName("bf.as(I)V")
    public abstract void method801();

    @ObfuscatedName("bf.ak(I)V")
    public abstract void method802();

    @ObfuscatedName("bf.aw(I)V")
    public abstract void method804();

    public abstract void init();

    @ObfuscatedName("bf.an(B)V")
    public abstract void method847();

    @ObfuscatedName("bf.ac(ZI)V")
    public abstract void method899(boolean arg0);
}
