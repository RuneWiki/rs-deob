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

@ObfuscatedName("bc")
public abstract class class73 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bc.ow")
    public static class73 field1309 = null;

    @ObfuscatedName("bc.oy")
    public static int field1308 = 0;

    @ObfuscatedName("bc.oa")
    public static long field1321 = 0L;

    @ObfuscatedName("bc.ox")
    public static boolean field1315 = false;

    @ObfuscatedName("bc.oc")
    public static int field1312 = 20;

    @ObfuscatedName("bc.os")
    public static int field1313 = 1;

    @ObfuscatedName("bc.oi")
    public static int field1314 = 0;

    @ObfuscatedName("bc.or")
    public static long[] field1311 = new long[32];

    @ObfuscatedName("bc.pm")
    public static long[] field1316 = new long[32];

    @ObfuscatedName("bc.pv")
    public static volatile boolean field1318 = true;

    @ObfuscatedName("bc.pc")
    public static int field1319 = 500;

    @ObfuscatedName("bc.px")
    public static volatile boolean field1320 = false;

    @ObfuscatedName("bc.pf")
    public static volatile long field1310 = 0L;

    @ObfuscatedName("bc.pz")
    public static volatile boolean field1322 = true;

    @ObfuscatedName("bc.ov")
    public boolean field1307 = false;

    @ObfuscatedName("bc.ng(IIIB)V")
    public final void method1412(int arg0, int arg1, int arg2) {
        try {
            if (field1309 != null) {
                field1308++;
                if (field1308 >= 3) {
                    this.method1414("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1309 = this;
            Statics.field294 = arg0;
            Statics.field187 = arg1;
            Statics.field1269 = arg2;
            Statics.field1403 = this;
            if (Statics.field12 == null) {
                Statics.field12 = new class74();
            }
            Statics.field12.method1480(this, 1);
        } catch (Exception var5) {
            class80.method1557((String) null, var5);
            this.method1414("crash");
        }
    }

    @ObfuscatedName("bc.oe(I)V")
    public final synchronized void method1419() {
        Container var1;
        if (Statics.field1264 == null) {
            var1 = this;
        } else {
            var1 = Statics.field1264;
        }
        if (Statics.field194 != null) {
            Statics.field194.removeFocusListener(this);
            var1.remove(Statics.field194);
        }
        Statics.field194 = new class76(this);
        var1.add(Statics.field194);
        Statics.field194.setSize(Statics.field294, Statics.field187);
        Statics.field194.setVisible(true);
        if (Statics.field1264 == null) {
            Statics.field194.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field1264.getInsets();
            Statics.field194.setLocation(var2.left, var2.top);
        }
        Statics.field194.addFocusListener(this);
        Statics.field194.requestFocus();
        field1318 = true;
        field1320 = false;
        field1310 = class121.method2221();
    }

    @ObfuscatedName("bc.og(I)Z")
    public final boolean method1406() {
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
                this.method1414("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1326 != null) {
                String var1 = Statics.field1326.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1325;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method1414("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class148.method139(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class148.method2196(var4)) {
                            int var5 = class148.method205(var4, 10, true);
                            if (var5 < 10) {
                                this.method1414("wrongjava");
                                return;
                            }
                        }
                    }
                    field1313 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1419();
            Statics.field181 = class85.method214(Statics.field294, Statics.field187, Statics.field194);
            this.method265();
            Statics.field342 = class68.method248();
            label77: while (true) {
                class74 var7;
                Canvas var8;
                do {
                    if (field1321 != 0L && class121.method2221() >= field1321) {
                        break label77;
                    }
                    Statics.field899 = Statics.field342.method1330(field1312, field1313);
                    for (int var6 = 0; var6 < Statics.field899; var6++) {
                        this.method1407();
                    }
                    this.method1416();
                    var7 = Statics.field12;
                    var8 = Statics.field194;
                } while (var7.field1331 == null);
                for (int var9 = 0; var9 < 50 && var7.field1331.peekEvent() != null; var9++) {
                    class127.method686(1L);
                }
                if (var8 != null) {
                    var7.field1331.postEvent(new ActionEvent(var8, 1001, "dummy"));
                }
            }
        } catch (Exception var11) {
            class80.method1557((String) null, var11);
            this.method1414("crash");
        }
        this.method1408();
    }

    @ObfuscatedName("bc.od(I)V")
    public void method1407() {
        long var1 = class121.method2221();
        long var3 = field1316[Statics.field1243];
        field1316[Statics.field1243] = var1;
        Statics.field1243 = Statics.field1243 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field2730 = field1322;
        }
        this.method266();
    }

    @ObfuscatedName("bc.oz(I)V")
    public void method1416() {
        long var1 = class121.method2221();
        long var3 = field1311[Statics.field1810];
        field1311[Statics.field1810] = var1;
        Statics.field1810 = Statics.field1810 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field1314 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field1319 - 1 > 50) {
            field1319 -= 50;
            field1318 = true;
            Statics.field194.setSize(Statics.field294, Statics.field187);
            Statics.field194.setVisible(true);
            if (Statics.field1264 == null) {
                Statics.field194.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field1264.getInsets();
                Statics.field194.setLocation(var6.left, var6.top);
            }
        }
        this.method267();
    }

    @ObfuscatedName("bc.ot(I)V")
    public final synchronized void method1408() {
        if (field1315) {
            return;
        }
        field1315 = true;
        try {
            Statics.field194.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method434();
        } catch (Exception var7) {
        }
        if (Statics.field1264 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field12 != null) {
            try {
                Statics.field12.method1464();
            } catch (Exception var5) {
            }
        }
        this.method263();
    }

    @ObfuscatedName("ax.ok(I)V")
    public static final void method563() {
        Statics.field342.method1324();
        for (int var0 = 0; var0 < 32; var0++) {
            field1311[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field1316[var1] = 0L;
        }
        Statics.field899 = 0;
    }

    public void start() {
        if (field1309 == this && !field1315) {
            field1321 = 0L;
        }
    }

    public void stop() {
        if (field1309 == this && !field1315) {
            field1321 = class121.method2221() + 4000L;
        }
    }

    public void destroy() {
        if (field1309 == this && !field1315) {
            field1321 = class121.method2221();
            class127.method686(5000L);
            this.method1408();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1309 != this || field1315) {
            return;
        }
        field1318 = true;
        if (Statics.field1325 != null && Statics.field1325.startsWith("1.5") && class121.method2221() - field1310 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field294 && var2.height >= Statics.field187) {
                field1320 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1322 = true;
        field1318 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1322 = false;
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

    @ObfuscatedName("ds.oh(ILjava/lang/String;Ljava/awt/Color;B)V")
    public static final void method2327(int arg0, String arg1, Color arg2) {
        try {
            Graphics var3 = Statics.field194.getGraphics();
            if (Statics.field1995 == null) {
                Statics.field1995 = new Font("Helvetica", 1, 13);
                Statics.field1317 = Statics.field194.getFontMetrics(Statics.field1995);
            }
            if (field1318) {
                field1318 = false;
                var3.setColor(Color.black);
                var3.fillRect(0, 0, Statics.field294, Statics.field187);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field2020 == null) {
                    Statics.field2020 = Statics.field194.createImage(304, 34);
                }
                Graphics var4 = Statics.field2020.getGraphics();
                var4.setColor(arg2);
                var4.drawRect(0, 0, 303, 33);
                var4.fillRect(2, 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(1, 1, 301, 31);
                var4.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1995);
                var4.setColor(Color.white);
                var4.drawString(arg1, (304 - Statics.field1317.stringWidth(arg1)) / 2, 22);
                var3.drawImage(Statics.field2020, Statics.field294 / 2 - 152, Statics.field187 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var6 = Statics.field294 / 2 - 152;
                int var7 = Statics.field187 / 2 - 18;
                var3.setColor(arg2);
                var3.drawRect(var6, var7, 303, 33);
                var3.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var3.setColor(Color.black);
                var3.drawRect(var6 + 1, var7 + 1, 301, 31);
                var3.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var3.setFont(Statics.field1995);
                var3.setColor(Color.white);
                var3.drawString(arg1, var6 + (304 - Statics.field1317.stringWidth(arg1)) / 2, var7 + 22);
            }
        } catch (Exception var10) {
            Statics.field194.repaint();
        }
    }

    @ObfuscatedName("bc.on(Ljava/lang/String;I)V")
    public void method1414(String arg0) {
        if (this.field1307) {
            return;
        }
        this.field1307 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bc.f(I)V")
    public abstract void method265();

    @ObfuscatedName("bc.a(I)V")
    public abstract void method263();

    public abstract void init();

    @ObfuscatedName("bc.l(B)V")
    public abstract void method267();

    @ObfuscatedName("bc.d(I)V")
    public abstract void method434();

    @ObfuscatedName("bc.q(I)V")
    public abstract void method266();
}
