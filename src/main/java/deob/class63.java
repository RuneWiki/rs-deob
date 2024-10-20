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

@ObfuscatedName("bn")
public abstract class class63 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bn.o")
    public static class63 field485 = null;

    @ObfuscatedName("bn.q")
    public static int field464 = 0;

    @ObfuscatedName("bn.j")
    public static long field465 = 0L;

    @ObfuscatedName("bn.p")
    public static boolean field466 = false;

    @ObfuscatedName("bn.g")
    public boolean field468 = false;

    @ObfuscatedName("bn.u")
    public static int field469 = 20;

    @ObfuscatedName("bn.a")
    public static int field470 = 1;

    @ObfuscatedName("bn.z")
    public static int field471 = 0;

    @ObfuscatedName("bn.k")
    public static long[] field475 = new long[32];

    @ObfuscatedName("bn.s")
    public static long[] field474 = new long[32];

    @ObfuscatedName("bn.d")
    public int field476;

    @ObfuscatedName("bn.e")
    public int field496;

    @ObfuscatedName("bn.l")
    public int field482 = 0;

    @ObfuscatedName("bn.t")
    public int field478 = 0;

    @ObfuscatedName("bn.f")
    public int field463;

    @ObfuscatedName("bn.ah")
    public int field480;

    @ObfuscatedName("bn.ai")
    public int field481;

    @ObfuscatedName("bn.ao")
    public int field494;

    @ObfuscatedName("bn.ag")
    public Frame field484;

    @ObfuscatedName("bn.ab")
    public Canvas field467;

    @ObfuscatedName("bn.am")
    public volatile boolean field483 = true;

    @ObfuscatedName("bn.ad")
    public static int field487 = 500;

    @ObfuscatedName("bn.as")
    public boolean field488 = false;

    @ObfuscatedName("bn.ar")
    public volatile boolean field489 = false;

    @ObfuscatedName("bn.ap")
    public volatile long field490 = 0L;

    @ObfuscatedName("bn.ac")
    public class54 field491;

    @ObfuscatedName("bn.av")
    public Clipboard field492;

    @ObfuscatedName("bn.af")
    public final EventQueue field493;

    @ObfuscatedName("bn.at")
    public static volatile boolean field486 = true;

    @ObfuscatedName("bn.az")
    public static long field495 = -1L;

    @ObfuscatedName("bn.aq")
    public static long field472 = -1L;

    public class63() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field493 = var1;
        class115.method1943(new class56());
    }

    @ObfuscatedName("bn.j(III)V")
    public final void method821(int arg0, int arg1) {
        if (this.field481 != arg0 || this.field494 != arg1) {
            this.method861();
        }
        this.field481 = arg0;
        this.field494 = arg1;
    }

    @ObfuscatedName("bn.p(Ljava/lang/Object;I)V")
    public final void method828(Object arg0) {
        if (this.field493 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field493.peekEvent() != null; var2++) {
            class308.method3708(1L);
        }
        if (arg0 != null) {
            this.field493.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bn.g(I)Lfv;")
    public class178 method858() {
        if (this.field491 == null) {
            this.field491 = new class54();
            this.field491.method710(this.field467);
        }
        return this.field491;
    }

    @ObfuscatedName("bn.n(I)V")
    public void method823() {
        this.field492 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bn.u(Ljava/lang/String;I)V")
    public void method957(String arg0) {
        this.field492.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bn.a(I)V")
    public final void method887() {
        class55.method4792();
        Canvas var1 = this.field467;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class55.field423);
        var1.addFocusListener(class55.field423);
    }

    @ObfuscatedName("bn.z(I)V")
    public final void method826() {
        class64.method305(this.field467);
    }

    @ObfuscatedName("bn.w(I)V")
    public final void method827() {
        Container var1 = this.method851();
        if (var1 == null) {
            return;
        }
        class329 var2 = this.method863();
        this.field476 = Math.max(var2.field3867, this.field463);
        this.field496 = Math.max(var2.field3864, this.field480);
        if (this.field476 <= 0) {
            this.field476 = 1;
        }
        if (this.field496 <= 0) {
            this.field496 = 1;
        }
        Statics.field1299 = Math.min(this.field476, this.field481);
        Statics.field397 = Math.min(this.field496, this.field494);
        this.field482 = (this.field476 - Statics.field1299) / 2;
        this.field478 = 0;
        this.field467.setSize(Statics.field1299, Statics.field397);
        Statics.field554 = new class62(Statics.field1299, Statics.field397, this.field467);
        if (this.field484 == var1) {
            Insets var3 = this.field484.getInsets();
            this.field467.setLocation(this.field482 + var3.left, this.field478 + var3.top);
        } else {
            this.field467.setLocation(this.field482, this.field478);
        }
        this.field483 = true;
        this.method937();
    }

    @ObfuscatedName("bn.c(I)V")
    public void method856() {
        int var1 = this.field482;
        int var2 = this.field478;
        int var3 = this.field476 - Statics.field1299 - var1;
        int var4 = this.field496 - Statics.field397 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method851();
            int var6 = 0;
            int var7 = 0;
            if (this.field484 == var5) {
                Insets var8 = this.field484.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field496);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field476, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field476 + var6 - var3, var7, var3, this.field496);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field496 + var7 - var4, this.field476, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bn.h(B)V")
    public final void method896() {
        Canvas var1 = this.field467;
        var1.removeKeyListener(class55.field423);
        var1.removeFocusListener(class55.field423);
        class55.field412 = -1;
        Canvas var2 = this.field467;
        var2.removeMouseListener(class64.field501);
        var2.removeMouseMotionListener(class64.field501);
        var2.removeFocusListener(class64.field501);
        class64.field519 = 0;
        if (this.field491 != null) {
            this.field491.method711(this.field467);
        }
        this.method832();
        Canvas var3 = this.field467;
        var3.setFocusTraversalKeysEnabled(false);
        var3.addKeyListener(class55.field423);
        var3.addFocusListener(class55.field423);
        class64.method305(this.field467);
        if (this.field491 != null) {
            this.field491.method710(this.field467);
        }
        this.method861();
    }

    @ObfuscatedName("bn.k(IIII)V")
    public final void method833(int arg0, int arg1, int arg2) {
        try {
            if (field485 != null) {
                field464++;
                if (field464 >= 3) {
                    this.method842("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field485 = this;
            Statics.field1299 = arg0;
            Statics.field397 = arg1;
            Statics.field4071 = arg2;
            Statics.field4074 = this;
            if (Statics.field99 == null) {
                Statics.field99 = new class176();
            }
            Statics.field99.method3274(this, 1);
        } catch (Exception var5) {
            class351.method3425((String) null, var5);
            this.method842("crash");
        }
    }

    @ObfuscatedName("bn.r(I)V")
    public final synchronized void method832() {
        Container var1 = this.method851();
        if (this.field467 != null) {
            this.field467.removeFocusListener(this);
            var1.remove(this.field467);
        }
        Statics.field1299 = Math.max(var1.getWidth(), this.field463);
        Statics.field397 = Math.max(var1.getHeight(), this.field480);
        if (this.field484 != null) {
            Insets var2 = this.field484.getInsets();
            Statics.field1299 -= var2.right + var2.left;
            Statics.field397 -= var2.top + var2.bottom;
        }
        this.field467 = new class58(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field467);
        this.field467.setSize(Statics.field1299, Statics.field397);
        this.field467.setVisible(true);
        this.field467.setBackground(Color.BLACK);
        if (this.field484 == var1) {
            Insets var3 = this.field484.getInsets();
            this.field467.setLocation(this.field482 + var3.left, this.field478 + var3.top);
        } else {
            this.field467.setLocation(this.field482, this.field478);
        }
        this.field467.addFocusListener(this);
        this.field467.requestFocus();
        this.field483 = true;
        if (Statics.field554 != null && Statics.field1299 == Statics.field554.field3878 && Statics.field397 == Statics.field554.field3877) {
            ((class62) Statics.field554).method808(this.field467);
            Statics.field554.method807(0, 0);
        } else {
            Statics.field554 = new class62(Statics.field1299, Statics.field397, this.field467);
        }
        this.field489 = false;
        this.field490 = class307.method3253();
    }

    @ObfuscatedName("bn.d(I)Z")
    public final boolean method830() {
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
                this.method842("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2066 != null) {
                String var1 = Statics.field2066.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2057;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method842("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class301.method4987(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class301.method3205(var4) && class301.method1006(var4) < 10) {
                            this.method842("wrongjava");
                            return;
                        }
                    }
                    field470 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method832();
            this.method941();
            class180 var5;
            try {
                var5 = new class173();
            } catch (Throwable var9) {
                var5 = new class174();
            }
            Statics.field3667 = var5;
            while (field465 == 0L || class307.method3253() < field465) {
                Statics.field479 = Statics.field3667.method3250(field469, field470);
                for (int var7 = 0; var7 < Statics.field479; var7++) {
                    this.method834();
                }
                this.method835();
                this.method828(this.field467);
            }
        } catch (Exception var10) {
            class351.method3425((String) null, var10);
            this.method842("crash");
        }
        this.method916();
    }

    @ObfuscatedName("bn.e(I)V")
    public void method834() {
        long var1 = class307.method3253();
        long var3 = field474[Statics.field2092];
        field474[Statics.field2092] = var1;
        Statics.field2092 = Statics.field2092 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field250 = field486;
        }
        this.method845();
    }

    @ObfuscatedName("bn.l(I)V")
    public void method835() {
        Container var1 = this.method851();
        long var2 = class307.method3253();
        long var4 = field475[Statics.field473];
        field475[Statics.field473] = var2;
        Statics.field473 = Statics.field473 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field471 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field487 - 1 > 50) {
            field487 -= 50;
            this.field483 = true;
            this.field467.setSize(Statics.field1299, Statics.field397);
            this.field467.setVisible(true);
            if (this.field484 == var1) {
                Insets var7 = this.field484.getInsets();
                this.field467.setLocation(this.field482 + var7.left, this.field478 + var7.top);
            } else {
                this.field467.setLocation(this.field482, this.field478);
            }
        }
        if (this.field489) {
            this.method896();
        }
        this.method836();
        this.method846(this.field483);
        if (this.field483) {
            this.method856();
        }
        this.field483 = false;
    }

    @ObfuscatedName("bn.ai(I)V")
    public final void method836() {
        class329 var1 = this.method863();
        if (this.field476 != var1.field3867 || this.field496 != var1.field3864 || this.field488) {
            this.method827();
            this.field488 = false;
        }
    }

    @ObfuscatedName("bn.ao(I)V")
    public final void method861() {
        this.field488 = true;
    }

    @ObfuscatedName("bn.ae(I)V")
    public final synchronized void method916() {
        if (field466) {
            return;
        }
        field466 = true;
        try {
            this.field467.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method883();
        } catch (Exception var7) {
        }
        if (this.field484 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field99 != null) {
            try {
                Statics.field99.method3256();
            } catch (Exception var5) {
            }
        }
        this.method840();
    }

    @ObfuscatedName("gw.ax(I)V")
    public static final void method3528() {
        Statics.field3667.method3247();
        for (int var0 = 0; var0 < 32; var0++) {
            field475[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field474[var1] = 0L;
        }
        Statics.field479 = 0;
    }

    public final void start() {
        if (field485 == this && !field466) {
            field465 = 0L;
        }
    }

    public final void stop() {
        if (field485 == this && !field466) {
            field465 = class307.method3253() + 4000L;
        }
    }

    public final void destroy() {
        if (field485 == this && !field466) {
            field465 = class307.method3253();
            class308.method3708(4999L);
            class308.method3708(1L);
            this.method916();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field485 != this || field466) {
            return;
        }
        this.field483 = true;
        if (class307.method3253() - this.field490 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1299 && var2.height >= Statics.field397) {
                this.field489 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field486 = true;
        this.field483 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field486 = false;
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

    @ObfuscatedName("bn.ad(ILjava/lang/String;ZS)V")
    public final void method848(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field467.getGraphics();
            if (Statics.field2422 == null) {
                Statics.field2422 = new Font("Helvetica", 1, 13);
                Statics.field477 = this.field467.getFontMetrics(Statics.field2422);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field1299, Statics.field397);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field1034 == null) {
                    Statics.field1034 = this.field467.createImage(304, 34);
                }
                Graphics var6 = Statics.field1034.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field2422);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field477.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field1034, Statics.field1299 / 2 - 152, Statics.field397 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field1299 / 2 - 152;
                int var9 = Statics.field397 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field2422);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field477.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field467.repaint();
        }
    }

    @ObfuscatedName("bn.as(I)V")
    public final void method849() {
        Statics.field1034 = null;
        Statics.field2422 = null;
        Statics.field477 = null;
    }

    @ObfuscatedName("bn.ar(Ljava/lang/String;S)V")
    public void method842(String arg0) {
        if (this.field468) {
            return;
        }
        this.field468 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bn.ap(I)Ljava/awt/Container;")
    public Container method851() {
        return this.field484 == null ? this : this.field484;
    }

    @ObfuscatedName("bn.al(S)Llv;")
    public class329 method863() {
        Container var1 = this.method851();
        int var2 = Math.max(var1.getWidth(), this.field463);
        int var3 = Math.max(var1.getHeight(), this.field480);
        if (this.field484 != null) {
            Insets var4 = this.field484.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class329(var2, var3);
    }

    @ObfuscatedName("bn.an(I)Z")
    public final boolean method853() {
        return this.field484 != null;
    }

    @ObfuscatedName("if.ac(I)I")
    public static int method4091() {
        int var0 = 0;
        if (Statics.field2524 == null || !Statics.field2524.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field2524 = var2;
                        field472 = -1L;
                        field495 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field2524 != null) {
            long var4 = class307.method3253();
            long var6 = Statics.field2524.getCollectionTime();
            if (field495 != -1L) {
                long var8 = var6 - field495;
                long var10 = var4 - field472;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field495 = var6;
            field472 = var4;
        }
        return var0;
    }

    @ObfuscatedName("bn.av(I)V")
    public abstract void method840();

    @ObfuscatedName("bn.ab(I)V")
    public abstract void method845();

    @ObfuscatedName("bn.am(ZS)V")
    public abstract void method846(boolean arg0);

    public abstract void init();

    @ObfuscatedName("bn.ak(I)V")
    public abstract void method883();

    @ObfuscatedName("bn.y(I)V")
    public abstract void method937();

    @ObfuscatedName("bn.ag(I)V")
    public abstract void method941();
}
