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

@ObfuscatedName("ee")
public abstract class class133 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ee.oz")
    public static class133 field2036 = null;

    @ObfuscatedName("ee.om")
    public static int field2044 = 0;

    @ObfuscatedName("ee.pv")
    public static long field2035 = 0L;

    @ObfuscatedName("ee.pf")
    public static boolean field2043 = false;

    @ObfuscatedName("ee.pg")
    public static int field2046 = 20;

    @ObfuscatedName("ee.ps")
    public static int field2039 = 1;

    @ObfuscatedName("ee.py")
    public static int field2040 = 0;

    @ObfuscatedName("ee.pn")
    public static long[] field2041 = new long[32];

    @ObfuscatedName("ee.pq")
    public static long[] field2042 = new long[32];

    @ObfuscatedName("ee.pa")
    public static volatile boolean field2034 = true;

    @ObfuscatedName("ee.pd")
    public static int field2038 = 500;

    @ObfuscatedName("ee.pr")
    public static volatile boolean field2045 = false;

    @ObfuscatedName("ee.pm")
    public static volatile long field2033 = 0L;

    @ObfuscatedName("ee.px")
    public static volatile boolean field2047 = true;

    @ObfuscatedName("ee.pt")
    public boolean field2037 = false;

    @ObfuscatedName("ee.oh(IIII)V")
    public final void method2618(int arg0, int arg1, int arg2) {
        try {
            if (field2036 != null) {
                field2044++;
                if (field2044 >= 3) {
                    this.method2627("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2036 = this;
            Statics.field1435 = arg0;
            Statics.field134 = arg1;
            Statics.field2061 = arg2;
            Statics.field2059 = this;
            if (Statics.field938 == null) {
                Statics.field938 = new class125();
            }
            Statics.field938.method2497(this, 1);
        } catch (Exception var5) {
            class137.method2490((String) null, var5);
            this.method2627("crash");
        }
    }

    @ObfuscatedName("ee.od(I)V")
    public final synchronized void method2619() {
        Container var1;
        if (Statics.field1058 == null) {
            var1 = this;
        } else {
            var1 = Statics.field1058;
        }
        if (Statics.field171 != null) {
            Statics.field171.removeFocusListener(this);
            var1.remove(Statics.field171);
        }
        Statics.field171 = new class128(this);
        var1.add(Statics.field171);
        Statics.field171.setSize(Statics.field1435, Statics.field134);
        Statics.field171.setVisible(true);
        if (Statics.field1058 == null) {
            Statics.field171.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field1058.getInsets();
            Statics.field171.setLocation(var2.left, var2.top);
        }
        Statics.field171.addFocusListener(this);
        Statics.field171.requestFocus();
        field2034 = true;
        field2045 = false;
        field2033 = class104.method2616();
    }

    @ObfuscatedName("ee.ol(B)Z")
    public final boolean method2620() {
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
                this.method2627("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1944 != null) {
                String var1 = Statics.field1944.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1932;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2627("wrongjava");
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
                        if (class211.method3387(var6)) {
                            int var7 = class211.method1865(var6, 10, true);
                            if (var7 < 10) {
                                this.method2627("wrongjava");
                                return;
                            }
                        }
                    }
                    field2039 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2619();
            int var8 = Statics.field1435;
            int var9 = Statics.field134;
            Canvas var10 = Statics.field171;
            class72 var12;
            try {
                class76 var11 = new class76();
                var11.method1353(var8, var9, var10);
                var12 = var11;
            } catch (Throwable var23) {
                class70 var14 = new class70();
                var14.method1353(var8, var9, var10);
                var12 = var14;
            }
            Statics.field1830 = var12;
            this.method172();
            class122 var15;
            try {
                var15 = new class136();
            } catch (Throwable var22) {
                var15 = new class130();
            }
            Statics.field697 = var15;
            label99: while (true) {
                class125 var18;
                Canvas var19;
                do {
                    if (field2035 != 0L && class104.method2616() >= field2035) {
                        break label99;
                    }
                    Statics.field2932 = Statics.field697.method2464(field2046, field2039);
                    for (int var17 = 0; var17 < Statics.field2932; var17++) {
                        this.method2628();
                    }
                    this.method2684();
                    var18 = Statics.field938;
                    var19 = Statics.field171;
                } while (var18.field1938 == null);
                for (int var20 = 0; var20 < 50 && var18.field1938.peekEvent() != null; var20++) {
                    class116.method71(1L);
                }
                if (var19 != null) {
                    var18.field1938.postEvent(new ActionEvent(var19, 1001, "dummy"));
                }
            }
        } catch (Exception var24) {
            class137.method2490((String) null, var24);
            this.method2627("crash");
        }
        this.method2674();
    }

    @ObfuscatedName("ee.ot(I)V")
    public void method2628() {
        long var1 = class104.method2616();
        long var3 = field2042[Statics.field1114];
        field2042[Statics.field1114] = var1;
        Statics.field1114 = Statics.field1114 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1804 = field2047;
        }
        this.method173();
    }

    @ObfuscatedName("ee.oz(I)V")
    public void method2684() {
        long var1 = class104.method2616();
        long var3 = field2041[Statics.field1915];
        field2041[Statics.field1915] = var1;
        Statics.field1915 = Statics.field1915 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field2040 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field2038 - 1 > 50) {
            field2038 -= 50;
            field2034 = true;
            Statics.field171.setSize(Statics.field1435, Statics.field134);
            Statics.field171.setVisible(true);
            if (Statics.field1058 == null) {
                Statics.field171.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field1058.getInsets();
                Statics.field171.setLocation(var6.left, var6.top);
            }
        }
        this.method174();
    }

    @ObfuscatedName("ee.om(I)V")
    public final synchronized void method2674() {
        if (field2043) {
            return;
        }
        field2043 = true;
        try {
            Statics.field171.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method450();
        } catch (Exception var7) {
        }
        if (Statics.field1058 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field938 != null) {
            try {
                Statics.field938.method2521();
            } catch (Exception var5) {
            }
        }
        this.method294();
    }

    @ObfuscatedName("cr.pv(I)V")
    public static final void method1988() {
        Statics.field697.method2463();
        for (int var0 = 0; var0 < 32; var0++) {
            field2041[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2042[var1] = 0L;
        }
        Statics.field2932 = 0;
    }

    public void start() {
        if (field2036 == this && !field2043) {
            field2035 = 0L;
        }
    }

    public void stop() {
        if (field2036 == this && !field2043) {
            field2035 = class104.method2616() + 4000L;
        }
    }

    public void destroy() {
        if (field2036 == this && !field2043) {
            field2035 = class104.method2616();
            class116.method71(5000L);
            this.method2674();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2036 != this || field2043) {
            return;
        }
        field2034 = true;
        if (Statics.field1932 != null && Statics.field1932.startsWith("1.5") && class104.method2616() - field2033 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1435 && var2.height >= Statics.field134) {
                field2045 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2047 = true;
        field2034 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2047 = false;
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

    @ObfuscatedName("ak.pf(ILjava/lang/String;Ljava/awt/Color;I)V")
    public static final void method529(int arg0, String arg1, Color arg2) {
        try {
            Graphics var3 = Statics.field171.getGraphics();
            if (Statics.field983 == null) {
                Statics.field983 = new Font("Helvetica", 1, 13);
                Statics.field1334 = Statics.field171.getFontMetrics(Statics.field983);
            }
            if (field2034) {
                field2034 = false;
                var3.setColor(Color.black);
                var3.fillRect(0, 0, Statics.field1435, Statics.field134);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field86 == null) {
                    Statics.field86 = Statics.field171.createImage(304, 34);
                }
                Graphics var4 = Statics.field86.getGraphics();
                var4.setColor(arg2);
                var4.drawRect(0, 0, 303, 33);
                var4.fillRect(2, 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(1, 1, 301, 31);
                var4.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field983);
                var4.setColor(Color.white);
                var4.drawString(arg1, (304 - Statics.field1334.stringWidth(arg1)) / 2, 22);
                var3.drawImage(Statics.field86, Statics.field1435 / 2 - 152, Statics.field134 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var6 = Statics.field1435 / 2 - 152;
                int var7 = Statics.field134 / 2 - 18;
                var3.setColor(arg2);
                var3.drawRect(var6, var7, 303, 33);
                var3.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var3.setColor(Color.black);
                var3.drawRect(var6 + 1, var7 + 1, 301, 31);
                var3.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var3.setFont(Statics.field983);
                var3.setColor(Color.white);
                var3.drawString(arg1, var6 + (304 - Statics.field1334.stringWidth(arg1)) / 2, var7 + 22);
            }
        } catch (Exception var10) {
            Statics.field171.repaint();
        }
    }

    @ObfuscatedName("ee.pt(Ljava/lang/String;I)V")
    public void method2627(String arg0) {
        if (this.field2037) {
            return;
        }
        this.field2037 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    public abstract void init();

    @ObfuscatedName("ee.c(I)V")
    public abstract void method172();

    @ObfuscatedName("ee.x(B)V")
    public abstract void method173();

    @ObfuscatedName("ee.f(B)V")
    public abstract void method174();

    @ObfuscatedName("ee.t(I)V")
    public abstract void method450();

    @ObfuscatedName("ee.j(I)V")
    public abstract void method294();
}
