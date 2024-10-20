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

@ObfuscatedName("bh")
public abstract class class54 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bh.n")
    public static class54 field433 = null;

    @ObfuscatedName("bh.v")
    public static int field422 = 0;

    @ObfuscatedName("bh.u")
    public static long field455 = 0L;

    @ObfuscatedName("bh.r")
    public static boolean field436 = false;

    @ObfuscatedName("bh.p")
    public boolean field425 = false;

    @ObfuscatedName("bh.m")
    public static int field423 = 20;

    @ObfuscatedName("bh.i")
    public static int field428 = 1;

    @ObfuscatedName("bh.c")
    public static int field429 = 0;

    @ObfuscatedName("bh.a")
    public static long[] field431 = new long[32];

    @ObfuscatedName("bh.t")
    public static long[] field432 = new long[32];

    @ObfuscatedName("bh.h")
    public int field430;

    @ObfuscatedName("bh.s")
    public int field426;

    @ObfuscatedName("bh.f")
    public int field435 = 0;

    @ObfuscatedName("bh.j")
    public int field453 = 0;

    @ObfuscatedName("bh.k")
    public int field437;

    @ObfuscatedName("bh.ac")
    public int field438;

    @ObfuscatedName("bh.az")
    public int field439;

    @ObfuscatedName("bh.aw")
    public int field443;

    @ObfuscatedName("bh.ar")
    public Frame field427;

    @ObfuscatedName("bh.ab")
    public Canvas field442;

    @ObfuscatedName("bh.ax")
    public volatile boolean field421 = true;

    @ObfuscatedName("bh.ao")
    public static int field444 = 500;

    @ObfuscatedName("bh.al")
    public boolean field445 = false;

    @ObfuscatedName("bh.ad")
    public volatile boolean field446 = false;

    @ObfuscatedName("bh.an")
    public volatile long field447 = 0L;

    @ObfuscatedName("bh.aq")
    public class45 field448;

    @ObfuscatedName("bh.am")
    public Clipboard field449;

    @ObfuscatedName("bh.ae")
    public final EventQueue field450;

    @ObfuscatedName("bh.av")
    public static volatile boolean field451 = true;

    @ObfuscatedName("bh.aj")
    public static long field452 = -1L;

    @ObfuscatedName("bh.ay")
    public static long field441 = -1L;

    public class54() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field450 = var1;
        class106.method281(new class47());
    }

    @ObfuscatedName("bh.u(III)V")
    public final void method786(int arg0, int arg1) {
        if (this.field439 != arg0 || this.field443 != arg1) {
            this.method799();
        }
        this.field439 = arg0;
        this.field443 = arg1;
    }

    @ObfuscatedName("bh.r(Ljava/lang/Object;I)V")
    public final void method787(Object arg0) {
        if (this.field450 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field450.peekEvent() != null; var2++) {
            try {
                Thread.sleep(1L);
            } catch (InterruptedException var4) {
            }
        }
        if (arg0 != null) {
            this.field450.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bh.p(I)Lft;")
    public class169 method788() {
        if (this.field448 == null) {
            this.field448 = new class45();
            this.field448.method687(this.field442);
        }
        return this.field448;
    }

    @ObfuscatedName("bh.q(I)V")
    public void method870() {
        this.field449 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bh.m(Ljava/lang/String;I)V")
    public void method794(String arg0) {
        this.field449.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bh.y(I)V")
    public final void method790() {
        class46.method3706();
        Canvas var1 = this.field442;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class46.field358);
        var1.addFocusListener(class46.field358);
    }

    @ObfuscatedName("bh.i(B)V")
    public final void method791() {
        class55.method682(this.field442);
    }

    @ObfuscatedName("bh.c(I)V")
    public final void method792() {
        Container var1 = this.method816();
        if (var1 == null) {
            return;
        }
        class319 var2 = this.method817();
        this.field430 = Math.max(var2.field3837, this.field437);
        this.field426 = Math.max(var2.field3840, this.field438);
        if (this.field430 <= 0) {
            this.field430 = 1;
        }
        if (this.field426 <= 0) {
            this.field426 = 1;
        }
        Statics.field1578 = Math.min(this.field430, this.field439);
        Statics.field1904 = Math.min(this.field426, this.field443);
        this.field435 = (this.field430 - Statics.field1578) / 2;
        this.field453 = 0;
        this.field442.setSize(Statics.field1578, Statics.field1904);
        Statics.field349 = new class53(Statics.field1578, Statics.field1904, this.field442);
        if (this.field427 == var1) {
            Insets var3 = this.field427.getInsets();
            this.field442.setLocation(this.field435 + var3.left, this.field453 + var3.top);
        } else {
            this.field442.setLocation(this.field435, this.field453);
        }
        this.field421 = true;
        this.method897();
    }

    @ObfuscatedName("bh.o(I)V")
    public void method829() {
        int var1 = this.field435;
        int var2 = this.field453;
        int var3 = this.field430 - Statics.field1578 - var1;
        int var4 = this.field426 - Statics.field1904 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method816();
            int var6 = 0;
            int var7 = 0;
            if (this.field427 == var5) {
                Insets var8 = this.field427.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field426);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field430, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field430 + var6 - var3, var7, var3, this.field426);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field426 + var7 - var4, this.field430, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bh.a(S)V")
    public final void method914() {
        class46.method1876(this.field442);
        class55.method3225(this.field442);
        if (this.field448 != null) {
            this.field448.method686(this.field442);
        }
        this.method797();
        Canvas var1 = this.field442;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class46.field358);
        var1.addFocusListener(class46.field358);
        class55.method682(this.field442);
        if (this.field448 != null) {
            this.field448.method687(this.field442);
        }
        this.method799();
    }

    @ObfuscatedName("bh.e(IIII)V")
    public final void method796(int arg0, int arg1, int arg2) {
        try {
            if (field433 != null) {
                field422++;
                if (field422 >= 3) {
                    this.method815("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field433 = this;
            Statics.field1578 = arg0;
            Statics.field1904 = arg1;
            Statics.field4041 = arg2;
            Statics.field4045 = this;
            if (Statics.field440 == null) {
                Statics.field440 = new class167();
            }
            Statics.field440.method3131(this, 1);
        } catch (Exception var5) {
            class341.method511((String) null, var5);
            this.method815("crash");
        }
    }

    @ObfuscatedName("bh.x(S)V")
    public final synchronized void method797() {
        Container var1 = this.method816();
        if (this.field442 != null) {
            this.field442.removeFocusListener(this);
            var1.remove(this.field442);
        }
        Statics.field1578 = Math.max(var1.getWidth(), this.field437);
        Statics.field1904 = Math.max(var1.getHeight(), this.field438);
        if (this.field427 != null) {
            Insets var2 = this.field427.getInsets();
            Statics.field1578 -= var2.right + var2.left;
            Statics.field1904 -= var2.top + var2.bottom;
        }
        this.field442 = new class49(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field442);
        this.field442.setSize(Statics.field1578, Statics.field1904);
        this.field442.setVisible(true);
        this.field442.setBackground(Color.BLACK);
        if (this.field427 == var1) {
            Insets var3 = this.field427.getInsets();
            this.field442.setLocation(this.field435 + var3.left, this.field453 + var3.top);
        } else {
            this.field442.setLocation(this.field435, this.field453);
        }
        this.field442.addFocusListener(this);
        this.field442.requestFocus();
        this.field421 = true;
        if (Statics.field349 != null && Statics.field1578 == Statics.field349.field3853 && Statics.field1904 == Statics.field349.field3854) {
            ((class53) Statics.field349).method777(this.field442);
            Statics.field349.method768(0, 0);
        } else {
            Statics.field349 = new class53(Statics.field1578, Statics.field1904, this.field442);
        }
        this.field446 = false;
        this.field447 = class297.method502();
    }

    @ObfuscatedName("bh.h(I)Z")
    public final boolean method798() {
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
                this.method815("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2019 != null) {
                String var1 = Statics.field2019.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2011;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method815("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class291.method530(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class291.method3186(var4) && class291.method2779(var4) < 10) {
                            this.method815("wrongjava");
                            return;
                        }
                    }
                    field428 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method797();
            this.method809();
            Statics.field424 = class171.method1024();
            while (field455 == 0L || class297.method502() < field455) {
                Statics.field420 = Statics.field424.method3115(field423, field428);
                for (int var5 = 0; var5 < Statics.field420; var5++) {
                    this.method807();
                }
                this.method800();
                this.method787(this.field442);
            }
        } catch (Exception var7) {
            class341.method511((String) null, var7);
            this.method815("crash");
        }
        this.method803();
    }

    @ObfuscatedName("bh.s(I)V")
    public void method807() {
        long var1 = class297.method502();
        long var3 = field432[Statics.field260];
        field432[Statics.field260] = var1;
        Statics.field260 = Statics.field260 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field2015 = field451;
        }
        this.method810();
    }

    @ObfuscatedName("bh.f(I)V")
    public void method800() {
        Container var1 = this.method816();
        long var2 = class297.method502();
        long var4 = field431[Statics.field1256];
        field431[Statics.field1256] = var2;
        Statics.field1256 = Statics.field1256 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field429 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field444 - 1 > 50) {
            field444 -= 50;
            this.field421 = true;
            this.field442.setSize(Statics.field1578, Statics.field1904);
            this.field442.setVisible(true);
            if (this.field427 == var1) {
                Insets var7 = this.field427.getInsets();
                this.field442.setLocation(this.field435 + var7.left, this.field453 + var7.top);
            } else {
                this.field442.setLocation(this.field435, this.field453);
            }
        }
        if (this.field446) {
            this.method914();
        }
        this.method801();
        this.method811(this.field421);
        if (this.field421) {
            this.method829();
        }
        this.field421 = false;
    }

    @ObfuscatedName("bh.j(B)V")
    public final void method801() {
        class319 var1 = this.method817();
        if (this.field430 != var1.field3837 || this.field426 != var1.field3840 || this.field445) {
            this.method792();
            this.field445 = false;
        }
    }

    @ObfuscatedName("bh.d(I)V")
    public final void method799() {
        this.field445 = true;
    }

    @ObfuscatedName("bh.l(I)V")
    public final synchronized void method803() {
        if (field436) {
            return;
        }
        field436 = true;
        try {
            this.field442.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method812();
        } catch (Exception var7) {
        }
        if (this.field427 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field440 != null) {
            try {
                Statics.field440.method3120();
            } catch (Exception var5) {
            }
        }
        this.method819();
    }

    @ObfuscatedName("k.ap(B)V")
    public static final void method279() {
        Statics.field424.method3114();
        for (int var0 = 0; var0 < 32; var0++) {
            field431[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field432[var1] = 0L;
        }
        Statics.field420 = 0;
    }

    public final void start() {
        if (field433 == this && !field436) {
            field455 = 0L;
        }
    }

    public final void stop() {
        if (field433 == this && !field436) {
            field455 = class297.method502() + 4000L;
        }
    }

    public final void destroy() {
        if (field433 != this || field436) {
            return;
        }
        field455 = class297.method502();
        long var1 = 4999L;
        try {
            Thread.sleep(var1);
        } catch (InterruptedException var6) {
        }
        try {
            Thread.sleep(1L);
        } catch (InterruptedException var5) {
        }
        this.method803();
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field433 != this || field436) {
            return;
        }
        this.field421 = true;
        if (class297.method502() - this.field447 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1578 && var2.height >= Statics.field1904) {
                this.field446 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field451 = true;
        this.field421 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field451 = false;
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

    @ObfuscatedName("bh.ao(ILjava/lang/String;ZB)V")
    public final void method913(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field442.getGraphics();
            if (Statics.field3520 == null) {
                Statics.field3520 = new Font("Helvetica", 1, 13);
                Statics.field3500 = this.field442.getFontMetrics(Statics.field3520);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field1578, Statics.field1904);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field1128 == null) {
                    Statics.field1128 = this.field442.createImage(304, 34);
                }
                Graphics var6 = Statics.field1128.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field3520);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field3500.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field1128, Statics.field1578 / 2 - 152, Statics.field1904 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field1578 / 2 - 152;
                int var9 = Statics.field1904 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field3520);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field3500.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field442.repaint();
        }
    }

    @ObfuscatedName("bh.al(I)V")
    public final void method868() {
        Statics.field1128 = null;
        Statics.field3520 = null;
        Statics.field3500 = null;
    }

    @ObfuscatedName("bh.ad(Ljava/lang/String;B)V")
    public void method815(String arg0) {
        if (this.field425) {
            return;
        }
        this.field425 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bh.an(B)Ljava/awt/Container;")
    public Container method816() {
        return this.field427 == null ? this : this.field427;
    }

    @ObfuscatedName("bh.ai(B)Lll;")
    public class319 method817() {
        Container var1 = this.method816();
        int var2 = Math.max(var1.getWidth(), this.field437);
        int var3 = Math.max(var1.getHeight(), this.field438);
        if (this.field427 != null) {
            Insets var4 = this.field427.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class319(var2, var3);
    }

    @ObfuscatedName("bh.ak(I)Z")
    public final boolean method818() {
        return this.field427 != null;
    }

    @ObfuscatedName("r.aq(I)I")
    public static int method50() {
        int var0 = 0;
        if (Statics.field3580 == null || !Statics.field3580.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field3580 = var2;
                        field441 = -1L;
                        field452 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field3580 != null) {
            long var4 = class297.method502();
            long var6 = Statics.field3580.getCollectionTime();
            if (field452 != -1L) {
                long var8 = var6 - field452;
                long var10 = var4 - field441;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field452 = var6;
            field441 = var4;
        }
        return var0;
    }

    public abstract void init();

    @ObfuscatedName("bh.ar(B)V")
    public abstract void method809();

    @ObfuscatedName("bh.ab(B)V")
    public abstract void method810();

    @ObfuscatedName("bh.ax(ZI)V")
    public abstract void method811(boolean arg0);

    @ObfuscatedName("bh.as(B)V")
    public abstract void method812();

    @ObfuscatedName("bh.am(I)V")
    public abstract void method819();

    @ObfuscatedName("bh.b(I)V")
    public abstract void method897();
}
