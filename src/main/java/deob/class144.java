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

@ObfuscatedName("ec")
public abstract class class144 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ec.pw")
    public static class144 field2190 = null;

    @ObfuscatedName("ec.pe")
    public static int field2191 = 0;

    @ObfuscatedName("ec.pq")
    public static long field2192 = 0L;

    @ObfuscatedName("ec.pi")
    public static boolean field2199 = false;

    @ObfuscatedName("ec.pc")
    public static int field2195 = 20;

    @ObfuscatedName("ec.qw")
    public static int field2203 = 1;

    @ObfuscatedName("ec.qc")
    public static int field2197 = 0;

    @ObfuscatedName("ec.ql")
    public static long[] field2198 = new long[32];

    @ObfuscatedName("ec.qe")
    public static long[] field2196 = new long[32];

    @ObfuscatedName("ec.qv")
    public static int field2200 = 0;

    @ObfuscatedName("ec.qy")
    public static int field2201 = 0;

    @ObfuscatedName("ec.qd")
    public static volatile boolean field2202 = true;

    @ObfuscatedName("ec.qx")
    public static int field2193 = 500;

    @ObfuscatedName("ec.qz")
    public static boolean field2204 = false;

    @ObfuscatedName("ec.qa")
    public static volatile boolean field2205 = false;

    @ObfuscatedName("ec.qh")
    public static volatile long field2206 = 0L;

    @ObfuscatedName("ec.re")
    public static volatile boolean field2207 = true;

    @ObfuscatedName("ec.pn")
    public boolean field2194 = false;

    @ObfuscatedName("ec.pv(IIII)V")
    public final void method2865(int arg0, int arg1, int arg2) {
        try {
            if (field2190 != null) {
                field2191++;
                if (field2191 >= 3) {
                    this.method2833("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2190 = this;
            Statics.field999 = arg0;
            Statics.field1605 = arg1;
            Statics.field131 = arg2;
            Statics.field2225 = this;
            if (Statics.field1935 == null) {
                Statics.field1935 = new class136();
            }
            Statics.field1935.method2689(this, 1);
        } catch (Exception var5) {
            class148.method2106((String) null, var5);
            this.method2833("crash");
        }
    }

    @ObfuscatedName("ec.ps(I)V")
    public final synchronized void method2824() {
        Container var1 = this.method2834();
        if (Statics.field2029 != null) {
            Statics.field2029.removeFocusListener(this);
            var1.remove(Statics.field2029);
        }
        Statics.field999 = Math.max(var1.getWidth(), Statics.field1404);
        Statics.field1605 = Math.max(var1.getHeight(), Statics.field591);
        if (Statics.field1996 != null) {
            Insets var2 = Statics.field1996.getInsets();
            Statics.field999 -= var2.right + var2.left;
            Statics.field1605 -= var2.top + var2.bottom;
        }
        Statics.field2029 = new class139(this);
        var1.add(Statics.field2029);
        Statics.field2029.setSize(Statics.field999, Statics.field1605);
        Statics.field2029.setVisible(true);
        if (Statics.field1996 == var1) {
            Insets var3 = Statics.field1996.getInsets();
            Statics.field2029.setLocation(field2200 + var3.left, field2201 + var3.top);
        } else {
            Statics.field2029.setLocation(field2200, field2201);
        }
        Statics.field2029.addFocusListener(this);
        Statics.field2029.requestFocus();
        field2202 = true;
        class78 var4 = class78.method2642(Statics.field999, Statics.field1605, Statics.field2029);
        if (Statics.field687 != null) {
            Statics.field687.method1518(var4.field1399.getGraphics(), 0, 0);
        }
        Statics.field687 = var4;
        field2205 = false;
        field2206 = class115.method2007();
    }

    @ObfuscatedName("ec.px(B)Z")
    public final boolean method2863() {
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
                this.method2833("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2101 != null) {
                String var1 = Statics.field2101.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2091;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2833("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class163.method732(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        boolean var5 = false;
                        boolean var6 = false;
                        int var7 = 0;
                        int var8 = var4.length();
                        int var9 = 0;
                        boolean var11;
                        while (true) {
                            if (var9 >= var8) {
                                var11 = var6;
                                break;
                            }
                            label193: {
                                char var10 = var4.charAt(var9);
                                if (var9 == 0) {
                                    if (var10 == '-') {
                                        var5 = true;
                                        break label193;
                                    }
                                    if (var10 == '+') {
                                        break label193;
                                    }
                                }
                                int var23;
                                if (var10 >= '0' && var10 <= '9') {
                                    var23 = var10 - '0';
                                } else if (var10 >= 'A' && var10 <= 'Z') {
                                    var23 = var10 - '7';
                                } else {
                                    if (var10 < 'a' || var10 > 'z') {
                                        var11 = false;
                                        break;
                                    }
                                    var23 = var10 - 'W';
                                }
                                if (var23 >= 10) {
                                    var11 = false;
                                    break;
                                }
                                if (var5) {
                                    var23 = -var23;
                                }
                                int var12 = var7 * 10 + var23;
                                if (var12 / 10 != var7) {
                                    var11 = false;
                                    break;
                                }
                                var7 = var12;
                                var6 = true;
                            }
                            var9++;
                        }
                        if (var11 && class163.method3663(var4) < 10) {
                            this.method2833("wrongjava");
                            return;
                        }
                    }
                    field2203 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2824();
            this.method226();
            class133 var14;
            try {
                var14 = new class147();
            } catch (Throwable var21) {
                var14 = new class141();
            }
            Statics.field1367 = var14;
            label112: while (true) {
                class136 var17;
                Canvas var18;
                do {
                    if (field2192 != 0L && class115.method2007() >= field2192) {
                        break label112;
                    }
                    Statics.field3190 = Statics.field1367.method2659(field2195, field2203);
                    for (int var16 = 0; var16 < Statics.field3190; var16++) {
                        this.method2869();
                    }
                    this.method2880();
                    var17 = Statics.field1935;
                    var18 = Statics.field2029;
                } while (var17.field2097 == null);
                for (int var19 = 0; var19 < 50 && var17.field2097.peekEvent() != null; var19++) {
                    class127.method952(1L);
                }
                if (var18 != null) {
                    var17.field2097.postEvent(new ActionEvent(var18, 1001, "dummy"));
                }
            }
        } catch (Exception var22) {
            class148.method2106((String) null, var22);
            this.method2833("crash");
        }
        this.method2827();
    }

    @ObfuscatedName("ec.pt(S)V")
    public void method2869() {
        long var1 = class115.method2007();
        long var3 = field2196[Statics.field1206];
        field2196[Statics.field1206] = var1;
        Statics.field1206 = Statics.field1206 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field2579 = field2207;
        }
        this.method227();
    }

    @ObfuscatedName("ec.pa(B)V")
    public void method2880() {
        Container var1 = this.method2834();
        long var2 = class115.method2007();
        long var4 = field2198[Statics.field649];
        field2198[Statics.field649] = var2;
        Statics.field649 = Statics.field649 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2197 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2193 - 1 > 50) {
            field2193 -= 50;
            field2202 = true;
            Statics.field2029.setSize(Statics.field999, Statics.field1605);
            Statics.field2029.setVisible(true);
            if (Statics.field1996 == var1) {
                Insets var7 = Statics.field1996.getInsets();
                Statics.field2029.setLocation(field2200 + var7.left, field2201 + var7.top);
            } else {
                Statics.field2029.setLocation(field2200, field2201);
            }
        }
        this.method228();
    }

    @ObfuscatedName("ec.pb(I)V")
    public final synchronized void method2827() {
        if (field2199) {
            return;
        }
        field2199 = true;
        try {
            Statics.field2029.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method229();
        } catch (Exception var7) {
        }
        if (Statics.field1996 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1935 != null) {
            try {
                Statics.field1935.method2685();
            } catch (Exception var5) {
            }
        }
        this.method224();
    }

    public void start() {
        if (field2190 == this && !field2199) {
            field2192 = 0L;
        }
    }

    public void stop() {
        if (field2190 == this && !field2199) {
            field2192 = class115.method2007() + 4000L;
        }
    }

    public void destroy() {
        if (field2190 == this && !field2199) {
            field2192 = class115.method2007();
            class127.method952(5000L);
            this.method2827();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2190 != this || field2199) {
            return;
        }
        field2202 = true;
        if (Statics.field2091 != null && Statics.field2091.startsWith("1.5") && class115.method2007() - field2206 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field999 && var2.height >= Statics.field1605) {
                field2205 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2207 = true;
        field2202 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2207 = false;
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

    @ObfuscatedName("p.pr(ILjava/lang/String;Ljava/awt/Color;ZI)V")
    public static final void method42(int arg0, String arg1, Color arg2, boolean arg3) {
        try {
            Graphics var4 = Statics.field2029.getGraphics();
            if (Statics.field2888 == null) {
                Statics.field2888 = new Font("Helvetica", 1, 13);
                Statics.field691 = Statics.field2029.getFontMetrics(Statics.field2888);
            }
            if (arg3) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field999, Statics.field1605);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field670 == null) {
                    Statics.field670 = Statics.field2029.createImage(304, 34);
                }
                Graphics var5 = Statics.field670.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(Statics.field2888);
                var5.setColor(Color.white);
                var5.drawString(arg1, (304 - Statics.field691.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field670, Statics.field999 / 2 - 152, Statics.field1605 / 2 - 18, (ImageObserver) null);
            } catch (Exception var10) {
                int var7 = Statics.field999 / 2 - 152;
                int var8 = Statics.field1605 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field2888);
                var4.setColor(Color.white);
                var4.drawString(arg1, var7 + (304 - Statics.field691.stringWidth(arg1)) / 2, var8 + 22);
            }
        } catch (Exception var11) {
            Statics.field2029.repaint();
        }
    }

    @ObfuscatedName("aj.pw(I)V")
    public static final void method943() {
        Statics.field670 = null;
        Statics.field2888 = null;
        Statics.field691 = null;
    }

    @ObfuscatedName("ec.pe(Ljava/lang/String;B)V")
    public void method2833(String arg0) {
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

    @ObfuscatedName("ec.pq(I)Ljava/awt/Container;")
    public Container method2834() {
        return Statics.field1996 == null ? this : Statics.field1996;
    }

    @ObfuscatedName("ec.pi(B)Ljava/awt/Dimension;")
    public Dimension method2840() {
        Container var1 = this.method2834();
        int var2 = Math.max(var1.getWidth(), Statics.field1404);
        int var3 = Math.max(var1.getHeight(), Statics.field591);
        if (Statics.field1996 != null) {
            Insets var4 = Statics.field1996.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    @ObfuscatedName("ec.c(I)V")
    public abstract void method227();

    public abstract void init();

    @ObfuscatedName("ec.i(I)V")
    public abstract void method224();

    @ObfuscatedName("ec.f(I)V")
    public abstract void method228();

    @ObfuscatedName("ec.p(I)V")
    public abstract void method226();

    @ObfuscatedName("ec.y(I)V")
    public abstract void method229();
}
