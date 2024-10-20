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

@ObfuscatedName("eq")
public abstract class class135 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("eq.pe")
    public static class135 field2058 = null;

    @ObfuscatedName("eq.pf")
    public static int field2065 = 0;

    @ObfuscatedName("eq.ph")
    public static long field2061 = 0L;

    @ObfuscatedName("eq.pa")
    public static boolean field2059 = false;

    @ObfuscatedName("eq.pc")
    public static int field2057 = 20;

    @ObfuscatedName("eq.pq")
    public static int field2068 = 1;

    @ObfuscatedName("eq.po")
    public static int field2071 = 0;

    @ObfuscatedName("eq.pb")
    public static long[] field2064 = new long[32];

    @ObfuscatedName("eq.pz")
    public static long[] field2063 = new long[32];

    @ObfuscatedName("eq.pi")
    public static volatile boolean field2066 = true;

    @ObfuscatedName("eq.pk")
    public static int field2067 = 500;

    @ObfuscatedName("eq.pg")
    public static volatile boolean field2062 = false;

    @ObfuscatedName("eq.qa")
    public static volatile long field2069 = 0L;

    @ObfuscatedName("eq.qq")
    public static volatile boolean field2070 = true;

    @ObfuscatedName("eq.pm")
    public boolean field2060 = false;

    @ObfuscatedName("eq.pr(IIII)V")
    public final void method2648(int arg0, int arg1, int arg2) {
        try {
            if (field2058 != null) {
                field2065++;
                if (field2065 >= 3) {
                    this.method2660("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2058 = this;
            Statics.field798 = arg0;
            Statics.field541 = arg1;
            Statics.field2086 = arg2;
            Statics.field2093 = this;
            if (Statics.field1950 == null) {
                Statics.field1950 = new class127();
            }
            Statics.field1950.method2547(this, 1);
        } catch (Exception var5) {
            class139.method2439((String) null, var5);
            this.method2660("crash");
        }
    }

    @ObfuscatedName("eq.pc(I)V")
    public final synchronized void method2649() {
        Container var1;
        if (Statics.field2137 == null) {
            var1 = this;
        } else {
            var1 = Statics.field2137;
        }
        if (Statics.field231 != null) {
            Statics.field231.removeFocusListener(this);
            var1.remove(Statics.field231);
        }
        Statics.field231 = new class130(this);
        var1.add(Statics.field231);
        Statics.field231.setSize(Statics.field798, Statics.field541);
        Statics.field231.setVisible(true);
        if (Statics.field2137 == null) {
            Statics.field231.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field2137.getInsets();
            Statics.field231.setLocation(var2.left, var2.top);
        }
        Statics.field231.addFocusListener(this);
        Statics.field231.requestFocus();
        field2066 = true;
        field2062 = false;
        field2069 = class106.method487();
    }

    @ObfuscatedName("eq.pq(B)Z")
    public final boolean method2650() {
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
                this.method2660("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1957 != null) {
                String var1 = Statics.field1957.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1954;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2660("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class213.method3659(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class213.method3577(var4)) {
                            int var5 = class213.method897(var4, 10, true);
                            if (var5 < 10) {
                                this.method2660("wrongjava");
                                return;
                            }
                        }
                    }
                    field2068 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2649();
            Statics.field1913 = class72.method2424(Statics.field798, Statics.field541, Statics.field231);
            this.method171();
            Statics.field640 = class124.method1879();
            while (field2061 == 0L || class106.method487() < field2061) {
                Statics.field964 = Statics.field640.method2492(field2057, field2068);
                for (int var6 = 0; var6 < Statics.field964; var6++) {
                    this.method2656();
                }
                this.method2651();
                class133.method1604(Statics.field1950, Statics.field231);
            }
        } catch (Exception var8) {
            class139.method2439((String) null, var8);
            this.method2660("crash");
        }
        this.method2697();
    }

    @ObfuscatedName("eq.po(I)V")
    public void method2656() {
        long var1 = class106.method487();
        long var3 = field2063[Statics.field128];
        field2063[Statics.field128] = var1;
        Statics.field128 = Statics.field128 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field2056 = field2070;
        }
        this.method465();
    }

    @ObfuscatedName("eq.pl(I)V")
    public void method2651() {
        long var1 = class106.method487();
        long var3 = field2064[Statics.field1665];
        field2064[Statics.field1665] = var1;
        Statics.field1665 = Statics.field1665 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field2071 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field2067 - 1 > 50) {
            field2067 -= 50;
            field2066 = true;
            Statics.field231.setSize(Statics.field798, Statics.field541);
            Statics.field231.setVisible(true);
            if (Statics.field2137 == null) {
                Statics.field231.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field2137.getInsets();
                Statics.field231.setLocation(var6.left, var6.top);
            }
        }
        this.method173();
    }

    @ObfuscatedName("eq.pt(I)V")
    public final synchronized void method2697() {
        if (field2059) {
            return;
        }
        field2059 = true;
        try {
            Statics.field231.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method174();
        } catch (Exception var7) {
        }
        if (Statics.field2137 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1950 != null) {
            try {
                Statics.field1950.method2529();
            } catch (Exception var5) {
            }
        }
        this.method169();
    }

    @ObfuscatedName("q.pb(B)V")
    public static final void method156() {
        Statics.field640.method2497();
        for (int var0 = 0; var0 < 32; var0++) {
            field2064[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2063[var1] = 0L;
        }
        Statics.field964 = 0;
    }

    public void start() {
        if (field2058 == this && !field2059) {
            field2061 = 0L;
        }
    }

    public void stop() {
        if (field2058 == this && !field2059) {
            field2061 = class106.method487() + 4000L;
        }
    }

    public void destroy() {
        if (field2058 == this && !field2059) {
            field2061 = class106.method487();
            class118.method2729(5000L);
            this.method2697();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2058 != this || field2059) {
            return;
        }
        field2066 = true;
        if (Statics.field1954 != null && Statics.field1954.startsWith("1.5") && class106.method487() - field2069 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field798 && var2.height >= Statics.field541) {
                field2062 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2070 = true;
        field2066 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2070 = false;
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

    @ObfuscatedName("ck.pj(ILjava/lang/String;Ljava/awt/Color;I)V")
    public static final void method2090(int arg0, String arg1, Color arg2) {
        try {
            Graphics var3 = Statics.field231.getGraphics();
            if (Statics.field1980 == null) {
                Statics.field1980 = new Font("Helvetica", 1, 13);
                Statics.field139 = Statics.field231.getFontMetrics(Statics.field1980);
            }
            if (field2066) {
                field2066 = false;
                var3.setColor(Color.black);
                var3.fillRect(0, 0, Statics.field798, Statics.field541);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field1117 == null) {
                    Statics.field1117 = Statics.field231.createImage(304, 34);
                }
                Graphics var4 = Statics.field1117.getGraphics();
                var4.setColor(arg2);
                var4.drawRect(0, 0, 303, 33);
                var4.fillRect(2, 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(1, 1, 301, 31);
                var4.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1980);
                var4.setColor(Color.white);
                var4.drawString(arg1, (304 - Statics.field139.stringWidth(arg1)) / 2, 22);
                var3.drawImage(Statics.field1117, Statics.field798 / 2 - 152, Statics.field541 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var6 = Statics.field798 / 2 - 152;
                int var7 = Statics.field541 / 2 - 18;
                var3.setColor(arg2);
                var3.drawRect(var6, var7, 303, 33);
                var3.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var3.setColor(Color.black);
                var3.drawRect(var6 + 1, var7 + 1, 301, 31);
                var3.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var3.setFont(Statics.field1980);
                var3.setColor(Color.white);
                var3.drawString(arg1, var6 + (304 - Statics.field139.stringWidth(arg1)) / 2, var7 + 22);
            }
        } catch (Exception var10) {
            Statics.field231.repaint();
        }
    }

    @ObfuscatedName("cd.pz(I)V")
    public static final void method1798() {
        Statics.field1117 = null;
        Statics.field1980 = null;
        Statics.field139 = null;
    }

    @ObfuscatedName("eq.px(Ljava/lang/String;I)V")
    public void method2660(String arg0) {
        if (this.field2060) {
            return;
        }
        this.field2060 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    public abstract void init();

    @ObfuscatedName("eq.l(B)V")
    public abstract void method171();

    @ObfuscatedName("eq.k(B)V")
    public abstract void method173();

    @ObfuscatedName("eq.p(I)V")
    public abstract void method174();

    @ObfuscatedName("eq.f(I)V")
    public abstract void method169();

    @ObfuscatedName("eq.g(I)V")
    public abstract void method465();
}
