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

@ObfuscatedName("bo")
public abstract class class54 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bo.f")
    public static class54 field459 = null;

    @ObfuscatedName("bo.b")
    public static int field438 = 0;

    @ObfuscatedName("bo.g")
    public static long field439 = 0L;

    @ObfuscatedName("bo.z")
    public static boolean field440 = false;

    @ObfuscatedName("bo.p")
    public boolean field441 = false;

    @ObfuscatedName("bo.i")
    public static int field461 = 20;

    @ObfuscatedName("bo.k")
    public static int field449 = 1;

    @ObfuscatedName("bo.o")
    public static int field445 = 0;

    @ObfuscatedName("bo.r")
    public static long[] field447 = new long[32];

    @ObfuscatedName("bo.a")
    public static long[] field448 = new long[32];

    @ObfuscatedName("bo.s")
    public int field446;

    @ObfuscatedName("bo.t")
    public int field469;

    @ObfuscatedName("bo.m")
    public int field451 = 0;

    @ObfuscatedName("bo.v")
    public int field444 = 0;

    @ObfuscatedName("bo.j")
    public int field443;

    @ObfuscatedName("bo.af")
    public int field456;

    @ObfuscatedName("bo.ad")
    public int field455;

    @ObfuscatedName("bo.am")
    public int field436;

    @ObfuscatedName("bo.ao")
    public Frame field453;

    @ObfuscatedName("bo.aw")
    public Canvas field450;

    @ObfuscatedName("bo.ak")
    public volatile boolean field452 = true;

    @ObfuscatedName("bo.ab")
    public static int field460 = 500;

    @ObfuscatedName("bo.ar")
    public boolean field462 = false;

    @ObfuscatedName("bo.av")
    public volatile boolean field463 = false;

    @ObfuscatedName("bo.aq")
    public volatile long field464 = 0L;

    @ObfuscatedName("bo.at")
    public class45 field465;

    @ObfuscatedName("bo.ae")
    public Clipboard field466;

    @ObfuscatedName("bo.aj")
    public final EventQueue field467;

    @ObfuscatedName("bo.ap")
    public static volatile boolean field468 = true;

    @ObfuscatedName("bo.ay")
    public static long field458 = -1L;

    @ObfuscatedName("bo.ax")
    public static long field470 = -1L;

    public class54() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field467 = var1;
        class106.method369(new class47());
    }

    @ObfuscatedName("bo.p(III)V")
    public final void method780(int arg0, int arg1) {
        if (this.field455 != arg0 || this.field436 != arg1) {
            this.method796();
        }
        this.field455 = arg0;
        this.field436 = arg1;
    }

    @ObfuscatedName("bo.h(Ljava/lang/Object;I)V")
    public final void method781(Object arg0) {
        if (this.field467 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field467.peekEvent() != null; var2++) {
            try {
                Thread.sleep(1L);
            } catch (InterruptedException var4) {
            }
        }
        if (arg0 != null) {
            this.field467.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bo.y(I)Lfk;")
    public class169 method834() {
        if (this.field465 == null) {
            this.field465 = new class45();
            this.field465.method682(this.field450);
        }
        return this.field465;
    }

    @ObfuscatedName("bo.w(I)V")
    public void method872() {
        this.field466 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bo.i(Ljava/lang/String;I)V")
    public void method783(String arg0) {
        this.field466.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bo.k(I)V")
    public final void method785() {
        class46.method133();
        class46.method158(this.field450);
    }

    @ObfuscatedName("bo.x(B)V")
    public final void method786() {
        class55.method4079(this.field450);
    }

    @ObfuscatedName("bo.o(I)V")
    public final void method787() {
        Container var1 = this.method810();
        if (var1 == null) {
            return;
        }
        class319 var2 = this.method811();
        this.field446 = Math.max(var2.field3840, this.field443);
        this.field469 = Math.max(var2.field3838, this.field456);
        if (this.field446 <= 0) {
            this.field446 = 1;
        }
        if (this.field469 <= 0) {
            this.field469 = 1;
        }
        Statics.field1873 = Math.min(this.field446, this.field455);
        Statics.field310 = Math.min(this.field469, this.field436);
        this.field451 = (this.field446 - Statics.field1873) / 2;
        this.field444 = 0;
        this.field450.setSize(Statics.field1873, Statics.field310);
        Statics.field2507 = new class53(Statics.field1873, Statics.field310, this.field450);
        if (this.field453 == var1) {
            Insets var3 = this.field453.getInsets();
            this.field450.setLocation(this.field451 + var3.left, this.field444 + var3.top);
        } else {
            this.field450.setLocation(this.field451, this.field444);
        }
        this.field452 = true;
        this.method800();
    }

    @ObfuscatedName("bo.n(B)V")
    public void method842() {
        int var1 = this.field451;
        int var2 = this.field444;
        int var3 = this.field446 - Statics.field1873 - var1;
        int var4 = this.field469 - Statics.field310 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method810();
            int var6 = 0;
            int var7 = 0;
            if (this.field453 == var5) {
                Insets var8 = this.field453.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field469);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field446, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field446 + var6 - var3, var7, var3, this.field469);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field469 + var7 - var4, this.field446, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bo.c(I)V")
    public final void method789() {
        class46.method109(this.field450);
        Canvas var1 = this.field450;
        var1.removeMouseListener(class55.field475);
        var1.removeMouseMotionListener(class55.field475);
        var1.removeFocusListener(class55.field475);
        class55.field477 = 0;
        if (this.field465 != null) {
            this.field465.method676(this.field450);
        }
        this.method791();
        class46.method158(this.field450);
        class55.method4079(this.field450);
        if (this.field465 != null) {
            this.field465.method682(this.field450);
        }
        this.method796();
    }

    @ObfuscatedName("bo.s(IIIB)V")
    public final void method790(int arg0, int arg1, int arg2) {
        try {
            if (field459 != null) {
                field438++;
                if (field438 >= 3) {
                    this.method809("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field459 = this;
            Statics.field1873 = arg0;
            Statics.field310 = arg1;
            Statics.field4047 = arg2;
            Statics.field4044 = this;
            if (Statics.field454 == null) {
                Statics.field454 = new class167();
            }
            Statics.field454.method3206(this, 1);
        } catch (Exception var5) {
            class341.method3640((String) null, var5);
            this.method809("crash");
        }
    }

    @ObfuscatedName("bo.t(I)V")
    public final synchronized void method791() {
        Container var1 = this.method810();
        if (this.field450 != null) {
            this.field450.removeFocusListener(this);
            var1.remove(this.field450);
        }
        Statics.field1873 = Math.max(var1.getWidth(), this.field443);
        Statics.field310 = Math.max(var1.getHeight(), this.field456);
        if (this.field453 != null) {
            Insets var2 = this.field453.getInsets();
            Statics.field1873 -= var2.right + var2.left;
            Statics.field310 -= var2.top + var2.bottom;
        }
        this.field450 = new class49(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field450);
        this.field450.setSize(Statics.field1873, Statics.field310);
        this.field450.setVisible(true);
        this.field450.setBackground(Color.BLACK);
        if (this.field453 == var1) {
            Insets var3 = this.field453.getInsets();
            this.field450.setLocation(this.field451 + var3.left, this.field444 + var3.top);
        } else {
            this.field450.setLocation(this.field451, this.field444);
        }
        this.field450.addFocusListener(this);
        this.field450.requestFocus();
        this.field452 = true;
        if (Statics.field2507 != null && Statics.field1873 == Statics.field2507.field3851 && Statics.field310 == Statics.field2507.field3853) {
            ((class53) Statics.field2507).method764(this.field450);
            Statics.field2507.method765(0, 0);
        } else {
            Statics.field2507 = new class53(Statics.field1873, Statics.field310, this.field450);
        }
        this.field463 = false;
        this.field464 = class297.method3217();
    }

    @ObfuscatedName("bo.m(I)Z")
    public final boolean method792() {
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
                this.method809("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2042 != null) {
                String var1 = Statics.field2042.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2037;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method809("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class291.method274(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class291.method1791(var4) && class291.method2316(var4) < 10) {
                            this.method809("wrongjava");
                            return;
                        }
                    }
                    field449 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method791();
            this.method803();
            class171 var5;
            try {
                var5 = new class164();
            } catch (Throwable var9) {
                var5 = new class165();
            }
            Statics.field1998 = var5;
            while (field439 == 0L || class297.method3217() < field439) {
                Statics.field442 = Statics.field1998.method3197(field461, field449);
                for (int var7 = 0; var7 < Statics.field442; var7++) {
                    this.method793();
                }
                this.method820();
                this.method781(this.field450);
            }
        } catch (Exception var10) {
            class341.method3640((String) null, var10);
            this.method809("crash");
        }
        this.method904();
    }

    @ObfuscatedName("bo.v(B)V")
    public void method793() {
        long var1 = class297.method3217();
        long var3 = field448[Statics.field194];
        field448[Statics.field194] = var1;
        Statics.field194 = Statics.field194 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1524 = field468;
        }
        this.method804();
    }

    @ObfuscatedName("bo.q(I)V")
    public void method820() {
        Container var1 = this.method810();
        long var2 = class297.method3217();
        long var4 = field447[Statics.field2538];
        field447[Statics.field2538] = var2;
        Statics.field2538 = Statics.field2538 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field445 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field460 - 1 > 50) {
            field460 -= 50;
            this.field452 = true;
            this.field450.setSize(Statics.field1873, Statics.field310);
            this.field450.setVisible(true);
            if (this.field453 == var1) {
                Insets var7 = this.field453.getInsets();
                this.field450.setLocation(this.field451 + var7.left, this.field444 + var7.top);
            } else {
                this.field450.setLocation(this.field451, this.field444);
            }
        }
        if (this.field463) {
            this.method789();
        }
        this.method795();
        this.method805(this.field452);
        if (this.field452) {
            this.method842();
        }
        this.field452 = false;
    }

    @ObfuscatedName("bo.l(I)V")
    public final void method795() {
        class319 var1 = this.method811();
        if (this.field446 != var1.field3840 || this.field469 != var1.field3838 || this.field462) {
            this.method787();
            this.field462 = false;
        }
    }

    @ObfuscatedName("bo.aw(I)V")
    public final void method796() {
        this.field462 = true;
    }

    @ObfuscatedName("bo.ak(I)V")
    public final synchronized void method904() {
        if (field440) {
            return;
        }
        field440 = true;
        try {
            this.field450.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method806();
        } catch (Exception var7) {
        }
        if (this.field453 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field454 != null) {
            try {
                Statics.field454.method3203();
            } catch (Exception var5) {
            }
        }
        this.method875();
    }

    public final void start() {
        if (field459 == this && !field440) {
            field439 = 0L;
        }
    }

    public final void stop() {
        if (field459 == this && !field440) {
            field439 = class297.method3217() + 4000L;
        }
    }

    public final void destroy() {
        if (field459 != this || field440) {
            return;
        }
        field439 = class297.method3217();
        long var1 = 4999L;
        try {
            Thread.sleep(var1);
        } catch (InterruptedException var6) {
        }
        try {
            Thread.sleep(1L);
        } catch (InterruptedException var5) {
        }
        this.method904();
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field459 != this || field440) {
            return;
        }
        this.field452 = true;
        if (class297.method3217() - this.field464 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1873 && var2.height >= Statics.field310) {
                this.field463 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field468 = true;
        this.field452 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field468 = false;
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

    @ObfuscatedName("bo.aq(ILjava/lang/String;ZB)V")
    public final void method853(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field450.getGraphics();
            if (Statics.field457 == null) {
                Statics.field457 = new Font("Helvetica", 1, 13);
                Statics.field427 = this.field450.getFontMetrics(Statics.field457);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field1873, Statics.field310);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field3624 == null) {
                    Statics.field3624 = this.field450.createImage(304, 34);
                }
                Graphics var6 = Statics.field3624.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field457);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field427.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field3624, Statics.field1873 / 2 - 152, Statics.field310 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field1873 / 2 - 152;
                int var9 = Statics.field310 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field457);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field427.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field450.repaint();
        }
    }

    @ObfuscatedName("bo.ac(I)V")
    public final void method840() {
        Statics.field3624 = null;
        Statics.field457 = null;
        Statics.field427 = null;
    }

    @ObfuscatedName("bo.az(Ljava/lang/String;B)V")
    public void method809(String arg0) {
        if (this.field441) {
            return;
        }
        this.field441 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bo.at(S)Ljava/awt/Container;")
    public Container method810() {
        return this.field453 == null ? this : this.field453;
    }

    @ObfuscatedName("bo.ae(B)Llw;")
    public class319 method811() {
        Container var1 = this.method810();
        int var2 = Math.max(var1.getWidth(), this.field443);
        int var3 = Math.max(var1.getHeight(), this.field456);
        if (this.field453 != null) {
            Insets var4 = this.field453.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class319(var2, var3);
    }

    @ObfuscatedName("bo.aj(I)Z")
    public final boolean method868() {
        return this.field453 != null;
    }

    @ObfuscatedName("ck.ap(I)I")
    public static int method1937() {
        int var0 = 0;
        if (Statics.field1967 == null || !Statics.field1967.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field1967 = var2;
                        field470 = -1L;
                        field458 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field1967 != null) {
            long var4 = class297.method3217();
            long var6 = Statics.field1967.getCollectionTime();
            if (field458 != -1L) {
                long var8 = var6 - field458;
                long var10 = var4 - field470;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field458 = var6;
            field470 = var4;
        }
        return var0;
    }

    public abstract void init();

    @ObfuscatedName("bo.e(I)V")
    public abstract void method800();

    @ObfuscatedName("bo.aa(B)V")
    public abstract void method803();

    @ObfuscatedName("bo.ab(I)V")
    public abstract void method804();

    @ObfuscatedName("bo.ar(ZB)V")
    public abstract void method805(boolean arg0);

    @ObfuscatedName("bo.av(B)V")
    public abstract void method806();

    @ObfuscatedName("bo.an(I)V")
    public abstract void method875();
}
