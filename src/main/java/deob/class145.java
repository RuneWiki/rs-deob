package deob;

import java.applet.Applet;
import java.awt.Canvas;
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

@ObfuscatedName("eq")
public abstract class class145 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("eq.pq")
    public static class145 field2207 = null;

    @ObfuscatedName("eq.pb")
    public static int field2192 = 0;

    @ObfuscatedName("eq.pv")
    public static long field2193 = 0L;

    @ObfuscatedName("eq.pt")
    public static boolean field2194 = false;

    @ObfuscatedName("eq.qr")
    public static int field2196 = 20;

    @ObfuscatedName("eq.qj")
    public static int field2208 = 1;

    @ObfuscatedName("eq.qo")
    public static int field2195 = 0;

    @ObfuscatedName("eq.qe")
    public static long[] field2202 = new long[32];

    @ObfuscatedName("eq.qb")
    public static long[] field2200 = new long[32];

    @ObfuscatedName("eq.qu")
    public static int field2201 = 0;

    @ObfuscatedName("eq.qp")
    public static int field2191 = 0;

    @ObfuscatedName("eq.qx")
    public static volatile boolean field2197 = true;

    @ObfuscatedName("eq.qh")
    public static int field2204 = 500;

    @ObfuscatedName("eq.qw")
    public static boolean field2205 = false;

    @ObfuscatedName("eq.ql")
    public static volatile boolean field2199 = false;

    @ObfuscatedName("eq.rn")
    public static volatile long field2198 = 0L;

    @ObfuscatedName("eq.rg")
    public static volatile boolean field2203 = true;

    @ObfuscatedName("eq.ps")
    public boolean field2206 = false;

    @ObfuscatedName("eq.sw(IIIB)V")
    public final void method2862(int arg0, int arg1, int arg2) {
        try {
            if (field2207 != null) {
                field2192++;
                if (field2192 >= 3) {
                    this.method2872("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2207 = this;
            Statics.field709 = arg0;
            Statics.field2275 = arg1;
            Statics.field2229 = arg2;
            Statics.field2223 = this;
            if (Statics.field137 == null) {
                Statics.field137 = new class137();
            }
            Statics.field137.method2729(this, 1);
        } catch (Exception var5) {
            class149.method957((String) null, var5);
            this.method2872("crash");
        }
    }

    @ObfuscatedName("eq.sh(B)V")
    public final synchronized void method2863() {
        Container var1 = this.method2874();
        if (Statics.field1568 != null) {
            Statics.field1568.removeFocusListener(this);
            var1.remove(Statics.field1568);
        }
        Statics.field709 = Math.max(var1.getWidth(), Statics.field750);
        Statics.field2275 = Math.max(var1.getHeight(), Statics.field2033);
        if (Statics.field1765 != null) {
            Insets var2 = Statics.field1765.getInsets();
            Statics.field709 -= var2.right + var2.left;
            Statics.field2275 -= var2.top + var2.bottom;
        }
        Statics.field1568 = new class140(this);
        var1.add(Statics.field1568);
        Statics.field1568.setSize(Statics.field709, Statics.field2275);
        Statics.field1568.setVisible(true);
        if (Statics.field1765 == var1) {
            Insets var3 = Statics.field1765.getInsets();
            Statics.field1568.setLocation(field2201 + var3.left, field2191 + var3.top);
        } else {
            Statics.field1568.setLocation(field2201, field2191);
        }
        Statics.field1568.addFocusListener(this);
        Statics.field1568.requestFocus();
        field2197 = true;
        int var4 = Statics.field709;
        int var5 = Statics.field2275;
        Canvas var6 = Statics.field1568;
        class78 var8;
        try {
            class82 var7 = new class82();
            var7.method1547(var4, var5, var6);
            var8 = var7;
        } catch (Throwable var12) {
            class76 var10 = new class76();
            var10.method1547(var4, var5, var6);
            var8 = var10;
        }
        if (Statics.field197 != null) {
            Statics.field197.method1548(var8.field1406.getGraphics(), 0, 0);
        }
        Statics.field197 = var8;
        field2199 = false;
        field2198 = class116.method2672();
    }

    @ObfuscatedName("eq.sp(B)Z")
    public final boolean method2908() {
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
                this.method2872("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2090 != null) {
                String var1 = Statics.field2090.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2091;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2872("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class164.method763(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class164.method2962(var4) && class164.method749(var4) < 10) {
                            this.method2872("wrongjava");
                            return;
                        }
                    }
                    field2208 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2863();
            this.method253();
            Statics.field1885 = class134.method2260();
            while (field2193 == 0L || class116.method2672() < field2193) {
                Statics.field1175 = Statics.field1885.method2700(field2196, field2208);
                for (int var5 = 0; var5 < Statics.field1175; var5++) {
                    this.method2883();
                }
                this.method2925();
                class143.method3032(Statics.field137, Statics.field1568);
            }
        } catch (Exception var7) {
            class149.method957((String) null, var7);
            this.method2872("crash");
        }
        this.method2867();
    }

    @ObfuscatedName("eq.sb(I)V")
    public void method2883() {
        long var1 = class116.method2672();
        long var3 = field2200[Statics.field678];
        field2200[Statics.field678] = var1;
        Statics.field678 = Statics.field678 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field710 = field2203;
        }
        this.method244();
    }

    @ObfuscatedName("eq.sg(I)V")
    public void method2925() {
        Container var1 = this.method2874();
        long var2 = class116.method2672();
        long var4 = field2202[Statics.field2149];
        field2202[Statics.field2149] = var2;
        Statics.field2149 = Statics.field2149 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2195 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2204 - 1 > 50) {
            field2204 -= 50;
            field2197 = true;
            Statics.field1568.setSize(Statics.field709, Statics.field2275);
            Statics.field1568.setVisible(true);
            if (Statics.field1765 == var1) {
                Insets var7 = Statics.field1765.getInsets();
                Statics.field1568.setLocation(field2201 + var7.left, field2191 + var7.top);
            } else {
                Statics.field1568.setLocation(field2201, field2191);
            }
        }
        this.method245();
    }

    @ObfuscatedName("eq.sf(B)V")
    public final synchronized void method2867() {
        if (field2194) {
            return;
        }
        field2194 = true;
        try {
            Statics.field1568.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method393();
        } catch (Exception var7) {
        }
        if (Statics.field1765 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field137 != null) {
            try {
                Statics.field137.method2725();
            } catch (Exception var5) {
            }
        }
        this.method423();
    }

    @ObfuscatedName("g.si(I)V")
    public static final void method117() {
        Statics.field1885.method2699();
        for (int var0 = 0; var0 < 32; var0++) {
            field2202[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2200[var1] = 0L;
        }
        Statics.field1175 = 0;
    }

    public void start() {
        if (field2207 == this && !field2194) {
            field2193 = 0L;
        }
    }

    public void stop() {
        if (field2207 == this && !field2194) {
            field2193 = class116.method2672() + 4000L;
        }
    }

    public void destroy() {
        if (field2207 == this && !field2194) {
            field2193 = class116.method2672();
            class128.method2102(5000L);
            this.method2867();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2207 != this || field2194) {
            return;
        }
        field2197 = true;
        if (Statics.field2091 != null && Statics.field2091.startsWith("1.5") && class116.method2672() - field2198 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field709 && var2.height >= Statics.field2275) {
                field2199 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2203 = true;
        field2197 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2203 = false;
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

    @ObfuscatedName("ey.ss(ILjava/lang/String;Ljava/awt/Color;ZI)V")
    public static final void method2830(int arg0, String arg1, Color arg2, boolean arg3) {
        try {
            Graphics var4 = Statics.field1568.getGraphics();
            if (Statics.field648 == null) {
                Statics.field648 = new Font("Helvetica", 1, 13);
                Statics.field653 = Statics.field1568.getFontMetrics(Statics.field648);
            }
            if (arg3) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field709, Statics.field2275);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field1966 == null) {
                    Statics.field1966 = Statics.field1568.createImage(304, 34);
                }
                Graphics var5 = Statics.field1966.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(Statics.field648);
                var5.setColor(Color.white);
                var5.drawString(arg1, (304 - Statics.field653.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field1966, Statics.field709 / 2 - 152, Statics.field2275 / 2 - 18, (ImageObserver) null);
            } catch (Exception var10) {
                int var7 = Statics.field709 / 2 - 152;
                int var8 = Statics.field2275 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field648);
                var4.setColor(Color.white);
                var4.drawString(arg1, var7 + (304 - Statics.field653.stringWidth(arg1)) / 2, var8 + 22);
            }
        } catch (Exception var11) {
            Statics.field1568.repaint();
        }
    }

    @ObfuscatedName("h.su(I)V")
    public static final void method175() {
        Statics.field1966 = null;
        Statics.field648 = null;
        Statics.field653 = null;
    }

    @ObfuscatedName("eq.sv(Ljava/lang/String;B)V")
    public void method2872(String arg0) {
        if (this.field2206) {
            return;
        }
        this.field2206 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("eq.sr(I)Ljava/awt/Container;")
    public Container method2874() {
        return Statics.field1765 == null ? this : Statics.field1765;
    }

    @ObfuscatedName("eq.sk(I)Ljava/awt/Dimension;")
    public Dimension method2875() {
        Container var1 = this.method2874();
        int var2 = Math.max(var1.getWidth(), Statics.field750);
        int var3 = Math.max(var1.getHeight(), Statics.field2033);
        if (Statics.field1765 != null) {
            Insets var4 = Statics.field1765.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    public abstract void init();

    @ObfuscatedName("eq.m(B)V")
    public abstract void method253();

    @ObfuscatedName("eq.g(S)V")
    public abstract void method244();

    @ObfuscatedName("eq.s(I)V")
    public abstract void method245();

    @ObfuscatedName("eq.r(I)V")
    public abstract void method393();

    @ObfuscatedName("eq.d(B)V")
    public abstract void method423();
}
