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

@ObfuscatedName("br")
public abstract class class63 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("br.k")
    public static class63 field502 = null;

    @ObfuscatedName("br.d")
    public static int field474 = 0;

    @ObfuscatedName("br.v")
    public static long field475 = 0L;

    @ObfuscatedName("br.q")
    public static boolean field490 = false;

    @ObfuscatedName("br.z")
    public boolean field477 = false;

    @ObfuscatedName("br.e")
    public static int field478 = 20;

    @ObfuscatedName("br.s")
    public static int field488 = 1;

    @ObfuscatedName("br.p")
    public static int field480 = 0;

    @ObfuscatedName("br.h")
    public static long[] field482 = new long[32];

    @ObfuscatedName("br.i")
    public static long[] field483 = new long[32];

    @ObfuscatedName("br.b")
    public int field484;

    @ObfuscatedName("br.l")
    public int field487;

    @ObfuscatedName("br.r")
    public int field486 = 0;

    @ObfuscatedName("br.o")
    public int field485 = 0;

    @ObfuscatedName("br.f")
    public int field476;

    @ObfuscatedName("br.ae")
    public int field489;

    @ObfuscatedName("br.an")
    public int field504;

    @ObfuscatedName("br.ai")
    public int field491;

    @ObfuscatedName("br.ar")
    public Frame field506;

    @ObfuscatedName("br.af")
    public Canvas field481;

    @ObfuscatedName("br.at")
    public volatile boolean field494 = true;

    @ObfuscatedName("br.as")
    public static int field492 = 500;

    @ObfuscatedName("br.am")
    public boolean field496 = false;

    @ObfuscatedName("br.au")
    public volatile boolean field497 = false;

    @ObfuscatedName("br.ao")
    public volatile long field498 = 0L;

    @ObfuscatedName("br.ak")
    public class54 field499;

    @ObfuscatedName("br.aa")
    public Clipboard field495;

    @ObfuscatedName("br.ax")
    public final EventQueue field501;

    @ObfuscatedName("br.az")
    public static volatile boolean field479 = true;

    @ObfuscatedName("br.ad")
    public static long field505 = -1L;

    @ObfuscatedName("br.ac")
    public static long field500 = -1L;

    public class63() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field501 = var1;
        class115.method2193(new class56());
    }

    @ObfuscatedName("br.v(III)V")
    public final void method861(int arg0, int arg1) {
        if (this.field504 != arg0 || this.field491 != arg1) {
            this.method944();
        }
        this.field504 = arg0;
        this.field491 = arg1;
    }

    @ObfuscatedName("br.q(Ljava/lang/Object;I)V")
    public final void method862(Object arg0) {
        if (this.field501 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field501.peekEvent() != null; var2++) {
            class308.method3243(1L);
        }
        if (arg0 != null) {
            this.field501.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("br.z(I)Lfq;")
    public class178 method863() {
        if (this.field499 == null) {
            this.field499 = new class54();
            this.field499.method750(this.field481);
        }
        return this.field499;
    }

    @ObfuscatedName("br.t(B)V")
    public void method886() {
        this.field495 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("br.e(Ljava/lang/String;I)V")
    public void method865(String arg0) {
        this.field495.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("br.s(I)V")
    public final void method915() {
        class55.method3421();
        Canvas var1 = this.field481;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class55.field414);
        var1.addFocusListener(class55.field414);
    }

    @ObfuscatedName("br.p(B)V")
    public final void method903() {
        class64.method149(this.field481);
    }

    @ObfuscatedName("br.n(B)V")
    public final void method868() {
        Container var1 = this.method894();
        if (var1 == null) {
            return;
        }
        class329 var2 = this.method860();
        this.field484 = Math.max(var2.field3856, this.field476);
        this.field487 = Math.max(var2.field3857, this.field489);
        if (this.field484 <= 0) {
            this.field484 = 1;
        }
        if (this.field487 <= 0) {
            this.field487 = 1;
        }
        Statics.field278 = Math.min(this.field484, this.field504);
        Statics.field2526 = Math.min(this.field487, this.field491);
        this.field486 = (this.field484 - Statics.field278) / 2;
        this.field485 = 0;
        this.field481.setSize(Statics.field278, Statics.field2526);
        Statics.field2412 = new class62(Statics.field278, Statics.field2526, this.field481);
        if (this.field506 == var1) {
            Insets var3 = this.field506.getInsets();
            this.field481.setLocation(this.field486 + var3.left, this.field485 + var3.top);
        } else {
            this.field481.setLocation(this.field486, this.field485);
        }
        this.field494 = true;
        this.method972();
    }

    @ObfuscatedName("br.h(I)V")
    public void method870() {
        int var1 = this.field486;
        int var2 = this.field485;
        int var3 = this.field484 - Statics.field278 - var1;
        int var4 = this.field487 - Statics.field2526 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method894();
            int var6 = 0;
            int var7 = 0;
            if (this.field506 == var5) {
                Insets var8 = this.field506.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field487);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field484, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field484 + var6 - var3, var7, var3, this.field487);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field487 + var7 - var4, this.field484, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("br.g(B)V")
    public final void method931() {
        Canvas var1 = this.field481;
        var1.removeKeyListener(class55.field414);
        var1.removeFocusListener(class55.field414);
        class55.field430 = -1;
        class64.method5595(this.field481);
        if (this.field499 != null) {
            this.field499.method751(this.field481);
        }
        this.method873();
        Canvas var2 = this.field481;
        var2.setFocusTraversalKeysEnabled(false);
        var2.addKeyListener(class55.field414);
        var2.addFocusListener(class55.field414);
        class64.method149(this.field481);
        if (this.field499 != null) {
            this.field499.method750(this.field481);
        }
        this.method944();
    }

    @ObfuscatedName("br.an(IIII)V")
    public final void method872(int arg0, int arg1, int arg2) {
        try {
            if (field502 != null) {
                field474++;
                if (field474 >= 3) {
                    this.method964("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field502 = this;
            Statics.field278 = arg0;
            Statics.field2526 = arg1;
            Statics.field4074 = arg2;
            Statics.field4073 = this;
            if (Statics.field2711 == null) {
                Statics.field2711 = new class176();
            }
            Statics.field2711.method3257(this, 1);
        } catch (Exception var5) {
            class351.method3842((String) null, var5);
            this.method964("crash");
        }
    }

    @ObfuscatedName("br.ai(B)V")
    public final synchronized void method873() {
        Container var1 = this.method894();
        if (this.field481 != null) {
            this.field481.removeFocusListener(this);
            var1.remove(this.field481);
        }
        Statics.field278 = Math.max(var1.getWidth(), this.field476);
        Statics.field2526 = Math.max(var1.getHeight(), this.field489);
        if (this.field506 != null) {
            Insets var2 = this.field506.getInsets();
            Statics.field278 -= var2.right + var2.left;
            Statics.field2526 -= var2.top + var2.bottom;
        }
        this.field481 = new class58(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field481);
        this.field481.setSize(Statics.field278, Statics.field2526);
        this.field481.setVisible(true);
        this.field481.setBackground(Color.BLACK);
        if (this.field506 == var1) {
            Insets var3 = this.field506.getInsets();
            this.field481.setLocation(this.field486 + var3.left, this.field485 + var3.top);
        } else {
            this.field481.setLocation(this.field486, this.field485);
        }
        this.field481.addFocusListener(this);
        this.field481.requestFocus();
        this.field494 = true;
        if (Statics.field2412 != null && Statics.field278 == Statics.field2412.field3871 && Statics.field2526 == Statics.field2412.field3870) {
            ((class62) Statics.field2412).method845(this.field481);
            Statics.field2412.method846(0, 0);
        } else {
            Statics.field2412 = new class62(Statics.field278, Statics.field2526, this.field481);
        }
        this.field497 = false;
        this.field498 = Statics.method3668();
    }

    @ObfuscatedName("br.ap(I)Z")
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
                this.method964("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2040 != null) {
                String var1 = Statics.field2040.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2042;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method964("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class301.method2364(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class301.method3633(var4) && class301.method1061(var4) < 10) {
                            this.method964("wrongjava");
                            return;
                        }
                    }
                    field488 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method873();
            this.method889();
            Statics.field473 = class180.method1170();
            while (field475 == 0L || Statics.method3668() < field475) {
                Statics.field1878 = Statics.field473.method3249(field478, field488);
                for (int var5 = 0; var5 < Statics.field1878; var5++) {
                    this.method875();
                }
                this.method876();
                this.method862(this.field481);
            }
        } catch (Exception var7) {
            class351.method3842((String) null, var7);
            this.method964("crash");
        }
        this.method881();
    }

    @ObfuscatedName("br.ab(I)V")
    public void method875() {
        long var1 = Statics.method3668();
        long var3 = field483[Statics.field1084];
        field483[Statics.field1084] = var1;
        Statics.field1084 = Statics.field1084 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field503 = field479;
        }
        this.method890();
    }

    @ObfuscatedName("br.ar(I)V")
    public void method876() {
        Container var1 = this.method894();
        long var2 = Statics.method3668();
        long var4 = field482[Statics.field466];
        field482[Statics.field466] = var2;
        Statics.field466 = Statics.field466 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field480 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field492 - 1 > 50) {
            field492 -= 50;
            this.field494 = true;
            this.field481.setSize(Statics.field278, Statics.field2526);
            this.field481.setVisible(true);
            if (this.field506 == var1) {
                Insets var7 = this.field506.getInsets();
                this.field481.setLocation(this.field486 + var7.left, this.field485 + var7.top);
            } else {
                this.field481.setLocation(this.field486, this.field485);
            }
        }
        if (this.field497) {
            this.method931();
        }
        this.method877();
        this.method945(this.field494);
        if (this.field494) {
            this.method870();
        }
        this.field494 = false;
    }

    @ObfuscatedName("br.af(I)V")
    public final void method877() {
        class329 var1 = this.method860();
        if (this.field484 != var1.field3856 || this.field487 != var1.field3857 || this.field496) {
            this.method868();
            this.field496 = false;
        }
    }

    @ObfuscatedName("br.at(B)V")
    public final void method944() {
        this.field496 = true;
    }

    @ObfuscatedName("br.as(I)V")
    public final synchronized void method881() {
        if (field490) {
            return;
        }
        field490 = true;
        try {
            this.field481.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method892();
        } catch (Exception var7) {
        }
        if (this.field506 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field2711 != null) {
            try {
                Statics.field2711.method3254();
            } catch (Exception var5) {
            }
        }
        this.method897();
    }

    public final void start() {
        if (field502 == this && !field490) {
            field475 = 0L;
        }
    }

    public final void stop() {
        if (field502 == this && !field490) {
            field475 = Statics.method3668() + 4000L;
        }
    }

    public final void destroy() {
        if (field502 == this && !field490) {
            field475 = Statics.method3668();
            class308.method3243(5000L);
            this.method881();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field502 != this || field490) {
            return;
        }
        this.field494 = true;
        if (Statics.method3668() - this.field498 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field278 && var2.height >= Statics.field2526) {
                this.field497 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field479 = true;
        this.field494 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field479 = false;
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

    @ObfuscatedName("br.av(ILjava/lang/String;ZI)V")
    public final void method910(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field481.getGraphics();
            if (Statics.field1072 == null) {
                Statics.field1072 = new Font("Helvetica", 1, 13);
                Statics.field3608 = this.field481.getFontMetrics(Statics.field1072);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field278, Statics.field2526);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field266 == null) {
                    Statics.field266 = this.field481.createImage(304, 34);
                }
                Graphics var6 = Statics.field266.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field1072);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field3608.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field266, Statics.field278 / 2 - 152, Statics.field2526 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field278 / 2 - 152;
                int var9 = Statics.field2526 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1072);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field3608.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field481.repaint();
        }
    }

    @ObfuscatedName("br.ak(I)V")
    public final void method869() {
        Statics.field266 = null;
        Statics.field1072 = null;
        Statics.field3608 = null;
    }

    @ObfuscatedName("br.aa(Ljava/lang/String;I)V")
    public void method964(String arg0) {
        if (this.field477) {
            return;
        }
        this.field477 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("br.ax(I)Ljava/awt/Container;")
    public Container method894() {
        return this.field506 == null ? this : this.field506;
    }

    @ObfuscatedName("br.az(B)Lld;")
    public class329 method860() {
        Container var1 = this.method894();
        int var2 = Math.max(var1.getWidth(), this.field476);
        int var3 = Math.max(var1.getHeight(), this.field489);
        if (this.field506 != null) {
            Insets var4 = this.field506.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class329(var2, var3);
    }

    @ObfuscatedName("br.aj(I)Z")
    public final boolean method884() {
        return this.field506 != null;
    }

    @ObfuscatedName("gx.ay(B)I")
    public static int method3348() {
        int var0 = 0;
        if (Statics.field493 == null || !Statics.field493.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field493 = var2;
                        field500 = -1L;
                        field505 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field493 != null) {
            long var4 = Statics.method3668();
            long var6 = Statics.field493.getCollectionTime();
            if (field505 != -1L) {
                long var8 = var6 - field505;
                long var10 = var4 - field500;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field505 = var6;
            field500 = var4;
        }
        return var0;
    }

    public abstract void init();

    @ObfuscatedName("br.am(I)V")
    public abstract void method889();

    @ObfuscatedName("br.au(B)V")
    public abstract void method890();

    @ObfuscatedName("br.aq(S)V")
    public abstract void method892();

    @ObfuscatedName("br.ad(I)V")
    public abstract void method897();

    @ObfuscatedName("br.ao(ZB)V")
    public abstract void method945(boolean arg0);

    @ObfuscatedName("br.u(B)V")
    public abstract void method972();
}
