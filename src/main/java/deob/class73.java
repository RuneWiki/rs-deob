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

@ObfuscatedName("bt")
public abstract class class73 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bt.ow")
    public static class73 field1352 = null;

    @ObfuscatedName("bt.ou")
    public static int field1354 = 0;

    @ObfuscatedName("bt.ob")
    public static long field1342 = 0L;

    @ObfuscatedName("bt.os")
    public static boolean field1343 = false;

    @ObfuscatedName("bt.oc")
    public static int field1349 = 20;

    @ObfuscatedName("bt.od")
    public static int field1346 = 1;

    @ObfuscatedName("bt.om")
    public static int field1345 = 0;

    @ObfuscatedName("bt.pn")
    public static long[] field1348 = new long[32];

    @ObfuscatedName("bt.pj")
    public static long[] field1350 = new long[32];

    @ObfuscatedName("bt.pr")
    public static volatile boolean field1341 = true;

    @ObfuscatedName("bt.px")
    public static int field1351 = 500;

    @ObfuscatedName("bt.pv")
    public static volatile boolean field1355 = false;

    @ObfuscatedName("bt.pe")
    public static volatile long field1353 = 0L;

    @ObfuscatedName("bt.pa")
    public static volatile boolean field1347 = true;

    @ObfuscatedName("bt.ox")
    public boolean field1344 = false;

    @ObfuscatedName("bt.nv(IIII)V")
    public final void method1389(int arg0, int arg1, int arg2) {
        try {
            if (field1352 != null) {
                field1354++;
                if (field1354 >= 3) {
                    this.method1388("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1352 = this;
            Statics.field416 = arg0;
            Statics.field933 = arg1;
            Statics.field1442 = arg2;
            Statics.field1439 = this;
            if (Statics.field362 == null) {
                Statics.field362 = new class74();
            }
            Statics.field362.method1463(this, 1);
        } catch (Exception var5) {
            class80.method173((String) null, var5);
            this.method1388("crash");
        }
    }

    @ObfuscatedName("bt.ni(B)V")
    public final synchronized void method1390() {
        Container var1;
        if (Statics.field1236 == null) {
            var1 = this;
        } else {
            var1 = Statics.field1236;
        }
        if (Statics.field869 != null) {
            Statics.field869.removeFocusListener(this);
            var1.remove(Statics.field869);
        }
        Statics.field869 = new class76(this);
        var1.add(Statics.field869);
        Statics.field869.setSize(Statics.field416, Statics.field933);
        Statics.field869.setVisible(true);
        if (Statics.field1236 == null) {
            Statics.field869.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field1236.getInsets();
            Statics.field869.setLocation(var2.left, var2.top);
        }
        Statics.field869.addFocusListener(this);
        Statics.field869.requestFocus();
        field1341 = true;
        field1355 = false;
        field1353 = class121.method2318();
    }

    @ObfuscatedName("bt.nl(I)Z")
    public final boolean method1391() {
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
                this.method1388("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1365 != null) {
                String var1 = Statics.field1365.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1358;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method1388("wrongjava");
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
                        boolean var7 = class148.method2888(var6, 10, true);
                        if (var7) {
                            int var8 = class148.method2674(var6, 10, true);
                            if (var8 < 10) {
                                this.method1388("wrongjava");
                                return;
                            }
                        }
                    }
                    field1346 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1390();
            int var9 = Statics.field416;
            int var10 = Statics.field933;
            Canvas var11 = Statics.field869;
            class85 var13;
            try {
                class88 var12 = new class88();
                var12.method1581(var9, var10, var11);
                var13 = var12;
            } catch (Throwable var24) {
                class83 var15 = new class83();
                var15.method1581(var9, var10, var11);
                var13 = var15;
            }
            Statics.field1541 = var13;
            this.method347();
            class68 var16;
            try {
                var16 = new class81();
            } catch (Throwable var23) {
                var16 = new class65();
            }
            Statics.field245 = var16;
            label99: while (true) {
                class74 var19;
                Canvas var20;
                do {
                    if (field1342 != 0L && class121.method2318() >= field1342) {
                        break label99;
                    }
                    Statics.field2425 = Statics.field245.method1322(field1349, field1346);
                    for (int var18 = 0; var18 < Statics.field2425; var18++) {
                        this.method1393();
                    }
                    this.method1394();
                    var19 = Statics.field362;
                    var20 = Statics.field869;
                } while (var19.field1363 == null);
                for (int var21 = 0; var21 < 50 && var19.field1363.peekEvent() != null; var21++) {
                    class126.method874(1L);
                }
                if (var20 != null) {
                    var19.field1363.postEvent(new ActionEvent(var20, 1001, "dummy"));
                }
            }
        } catch (Exception var25) {
            class80.method173((String) null, var25);
            this.method1388("crash");
        }
        this.method1395();
    }

    @ObfuscatedName("bt.nr(B)V")
    public void method1393() {
        long var1 = class121.method2318();
        long var3 = field1350[Statics.field1373];
        field1350[Statics.field1373] = var1;
        Statics.field1373 = Statics.field1373 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field900 = field1347;
        }
        this.method271();
    }

    @ObfuscatedName("bt.nj(I)V")
    public void method1394() {
        long var1 = class121.method2318();
        long var3 = field1348[Statics.field1121];
        field1348[Statics.field1121] = var1;
        Statics.field1121 = Statics.field1121 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field1345 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field1351 - 1 > 50) {
            field1351 -= 50;
            field1341 = true;
            Statics.field869.setSize(Statics.field416, Statics.field933);
            Statics.field869.setVisible(true);
            if (Statics.field1236 == null) {
                Statics.field869.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field1236.getInsets();
                Statics.field869.setLocation(var6.left, var6.top);
            }
        }
        this.method300();
    }

    @ObfuscatedName("bt.nu(I)V")
    public final synchronized void method1395() {
        if (field1343) {
            return;
        }
        field1343 = true;
        try {
            Statics.field869.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method508();
        } catch (Exception var7) {
        }
        if (Statics.field1236 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field362 != null) {
            try {
                Statics.field362.method1462();
            } catch (Exception var5) {
            }
        }
        this.method309();
    }

    @ObfuscatedName("x.nt(B)V")
    public static final void method151() {
        Statics.field245.method1321();
        for (int var0 = 0; var0 < 32; var0++) {
            field1348[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field1350[var1] = 0L;
        }
        Statics.field2425 = 0;
    }

    public void start() {
        if (field1352 == this && !field1343) {
            field1342 = 0L;
        }
    }

    public void stop() {
        if (field1352 == this && !field1343) {
            field1342 = class121.method2318() + 4000L;
        }
    }

    public void destroy() {
        if (field1352 == this && !field1343) {
            field1342 = class121.method2318();
            class126.method874(5000L);
            this.method1395();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1352 != this || field1343) {
            return;
        }
        field1341 = true;
        if (Statics.field1358 != null && Statics.field1358.startsWith("1.5") && class121.method2318() - field1353 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field416 && var2.height >= Statics.field933) {
                field1355 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1347 = true;
        field1341 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1347 = false;
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

    @ObfuscatedName("bo.nw(ILjava/lang/String;Ljava/awt/Color;B)V")
    public static final void method1254(int arg0, String arg1, Color arg2) {
        try {
            Graphics var3 = Statics.field869.getGraphics();
            if (Statics.field314 == null) {
                Statics.field314 = new Font("Helvetica", 1, 13);
                Statics.field126 = Statics.field869.getFontMetrics(Statics.field314);
            }
            if (field1341) {
                field1341 = false;
                var3.setColor(Color.black);
                var3.fillRect(0, 0, Statics.field416, Statics.field933);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field2501 == null) {
                    Statics.field2501 = Statics.field869.createImage(304, 34);
                }
                Graphics var4 = Statics.field2501.getGraphics();
                var4.setColor(arg2);
                var4.drawRect(0, 0, 303, 33);
                var4.fillRect(2, 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(1, 1, 301, 31);
                var4.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field314);
                var4.setColor(Color.white);
                var4.drawString(arg1, (304 - Statics.field126.stringWidth(arg1)) / 2, 22);
                var3.drawImage(Statics.field2501, Statics.field416 / 2 - 152, Statics.field933 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var6 = Statics.field416 / 2 - 152;
                int var7 = Statics.field933 / 2 - 18;
                var3.setColor(arg2);
                var3.drawRect(var6, var7, 303, 33);
                var3.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var3.setColor(Color.black);
                var3.drawRect(var6 + 1, var7 + 1, 301, 31);
                var3.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var3.setFont(Statics.field314);
                var3.setColor(Color.white);
                var3.drawString(arg1, var6 + (304 - Statics.field126.stringWidth(arg1)) / 2, var7 + 22);
            }
        } catch (Exception var10) {
            Statics.field869.repaint();
        }
    }

    @ObfuscatedName("bt.na(Ljava/lang/String;I)V")
    public void method1388(String arg0) {
        if (this.field1344) {
            return;
        }
        this.field1344 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    public abstract void init();

    @ObfuscatedName("bt.t(I)V")
    public abstract void method271();

    @ObfuscatedName("bt.v(S)V")
    public abstract void method300();

    @ObfuscatedName("bt.y(I)V")
    public abstract void method508();

    @ObfuscatedName("bt.i(I)V")
    public abstract void method309();

    @ObfuscatedName("bt.q(B)V")
    public abstract void method347();
}
