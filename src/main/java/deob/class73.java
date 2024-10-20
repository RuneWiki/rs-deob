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

@ObfuscatedName("bo")
public abstract class class73 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bo.og")
    public static class73 field1313 = null;

    @ObfuscatedName("bo.os")
    public static int field1303 = 0;

    @ObfuscatedName("bo.ou")
    public static long field1317 = 0L;

    @ObfuscatedName("bo.ow")
    public static boolean field1312 = false;

    @ObfuscatedName("bo.oj")
    public static int field1309 = 20;

    @ObfuscatedName("bo.oc")
    public static int field1308 = 1;

    @ObfuscatedName("bo.ov")
    public static int field1318 = 0;

    @ObfuscatedName("bo.pa")
    public static long[] field1310 = new long[32];

    @ObfuscatedName("bo.pt")
    public static long[] field1302 = new long[32];

    @ObfuscatedName("bo.pq")
    public static volatile boolean field1311 = true;

    @ObfuscatedName("bo.pe")
    public static int field1304 = 500;

    @ObfuscatedName("bo.po")
    public static volatile boolean field1314 = false;

    @ObfuscatedName("bo.pi")
    public static volatile long field1315 = 0L;

    @ObfuscatedName("bo.pg")
    public static volatile boolean field1316 = true;

    @ObfuscatedName("bo.oq")
    public boolean field1306 = false;

    @ObfuscatedName("bo.oz(IIII)V")
    public final void method1438(int arg0, int arg1, int arg2) {
        try {
            if (field1313 != null) {
                field1303++;
                if (field1303 >= 3) {
                    this.method1452("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1313 = this;
            Statics.field1196 = arg0;
            Statics.field1215 = arg1;
            Statics.field1418 = arg2;
            Statics.field1411 = this;
            if (Statics.field1457 == null) {
                Statics.field1457 = new class74();
            }
            Statics.field1457.method1498(this, 1);
        } catch (Exception var5) {
            class80.method815((String) null, var5);
            this.method1452("crash");
        }
    }

    @ObfuscatedName("bo.oj(I)V")
    public final synchronized void method1439() {
        Container var1;
        if (Statics.field1387 == null) {
            var1 = this;
        } else {
            var1 = Statics.field1387;
        }
        if (Statics.field2330 != null) {
            Statics.field2330.removeFocusListener(this);
            var1.remove(Statics.field2330);
        }
        Statics.field2330 = new class76(this);
        var1.add(Statics.field2330);
        Statics.field2330.setSize(Statics.field1196, Statics.field1215);
        Statics.field2330.setVisible(true);
        if (Statics.field1387 == null) {
            Statics.field2330.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field1387.getInsets();
            Statics.field2330.setLocation(var2.left, var2.top);
        }
        Statics.field2330.addFocusListener(this);
        Statics.field2330.requestFocus();
        field1311 = true;
        field1314 = false;
        field1315 = class121.method131();
    }

    @ObfuscatedName("bo.oc(B)Z")
    public final boolean method1440() {
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
                this.method1452("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2021 != null) {
                String var1 = Statics.field2021.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1332;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method1452("wrongjava");
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
                                int var31;
                                if (var12 >= '0' && var12 <= '9') {
                                    var31 = var12 - '0';
                                } else if (var12 >= 'A' && var12 <= 'Z') {
                                    var31 = var12 - '7';
                                } else {
                                    if (var12 < 'a' || var12 > 'z') {
                                        var13 = false;
                                        break;
                                    }
                                    var31 = var12 - 'W';
                                }
                                if (var31 >= 10) {
                                    var13 = false;
                                    break;
                                }
                                if (var7) {
                                    var31 = -var31;
                                }
                                int var14 = var9 * 10 + var31;
                                if (var14 / 10 != var9) {
                                    var13 = false;
                                    break;
                                }
                                var9 = var14;
                                var8 = true;
                            }
                            var11++;
                        }
                        if (var13) {
                            int var16 = class147.method1840(var6, 10, true);
                            if (var16 < 10) {
                                this.method1452("wrongjava");
                                return;
                            }
                        }
                    }
                    field1308 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1439();
            int var17 = Statics.field1196;
            int var18 = Statics.field1215;
            Canvas var19 = Statics.field2330;
            class85 var21;
            try {
                class88 var20 = new class88();
                var20.method1586(var17, var18, var19);
                var21 = var20;
            } catch (Throwable var29) {
                class83 var23 = new class83();
                var23.method1586(var17, var18, var19);
                var21 = var23;
            }
            Statics.field2704 = var21;
            this.method337();
            Statics.field917 = class68.method3040();
            label118: while (true) {
                class74 var25;
                Canvas var26;
                do {
                    if (field1317 != 0L && class121.method131() >= field1317) {
                        break label118;
                    }
                    Statics.field739 = Statics.field917.method1362(field1309, field1308);
                    for (int var24 = 0; var24 < Statics.field739; var24++) {
                        this.method1448();
                    }
                    this.method1442();
                    var25 = Statics.field1457;
                    var26 = Statics.field2330;
                } while (var25.field1324 == null);
                for (int var27 = 0; var27 < 50 && var25.field1324.peekEvent() != null; var27++) {
                    class126.method209(1L);
                }
                if (var26 != null) {
                    var25.field1324.postEvent(new ActionEvent(var26, 1001, "dummy"));
                }
            }
        } catch (Exception var30) {
            class80.method815((String) null, var30);
            this.method1452("crash");
        }
        this.method1487();
    }

    @ObfuscatedName("bo.ov(B)V")
    public void method1448() {
        long var1 = class121.method131();
        long var3 = field1302[Statics.field370];
        field1302[Statics.field370] = var1;
        Statics.field370 = Statics.field370 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field76 = field1316;
        }
        this.method270();
    }

    @ObfuscatedName("bo.ox(S)V")
    public void method1442() {
        long var1 = class121.method131();
        long var3 = field1310[Statics.field1372];
        field1310[Statics.field1372] = var1;
        Statics.field1372 = Statics.field1372 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field1318 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field1304 - 1 > 50) {
            field1304 -= 50;
            field1311 = true;
            Statics.field2330.setSize(Statics.field1196, Statics.field1215);
            Statics.field2330.setVisible(true);
            if (Statics.field1387 == null) {
                Statics.field2330.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field1387.getInsets();
                Statics.field2330.setLocation(var6.left, var6.top);
            }
        }
        this.method246();
    }

    @ObfuscatedName("bo.ps(B)V")
    public final synchronized void method1487() {
        if (field1312) {
            return;
        }
        field1312 = true;
        try {
            Statics.field2330.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method247();
        } catch (Exception var7) {
        }
        if (Statics.field1387 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1457 != null) {
            try {
                Statics.field1457.method1495();
            } catch (Exception var5) {
            }
        }
        this.method241();
    }

    @ObfuscatedName("eb.pa(B)V")
    public static final void method3082() {
        Statics.field917.method1353();
        for (int var0 = 0; var0 < 32; var0++) {
            field1310[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field1302[var1] = 0L;
        }
        Statics.field739 = 0;
    }

    public void start() {
        if (field1313 == this && !field1312) {
            field1317 = 0L;
        }
    }

    public void stop() {
        if (field1313 == this && !field1312) {
            field1317 = class121.method131() + 4000L;
        }
    }

    public void destroy() {
        if (field1313 == this && !field1312) {
            field1317 = class121.method131();
            class126.method209(5000L);
            this.method1487();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1313 != this || field1312) {
            return;
        }
        field1311 = true;
        if (Statics.field1332 != null && Statics.field1332.startsWith("1.5") && class121.method131() - field1315 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1196 && var2.height >= Statics.field1215) {
                field1314 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1316 = true;
        field1311 = true;
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

    @ObfuscatedName("bo.pj(Ljava/lang/String;B)V")
    public void method1452(String arg0) {
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

    public abstract void init();

    @ObfuscatedName("bo.i(B)V")
    public abstract void method337();

    @ObfuscatedName("bo.s(I)V")
    public abstract void method270();

    @ObfuscatedName("bo.w(I)V")
    public abstract void method246();

    @ObfuscatedName("bo.d(I)V")
    public abstract void method247();

    @ObfuscatedName("bo.v(I)V")
    public abstract void method241();
}
