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

@ObfuscatedName("bd")
public abstract class class63 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bd.v")
    public static class63 field476 = null;

    @ObfuscatedName("bd.t")
    public static int field452 = 0;

    @ObfuscatedName("bd.j")
    public static long field453 = 0L;

    @ObfuscatedName("bd.n")
    public static boolean field483 = false;

    @ObfuscatedName("bd.p")
    public boolean field455 = false;

    @ObfuscatedName("bd.z")
    public static int field456 = 20;

    @ObfuscatedName("bd.u")
    public static int field466 = 1;

    @ObfuscatedName("bd.e")
    public static int field458 = 0;

    @ObfuscatedName("bd.i")
    public static long[] field450 = new long[32];

    @ObfuscatedName("bd.a")
    public static long[] field460 = new long[32];

    @ObfuscatedName("bd.r")
    public int field461;

    @ObfuscatedName("bd.q")
    public int field462;

    @ObfuscatedName("bd.g")
    public int field463 = 0;

    @ObfuscatedName("bd.s")
    public int field464 = 0;

    @ObfuscatedName("bd.d")
    public int field465;

    @ObfuscatedName("bd.an")
    public int field468;

    @ObfuscatedName("bd.aj")
    public int field467;

    @ObfuscatedName("bd.ax")
    public int field451;

    @ObfuscatedName("bd.as")
    public Frame field469;

    @ObfuscatedName("bd.ae")
    public Canvas field459;

    @ObfuscatedName("bd.ac")
    public volatile boolean field471 = true;

    @ObfuscatedName("bd.av")
    public static int field472 = 500;

    @ObfuscatedName("bd.aq")
    public boolean field475 = false;

    @ObfuscatedName("bd.ah")
    public volatile boolean field474 = false;

    @ObfuscatedName("bd.am")
    public volatile long field473 = 0L;

    @ObfuscatedName("bd.ab")
    public class54 field454;

    @ObfuscatedName("bd.aw")
    public Clipboard field477;

    @ObfuscatedName("bd.ap")
    public final EventQueue field478;

    @ObfuscatedName("bd.ad")
    public static volatile boolean field457 = true;

    @ObfuscatedName("bd.ay")
    public static long field480 = -1L;

    @ObfuscatedName("bd.af")
    public static long field481 = -1L;

    public class63() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field478 = var1;
        class115.method3106(new class56());
    }

    @ObfuscatedName("bd.l(III)V")
    public final void method846(int arg0, int arg1) {
        if (this.field467 != arg0 || this.field451 != arg1) {
            this.method864();
        }
        this.field467 = arg0;
        this.field451 = arg1;
    }

    @ObfuscatedName("bd.z(Ljava/lang/Object;I)V")
    public final void method847(Object arg0) {
        if (this.field478 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field478.peekEvent() != null; var2++) {
            class309.method3812(1L);
        }
        if (arg0 != null) {
            this.field478.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bd.u(I)Lfi;")
    public class178 method997() {
        if (this.field454 == null) {
            this.field454 = new class54();
            this.field454.method726(this.field459);
        }
        return this.field454;
    }

    @ObfuscatedName("bd.e(I)V")
    public void method849() {
        this.field477 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bd.m(Ljava/lang/String;I)V")
    public void method850(String arg0) {
        this.field477.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bd.c(I)V")
    public final void method851() {
        class55.method313();
        class55.method2110(this.field459);
    }

    @ObfuscatedName("bd.i(B)V")
    public final void method852() {
        Canvas var1 = this.field459;
        var1.addMouseListener(class64.field486);
        var1.addMouseMotionListener(class64.field486);
        var1.addFocusListener(class64.field486);
    }

    @ObfuscatedName("bd.f(I)V")
    public final void method853() {
        Container var1 = this.method876();
        if (var1 == null) {
            return;
        }
        class330 var2 = this.method848();
        this.field461 = Math.max(var2.field3880, this.field465);
        this.field462 = Math.max(var2.field3881, this.field468);
        if (this.field461 <= 0) {
            this.field461 = 1;
        }
        if (this.field462 <= 0) {
            this.field462 = 1;
        }
        Statics.field3639 = Math.min(this.field461, this.field467);
        Statics.field1893 = Math.min(this.field462, this.field451);
        this.field463 = (this.field461 - Statics.field3639) / 2;
        this.field464 = 0;
        this.field459.setSize(Statics.field3639, Statics.field1893);
        Statics.field151 = new class62(Statics.field3639, Statics.field1893, this.field459);
        if (this.field469 == var1) {
            Insets var3 = this.field469.getInsets();
            this.field459.setLocation(this.field463 + var3.left, this.field464 + var3.top);
        } else {
            this.field459.setLocation(this.field463, this.field464);
        }
        this.field471 = true;
        this.method854();
    }

    @ObfuscatedName("bd.r(I)V")
    public void method855() {
        int var1 = this.field463;
        int var2 = this.field464;
        int var3 = this.field461 - Statics.field3639 - var1;
        int var4 = this.field462 - Statics.field1893 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method876();
            int var6 = 0;
            int var7 = 0;
            if (this.field469 == var5) {
                Insets var8 = this.field469.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field462);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field461, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field461 + var6 - var3, var7, var3, this.field462);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field462 + var7 - var4, this.field461, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bd.q(I)V")
    public final void method856() {
        Canvas var1 = this.field459;
        var1.removeKeyListener(class55.field408);
        var1.removeFocusListener(class55.field408);
        class55.field411 = -1;
        Canvas var2 = this.field459;
        var2.removeMouseListener(class64.field486);
        var2.removeMouseMotionListener(class64.field486);
        var2.removeFocusListener(class64.field486);
        class64.field495 = 0;
        if (this.field454 != null) {
            this.field454.method732(this.field459);
        }
        this.method858();
        class55.method2110(this.field459);
        Canvas var3 = this.field459;
        var3.addMouseListener(class64.field486);
        var3.addMouseMotionListener(class64.field486);
        var3.addFocusListener(class64.field486);
        if (this.field454 != null) {
            this.field454.method726(this.field459);
        }
        this.method864();
    }

    @ObfuscatedName("bd.g(IIIB)V")
    public final void method857(int arg0, int arg1, int arg2) {
        try {
            if (field476 != null) {
                field452++;
                if (field452 >= 3) {
                    this.method875("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field476 = this;
            Statics.field3639 = arg0;
            Statics.field1893 = arg1;
            Statics.field4085 = arg2;
            Statics.field4086 = this;
            if (Statics.field470 == null) {
                Statics.field470 = new class176();
            }
            Statics.field470.method3265(this, 1);
        } catch (Exception var5) {
            class352.method3694((String) null, var5);
            this.method875("crash");
        }
    }

    @ObfuscatedName("bd.o(I)V")
    public final synchronized void method858() {
        Container var1 = this.method876();
        if (this.field459 != null) {
            this.field459.removeFocusListener(this);
            var1.remove(this.field459);
        }
        Statics.field3639 = Math.max(var1.getWidth(), this.field465);
        Statics.field1893 = Math.max(var1.getHeight(), this.field468);
        if (this.field469 != null) {
            Insets var2 = this.field469.getInsets();
            Statics.field3639 -= var2.right + var2.left;
            Statics.field1893 -= var2.top + var2.bottom;
        }
        this.field459 = new class58(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field459);
        this.field459.setSize(Statics.field3639, Statics.field1893);
        this.field459.setVisible(true);
        this.field459.setBackground(Color.BLACK);
        if (this.field469 == var1) {
            Insets var3 = this.field469.getInsets();
            this.field459.setLocation(this.field463 + var3.left, this.field464 + var3.top);
        } else {
            this.field459.setLocation(this.field463, this.field464);
        }
        this.field459.addFocusListener(this);
        this.field459.requestFocus();
        this.field471 = true;
        if (Statics.field151 != null && Statics.field3639 == Statics.field151.field3893 && Statics.field1893 == Statics.field151.field3894) {
            ((class62) Statics.field151).method839(this.field459);
            Statics.field151.method835(0, 0);
        } else {
            Statics.field151 = new class62(Statics.field3639, Statics.field1893, this.field459);
        }
        this.field474 = false;
        this.field473 = class308.method4891();
    }

    @ObfuscatedName("bd.an(I)Z")
    public final boolean method903() {
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
                this.method875("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2053 != null) {
                String var1 = Statics.field2053.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2052;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method875("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class302.method534(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class302.method3829(var4) && class302.method4635(var4) < 10) {
                            this.method875("wrongjava");
                            return;
                        }
                    }
                    field466 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method858();
            this.method979();
            class180 var5;
            try {
                var5 = new class173();
            } catch (Throwable var9) {
                var5 = new class174();
            }
            Statics.field2575 = var5;
            while (field453 == 0L || class308.method4891() < field453) {
                Statics.field32 = Statics.field2575.method3260(field456, field466);
                for (int var7 = 0; var7 < Statics.field32; var7++) {
                    this.method866();
                }
                this.method862();
                this.method847(this.field459);
            }
        } catch (Exception var10) {
            class352.method3694((String) null, var10);
            this.method875("crash");
        }
        this.method869();
    }

    @ObfuscatedName("bd.aj(I)V")
    public void method866() {
        long var1 = class308.method4891();
        long var3 = field460[Statics.field1280];
        field460[Statics.field1280] = var1;
        Statics.field1280 = Statics.field1280 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field574 = field457;
        }
        this.method985();
    }

    @ObfuscatedName("bd.ax(I)V")
    public void method862() {
        Container var1 = this.method876();
        long var2 = class308.method4891();
        long var4 = field450[Statics.field1328];
        field450[Statics.field1328] = var2;
        Statics.field1328 = Statics.field1328 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field458 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field472 - 1 > 50) {
            field472 -= 50;
            this.field471 = true;
            this.field459.setSize(Statics.field3639, Statics.field1893);
            this.field459.setVisible(true);
            if (this.field469 == var1) {
                Insets var7 = this.field469.getInsets();
                this.field459.setLocation(this.field463 + var7.left, this.field464 + var7.top);
            } else {
                this.field459.setLocation(this.field463, this.field464);
            }
        }
        if (this.field474) {
            this.method856();
        }
        this.method863();
        this.method871(this.field471);
        if (this.field471) {
            this.method855();
        }
        this.field471 = false;
    }

    @ObfuscatedName("bd.ag(B)V")
    public final void method863() {
        class330 var1 = this.method848();
        if (this.field461 != var1.field3880 || this.field462 != var1.field3881 || this.field475) {
            this.method853();
            this.field475 = false;
        }
    }

    @ObfuscatedName("bd.au(I)V")
    public final void method864() {
        this.field475 = true;
    }

    @ObfuscatedName("bd.as(I)V")
    public final synchronized void method869() {
        if (field483) {
            return;
        }
        field483 = true;
        try {
            this.field459.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method872();
        } catch (Exception var7) {
        }
        if (this.field469 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field470 != null) {
            try {
                Statics.field470.method3264();
            } catch (Exception var5) {
            }
        }
        this.method986();
    }

    @ObfuscatedName("a.ae(B)V")
    public static final void method131() {
        Statics.field2575.method3259();
        for (int var0 = 0; var0 < 32; var0++) {
            field450[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field460[var1] = 0L;
        }
        Statics.field32 = 0;
    }

    public final void start() {
        if (field476 == this && !field483) {
            field453 = 0L;
        }
    }

    public final void stop() {
        if (field476 == this && !field483) {
            field453 = class308.method4891() + 4000L;
        }
    }

    public final void destroy() {
        if (field476 == this && !field483) {
            field453 = class308.method4891();
            class309.method3812(5000L);
            this.method869();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field476 != this || field483) {
            return;
        }
        this.field471 = true;
        if (class308.method4891() - this.field473 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field3639 && var2.height >= Statics.field1893) {
                this.field474 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field457 = true;
        this.field471 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field457 = false;
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

    @ObfuscatedName("bd.aw(ILjava/lang/String;ZI)V")
    public final void method873(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field459.getGraphics();
            if (Statics.field66 == null) {
                Statics.field66 = new Font("Helvetica", 1, 13);
                Statics.field1755 = this.field459.getFontMetrics(Statics.field66);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field3639, Statics.field1893);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field426 == null) {
                    Statics.field426 = this.field459.createImage(304, 34);
                }
                Graphics var6 = Statics.field426.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field66);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field1755.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field426, Statics.field3639 / 2 - 152, Statics.field1893 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field3639 / 2 - 152;
                int var9 = Statics.field1893 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field66);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field1755.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field459.repaint();
        }
    }

    @ObfuscatedName("bd.ap(I)V")
    public final void method929() {
        Statics.field426 = null;
        Statics.field66 = null;
        Statics.field1755 = null;
    }

    @ObfuscatedName("bd.ad(Ljava/lang/String;I)V")
    public void method875(String arg0) {
        if (this.field455) {
            return;
        }
        this.field455 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bd.ai(S)Ljava/awt/Container;")
    public Container method876() {
        return this.field469 == null ? this : this.field469;
    }

    @ObfuscatedName("bd.al(I)Llc;")
    public class330 method848() {
        Container var1 = this.method876();
        int var2 = Math.max(var1.getWidth(), this.field465);
        int var3 = Math.max(var1.getHeight(), this.field468);
        if (this.field469 != null) {
            Insets var4 = this.field469.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class330(var2, var3);
    }

    @ObfuscatedName("bd.ay(I)Z")
    public final boolean method971() {
        return this.field469 != null;
    }

    @ObfuscatedName("q.af(B)I")
    public static int method185() {
        int var0 = 0;
        if (Statics.field122 == null || !Statics.field122.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field122 = var2;
                        field481 = -1L;
                        field480 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field122 != null) {
            long var4 = class308.method4891();
            long var6 = Statics.field122.getCollectionTime();
            if (field480 != -1L) {
                long var8 = var6 - field480;
                long var10 = var4 - field481;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field480 = var6;
            field481 = var4;
        }
        return var0;
    }

    @ObfuscatedName("bd.y(I)V")
    public abstract void method854();

    public abstract void init();

    @ObfuscatedName("bd.av(ZI)V")
    public abstract void method871(boolean arg0);

    @ObfuscatedName("bd.ab(I)V")
    public abstract void method872();

    @ObfuscatedName("bd.ac(B)V")
    public abstract void method979();

    @ObfuscatedName("bd.ak(I)V")
    public abstract void method985();

    @ObfuscatedName("bd.ar(B)V")
    public abstract void method986();
}
