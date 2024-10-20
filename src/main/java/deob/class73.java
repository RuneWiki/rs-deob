package deob;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.net.URL;

@ObfuscatedName("bx")
public abstract class class73 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bx.oe")
    public static class73 field1338 = null;

    @ObfuscatedName("bx.ob")
    public static int field1340 = 0;

    @ObfuscatedName("bx.ok")
    public static long field1326 = 0L;

    @ObfuscatedName("bx.ol")
    public static boolean field1329 = false;

    @ObfuscatedName("bx.od")
    public static int field1331 = 20;

    @ObfuscatedName("bx.oz")
    public static int field1332 = 1;

    @ObfuscatedName("bx.os")
    public static int field1328 = 0;

    @ObfuscatedName("bx.oa")
    public static long[] field1334 = new long[32];

    @ObfuscatedName("bx.px")
    public static long[] field1335 = new long[32];

    @ObfuscatedName("bx.ps")
    public static volatile boolean field1336 = true;

    @ObfuscatedName("bx.ph")
    public static int field1337 = 500;

    @ObfuscatedName("bx.pd")
    public static volatile boolean field1339 = false;

    @ObfuscatedName("bx.pg")
    public static volatile long field1327 = 0L;

    @ObfuscatedName("bx.pj")
    public static volatile boolean field1333 = true;

    @ObfuscatedName("bx.oi")
    public boolean field1330 = false;

    @ObfuscatedName("bx.od(IIIB)V")
    public final void method1452(int arg0, int arg1, int arg2) {
        try {
            if (field1338 != null) {
                field1340++;
                if (field1340 >= 3) {
                    this.method1458("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1338 = this;
            Statics.field1171 = arg0;
            Statics.field1102 = arg1;
            Statics.field1422 = arg2;
            Statics.field1424 = this;
            if (Statics.field441 == null) {
                Statics.field441 = new class74();
            }
            Statics.field441.method1517(this, 1);
        } catch (Exception var5) {
            class80.method838((String) null, var5);
            this.method1458("crash");
        }
    }

    @ObfuscatedName("bx.oz(I)V")
    public final synchronized void method1453() {
        Container var1;
        if (Statics.field1298 == null) {
            var1 = this;
        } else {
            var1 = Statics.field1298;
        }
        if (Statics.field351 != null) {
            Statics.field351.removeFocusListener(this);
            var1.remove(Statics.field351);
        }
        Statics.field351 = new class76(this);
        var1.add(Statics.field351);
        Statics.field351.setSize(Statics.field1171, Statics.field1102);
        Statics.field351.setVisible(true);
        if (Statics.field1298 == null) {
            Statics.field351.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field1298.getInsets();
            Statics.field351.setLocation(var2.left, var2.top);
        }
        Statics.field351.addFocusListener(this);
        Statics.field351.requestFocus();
        field1336 = true;
        field1339 = false;
        field1327 = class121.method2();
    }

    @ObfuscatedName("bx.os(I)Z")
    public final boolean method1454() {
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
                this.method1458("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1347 != null) {
                String var1 = Statics.field1347.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1342;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method1458("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class148.method628(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        boolean var5 = class148.method1441(var4, 10, true);
                        if (var5) {
                            int var6 = class148.method2333(var4, 10, true);
                            if (var6 < 10) {
                                this.method1458("wrongjava");
                                return;
                            }
                        }
                    }
                    field1332 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1453();
            Statics.field1469 = class85.method1439(Statics.field1171, Statics.field1102, Statics.field351);
            this.method259();
            Statics.field250 = class68.method185();
            while (field1326 == 0L || class121.method2() < field1326) {
                Statics.field81 = Statics.field250.method1376(field1331, field1332);
                for (int var7 = 0; var7 < Statics.field81; var7++) {
                    this.method1455();
                }
                this.method1456();
                Statics.method3124(Statics.field441, Statics.field351);
            }
        } catch (Exception var9) {
            class80.method838((String) null, var9);
            this.method1458("crash");
        }
        this.method1457();
    }

    @ObfuscatedName("bx.op(B)V")
    public void method1455() {
        long var1 = class121.method2();
        long var3 = field1335[Statics.field53];
        field1335[Statics.field53] = var1;
        Statics.field53 = Statics.field53 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field114 = field1333;
        }
        this.method260();
    }

    @ObfuscatedName("bx.ou(I)V")
    public void method1456() {
        long var1 = class121.method2();
        long var3 = field1334[Statics.field1316];
        field1334[Statics.field1316] = var1;
        Statics.field1316 = Statics.field1316 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field1328 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field1337 - 1 > 50) {
            field1337 -= 50;
            field1336 = true;
            Statics.field351.setSize(Statics.field1171, Statics.field1102);
            Statics.field351.setVisible(true);
            if (Statics.field1298 == null) {
                Statics.field351.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field1298.getInsets();
                Statics.field351.setLocation(var6.left, var6.top);
            }
        }
        this.method543();
    }

    @ObfuscatedName("bx.oa(B)V")
    public final synchronized void method1457() {
        if (field1329) {
            return;
        }
        field1329 = true;
        try {
            Statics.field351.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method255();
        } catch (Exception var7) {
        }
        if (Statics.field1298 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field441 != null) {
            try {
                Statics.field441.method1533();
            } catch (Exception var5) {
            }
        }
        this.method256();
    }

    @ObfuscatedName("aa.ov(I)V")
    public static final void method713() {
        Statics.field250.method1368();
        for (int var0 = 0; var0 < 32; var0++) {
            field1334[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field1335[var1] = 0L;
        }
        Statics.field81 = 0;
    }

    public void start() {
        if (field1338 == this && !field1329) {
            field1326 = 0L;
        }
    }

    public void stop() {
        if (field1338 == this && !field1329) {
            field1326 = class121.method2() + 4000L;
        }
    }

    public void destroy() {
        if (field1338 == this && !field1329) {
            field1326 = class121.method2();
            class126.method47(5000L);
            this.method1457();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1338 != this || field1329) {
            return;
        }
        field1336 = true;
        if (Statics.field1342 != null && Statics.field1342.startsWith("1.5") && class121.method2() - field1327 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1171 && var2.height >= Statics.field1102) {
                field1339 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1333 = true;
        field1336 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1333 = false;
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

    @ObfuscatedName("eb.px(ILjava/lang/String;Ljava/awt/Color;I)V")
    public static final void method2774(int arg0, String arg1, Color arg2) {
        try {
            Graphics var3 = Statics.field351.getGraphics();
            if (Statics.field1019 == null) {
                Statics.field1019 = new Font("Helvetica", 1, 13);
                Statics.field925 = Statics.field351.getFontMetrics(Statics.field1019);
            }
            if (field1336) {
                field1336 = false;
                var3.setColor(Color.black);
                var3.fillRect(0, 0, Statics.field1171, Statics.field1102);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field458 == null) {
                    Statics.field458 = Statics.field351.createImage(304, 34);
                }
                Graphics var4 = Statics.field458.getGraphics();
                var4.setColor(arg2);
                var4.drawRect(0, 0, 303, 33);
                var4.fillRect(2, 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(1, 1, 301, 31);
                var4.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1019);
                var4.setColor(Color.white);
                var4.drawString(arg1, (304 - Statics.field925.stringWidth(arg1)) / 2, 22);
                var3.drawImage(Statics.field458, Statics.field1171 / 2 - 152, Statics.field1102 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var6 = Statics.field1171 / 2 - 152;
                int var7 = Statics.field1102 / 2 - 18;
                var3.setColor(arg2);
                var3.drawRect(var6, var7, 303, 33);
                var3.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var3.setColor(Color.black);
                var3.drawRect(var6 + 1, var7 + 1, 301, 31);
                var3.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var3.setFont(Statics.field1019);
                var3.setColor(Color.white);
                var3.drawString(arg1, var6 + (304 - Statics.field925.stringWidth(arg1)) / 2, var7 + 22);
            }
        } catch (Exception var10) {
            Statics.field351.repaint();
        }
    }

    @ObfuscatedName("bx.pt(Ljava/lang/String;I)V")
    public void method1458(String arg0) {
        if (this.field1330) {
            return;
        }
        this.field1330 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bx.n(I)V")
    public abstract void method543();

    @ObfuscatedName("bx.k(I)V")
    public abstract void method255();

    @ObfuscatedName("bx.h(I)V")
    public abstract void method256();

    public abstract void init();

    @ObfuscatedName("bx.l(B)V")
    public abstract void method259();

    @ObfuscatedName("bx.f(I)V")
    public abstract void method260();
}
