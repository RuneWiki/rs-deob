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

@ObfuscatedName("eh")
public abstract class class136 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("eh.pr")
    public static class136 field2104 = null;

    @ObfuscatedName("eh.pe")
    public static int field2098 = 0;

    @ObfuscatedName("eh.pt")
    public static long field2099 = 0L;

    @ObfuscatedName("eh.pz")
    public static boolean field2100 = false;

    @ObfuscatedName("eh.pc")
    public static int field2102 = 20;

    @ObfuscatedName("eh.pd")
    public static int field2103 = 1;

    @ObfuscatedName("eh.qk")
    public static int field2111 = 0;

    @ObfuscatedName("eh.qp")
    public static long[] field2105 = new long[32];

    @ObfuscatedName("eh.qa")
    public static long[] field2113 = new long[32];

    @ObfuscatedName("eh.qs")
    public static int field2107 = 0;

    @ObfuscatedName("eh.qh")
    public static int field2108 = 0;

    @ObfuscatedName("eh.qy")
    public static volatile boolean field2109 = true;

    @ObfuscatedName("eh.qe")
    public static int field2110 = 500;

    @ObfuscatedName("eh.qc")
    public static boolean field2101 = false;

    @ObfuscatedName("eh.qb")
    public static volatile boolean field2114 = false;

    @ObfuscatedName("eh.qq")
    public static volatile long field2097 = 0L;

    @ObfuscatedName("eh.rq")
    public static volatile boolean field2106 = true;

    @ObfuscatedName("eh.pn")
    public boolean field2112 = false;

    @ObfuscatedName("eh.qj(IIII)V")
    public final void method2773(int arg0, int arg1, int arg2) {
        try {
            if (field2104 != null) {
                field2098++;
                if (field2098 >= 3) {
                    this.method2745("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2104 = this;
            Statics.field1408 = arg0;
            Statics.field1949 = arg1;
            Statics.field2136 = arg2;
            Statics.field1808 = this;
            if (Statics.field1869 == null) {
                Statics.field1869 = new class128();
            }
            Statics.field1869.method2581(this, 1);
        } catch (Exception var5) {
            class140.method2829((String) null, var5);
            this.method2745("crash");
        }
    }

    @ObfuscatedName("eh.qf(I)V")
    public final synchronized void method2710() {
        Container var1 = this.method2763();
        if (Statics.field139 != null) {
            Statics.field139.removeFocusListener(this);
            var1.remove(Statics.field139);
        }
        Statics.field1408 = Math.max(var1.getWidth(), Statics.field49);
        Statics.field1949 = Math.max(var1.getHeight(), Statics.field1483);
        if (Statics.field616 != null) {
            Insets var2 = Statics.field616.getInsets();
            Statics.field1408 -= var2.right + var2.left;
            Statics.field1949 -= var2.top + var2.bottom;
        }
        Statics.field139 = new class131(this);
        var1.add(Statics.field139);
        Statics.field139.setSize(Statics.field1408, Statics.field1949);
        Statics.field139.setVisible(true);
        if (Statics.field616 == var1) {
            Insets var3 = Statics.field616.getInsets();
            Statics.field139.setLocation(field2107 + var3.left, field2108 + var3.top);
        } else {
            Statics.field139.setLocation(field2107, field2108);
        }
        Statics.field139.addFocusListener(this);
        Statics.field139.requestFocus();
        field2109 = true;
        class73 var4 = class73.method1496(Statics.field1408, Statics.field1949, Statics.field139);
        if (Statics.field59 != null) {
            Statics.field59.method1454(var4.field1353.getGraphics(), 0, 0);
        }
        Statics.field59 = var4;
        field2114 = false;
        field2097 = class107.method3364();
    }

    @ObfuscatedName("eh.qm(I)Z")
    public final boolean method2711() {
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
                this.method2745("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2001 != null) {
                String var1 = Statics.field2001.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1999;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2745("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class154.method2513(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class154.method489(var4) && class154.method2139(var4) < 10) {
                            this.method2745("wrongjava");
                            return;
                        }
                    }
                    field2103 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2710();
            this.method173();
            Statics.field622 = class125.method2677();
            label77: while (true) {
                class128 var6;
                Canvas var7;
                do {
                    if (field2099 != 0L && class107.method3364() >= field2099) {
                        break label77;
                    }
                    Statics.field156 = Statics.field622.method2544(field2102, field2103);
                    for (int var5 = 0; var5 < Statics.field156; var5++) {
                        this.method2712();
                    }
                    this.method2713();
                    var6 = Statics.field1869;
                    var7 = Statics.field139;
                } while (var6.field2005 == null);
                for (int var8 = 0; var8 < 50 && var6.field2005.peekEvent() != null; var8++) {
                    class119.method2154(1L);
                }
                if (var7 != null) {
                    var6.field2005.postEvent(new ActionEvent(var7, 1001, "dummy"));
                }
            }
        } catch (Exception var10) {
            class140.method2829((String) null, var10);
            this.method2745("crash");
        }
        this.method2714();
    }

    @ObfuscatedName("eh.qd(I)V")
    public void method2712() {
        long var1 = class107.method3364();
        long var3 = field2113[Statics.field2069];
        field2113[Statics.field2069] = var1;
        Statics.field2069 = Statics.field2069 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1981 = field2106;
        }
        this.method432();
    }

    @ObfuscatedName("eh.qu(B)V")
    public void method2713() {
        Container var1 = this.method2763();
        long var2 = class107.method3364();
        long var4 = field2105[Statics.field31];
        field2105[Statics.field31] = var2;
        Statics.field31 = Statics.field31 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2111 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2110 - 1 > 50) {
            field2110 -= 50;
            field2109 = true;
            Statics.field139.setSize(Statics.field1408, Statics.field1949);
            Statics.field139.setVisible(true);
            if (Statics.field616 == var1) {
                Insets var7 = Statics.field616.getInsets();
                Statics.field139.setLocation(field2107 + var7.left, field2108 + var7.top);
            } else {
                Statics.field139.setLocation(field2107, field2108);
            }
        }
        this.method383();
    }

    @ObfuscatedName("eh.qr(B)V")
    public final synchronized void method2714() {
        if (field2100) {
            return;
        }
        field2100 = true;
        try {
            Statics.field139.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method176();
        } catch (Exception var7) {
        }
        if (Statics.field616 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1869 != null) {
            try {
                Statics.field1869.method2571();
            } catch (Exception var5) {
            }
        }
        this.method170();
    }

    @ObfuscatedName("dg.qx(I)V")
    public static final void method2517() {
        Statics.field622.method2548();
        for (int var0 = 0; var0 < 32; var0++) {
            field2105[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2113[var1] = 0L;
        }
        Statics.field156 = 0;
    }

    public void start() {
        if (field2104 == this && !field2100) {
            field2099 = 0L;
        }
    }

    public void stop() {
        if (field2104 == this && !field2100) {
            field2099 = class107.method3364() + 4000L;
        }
    }

    public void destroy() {
        if (field2104 == this && !field2100) {
            field2099 = class107.method3364();
            class119.method2154(5000L);
            this.method2714();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2104 != this || field2100) {
            return;
        }
        field2109 = true;
        if (Statics.field1999 != null && Statics.field1999.startsWith("1.5") && class107.method3364() - field2097 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1408 && var2.height >= Statics.field1949) {
                field2114 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2106 = true;
        field2109 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2106 = false;
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

    @ObfuscatedName("au.qt(I)V")
    public static final void method878() {
        Statics.field637 = null;
        Statics.field1867 = null;
        Statics.field2197 = null;
    }

    @ObfuscatedName("eh.qy(Ljava/lang/String;I)V")
    public void method2745(String arg0) {
        if (this.field2112) {
            return;
        }
        this.field2112 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("eh.qg(S)Ljava/awt/Container;")
    public Container method2763() {
        return Statics.field616 == null ? this : Statics.field616;
    }

    @ObfuscatedName("eh.qe(I)Ljava/awt/Dimension;")
    public Dimension method2721() {
        Container var1 = this.method2763();
        int var2 = Math.max(var1.getWidth(), Statics.field49);
        int var3 = Math.max(var1.getHeight(), Statics.field1483);
        if (Statics.field616 != null) {
            Insets var4 = Statics.field616.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    @ObfuscatedName("eh.j(I)V")
    public abstract void method173();

    @ObfuscatedName("eh.f(B)V")
    public abstract void method432();

    @ObfuscatedName("eh.b(I)V")
    public abstract void method383();

    @ObfuscatedName("eh.t(I)V")
    public abstract void method176();

    @ObfuscatedName("eh.a(I)V")
    public abstract void method170();

    public abstract void init();
}
