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
public abstract class class136 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("eb.ph")
    public static class136 field2100 = null;

    @ObfuscatedName("eb.pa")
    public static int field2095 = 0;

    @ObfuscatedName("eb.pf")
    public static long field2091 = 0L;

    @ObfuscatedName("eb.pd")
    public static boolean field2092 = false;

    @ObfuscatedName("eb.pt")
    public static int field2094 = 20;

    @ObfuscatedName("eb.pp")
    public static int field2102 = 1;

    @ObfuscatedName("eb.qa")
    public static int field2096 = 0;

    @ObfuscatedName("eb.qf")
    public static long[] field2097 = new long[32];

    @ObfuscatedName("eb.qy")
    public static long[] field2099 = new long[32];

    @ObfuscatedName("eb.qr")
    public static int field2109 = 0;

    @ObfuscatedName("eb.qq")
    public static int field2090 = 0;

    @ObfuscatedName("eb.qd")
    public static volatile boolean field2089 = true;

    @ObfuscatedName("eb.qi")
    public static int field2103 = 500;

    @ObfuscatedName("eb.qc")
    public static boolean field2104 = false;

    @ObfuscatedName("eb.qz")
    public static volatile boolean field2105 = false;

    @ObfuscatedName("eb.qo")
    public static volatile long field2106 = 0L;

    @ObfuscatedName("eb.ru")
    public static volatile boolean field2098 = true;

    @ObfuscatedName("eb.py")
    public boolean field2093 = false;

    @ObfuscatedName("eb.qq(IIII)V")
    public final void method2678(int arg0, int arg1, int arg2) {
        try {
            if (field2100 != null) {
                field2095++;
                if (field2095 >= 3) {
                    this.method2629("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2100 = this;
            Statics.field56 = arg0;
            Statics.field2528 = arg1;
            Statics.field2124 = arg2;
            Statics.field2127 = this;
            if (Statics.field808 == null) {
                Statics.field808 = new class128();
            }
            Statics.field808.method2507(this, 1);
        } catch (Exception var5) {
            class140.method2489((String) null, var5);
            this.method2629("crash");
        }
    }

    @ObfuscatedName("eb.qn(I)V")
    public final synchronized void method2627() {
        Container var1 = this.method2630();
        if (Statics.field1328 != null) {
            Statics.field1328.removeFocusListener(this);
            var1.remove(Statics.field1328);
        }
        Statics.field56 = Math.max(var1.getWidth(), Statics.field646);
        Statics.field2528 = Math.max(var1.getHeight(), Statics.field1709);
        if (Statics.field1855 != null) {
            Insets var2 = Statics.field1855.getInsets();
            Statics.field56 -= var2.right + var2.left;
            Statics.field2528 -= var2.top + var2.bottom;
        }
        Statics.field1328 = new class131(this);
        var1.add(Statics.field1328);
        Statics.field1328.setSize(Statics.field56, Statics.field2528);
        Statics.field1328.setVisible(true);
        if (Statics.field1855 == var1) {
            Insets var3 = Statics.field1855.getInsets();
            Statics.field1328.setLocation(field2109 + var3.left, field2090 + var3.top);
        } else {
            Statics.field1328.setLocation(field2109, field2090);
        }
        Statics.field1328.addFocusListener(this);
        Statics.field1328.requestFocus();
        field2089 = true;
        class73 var4 = class73.method5(Statics.field56, Statics.field2528, Statics.field1328);
        if (Statics.field797 != null) {
            Statics.field797.method1346(var4.field1330.getGraphics(), 0, 0);
        }
        Statics.field797 = var4;
        field2105 = false;
        field2106 = class107.method3468();
    }

    @ObfuscatedName("eb.qv(I)Z")
    public final boolean method2658() {
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
                this.method2629("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1997 != null) {
                String var1 = Statics.field1997.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1994;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2629("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class154.method1861(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class154.method2754(var4)) {
                            int var5 = class154.method2535(var4, 10, true);
                            if (var5 < 10) {
                                this.method2629("wrongjava");
                                return;
                            }
                        }
                    }
                    field2102 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2627();
            this.method191();
            class125 var6;
            try {
                var6 = new class139();
            } catch (Throwable var13) {
                var6 = new class133();
            }
            Statics.field1565 = var6;
            label85: while (true) {
                class128 var9;
                Canvas var10;
                do {
                    if (field2091 != 0L && class107.method3468() >= field2091) {
                        break label85;
                    }
                    Statics.field948 = Statics.field1565.method2475(field2094, field2102);
                    for (int var8 = 0; var8 < Statics.field948; var8++) {
                        this.method2622();
                    }
                    this.method2647();
                    var9 = Statics.field808;
                    var10 = Statics.field1328;
                } while (var9.field1999 == null);
                for (int var11 = 0; var11 < 50 && var9.field1999.peekEvent() != null; var11++) {
                    class119.method555(1L);
                }
                if (var10 != null) {
                    var9.field1999.postEvent(new ActionEvent(var10, 1001, "dummy"));
                }
            }
        } catch (Exception var14) {
            class140.method2489((String) null, var14);
            this.method2629("crash");
        }
        this.method2637();
    }

    @ObfuscatedName("eb.qm(B)V")
    public void method2622() {
        long var1 = class107.method3468();
        long var3 = field2099[Statics.field1085];
        field2099[Statics.field1085] = var1;
        Statics.field1085 = Statics.field1085 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1003 = field2098;
        }
        this.method227();
    }

    @ObfuscatedName("eb.qt(I)V")
    public void method2647() {
        Container var1 = this.method2630();
        long var2 = class107.method3468();
        long var4 = field2097[Statics.field1546];
        field2097[Statics.field1546] = var2;
        Statics.field1546 = Statics.field1546 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2096 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2103 - 1 > 50) {
            field2103 -= 50;
            field2089 = true;
            Statics.field1328.setSize(Statics.field56, Statics.field2528);
            Statics.field1328.setVisible(true);
            if (Statics.field1855 == var1) {
                Insets var7 = Statics.field1855.getInsets();
                Statics.field1328.setLocation(field2109 + var7.left, field2090 + var7.top);
            } else {
                Statics.field1328.setLocation(field2109, field2090);
            }
        }
        this.method193();
    }

    @ObfuscatedName("eb.qj(B)V")
    public final synchronized void method2637() {
        if (field2092) {
            return;
        }
        field2092 = true;
        try {
            Statics.field1328.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method194();
        } catch (Exception var7) {
        }
        if (Statics.field1855 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field808 != null) {
            try {
                Statics.field808.method2496();
            } catch (Exception var5) {
            }
        }
        this.method188();
    }

    public void start() {
        if (field2100 == this && !field2092) {
            field2091 = 0L;
        }
    }

    public void stop() {
        if (field2100 == this && !field2092) {
            field2091 = class107.method3468() + 4000L;
        }
    }

    public void destroy() {
        if (field2100 == this && !field2092) {
            field2091 = class107.method3468();
            class119.method555(5000L);
            this.method2637();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2100 != this || field2092) {
            return;
        }
        field2089 = true;
        if (Statics.field1994 != null && Statics.field1994.startsWith("1.5") && class107.method3468() - field2106 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field56 && var2.height >= Statics.field2528) {
                field2105 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2098 = true;
        field2089 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2098 = false;
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

    @ObfuscatedName("eb.qu(Ljava/lang/String;I)V")
    public void method2629(String arg0) {
        if (this.field2093) {
            return;
        }
        this.field2093 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("eb.qp(I)Ljava/awt/Container;")
    public Container method2630() {
        return Statics.field1855 == null ? this : Statics.field1855;
    }

    @ObfuscatedName("eb.qg(I)Ljava/awt/Dimension;")
    public Dimension method2631() {
        Container var1 = this.method2630();
        int var2 = Math.max(var1.getWidth(), Statics.field646);
        int var3 = Math.max(var1.getHeight(), Statics.field1709);
        if (Statics.field1855 != null) {
            Insets var4 = Statics.field1855.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    @ObfuscatedName("eb.o(B)V")
    public abstract void method194();

    public abstract void init();

    @ObfuscatedName("eb.l(I)V")
    public abstract void method227();

    @ObfuscatedName("eb.a(B)V")
    public abstract void method188();

    @ObfuscatedName("eb.p(I)V")
    public abstract void method191();

    @ObfuscatedName("eb.u(I)V")
    public abstract void method193();
}
