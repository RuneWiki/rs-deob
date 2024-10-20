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

    @ObfuscatedName("eq.pa")
    public static class135 field2080 = null;

    @ObfuscatedName("eq.ph")
    public static int field2078 = 0;

    @ObfuscatedName("eq.pj")
    public static long field2079 = 0L;

    @ObfuscatedName("eq.pf")
    public static boolean field2090 = false;

    @ObfuscatedName("eq.po")
    public static int field2077 = 20;

    @ObfuscatedName("eq.pn")
    public static int field2084 = 1;

    @ObfuscatedName("eq.pd")
    public static int field2088 = 0;

    @ObfuscatedName("eq.px")
    public static long[] field2085 = new long[32];

    @ObfuscatedName("eq.pw")
    public static long[] field2086 = new long[32];

    @ObfuscatedName("eq.pp")
    public static volatile boolean field2087 = true;

    @ObfuscatedName("eq.py")
    public static int field2081 = 500;

    @ObfuscatedName("eq.pm")
    public static volatile boolean field2089 = false;

    @ObfuscatedName("eq.qj")
    public static volatile long field2082 = 0L;

    @ObfuscatedName("eq.qk")
    public static volatile boolean field2091 = true;

    @ObfuscatedName("eq.ps")
    public boolean field2083 = false;

    @ObfuscatedName("eq.pc(IIII)V")
    public final void method2614(int arg0, int arg1, int arg2) {
        try {
            if (field2080 != null) {
                field2078++;
                if (field2078 >= 3) {
                    this.method2626("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2080 = this;
            Statics.field905 = arg0;
            Statics.field2070 = arg1;
            Statics.field1900 = arg2;
            Statics.field2104 = this;
            if (Statics.field1300 == null) {
                Statics.field1300 = new class127();
            }
            Statics.field1300.method2481(this, 1);
        } catch (Exception var5) {
            class139.method2550((String) null, var5);
            this.method2626("crash");
        }
    }

    @ObfuscatedName("eq.pb(B)V")
    public final synchronized void method2615() {
        Container var1;
        if (Statics.field2041 == null) {
            var1 = this;
        } else {
            var1 = Statics.field2041;
        }
        if (Statics.field2706 != null) {
            Statics.field2706.removeFocusListener(this);
            var1.remove(Statics.field2706);
        }
        Statics.field2706 = new class130(this);
        var1.add(Statics.field2706);
        Statics.field2706.setSize(Statics.field905, Statics.field2070);
        Statics.field2706.setVisible(true);
        if (Statics.field2041 == null) {
            Statics.field2706.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field2041.getInsets();
            Statics.field2706.setLocation(var2.left, var2.top);
        }
        Statics.field2706.addFocusListener(this);
        Statics.field2706.requestFocus();
        field2087 = true;
        field2089 = false;
        field2082 = class106.method2471();
    }

    @ObfuscatedName("eq.pz(I)Z")
    public final boolean method2632() {
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
                this.method2626("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1969 != null) {
                String var1 = Statics.field1969.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1960;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2626("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class213.method3115(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class213.method521(var4) && class213.method2071(var4) < 10) {
                            this.method2626("wrongjava");
                            return;
                        }
                    }
                    field2084 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2615();
            int var5 = Statics.field905;
            int var6 = Statics.field2070;
            Canvas var7 = Statics.field2706;
            class72 var9;
            try {
                class76 var8 = new class76();
                var8.method1350(var5, var6, var7);
                var9 = var8;
            } catch (Throwable var14) {
                class70 var11 = new class70();
                var11.method1350(var5, var6, var7);
                var9 = var11;
            }
            Statics.field127 = var9;
            this.method376();
            Statics.field2014 = class124.method164();
            while (field2079 == 0L || class106.method2471() < field2079) {
                Statics.field1955 = Statics.field2014.method2453(field2077, field2084);
                for (int var12 = 0; var12 < Statics.field1955; var12++) {
                    this.method2674();
                }
                this.method2618();
                class133.method2063(Statics.field1300, Statics.field2706);
            }
        } catch (Exception var15) {
            class139.method2550((String) null, var15);
            this.method2626("crash");
        }
        this.method2619();
    }

    @ObfuscatedName("eq.pg(B)V")
    public void method2674() {
        long var1 = class106.method2471();
        long var3 = field2086[Statics.field650];
        field2086[Statics.field650] = var1;
        Statics.field650 = Statics.field650 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field195 = field2091;
        }
        this.method299();
    }

    @ObfuscatedName("eq.pt(B)V")
    public void method2618() {
        long var1 = class106.method2471();
        long var3 = field2085[Statics.field621];
        field2085[Statics.field621] = var1;
        Statics.field621 = Statics.field621 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field2088 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field2081 - 1 > 50) {
            field2081 -= 50;
            field2087 = true;
            Statics.field2706.setSize(Statics.field905, Statics.field2070);
            Statics.field2706.setVisible(true);
            if (Statics.field2041 == null) {
                Statics.field2706.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field2041.getInsets();
                Statics.field2706.setLocation(var6.left, var6.top);
            }
        }
        this.method434();
    }

    @ObfuscatedName("eq.pu(I)V")
    public final synchronized void method2619() {
        if (field2090) {
            return;
        }
        field2090 = true;
        try {
            Statics.field2706.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method236();
        } catch (Exception var7) {
        }
        if (Statics.field2041 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1300 != null) {
            try {
                Statics.field1300.method2478();
            } catch (Exception var5) {
            }
        }
        this.method186();
    }

    public void start() {
        if (field2080 == this && !field2090) {
            field2079 = 0L;
        }
    }

    public void stop() {
        if (field2080 == this && !field2090) {
            field2079 = class106.method2471() + 4000L;
        }
    }

    public void destroy() {
        if (field2080 == this && !field2090) {
            field2079 = class106.method2471();
            class118.method2072(5000L);
            this.method2619();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2080 != this || field2090) {
            return;
        }
        field2087 = true;
        if (Statics.field1960 != null && Statics.field1960.startsWith("1.5") && class106.method2471() - field2082 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field905 && var2.height >= Statics.field2070) {
                field2089 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2091 = true;
        field2087 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2091 = false;
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

    @ObfuscatedName("m.pi(ILjava/lang/String;Ljava/awt/Color;I)V")
    public static final void method87(int arg0, String arg1, Color arg2) {
        try {
            Graphics var3 = Statics.field2706.getGraphics();
            if (Statics.field637 == null) {
                Statics.field637 = new Font("Helvetica", 1, 13);
                Statics.field2522 = Statics.field2706.getFontMetrics(Statics.field637);
            }
            if (field2087) {
                field2087 = false;
                var3.setColor(Color.black);
                var3.fillRect(0, 0, Statics.field905, Statics.field2070);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field47 == null) {
                    Statics.field47 = Statics.field2706.createImage(304, 34);
                }
                Graphics var4 = Statics.field47.getGraphics();
                var4.setColor(arg2);
                var4.drawRect(0, 0, 303, 33);
                var4.fillRect(2, 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(1, 1, 301, 31);
                var4.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field637);
                var4.setColor(Color.white);
                var4.drawString(arg1, (304 - Statics.field2522.stringWidth(arg1)) / 2, 22);
                var3.drawImage(Statics.field47, Statics.field905 / 2 - 152, Statics.field2070 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var6 = Statics.field905 / 2 - 152;
                int var7 = Statics.field2070 / 2 - 18;
                var3.setColor(arg2);
                var3.drawRect(var6, var7, 303, 33);
                var3.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var3.setColor(Color.black);
                var3.drawRect(var6 + 1, var7 + 1, 301, 31);
                var3.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var3.setFont(Statics.field637);
                var3.setColor(Color.white);
                var3.drawString(arg1, var6 + (304 - Statics.field2522.stringWidth(arg1)) / 2, var7 + 22);
            }
        } catch (Exception var10) {
            Statics.field2706.repaint();
        }
    }

    @ObfuscatedName("dp.pp(I)V")
    public static final void method2083() {
        Statics.field47 = null;
        Statics.field637 = null;
        Statics.field2522 = null;
    }

    @ObfuscatedName("eq.pq(Ljava/lang/String;I)V")
    public void method2626(String arg0) {
        if (this.field2083) {
            return;
        }
        this.field2083 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("eq.w(I)V")
    public abstract void method236();

    @ObfuscatedName("eq.l(I)V")
    public abstract void method299();

    @ObfuscatedName("eq.m(B)V")
    public abstract void method434();

    @ObfuscatedName("eq.v(I)V")
    public abstract void method186();

    @ObfuscatedName("eq.b(S)V")
    public abstract void method376();

    public abstract void init();
}
