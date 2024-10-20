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

@ObfuscatedName("bt")
public abstract class class73 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bt.or")
    public static class73 field1323 = null;

    @ObfuscatedName("bt.oy")
    public static int field1317 = 0;

    @ObfuscatedName("bt.ow")
    public static long field1327 = 0L;

    @ObfuscatedName("bt.oj")
    public static boolean field1319 = false;

    @ObfuscatedName("bt.oc")
    public static int field1318 = 20;

    @ObfuscatedName("bt.oa")
    public static int field1322 = 1;

    @ObfuscatedName("bt.of")
    public static int field1333 = 0;

    @ObfuscatedName("bt.pr")
    public static long[] field1324 = new long[32];

    @ObfuscatedName("bt.pv")
    public static long[] field1316 = new long[32];

    @ObfuscatedName("bt.pg")
    public static volatile boolean field1326 = true;

    @ObfuscatedName("bt.pt")
    public static int field1325 = 500;

    @ObfuscatedName("bt.pu")
    public static volatile boolean field1328 = false;

    @ObfuscatedName("bt.ps")
    public static volatile long field1329 = 0L;

    @ObfuscatedName("bt.pq")
    public static volatile boolean field1330 = true;

    @ObfuscatedName("bt.ov")
    public boolean field1320 = false;

    @ObfuscatedName("bt.qd(IIII)V")
    public final void method1483(int arg0, int arg1, int arg2) {
        try {
            if (field1323 != null) {
                field1317++;
                if (field1317 >= 3) {
                    this.method1461("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1323 = this;
            Statics.field356 = arg0;
            Statics.field2556 = arg1;
            Statics.field1429 = arg2;
            Statics.field1425 = this;
            if (Statics.field895 == null) {
                Statics.field895 = new class74();
            }
            Statics.field895.method1521(this, 1);
        } catch (Exception var5) {
            class80.method1379((String) null, var5);
            this.method1461("crash");
        }
    }

    @ObfuscatedName("bt.qm(I)V")
    public final synchronized void method1452() {
        Container var1;
        if (Statics.field228 == null) {
            var1 = this;
        } else {
            var1 = Statics.field228;
        }
        if (Statics.field14 != null) {
            Statics.field14.removeFocusListener(this);
            var1.remove(Statics.field14);
        }
        Statics.field14 = new class76(this);
        var1.add(Statics.field14);
        Statics.field14.setSize(Statics.field356, Statics.field2556);
        Statics.field14.setVisible(true);
        if (Statics.field228 == null) {
            Statics.field14.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field228.getInsets();
            Statics.field14.setLocation(var2.left, var2.top);
        }
        Statics.field14.addFocusListener(this);
        Statics.field14.requestFocus();
        field1326 = true;
        field1328 = false;
        field1329 = class121.method711();
    }

    @ObfuscatedName("bt.qq(I)Z")
    public final boolean method1453() {
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
                this.method1461("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1340 != null) {
                String var1 = Statics.field1340.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1335;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method1461("wrongjava");
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
                        if (class147.method2339(var6) && class147.method2073(var6) < 10) {
                            this.method1461("wrongjava");
                            return;
                        }
                    }
                    field1322 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1452();
            int var7 = Statics.field356;
            int var8 = Statics.field2556;
            Canvas var9 = Statics.field14;
            class85 var11;
            try {
                class88 var10 = new class88();
                var10.method1641(var7, var8, var9);
                var11 = var10;
            } catch (Throwable var16) {
                class83 var13 = new class83();
                var13.method1641(var7, var8, var9);
                var11 = var13;
            }
            Statics.field1381 = var11;
            this.method246();
            Statics.field1237 = class68.method1217();
            while (field1327 == 0L || class121.method711() < field1327) {
                Statics.field141 = Statics.field1237.method1374(field1318, field1322);
                for (int var14 = 0; var14 < Statics.field141; var14++) {
                    this.method1455();
                }
                this.method1456();
                class69.method147(Statics.field895, Statics.field14);
            }
        } catch (Exception var17) {
            class80.method1379((String) null, var17);
            this.method1461("crash");
        }
        this.method1457();
    }

    @ObfuscatedName("bt.qp(I)V")
    public void method1455() {
        long var1 = class121.method711();
        long var3 = field1316[Statics.field1186];
        field1316[Statics.field1186] = var1;
        Statics.field1186 = Statics.field1186 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field393 = field1330;
        }
        this.method247();
    }

    @ObfuscatedName("bt.qg(B)V")
    public void method1456() {
        long var1 = class121.method711();
        long var3 = field1324[Statics.field1809];
        field1324[Statics.field1809] = var1;
        Statics.field1809 = Statics.field1809 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field1333 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field1325 - 1 > 50) {
            field1325 -= 50;
            field1326 = true;
            Statics.field14.setSize(Statics.field356, Statics.field2556);
            Statics.field14.setVisible(true);
            if (Statics.field228 == null) {
                Statics.field14.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field228.getInsets();
                Statics.field14.setLocation(var6.left, var6.top);
            }
        }
        this.method379();
    }

    @ObfuscatedName("bt.qs(I)V")
    public final synchronized void method1457() {
        if (field1319) {
            return;
        }
        field1319 = true;
        try {
            Statics.field14.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method249();
        } catch (Exception var7) {
        }
        if (Statics.field228 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field895 != null) {
            try {
                Statics.field895.method1531();
            } catch (Exception var5) {
            }
        }
        this.method244();
    }

    public void start() {
        if (field1323 == this && !field1319) {
            field1327 = 0L;
        }
    }

    public void stop() {
        if (field1323 == this && !field1319) {
            field1327 = class121.method711() + 4000L;
        }
    }

    public void destroy() {
        if (field1323 == this && !field1319) {
            field1327 = class121.method711();
            class126.method2420(5000L);
            this.method1457();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1323 != this || field1319) {
            return;
        }
        field1326 = true;
        if (Statics.field1335 != null && Statics.field1335.startsWith("1.5") && class121.method711() - field1329 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field356 && var2.height >= Statics.field2556) {
                field1328 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1330 = true;
        field1326 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1330 = false;
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

    @ObfuscatedName("bh.qa(ILjava/lang/String;Ljava/awt/Color;I)V")
    public static final void method1406(int arg0, String arg1, Color arg2) {
        try {
            Graphics var3 = Statics.field14.getGraphics();
            if (Statics.field864 == null) {
                Statics.field864 = new Font("Helvetica", 1, 13);
                Statics.field27 = Statics.field14.getFontMetrics(Statics.field864);
            }
            if (field1326) {
                field1326 = false;
                var3.setColor(Color.black);
                var3.fillRect(0, 0, Statics.field356, Statics.field2556);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field2704 == null) {
                    Statics.field2704 = Statics.field14.createImage(304, 34);
                }
                Graphics var4 = Statics.field2704.getGraphics();
                var4.setColor(arg2);
                var4.drawRect(0, 0, 303, 33);
                var4.fillRect(2, 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(1, 1, 301, 31);
                var4.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field864);
                var4.setColor(Color.white);
                var4.drawString(arg1, (304 - Statics.field27.stringWidth(arg1)) / 2, 22);
                var3.drawImage(Statics.field2704, Statics.field356 / 2 - 152, Statics.field2556 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var6 = Statics.field356 / 2 - 152;
                int var7 = Statics.field2556 / 2 - 18;
                var3.setColor(arg2);
                var3.drawRect(var6, var7, 303, 33);
                var3.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var3.setColor(Color.black);
                var3.drawRect(var6 + 1, var7 + 1, 301, 31);
                var3.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var3.setFont(Statics.field864);
                var3.setColor(Color.white);
                var3.drawString(arg1, var6 + (304 - Statics.field27.stringWidth(arg1)) / 2, var7 + 22);
            }
        } catch (Exception var10) {
            Statics.field14.repaint();
        }
    }

    @ObfuscatedName("bt.qk(Ljava/lang/String;B)V")
    public void method1461(String arg0) {
        if (this.field1320) {
            return;
        }
        this.field1320 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bt.o(I)V")
    public abstract void method244();

    public abstract void init();

    @ObfuscatedName("bt.l(I)V")
    public abstract void method246();

    @ObfuscatedName("bt.g(I)V")
    public abstract void method379();

    @ObfuscatedName("bt.x(B)V")
    public abstract void method249();

    @ObfuscatedName("bt.v(I)V")
    public abstract void method247();
}
