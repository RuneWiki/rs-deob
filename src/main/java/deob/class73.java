package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.net.URL;

@ObfuscatedName("bo")
public abstract class class73 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bo.od")
    public static class73 field1285 = null;

    @ObfuscatedName("bo.ot")
    public static int field1288 = 0;

    @ObfuscatedName("bo.og")
    public static long field1287 = 0L;

    @ObfuscatedName("bo.oy")
    public static boolean field1298 = false;

    @ObfuscatedName("bo.oe")
    public static int field1290 = 20;

    @ObfuscatedName("bo.oh")
    public static int field1291 = 1;

    @ObfuscatedName("bo.oa")
    public static int field1292 = 0;

    @ObfuscatedName("bo.pa")
    public static long[] field1297 = new long[32];

    @ObfuscatedName("bo.pb")
    public static long[] field1296 = new long[32];

    @ObfuscatedName("bo.pr")
    public static volatile boolean field1295 = true;

    @ObfuscatedName("bo.pu")
    public static int field1284 = 500;

    @ObfuscatedName("bo.px")
    public static volatile boolean field1294 = false;

    @ObfuscatedName("bo.pe")
    public static volatile long field1286 = 0L;

    @ObfuscatedName("bo.pm")
    public static volatile boolean field1299 = true;

    @ObfuscatedName("bo.oq")
    public boolean field1289 = false;

    @ObfuscatedName("bo.na(IIII)V")
    public final void method1396(int arg0, int arg1, int arg2) {
        try {
            if (field1285 != null) {
                field1288++;
                if (field1288 >= 3) {
                    this.method1405("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1285 = this;
            Statics.field1237 = arg0;
            Statics.field14 = arg1;
            Statics.field1388 = arg2;
            Statics.field1395 = this;
            if (Statics.field1301 == null) {
                Statics.field1301 = new class74();
            }
            Statics.field1301.method1458(this, 1);
        } catch (Exception var5) {
            class80.method2341((String) null, var5);
            this.method1405("crash");
        }
    }

    @ObfuscatedName("bo.nf(S)V")
    public final synchronized void method1401() {
        Container var1;
        if (Statics.field331 == null) {
            var1 = this;
        } else {
            var1 = Statics.field331;
        }
        if (Statics.field831 != null) {
            Statics.field831.removeFocusListener(this);
            var1.remove(Statics.field831);
        }
        Statics.field831 = new class76(this);
        var1.add(Statics.field831);
        Statics.field831.setSize(Statics.field1237, Statics.field14);
        Statics.field831.setVisible(true);
        if (Statics.field331 == null) {
            Statics.field831.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field331.getInsets();
            Statics.field831.setLocation(var2.left, var2.top);
        }
        Statics.field831.addFocusListener(this);
        Statics.field831.requestFocus();
        field1295 = true;
        field1294 = false;
        field1286 = class121.method2636();
    }

    @ObfuscatedName("bo.nt(I)Z")
    public final boolean method1437() {
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
                this.method1405("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1311 != null) {
                String var1 = Statics.field1311.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2299;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method1405("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class147.method2171(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class147.method3038(var4)) {
                            int var5 = class147.method2168(var4, 10, true);
                            if (var5 < 10) {
                                this.method1405("wrongjava");
                                return;
                            }
                        }
                    }
                    field1291 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1401();
            int var6 = Statics.field1237;
            int var7 = Statics.field14;
            Canvas var8 = Statics.field831;
            class85 var10;
            try {
                class88 var9 = new class88();
                var9.method1566(var6, var7, var8);
                var10 = var9;
            } catch (Throwable var18) {
                class83 var12 = new class83();
                var12.method1566(var6, var7, var8);
                var10 = var12;
            }
            Statics.field778 = var10;
            this.method469();
            Statics.field2038 = class68.method1809();
            label85: while (true) {
                class74 var14;
                Canvas var15;
                do {
                    if (field1287 != 0L && class121.method2636() >= field1287) {
                        break label85;
                    }
                    Statics.field340 = Statics.field2038.method1319(field1290, field1291);
                    for (int var13 = 0; var13 < Statics.field340; var13++) {
                        this.method1400();
                    }
                    this.method1399();
                    var14 = Statics.field1301;
                    var15 = Statics.field831;
                } while (var14.field1308 == null);
                for (int var16 = 0; var16 < 50 && var14.field1308.peekEvent() != null; var16++) {
                    class126.method731(1L);
                }
                if (var15 != null) {
                    var14.field1308.postEvent(new ActionEvent(var15, 1001, "dummy"));
                }
            }
        } catch (Exception var19) {
            class80.method2341((String) null, var19);
            this.method1405("crash");
        }
        this.method1452();
    }

    @ObfuscatedName("bo.ns(I)V")
    public void method1400() {
        long var1 = class121.method2636();
        long var3 = field1296[Statics.field905];
        field1296[Statics.field905] = var1;
        Statics.field905 = Statics.field905 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1278 = field1299;
        }
        this.method254();
    }

    @ObfuscatedName("bo.nz(I)V")
    public void method1399() {
        long var1 = class121.method2636();
        long var3 = field1297[Statics.field428];
        field1297[Statics.field428] = var1;
        Statics.field428 = Statics.field428 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field1292 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field1284 - 1 > 50) {
            field1284 -= 50;
            field1295 = true;
            Statics.field831.setSize(Statics.field1237, Statics.field14);
            Statics.field831.setVisible(true);
            if (Statics.field331 == null) {
                Statics.field831.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field331.getInsets();
                Statics.field831.setLocation(var6.left, var6.top);
            }
        }
        this.method255();
    }

    @ObfuscatedName("bo.nc(I)V")
    public final synchronized void method1452() {
        if (field1298) {
            return;
        }
        field1298 = true;
        try {
            Statics.field831.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method425();
        } catch (Exception var7) {
        }
        if (Statics.field331 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1301 != null) {
            try {
                Statics.field1301.method1459();
            } catch (Exception var5) {
            }
        }
        this.method250();
    }

    public void start() {
        if (field1285 == this && !field1298) {
            field1287 = 0L;
        }
    }

    public void stop() {
        if (field1285 == this && !field1298) {
            field1287 = class121.method2636() + 4000L;
        }
    }

    public void destroy() {
        if (field1285 == this && !field1298) {
            field1287 = class121.method2636();
            class126.method731(5000L);
            this.method1452();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1285 != this || field1298) {
            return;
        }
        field1295 = true;
        if (Statics.field2299 != null && Statics.field2299.startsWith("1.5") && class121.method2636() - field1286 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1237 && var2.height >= Statics.field14) {
                field1294 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1299 = true;
        field1295 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1299 = false;
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

    @ObfuscatedName("j.nl(ILjava/lang/String;Ljava/awt/Color;B)V")
    public static final void method36(int arg0, String arg1, Color arg2) {
        try {
            Graphics var3 = Statics.field831.getGraphics();
            if (Statics.field821 == null) {
                Statics.field821 = new Font("Helvetica", 1, 13);
                Statics.field1351 = Statics.field831.getFontMetrics(Statics.field821);
            }
            if (field1295) {
                field1295 = false;
                var3.setColor(Color.black);
                var3.fillRect(0, 0, Statics.field1237, Statics.field14);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field2285 == null) {
                    Statics.field2285 = Statics.field831.createImage(304, 34);
                }
                Graphics var4 = Statics.field2285.getGraphics();
                var4.setColor(arg2);
                var4.drawRect(0, 0, 303, 33);
                var4.fillRect(2, 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(1, 1, 301, 31);
                var4.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field821);
                var4.setColor(Color.white);
                var4.drawString(arg1, (304 - Statics.field1351.stringWidth(arg1)) / 2, 22);
                var3.drawImage(Statics.field2285, Statics.field1237 / 2 - 152, Statics.field14 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var6 = Statics.field1237 / 2 - 152;
                int var7 = Statics.field14 / 2 - 18;
                var3.setColor(arg2);
                var3.drawRect(var6, var7, 303, 33);
                var3.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var3.setColor(Color.black);
                var3.drawRect(var6 + 1, var7 + 1, 301, 31);
                var3.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var3.setFont(Statics.field821);
                var3.setColor(Color.white);
                var3.drawString(arg1, var6 + (304 - Statics.field1351.stringWidth(arg1)) / 2, var7 + 22);
            }
        } catch (Exception var10) {
            Statics.field831.repaint();
        }
    }

    @ObfuscatedName("bu.nv(I)V")
    public static final void method1292() {
        Statics.field2285 = null;
        Statics.field821 = null;
        Statics.field1351 = null;
    }

    @ObfuscatedName("bo.nm(Ljava/lang/String;I)V")
    public void method1405(String arg0) {
        if (this.field1289) {
            return;
        }
        this.field1289 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bo.w(I)V")
    public abstract void method425();

    public abstract void init();

    @ObfuscatedName("bo.q(I)V")
    public abstract void method469();

    @ObfuscatedName("bo.v(I)V")
    public abstract void method255();

    @ObfuscatedName("bo.k(I)V")
    public abstract void method250();

    @ObfuscatedName("bo.j(B)V")
    public abstract void method254();
}
