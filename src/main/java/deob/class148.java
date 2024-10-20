package deob;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
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

@ObfuscatedName("ez")
public abstract class class148 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ez.pr")
    public static class148 field2269 = null;

    @ObfuscatedName("ez.pm")
    public static int field2254 = 0;

    @ObfuscatedName("ez.pt")
    public static long field2255 = 0L;

    @ObfuscatedName("ez.pb")
    public static boolean field2256 = false;

    @ObfuscatedName("ez.pl")
    public static int field2257 = 20;

    @ObfuscatedName("ez.qw")
    public static int field2253 = 1;

    @ObfuscatedName("ez.qc")
    public static int field2260 = 0;

    @ObfuscatedName("ez.qi")
    public static long[] field2261 = new long[32];

    @ObfuscatedName("ez.ql")
    public static long[] field2262 = new long[32];

    @ObfuscatedName("ez.qu")
    public static int field2263 = 0;

    @ObfuscatedName("ez.qy")
    public static int field2264 = 0;

    @ObfuscatedName("ez.qm")
    public static volatile boolean field2266 = true;

    @ObfuscatedName("ez.qg")
    public static int field2267 = 500;

    @ObfuscatedName("ez.qj")
    public static boolean field2258 = false;

    @ObfuscatedName("ez.qf")
    public static volatile boolean field2259 = false;

    @ObfuscatedName("ez.qq")
    public static volatile long field2270 = 0L;

    @ObfuscatedName("ez.rn")
    public static volatile boolean field2271 = true;

    @ObfuscatedName("ez.pc")
    public boolean field2268 = false;

    @ObfuscatedName("ez.qh(IIII)V")
    public final void method2943(int arg0, int arg1, int arg2) {
        try {
            if (field2269 != null) {
                field2254++;
                if (field2254 >= 3) {
                    this.method2902("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2269 = this;
            Statics.field175 = arg0;
            Statics.field265 = arg1;
            Statics.field2287 = arg2;
            Statics.field2286 = this;
            if (Statics.field901 == null) {
                Statics.field901 = new class140();
            }
            Statics.field901.method2772(this, 1);
        } catch (Exception var5) {
            class152.method1096((String) null, var5);
            this.method2902("crash");
        }
    }

    @ObfuscatedName("ez.qg(I)V")
    public final synchronized void method2937() {
        Container var1 = this.method2916();
        if (Statics.field1966 != null) {
            Statics.field1966.removeFocusListener(this);
            var1.remove(Statics.field1966);
        }
        Statics.field175 = Math.max(var1.getWidth(), Statics.field177);
        Statics.field265 = Math.max(var1.getHeight(), Statics.field663);
        if (Statics.field836 != null) {
            Insets var2 = Statics.field836.getInsets();
            Statics.field175 -= var2.right + var2.left;
            Statics.field265 -= var2.top + var2.bottom;
        }
        Statics.field1966 = new class143(this);
        var1.add(Statics.field1966);
        Statics.field1966.setSize(Statics.field175, Statics.field265);
        Statics.field1966.setVisible(true);
        if (Statics.field836 == var1) {
            Insets var3 = Statics.field836.getInsets();
            Statics.field1966.setLocation(field2263 + var3.left, field2264 + var3.top);
        } else {
            Statics.field1966.setLocation(field2263, field2264);
        }
        Statics.field1966.addFocusListener(this);
        Statics.field1966.requestFocus();
        field2266 = true;
        class81 var4 = class81.method1009(Statics.field175, Statics.field265, Statics.field1966);
        if (Statics.field1455 != null) {
            Statics.field1455.method1597(var4.field1471.getGraphics(), 0, 0);
        }
        Statics.field1455 = var4;
        field2259 = false;
        field2270 = class119.method3544();
    }

    @ObfuscatedName("ez.qj(B)Z")
    public final boolean method2896() {
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
                this.method2902("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2148 != null) {
                String var1 = Statics.field2148.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2144;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2902("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class167.method651(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        boolean var5 = class167.method548(var4, 10, true);
                        if (var5 && class167.method2747(var4) < 10) {
                            this.method2902("wrongjava");
                            return;
                        }
                    }
                    field2253 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2937();
            this.method224();
            class137 var6;
            try {
                var6 = new class151();
            } catch (Throwable var10) {
                var6 = new class145();
            }
            Statics.field1004 = var6;
            while (field2255 == 0L || class119.method3544() < field2255) {
                Statics.field119 = Statics.field1004.method2742(field2257, field2253);
                for (int var8 = 0; var8 < Statics.field119; var8++) {
                    this.method2897();
                }
                this.method2905();
                class146.method2334(Statics.field901, Statics.field1966);
            }
        } catch (Exception var11) {
            class152.method1096((String) null, var11);
            this.method2902("crash");
        }
        this.method2927();
    }

    @ObfuscatedName("ez.qf(I)V")
    public void method2897() {
        long var1 = class119.method3544();
        long var3 = field2262[Statics.field1825];
        field2262[Statics.field1825] = var1;
        Statics.field1825 = Statics.field1825 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field2071 = field2271;
        }
        this.method445();
    }

    @ObfuscatedName("ez.qq(I)V")
    public void method2905() {
        Container var1 = this.method2916();
        long var2 = class119.method3544();
        long var4 = field2261[Statics.field2095];
        field2261[Statics.field2095] = var2;
        Statics.field2095 = Statics.field2095 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2260 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2267 - 1 > 50) {
            field2267 -= 50;
            field2266 = true;
            Statics.field1966.setSize(Statics.field175, Statics.field265);
            Statics.field1966.setVisible(true);
            if (Statics.field836 == var1) {
                Insets var7 = Statics.field836.getInsets();
                Statics.field1966.setLocation(field2263 + var7.left, field2264 + var7.top);
            } else {
                Statics.field1966.setLocation(field2263, field2264);
            }
        }
        this.method226();
    }

    @ObfuscatedName("ez.rf(I)V")
    public final synchronized void method2927() {
        if (field2256) {
            return;
        }
        field2256 = true;
        try {
            Statics.field1966.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method389();
        } catch (Exception var7) {
        }
        if (Statics.field836 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field901 != null) {
            try {
                Statics.field901.method2779();
            } catch (Exception var5) {
            }
        }
        this.method422();
    }

    public void start() {
        if (field2269 == this && !field2256) {
            field2255 = 0L;
        }
    }

    public void stop() {
        if (field2269 == this && !field2256) {
            field2255 = class119.method3544() + 4000L;
        }
    }

    public void destroy() {
        if (field2269 == this && !field2256) {
            field2255 = class119.method3544();
            class131.method2828(5000L);
            this.method2927();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2269 != this || field2256) {
            return;
        }
        field2266 = true;
        if (Statics.field2144 != null && Statics.field2144.startsWith("1.5") && class119.method3544() - field2270 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field175 && var2.height >= Statics.field265) {
                field2259 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2271 = true;
        field2266 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2271 = false;
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

    @ObfuscatedName("es.rn(ILjava/lang/String;Ljava/awt/Color;ZB)V")
    public static final void method2817(int arg0, String arg1, Color arg2, boolean arg3) {
        try {
            Graphics var4 = Statics.field1966.getGraphics();
            if (Statics.field2265 == null) {
                Statics.field2265 = new Font("Helvetica", 1, 13);
                Statics.field125 = Statics.field1966.getFontMetrics(Statics.field2265);
            }
            if (arg3) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field175, Statics.field265);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field234 == null) {
                    Statics.field234 = Statics.field1966.createImage(304, 34);
                }
                Graphics var5 = Statics.field234.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(Statics.field2265);
                var5.setColor(Color.white);
                var5.drawString(arg1, (304 - Statics.field125.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field234, Statics.field175 / 2 - 152, Statics.field265 / 2 - 18, (ImageObserver) null);
            } catch (Exception var10) {
                int var7 = Statics.field175 / 2 - 152;
                int var8 = Statics.field265 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field2265);
                var4.setColor(Color.white);
                var4.drawString(arg1, var7 + (304 - Statics.field125.stringWidth(arg1)) / 2, var8 + 22);
            }
        } catch (Exception var11) {
            Statics.field1966.repaint();
        }
    }

    @ObfuscatedName("ez.rm(Ljava/lang/String;I)V")
    public void method2902(String arg0) {
        if (this.field2268) {
            return;
        }
        this.field2268 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ez.ra(B)Ljava/awt/Container;")
    public Container method2916() {
        return Statics.field836 == null ? this : Statics.field836;
    }

    @ObfuscatedName("ez.rz(B)Ljava/awt/Dimension;")
    public Dimension method2904() {
        Container var1 = this.method2916();
        int var2 = Math.max(var1.getWidth(), Statics.field177);
        int var3 = Math.max(var1.getHeight(), Statics.field663);
        if (Statics.field836 != null) {
            Insets var4 = Statics.field836.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    @ObfuscatedName("ez.j(I)V")
    public abstract void method224();

    @ObfuscatedName("ez.r(B)V")
    public abstract void method445();

    @ObfuscatedName("ez.k(I)V")
    public abstract void method389();

    @ObfuscatedName("ez.x(S)V")
    public abstract void method226();

    public abstract void init();

    @ObfuscatedName("ez.o(B)V")
    public abstract void method422();
}
