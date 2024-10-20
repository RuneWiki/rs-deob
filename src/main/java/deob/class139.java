package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;

@ObfuscatedName("eb")
public abstract class class139 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("eb.pj")
    public static class139 field2111 = null;

    @ObfuscatedName("eb.pl")
    public static int field2097 = 0;

    @ObfuscatedName("eb.pf")
    public static long field2098 = 0L;

    @ObfuscatedName("eb.pe")
    public static boolean field2099 = false;

    @ObfuscatedName("eb.qe")
    public static int field2100 = 20;

    @ObfuscatedName("eb.qw")
    public static int field2102 = 1;

    @ObfuscatedName("eb.qa")
    public static int field2103 = 0;

    @ObfuscatedName("eb.qh")
    public static long[] field2104 = new long[32];

    @ObfuscatedName("eb.qr")
    public static long[] field2105 = new long[32];

    @ObfuscatedName("eb.qp")
    public static int field2106 = 0;

    @ObfuscatedName("eb.qi")
    public static int field2107 = 0;

    @ObfuscatedName("eb.qd")
    public static volatile boolean field2101 = true;

    @ObfuscatedName("eb.qx")
    public static int field2109 = 500;

    @ObfuscatedName("eb.qq")
    public static boolean field2110 = false;

    @ObfuscatedName("eb.rq")
    public static volatile boolean field2096 = false;

    @ObfuscatedName("eb.rc")
    public static volatile long field2112 = 0L;

    @ObfuscatedName("eb.rd")
    public static volatile boolean field2113 = true;

    @ObfuscatedName("eb.pr")
    public boolean field2115 = false;

    @ObfuscatedName("eb.qd(IIIB)V")
    public final void method2790(int arg0, int arg1, int arg2) {
        try {
            if (field2111 != null) {
                field2097++;
                if (field2097 >= 3) {
                    this.method2800("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2111 = this;
            Statics.field2066 = arg0;
            Statics.field2056 = arg1;
            Statics.field2588 = arg2;
            Statics.field2135 = this;
            if (Statics.field109 == null) {
                Statics.field109 = new class131();
            }
            Statics.field109.method2697(this, 1);
        } catch (Exception var5) {
            class143.method1973((String) null, var5);
            this.method2800("crash");
        }
    }

    @ObfuscatedName("eb.qm(B)V")
    public final synchronized void method2791() {
        Container var1 = this.method2801();
        if (Statics.field1706 != null) {
            Statics.field1706.removeFocusListener(this);
            var1.remove(Statics.field1706);
        }
        Statics.field2066 = Math.max(var1.getWidth(), Statics.field1866);
        Statics.field2056 = Math.max(var1.getHeight(), Statics.field1007);
        if (Statics.field1966 != null) {
            Insets var2 = Statics.field1966.getInsets();
            Statics.field2066 -= var2.right + var2.left;
            Statics.field2056 -= var2.top + var2.bottom;
        }
        Statics.field1706 = new class134(this);
        var1.add(Statics.field1706);
        Statics.field1706.setSize(Statics.field2066, Statics.field2056);
        Statics.field1706.setVisible(true);
        if (Statics.field1966 == var1) {
            Insets var3 = Statics.field1966.getInsets();
            Statics.field1706.setLocation(field2106 + var3.left, field2107 + var3.top);
        } else {
            Statics.field1706.setLocation(field2106, field2107);
        }
        Statics.field1706.addFocusListener(this);
        Statics.field1706.requestFocus();
        field2101 = true;
        class76 var4 = class76.method994(Statics.field2066, Statics.field2056, Statics.field1706);
        if (Statics.field1877 != null) {
            Statics.field1877.method1552(var4.field1360.getGraphics(), 0, 0);
        }
        Statics.field1877 = var4;
        field2096 = false;
        field2112 = Statics.method2875();
    }

    @ObfuscatedName("eb.qx(I)Z")
    public final boolean method2792() {
        String var1 = this.getDocumentBase().getHost().toLowerCase();
        if (var1.equals("jagex.com") || var1.endsWith(".jagex.com")) {
            return true;
        } else if (var1.equals("runescape.com") || var1.endsWith(".runescape.com")) {
            return true;
        } else if (var1.equals("mechscape.com") || var1.endsWith(".mechscape.com")) {
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
                this.method2800("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2829 != null) {
                String var1 = Statics.field2829.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1988;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2800("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class157.method2616(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class157.method3422(var4)) {
                            int var5 = class157.method644(var4, 10, true);
                            if (var5 < 10) {
                                this.method2800("wrongjava");
                                return;
                            }
                        }
                    }
                    field2102 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2791();
            this.method347();
            Statics.field2204 = class128.method815();
            label77: while (true) {
                class131 var7;
                Canvas var8;
                do {
                    if (field2098 != 0L && Statics.method2875() >= field2098) {
                        break label77;
                    }
                    Statics.field763 = Statics.field2204.method2660(field2100, field2102);
                    for (int var6 = 0; var6 < Statics.field763; var6++) {
                        this.method2793();
                    }
                    this.method2846();
                    var7 = Statics.field109;
                    var8 = Statics.field1706;
                } while (var7.field1984 == null);
                for (int var9 = 0; var9 < 50 && var7.field1984.peekEvent() != null; var9++) {
                    class122.method558(1L);
                }
                if (var8 != null) {
                    var7.field1984.postEvent(new ActionEvent(var8, 1001, "dummy"));
                }
            }
        } catch (Exception var11) {
            class143.method1973((String) null, var11);
            this.method2800("crash");
        }
        this.method2794();
    }

    @ObfuscatedName("eb.qq(I)V")
    public void method2793() {
        long var1 = Statics.method2875();
        long var3 = field2105[Statics.field1737];
        field2105[Statics.field1737] = var1;
        Statics.field1737 = Statics.field1737 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field2201 = field2113;
        }
        this.method234();
    }

    @ObfuscatedName("eb.rq(I)V")
    public void method2846() {
        Container var1 = this.method2801();
        long var2 = Statics.method2875();
        long var4 = field2104[Statics.field1939];
        field2104[Statics.field1939] = var2;
        Statics.field1939 = Statics.field1939 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2103 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2109 - 1 > 50) {
            field2109 -= 50;
            field2101 = true;
            Statics.field1706.setSize(Statics.field2066, Statics.field2056);
            Statics.field1706.setVisible(true);
            if (Statics.field1966 == var1) {
                Insets var7 = Statics.field1966.getInsets();
                Statics.field1706.setLocation(field2106 + var7.left, field2107 + var7.top);
            } else {
                Statics.field1706.setLocation(field2106, field2107);
            }
        }
        this.method235();
    }

    @ObfuscatedName("eb.rc(I)V")
    public final synchronized void method2794() {
        if (field2099) {
            return;
        }
        field2099 = true;
        try {
            Statics.field1706.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method236();
        } catch (Exception var7) {
        }
        if (Statics.field1966 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field109 != null) {
            try {
                Statics.field109.method2708();
            } catch (Exception var5) {
            }
        }
        this.method391();
    }

    @ObfuscatedName("cr.ry(I)V")
    public static final void method2163() {
        Statics.field2204.method2670();
        for (int var0 = 0; var0 < 32; var0++) {
            field2104[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2105[var1] = 0L;
        }
        Statics.field763 = 0;
    }

    public void start() {
        if (field2111 == this && !field2099) {
            field2098 = 0L;
        }
    }

    public void stop() {
        if (field2111 == this && !field2099) {
            field2098 = Statics.method2875() + 4000L;
        }
    }

    public void destroy() {
        if (field2111 == this && !field2099) {
            field2098 = Statics.method2875();
            class122.method558(5000L);
            this.method2794();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2111 != this || field2099) {
            return;
        }
        field2101 = true;
        if (Statics.field1988 != null && Statics.field1988.startsWith("1.5") && Statics.method2875() - field2112 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field2066 && var2.height >= Statics.field2056) {
                field2096 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2113 = true;
        field2101 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2113 = false;
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

    @ObfuscatedName("eb.rd(Ljava/lang/String;I)V")
    public void method2800(String arg0) {
        if (this.field2115) {
            return;
        }
        this.field2115 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("eb.rf(B)Ljava/awt/Container;")
    public Container method2801() {
        return Statics.field1966 == null ? this : Statics.field1966;
    }

    @ObfuscatedName("eb.rj(I)Ljava/awt/Dimension;")
    public Dimension method2802() {
        Container var1 = this.method2801();
        int var2 = Math.max(var1.getWidth(), Statics.field1866);
        int var3 = Math.max(var1.getHeight(), Statics.field1007);
        if (Statics.field1966 != null) {
            Insets var4 = Statics.field1966.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    public abstract void init();

    @ObfuscatedName("eb.d(I)V")
    public abstract void method234();

    @ObfuscatedName("eb.f(B)V")
    public abstract void method235();

    @ObfuscatedName("eb.i(I)V")
    public abstract void method236();

    @ObfuscatedName("eb.y(I)V")
    public abstract void method391();

    @ObfuscatedName("eb.w(B)V")
    public abstract void method347();
}
