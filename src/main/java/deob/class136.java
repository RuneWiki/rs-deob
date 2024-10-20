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

@ObfuscatedName("ep")
public abstract class class136 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ep.ps")
    public static class136 field2046 = null;

    @ObfuscatedName("ep.pc")
    public static int field2041 = 0;

    @ObfuscatedName("ep.ph")
    public static long field2051 = 0L;

    @ObfuscatedName("ep.pj")
    public static boolean field2052 = false;

    @ObfuscatedName("ep.pk")
    public static int field2045 = 20;

    @ObfuscatedName("ep.pf")
    public static int field2048 = 1;

    @ObfuscatedName("ep.pu")
    public static int field2047 = 0;

    @ObfuscatedName("ep.pp")
    public static long[] field2042 = new long[32];

    @ObfuscatedName("ep.pi")
    public static long[] field2049 = new long[32];

    @ObfuscatedName("ep.pt")
    public static volatile boolean field2055 = true;

    @ObfuscatedName("ep.px")
    public static int field2040 = 500;

    @ObfuscatedName("ep.pg")
    public static volatile boolean field2053 = false;

    @ObfuscatedName("ep.qc")
    public static volatile long field2054 = 0L;

    @ObfuscatedName("ep.qi")
    public static volatile boolean field2044 = true;

    @ObfuscatedName("ep.pl")
    public boolean field2043 = false;

    @ObfuscatedName("ep.pb(IIII)V")
    public final void method2612(int arg0, int arg1, int arg2) {
        try {
            if (field2046 != null) {
                field2041++;
                if (field2041 >= 3) {
                    this.method2620("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2046 = this;
            Statics.field558 = arg0;
            Statics.field1800 = arg1;
            Statics.field2075 = arg2;
            Statics.field2071 = this;
            if (Statics.field925 == null) {
                Statics.field925 = new class128();
            }
            Statics.field925.method2501(this, 1);
        } catch (Exception var5) {
            class140.method1379((String) null, var5);
            this.method2620("crash");
        }
    }

    @ObfuscatedName("ep.pm(B)V")
    public final synchronized void method2613() {
        Container var1;
        if (Statics.field68 == null) {
            var1 = this;
        } else {
            var1 = Statics.field68;
        }
        if (Statics.field1563 != null) {
            Statics.field1563.removeFocusListener(this);
            var1.remove(Statics.field1563);
        }
        Statics.field1563 = new class131(this);
        var1.add(Statics.field1563);
        Statics.field1563.setSize(Statics.field558, Statics.field1800);
        Statics.field1563.setVisible(true);
        if (Statics.field68 == null) {
            Statics.field1563.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field68.getInsets();
            Statics.field1563.setLocation(var2.left, var2.top);
        }
        Statics.field1563.addFocusListener(this);
        Statics.field1563.requestFocus();
        field2055 = true;
        field2053 = false;
        field2054 = class107.method2434();
    }

    @ObfuscatedName("ep.pp(I)Z")
    public final boolean method2634() {
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
                this.method2620("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1947 != null) {
                String var1 = Statics.field1947.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1950;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2620("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class154.method1889(var2.charAt(var3)); var3++) {
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
                                int var31;
                                if (var10 >= '0' && var10 <= '9') {
                                    var31 = var10 - '0';
                                } else if (var10 >= 'A' && var10 <= 'Z') {
                                    var31 = var10 - '7';
                                } else {
                                    if (var10 < 'a' || var10 > 'z') {
                                        var11 = false;
                                        break;
                                    }
                                    var31 = var10 - 'W';
                                }
                                if (var31 >= 10) {
                                    var11 = false;
                                    break;
                                }
                                if (var5) {
                                    var31 = -var31;
                                }
                                int var12 = var7 * 10 + var31;
                                if (var12 / 10 != var7) {
                                    var11 = false;
                                    break;
                                }
                                var7 = var12;
                                var6 = true;
                            }
                            var9++;
                        }
                        if (var11 && class154.method131(var4) < 10) {
                            this.method2620("wrongjava");
                            return;
                        }
                    }
                    field2048 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2613();
            int var14 = Statics.field558;
            int var15 = Statics.field1800;
            Canvas var16 = Statics.field1563;
            class73 var18;
            try {
                class77 var17 = new class77();
                var17.method1356(var14, var15, var16);
                var18 = var17;
            } catch (Throwable var29) {
                class71 var20 = new class71();
                var20.method1356(var14, var15, var16);
                var18 = var20;
            }
            Statics.field2050 = var18;
            this.method175();
            class125 var21;
            try {
                var21 = new class139();
            } catch (Throwable var28) {
                var21 = new class133();
            }
            Statics.field1347 = var21;
            label120: while (true) {
                class128 var24;
                Canvas var25;
                do {
                    if (field2051 != 0L && class107.method2434() >= field2051) {
                        break label120;
                    }
                    Statics.field1684 = Statics.field1347.method2475(field2045, field2048);
                    for (int var23 = 0; var23 < Statics.field1684; var23++) {
                        this.method2619();
                    }
                    this.method2626();
                    var24 = Statics.field925;
                    var25 = Statics.field1563;
                } while (var24.field1952 == null);
                for (int var26 = 0; var26 < 50 && var24.field1952.peekEvent() != null; var26++) {
                    class119.method587(1L);
                }
                if (var25 != null) {
                    var24.field1952.postEvent(new ActionEvent(var25, 1001, "dummy"));
                }
            }
        } catch (Exception var30) {
            class140.method1379((String) null, var30);
            this.method2620("crash");
        }
        this.method2632();
    }

    @ObfuscatedName("ep.pw(I)V")
    public void method2619() {
        long var1 = class107.method2434();
        long var3 = field2049[Statics.field1903];
        field2049[Statics.field1903] = var1;
        Statics.field1903 = Statics.field1903 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field2554 = field2044;
        }
        this.method176();
    }

    @ObfuscatedName("ep.pi(B)V")
    public void method2626() {
        long var1 = class107.method2434();
        long var3 = field2042[Statics.field2428];
        field2042[Statics.field2428] = var1;
        Statics.field2428 = Statics.field2428 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field2047 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field2040 - 1 > 50) {
            field2040 -= 50;
            field2055 = true;
            Statics.field1563.setSize(Statics.field558, Statics.field1800);
            Statics.field1563.setVisible(true);
            if (Statics.field68 == null) {
                Statics.field1563.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field68.getInsets();
                Statics.field1563.setLocation(var6.left, var6.top);
            }
        }
        this.method177();
    }

    @ObfuscatedName("ep.py(I)V")
    public final synchronized void method2632() {
        if (field2052) {
            return;
        }
        field2052 = true;
        try {
            Statics.field1563.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method178();
        } catch (Exception var7) {
        }
        if (Statics.field68 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field925 != null) {
            try {
                Statics.field925.method2497();
            } catch (Exception var5) {
            }
        }
        this.method173();
    }

    @ObfuscatedName("al.pz(I)V")
    public static final void method631() {
        Statics.field1347.method2471();
        for (int var0 = 0; var0 < 32; var0++) {
            field2042[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2049[var1] = 0L;
        }
        Statics.field1684 = 0;
    }

    public void start() {
        if (field2046 == this && !field2052) {
            field2051 = 0L;
        }
    }

    public void stop() {
        if (field2046 == this && !field2052) {
            field2051 = class107.method2434() + 4000L;
        }
    }

    public void destroy() {
        if (field2046 == this && !field2052) {
            field2051 = class107.method2434();
            class119.method587(5000L);
            this.method2632();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2046 != this || field2052) {
            return;
        }
        field2055 = true;
        if (Statics.field1950 != null && Statics.field1950.startsWith("1.5") && class107.method2434() - field2054 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field558 && var2.height >= Statics.field1800) {
                field2053 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2044 = true;
        field2055 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2044 = false;
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

    @ObfuscatedName("ep.pe(Ljava/lang/String;S)V")
    public void method2620(String arg0) {
        if (this.field2043) {
            return;
        }
        this.field2043 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ep.n(I)V")
    public abstract void method173();

    public abstract void init();

    @ObfuscatedName("ep.o(I)V")
    public abstract void method176();

    @ObfuscatedName("ep.p(S)V")
    public abstract void method178();

    @ObfuscatedName("ep.k(I)V")
    public abstract void method177();

    @ObfuscatedName("ep.m(I)V")
    public abstract void method175();
}
