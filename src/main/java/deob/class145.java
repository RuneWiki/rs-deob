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

@ObfuscatedName("er")
public abstract class class145 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("er.pp")
    public static class145 field2205 = null;

    @ObfuscatedName("er.pz")
    public static int field2202 = 0;

    @ObfuscatedName("er.pc")
    public static long field2203 = 0L;

    @ObfuscatedName("er.pa")
    public static boolean field2204 = false;

    @ObfuscatedName("er.qc")
    public static int field2206 = 20;

    @ObfuscatedName("er.qg")
    public static int field2207 = 1;

    @ObfuscatedName("er.qe")
    public static int field2208 = 0;

    @ObfuscatedName("er.qy")
    public static long[] field2209 = new long[32];

    @ObfuscatedName("er.qd")
    public static long[] field2216 = new long[32];

    @ObfuscatedName("er.qn")
    public static int field2211 = 0;

    @ObfuscatedName("er.ql")
    public static int field2212 = 0;

    @ObfuscatedName("er.qp")
    public static volatile boolean field2213 = true;

    @ObfuscatedName("er.qi")
    public static int field2214 = 500;

    @ObfuscatedName("er.qz")
    public static boolean field2210 = false;

    @ObfuscatedName("er.qq")
    public static volatile boolean field2215 = false;

    @ObfuscatedName("er.rp")
    public static volatile long field2217 = 0L;

    @ObfuscatedName("er.rl")
    public static volatile boolean field2218 = true;

    @ObfuscatedName("er.pw")
    public boolean field2201 = false;

    @ObfuscatedName("er.qe(IIII)V")
    public final void method2860(int arg0, int arg1, int arg2) {
        try {
            if (field2205 != null) {
                field2202++;
                if (field2202 >= 3) {
                    this.method2826("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2205 = this;
            Statics.field215 = arg0;
            Statics.field216 = arg1;
            Statics.field2237 = arg2;
            Statics.field2053 = this;
            if (Statics.field879 == null) {
                Statics.field879 = new class137();
            }
            Statics.field879.method2704(this, 1);
        } catch (Exception var5) {
            class149.method1942((String) null, var5);
            this.method2826("crash");
        }
    }

    @ObfuscatedName("er.qw(I)V")
    public final synchronized void method2896() {
        Container var1 = this.method2827();
        if (Statics.field2025 != null) {
            Statics.field2025.removeFocusListener(this);
            var1.remove(Statics.field2025);
        }
        Statics.field215 = Math.max(var1.getWidth(), Statics.field1683);
        Statics.field216 = Math.max(var1.getHeight(), Statics.field2115);
        if (Statics.field1465 != null) {
            Insets var2 = Statics.field1465.getInsets();
            Statics.field215 -= var2.right + var2.left;
            Statics.field216 -= var2.top + var2.bottom;
        }
        Statics.field2025 = new class140(this);
        var1.add(Statics.field2025);
        Statics.field2025.setSize(Statics.field215, Statics.field216);
        Statics.field2025.setVisible(true);
        if (Statics.field1465 == var1) {
            Insets var3 = Statics.field1465.getInsets();
            Statics.field2025.setLocation(field2211 + var3.left, field2212 + var3.top);
        } else {
            Statics.field2025.setLocation(field2211, field2212);
        }
        Statics.field2025.addFocusListener(this);
        Statics.field2025.requestFocus();
        field2213 = true;
        class78 var4 = class78.method2267(Statics.field215, Statics.field216, Statics.field2025);
        if (Statics.field2095 != null) {
            Statics.field2095.method1493(var4.field1401.getGraphics(), 0, 0);
        }
        Statics.field2095 = var4;
        field2215 = false;
        field2217 = class116.method157();
    }

    @ObfuscatedName("er.qo(I)Z")
    public final boolean method2849() {
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
                this.method2826("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2116 != null) {
                String var1 = Statics.field2116.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2047;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2826("wrongjava");
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
                        if (class164.method2686(var6)) {
                            int var7 = class164.method2575(var6, 10, true);
                            if (var7 < 10) {
                                this.method2826("wrongjava");
                                return;
                            }
                        }
                    }
                    field2207 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2896();
            this.method354();
            Statics.field1021 = class134.method2282();
            while (field2203 == 0L || class116.method157() < field2203) {
                Statics.field778 = Statics.field1021.method2680(field2206, field2207);
                for (int var8 = 0; var8 < Statics.field778; var8++) {
                    this.method2819();
                }
                this.method2901();
                Statics.method197(Statics.field879, Statics.field2025);
            }
        } catch (Exception var10) {
            class149.method1942((String) null, var10);
            this.method2826("crash");
        }
        this.method2820();
    }

    @ObfuscatedName("er.qy(I)V")
    public void method2819() {
        long var1 = class116.method157();
        long var3 = field2216[Statics.field1063];
        field2216[Statics.field1063] = var1;
        Statics.field1063 = Statics.field1063 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field2079 = field2218;
        }
        this.method462();
    }

    @ObfuscatedName("er.qf(I)V")
    public void method2901() {
        Container var1 = this.method2827();
        long var2 = class116.method157();
        long var4 = field2209[Statics.field701];
        field2209[Statics.field701] = var2;
        Statics.field701 = Statics.field701 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2208 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2214 - 1 > 50) {
            field2214 -= 50;
            field2213 = true;
            Statics.field2025.setSize(Statics.field215, Statics.field216);
            Statics.field2025.setVisible(true);
            if (Statics.field1465 == var1) {
                Insets var7 = Statics.field1465.getInsets();
                Statics.field2025.setLocation(field2211 + var7.left, field2212 + var7.top);
            } else {
                Statics.field2025.setLocation(field2211, field2212);
            }
        }
        this.method244();
    }

    @ObfuscatedName("er.qd(I)V")
    public final synchronized void method2820() {
        if (field2204) {
            return;
        }
        field2204 = true;
        try {
            Statics.field2025.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method277();
        } catch (Exception var7) {
        }
        if (Statics.field1465 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field879 != null) {
            try {
                Statics.field879.method2722();
            } catch (Exception var5) {
            }
        }
        this.method239();
    }

    @ObfuscatedName("hk.qs(I)V")
    public static final void method3683() {
        Statics.field1021.method2679();
        for (int var0 = 0; var0 < 32; var0++) {
            field2209[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2216[var1] = 0L;
        }
        Statics.field778 = 0;
    }

    public void start() {
        if (field2205 == this && !field2204) {
            field2203 = 0L;
        }
    }

    public void stop() {
        if (field2205 == this && !field2204) {
            field2203 = class116.method157() + 4000L;
        }
    }

    public void destroy() {
        if (field2205 == this && !field2204) {
            field2203 = class116.method157();
            class128.method2294(5000L);
            this.method2820();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2205 != this || field2204) {
            return;
        }
        field2213 = true;
        if (Statics.field2047 != null && Statics.field2047.startsWith("1.5") && class116.method157() - field2217 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field215 && var2.height >= Statics.field216) {
                field2215 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2218 = true;
        field2213 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2218 = false;
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

    @ObfuscatedName("eb.qh(ILjava/lang/String;Ljava/awt/Color;ZI)V")
    public static final void method2687(int arg0, String arg1, Color arg2, boolean arg3) {
        try {
            Graphics var4 = Statics.field2025.getGraphics();
            if (Statics.field1696 == null) {
                Statics.field1696 = new Font("Helvetica", 1, 13);
                Statics.field2040 = Statics.field2025.getFontMetrics(Statics.field1696);
            }
            if (arg3) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field215, Statics.field216);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field1031 == null) {
                    Statics.field1031 = Statics.field2025.createImage(304, 34);
                }
                Graphics var5 = Statics.field1031.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(Statics.field1696);
                var5.setColor(Color.white);
                var5.drawString(arg1, (304 - Statics.field2040.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field1031, Statics.field215 / 2 - 152, Statics.field216 / 2 - 18, (ImageObserver) null);
            } catch (Exception var10) {
                int var7 = Statics.field215 / 2 - 152;
                int var8 = Statics.field216 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1696);
                var4.setColor(Color.white);
                var4.drawString(arg1, var7 + (304 - Statics.field2040.stringWidth(arg1)) / 2, var8 + 22);
            }
        } catch (Exception var11) {
            Statics.field2025.repaint();
        }
    }

    @ObfuscatedName("er.qx(Ljava/lang/String;I)V")
    public void method2826(String arg0) {
        if (this.field2201) {
            return;
        }
        this.field2201 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("er.qn(I)Ljava/awt/Container;")
    public Container method2827() {
        return Statics.field1465 == null ? this : Statics.field1465;
    }

    @ObfuscatedName("er.ql(B)Ljava/awt/Dimension;")
    public Dimension method2828() {
        Container var1 = this.method2827();
        int var2 = Math.max(var1.getWidth(), Statics.field1683);
        int var3 = Math.max(var1.getHeight(), Statics.field2115);
        if (Statics.field1465 != null) {
            Insets var4 = Statics.field1465.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    @ObfuscatedName("er.k(B)V")
    public abstract void method277();

    public abstract void init();

    @ObfuscatedName("er.u(I)V")
    public abstract void method354();

    @ObfuscatedName("er.o(B)V")
    public abstract void method462();

    @ObfuscatedName("er.b(I)V")
    public abstract void method244();

    @ObfuscatedName("er.x(I)V")
    public abstract void method239();
}
