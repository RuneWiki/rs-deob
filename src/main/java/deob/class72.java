package deob;

import java.applet.Applet;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;

@ObfuscatedName("bu")
public abstract class class72 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bu.ot")
    public static class72 field1306 = null;

    @ObfuscatedName("bu.or")
    public static int field1292 = 0;

    @ObfuscatedName("bu.oe")
    public static long field1293 = 0L;

    @ObfuscatedName("bu.oq")
    public static boolean field1294 = false;

    @ObfuscatedName("bu.oh")
    public static int field1296 = 20;

    @ObfuscatedName("bu.ow")
    public static int field1291 = 1;

    @ObfuscatedName("bu.oi")
    public static int field1298 = 0;

    @ObfuscatedName("bu.pp")
    public static long[] field1295 = new long[32];

    @ObfuscatedName("bu.pr")
    public static long[] field1300 = new long[32];

    @ObfuscatedName("bu.pm")
    public static volatile boolean field1304 = true;

    @ObfuscatedName("bu.pc")
    public static int field1302 = 500;

    @ObfuscatedName("bu.ps")
    public static volatile boolean field1303 = false;

    @ObfuscatedName("bu.pj")
    public static volatile long field1299 = 0L;

    @ObfuscatedName("bu.pq")
    public static volatile boolean field1305 = true;

    @ObfuscatedName("bu.oc")
    public boolean field1301 = false;

    @ObfuscatedName("bu.pp(IIII)V")
    public final void method1455(int arg0, int arg1, int arg2) {
        try {
            if (field1306 != null) {
                field1292++;
                if (field1292 >= 3) {
                    this.method1456("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1306 = this;
            Statics.field886 = arg0;
            Statics.field186 = arg1;
            Statics.field1396 = arg2;
            Statics.field1399 = this;
            if (Statics.field960 == null) {
                Statics.field960 = new class73();
            }
            Statics.field960.method1522(this, 1);
        } catch (Exception var5) {
            class79.method811((String) null, var5);
            this.method1456("crash");
        }
    }

    @ObfuscatedName("bu.px(I)V")
    public final synchronized void method1482() {
        Container var1;
        if (Statics.field201 == null) {
            var1 = this;
        } else {
            var1 = Statics.field201;
        }
        if (Statics.field223 != null) {
            Statics.field223.removeFocusListener(this);
            var1.remove(Statics.field223);
        }
        Statics.field223 = new class75(this);
        var1.add(Statics.field223);
        Statics.field223.setSize(Statics.field886, Statics.field186);
        Statics.field223.setVisible(true);
        if (Statics.field201 == null) {
            Statics.field223.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field201.getInsets();
            Statics.field223.setLocation(var2.left, var2.top);
        }
        Statics.field223.addFocusListener(this);
        Statics.field223.requestFocus();
        field1304 = true;
        field1303 = false;
        field1299 = class120.method1383();
    }

    @ObfuscatedName("bu.pr(I)Z")
    public final boolean method1445() {
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
                this.method1456("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1308 != null) {
                String var1 = Statics.field1308.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1307;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method1456("wrongjava");
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
                        if (class146.method31(var6)) {
                            int var7 = class146.method1267(var6, 10, true);
                            if (var7 < 10) {
                                this.method1456("wrongjava");
                                return;
                            }
                        }
                    }
                    field1291 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1482();
            Statics.field896 = class84.method782(Statics.field886, Statics.field186, Statics.field223);
            this.method276();
            class67 var8;
            try {
                var8 = new class80();
            } catch (Throwable var12) {
                var8 = new class64();
            }
            Statics.field1239 = var8;
            while (field1293 == 0L || class120.method1383() < field1293) {
                Statics.field453 = Statics.field1239.method1374(field1296, field1291);
                for (int var10 = 0; var10 < Statics.field453; var10++) {
                    this.method1446();
                }
                this.method1447();
                class68.method1407(Statics.field960, Statics.field223);
            }
        } catch (Exception var13) {
            class79.method811((String) null, var13);
            this.method1456("crash");
        }
        this.method1448();
    }

    @ObfuscatedName("bu.pe(I)V")
    public void method1446() {
        long var1 = class120.method1383();
        long var3 = field1300[Statics.field1533];
        field1300[Statics.field1533] = var1;
        Statics.field1533 = Statics.field1533 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1401 = field1305;
        }
        this.method266();
    }

    @ObfuscatedName("bu.pf(I)V")
    public void method1447() {
        long var1 = class120.method1383();
        long var3 = field1295[Statics.field269];
        field1295[Statics.field269] = var1;
        Statics.field269 = Statics.field269 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field1298 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field1302 - 1 > 50) {
            field1302 -= 50;
            field1304 = true;
            Statics.field223.setSize(Statics.field886, Statics.field186);
            Statics.field223.setVisible(true);
            if (Statics.field201 == null) {
                Statics.field223.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field201.getInsets();
                Statics.field223.setLocation(var6.left, var6.top);
            }
        }
        this.method247();
    }

    @ObfuscatedName("bu.pg(I)V")
    public final synchronized void method1448() {
        if (field1294) {
            return;
        }
        field1294 = true;
        try {
            Statics.field223.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method248();
        } catch (Exception var7) {
        }
        if (Statics.field201 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field960 != null) {
            try {
                Statics.field960.method1510();
            } catch (Exception var5) {
            }
        }
        this.method243();
    }

    @ObfuscatedName("bv.ph(I)V")
    public static final void method1410() {
        Statics.field1239.method1373();
        for (int var0 = 0; var0 < 32; var0++) {
            field1295[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field1300[var1] = 0L;
        }
        Statics.field453 = 0;
    }

    public void start() {
        if (field1306 == this && !field1294) {
            field1293 = 0L;
        }
    }

    public void stop() {
        if (field1306 == this && !field1294) {
            field1293 = class120.method1383() + 4000L;
        }
    }

    public void destroy() {
        if (field1306 == this && !field1294) {
            field1293 = class120.method1383();
            class125.method2683(5000L);
            this.method1448();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1306 != this || field1294) {
            return;
        }
        field1304 = true;
        if (Statics.field1307 != null && Statics.field1307.startsWith("1.5") && class120.method1383() - field1299 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field886 && var2.height >= Statics.field186) {
                field1303 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1305 = true;
        field1304 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1305 = false;
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

    @ObfuscatedName("aa.pv(B)V")
    public static final void method681() {
        Statics.field1810 = null;
        Statics.field1184 = null;
        Statics.field241 = null;
    }

    @ObfuscatedName("bu.pw(Ljava/lang/String;B)V")
    public void method1456(String arg0) {
        if (this.field1301) {
            return;
        }
        this.field1301 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bu.r(I)V")
    public abstract void method243();

    @ObfuscatedName("bu.q(B)V")
    public abstract void method276();

    @ObfuscatedName("bu.s(I)V")
    public abstract void method247();

    @ObfuscatedName("bu.l(I)V")
    public abstract void method248();

    @ObfuscatedName("bu.u(I)V")
    public abstract void method266();

    public abstract void init();
}
