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

@ObfuscatedName("eq")
public abstract class class135 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("eq.pg")
    public static class135 field2069 = null;

    @ObfuscatedName("eq.pk")
    public static int field2065 = 0;

    @ObfuscatedName("eq.pe")
    public static long field2070 = 0L;

    @ObfuscatedName("eq.ph")
    public static boolean field2064 = false;

    @ObfuscatedName("eq.pi")
    public static int field2078 = 20;

    @ObfuscatedName("eq.pm")
    public static int field2072 = 1;

    @ObfuscatedName("eq.pf")
    public static int field2071 = 0;

    @ObfuscatedName("eq.py")
    public static long[] field2067 = new long[32];

    @ObfuscatedName("eq.pv")
    public static long[] field2073 = new long[32];

    @ObfuscatedName("eq.pw")
    public static volatile boolean field2074 = true;

    @ObfuscatedName("eq.pd")
    public static int field2075 = 500;

    @ObfuscatedName("eq.pc")
    public static volatile boolean field2076 = false;

    @ObfuscatedName("eq.px")
    public static volatile long field2077 = 0L;

    @ObfuscatedName("eq.qt")
    public static volatile boolean field2066 = true;

    @ObfuscatedName("eq.pq")
    public boolean field2068 = false;

    @ObfuscatedName("eq.oe(IIIB)V")
    public final void method2644(int arg0, int arg1, int arg2) {
        try {
            if (field2069 != null) {
                field2065++;
                if (field2065 >= 3) {
                    this.method2641("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2069 = this;
            Statics.field972 = arg0;
            Statics.field1911 = arg1;
            Statics.field2093 = arg2;
            Statics.field2091 = this;
            if (Statics.field1532 == null) {
                Statics.field1532 = new class127();
            }
            Statics.field1532.method2496(this, 1);
        } catch (Exception var5) {
            class139.method1404((String) null, var5);
            this.method2641("crash");
        }
    }

    @ObfuscatedName("eq.or(I)V")
    public final synchronized void method2632() {
        Container var1;
        if (Statics.field619 == null) {
            var1 = this;
        } else {
            var1 = Statics.field619;
        }
        if (Statics.field2149 != null) {
            Statics.field2149.removeFocusListener(this);
            var1.remove(Statics.field2149);
        }
        Statics.field2149 = new class130(this);
        var1.add(Statics.field2149);
        Statics.field2149.setSize(Statics.field972, Statics.field1911);
        Statics.field2149.setVisible(true);
        if (Statics.field619 == null) {
            Statics.field2149.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field619.getInsets();
            Statics.field2149.setLocation(var2.left, var2.top);
        }
        Statics.field2149.addFocusListener(this);
        Statics.field2149.requestFocus();
        field2074 = true;
        field2076 = false;
        field2077 = class106.method3592();
    }

    @ObfuscatedName("eq.op(S)Z")
    public final boolean method2639() {
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
                this.method2641("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1968 != null) {
                String var1 = Statics.field1968.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1964;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2641("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class213.method2755(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        boolean var5 = class213.method128(var4, 10, true);
                        if (var5 && class213.method156(var4) < 10) {
                            this.method2641("wrongjava");
                            return;
                        }
                    }
                    field2072 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2632();
            int var6 = Statics.field972;
            int var7 = Statics.field1911;
            Canvas var8 = Statics.field2149;
            class72 var10;
            try {
                class76 var9 = new class76();
                var9.method1345(var6, var7, var8);
                var10 = var9;
            } catch (Throwable var15) {
                class70 var12 = new class70();
                var12.method1345(var6, var7, var8);
                var10 = var12;
            }
            Statics.field1952 = var10;
            this.method165();
            Statics.field1696 = class124.method3011();
            while (field2070 == 0L || class106.method3592() < field2070) {
                Statics.field214 = Statics.field1696.method2473(field2078, field2072);
                for (int var13 = 0; var13 < Statics.field214; var13++) {
                    this.method2669();
                }
                this.method2674();
                class133.method28(Statics.field1532, Statics.field2149);
            }
        } catch (Exception var16) {
            class139.method1404((String) null, var16);
            this.method2641("crash");
        }
        this.method2636();
    }

    @ObfuscatedName("eq.ox(B)V")
    public void method2669() {
        long var1 = class106.method3592();
        long var3 = field2073[Statics.field128];
        field2073[Statics.field128] = var1;
        Statics.field128 = Statics.field128 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1007 = field2066;
        }
        this.method166();
    }

    @ObfuscatedName("eq.ou(B)V")
    public void method2674() {
        long var1 = class106.method3592();
        long var3 = field2067[Statics.field946];
        field2067[Statics.field946] = var1;
        Statics.field946 = Statics.field946 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field2071 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field2075 - 1 > 50) {
            field2075 -= 50;
            field2074 = true;
            Statics.field2149.setSize(Statics.field972, Statics.field1911);
            Statics.field2149.setVisible(true);
            if (Statics.field619 == null) {
                Statics.field2149.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field619.getInsets();
                Statics.field2149.setLocation(var6.left, var6.top);
            }
        }
        this.method196();
    }

    @ObfuscatedName("eq.od(I)V")
    public final synchronized void method2636() {
        if (field2064) {
            return;
        }
        field2064 = true;
        try {
            Statics.field2149.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method168();
        } catch (Exception var7) {
        }
        if (Statics.field619 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1532 != null) {
            try {
                Statics.field1532.method2493();
            } catch (Exception var5) {
            }
        }
        this.method163();
    }

    @ObfuscatedName("ez.om(B)V")
    public static final void method2868() {
        Statics.field1696.method2478();
        for (int var0 = 0; var0 < 32; var0++) {
            field2067[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2073[var1] = 0L;
        }
        Statics.field214 = 0;
    }

    public void start() {
        if (field2069 == this && !field2064) {
            field2070 = 0L;
        }
    }

    public void stop() {
        if (field2069 == this && !field2064) {
            field2070 = class106.method3592() + 4000L;
        }
    }

    public void destroy() {
        if (field2069 == this && !field2064) {
            field2070 = class106.method3592();
            class118.method2490(5000L);
            this.method2636();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2069 != this || field2064) {
            return;
        }
        field2074 = true;
        if (Statics.field1964 != null && Statics.field1964.startsWith("1.5") && class106.method3592() - field2077 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field972 && var2.height >= Statics.field1911) {
                field2076 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2066 = true;
        field2074 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2066 = false;
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

    @ObfuscatedName("ah.ob(ILjava/lang/String;Ljava/awt/Color;I)V")
    public static final void method546(int arg0, String arg1, Color arg2) {
        try {
            Graphics var3 = Statics.field2149.getGraphics();
            if (Statics.field548 == null) {
                Statics.field548 = new Font("Helvetica", 1, 13);
                Statics.field187 = Statics.field2149.getFontMetrics(Statics.field548);
            }
            if (field2074) {
                field2074 = false;
                var3.setColor(Color.black);
                var3.fillRect(0, 0, Statics.field972, Statics.field1911);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field794 == null) {
                    Statics.field794 = Statics.field2149.createImage(304, 34);
                }
                Graphics var4 = Statics.field794.getGraphics();
                var4.setColor(arg2);
                var4.drawRect(0, 0, 303, 33);
                var4.fillRect(2, 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(1, 1, 301, 31);
                var4.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field548);
                var4.setColor(Color.white);
                var4.drawString(arg1, (304 - Statics.field187.stringWidth(arg1)) / 2, 22);
                var3.drawImage(Statics.field794, Statics.field972 / 2 - 152, Statics.field1911 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var6 = Statics.field972 / 2 - 152;
                int var7 = Statics.field1911 / 2 - 18;
                var3.setColor(arg2);
                var3.drawRect(var6, var7, 303, 33);
                var3.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var3.setColor(Color.black);
                var3.drawRect(var6 + 1, var7 + 1, 301, 31);
                var3.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var3.setFont(Statics.field548);
                var3.setColor(Color.white);
                var3.drawString(arg1, var6 + (304 - Statics.field187.stringWidth(arg1)) / 2, var7 + 22);
            }
        } catch (Exception var10) {
            Statics.field2149.repaint();
        }
    }

    @ObfuscatedName("eq.oj(Ljava/lang/String;I)V")
    public void method2641(String arg0) {
        if (this.field2068) {
            return;
        }
        this.field2068 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    public abstract void init();

    @ObfuscatedName("eq.k(I)V")
    public abstract void method165();

    @ObfuscatedName("eq.h(B)V")
    public abstract void method166();

    @ObfuscatedName("eq.p(I)V")
    public abstract void method196();

    @ObfuscatedName("eq.n(I)V")
    public abstract void method168();

    @ObfuscatedName("eq.e(B)V")
    public abstract void method163();
}
