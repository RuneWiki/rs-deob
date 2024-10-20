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

@ObfuscatedName("bs")
public abstract class class73 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bs.op")
    public static class73 field1311 = null;

    @ObfuscatedName("bs.om")
    public static int field1310 = 0;

    @ObfuscatedName("bs.of")
    public static long field1317 = 0L;

    @ObfuscatedName("bs.ox")
    public static boolean field1312 = false;

    @ObfuscatedName("bs.on")
    public static int field1313 = 20;

    @ObfuscatedName("bs.oz")
    public static int field1315 = 1;

    @ObfuscatedName("bs.og")
    public static int field1309 = 0;

    @ObfuscatedName("bs.pn")
    public static long[] field1321 = new long[32];

    @ObfuscatedName("bs.pi")
    public static long[] field1318 = new long[32];

    @ObfuscatedName("bs.px")
    public static volatile boolean field1319 = true;

    @ObfuscatedName("bs.ps")
    public static int field1320 = 500;

    @ObfuscatedName("bs.pb")
    public static volatile boolean field1314 = false;

    @ObfuscatedName("bs.pz")
    public static volatile long field1322 = 0L;

    @ObfuscatedName("bs.pq")
    public static volatile boolean field1323 = true;

    @ObfuscatedName("bs.oa")
    public boolean field1324 = false;

    @ObfuscatedName("bs.nv(IIII)V")
    public final void method1411(int arg0, int arg1, int arg2) {
        try {
            if (field1311 != null) {
                field1310++;
                if (field1310 >= 3) {
                    this.method1419("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1311 = this;
            Statics.field1188 = arg0;
            Statics.field1670 = arg1;
            Statics.field2038 = arg2;
            Statics.field1415 = this;
            if (Statics.field293 == null) {
                Statics.field293 = new class74();
            }
            Statics.field293.method1475(this, 1);
        } catch (Exception var5) {
            class80.method4((String) null, var5);
            this.method1419("crash");
        }
    }

    @ObfuscatedName("bs.no(I)V")
    public final synchronized void method1452() {
        Container var1;
        if (Statics.field88 == null) {
            var1 = this;
        } else {
            var1 = Statics.field88;
        }
        if (Statics.field132 != null) {
            Statics.field132.removeFocusListener(this);
            var1.remove(Statics.field132);
        }
        Statics.field132 = new class76(this);
        var1.add(Statics.field132);
        Statics.field132.setSize(Statics.field1188, Statics.field1670);
        Statics.field132.setVisible(true);
        if (Statics.field88 == null) {
            Statics.field132.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field88.getInsets();
            Statics.field132.setLocation(var2.left, var2.top);
        }
        Statics.field132.addFocusListener(this);
        Statics.field132.requestFocus();
        field1319 = true;
        field1314 = false;
        field1322 = class121.method145();
    }

    @ObfuscatedName("bs.ny(I)Z")
    public final boolean method1422() {
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
                this.method1419("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1335 != null) {
                String var1 = Statics.field1335.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1338;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method1419("wrongjava");
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
                        if (class147.method113(var6)) {
                            int var7 = class147.method1861(var6, 10, true);
                            if (var7 < 10) {
                                this.method1419("wrongjava");
                                return;
                            }
                        }
                    }
                    field1315 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1452();
            Statics.field263 = class85.method2034(Statics.field1188, Statics.field1670, Statics.field132);
            this.method279();
            Statics.field377 = class68.method594();
            label83: while (true) {
                class74 var9;
                Canvas var10;
                do {
                    if (field1317 != 0L && class121.method145() >= field1317) {
                        break label83;
                    }
                    Statics.field2330 = Statics.field377.method1340(field1313, field1315);
                    for (int var8 = 0; var8 < Statics.field2330; var8++) {
                        this.method1469();
                    }
                    this.method1414();
                    var9 = Statics.field293;
                    var10 = Statics.field132;
                } while (var9.field1333 == null);
                for (int var11 = 0; var11 < 50 && var9.field1333.peekEvent() != null; var11++) {
                    class126.method738(1L);
                }
                if (var10 != null) {
                    var9.field1333.postEvent(new ActionEvent(var10, 1001, "dummy"));
                }
            }
        } catch (Exception var13) {
            class80.method4((String) null, var13);
            this.method1419("crash");
        }
        this.method1415();
    }

    @ObfuscatedName("bs.nh(I)V")
    public void method1469() {
        long var1 = class121.method145();
        long var3 = field1318[Statics.field1041];
        field1318[Statics.field1041] = var1;
        Statics.field1041 = Statics.field1041 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field390 = field1323;
        }
        this.method393();
    }

    @ObfuscatedName("bs.ni(I)V")
    public void method1414() {
        long var1 = class121.method145();
        long var3 = field1321[Statics.field204];
        field1321[Statics.field204] = var1;
        Statics.field204 = Statics.field204 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field1309 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field1320 - 1 > 50) {
            field1320 -= 50;
            field1319 = true;
            Statics.field132.setSize(Statics.field1188, Statics.field1670);
            Statics.field132.setVisible(true);
            if (Statics.field88 == null) {
                Statics.field132.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field88.getInsets();
                Statics.field132.setLocation(var6.left, var6.top);
            }
        }
        this.method281();
    }

    @ObfuscatedName("bs.nz(S)V")
    public final synchronized void method1415() {
        if (field1312) {
            return;
        }
        field1312 = true;
        try {
            Statics.field132.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method282();
        } catch (Exception var7) {
        }
        if (Statics.field88 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field293 != null) {
            try {
                Statics.field293.method1500();
            } catch (Exception var5) {
            }
        }
        this.method276();
    }

    public void start() {
        if (field1311 == this && !field1312) {
            field1317 = 0L;
        }
    }

    public void stop() {
        if (field1311 == this && !field1312) {
            field1317 = class121.method145() + 4000L;
        }
    }

    public void destroy() {
        if (field1311 == this && !field1312) {
            field1317 = class121.method145();
            class126.method738(5000L);
            this.method1415();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1311 != this || field1312) {
            return;
        }
        field1319 = true;
        if (Statics.field1338 != null && Statics.field1338.startsWith("1.5") && class121.method145() - field1322 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1188 && var2.height >= Statics.field1670) {
                field1314 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1323 = true;
        field1319 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1323 = false;
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

    @ObfuscatedName("bs.nm(Ljava/lang/String;I)V")
    public void method1419(String arg0) {
        if (this.field1324) {
            return;
        }
        this.field1324 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    public abstract void init();

    @ObfuscatedName("bs.p(I)V")
    public abstract void method279();

    @ObfuscatedName("bs.k(I)V")
    public abstract void method393();

    @ObfuscatedName("bs.l(I)V")
    public abstract void method282();

    @ObfuscatedName("bs.e(B)V")
    public abstract void method276();

    @ObfuscatedName("bs.r(I)V")
    public abstract void method281();
}
