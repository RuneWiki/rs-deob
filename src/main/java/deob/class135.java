package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;

@ObfuscatedName("ee")
public abstract class class135 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ee.pg")
    public static class135 field2058 = null;

    @ObfuscatedName("ee.pj")
    public static int field2064 = 0;

    @ObfuscatedName("ee.pi")
    public static long field2060 = 0L;

    @ObfuscatedName("ee.pt")
    public static boolean field2057 = false;

    @ObfuscatedName("ee.pp")
    public static int field2059 = 20;

    @ObfuscatedName("ee.pz")
    public static int field2055 = 1;

    @ObfuscatedName("ee.px")
    public static int field2061 = 0;

    @ObfuscatedName("ee.pe")
    public static long[] field2062 = new long[32];

    @ObfuscatedName("ee.pw")
    public static long[] field2063 = new long[32];

    @ObfuscatedName("ee.pu")
    public static volatile boolean field2054 = true;

    @ObfuscatedName("ee.pf")
    public static int field2065 = 500;

    @ObfuscatedName("ee.pa")
    public static volatile boolean field2056 = false;

    @ObfuscatedName("ee.ql")
    public static volatile long field2067 = 0L;

    @ObfuscatedName("ee.qj")
    public static volatile boolean field2068 = true;

    @ObfuscatedName("ee.pl")
    public boolean field2066 = false;

    @ObfuscatedName("ee.qn(IIII)V")
    public final void method2688(int arg0, int arg1, int arg2) {
        try {
            if (field2058 != null) {
                field2064++;
                if (field2064 >= 3) {
                    this.method2632("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2058 = this;
            Statics.field1517 = arg0;
            Statics.field2508 = arg1;
            Statics.field2082 = arg2;
            Statics.field2089 = this;
            if (Statics.field1115 == null) {
                Statics.field1115 = new class127();
            }
            Statics.field1115.method2500(this, 1);
        } catch (Exception var5) {
            class139.method2074((String) null, var5);
            this.method2632("crash");
        }
    }

    @ObfuscatedName("ee.qe(I)V")
    public final synchronized void method2624() {
        Container var1;
        if (Statics.field228 == null) {
            var1 = this;
        } else {
            var1 = Statics.field228;
        }
        if (Statics.field877 != null) {
            Statics.field877.removeFocusListener(this);
            var1.remove(Statics.field877);
        }
        Statics.field877 = new class130(this);
        var1.add(Statics.field877);
        Statics.field877.setSize(Statics.field1517, Statics.field2508);
        Statics.field877.setVisible(true);
        if (Statics.field228 == null) {
            Statics.field877.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field228.getInsets();
            Statics.field877.setLocation(var2.left, var2.top);
        }
        Statics.field877.addFocusListener(this);
        Statics.field877.requestFocus();
        field2054 = true;
        field2056 = false;
        field2067 = class106.method870();
    }

    @ObfuscatedName("ee.qd(I)Z")
    public final boolean method2625() {
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
                this.method2632("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1756 != null) {
                String var1 = Statics.field1756.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field3045;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2632("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class213.method1982(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        boolean var5 = false;
                        boolean var6 = false;
                        int var7 = 0;
                        int var8 = var4.length();
                        int var9 = 0;
                        boolean var11;
                        while (true) {
                            if (var9 >= var8) {
                                var11 = var6;
                                break;
                            }
                            label201: {
                                char var10 = var4.charAt(var9);
                                if (var9 == 0) {
                                    if (var10 == '-') {
                                        var5 = true;
                                        break label201;
                                    }
                                    if (var10 == '+') {
                                        break label201;
                                    }
                                }
                                int var32;
                                if (var10 >= '0' && var10 <= '9') {
                                    var32 = var10 - '0';
                                } else if (var10 >= 'A' && var10 <= 'Z') {
                                    var32 = var10 - '7';
                                } else {
                                    if (var10 < 'a' || var10 > 'z') {
                                        var11 = false;
                                        break;
                                    }
                                    var32 = var10 - 'W';
                                }
                                if (var32 >= 10) {
                                    var11 = false;
                                    break;
                                }
                                if (var5) {
                                    var32 = -var32;
                                }
                                int var12 = var7 * 10 + var32;
                                if (var12 / 10 != var7) {
                                    var11 = false;
                                    break;
                                }
                                var7 = var12;
                                var6 = true;
                            }
                            var9++;
                        }
                        if (var11) {
                            int var14 = class213.method2826(var4, 10, true);
                            if (var14 < 10) {
                                this.method2632("wrongjava");
                                return;
                            }
                        }
                    }
                    field2055 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2624();
            int var15 = Statics.field1517;
            int var16 = Statics.field2508;
            Canvas var17 = Statics.field877;
            class72 var19;
            try {
                class76 var18 = new class76();
                var18.method1399(var15, var16, var17);
                var19 = var18;
            } catch (Throwable var30) {
                class70 var21 = new class70();
                var21.method1399(var15, var16, var17);
                var19 = var21;
            }
            Statics.field1994 = var19;
            this.method177();
            class124 var22;
            try {
                var22 = new class138();
            } catch (Throwable var29) {
                var22 = new class132();
            }
            Statics.field626 = var22;
            label120: while (true) {
                class127 var25;
                Canvas var26;
                do {
                    if (field2060 != 0L && class106.method870() >= field2060) {
                        break label120;
                    }
                    Statics.field183 = Statics.field626.method2460(field2059, field2055);
                    for (int var24 = 0; var24 < Statics.field183; var24++) {
                        this.method2626();
                    }
                    this.method2627();
                    var25 = Statics.field1115;
                    var26 = Statics.field877;
                } while (var25.field1950 == null);
                for (int var27 = 0; var27 < 50 && var25.field1950.peekEvent() != null; var27++) {
                    class118.method1901(1L);
                }
                if (var26 != null) {
                    var25.field1950.postEvent(new ActionEvent(var26, 1001, "dummy"));
                }
            }
        } catch (Exception var31) {
            class139.method2074((String) null, var31);
            this.method2632("crash");
        }
        this.method2628();
    }

    @ObfuscatedName("ee.qh(I)V")
    public void method2626() {
        long var1 = class106.method870();
        long var3 = field2063[Statics.field1904];
        field2063[Statics.field1904] = var1;
        Statics.field1904 = Statics.field1904 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1413 = field2068;
        }
        this.method178();
    }

    @ObfuscatedName("ee.qy(I)V")
    public void method2627() {
        long var1 = class106.method870();
        long var3 = field2062[Statics.field1875];
        field2062[Statics.field1875] = var1;
        Statics.field1875 = Statics.field1875 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field2061 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field2065 - 1 > 50) {
            field2065 -= 50;
            field2054 = true;
            Statics.field877.setSize(Statics.field1517, Statics.field2508);
            Statics.field877.setVisible(true);
            if (Statics.field228 == null) {
                Statics.field877.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field228.getInsets();
                Statics.field877.setLocation(var6.left, var6.top);
            }
        }
        this.method313();
    }

    @ObfuscatedName("ee.qt(I)V")
    public final synchronized void method2628() {
        if (field2057) {
            return;
        }
        field2057 = true;
        try {
            Statics.field877.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method180();
        } catch (Exception var7) {
        }
        if (Statics.field228 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1115 != null) {
            try {
                Statics.field1115.method2484();
            } catch (Exception var5) {
            }
        }
        this.method174();
    }

    public void start() {
        if (field2058 == this && !field2057) {
            field2060 = 0L;
        }
    }

    public void stop() {
        if (field2058 == this && !field2057) {
            field2060 = class106.method870() + 4000L;
        }
    }

    public void destroy() {
        if (field2058 == this && !field2057) {
            field2060 = class106.method870();
            class118.method1901(5000L);
            this.method2628();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2058 != this || field2057) {
            return;
        }
        field2054 = true;
        if (Statics.field3045 != null && Statics.field3045.startsWith("1.5") && class106.method870() - field2067 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1517 && var2.height >= Statics.field2508) {
                field2056 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2068 = true;
        field2054 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2068 = false;
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

    @ObfuscatedName("ee.qz(Ljava/lang/String;I)V")
    public void method2632(String arg0) {
        if (this.field2066) {
            return;
        }
        this.field2066 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    public abstract void init();

    @ObfuscatedName("ee.r(S)V")
    public abstract void method174();

    @ObfuscatedName("ee.o(I)V")
    public abstract void method177();

    @ObfuscatedName("ee.k(B)V")
    public abstract void method178();

    @ObfuscatedName("ee.s(I)V")
    public abstract void method313();

    @ObfuscatedName("ee.h(I)V")
    public abstract void method180();
}
