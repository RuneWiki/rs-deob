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

@ObfuscatedName("bi")
public abstract class class73 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bi.oh")
    public static class73 field1319 = null;

    @ObfuscatedName("bi.oz")
    public static int field1304 = 0;

    @ObfuscatedName("bi.ou")
    public static long field1305 = 0L;

    @ObfuscatedName("bi.oy")
    public static boolean field1314 = false;

    @ObfuscatedName("bi.ov")
    public static int field1308 = 20;

    @ObfuscatedName("bi.ok")
    public static int field1309 = 1;

    @ObfuscatedName("bi.ox")
    public static int field1312 = 0;

    @ObfuscatedName("bi.pb")
    public static long[] field1311 = new long[32];

    @ObfuscatedName("bi.pp")
    public static long[] field1303 = new long[32];

    @ObfuscatedName("bi.pa")
    public static volatile boolean field1315 = true;

    @ObfuscatedName("bi.pu")
    public static int field1306 = 500;

    @ObfuscatedName("bi.pw")
    public static volatile boolean field1316 = false;

    @ObfuscatedName("bi.pt")
    public static volatile long field1317 = 0L;

    @ObfuscatedName("bi.pk")
    public static volatile boolean field1318 = true;

    @ObfuscatedName("bi.og")
    public boolean field1307 = false;

    @ObfuscatedName("bi.nu(IIIB)V")
    public final void method1425(int arg0, int arg1, int arg2) {
        try {
            if (field1319 != null) {
                field1304++;
                if (field1304 >= 3) {
                    this.method1447("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1319 = this;
            Statics.field359 = arg0;
            Statics.field57 = arg1;
            Statics.field1400 = arg2;
            Statics.field1408 = this;
            if (Statics.field1295 == null) {
                Statics.field1295 = new class74();
            }
            Statics.field1295.method1521(this, 1);
        } catch (Exception var5) {
            class80.method1330((String) null, var5);
            this.method1447("crash");
        }
    }

    @ObfuscatedName("bi.np(I)V")
    public final synchronized void method1426() {
        Container var1;
        if (Statics.field2359 == null) {
            var1 = this;
        } else {
            var1 = Statics.field2359;
        }
        if (Statics.field2789 != null) {
            Statics.field2789.removeFocusListener(this);
            var1.remove(Statics.field2789);
        }
        Statics.field2789 = new class76(this);
        var1.add(Statics.field2789);
        Statics.field2789.setSize(Statics.field359, Statics.field57);
        Statics.field2789.setVisible(true);
        if (Statics.field2359 == null) {
            Statics.field2789.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field2359.getInsets();
            Statics.field2789.setLocation(var2.left, var2.top);
        }
        Statics.field2789.addFocusListener(this);
        Statics.field2789.requestFocus();
        field1315 = true;
        field1316 = false;
        field1317 = class121.method226();
    }

    @ObfuscatedName("bi.nl(I)Z")
    public final boolean method1472() {
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
            if (Statics.field1330 != null) {
                String var1 = Statics.field1330.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2739;
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
                        if (class148.method10(var6) && class148.method4(var6) < 10) {
                            this.method1447("wrongjava");
                            return;
                        }
                    }
                    field1309 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1426();
            Statics.field417 = class85.method171(Statics.field359, Statics.field57, Statics.field2789);
            this.method365();
            class68 var7;
            try {
                var7 = new class81();
            } catch (Throwable var14) {
                var7 = new class65();
            }
            Statics.field107 = var7;
            label91: while (true) {
                class74 var10;
                Canvas var11;
                do {
                    if (field1305 != 0L && class121.method226() >= field1305) {
                        break label91;
                    }
                    Statics.field351 = Statics.field107.method1354(field1308, field1309);
                    for (int var9 = 0; var9 < Statics.field351; var9++) {
                        this.method1428();
                    }
                    this.method1429();
                    var10 = Statics.field1295;
                    var11 = Statics.field2789;
                } while (var10.field1326 == null);
                for (int var12 = 0; var12 < 50 && var10.field1326.peekEvent() != null; var12++) {
                    class126.method2355(1L);
                }
                if (var11 != null) {
                    var10.field1326.postEvent(new ActionEvent(var11, 1001, "dummy"));
                }
            }
        } catch (Exception var15) {
            class80.method1330((String) null, var15);
            this.method1447("crash");
        }
        this.method1430();
    }

    @ObfuscatedName("bi.nc(I)V")
    public void method1428() {
        long var1 = class121.method226();
        long var3 = field1303[Statics.field342];
        field1303[Statics.field342] = var1;
        Statics.field342 = Statics.field342 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field206 = field1318;
        }
        this.method273();
    }

    @ObfuscatedName("bi.ny(B)V")
    public void method1429() {
        long var1 = class121.method226();
        long var3 = field1311[Statics.field136];
        field1311[Statics.field136] = var1;
        Statics.field136 = Statics.field136 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field1312 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field1306 - 1 > 50) {
            field1306 -= 50;
            field1315 = true;
            Statics.field2789.setSize(Statics.field359, Statics.field57);
            Statics.field2789.setVisible(true);
            if (Statics.field2359 == null) {
                Statics.field2789.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field2359.getInsets();
                Statics.field2789.setLocation(var6.left, var6.top);
            }
        }
        this.method294();
    }

    @ObfuscatedName("bi.nj(I)V")
    public final synchronized void method1430() {
        if (field1314) {
            return;
        }
        field1314 = true;
        try {
            Statics.field2789.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method356();
        } catch (Exception var7) {
        }
        if (Statics.field2359 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1295 != null) {
            try {
                Statics.field1295.method1501();
            } catch (Exception var5) {
            }
        }
        this.method269();
    }

    public void start() {
        if (field1319 == this && !field1314) {
            field1305 = 0L;
        }
    }

    public void stop() {
        if (field1319 == this && !field1314) {
            field1305 = class121.method226() + 4000L;
        }
    }

    public void destroy() {
        if (field1319 == this && !field1314) {
            field1305 = class121.method226();
            class126.method2355(5000L);
            this.method1430();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1319 != this || field1314) {
            return;
        }
        field1315 = true;
        if (Statics.field2739 != null && Statics.field2739.startsWith("1.5") && class121.method226() - field1317 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field359 && var2.height >= Statics.field57) {
                field1316 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1318 = true;
        field1315 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1318 = false;
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

    @ObfuscatedName("ap.ni(ILjava/lang/String;Ljava/awt/Color;I)V")
    public static final void method792(int arg0, String arg1, Color arg2) {
        try {
            Graphics var3 = Statics.field2789.getGraphics();
            if (Statics.field902 == null) {
                Statics.field902 = new Font("Helvetica", 1, 13);
                Statics.field1313 = Statics.field2789.getFontMetrics(Statics.field902);
            }
            if (field1315) {
                field1315 = false;
                var3.setColor(Color.black);
                var3.fillRect(0, 0, Statics.field359, Statics.field57);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field54 == null) {
                    Statics.field54 = Statics.field2789.createImage(304, 34);
                }
                Graphics var4 = Statics.field54.getGraphics();
                var4.setColor(arg2);
                var4.drawRect(0, 0, 303, 33);
                var4.fillRect(2, 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(1, 1, 301, 31);
                var4.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field902);
                var4.setColor(Color.white);
                var4.drawString(arg1, (304 - Statics.field1313.stringWidth(arg1)) / 2, 22);
                var3.drawImage(Statics.field54, Statics.field359 / 2 - 152, Statics.field57 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var6 = Statics.field359 / 2 - 152;
                int var7 = Statics.field57 / 2 - 18;
                var3.setColor(arg2);
                var3.drawRect(var6, var7, 303, 33);
                var3.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var3.setColor(Color.black);
                var3.drawRect(var6 + 1, var7 + 1, 301, 31);
                var3.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var3.setFont(Statics.field902);
                var3.setColor(Color.white);
                var3.drawString(arg1, var6 + (304 - Statics.field1313.stringWidth(arg1)) / 2, var7 + 22);
            }
        } catch (Exception var10) {
            Statics.field2789.repaint();
        }
    }

    @ObfuscatedName("s.nz(I)V")
    public static final void method30() {
        Statics.field54 = null;
        Statics.field902 = null;
        Statics.field1313 = null;
    }

    @ObfuscatedName("bi.nd(Ljava/lang/String;I)V")
    public void method1447(String arg0) {
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

    @ObfuscatedName("bi.k(B)V")
    public abstract void method356();

    public abstract void init();

    @ObfuscatedName("bi.o(I)V")
    public abstract void method365();

    @ObfuscatedName("bi.p(B)V")
    public abstract void method273();

    @ObfuscatedName("bi.x(B)V")
    public abstract void method294();

    @ObfuscatedName("bi.h(B)V")
    public abstract void method269();
}
