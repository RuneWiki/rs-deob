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

@ObfuscatedName("bl")
public abstract class class73 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bl.oa")
    public static class73 field1329 = null;

    @ObfuscatedName("bl.oz")
    public static int field1318 = 0;

    @ObfuscatedName("bl.om")
    public static long field1315 = 0L;

    @ObfuscatedName("bl.of")
    public static boolean field1316 = false;

    @ObfuscatedName("bl.ow")
    public static int field1321 = 20;

    @ObfuscatedName("bl.oo")
    public static int field1319 = 1;

    @ObfuscatedName("bl.oy")
    public static int field1320 = 0;

    @ObfuscatedName("bl.pg")
    public static long[] field1313 = new long[32];

    @ObfuscatedName("bl.pb")
    public static long[] field1322 = new long[32];

    @ObfuscatedName("bl.pv")
    public static volatile boolean field1314 = true;

    @ObfuscatedName("bl.py")
    public static int field1325 = 500;

    @ObfuscatedName("bl.pj")
    public static volatile boolean field1326 = false;

    @ObfuscatedName("bl.pf")
    public static volatile long field1327 = 0L;

    @ObfuscatedName("bl.ps")
    public static volatile boolean field1331 = true;

    @ObfuscatedName("bl.oq")
    public boolean field1317 = false;

    @ObfuscatedName("bl.od(IIII)V")
    public final void method1439(int arg0, int arg1, int arg2) {
        try {
            if (field1329 != null) {
                field1318++;
                if (field1318 >= 3) {
                    this.method1447("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1329 = this;
            Statics.field770 = arg0;
            Statics.field283 = arg1;
            Statics.field1923 = arg2;
            Statics.field1420 = this;
            if (Statics.field751 == null) {
                Statics.field751 = new class74();
            }
            Statics.field751.method1512(this, 1);
        } catch (Exception var5) {
            class80.method2321((String) null, var5);
            this.method1447("crash");
        }
    }

    @ObfuscatedName("bl.ox(I)V")
    public final synchronized void method1445() {
        Container var1;
        if (Statics.field26 == null) {
            var1 = this;
        } else {
            var1 = Statics.field26;
        }
        if (Statics.field1408 != null) {
            Statics.field1408.removeFocusListener(this);
            var1.remove(Statics.field1408);
        }
        Statics.field1408 = new class76(this);
        var1.add(Statics.field1408);
        Statics.field1408.setSize(Statics.field770, Statics.field283);
        Statics.field1408.setVisible(true);
        if (Statics.field26 == null) {
            Statics.field1408.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field26.getInsets();
            Statics.field1408.setLocation(var2.left, var2.top);
        }
        Statics.field1408.addFocusListener(this);
        Statics.field1408.requestFocus();
        field1314 = true;
        field1326 = false;
        field1327 = class121.method533();
    }

    @ObfuscatedName("bl.op(I)Z")
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
                this.method1447("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1340 != null) {
                String var1 = Statics.field1340.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1334;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method1447("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class148.method148(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class148.method689(var4) && class148.method1367(var4) < 10) {
                            this.method1447("wrongjava");
                            return;
                        }
                    }
                    field1319 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1445();
            Statics.field385 = class85.method2203(Statics.field770, Statics.field283, Statics.field1408);
            this.method251();
            Statics.field1262 = class68.method2098();
            while (field1315 == 0L || class121.method533() < field1315) {
                Statics.field1299 = Statics.field1262.method1363(field1321, field1319);
                for (int var5 = 0; var5 < Statics.field1299; var5++) {
                    this.method1442();
                }
                this.method1463();
                class69.method150(Statics.field751, Statics.field1408);
            }
        } catch (Exception var7) {
            class80.method2321((String) null, var7);
            this.method1447("crash");
        }
        this.method1443();
    }

    @ObfuscatedName("bl.or(B)V")
    public void method1442() {
        long var1 = class121.method533();
        long var3 = field1322[Statics.field249];
        field1322[Statics.field249] = var1;
        Statics.field249 = Statics.field249 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field374 = field1331;
        }
        this.method252();
    }

    @ObfuscatedName("bl.ob(I)V")
    public void method1463() {
        long var1 = class121.method533();
        long var3 = field1313[Statics.field2013];
        field1313[Statics.field2013] = var1;
        Statics.field2013 = Statics.field2013 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field1320 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field1325 - 1 > 50) {
            field1325 -= 50;
            field1314 = true;
            Statics.field1408.setSize(Statics.field770, Statics.field283);
            Statics.field1408.setVisible(true);
            if (Statics.field26 == null) {
                Statics.field1408.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field26.getInsets();
                Statics.field1408.setLocation(var6.left, var6.top);
            }
        }
        this.method320();
    }

    @ObfuscatedName("bl.ou(I)V")
    public final synchronized void method1443() {
        if (field1316) {
            return;
        }
        field1316 = true;
        try {
            Statics.field1408.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method254();
        } catch (Exception var7) {
        }
        if (Statics.field26 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field751 != null) {
            try {
                Statics.field751.method1506();
            } catch (Exception var5) {
            }
        }
        this.method248();
    }

    public void start() {
        if (field1329 == this && !field1316) {
            field1315 = 0L;
        }
    }

    public void stop() {
        if (field1329 == this && !field1316) {
            field1315 = class121.method533() + 4000L;
        }
    }

    public void destroy() {
        if (field1329 == this && !field1316) {
            field1315 = class121.method533();
            class126.method210(5000L);
            this.method1443();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1329 != this || field1316) {
            return;
        }
        field1314 = true;
        if (Statics.field1334 != null && Statics.field1334.startsWith("1.5") && class121.method533() - field1327 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field770 && var2.height >= Statics.field283) {
                field1326 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1331 = true;
        field1314 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1331 = false;
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

    @ObfuscatedName("bj.ot(B)V")
    public static final void method1373() {
        Statics.field1102 = null;
        Statics.field386 = null;
        Statics.field1324 = null;
    }

    @ObfuscatedName("bl.oi(Ljava/lang/String;B)V")
    public void method1447(String arg0) {
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

    @ObfuscatedName("bl.l(I)V")
    public abstract void method320();

    @ObfuscatedName("bl.y(I)V")
    public abstract void method251();

    @ObfuscatedName("bl.d(I)V")
    public abstract void method252();

    @ObfuscatedName("bl.m(I)V")
    public abstract void method248();

    public abstract void init();

    @ObfuscatedName("bl.h(I)V")
    public abstract void method254();
}
