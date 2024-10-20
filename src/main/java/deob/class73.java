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

@ObfuscatedName("by")
public abstract class class73 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("by.oj")
    public static class73 field1330 = null;

    @ObfuscatedName("by.oi")
    public static int field1335 = 0;

    @ObfuscatedName("by.og")
    public static long field1332 = 0L;

    @ObfuscatedName("by.ou")
    public static boolean field1334 = false;

    @ObfuscatedName("by.oz")
    public static int field1333 = 20;

    @ObfuscatedName("by.of")
    public static int field1336 = 1;

    @ObfuscatedName("by.os")
    public static int field1337 = 0;

    @ObfuscatedName("by.pf")
    public static long[] field1331 = new long[32];

    @ObfuscatedName("by.pe")
    public static long[] field1339 = new long[32];

    @ObfuscatedName("by.pq")
    public static volatile boolean field1340 = true;

    @ObfuscatedName("by.px")
    public static int field1341 = 500;

    @ObfuscatedName("by.pk")
    public static volatile boolean field1342 = false;

    @ObfuscatedName("by.pv")
    public static volatile long field1343 = 0L;

    @ObfuscatedName("by.pu")
    public static volatile boolean field1338 = true;

    @ObfuscatedName("by.od")
    public boolean field1344 = false;

    @ObfuscatedName("by.ns(IIII)V")
    public final void method1420(int arg0, int arg1, int arg2) {
        try {
            if (field1330 != null) {
                field1335++;
                if (field1335 >= 3) {
                    this.method1387("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1330 = this;
            Statics.field2471 = arg0;
            Statics.field922 = arg1;
            Statics.field1435 = arg2;
            Statics.field1440 = this;
            if (Statics.field2466 == null) {
                Statics.field2466 = new class74();
            }
            Statics.field2466.method1455(this, 1);
        } catch (Exception var5) {
            class80.method252((String) null, var5);
            this.method1387("crash");
        }
    }

    @ObfuscatedName("by.na(S)V")
    public final synchronized void method1378() {
        Container var1;
        if (Statics.field1275 == null) {
            var1 = this;
        } else {
            var1 = Statics.field1275;
        }
        if (Statics.field962 != null) {
            Statics.field962.removeFocusListener(this);
            var1.remove(Statics.field962);
        }
        Statics.field962 = new class76(this);
        var1.add(Statics.field962);
        Statics.field962.setSize(Statics.field2471, Statics.field922);
        Statics.field962.setVisible(true);
        if (Statics.field1275 == null) {
            Statics.field962.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field1275.getInsets();
            Statics.field962.setLocation(var2.left, var2.top);
        }
        Statics.field962.addFocusListener(this);
        Statics.field962.requestFocus();
        field1340 = true;
        field1342 = false;
        field1343 = class121.method2124();
    }

    @ObfuscatedName("by.nw(B)Z")
    public final boolean method1397() {
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
                this.method1387("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1762 != null) {
                String var1 = Statics.field1762.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1352;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method1387("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class147.method1195(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        boolean var5 = false;
                        boolean var6 = false;
                        int var7 = 0;
                        int var8 = var4.length();
                        int var9 = 0;
                        boolean var11;
                        while (true) {
                            if (var9 >= var8) {
                                var11 = var6;
                                break;
                            }
                            label186: {
                                char var10 = var4.charAt(var9);
                                if (var9 == 0) {
                                    if (var10 == '-') {
                                        var5 = true;
                                        break label186;
                                    }
                                    if (var10 == '+') {
                                        break label186;
                                    }
                                }
                                int var20;
                                if (var10 >= '0' && var10 <= '9') {
                                    var20 = var10 - '0';
                                } else if (var10 >= 'A' && var10 <= 'Z') {
                                    var20 = var10 - '7';
                                } else {
                                    if (var10 < 'a' || var10 > 'z') {
                                        var11 = false;
                                        break;
                                    }
                                    var20 = var10 - 'W';
                                }
                                if (var20 >= 10) {
                                    var11 = false;
                                    break;
                                }
                                if (var5) {
                                    var20 = -var20;
                                }
                                int var12 = var7 * 10 + var20;
                                if (var12 / 10 != var7) {
                                    var11 = false;
                                    break;
                                }
                                var7 = var12;
                                var6 = true;
                            }
                            var9++;
                        }
                        if (var11 && class147.method69(var4) < 10) {
                            this.method1387("wrongjava");
                            return;
                        }
                    }
                    field1336 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1378();
            Statics.field379 = class85.method178(Statics.field2471, Statics.field922, Statics.field962);
            this.method345();
            Statics.field1400 = class68.method2660();
            label104: while (true) {
                class74 var15;
                Canvas var16;
                do {
                    if (field1332 != 0L && class121.method2124() >= field1332) {
                        break label104;
                    }
                    Statics.field1232 = Statics.field1400.method1297(field1333, field1336);
                    for (int var14 = 0; var14 < Statics.field1232; var14++) {
                        this.method1380();
                    }
                    this.method1381();
                    var15 = Statics.field2466;
                    var16 = Statics.field962;
                } while (var15.field1354 == null);
                for (int var17 = 0; var17 < 50 && var15.field1354.peekEvent() != null; var17++) {
                    class126.method1489(1L);
                }
                if (var16 != null) {
                    var15.field1354.postEvent(new ActionEvent(var16, 1001, "dummy"));
                }
            }
        } catch (Exception var19) {
            class80.method252((String) null, var19);
            this.method1387("crash");
        }
        this.method1385();
    }

    @ObfuscatedName("by.ni(B)V")
    public void method1380() {
        long var1 = class121.method2124();
        long var3 = field1339[Statics.field1187];
        field1339[Statics.field1187] = var1;
        Statics.field1187 = Statics.field1187 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field237 = field1338;
        }
        this.method373();
    }

    @ObfuscatedName("by.nl(B)V")
    public void method1381() {
        long var1 = class121.method2124();
        long var3 = field1331[Statics.field1452];
        field1331[Statics.field1452] = var1;
        Statics.field1452 = Statics.field1452 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field1337 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field1341 - 1 > 50) {
            field1341 -= 50;
            field1340 = true;
            Statics.field962.setSize(Statics.field2471, Statics.field922);
            Statics.field962.setVisible(true);
            if (Statics.field1275 == null) {
                Statics.field962.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field1275.getInsets();
                Statics.field962.setLocation(var6.left, var6.top);
            }
        }
        this.method278();
    }

    @ObfuscatedName("by.nx(I)V")
    public final synchronized void method1385() {
        if (field1334) {
            return;
        }
        field1334 = true;
        try {
            Statics.field962.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method362();
        } catch (Exception var7) {
        }
        if (Statics.field1275 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field2466 != null) {
            try {
                Statics.field2466.method1446();
            } catch (Exception var5) {
            }
        }
        this.method273();
    }

    @ObfuscatedName("o.nc(I)V")
    public static final void method141() {
        Statics.field1400.method1298();
        for (int var0 = 0; var0 < 32; var0++) {
            field1331[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field1339[var1] = 0L;
        }
        Statics.field1232 = 0;
    }

    public void start() {
        if (field1330 == this && !field1334) {
            field1332 = 0L;
        }
    }

    public void stop() {
        if (field1330 == this && !field1334) {
            field1332 = class121.method2124() + 4000L;
        }
    }

    public void destroy() {
        if (field1330 == this && !field1334) {
            field1332 = class121.method2124();
            class126.method1489(5000L);
            this.method1385();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1330 != this || field1334) {
            return;
        }
        field1340 = true;
        if (Statics.field1352 != null && Statics.field1352.startsWith("1.5") && class121.method2124() - field1343 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field2471 && var2.height >= Statics.field922) {
                field1342 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1338 = true;
        field1340 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1338 = false;
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

    @ObfuscatedName("a.nv(ILjava/lang/String;Ljava/awt/Color;S)V")
    public static final void method28(int arg0, String arg1, Color arg2) {
        try {
            Graphics var3 = Statics.field962.getGraphics();
            if (Statics.field1265 == null) {
                Statics.field1265 = new Font("Helvetica", 1, 13);
                Statics.field388 = Statics.field962.getFontMetrics(Statics.field1265);
            }
            if (field1340) {
                field1340 = false;
                var3.setColor(Color.black);
                var3.fillRect(0, 0, Statics.field2471, Statics.field922);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field346 == null) {
                    Statics.field346 = Statics.field962.createImage(304, 34);
                }
                Graphics var4 = Statics.field346.getGraphics();
                var4.setColor(arg2);
                var4.drawRect(0, 0, 303, 33);
                var4.fillRect(2, 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(1, 1, 301, 31);
                var4.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1265);
                var4.setColor(Color.white);
                var4.drawString(arg1, (304 - Statics.field388.stringWidth(arg1)) / 2, 22);
                var3.drawImage(Statics.field346, Statics.field2471 / 2 - 152, Statics.field922 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var6 = Statics.field2471 / 2 - 152;
                int var7 = Statics.field922 / 2 - 18;
                var3.setColor(arg2);
                var3.drawRect(var6, var7, 303, 33);
                var3.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var3.setColor(Color.black);
                var3.drawRect(var6 + 1, var7 + 1, 301, 31);
                var3.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var3.setFont(Statics.field1265);
                var3.setColor(Color.white);
                var3.drawString(arg1, var6 + (304 - Statics.field388.stringWidth(arg1)) / 2, var7 + 22);
            }
        } catch (Exception var10) {
            Statics.field962.repaint();
        }
    }

    @ObfuscatedName("by.nt(Ljava/lang/String;I)V")
    public void method1387(String arg0) {
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

    @ObfuscatedName("by.a(I)V")
    public abstract void method273();

    @ObfuscatedName("by.q(I)V")
    public abstract void method345();

    public abstract void init();

    @ObfuscatedName("by.b(I)V")
    public abstract void method373();

    @ObfuscatedName("by.u(I)V")
    public abstract void method278();

    @ObfuscatedName("by.d(S)V")
    public abstract void method362();
}
