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

@ObfuscatedName("bx")
public abstract class class72 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bx.oz")
    public static class72 field1315 = null;

    @ObfuscatedName("bx.oy")
    public static int field1318 = 0;

    @ObfuscatedName("bx.ou")
    public static long field1305 = 0L;

    @ObfuscatedName("bx.om")
    public static boolean field1303 = false;

    @ObfuscatedName("bx.oq")
    public static int field1308 = 20;

    @ObfuscatedName("bx.ow")
    public static int field1309 = 1;

    @ObfuscatedName("bx.ob")
    public static int field1310 = 0;

    @ObfuscatedName("bx.pa")
    public static long[] field1311 = new long[32];

    @ObfuscatedName("bx.px")
    public static long[] field1306 = new long[32];

    @ObfuscatedName("bx.pg")
    public static volatile boolean field1319 = true;

    @ObfuscatedName("bx.pl")
    public static int field1314 = 500;

    @ObfuscatedName("bx.pz")
    public static volatile boolean field1304 = false;

    @ObfuscatedName("bx.pq")
    public static volatile long field1316 = 0L;

    @ObfuscatedName("bx.pm")
    public static volatile boolean field1317 = true;

    @ObfuscatedName("bx.ot")
    public boolean field1307 = false;

    @ObfuscatedName("bx.nv(IIII)V")
    public final void method1459(int arg0, int arg1, int arg2) {
        try {
            if (field1315 != null) {
                field1318++;
                if (field1318 >= 3) {
                    this.method1465("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1315 = this;
            Statics.field1294 = arg0;
            Statics.field338 = arg1;
            Statics.field1394 = arg2;
            Statics.field1397 = this;
            if (Statics.field108 == null) {
                Statics.field108 = new class73();
            }
            Statics.field108.method1483(this, 1);
        } catch (Exception var5) {
            class79.method1474((String) null, var5);
            this.method1465("crash");
        }
    }

    @ObfuscatedName("bx.no(B)V")
    public final synchronized void method1438() {
        Container var1;
        if (Statics.field938 == null) {
            var1 = this;
        } else {
            var1 = Statics.field938;
        }
        if (Statics.field2431 != null) {
            Statics.field2431.removeFocusListener(this);
            var1.remove(Statics.field2431);
        }
        Statics.field2431 = new class75(this);
        var1.add(Statics.field2431);
        Statics.field2431.setSize(Statics.field1294, Statics.field338);
        Statics.field2431.setVisible(true);
        if (Statics.field938 == null) {
            Statics.field2431.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field938.getInsets();
            Statics.field2431.setLocation(var2.left, var2.top);
        }
        Statics.field2431.addFocusListener(this);
        Statics.field2431.requestFocus();
        field1319 = true;
        field1304 = false;
        field1316 = class120.method2609();
    }

    @ObfuscatedName("bx.nj(B)Z")
    public final boolean method1410() {
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
                this.method1465("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1327 != null) {
                String var1 = Statics.field1327.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1258;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method1465("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && Statics.method47(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class146.method2210(var4)) {
                            int var5 = class146.method808(var4, 10, true);
                            if (var5 < 10) {
                                this.method1465("wrongjava");
                                return;
                            }
                        }
                    }
                    field1309 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1438();
            Statics.field1415 = class84.method1404(Statics.field1294, Statics.field338, Statics.field2431);
            this.method250();
            class67 var6;
            try {
                var6 = new class80();
            } catch (Throwable var13) {
                var6 = new class64();
            }
            Statics.field79 = var6;
            label85: while (true) {
                class73 var9;
                Canvas var10;
                do {
                    if (field1305 != 0L && class120.method2609() >= field1305) {
                        break label85;
                    }
                    Statics.field2014 = Statics.field79.method1334(field1308, field1309);
                    for (int var8 = 0; var8 < Statics.field2014; var8++) {
                        this.method1411();
                    }
                    this.method1412();
                    var9 = Statics.field108;
                    var10 = Statics.field2431;
                } while (var9.field1326 == null);
                for (int var11 = 0; var11 < 50 && var9.field1326.peekEvent() != null; var11++) {
                    class125.method1228(1L);
                }
                if (var10 != null) {
                    var9.field1326.postEvent(new ActionEvent(var10, 1001, "dummy"));
                }
            }
        } catch (Exception var14) {
            class79.method1474((String) null, var14);
            this.method1465("crash");
        }
        this.method1413();
    }

    @ObfuscatedName("bx.nz(I)V")
    public void method1411() {
        long var1 = class120.method2609();
        long var3 = field1306[Statics.field1329];
        field1306[Statics.field1329] = var1;
        Statics.field1329 = Statics.field1329 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1021 = field1317;
        }
        this.method251();
    }

    @ObfuscatedName("bx.ny(B)V")
    public void method1412() {
        long var1 = class120.method2609();
        long var3 = field1311[Statics.field286];
        field1311[Statics.field286] = var1;
        Statics.field286 = Statics.field286 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field1310 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field1314 - 1 > 50) {
            field1314 -= 50;
            field1319 = true;
            Statics.field2431.setSize(Statics.field1294, Statics.field338);
            Statics.field2431.setVisible(true);
            if (Statics.field938 == null) {
                Statics.field2431.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field938.getInsets();
                Statics.field2431.setLocation(var6.left, var6.top);
            }
        }
        this.method324();
    }

    @ObfuscatedName("bx.ng(B)V")
    public final synchronized void method1413() {
        if (field1303) {
            return;
        }
        field1303 = true;
        try {
            Statics.field2431.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method253();
        } catch (Exception var7) {
        }
        if (Statics.field938 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field108 != null) {
            try {
                Statics.field108.method1479();
            } catch (Exception var5) {
            }
        }
        this.method248();
    }

    @ObfuscatedName("z.nr(I)V")
    public static final void method128() {
        Statics.field79.method1333();
        for (int var0 = 0; var0 < 32; var0++) {
            field1311[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field1306[var1] = 0L;
        }
        Statics.field2014 = 0;
    }

    public void start() {
        if (field1315 == this && !field1303) {
            field1305 = 0L;
        }
    }

    public void stop() {
        if (field1315 == this && !field1303) {
            field1305 = class120.method2609() + 4000L;
        }
    }

    public void destroy() {
        if (field1315 == this && !field1303) {
            field1305 = class120.method2609();
            class125.method1228(5000L);
            this.method1413();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1315 != this || field1303) {
            return;
        }
        field1319 = true;
        if (Statics.field1258 != null && Statics.field1258.startsWith("1.5") && class120.method2609() - field1316 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1294 && var2.height >= Statics.field338) {
                field1304 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1317 = true;
        field1319 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1317 = false;
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

    @ObfuscatedName("bx.nq(Ljava/lang/String;B)V")
    public void method1465(String arg0) {
        if (this.field1307) {
            return;
        }
        this.field1307 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bx.l(I)V")
    public abstract void method253();

    @ObfuscatedName("bx.m(I)V")
    public abstract void method248();

    @ObfuscatedName("bx.j(I)V")
    public abstract void method324();

    public abstract void init();

    @ObfuscatedName("bx.g(I)V")
    public abstract void method251();

    @ObfuscatedName("bx.a(I)V")
    public abstract void method250();
}
