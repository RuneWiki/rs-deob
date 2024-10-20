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

@ObfuscatedName("ah")
public abstract class class48 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ah.r")
    public static class48 field428 = null;

    @ObfuscatedName("ah.e")
    public static int field429 = 0;

    @ObfuscatedName("ah.q")
    public static long field437 = 0L;

    @ObfuscatedName("ah.c")
    public static boolean field431 = false;

    @ObfuscatedName("ah.l")
    public boolean field432 = false;

    @ObfuscatedName("ah.n")
    public static int field433 = 20;

    @ObfuscatedName("ah.i")
    public static int field439 = 1;

    @ObfuscatedName("ah.p")
    public static int field435 = 0;

    @ObfuscatedName("ah.j")
    public static long[] field430 = new long[32];

    @ObfuscatedName("ah.h")
    public static long[] field445 = new long[32];

    @ObfuscatedName("ah.a")
    public int field440;

    @ObfuscatedName("ah.t")
    public int field441;

    @ObfuscatedName("ah.k")
    public int field443 = 0;

    @ObfuscatedName("ah.z")
    public int field442 = 0;

    @ObfuscatedName("ah.o")
    public int field444;

    @ObfuscatedName("ah.af")
    public int field459;

    @ObfuscatedName("ah.an")
    public int field446;

    @ObfuscatedName("ah.ax")
    public int field447;

    @ObfuscatedName("ah.ac")
    public Frame field448;

    @ObfuscatedName("ah.az")
    public Canvas field449;

    @ObfuscatedName("ah.aj")
    public volatile boolean field450 = true;

    @ObfuscatedName("ah.ab")
    public static int field451 = 500;

    @ObfuscatedName("ah.ar")
    public boolean field452 = false;

    @ObfuscatedName("ah.at")
    public volatile boolean field453 = false;

    @ObfuscatedName("ah.as")
    public volatile long field454 = 0L;

    @ObfuscatedName("ah.ad")
    public class39 field455;

    @ObfuscatedName("ah.al")
    public Clipboard field456;

    @ObfuscatedName("ah.ak")
    public final EventQueue field457;

    @ObfuscatedName("ah.ao")
    public static volatile boolean field458 = true;

    @ObfuscatedName("ah.ah")
    public static long field461 = -1L;

    @ObfuscatedName("ah.ap")
    public static long field460 = -1L;

    public class48() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field457 = var1;
        class41 var3 = new class41();
        Statics.field1037 = var3;
    }

    @ObfuscatedName("ah.i(IIS)V")
    public final void method871(int arg0, int arg1) {
        if (this.field446 != arg0 || this.field447 != arg1) {
            this.method788();
        }
        this.field446 = arg0;
        this.field447 = arg1;
    }

    @ObfuscatedName("ah.p(Ljava/lang/Object;I)V")
    public final void method766(Object arg0) {
        if (this.field457 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field457.peekEvent() != null; var2++) {
            class194.method4976(1L);
        }
        if (arg0 != null) {
            this.field457.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("ah.m(B)Lft;")
    public class159 method769() {
        if (this.field455 == null) {
            this.field455 = new class39();
            this.field455.method643(this.field449);
        }
        return this.field455;
    }

    @ObfuscatedName("ah.d(I)V")
    public void method839() {
        this.field456 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("ah.j(Ljava/lang/String;I)V")
    public void method784(String arg0) {
        this.field456.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("ah.x(I)V")
    public final void method765() {
        class40.method1842();
        class40.method535(this.field449);
    }

    @ObfuscatedName("ah.v(I)V")
    public final void method771() {
        class49.method540(this.field449);
    }

    @ObfuscatedName("ah.h(B)V")
    public final void method856() {
        Container var1 = this.method804();
        if (var1 == null) {
            return;
        }
        class316 var2 = this.method797();
        this.field440 = Math.max(var2.field3838, this.field444);
        this.field441 = Math.max(var2.field3839, this.field459);
        if (this.field440 <= 0) {
            this.field440 = 1;
        }
        if (this.field441 <= 0) {
            this.field441 = 1;
        }
        Statics.field1039 = Math.min(this.field440, this.field446);
        Statics.field1938 = Math.min(this.field441, this.field447);
        this.field443 = (this.field440 - Statics.field1039) / 2;
        this.field442 = 0;
        this.field449.setSize(Statics.field1039, Statics.field1938);
        Statics.field314 = new class47(Statics.field1039, Statics.field1938, this.field449);
        if (this.field448 == var1) {
            Insets var3 = this.field448.getInsets();
            this.field449.setLocation(this.field443 + var3.left, this.field442 + var3.top);
        } else {
            this.field449.setLocation(this.field443, this.field442);
        }
        this.field450 = true;
        this.method834();
    }

    @ObfuscatedName("ah.a(I)V")
    public void method902() {
        int var1 = this.field443;
        int var2 = this.field442;
        int var3 = this.field440 - Statics.field1039 - var1;
        int var4 = this.field441 - Statics.field1938 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method804();
            int var6 = 0;
            int var7 = 0;
            if (this.field448 == var5) {
                Insets var8 = this.field448.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field441);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field440, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field440 + var6 - var3, var7, var3, this.field441);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field441 + var7 - var4, this.field440, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("ah.t(B)V")
    public final void method775() {
        class40.method2014(this.field449);
        Canvas var1 = this.field449;
        var1.removeMouseListener(class49.field471);
        var1.removeMouseMotionListener(class49.field471);
        var1.removeFocusListener(class49.field471);
        class49.field482 = 0;
        if (this.field455 != null) {
            this.field455.method649(this.field449);
        }
        this.method852();
        class40.method535(this.field449);
        class49.method540(this.field449);
        if (this.field455 != null) {
            this.field455.method643(this.field449);
        }
        this.method788();
    }

    @ObfuscatedName("ah.k(IIII)V")
    public final void method776(int arg0, int arg1, int arg2) {
        try {
            if (field428 != null) {
                field429++;
                if (field429 >= 3) {
                    this.method795("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field428 = this;
            Statics.field1039 = arg0;
            Statics.field1938 = arg1;
            Statics.field3832 = arg2;
            Statics.field2000 = this;
            if (Statics.field427 == null) {
                Statics.field427 = new class157();
            }
            Statics.field427.method3200(this, 1);
        } catch (Exception var5) {
            class155.method1917((String) null, var5);
            this.method795("crash");
        }
    }

    @ObfuscatedName("ah.s(I)V")
    public final synchronized void method852() {
        Container var1 = this.method804();
        if (this.field449 != null) {
            this.field449.removeFocusListener(this);
            var1.remove(this.field449);
        }
        Statics.field1039 = Math.max(var1.getWidth(), this.field444);
        Statics.field1938 = Math.max(var1.getHeight(), this.field459);
        if (this.field448 != null) {
            Insets var2 = this.field448.getInsets();
            Statics.field1039 -= var2.right + var2.left;
            Statics.field1938 -= var2.top + var2.bottom;
        }
        this.field449 = new class43(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field449);
        this.field449.setSize(Statics.field1039, Statics.field1938);
        this.field449.setVisible(true);
        this.field449.setBackground(Color.BLACK);
        if (this.field448 == var1) {
            Insets var3 = this.field448.getInsets();
            this.field449.setLocation(this.field443 + var3.left, this.field442 + var3.top);
        } else {
            this.field449.setLocation(this.field443, this.field442);
        }
        this.field449.addFocusListener(this);
        this.field449.requestFocus();
        this.field450 = true;
        if (Statics.field314 != null && Statics.field1039 == Statics.field314.field3865 && Statics.field1938 == Statics.field314.field3862) {
            ((class47) Statics.field314).method751(this.field449);
            Statics.field314.method758(0, 0);
        } else {
            Statics.field314 = new class47(Statics.field1039, Statics.field1938, this.field449);
        }
        this.field453 = false;
        this.field454 = class187.method2664();
    }

    @ObfuscatedName("ah.y(I)Z")
    public final boolean method778() {
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
                this.method795("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2018 != null) {
                String var1 = Statics.field2018.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2014;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method795("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class308.method4413(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class308.method4046(var4) && class308.method3359(var4) < 10) {
                            this.method795("wrongjava");
                            return;
                        }
                    }
                    field439 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method852();
            this.method789();
            Statics.field434 = class163.method4174();
            while (field437 == 0L || class187.method2664() < field437) {
                Statics.field2364 = Statics.field434.method3148(field433, field439);
                for (int var5 = 0; var5 < Statics.field2364; var5++) {
                    this.method779();
                }
                this.method780();
                this.method766(this.field449);
            }
        } catch (Exception var7) {
            class155.method1917((String) null, var7);
            this.method795("crash");
        }
        this.method783();
    }

    @ObfuscatedName("ah.u(B)V")
    public void method779() {
        long var1 = class187.method2664();
        long var3 = field445[Statics.field3864];
        field445[Statics.field3864] = var1;
        Statics.field3864 = Statics.field3864 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field2112 = field458;
        }
        this.method790();
    }

    @ObfuscatedName("ah.o(B)V")
    public void method780() {
        Container var1 = this.method804();
        long var2 = class187.method2664();
        long var4 = field430[Statics.field438];
        field430[Statics.field438] = var2;
        Statics.field438 = Statics.field438 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field435 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field451 - 1 > 50) {
            field451 -= 50;
            this.field450 = true;
            this.field449.setSize(Statics.field1039, Statics.field1938);
            this.field449.setVisible(true);
            if (this.field448 == var1) {
                Insets var7 = this.field448.getInsets();
                this.field449.setLocation(this.field443 + var7.left, this.field442 + var7.top);
            } else {
                this.field449.setLocation(this.field443, this.field442);
            }
        }
        if (this.field453) {
            this.method775();
        }
        this.method772();
        this.method791(this.field450);
        if (this.field450) {
            this.method902();
        }
        this.field450 = false;
    }

    @ObfuscatedName("ah.af(B)V")
    public final void method772() {
        class316 var1 = this.method797();
        if (this.field440 != var1.field3838 || this.field441 != var1.field3839 || this.field452) {
            this.method856();
            this.field452 = false;
        }
    }

    @ObfuscatedName("ah.an(B)V")
    public final void method788() {
        this.field452 = true;
    }

    @ObfuscatedName("ah.ax(I)V")
    public final synchronized void method783() {
        if (field431) {
            return;
        }
        field431 = true;
        try {
            this.field449.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method792();
        } catch (Exception var7) {
        }
        if (this.field448 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field427 != null) {
            try {
                Statics.field427.method3190();
            } catch (Exception var5) {
            }
        }
        this.method770();
    }

    public final void start() {
        if (field428 == this && !field431) {
            field437 = 0L;
        }
    }

    public final void stop() {
        if (field428 == this && !field431) {
            field437 = class187.method2664() + 4000L;
        }
    }

    public final void destroy() {
        if (field428 == this && !field431) {
            field437 = class187.method2664();
            class194.method4976(5000L);
            this.method783();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field428 != this || field431) {
            return;
        }
        this.field450 = true;
        if (class187.method2664() - this.field454 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1039 && var2.height >= Statics.field1938) {
                this.field453 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field458 = true;
        this.field450 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field458 = false;
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

    @ObfuscatedName("ah.as(ILjava/lang/String;ZI)V")
    public final void method793(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field449.getGraphics();
            if (Statics.field1964 == null) {
                Statics.field1964 = new Font("Helvetica", 1, 13);
                Statics.field1918 = this.field449.getFontMetrics(Statics.field1964);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field1039, Statics.field1938);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field1893 == null) {
                    Statics.field1893 = this.field449.createImage(304, 34);
                }
                Graphics var6 = Statics.field1893.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field1964);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field1918.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field1893, Statics.field1039 / 2 - 152, Statics.field1938 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field1039 / 2 - 152;
                int var9 = Statics.field1938 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1964);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field1918.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field449.repaint();
        }
    }

    @ObfuscatedName("ah.aa(I)V")
    public final void method794() {
        Statics.field1893 = null;
        Statics.field1964 = null;
        Statics.field1918 = null;
    }

    @ObfuscatedName("ah.ai(Ljava/lang/String;I)V")
    public void method795(String arg0) {
        if (this.field432) {
            return;
        }
        this.field432 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ah.ad(I)Ljava/awt/Container;")
    public Container method804() {
        return this.field448 == null ? this : this.field448;
    }

    @ObfuscatedName("ah.al(I)Llc;")
    public class316 method797() {
        Container var1 = this.method804();
        int var2 = Math.max(var1.getWidth(), this.field444);
        int var3 = Math.max(var1.getHeight(), this.field459);
        if (this.field448 != null) {
            Insets var4 = this.field448.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class316(var2, var3);
    }

    @ObfuscatedName("ah.ak(I)Z")
    public final boolean method798() {
        return this.field448 != null;
    }

    @ObfuscatedName("fo.ao(I)I")
    public static int method3391() {
        int var0 = 0;
        if (Statics.field25 == null || !Statics.field25.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field25 = var2;
                        field460 = -1L;
                        field461 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field25 != null) {
            long var4 = class187.method2664();
            long var6 = Statics.field25.getCollectionTime();
            if (field461 != -1L) {
                long var8 = var6 - field461;
                long var10 = var4 - field460;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field461 = var6;
            field460 = var4;
        }
        return var0;
    }

    @ObfuscatedName("ah.am(S)V")
    public abstract void method770();

    public abstract void init();

    @ObfuscatedName("ah.aw(I)V")
    public abstract void method789();

    @ObfuscatedName("ah.ae(I)V")
    public abstract void method790();

    @ObfuscatedName("ah.ar(ZI)V")
    public abstract void method791(boolean arg0);

    @ObfuscatedName("ah.at(I)V")
    public abstract void method792();

    @ObfuscatedName("ah.f(I)V")
    public abstract void method834();
}
