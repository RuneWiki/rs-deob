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

@ObfuscatedName("bz")
public abstract class class54 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bz.e")
    public static class54 field443 = null;

    @ObfuscatedName("bz.p")
    public static int field467 = 0;

    @ObfuscatedName("bz.k")
    public static long field445 = 0L;

    @ObfuscatedName("bz.l")
    public static boolean field446 = false;

    @ObfuscatedName("bz.b")
    public boolean field447 = false;

    @ObfuscatedName("bz.c")
    public static int field449 = 20;

    @ObfuscatedName("bz.f")
    public static int field444 = 1;

    @ObfuscatedName("bz.m")
    public static int field463 = 0;

    @ObfuscatedName("bz.v")
    public static long[] field453 = new long[32];

    @ObfuscatedName("bz.a")
    public static long[] field454 = new long[32];

    @ObfuscatedName("bz.t")
    public int field455;

    @ObfuscatedName("bz.h")
    public int field456;

    @ObfuscatedName("bz.o")
    public int field457 = 0;

    @ObfuscatedName("bz.n")
    public int field452 = 0;

    @ObfuscatedName("bz.z")
    public int field477;

    @ObfuscatedName("bz.al")
    public int field460;

    @ObfuscatedName("bz.av")
    public int field474;

    @ObfuscatedName("bz.as")
    public int field462;

    @ObfuscatedName("bz.ag")
    public Frame field442;

    @ObfuscatedName("bz.ar")
    public Canvas field461;

    @ObfuscatedName("bz.ax")
    public volatile boolean field465 = true;

    @ObfuscatedName("bz.ae")
    public static int field466 = 500;

    @ObfuscatedName("bz.ao")
    public boolean field451 = false;

    @ObfuscatedName("bz.aj")
    public volatile boolean field468 = false;

    @ObfuscatedName("bz.at")
    public volatile long field469 = 0L;

    @ObfuscatedName("bz.aq")
    public class45 field470;

    @ObfuscatedName("bz.aa")
    public Clipboard field471;

    @ObfuscatedName("bz.an")
    public final EventQueue field472;

    @ObfuscatedName("bz.au")
    public static volatile boolean field473 = true;

    @ObfuscatedName("bz.ah")
    public static long field459 = -1L;

    @ObfuscatedName("bz.am")
    public static long field475 = -1L;

    public class54() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field472 = var1;
        class47 var3 = new class47();
        Statics.field278 = var3;
    }

    @ObfuscatedName("bz.e(III)V")
    public final void method850(int arg0, int arg1) {
        if (this.field474 != arg0 || this.field462 != arg1) {
            this.method752();
        }
        this.field474 = arg0;
        this.field462 = arg1;
    }

    @ObfuscatedName("bz.p(Ljava/lang/Object;I)V")
    public final void method830(Object arg0) {
        if (this.field472 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field472.peekEvent() != null; var2++) {
            class299.method4167(1L);
        }
        if (arg0 != null) {
            this.field472.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bz.k(B)Lfj;")
    public class169 method739() {
        if (this.field470 == null) {
            this.field470 = new class45();
            this.field470.method634(this.field461);
        }
        return this.field470;
    }

    @ObfuscatedName("bz.l(I)V")
    public void method740() {
        this.field471 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bz.b(Ljava/lang/String;B)V")
    public void method741(String arg0) {
        this.field471.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bz.i(I)V")
    public final void method834() {
        if (Statics.field2030.toLowerCase().indexOf("microsoft") == -1) {
            class46.field408[44] = 71;
            class46.field408[45] = 26;
            class46.field408[46] = 72;
            class46.field408[47] = 73;
            class46.field408[59] = 57;
            class46.field408[61] = 27;
            class46.field408[91] = 42;
            class46.field408[92] = 74;
            class46.field408[93] = 43;
            class46.field408[192] = 28;
            class46.field408[222] = 58;
            class46.field408[520] = 59;
        } else {
            class46.field408[186] = 57;
            class46.field408[187] = 27;
            class46.field408[188] = 71;
            class46.field408[189] = 26;
            class46.field408[190] = 72;
            class46.field408[191] = 73;
            class46.field408[192] = 58;
            class46.field408[219] = 42;
            class46.field408[220] = 74;
            class46.field408[221] = 43;
            class46.field408[222] = 59;
            class46.field408[223] = 28;
        }
        class46.method1811(this.field461);
    }

    @ObfuscatedName("bz.c(I)V")
    public final void method794() {
        class55.method186(this.field461);
    }

    @ObfuscatedName("bz.u(I)V")
    public final void method744() {
        Container var1 = this.method764();
        if (var1 == null) {
            return;
        }
        class320 var2 = this.method765();
        this.field455 = Math.max(var2.field3866, this.field477);
        this.field456 = Math.max(var2.field3867, this.field460);
        if (this.field455 <= 0) {
            this.field455 = 1;
        }
        if (this.field456 <= 0) {
            this.field456 = 1;
        }
        Statics.field47 = Math.min(this.field455, this.field474);
        Statics.field3309 = Math.min(this.field456, this.field462);
        this.field457 = (this.field455 - Statics.field47) / 2;
        this.field452 = 0;
        this.field461.setSize(Statics.field47, Statics.field3309);
        Statics.field2487 = new class53(Statics.field47, Statics.field3309, this.field461);
        if (this.field442 == var1) {
            Insets var3 = this.field442.getInsets();
            this.field461.setLocation(this.field457 + var3.left, this.field452 + var3.top);
        } else {
            this.field461.setLocation(this.field457, this.field452);
        }
        this.field465 = true;
        this.method745();
    }

    @ObfuscatedName("bz.r(B)V")
    public void method789() {
        int var1 = this.field457;
        int var2 = this.field452;
        int var3 = this.field455 - Statics.field47 - var1;
        int var4 = this.field456 - Statics.field3309 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method764();
            int var6 = 0;
            int var7 = 0;
            if (this.field442 == var5) {
                Insets var8 = this.field442.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field456);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field455, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field455 + var6 - var3, var7, var3, this.field456);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field456 + var7 - var4, this.field455, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bz.v(I)V")
    public final void method770() {
        Canvas var1 = this.field461;
        var1.removeKeyListener(class46.field393);
        var1.removeFocusListener(class46.field393);
        class46.field399 = -1;
        Canvas var2 = this.field461;
        var2.removeMouseListener(class55.field480);
        var2.removeMouseMotionListener(class55.field480);
        var2.removeFocusListener(class55.field480);
        class55.field482 = 0;
        if (this.field470 != null) {
            this.field470.method635(this.field461);
        }
        this.method865();
        class46.method1811(this.field461);
        class55.method186(this.field461);
        if (this.field470 != null) {
            this.field470.method634(this.field461);
        }
        this.method752();
    }

    @ObfuscatedName("bz.y(IIII)V")
    public final void method858(int arg0, int arg1, int arg2) {
        try {
            if (field443 != null) {
                field467++;
                if (field467 >= 3) {
                    this.method763("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field443 = this;
            Statics.field47 = arg0;
            Statics.field3309 = arg1;
            Statics.field4066 = arg2;
            Statics.field4065 = this;
            if (Statics.field464 == null) {
                Statics.field464 = new class167();
            }
            Statics.field464.method3170(this, 1);
        } catch (Exception var5) {
            class342.method4173((String) null, var5);
            this.method763("crash");
        }
    }

    @ObfuscatedName("bz.g(I)V")
    public final synchronized void method865() {
        Container var1 = this.method764();
        if (this.field461 != null) {
            this.field461.removeFocusListener(this);
            var1.remove(this.field461);
        }
        Statics.field47 = Math.max(var1.getWidth(), this.field477);
        Statics.field3309 = Math.max(var1.getHeight(), this.field460);
        if (this.field442 != null) {
            Insets var2 = this.field442.getInsets();
            Statics.field47 -= var2.right + var2.left;
            Statics.field3309 -= var2.top + var2.bottom;
        }
        this.field461 = new class49(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field461);
        this.field461.setSize(Statics.field47, Statics.field3309);
        this.field461.setVisible(true);
        this.field461.setBackground(Color.BLACK);
        if (this.field442 == var1) {
            Insets var3 = this.field442.getInsets();
            this.field461.setLocation(this.field457 + var3.left, this.field452 + var3.top);
        } else {
            this.field461.setLocation(this.field457, this.field452);
        }
        this.field461.addFocusListener(this);
        this.field461.requestFocus();
        this.field465 = true;
        if (Statics.field2487 != null && Statics.field47 == Statics.field2487.field3878 && Statics.field3309 == Statics.field2487.field3879) {
            ((class53) Statics.field2487).method718(this.field461);
            Statics.field2487.method719(0, 0);
        } else {
            Statics.field2487 = new class53(Statics.field47, Statics.field3309, this.field461);
        }
        this.field468 = false;
        this.field469 = class298.method3576();
    }

    @ObfuscatedName("bz.a(I)Z")
    public final boolean method796() {
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
                this.method763("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2030 != null) {
                String var1 = Statics.field2030.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2029;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method763("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class292.method680(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class292.method3352(var4) && class292.method29(var4) < 10) {
                            this.method763("wrongjava");
                            return;
                        }
                    }
                    field444 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method865();
            this.method757();
            Statics.field448 = class171.method3271();
            while (field445 == 0L || class298.method3576() < field445) {
                Statics.field450 = Statics.field448.method3165(field449, field444);
                for (int var5 = 0; var5 < Statics.field450; var5++) {
                    this.method815();
                }
                this.method772();
                this.method830(this.field461);
            }
        } catch (Exception var7) {
            class342.method4173((String) null, var7);
            this.method763("crash");
        }
        this.method753();
    }

    @ObfuscatedName("bz.j(I)V")
    public void method815() {
        long var1 = class298.method3576();
        long var3 = field454[Statics.field3249];
        field454[Statics.field3249] = var1;
        Statics.field3249 = Statics.field3249 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field3558 = field473;
        }
        this.method758();
    }

    @ObfuscatedName("bz.s(I)V")
    public void method772() {
        Container var1 = this.method764();
        long var2 = class298.method3576();
        long var4 = field453[Statics.field3193];
        field453[Statics.field3193] = var2;
        Statics.field3193 = Statics.field3193 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field463 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field466 - 1 > 50) {
            field466 -= 50;
            this.field465 = true;
            this.field461.setSize(Statics.field47, Statics.field3309);
            this.field461.setVisible(true);
            if (this.field442 == var1) {
                Insets var7 = this.field442.getInsets();
                this.field461.setLocation(this.field457 + var7.left, this.field452 + var7.top);
            } else {
                this.field461.setLocation(this.field457, this.field452);
            }
        }
        if (this.field468) {
            this.method770();
        }
        this.method832();
        this.method759(this.field465);
        if (this.field465) {
            this.method789();
        }
        this.field465 = false;
    }

    @ObfuscatedName("bz.z(I)V")
    public final void method832() {
        class320 var1 = this.method765();
        if (this.field455 != var1.field3866 || this.field456 != var1.field3867 || this.field451) {
            this.method744();
            this.field451 = false;
        }
    }

    @ObfuscatedName("bz.al(I)V")
    public final void method752() {
        this.field451 = true;
    }

    @ObfuscatedName("bz.av(B)V")
    public final synchronized void method753() {
        if (field446) {
            return;
        }
        field446 = true;
        try {
            this.field461.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method845();
        } catch (Exception var7) {
        }
        if (this.field442 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field464 != null) {
            try {
                Statics.field464.method3167();
            } catch (Exception var5) {
            }
        }
        this.method797();
    }

    @ObfuscatedName("ei.as(I)V")
    public static final void method3010() {
        Statics.field448.method3163();
        for (int var0 = 0; var0 < 32; var0++) {
            field453[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field454[var1] = 0L;
        }
        Statics.field450 = 0;
    }

    public final void start() {
        if (field443 == this && !field446) {
            field445 = 0L;
        }
    }

    public final void stop() {
        if (field443 == this && !field446) {
            field445 = class298.method3576() + 4000L;
        }
    }

    public final void destroy() {
        if (field443 == this && !field446) {
            field445 = class298.method3576();
            class299.method4167(5000L);
            this.method753();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field443 != this || field446) {
            return;
        }
        this.field465 = true;
        if (class298.method3576() - this.field469 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field47 && var2.height >= Statics.field3309) {
                this.field468 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field473 = true;
        this.field465 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field473 = false;
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

    @ObfuscatedName("bz.ax(ILjava/lang/String;ZB)V")
    public final void method761(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field461.getGraphics();
            if (Statics.field3845 == null) {
                Statics.field3845 = new Font("Helvetica", 1, 13);
                Statics.field81 = this.field461.getFontMetrics(Statics.field3845);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field47, Statics.field3309);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field3126 == null) {
                    Statics.field3126 = this.field461.createImage(304, 34);
                }
                Graphics var6 = Statics.field3126.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field3845);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field81.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field3126, Statics.field47 / 2 - 152, Statics.field3309 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field47 / 2 - 152;
                int var9 = Statics.field3309 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field3845);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field81.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field461.repaint();
        }
    }

    @ObfuscatedName("bz.az(B)V")
    public final void method747() {
        Statics.field3126 = null;
        Statics.field3845 = null;
        Statics.field81 = null;
    }

    @ObfuscatedName("bz.ae(Ljava/lang/String;B)V")
    public void method763(String arg0) {
        if (this.field447) {
            return;
        }
        this.field447 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bz.ao(I)Ljava/awt/Container;")
    public Container method764() {
        return this.field442 == null ? this : this.field442;
    }

    @ObfuscatedName("bz.aj(I)Lls;")
    public class320 method765() {
        Container var1 = this.method764();
        int var2 = Math.max(var1.getWidth(), this.field477);
        int var3 = Math.max(var1.getHeight(), this.field460);
        if (this.field442 != null) {
            Insets var4 = this.field442.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class320(var2, var3);
    }

    @ObfuscatedName("bz.at(I)Z")
    public final boolean method793() {
        return this.field442 != null;
    }

    @ObfuscatedName("dg.ac(I)I")
    public static int method2260() {
        int var0 = 0;
        if (Statics.field379 == null || !Statics.field379.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field379 = var2;
                        field475 = -1L;
                        field459 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field379 != null) {
            long var4 = class298.method3576();
            long var6 = Statics.field379.getCollectionTime();
            if (field459 != -1L) {
                long var8 = var6 - field459;
                long var10 = var4 - field475;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field459 = var6;
            field475 = var4;
        }
        return var0;
    }

    @ObfuscatedName("bz.x(I)V")
    public abstract void method745();

    @ObfuscatedName("bz.aw(I)V")
    public abstract void method757();

    @ObfuscatedName("bz.ad(B)V")
    public abstract void method758();

    @ObfuscatedName("bz.ag(ZB)V")
    public abstract void method759(boolean arg0);

    @ObfuscatedName("bz.ap(I)V")
    public abstract void method797();

    @ObfuscatedName("bz.ar(I)V")
    public abstract void method845();

    public abstract void init();
}
