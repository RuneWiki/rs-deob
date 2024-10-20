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

@ObfuscatedName("bf")
public abstract class class73 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bf.ov")
    public static class73 field1308 = null;

    @ObfuscatedName("bf.ob")
    public static int field1302 = 0;

    @ObfuscatedName("bf.oq")
    public static long field1304 = 0L;

    @ObfuscatedName("bf.oz")
    public static boolean field1306 = false;

    @ObfuscatedName("bf.ot")
    public static int field1307 = 20;

    @ObfuscatedName("bf.oi")
    public static int field1316 = 1;

    @ObfuscatedName("bf.od")
    public static int field1309 = 0;

    @ObfuscatedName("bf.pl")
    public static long[] field1310 = new long[32];

    @ObfuscatedName("bf.py")
    public static long[] field1305 = new long[32];

    @ObfuscatedName("bf.pp")
    public static volatile boolean field1312 = true;

    @ObfuscatedName("bf.pq")
    public static int field1313 = 500;

    @ObfuscatedName("bf.pg")
    public static volatile boolean field1314 = false;

    @ObfuscatedName("bf.pf")
    public static volatile long field1303 = 0L;

    @ObfuscatedName("bf.pa")
    public static volatile boolean field1315 = true;

    @ObfuscatedName("bf.os")
    public boolean field1317 = false;

    @ObfuscatedName("bf.ox(IIII)V")
    public final void method1440(int arg0, int arg1, int arg2) {
        try {
            if (field1308 != null) {
                field1302++;
                if (field1302 >= 3) {
                    this.method1464("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1308 = this;
            Statics.field1016 = arg0;
            Statics.field1266 = arg1;
            Statics.field2850 = arg2;
            Statics.field1400 = this;
            if (Statics.field1172 == null) {
                Statics.field1172 = new class74();
            }
            Statics.field1172.method1517(this, 1);
        } catch (Exception var5) {
            Statics.method1393((String) null, var5);
            this.method1464("crash");
        }
    }

    @ObfuscatedName("bf.ot(I)V")
    public final synchronized void method1439() {
        Container var1;
        if (Statics.field123 == null) {
            var1 = this;
        } else {
            var1 = Statics.field123;
        }
        if (Statics.field1984 != null) {
            Statics.field1984.removeFocusListener(this);
            var1.remove(Statics.field1984);
        }
        Statics.field1984 = new class76(this);
        var1.add(Statics.field1984);
        Statics.field1984.setSize(Statics.field1016, Statics.field1266);
        Statics.field1984.setVisible(true);
        if (Statics.field123 == null) {
            Statics.field1984.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field123.getInsets();
            Statics.field1984.setLocation(var2.left, var2.top);
        }
        Statics.field1984.addFocusListener(this);
        Statics.field1984.requestFocus();
        field1312 = true;
        field1314 = false;
        field1303 = class121.method1435();
    }

    @ObfuscatedName("bf.oi(I)Z")
    public final boolean method1496() {
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
                this.method1464("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1319 != null) {
                String var1 = Statics.field1319.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1330;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method1464("wrongjava");
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
                        boolean var7 = false;
                        boolean var8 = false;
                        int var9 = 0;
                        int var10 = var6.length();
                        int var11 = 0;
                        boolean var13;
                        while (true) {
                            if (var11 >= var10) {
                                var13 = var8;
                                break;
                            }
                            label208: {
                                char var12 = var6.charAt(var11);
                                if (var11 == 0) {
                                    if (var12 == '-') {
                                        var7 = true;
                                        break label208;
                                    }
                                    if (var12 == '+') {
                                        break label208;
                                    }
                                }
                                int var30;
                                if (var12 >= '0' && var12 <= '9') {
                                    var30 = var12 - '0';
                                } else if (var12 >= 'A' && var12 <= 'Z') {
                                    var30 = var12 - '7';
                                } else {
                                    if (var12 < 'a' || var12 > 'z') {
                                        var13 = false;
                                        break;
                                    }
                                    var30 = var12 - 'W';
                                }
                                if (var30 >= 10) {
                                    var13 = false;
                                    break;
                                }
                                if (var7) {
                                    var30 = -var30;
                                }
                                int var14 = var9 * 10 + var30;
                                if (var14 / 10 != var9) {
                                    var13 = false;
                                    break;
                                }
                                var9 = var14;
                                var8 = true;
                            }
                            var11++;
                        }
                        if (var13 && class149.method2887(var6) < 10) {
                            this.method1464("wrongjava");
                            return;
                        }
                    }
                    field1316 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1439();
            int var16 = Statics.field1016;
            int var17 = Statics.field1266;
            Canvas var18 = Statics.field1984;
            class85 var20;
            try {
                class88 var19 = new class88();
                var19.method1625(var16, var17, var18);
                var20 = var19;
            } catch (Throwable var28) {
                class83 var22 = new class83();
                var22.method1625(var16, var17, var18);
                var20 = var22;
            }
            Statics.field79 = var20;
            this.method292();
            Statics.field1270 = class68.method118();
            label118: while (true) {
                class74 var24;
                Canvas var25;
                do {
                    if (field1304 != 0L && class121.method1435() >= field1304) {
                        break label118;
                    }
                    Statics.field1504 = Statics.field1270.method1374(field1307, field1316);
                    for (int var23 = 0; var23 < Statics.field1504; var23++) {
                        this.method1441();
                    }
                    this.method1444();
                    var24 = Statics.field1172;
                    var25 = Statics.field1984;
                } while (var24.field1325 == null);
                for (int var26 = 0; var26 < 50 && var24.field1325.peekEvent() != null; var26++) {
                    class126.method46(1L);
                }
                if (var25 != null) {
                    var24.field1325.postEvent(new ActionEvent(var25, 1001, "dummy"));
                }
            }
        } catch (Exception var29) {
            Statics.method1393((String) null, var29);
            this.method1464("crash");
        }
        this.method1458();
    }

    @ObfuscatedName("bf.od(B)V")
    public void method1441() {
        long var1 = class121.method1435();
        long var3 = field1305[Statics.field78];
        field1305[Statics.field78] = var1;
        Statics.field78 = Statics.field78 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field268 = field1315;
        }
        this.method264();
    }

    @ObfuscatedName("bf.op(I)V")
    public void method1444() {
        long var1 = class121.method1435();
        long var3 = field1310[Statics.field731];
        field1310[Statics.field731] = var1;
        Statics.field731 = Statics.field731 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field1309 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field1313 - 1 > 50) {
            field1313 -= 50;
            field1312 = true;
            Statics.field1984.setSize(Statics.field1016, Statics.field1266);
            Statics.field1984.setVisible(true);
            if (Statics.field123 == null) {
                Statics.field1984.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field123.getInsets();
                Statics.field1984.setLocation(var6.left, var6.top);
            }
        }
        this.method469();
    }

    @ObfuscatedName("bf.pt(B)V")
    public final synchronized void method1458() {
        if (field1306) {
            return;
        }
        field1306 = true;
        try {
            Statics.field1984.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method266();
        } catch (Exception var7) {
        }
        if (Statics.field123 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1172 != null) {
            try {
                Statics.field1172.method1504();
            } catch (Exception var5) {
            }
        }
        this.method260();
    }

    @ObfuscatedName("r.pl(I)V")
    public static final void method31() {
        Statics.field1270.method1360();
        for (int var0 = 0; var0 < 32; var0++) {
            field1310[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field1305[var1] = 0L;
        }
        Statics.field1504 = 0;
    }

    public void start() {
        if (field1308 == this && !field1306) {
            field1304 = 0L;
        }
    }

    public void stop() {
        if (field1308 == this && !field1306) {
            field1304 = class121.method1435() + 4000L;
        }
    }

    public void destroy() {
        if (field1308 == this && !field1306) {
            field1304 = class121.method1435();
            class126.method46(5000L);
            this.method1458();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1308 != this || field1306) {
            return;
        }
        field1312 = true;
        if (Statics.field1330 != null && Statics.field1330.startsWith("1.5") && class121.method1435() - field1303 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1016 && var2.height >= Statics.field1266) {
                field1314 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1315 = true;
        field1312 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1315 = false;
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

    @ObfuscatedName("bf.pm(Ljava/lang/String;B)V")
    public void method1464(String arg0) {
        if (this.field1317) {
            return;
        }
        this.field1317 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bf.z(I)V")
    public abstract void method292();

    @ObfuscatedName("bf.g(I)V")
    public abstract void method264();

    public abstract void init();

    @ObfuscatedName("bf.n(I)V")
    public abstract void method469();

    @ObfuscatedName("bf.j(I)V")
    public abstract void method266();

    @ObfuscatedName("bf.w(B)V")
    public abstract void method260();
}
