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
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.net.URL;

@ObfuscatedName("ev")
public abstract class class144 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ev.pn")
    public static class144 field2196 = null;

    @ObfuscatedName("ev.pf")
    public static int field2182 = 0;

    @ObfuscatedName("ev.pl")
    public static long field2183 = 0L;

    @ObfuscatedName("ev.pq")
    public static boolean field2184 = false;

    @ObfuscatedName("ev.pe")
    public static int field2186 = 20;

    @ObfuscatedName("ev.qm")
    public static int field2195 = 1;

    @ObfuscatedName("ev.qa")
    public static int field2187 = 0;

    @ObfuscatedName("ev.qp")
    public static long[] field2189 = new long[32];

    @ObfuscatedName("ev.qb")
    public static long[] field2191 = new long[32];

    @ObfuscatedName("ev.qy")
    public static int field2202 = 0;

    @ObfuscatedName("ev.ql")
    public static int field2192 = 0;

    @ObfuscatedName("ev.qr")
    public static volatile boolean field2193 = true;

    @ObfuscatedName("ev.qt")
    public static int field2194 = 500;

    @ObfuscatedName("ev.qi")
    public static boolean field2188 = false;

    @ObfuscatedName("ev.qf")
    public static volatile boolean field2190 = false;

    @ObfuscatedName("ev.qk")
    public static volatile long field2197 = 0L;

    @ObfuscatedName("ev.rr")
    public static volatile boolean field2198 = true;

    @ObfuscatedName("ev.pt")
    public boolean field2185 = false;

    @ObfuscatedName("ev.pr(IIII)V")
    public final void method2797(int arg0, int arg1, int arg2) {
        try {
            if (field2196 != null) {
                field2182++;
                if (field2182 >= 3) {
                    this.method2806("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2196 = this;
            Statics.field2656 = arg0;
            Statics.field2160 = arg1;
            Statics.field2215 = arg2;
            Statics.field3191 = this;
            if (Statics.field1158 == null) {
                Statics.field1158 = new class136();
            }
            Statics.field1158.method2683(this, 1);
        } catch (Exception var5) {
            Statics.method929((String) null, var5);
            this.method2806("crash");
        }
    }

    @ObfuscatedName("ev.pp(I)V")
    public final synchronized void method2829() {
        Container var1 = this.method2807();
        if (Statics.field773 != null) {
            Statics.field773.removeFocusListener(this);
            var1.remove(Statics.field773);
        }
        Statics.field2656 = Math.max(var1.getWidth(), Statics.field1960);
        Statics.field2160 = Math.max(var1.getHeight(), Statics.field203);
        if (Statics.field786 != null) {
            Insets var2 = Statics.field786.getInsets();
            Statics.field2656 -= var2.right + var2.left;
            Statics.field2160 -= var2.top + var2.bottom;
        }
        Statics.field773 = new class139(this);
        var1.add(Statics.field773);
        Statics.field773.setSize(Statics.field2656, Statics.field2160);
        Statics.field773.setVisible(true);
        if (Statics.field786 == var1) {
            Insets var3 = Statics.field786.getInsets();
            Statics.field773.setLocation(field2202 + var3.left, field2192 + var3.top);
        } else {
            Statics.field773.setLocation(field2202, field2192);
        }
        Statics.field773.addFocusListener(this);
        Statics.field773.requestFocus();
        field2193 = true;
        class78 var4 = Statics.method548(Statics.field2656, Statics.field2160, Statics.field773);
        if (Statics.field2029 != null) {
            Statics.field2029.method1477(var4.field1399.getGraphics(), 0, 0);
        }
        Statics.field2029 = var4;
        field2190 = false;
        field2197 = class115.method2906();
    }

    @ObfuscatedName("ev.pj(I)Z")
    public final boolean method2799() {
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
                this.method2806("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2086 != null) {
                String var1 = Statics.field2086.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2085;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2806("wrongjava");
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
                        if (class163.method2238(var6) && class163.method2242(var6) < 10) {
                            this.method2806("wrongjava");
                            return;
                        }
                    }
                    field2195 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2829();
            this.method227();
            Statics.field2289 = class133.method3268();
            label83: while (true) {
                class136 var8;
                Canvas var9;
                do {
                    if (field2183 != 0L && class115.method2906() >= field2183) {
                        break label83;
                    }
                    Statics.field1955 = Statics.field2289.method2643(field2186, field2195);
                    for (int var7 = 0; var7 < Statics.field1955; var7++) {
                        this.method2827();
                    }
                    this.method2820();
                    var8 = Statics.field1158;
                    var9 = Statics.field773;
                } while (var8.field2091 == null);
                for (int var10 = 0; var10 < 50 && var8.field2091.peekEvent() != null; var10++) {
                    class127.method848(1L);
                }
                if (var9 != null) {
                    var8.field2091.postEvent(new ActionEvent(var9, 1001, "dummy"));
                }
            }
        } catch (Exception var12) {
            Statics.method929((String) null, var12);
            this.method2806("crash");
        }
        this.method2812();
    }

    @ObfuscatedName("ev.ps(I)V")
    public void method2827() {
        long var1 = class115.method2906();
        long var3 = field2191[Statics.field3151];
        field2191[Statics.field3151] = var1;
        Statics.field3151 = Statics.field3151 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field3137 = field2198;
        }
        this.method228();
    }

    @ObfuscatedName("ev.pc(I)V")
    public void method2820() {
        Container var1 = this.method2807();
        long var2 = class115.method2906();
        long var4 = field2189[Statics.field1596];
        field2189[Statics.field1596] = var2;
        Statics.field1596 = Statics.field1596 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2187 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2194 - 1 > 50) {
            field2194 -= 50;
            field2193 = true;
            Statics.field773.setSize(Statics.field2656, Statics.field2160);
            Statics.field773.setVisible(true);
            if (Statics.field786 == var1) {
                Insets var7 = Statics.field786.getInsets();
                Statics.field773.setLocation(field2202 + var7.left, field2192 + var7.top);
            } else {
                Statics.field773.setLocation(field2202, field2192);
            }
        }
        this.method229();
    }

    @ObfuscatedName("ev.pa(I)V")
    public final synchronized void method2812() {
        if (field2184) {
            return;
        }
        field2184 = true;
        try {
            Statics.field773.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method230();
        } catch (Exception var7) {
        }
        if (Statics.field786 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1158 != null) {
            try {
                Statics.field1158.method2685();
            } catch (Exception var5) {
            }
        }
        this.method225();
    }

    @ObfuscatedName("i.pd(I)V")
    public static final void method4() {
        Statics.field2289.method2640();
        for (int var0 = 0; var0 < 32; var0++) {
            field2189[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2191[var1] = 0L;
        }
        Statics.field1955 = 0;
    }

    public void start() {
        if (field2196 == this && !field2184) {
            field2183 = 0L;
        }
    }

    public void stop() {
        if (field2196 == this && !field2184) {
            field2183 = class115.method2906() + 4000L;
        }
    }

    public void destroy() {
        if (field2196 == this && !field2184) {
            field2183 = class115.method2906();
            class127.method848(5000L);
            this.method2812();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2196 != this || field2184) {
            return;
        }
        field2193 = true;
        if (Statics.field2085 != null && Statics.field2085.startsWith("1.5") && class115.method2906() - field2197 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field2656 && var2.height >= Statics.field2160) {
                field2190 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2198 = true;
        field2193 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2198 = false;
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

    @ObfuscatedName("ak.pu(ILjava/lang/String;Ljava/awt/Color;ZI)V")
    public static final void method586(int arg0, String arg1, Color arg2, boolean arg3) {
        try {
            Graphics var4 = Statics.field773.getGraphics();
            if (Statics.field1983 == null) {
                Statics.field1983 = new Font("Helvetica", 1, 13);
                Statics.field1967 = Statics.field773.getFontMetrics(Statics.field1983);
            }
            if (arg3) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field2656, Statics.field2160);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field1454 == null) {
                    Statics.field1454 = Statics.field773.createImage(304, 34);
                }
                Graphics var5 = Statics.field1454.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(Statics.field1983);
                var5.setColor(Color.white);
                var5.drawString(arg1, (304 - Statics.field1967.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field1454, Statics.field2656 / 2 - 152, Statics.field2160 / 2 - 18, (ImageObserver) null);
            } catch (Exception var10) {
                int var7 = Statics.field2656 / 2 - 152;
                int var8 = Statics.field2160 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1983);
                var4.setColor(Color.white);
                var4.drawString(arg1, var7 + (304 - Statics.field1967.stringWidth(arg1)) / 2, var8 + 22);
            }
        } catch (Exception var11) {
            Statics.field773.repaint();
        }
    }

    @ObfuscatedName("ev.pv(Ljava/lang/String;B)V")
    public void method2806(String arg0) {
        if (this.field2185) {
            return;
        }
        this.field2185 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ev.pb(I)Ljava/awt/Container;")
    public Container method2807() {
        return Statics.field786 == null ? this : Statics.field786;
    }

    @ObfuscatedName("ev.pg(B)Ljava/awt/Dimension;")
    public Dimension method2808() {
        Container var1 = this.method2807();
        int var2 = Math.max(var1.getWidth(), Statics.field1960);
        int var3 = Math.max(var1.getHeight(), Statics.field203);
        if (Statics.field786 != null) {
            Insets var4 = Statics.field786.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    public abstract void init();

    @ObfuscatedName("ev.p(I)V")
    public abstract void method227();

    @ObfuscatedName("ev.d(B)V")
    public abstract void method230();

    @ObfuscatedName("ev.h(S)V")
    public abstract void method225();

    @ObfuscatedName("ev.k(B)V")
    public abstract void method229();

    @ObfuscatedName("ev.r(B)V")
    public abstract void method228();
}
