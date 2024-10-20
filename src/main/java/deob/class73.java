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

@ObfuscatedName("bm")
public abstract class class73 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bm.of")
    public static class73 field1315 = null;

    @ObfuscatedName("bm.ox")
    public static int field1309 = 0;

    @ObfuscatedName("bm.os")
    public static long field1304 = 0L;

    @ObfuscatedName("bm.oi")
    public static boolean field1314 = false;

    @ObfuscatedName("bm.oj")
    public static int field1307 = 20;

    @ObfuscatedName("bm.oe")
    public static int field1305 = 1;

    @ObfuscatedName("bm.ot")
    public static int field1302 = 0;

    @ObfuscatedName("bm.od")
    public static long[] field1310 = new long[32];

    @ObfuscatedName("bm.po")
    public static long[] field1311 = new long[32];

    @ObfuscatedName("bm.pw")
    public static volatile boolean field1312 = true;

    @ObfuscatedName("bm.pq")
    public static int field1313 = 500;

    @ObfuscatedName("bm.ps")
    public static volatile boolean field1318 = false;

    @ObfuscatedName("bm.pi")
    public static volatile long field1308 = 0L;

    @ObfuscatedName("bm.pu")
    public static volatile boolean field1303 = true;

    @ObfuscatedName("bm.ob")
    public boolean field1306 = false;

    @ObfuscatedName("bm.or(IIIS)V")
    public final void method1436(int arg0, int arg1, int arg2) {
        try {
            if (field1315 != null) {
                field1309++;
                if (field1309 >= 3) {
                    this.method1447("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1315 = this;
            Statics.field272 = arg0;
            Statics.field2449 = arg1;
            Statics.field1747 = arg2;
            Statics.field1401 = this;
            if (Statics.field1214 == null) {
                Statics.field1214 = new class74();
            }
            Statics.field1214.method1507(this, 1);
        } catch (Exception var5) {
            class80.method802((String) null, var5);
            this.method1447("crash");
        }
    }

    @ObfuscatedName("bm.oa(B)V")
    public final synchronized void method1437() {
        Container var1;
        if (Statics.field740 == null) {
            var1 = this;
        } else {
            var1 = Statics.field740;
        }
        if (Statics.field268 != null) {
            Statics.field268.removeFocusListener(this);
            var1.remove(Statics.field268);
        }
        Statics.field268 = new class76(this);
        var1.add(Statics.field268);
        Statics.field268.setSize(Statics.field272, Statics.field2449);
        Statics.field268.setVisible(true);
        if (Statics.field740 == null) {
            Statics.field268.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field740.getInsets();
            Statics.field268.setLocation(var2.left, var2.top);
        }
        Statics.field268.addFocusListener(this);
        Statics.field268.requestFocus();
        field1312 = true;
        field1318 = false;
        field1308 = class121.method133();
    }

    @ObfuscatedName("bm.on(I)Z")
    public final boolean method1438() {
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
                this.method1447("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2458 != null) {
                String var1 = Statics.field2458.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1328;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method1447("wrongjava");
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
                        boolean var7 = class148.method14(var6, 10, true);
                        if (var7 && class148.method24(var6) < 10) {
                            this.method1447("wrongjava");
                            return;
                        }
                    }
                    field1305 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1437();
            Statics.field1289 = class85.method1557(Statics.field272, Statics.field2449, Statics.field268);
            this.method264();
            class68 var8;
            try {
                var8 = new class81();
            } catch (Throwable var15) {
                var8 = new class65();
            }
            Statics.field111 = var8;
            label91: while (true) {
                class74 var11;
                Canvas var12;
                do {
                    if (field1304 != 0L && class121.method133() >= field1304) {
                        break label91;
                    }
                    Statics.field200 = Statics.field111.method1372(field1307, field1305);
                    for (int var10 = 0; var10 < Statics.field200; var10++) {
                        this.method1474();
                    }
                    this.method1458();
                    var11 = Statics.field1214;
                    var12 = Statics.field268;
                } while (var11.field1324 == null);
                for (int var13 = 0; var13 < 50 && var11.field1324.peekEvent() != null; var13++) {
                    class126.method815(1L);
                }
                if (var12 != null) {
                    var11.field1324.postEvent(new ActionEvent(var12, 1001, "dummy"));
                }
            }
        } catch (Exception var16) {
            class80.method802((String) null, var16);
            this.method1447("crash");
        }
        this.method1453();
    }

    @ObfuscatedName("bm.ok(I)V")
    public void method1474() {
        long var1 = class121.method133();
        long var3 = field1311[Statics.field1161];
        field1311[Statics.field1161] = var1;
        Statics.field1161 = Statics.field1161 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1017 = field1303;
        }
        this.method386();
    }

    @ObfuscatedName("bm.om(I)V")
    public void method1458() {
        long var1 = class121.method133();
        long var3 = field1310[Statics.field1169];
        field1310[Statics.field1169] = var1;
        Statics.field1169 = Statics.field1169 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field1302 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field1313 - 1 > 50) {
            field1313 -= 50;
            field1312 = true;
            Statics.field268.setSize(Statics.field272, Statics.field2449);
            Statics.field268.setVisible(true);
            if (Statics.field740 == null) {
                Statics.field268.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field740.getInsets();
                Statics.field268.setLocation(var6.left, var6.top);
            }
        }
        this.method266();
    }

    @ObfuscatedName("bm.ou(I)V")
    public final synchronized void method1453() {
        if (field1314) {
            return;
        }
        field1314 = true;
        try {
            Statics.field268.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method267();
        } catch (Exception var7) {
        }
        if (Statics.field740 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1214 != null) {
            try {
                Statics.field1214.method1504();
            } catch (Exception var5) {
            }
        }
        this.method422();
    }

    public void start() {
        if (field1315 == this && !field1314) {
            field1304 = 0L;
        }
    }

    public void stop() {
        if (field1315 == this && !field1314) {
            field1304 = class121.method133() + 4000L;
        }
    }

    public void destroy() {
        if (field1315 == this && !field1314) {
            field1304 = class121.method133();
            class126.method815(5000L);
            this.method1453();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1315 != this || field1314) {
            return;
        }
        field1312 = true;
        if (Statics.field1328 != null && Statics.field1328.startsWith("1.5") && class121.method133() - field1308 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field272 && var2.height >= Statics.field2449) {
                field1318 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1303 = true;
        field1312 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1303 = false;
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

    @ObfuscatedName("bm.oh(Ljava/lang/String;B)V")
    public void method1447(String arg0) {
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

    @ObfuscatedName("bm.r(I)V")
    public abstract void method264();

    @ObfuscatedName("bm.u(B)V")
    public abstract void method266();

    @ObfuscatedName("bm.o(I)V")
    public abstract void method267();

    @ObfuscatedName("bm.l(I)V")
    public abstract void method422();

    @ObfuscatedName("bm.k(I)V")
    public abstract void method386();
}
