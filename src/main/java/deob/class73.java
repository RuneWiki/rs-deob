package deob;

import java.applet.Applet;
import java.awt.Canvas;
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

@ObfuscatedName("ba")
public abstract class class73 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ba.ok")
    public static class73 field1302 = null;

    @ObfuscatedName("ba.oa")
    public static int field1303 = 0;

    @ObfuscatedName("ba.op")
    public static long field1319 = 0L;

    @ObfuscatedName("ba.of")
    public static boolean field1305 = false;

    @ObfuscatedName("ba.ow")
    public static int field1307 = 20;

    @ObfuscatedName("ba.ou")
    public static int field1308 = 1;

    @ObfuscatedName("ba.oq")
    public static int field1317 = 0;

    @ObfuscatedName("ba.pz")
    public static long[] field1310 = new long[32];

    @ObfuscatedName("ba.pk")
    public static long[] field1311 = new long[32];

    @ObfuscatedName("ba.pr")
    public static volatile boolean field1309 = true;

    @ObfuscatedName("ba.pw")
    public static int field1313 = 500;

    @ObfuscatedName("ba.pv")
    public static volatile boolean field1314 = false;

    @ObfuscatedName("ba.pj")
    public static volatile long field1304 = 0L;

    @ObfuscatedName("ba.pp")
    public static volatile boolean field1316 = true;

    @ObfuscatedName("ba.od")
    public boolean field1306 = false;

    @ObfuscatedName("ba.of(IIIB)V")
    public final void method1478(int arg0, int arg1, int arg2) {
        try {
            if (field1302 != null) {
                field1303++;
                if (field1303 >= 3) {
                    this.method1519("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1302 = this;
            Statics.field62 = arg0;
            Statics.field675 = arg1;
            Statics.field1402 = arg2;
            Statics.field1406 = this;
            if (Statics.field2345 == null) {
                Statics.field2345 = new class74();
            }
            Statics.field2345.method1549(this, 1);
        } catch (Exception var5) {
            class80.method2076((String) null, var5);
            this.method1519("crash");
        }
    }

    @ObfuscatedName("ba.od(I)V")
    public final synchronized void method1479() {
        Container var1;
        if (Statics.field1202 == null) {
            var1 = this;
        } else {
            var1 = Statics.field1202;
        }
        if (Statics.field1425 != null) {
            Statics.field1425.removeFocusListener(this);
            var1.remove(Statics.field1425);
        }
        Statics.field1425 = new class76(this);
        var1.add(Statics.field1425);
        Statics.field1425.setSize(Statics.field62, Statics.field675);
        Statics.field1425.setVisible(true);
        if (Statics.field1202 == null) {
            Statics.field1425.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field1202.getInsets();
            Statics.field1425.setLocation(var2.left, var2.top);
        }
        Statics.field1425.addFocusListener(this);
        Statics.field1425.requestFocus();
        field1309 = true;
        field1314 = false;
        field1304 = class121.method548();
    }

    @ObfuscatedName("ba.oh(B)Z")
    public final boolean method1489() {
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
                this.method1519("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1330 != null) {
                String var1 = Statics.field1330.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1321;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method1519("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class148.method142(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class148.method3000(var4)) {
                            int var5 = class148.method2788(var4, 10, true);
                            if (var5 < 10) {
                                this.method1519("wrongjava");
                                return;
                            }
                        }
                    }
                    field1308 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1479();
            int var6 = Statics.field62;
            int var7 = Statics.field675;
            Canvas var8 = Statics.field1425;
            class85 var10;
            try {
                class88 var9 = new class88();
                var9.method1657(var6, var7, var8);
                var10 = var9;
            } catch (Throwable var15) {
                class83 var12 = new class83();
                var12.method1657(var6, var7, var8);
                var10 = var12;
            }
            Statics.field1514 = var10;
            this.method261();
            Statics.field1289 = class68.method2168();
            while (field1319 == 0L || class121.method548() < field1319) {
                Statics.field2066 = Statics.field1289.method1390(field1307, field1308);
                for (int var13 = 0; var13 < Statics.field2066; var13++) {
                    this.method1480();
                }
                this.method1505();
                class69.method3061(Statics.field2345, Statics.field1425);
            }
        } catch (Exception var16) {
            class80.method2076((String) null, var16);
            this.method1519("crash");
        }
        this.method1541();
    }

    @ObfuscatedName("ba.ow(B)V")
    public void method1480() {
        long var1 = class121.method548();
        long var3 = field1311[Statics.field1670];
        field1311[Statics.field1670] = var1;
        Statics.field1670 = Statics.field1670 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1430 = field1316;
        }
        this.method249();
    }

    @ObfuscatedName("ba.ou(I)V")
    public void method1505() {
        long var1 = class121.method548();
        long var3 = field1310[Statics.field1230];
        field1310[Statics.field1230] = var1;
        Statics.field1230 = Statics.field1230 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field1317 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field1313 - 1 > 50) {
            field1313 -= 50;
            field1309 = true;
            Statics.field1425.setSize(Statics.field62, Statics.field675);
            Statics.field1425.setVisible(true);
            if (Statics.field1202 == null) {
                Statics.field1425.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field1202.getInsets();
                Statics.field1425.setLocation(var6.left, var6.top);
            }
        }
        this.method250();
    }

    @ObfuscatedName("ba.oq(I)V")
    public final synchronized void method1541() {
        if (field1305) {
            return;
        }
        field1305 = true;
        try {
            Statics.field1425.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method251();
        } catch (Exception var7) {
        }
        if (Statics.field1202 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field2345 != null) {
            try {
                Statics.field2345.method1546();
            } catch (Exception var5) {
            }
        }
        this.method459();
    }

    @ObfuscatedName("g.oe(I)V")
    public static final void method137() {
        Statics.field1289.method1398();
        for (int var0 = 0; var0 < 32; var0++) {
            field1310[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field1311[var1] = 0L;
        }
        Statics.field2066 = 0;
    }

    public void start() {
        if (field1302 == this && !field1305) {
            field1319 = 0L;
        }
    }

    public void stop() {
        if (field1302 == this && !field1305) {
            field1319 = class121.method548() + 4000L;
        }
    }

    public void destroy() {
        if (field1302 == this && !field1305) {
            field1319 = class121.method548();
            class126.method1463(5000L);
            this.method1541();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1302 != this || field1305) {
            return;
        }
        field1309 = true;
        if (Statics.field1321 != null && Statics.field1321.startsWith("1.5") && class121.method548() - field1304 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field62 && var2.height >= Statics.field675) {
                field1314 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1316 = true;
        field1309 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1316 = false;
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

    @ObfuscatedName("q.ol(ILjava/lang/String;Ljava/awt/Color;I)V")
    public static final void method210(int arg0, String arg1, Color arg2) {
        try {
            Graphics var3 = Statics.field1425.getGraphics();
            if (Statics.field175 == null) {
                Statics.field175 = new Font("Helvetica", 1, 13);
                Statics.field1015 = Statics.field1425.getFontMetrics(Statics.field175);
            }
            if (field1309) {
                field1309 = false;
                var3.setColor(Color.black);
                var3.fillRect(0, 0, Statics.field62, Statics.field675);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field1225 == null) {
                    Statics.field1225 = Statics.field1425.createImage(304, 34);
                }
                Graphics var4 = Statics.field1225.getGraphics();
                var4.setColor(arg2);
                var4.drawRect(0, 0, 303, 33);
                var4.fillRect(2, 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(1, 1, 301, 31);
                var4.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field175);
                var4.setColor(Color.white);
                var4.drawString(arg1, (304 - Statics.field1015.stringWidth(arg1)) / 2, 22);
                var3.drawImage(Statics.field1225, Statics.field62 / 2 - 152, Statics.field675 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var6 = Statics.field62 / 2 - 152;
                int var7 = Statics.field675 / 2 - 18;
                var3.setColor(arg2);
                var3.drawRect(var6, var7, 303, 33);
                var3.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var3.setColor(Color.black);
                var3.drawRect(var6 + 1, var7 + 1, 301, 31);
                var3.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var3.setFont(Statics.field175);
                var3.setColor(Color.white);
                var3.drawString(arg1, var6 + (304 - Statics.field1015.stringWidth(arg1)) / 2, var7 + 22);
            }
        } catch (Exception var10) {
            Statics.field1425.repaint();
        }
    }

    @ObfuscatedName("ae.pz(B)V")
    public static final void method682() {
        Statics.field1225 = null;
        Statics.field175 = null;
        Statics.field1015 = null;
    }

    @ObfuscatedName("ba.pg(Ljava/lang/String;S)V")
    public void method1519(String arg0) {
        if (this.field1306) {
            return;
        }
        this.field1306 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ba.m(I)V")
    public abstract void method250();

    @ObfuscatedName("ba.u(S)V")
    public abstract void method251();

    @ObfuscatedName("ba.i(B)V")
    public abstract void method261();

    @ObfuscatedName("ba.y(B)V")
    public abstract void method249();

    @ObfuscatedName("ba.o(B)V")
    public abstract void method459();

    public abstract void init();
}
