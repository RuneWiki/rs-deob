package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;

@ObfuscatedName("em")
public abstract class class133 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("em.ot")
    public static class133 field2060 = null;

    @ObfuscatedName("em.oe")
    public static int field2051 = 0;

    @ObfuscatedName("em.pf")
    public static long field2052 = 0L;

    @ObfuscatedName("em.pn")
    public static boolean field2057 = false;

    @ObfuscatedName("em.ph")
    public static int field2055 = 20;

    @ObfuscatedName("em.pl")
    public static int field2061 = 1;

    @ObfuscatedName("em.pz")
    public static int field2050 = 0;

    @ObfuscatedName("em.pj")
    public static long[] field2058 = new long[32];

    @ObfuscatedName("em.pc")
    public static long[] field2059 = new long[32];

    @ObfuscatedName("em.px")
    public static volatile boolean field2053 = true;

    @ObfuscatedName("em.pr")
    public static int field2062 = 500;

    @ObfuscatedName("em.po")
    public static volatile boolean field2063 = false;

    @ObfuscatedName("em.pd")
    public static volatile long field2064 = 0L;

    @ObfuscatedName("em.pq")
    public static volatile boolean field2065 = true;

    @ObfuscatedName("em.pk")
    public boolean field2054 = false;

    @ObfuscatedName("em.oj(IIII)V")
    public final void method2614(int arg0, int arg1, int arg2) {
        try {
            if (field2060 != null) {
                field2051++;
                if (field2051 >= 3) {
                    this.method2621("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2060 = this;
            Statics.field1445 = arg0;
            Statics.field1116 = arg1;
            Statics.field2083 = arg2;
            Statics.field2084 = this;
            if (Statics.field2056 == null) {
                Statics.field2056 = new class125();
            }
            Statics.field2056.method2487(this, 1);
        } catch (Exception var5) {
            class137.method101((String) null, var5);
            this.method2621("crash");
        }
    }

    @ObfuscatedName("em.or(B)V")
    public final synchronized void method2615() {
        Container var1;
        if (Statics.field1083 == null) {
            var1 = this;
        } else {
            var1 = Statics.field1083;
        }
        if (Statics.field2154 != null) {
            Statics.field2154.removeFocusListener(this);
            var1.remove(Statics.field2154);
        }
        Statics.field2154 = new class128(this);
        var1.add(Statics.field2154);
        Statics.field2154.setSize(Statics.field1445, Statics.field1116);
        Statics.field2154.setVisible(true);
        if (Statics.field1083 == null) {
            Statics.field2154.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field1083.getInsets();
            Statics.field2154.setLocation(var2.left, var2.top);
        }
        Statics.field2154.addFocusListener(this);
        Statics.field2154.requestFocus();
        field2053 = true;
        field2063 = false;
        field2064 = class104.method567();
    }

    @ObfuscatedName("em.oo(B)Z")
    public final boolean method2619() {
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
                this.method2621("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1944 != null) {
                String var1 = Statics.field1944.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1943;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2621("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class211.method2541(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class211.method1593(var4) && class211.method3149(var4) < 10) {
                            this.method2621("wrongjava");
                            return;
                        }
                    }
                    field2061 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2615();
            int var5 = Statics.field1445;
            int var6 = Statics.field1116;
            Canvas var7 = Statics.field2154;
            class72 var9;
            try {
                class76 var8 = new class76();
                var8.method1356(var5, var6, var7);
                var9 = var8;
            } catch (Throwable var17) {
                class70 var11 = new class70();
                var11.method1356(var5, var6, var7);
                var9 = var11;
            }
            Statics.field1877 = var9;
            this.method160();
            class122 var12;
            try {
                var12 = new class136();
            } catch (Throwable var16) {
                var12 = new class130();
            }
            Statics.field646 = var12;
            while (field2052 == 0L || class104.method567() < field2052) {
                Statics.field930 = Statics.field646.method2461(field2055, field2061);
                for (int var14 = 0; var14 < Statics.field930; var14++) {
                    this.method2617();
                }
                this.method2659();
                class131.method1381(Statics.field2056, Statics.field2154);
            }
        } catch (Exception var18) {
            class137.method101((String) null, var18);
            this.method2621("crash");
        }
        this.method2664();
    }

    @ObfuscatedName("em.om(I)V")
    public void method2617() {
        long var1 = class104.method567();
        long var3 = field2059[Statics.field1471];
        field2059[Statics.field1471] = var1;
        Statics.field1471 = Statics.field1471 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field53 = field2065;
        }
        this.method203();
    }

    @ObfuscatedName("em.ok(I)V")
    public void method2659() {
        long var1 = class104.method567();
        long var3 = field2058[Statics.field1917];
        field2058[Statics.field1917] = var1;
        Statics.field1917 = Statics.field1917 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field2050 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field2062 - 1 > 50) {
            field2062 -= 50;
            field2053 = true;
            Statics.field2154.setSize(Statics.field1445, Statics.field1116);
            Statics.field2154.setVisible(true);
            if (Statics.field1083 == null) {
                Statics.field2154.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field1083.getInsets();
                Statics.field2154.setLocation(var6.left, var6.top);
            }
        }
        this.method162();
    }

    @ObfuscatedName("em.oh(I)V")
    public final synchronized void method2664() {
        if (field2057) {
            return;
        }
        field2057 = true;
        try {
            Statics.field2154.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method352();
        } catch (Exception var7) {
        }
        if (Statics.field1083 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field2056 != null) {
            try {
                Statics.field2056.method2484();
            } catch (Exception var5) {
            }
        }
        this.method157();
    }

    public void start() {
        if (field2060 == this && !field2057) {
            field2052 = 0L;
        }
    }

    public void stop() {
        if (field2060 == this && !field2057) {
            field2052 = class104.method567() + 4000L;
        }
    }

    public void destroy() {
        if (field2060 == this && !field2057) {
            field2052 = class104.method567();
            class116.method7(5000L);
            this.method2664();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2060 != this || field2057) {
            return;
        }
        field2053 = true;
        if (Statics.field1943 != null && Statics.field1943.startsWith("1.5") && class104.method567() - field2064 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1445 && var2.height >= Statics.field1116) {
                field2063 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2065 = true;
        field2053 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2065 = false;
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

    @ObfuscatedName("em.oa(Ljava/lang/String;I)V")
    public void method2621(String arg0) {
        if (this.field2054) {
            return;
        }
        this.field2054 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("em.g(I)V")
    public abstract void method157();

    @ObfuscatedName("em.l(S)V")
    public abstract void method160();

    @ObfuscatedName("em.a(I)V")
    public abstract void method203();

    public abstract void init();

    @ObfuscatedName("em.z(I)V")
    public abstract void method352();

    @ObfuscatedName("em.b(I)V")
    public abstract void method162();
}
