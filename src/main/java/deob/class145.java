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

@ObfuscatedName("et")
public abstract class class145 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("et.pi")
    public static class145 field2189 = null;

    @ObfuscatedName("et.pz")
    public static int field2202 = 0;

    @ObfuscatedName("et.pb")
    public static long field2188 = 0L;

    @ObfuscatedName("et.pr")
    public static boolean field2204 = false;

    @ObfuscatedName("et.qf")
    public static int field2191 = 20;

    @ObfuscatedName("et.qd")
    public static int field2196 = 1;

    @ObfuscatedName("et.qg")
    public static int field2186 = 0;

    @ObfuscatedName("et.qt")
    public static long[] field2197 = new long[32];

    @ObfuscatedName("et.qp")
    public static long[] field2195 = new long[32];

    @ObfuscatedName("et.qy")
    public static int field2193 = 0;

    @ObfuscatedName("et.qr")
    public static int field2192 = 0;

    @ObfuscatedName("et.qi")
    public static volatile boolean field2198 = true;

    @ObfuscatedName("et.qn")
    public static int field2199 = 500;

    @ObfuscatedName("et.qw")
    public static boolean field2200 = false;

    @ObfuscatedName("et.qe")
    public static volatile boolean field2201 = false;

    @ObfuscatedName("et.ry")
    public static volatile long field2190 = 0L;

    @ObfuscatedName("et.ru")
    public static volatile boolean field2187 = true;

    @ObfuscatedName("et.po")
    public boolean field2194 = false;

    @ObfuscatedName("et.si(IIII)V")
    public final void method3014(int arg0, int arg1, int arg2) {
        try {
            if (field2189 != null) {
                field2202++;
                if (field2202 >= 3) {
                    this.method2953("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2189 = this;
            Statics.field877 = arg0;
            Statics.field1672 = arg1;
            Statics.field2218 = arg2;
            Statics.field2042 = this;
            if (Statics.field1875 == null) {
                Statics.field1875 = new class137();
            }
            Statics.field1875.method2831(this, 1);
        } catch (Exception var5) {
            class149.method650((String) null, var5);
            this.method2953("crash");
        }
    }

    @ObfuscatedName("et.sz(I)V")
    public final synchronized void method2950() {
        Container var1 = this.method2954();
        if (Statics.field2586 != null) {
            Statics.field2586.removeFocusListener(this);
            var1.remove(Statics.field2586);
        }
        Statics.field877 = Math.max(var1.getWidth(), Statics.field3077);
        Statics.field1672 = Math.max(var1.getHeight(), Statics.field720);
        if (Statics.field761 != null) {
            Insets var2 = Statics.field761.getInsets();
            Statics.field877 -= var2.right + var2.left;
            Statics.field1672 -= var2.top + var2.bottom;
        }
        Statics.field2586 = new class140(this);
        var1.add(Statics.field2586);
        Statics.field2586.setSize(Statics.field877, Statics.field1672);
        Statics.field2586.setVisible(true);
        if (Statics.field761 == var1) {
            Insets var3 = Statics.field761.getInsets();
            Statics.field2586.setLocation(field2193 + var3.left, field2192 + var3.top);
        } else {
            Statics.field2586.setLocation(field2193, field2192);
        }
        Statics.field2586.addFocusListener(this);
        Statics.field2586.requestFocus();
        field2198 = true;
        class78 var4 = class78.method1076(Statics.field877, Statics.field1672, Statics.field2586);
        if (Statics.field696 != null) {
            Statics.field696.method1604(var4.field1397.getGraphics(), 0, 0);
        }
        Statics.field696 = var4;
        field2201 = false;
        field2190 = class116.method2781();
    }

    @ObfuscatedName("et.th(I)Z")
    public final boolean method2947() {
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
                this.method2953("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2097 != null) {
                String var1 = Statics.field2097.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2093;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2953("wrongjava");
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
                        boolean var7 = class164.method3067(var6, 10, true);
                        if (var7) {
                            int var8 = class164.method3053(var6, 10, true);
                            if (var8 < 10) {
                                this.method2953("wrongjava");
                                return;
                            }
                        }
                    }
                    field2196 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2950();
            this.method288();
            class134 var9;
            try {
                var9 = new class148();
            } catch (Throwable var13) {
                var9 = new class142();
            }
            Statics.field1092 = var9;
            while (field2188 == 0L || class116.method2781() < field2188) {
                Statics.field1098 = Statics.field1092.method2804(field2191, field2196);
                for (int var11 = 0; var11 < Statics.field1098; var11++) {
                    this.method2948();
                }
                this.method2997();
                class143.method2709(Statics.field1875, Statics.field2586);
            }
        } catch (Exception var14) {
            class149.method650((String) null, var14);
            this.method2953("crash");
        }
        this.method2949();
    }

    @ObfuscatedName("et.tk(I)V")
    public void method2948() {
        long var1 = class116.method2781();
        long var3 = field2195[Statics.field1681];
        field2195[Statics.field1681] = var1;
        Statics.field1681 = Statics.field1681 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field2011 = field2187;
        }
        this.method259();
    }

    @ObfuscatedName("et.ts(I)V")
    public void method2997() {
        Container var1 = this.method2954();
        long var2 = class116.method2781();
        long var4 = field2197[Statics.field1034];
        field2197[Statics.field1034] = var2;
        Statics.field1034 = Statics.field1034 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2186 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2199 - 1 > 50) {
            field2199 -= 50;
            field2198 = true;
            Statics.field2586.setSize(Statics.field877, Statics.field1672);
            Statics.field2586.setVisible(true);
            if (Statics.field761 == var1) {
                Insets var7 = Statics.field761.getInsets();
                Statics.field2586.setLocation(field2193 + var7.left, field2192 + var7.top);
            } else {
                Statics.field2586.setLocation(field2193, field2192);
            }
        }
        this.method260();
    }

    @ObfuscatedName("et.to(B)V")
    public final synchronized void method2949() {
        if (field2204) {
            return;
        }
        field2204 = true;
        try {
            Statics.field2586.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method261();
        } catch (Exception var7) {
        }
        if (Statics.field761 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1875 != null) {
            try {
                Statics.field1875.method2847();
            } catch (Exception var5) {
            }
        }
        this.method256();
    }

    public void start() {
        if (field2189 == this && !field2204) {
            field2188 = 0L;
        }
    }

    public void stop() {
        if (field2189 == this && !field2204) {
            field2188 = class116.method2781() + 4000L;
        }
    }

    public void destroy() {
        if (field2189 == this && !field2204) {
            field2188 = class116.method2781();
            class128.method56(5000L);
            this.method2949();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2189 != this || field2204) {
            return;
        }
        field2198 = true;
        if (Statics.field2093 != null && Statics.field2093.startsWith("1.5") && class116.method2781() - field2190 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field877 && var2.height >= Statics.field1672) {
                field2201 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2187 = true;
        field2198 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2187 = false;
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

    @ObfuscatedName("dq.tz(ILjava/lang/String;Ljava/awt/Color;ZS)V")
    public static final void method2778(int arg0, String arg1, Color arg2, boolean arg3) {
        try {
            Graphics var4 = Statics.field2586.getGraphics();
            if (Statics.field709 == null) {
                Statics.field709 = new Font("Helvetica", 1, 13);
                Statics.field626 = Statics.field2586.getFontMetrics(Statics.field709);
            }
            if (arg3) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field877, Statics.field1672);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field1865 == null) {
                    Statics.field1865 = Statics.field2586.createImage(304, 34);
                }
                Graphics var5 = Statics.field1865.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(Statics.field709);
                var5.setColor(Color.white);
                var5.drawString(arg1, (304 - Statics.field626.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field1865, Statics.field877 / 2 - 152, Statics.field1672 / 2 - 18, (ImageObserver) null);
            } catch (Exception var10) {
                int var7 = Statics.field877 / 2 - 152;
                int var8 = Statics.field1672 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field709);
                var4.setColor(Color.white);
                var4.drawString(arg1, var7 + (304 - Statics.field626.stringWidth(arg1)) / 2, var8 + 22);
            }
        } catch (Exception var11) {
            Statics.field2586.repaint();
        }
    }

    @ObfuscatedName("ey.tg(I)V")
    public static final void method2941() {
        Statics.field1865 = null;
        Statics.field709 = null;
        Statics.field626 = null;
    }

    @ObfuscatedName("et.tx(Ljava/lang/String;I)V")
    public void method2953(String arg0) {
        if (this.field2194) {
            return;
        }
        this.field2194 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("et.ti(I)Ljava/awt/Container;")
    public Container method2954() {
        return Statics.field761 == null ? this : Statics.field761;
    }

    @ObfuscatedName("et.tr(I)Ljava/awt/Dimension;")
    public Dimension method2955() {
        Container var1 = this.method2954();
        int var2 = Math.max(var1.getWidth(), Statics.field3077);
        int var3 = Math.max(var1.getHeight(), Statics.field720);
        if (Statics.field761 != null) {
            Insets var4 = Statics.field761.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    @ObfuscatedName("et.w(I)V")
    public abstract void method256();

    public abstract void init();

    @ObfuscatedName("et.c(I)V")
    public abstract void method288();

    @ObfuscatedName("et.k(I)V")
    public abstract void method260();

    @ObfuscatedName("et.r(I)V")
    public abstract void method261();

    @ObfuscatedName("et.y(I)V")
    public abstract void method259();
}
