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

@ObfuscatedName("be")
public abstract class class72 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("be.oz")
    public static class72 field1309 = null;

    @ObfuscatedName("be.oo")
    public static int field1295 = 0;

    @ObfuscatedName("be.oc")
    public static long field1296 = 0L;

    @ObfuscatedName("be.ow")
    public static boolean field1307 = false;

    @ObfuscatedName("be.oe")
    public static int field1299 = 20;

    @ObfuscatedName("be.ox")
    public static int field1300 = 1;

    @ObfuscatedName("be.ol")
    public static int field1301 = 0;

    @ObfuscatedName("be.ot")
    public static long[] field1302 = new long[32];

    @ObfuscatedName("be.px")
    public static long[] field1294 = new long[32];

    @ObfuscatedName("be.ps")
    public static volatile boolean field1305 = true;

    @ObfuscatedName("be.pl")
    public static int field1303 = 500;

    @ObfuscatedName("be.pp")
    public static volatile boolean field1298 = false;

    @ObfuscatedName("be.pv")
    public static volatile long field1308 = 0L;

    @ObfuscatedName("be.pw")
    public static volatile boolean field1306 = true;

    @ObfuscatedName("be.on")
    public boolean field1312 = false;

    @ObfuscatedName("be.mm(IIII)V")
    public final void method1371(int arg0, int arg1, int arg2) {
        try {
            if (field1309 != null) {
                field1295++;
                if (field1295 >= 3) {
                    this.method1377("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1309 = this;
            Statics.field1405 = arg0;
            Statics.field1323 = arg1;
            Statics.field2763 = arg2;
            Statics.field2651 = this;
            if (Statics.field1010 == null) {
                Statics.field1010 = new class73();
            }
            Statics.field1010.method1438(this, 1);
        } catch (Exception var5) {
            class79.method848((String) null, var5);
            this.method1377("crash");
        }
    }

    @ObfuscatedName("be.mv(B)V")
    public final synchronized void method1382() {
        Container var1;
        if (Statics.field2467 == null) {
            var1 = this;
        } else {
            var1 = Statics.field2467;
        }
        if (Statics.field67 != null) {
            Statics.field67.removeFocusListener(this);
            var1.remove(Statics.field67);
        }
        Statics.field67 = new class75(this);
        var1.add(Statics.field67);
        Statics.field67.setSize(Statics.field1405, Statics.field1323);
        Statics.field67.setVisible(true);
        if (Statics.field2467 == null) {
            Statics.field67.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field2467.getInsets();
            Statics.field67.setLocation(var2.left, var2.top);
        }
        Statics.field67.addFocusListener(this);
        Statics.field67.requestFocus();
        field1305 = true;
        field1298 = false;
        field1308 = class120.method774();
    }

    @ObfuscatedName("be.mg(I)Z")
    public final boolean method1385() {
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
                this.method1377("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1320 != null) {
                String var1 = Statics.field1320.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1324;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method1377("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length(); var3++) {
                            char var4 = var2.charAt(var3);
                            boolean var5 = var4 >= '0' && var4 <= '9';
                            if (!var5) {
                                break;
                            }
                        }
                        String var6 = var2.substring(6, var3);
                        if (class146.method1590(var6) && class146.method2643(var6) < 10) {
                            this.method1377("wrongjava");
                            return;
                        }
                    }
                    field1300 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1382();
            int var7 = Statics.field1405;
            int var8 = Statics.field1323;
            Canvas var9 = Statics.field67;
            class84 var11;
            try {
                class87 var10 = new class87();
                var10.method1534(var7, var8, var9);
                var11 = var10;
            } catch (Throwable var22) {
                class82 var13 = new class82();
                var13.method1534(var7, var8, var9);
                var11 = var13;
            }
            Statics.field1277 = var11;
            this.method251();
            class67 var14;
            try {
                var14 = new class80();
            } catch (Throwable var21) {
                var14 = new class64();
            }
            Statics.field2008 = var14;
            label99: while (true) {
                class73 var17;
                Canvas var18;
                do {
                    if (field1296 != 0L && class120.method774() >= field1296) {
                        break label99;
                    }
                    Statics.field1491 = Statics.field2008.method1299(field1299, field1300);
                    for (int var16 = 0; var16 < Statics.field1491; var16++) {
                        this.method1373();
                    }
                    this.method1374();
                    var17 = Statics.field1010;
                    var18 = Statics.field67;
                } while (var17.field1314 == null);
                for (int var19 = 0; var19 < 50 && var17.field1314.peekEvent() != null; var19++) {
                    class126.method2308(1L);
                }
                if (var18 != null) {
                    var17.field1314.postEvent(new ActionEvent(var18, 1001, "dummy"));
                }
            }
        } catch (Exception var23) {
            class79.method848((String) null, var23);
            this.method1377("crash");
        }
        this.method1370();
    }

    @ObfuscatedName("be.mr(B)V")
    public void method1373() {
        long var1 = class120.method774();
        long var3 = field1294[Statics.field879];
        field1294[Statics.field879] = var1;
        Statics.field879 = Statics.field879 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1029 = field1306;
        }
        this.method301();
    }

    @ObfuscatedName("be.ms(S)V")
    public void method1374() {
        long var1 = class120.method774();
        long var3 = field1302[Statics.field74];
        field1302[Statics.field74] = var1;
        Statics.field74 = Statics.field74 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field1301 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field1303 - 1 > 50) {
            field1303 -= 50;
            field1305 = true;
            Statics.field67.setSize(Statics.field1405, Statics.field1323);
            Statics.field67.setVisible(true);
            if (Statics.field2467 == null) {
                Statics.field67.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field2467.getInsets();
                Statics.field67.setLocation(var6.left, var6.top);
            }
        }
        this.method253();
    }

    @ObfuscatedName("be.nn(I)V")
    public final synchronized void method1370() {
        if (field1307) {
            return;
        }
        field1307 = true;
        try {
            Statics.field67.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method314();
        } catch (Exception var7) {
        }
        if (Statics.field2467 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1010 != null) {
            try {
                Statics.field1010.method1435();
            } catch (Exception var5) {
            }
        }
        this.method249();
    }

    @ObfuscatedName("dt.nx(B)V")
    public static final void method2113() {
        Statics.field2008.method1298();
        for (int var0 = 0; var0 < 32; var0++) {
            field1302[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field1294[var1] = 0L;
        }
        Statics.field1491 = 0;
    }

    public void start() {
        if (field1309 == this && !field1307) {
            field1296 = 0L;
        }
    }

    public void stop() {
        if (field1309 == this && !field1307) {
            field1296 = class120.method774() + 4000L;
        }
    }

    public void destroy() {
        if (field1309 == this && !field1307) {
            field1296 = class120.method774();
            class126.method2308(5000L);
            this.method1370();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1309 != this || field1307) {
            return;
        }
        field1305 = true;
        if (Statics.field1324 != null && Statics.field1324.startsWith("1.5") && class120.method774() - field1308 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1405 && var2.height >= Statics.field1323) {
                field1298 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1306 = true;
        field1305 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1306 = false;
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

    @ObfuscatedName("be.nc(Ljava/lang/String;I)V")
    public void method1377(String arg0) {
        if (this.field1312) {
            return;
        }
        this.field1312 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("be.e(B)V")
    public abstract void method301();

    @ObfuscatedName("be.m(I)V")
    public abstract void method253();

    @ObfuscatedName("be.s(B)V")
    public abstract void method314();

    @ObfuscatedName("be.f(I)V")
    public abstract void method249();

    public abstract void init();

    @ObfuscatedName("be.x(B)V")
    public abstract void method251();
}
