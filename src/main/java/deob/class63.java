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

@ObfuscatedName("bw")
public abstract class class63 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bw.k")
    public static class63 field461 = null;

    @ObfuscatedName("bw.s")
    public static int field462 = 0;

    @ObfuscatedName("bw.t")
    public static long field467 = 0L;

    @ObfuscatedName("bw.i")
    public static boolean field471 = false;

    @ObfuscatedName("bw.o")
    public boolean field488 = false;

    @ObfuscatedName("bw.m")
    public static int field466 = 20;

    @ObfuscatedName("bw.n")
    public static int field484 = 1;

    @ObfuscatedName("bw.d")
    public static int field460 = 0;

    @ObfuscatedName("bw.q")
    public static long[] field469 = new long[32];

    @ObfuscatedName("bw.f")
    public static long[] field470 = new long[32];

    @ObfuscatedName("bw.j")
    public int field468;

    @ObfuscatedName("bw.r")
    public int field472;

    @ObfuscatedName("bw.u")
    public int field473 = 0;

    @ObfuscatedName("bw.p")
    public int field474 = 0;

    @ObfuscatedName("bw.e")
    public int field476;

    @ObfuscatedName("bw.ab")
    public int field477;

    @ObfuscatedName("bw.ag")
    public int field493;

    @ObfuscatedName("bw.ao")
    public int field465;

    @ObfuscatedName("bw.am")
    public Frame field480;

    @ObfuscatedName("bw.ap")
    public Canvas field481;

    @ObfuscatedName("bw.au")
    public volatile boolean field482 = true;

    @ObfuscatedName("bw.ar")
    public static int field478 = 500;

    @ObfuscatedName("bw.at")
    public boolean field483 = false;

    @ObfuscatedName("bw.aq")
    public volatile boolean field485 = false;

    @ObfuscatedName("bw.al")
    public volatile long field486 = 0L;

    @ObfuscatedName("bw.ax")
    public class54 field487;

    @ObfuscatedName("bw.as")
    public Clipboard field490;

    @ObfuscatedName("bw.az")
    public final EventQueue field479;

    @ObfuscatedName("bw.ad")
    public static volatile boolean field463 = true;

    @ObfuscatedName("bw.aj")
    public static long field492 = -1L;

    @ObfuscatedName("bw.aw")
    public static long field464 = -1L;

    public class63() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field479 = var1;
        class56 var3 = new class56();
        Statics.field3679 = var3;
    }

    @ObfuscatedName("bw.t(III)V")
    public final void method885(int arg0, int arg1) {
        if (this.field493 != arg0 || this.field465 != arg1) {
            this.method847();
        }
        this.field493 = arg0;
        this.field465 = arg1;
    }

    @ObfuscatedName("bw.i(Ljava/lang/Object;I)V")
    public final void method831(Object arg0) {
        if (this.field479 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field479.peekEvent() != null; var2++) {
            class308.method3834(1L);
        }
        if (arg0 != null) {
            this.field479.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bw.o(B)Lfd;")
    public class178 method869() {
        if (this.field487 == null) {
            this.field487 = new class54();
            this.field487.method716(this.field481);
        }
        return this.field487;
    }

    @ObfuscatedName("bw.x(I)V")
    public void method833() {
        this.field490 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bw.w(Ljava/lang/String;I)V")
    public void method864(String arg0) {
        this.field490.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bw.g(B)V")
    public final void method857() {
        class55.method73();
        Canvas var1 = this.field481;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class55.field402);
        var1.addFocusListener(class55.field402);
    }

    @ObfuscatedName("bw.m(S)V")
    public final void method961() {
        class64.method208(this.field481);
    }

    @ObfuscatedName("bw.n(I)V")
    public final void method837() {
        Container var1 = this.method859();
        if (var1 == null) {
            return;
        }
        class329 var2 = this.method860();
        this.field468 = Math.max(var2.field3871, this.field476);
        this.field472 = Math.max(var2.field3873, this.field477);
        if (this.field468 <= 0) {
            this.field468 = 1;
        }
        if (this.field472 <= 0) {
            this.field472 = 1;
        }
        Statics.field1642 = Math.min(this.field468, this.field493);
        Statics.field475 = Math.min(this.field472, this.field465);
        this.field473 = (this.field468 - Statics.field1642) / 2;
        this.field474 = 0;
        this.field481.setSize(Statics.field1642, Statics.field475);
        Statics.field251 = new class62(Statics.field1642, Statics.field475, this.field481);
        if (this.field480 == var1) {
            Insets var3 = this.field480.getInsets();
            this.field481.setLocation(this.field473 + var3.left, this.field474 + var3.top);
        } else {
            this.field481.setLocation(this.field473, this.field474);
        }
        this.field482 = true;
        this.method955();
    }

    @ObfuscatedName("bw.h(I)V")
    public void method839() {
        int var1 = this.field473;
        int var2 = this.field474;
        int var3 = this.field468 - Statics.field1642 - var1;
        int var4 = this.field472 - Statics.field475 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method859();
            int var6 = 0;
            int var7 = 0;
            if (this.field480 == var5) {
                Insets var8 = this.field480.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field472);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field468, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field468 + var6 - var3, var7, var3, this.field472);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field472 + var7 - var4, this.field468, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bw.a(I)V")
    public final void method840() {
        class55.method3392(this.field481);
        Statics.method628(this.field481);
        if (this.field487 != null) {
            this.field487.method713(this.field481);
        }
        this.method916();
        Canvas var1 = this.field481;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class55.field402);
        var1.addFocusListener(class55.field402);
        class64.method208(this.field481);
        if (this.field487 != null) {
            this.field487.method716(this.field481);
        }
        this.method847();
    }

    @ObfuscatedName("bw.q(IIII)V")
    public final void method863(int arg0, int arg1, int arg2) {
        try {
            if (field461 != null) {
                field462++;
                if (field462 >= 3) {
                    this.method830("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field461 = this;
            Statics.field1642 = arg0;
            Statics.field475 = arg1;
            Statics.field3372 = arg2;
            Statics.field4073 = this;
            if (Statics.field489 == null) {
                Statics.field489 = new class176();
            }
            Statics.field489.method3280(this, 1);
        } catch (Exception var5) {
            class351.method2420((String) null, var5);
            this.method830("crash");
        }
    }

    @ObfuscatedName("bw.c(I)V")
    public final synchronized void method916() {
        Container var1 = this.method859();
        if (this.field481 != null) {
            this.field481.removeFocusListener(this);
            var1.remove(this.field481);
        }
        Statics.field1642 = Math.max(var1.getWidth(), this.field476);
        Statics.field475 = Math.max(var1.getHeight(), this.field477);
        if (this.field480 != null) {
            Insets var2 = this.field480.getInsets();
            Statics.field1642 -= var2.right + var2.left;
            Statics.field475 -= var2.top + var2.bottom;
        }
        this.field481 = new class58(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field481);
        this.field481.setSize(Statics.field1642, Statics.field475);
        this.field481.setVisible(true);
        this.field481.setBackground(Color.BLACK);
        if (this.field480 == var1) {
            Insets var3 = this.field480.getInsets();
            this.field481.setLocation(this.field473 + var3.left, this.field474 + var3.top);
        } else {
            this.field481.setLocation(this.field473, this.field474);
        }
        this.field481.addFocusListener(this);
        this.field481.requestFocus();
        this.field482 = true;
        if (Statics.field251 != null && Statics.field1642 == Statics.field251.field3886 && Statics.field475 == Statics.field251.field3887) {
            ((class62) Statics.field251).method810(this.field481);
            Statics.field251.method812(0, 0);
        } else {
            Statics.field251 = new class62(Statics.field1642, Statics.field475, this.field481);
        }
        this.field485 = false;
        this.field486 = class307.method2184();
    }

    @ObfuscatedName("bw.j(I)Z")
    public final boolean method931() {
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
                this.method830("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2071 != null) {
                String var1 = Statics.field2071.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2082;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method830("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class301.method15(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class301.method1703(var4) && class301.method144(var4) < 10) {
                            this.method830("wrongjava");
                            return;
                        }
                    }
                    field484 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method916();
            this.method832();
            Statics.field316 = class180.method3461();
            while (field467 == 0L || class307.method2184() < field467) {
                Statics.field443 = Statics.field316.method3269(field466, field484);
                for (int var5 = 0; var5 < Statics.field443; var5++) {
                    this.method878();
                }
                this.method845();
                this.method831(this.field481);
            }
        } catch (Exception var7) {
            class351.method2420((String) null, var7);
            this.method830("crash");
        }
        this.method848();
    }

    @ObfuscatedName("bw.r(I)V")
    public void method878() {
        long var1 = class307.method2184();
        long var3 = field470[Statics.field3688];
        field470[Statics.field3688] = var1;
        Statics.field3688 = Statics.field3688 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field491 = field463;
        }
        this.method854();
    }

    @ObfuscatedName("bw.u(I)V")
    public void method845() {
        Container var1 = this.method859();
        long var2 = class307.method2184();
        long var4 = field469[Statics.field1911];
        field469[Statics.field1911] = var2;
        Statics.field1911 = Statics.field1911 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field460 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field478 - 1 > 50) {
            field478 -= 50;
            this.field482 = true;
            this.field481.setSize(Statics.field1642, Statics.field475);
            this.field481.setVisible(true);
            if (this.field480 == var1) {
                Insets var7 = this.field480.getInsets();
                this.field481.setLocation(this.field473 + var7.left, this.field474 + var7.top);
            } else {
                this.field481.setLocation(this.field473, this.field474);
            }
        }
        if (this.field485) {
            this.method840();
        }
        this.method846();
        this.method963(this.field482);
        if (this.field482) {
            this.method839();
        }
        this.field482 = false;
    }

    @ObfuscatedName("bw.p(I)V")
    public final void method846() {
        class329 var1 = this.method860();
        if (this.field468 != var1.field3871 || this.field472 != var1.field3873 || this.field483) {
            this.method837();
            this.field483 = false;
        }
    }

    @ObfuscatedName("bw.b(I)V")
    public final void method847() {
        this.field483 = true;
    }

    @ObfuscatedName("bw.l(I)V")
    public final synchronized void method848() {
        if (field471) {
            return;
        }
        field471 = true;
        try {
            this.field481.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method856();
        } catch (Exception var7) {
        }
        if (this.field480 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field489 != null) {
            try {
                Statics.field489.method3274();
            } catch (Exception var5) {
            }
        }
        this.method862();
    }

    @ObfuscatedName("aq.e(B)V")
    public static final void method424() {
        Statics.field316.method3268();
        for (int var0 = 0; var0 < 32; var0++) {
            field469[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field470[var1] = 0L;
        }
        Statics.field443 = 0;
    }

    public final void start() {
        if (field461 == this && !field471) {
            field467 = 0L;
        }
    }

    public final void stop() {
        if (field461 == this && !field471) {
            field467 = class307.method2184() + 4000L;
        }
    }

    public final void destroy() {
        if (field461 == this && !field471) {
            field467 = class307.method2184();
            class308.method3834(5000L);
            this.method848();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field461 != this || field471) {
            return;
        }
        this.field482 = true;
        if (class307.method2184() - this.field486 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1642 && var2.height >= Statics.field475) {
                this.field485 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field463 = true;
        this.field482 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field463 = false;
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

    @ObfuscatedName("bw.ah(ILjava/lang/String;ZI)V")
    public final void method851(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field481.getGraphics();
            if (Statics.field3576 == null) {
                Statics.field3576 = new Font("Helvetica", 1, 13);
                Statics.field632 = this.field481.getFontMetrics(Statics.field3576);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field1642, Statics.field475);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field3726 == null) {
                    Statics.field3726 = this.field481.createImage(304, 34);
                }
                Graphics var6 = Statics.field3726.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field3576);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field632.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field3726, Statics.field1642 / 2 - 152, Statics.field475 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field1642 / 2 - 152;
                int var9 = Statics.field475 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field3576);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field632.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field481.repaint();
        }
    }

    @ObfuscatedName("bw.av(B)V")
    public final void method858() {
        Statics.field3726 = null;
        Statics.field3576 = null;
        Statics.field632 = null;
    }

    @ObfuscatedName("bw.ax(Ljava/lang/String;I)V")
    public void method830(String arg0) {
        if (this.field488) {
            return;
        }
        this.field488 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bw.as(I)Ljava/awt/Container;")
    public Container method859() {
        return this.field480 == null ? this : this.field480;
    }

    @ObfuscatedName("bw.az(I)Llr;")
    public class329 method860() {
        Container var1 = this.method859();
        int var2 = Math.max(var1.getWidth(), this.field476);
        int var3 = Math.max(var1.getHeight(), this.field477);
        if (this.field480 != null) {
            Insets var4 = this.field480.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class329(var2, var3);
    }

    @ObfuscatedName("bw.ad(B)Z")
    public final boolean method861() {
        return this.field480 != null;
    }

    @ObfuscatedName("aw.ai(I)I")
    public static int method656() {
        int var0 = 0;
        if (Statics.field154 == null || !Statics.field154.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field154 = var2;
                        field464 = -1L;
                        field492 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field154 != null) {
            long var4 = class307.method2184();
            long var6 = Statics.field154.getCollectionTime();
            if (field492 != -1L) {
                long var8 = var6 - field492;
                long var10 = var4 - field464;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field492 = var6;
            field464 = var4;
        }
        return var0;
    }

    @ObfuscatedName("bw.ar(I)V")
    public abstract void method832();

    @ObfuscatedName("bw.at(I)V")
    public abstract void method854();

    @ObfuscatedName("bw.al(I)V")
    public abstract void method856();

    @ObfuscatedName("bw.ay(B)V")
    public abstract void method862();

    public abstract void init();

    @ObfuscatedName("bw.d(I)V")
    public abstract void method955();

    @ObfuscatedName("bw.aq(ZB)V")
    public abstract void method963(boolean arg0);
}
