package deob;

import java.applet.Applet;
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

    @ObfuscatedName("ba.ow")
    public static class73 field1359 = null;

    @ObfuscatedName("ba.oj")
    public static int field1350 = 0;

    @ObfuscatedName("ba.os")
    public static long field1346 = 0L;

    @ObfuscatedName("ba.oo")
    public static boolean field1354 = false;

    @ObfuscatedName("ba.ot")
    public static int field1351 = 20;

    @ObfuscatedName("ba.oy")
    public static int field1352 = 1;

    @ObfuscatedName("ba.od")
    public static int field1353 = 0;

    @ObfuscatedName("ba.po")
    public static long[] field1347 = new long[32];

    @ObfuscatedName("ba.pe")
    public static long[] field1355 = new long[32];

    @ObfuscatedName("ba.pp")
    public static volatile boolean field1356 = true;

    @ObfuscatedName("ba.pb")
    public static int field1357 = 500;

    @ObfuscatedName("ba.pq")
    public static volatile boolean field1348 = false;

    @ObfuscatedName("ba.pk")
    public static volatile long field1360 = 0L;

    @ObfuscatedName("ba.pv")
    public static volatile boolean field1358 = true;

    @ObfuscatedName("ba.og")
    public boolean field1349 = false;

    @ObfuscatedName("ba.or(IIIB)V")
    public final void method1453(int arg0, int arg1, int arg2) {
        try {
            if (field1359 != null) {
                field1350++;
                if (field1350 >= 3) {
                    this.method1444("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1359 = this;
            Statics.field2062 = arg0;
            Statics.field201 = arg1;
            Statics.field1056 = arg2;
            Statics.field1461 = this;
            if (Statics.field1405 == null) {
                Statics.field1405 = new class74();
            }
            Statics.field1405.method1515(this, 1);
        } catch (Exception var5) {
            class80.method3170((String) null, var5);
            this.method1444("crash");
        }
    }

    @ObfuscatedName("ba.ok(I)V")
    public final synchronized void method1435() {
        Container var1;
        if (Statics.field321 == null) {
            var1 = this;
        } else {
            var1 = Statics.field321;
        }
        if (Statics.field775 != null) {
            Statics.field775.removeFocusListener(this);
            var1.remove(Statics.field775);
        }
        Statics.field775 = new class76(this);
        var1.add(Statics.field775);
        Statics.field775.setSize(Statics.field2062, Statics.field201);
        Statics.field775.setVisible(true);
        if (Statics.field321 == null) {
            Statics.field775.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field321.getInsets();
            Statics.field775.setLocation(var2.left, var2.top);
        }
        Statics.field775.addFocusListener(this);
        Statics.field775.requestFocus();
        field1356 = true;
        field1348 = false;
        field1360 = class121.method2693();
    }

    @ObfuscatedName("ba.oc(I)Z")
    public final boolean method1454() {
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
                this.method1444("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1374 != null) {
                String var1 = Statics.field1374.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1366;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method1444("wrongjava");
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
                        boolean var7 = class147.method174(var6, 10, true);
                        if (var7 && class147.method68(var6) < 10) {
                            this.method1444("wrongjava");
                            return;
                        }
                    }
                    field1352 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1435();
            Statics.field83 = class85.method1536(Statics.field2062, Statics.field201, Statics.field775);
            this.method370();
            Statics.field385 = class68.method1416();
            while (field1346 == 0L || class121.method2693() < field1346) {
                Statics.field824 = Statics.field385.method1361(field1351, field1352);
                for (int var8 = 0; var8 < Statics.field824; var8++) {
                    this.method1471();
                }
                this.method1443();
                class69.method564(Statics.field1405, Statics.field775);
            }
        } catch (Exception var10) {
            class80.method3170((String) null, var10);
            this.method1444("crash");
        }
        this.method1439();
    }

    @ObfuscatedName("ba.ow(B)V")
    public void method1471() {
        long var1 = class121.method2693();
        long var3 = field1355[Statics.field1874];
        field1355[Statics.field1874] = var1;
        Statics.field1874 = Statics.field1874 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field102 = field1358;
        }
        this.method269();
    }

    @ObfuscatedName("ba.oj(I)V")
    public void method1443() {
        long var1 = class121.method2693();
        long var3 = field1347[Statics.field996];
        field1347[Statics.field996] = var1;
        Statics.field996 = Statics.field996 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field1353 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field1357 - 1 > 50) {
            field1357 -= 50;
            field1356 = true;
            Statics.field775.setSize(Statics.field2062, Statics.field201);
            Statics.field775.setVisible(true);
            if (Statics.field321 == null) {
                Statics.field775.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field321.getInsets();
                Statics.field775.setLocation(var6.left, var6.top);
            }
        }
        this.method392();
    }

    @ObfuscatedName("ba.os(I)V")
    public final synchronized void method1439() {
        if (field1354) {
            return;
        }
        field1354 = true;
        try {
            Statics.field775.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method282();
        } catch (Exception var7) {
        }
        if (Statics.field321 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1405 != null) {
            try {
                Statics.field1405.method1522();
            } catch (Exception var5) {
            }
        }
        this.method393();
    }

    public void start() {
        if (field1359 == this && !field1354) {
            field1346 = 0L;
        }
    }

    public void stop() {
        if (field1359 == this && !field1354) {
            field1346 = class121.method2693() + 4000L;
        }
    }

    public void destroy() {
        if (field1359 == this && !field1354) {
            field1346 = class121.method2693();
            class126.method3086(5000L);
            this.method1439();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1359 != this || field1354) {
            return;
        }
        field1356 = true;
        if (Statics.field1366 != null && Statics.field1366.startsWith("1.5") && class121.method2693() - field1360 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field2062 && var2.height >= Statics.field201) {
                field1348 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1358 = true;
        field1356 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1358 = false;
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

    @ObfuscatedName("o.oo(ILjava/lang/String;Ljava/awt/Color;B)V")
    public static final void method158(int arg0, String arg1, Color arg2) {
        try {
            Graphics var3 = Statics.field775.getGraphics();
            if (Statics.field1073 == null) {
                Statics.field1073 = new Font("Helvetica", 1, 13);
                Statics.field790 = Statics.field775.getFontMetrics(Statics.field1073);
            }
            if (field1356) {
                field1356 = false;
                var3.setColor(Color.black);
                var3.fillRect(0, 0, Statics.field2062, Statics.field201);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field118 == null) {
                    Statics.field118 = Statics.field775.createImage(304, 34);
                }
                Graphics var4 = Statics.field118.getGraphics();
                var4.setColor(arg2);
                var4.drawRect(0, 0, 303, 33);
                var4.fillRect(2, 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(1, 1, 301, 31);
                var4.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1073);
                var4.setColor(Color.white);
                var4.drawString(arg1, (304 - Statics.field790.stringWidth(arg1)) / 2, 22);
                var3.drawImage(Statics.field118, Statics.field2062 / 2 - 152, Statics.field201 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var6 = Statics.field2062 / 2 - 152;
                int var7 = Statics.field201 / 2 - 18;
                var3.setColor(arg2);
                var3.drawRect(var6, var7, 303, 33);
                var3.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var3.setColor(Color.black);
                var3.drawRect(var6 + 1, var7 + 1, 301, 31);
                var3.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var3.setFont(Statics.field1073);
                var3.setColor(Color.white);
                var3.drawString(arg1, var6 + (304 - Statics.field790.stringWidth(arg1)) / 2, var7 + 22);
            }
        } catch (Exception var10) {
            Statics.field775.repaint();
        }
    }

    @ObfuscatedName("cs.og(B)V")
    public static final void method1608() {
        Statics.field118 = null;
        Statics.field1073 = null;
        Statics.field790 = null;
    }

    @ObfuscatedName("ba.oe(Ljava/lang/String;B)V")
    public void method1444(String arg0) {
        if (this.field1349) {
            return;
        }
        this.field1349 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ba.y(B)V")
    public abstract void method282();

    public abstract void init();

    @ObfuscatedName("ba.b(I)V")
    public abstract void method370();

    @ObfuscatedName("ba.p(I)V")
    public abstract void method392();

    @ObfuscatedName("ba.c(I)V")
    public abstract void method393();

    @ObfuscatedName("ba.i(B)V")
    public abstract void method269();
}
