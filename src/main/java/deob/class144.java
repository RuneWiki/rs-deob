package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;

@ObfuscatedName("ek")
public abstract class class144 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ek.pz")
    public static class144 field2190 = null;

    @ObfuscatedName("ek.pc")
    public static int field2171 = 0;

    @ObfuscatedName("ek.pe")
    public static long field2172 = 0L;

    @ObfuscatedName("ek.pw")
    public static boolean field2173 = false;

    @ObfuscatedName("ek.ph")
    public static int field2175 = 20;

    @ObfuscatedName("ek.qa")
    public static int field2176 = 1;

    @ObfuscatedName("ek.qe")
    public static int field2177 = 0;

    @ObfuscatedName("ek.qn")
    public static long[] field2178 = new long[32];

    @ObfuscatedName("ek.qh")
    public static long[] field2174 = new long[32];

    @ObfuscatedName("ek.qq")
    public static int field2179 = 0;

    @ObfuscatedName("ek.qw")
    public static int field2180 = 0;

    @ObfuscatedName("ek.qy")
    public static volatile boolean field2182 = true;

    @ObfuscatedName("ek.qo")
    public static int field2186 = 500;

    @ObfuscatedName("ek.qm")
    public static boolean field2184 = false;

    @ObfuscatedName("ek.qt")
    public static volatile boolean field2185 = false;

    @ObfuscatedName("ek.qd")
    public static volatile long field2181 = 0L;

    @ObfuscatedName("ek.rj")
    public static volatile boolean field2183 = true;

    @ObfuscatedName("ek.pt")
    public boolean field2192 = false;

    @ObfuscatedName("ek.pt(IIIB)V")
    public final void method2811(int arg0, int arg1, int arg2) {
        try {
            if (field2190 != null) {
                field2171++;
                if (field2171 >= 3) {
                    this.method2821("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2190 = this;
            Statics.field2114 = arg0;
            Statics.field2638 = arg1;
            Statics.field2204 = arg2;
            Statics.field2210 = this;
            if (Statics.field1981 == null) {
                Statics.field1981 = new class136();
            }
            Statics.field1981.method2689(this, 1);
        } catch (Exception var5) {
            class148.method2701((String) null, var5);
            this.method2821("crash");
        }
    }

    @ObfuscatedName("ek.pg(S)V")
    public final synchronized void method2812() {
        Container var1 = this.method2815();
        if (Statics.field252 != null) {
            Statics.field252.removeFocusListener(this);
            var1.remove(Statics.field252);
        }
        Statics.field2114 = Math.max(var1.getWidth(), Statics.field1940);
        Statics.field2638 = Math.max(var1.getHeight(), Statics.field1103);
        if (Statics.field1609 != null) {
            Insets var2 = Statics.field1609.getInsets();
            Statics.field2114 -= var2.right + var2.left;
            Statics.field2638 -= var2.top + var2.bottom;
        }
        Statics.field252 = new class139(this);
        var1.add(Statics.field252);
        Statics.field252.setSize(Statics.field2114, Statics.field2638);
        Statics.field252.setVisible(true);
        if (Statics.field1609 == var1) {
            Insets var3 = Statics.field1609.getInsets();
            Statics.field252.setLocation(field2179 + var3.left, field2180 + var3.top);
        } else {
            Statics.field252.setLocation(field2179, field2180);
        }
        Statics.field252.addFocusListener(this);
        Statics.field252.requestFocus();
        field2182 = true;
        int var4 = Statics.field2114;
        int var5 = Statics.field2638;
        Canvas var6 = Statics.field252;
        class78 var8;
        try {
            class82 var7 = new class82();
            var7.method1510(var4, var5, var6);
            var8 = var7;
        } catch (Throwable var12) {
            class76 var10 = new class76();
            var10.method1510(var4, var5, var6);
            var8 = var10;
        }
        if (Statics.field2119 != null) {
            Statics.field2119.method1511(var8.field1397.getGraphics(), 0, 0);
        }
        Statics.field2119 = var8;
        field2185 = false;
        field2181 = class115.method671();
    }

    @ObfuscatedName("ek.ph(S)Z")
    public final boolean method2813() {
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
                this.method2821("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2074 != null) {
                String var1 = Statics.field2074.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2073;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2821("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class163.method2648(var2.charAt(var3)); var3++) {
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
                                int var24;
                                if (var10 >= '0' && var10 <= '9') {
                                    var24 = var10 - '0';
                                } else if (var10 >= 'A' && var10 <= 'Z') {
                                    var24 = var10 - '7';
                                } else {
                                    if (var10 < 'a' || var10 > 'z') {
                                        var11 = false;
                                        break;
                                    }
                                    var24 = var10 - 'W';
                                }
                                if (var24 >= 10) {
                                    var11 = false;
                                    break;
                                }
                                if (var5) {
                                    var24 = -var24;
                                }
                                int var12 = var7 * 10 + var24;
                                if (var12 / 10 != var7) {
                                    var11 = false;
                                    break;
                                }
                                var7 = var12;
                                var6 = true;
                            }
                            var9++;
                        }
                        if (var11) {
                            int var14 = class163.method708(var4, 10, true);
                            if (var14 < 10) {
                                this.method2821("wrongjava");
                                return;
                            }
                        }
                    }
                    field2176 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2812();
            this.method272();
            class133 var15;
            try {
                var15 = new class147();
            } catch (Throwable var22) {
                var15 = new class141();
            }
            Statics.field969 = var15;
            label112: while (true) {
                class136 var18;
                Canvas var19;
                do {
                    if (field2172 != 0L && class115.method671() >= field2172) {
                        break label112;
                    }
                    Statics.field999 = Statics.field969.method2659(field2175, field2176);
                    for (int var17 = 0; var17 < Statics.field999; var17++) {
                        this.method2867();
                    }
                    this.method2854();
                    var18 = Statics.field1981;
                    var19 = Statics.field252;
                } while (var18.field2069 == null);
                for (int var20 = 0; var20 < 50 && var18.field2069.peekEvent() != null; var20++) {
                    class127.method1535(1L);
                }
                if (var19 != null) {
                    var18.field2069.postEvent(new ActionEvent(var19, 1001, "dummy"));
                }
            }
        } catch (Exception var23) {
            class148.method2701((String) null, var23);
            this.method2821("crash");
        }
        this.method2816();
    }

    @ObfuscatedName("ek.qa(I)V")
    public void method2867() {
        long var1 = class115.method671();
        long var3 = field2174[Statics.field1557];
        field2174[Statics.field1557] = var1;
        Statics.field1557 = Statics.field1557 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field255 = field2183;
        }
        this.method244();
    }

    @ObfuscatedName("ek.qe(I)V")
    public void method2854() {
        Container var1 = this.method2815();
        long var2 = class115.method671();
        long var4 = field2178[Statics.field1030];
        field2178[Statics.field1030] = var2;
        Statics.field1030 = Statics.field1030 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2177 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2186 - 1 > 50) {
            field2186 -= 50;
            field2182 = true;
            Statics.field252.setSize(Statics.field2114, Statics.field2638);
            Statics.field252.setVisible(true);
            if (Statics.field1609 == var1) {
                Insets var7 = Statics.field1609.getInsets();
                Statics.field252.setLocation(field2179 + var7.left, field2180 + var7.top);
            } else {
                Statics.field252.setLocation(field2179, field2180);
            }
        }
        this.method365();
    }

    @ObfuscatedName("ek.qk(B)V")
    public final synchronized void method2816() {
        if (field2173) {
            return;
        }
        field2173 = true;
        try {
            Statics.field252.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method246();
        } catch (Exception var7) {
        }
        if (Statics.field1609 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1981 != null) {
            try {
                Statics.field1981.method2679();
            } catch (Exception var5) {
            }
        }
        this.method241();
    }

    public void start() {
        if (field2190 == this && !field2173) {
            field2172 = 0L;
        }
    }

    public void stop() {
        if (field2190 == this && !field2173) {
            field2172 = class115.method671() + 4000L;
        }
    }

    public void destroy() {
        if (field2190 == this && !field2173) {
            field2172 = class115.method671();
            class127.method1535(5000L);
            this.method2816();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2190 != this || field2173) {
            return;
        }
        field2182 = true;
        if (Statics.field2073 != null && Statics.field2073.startsWith("1.5") && class115.method671() - field2181 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field2114 && var2.height >= Statics.field2638) {
                field2185 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2183 = true;
        field2182 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2183 = false;
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

    @ObfuscatedName("ek.qs(Ljava/lang/String;I)V")
    public void method2821(String arg0) {
        if (this.field2192) {
            return;
        }
        this.field2192 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ek.qn(I)Ljava/awt/Container;")
    public Container method2815() {
        return Statics.field1609 == null ? this : Statics.field1609;
    }

    @ObfuscatedName("ek.qp(B)Ljava/awt/Dimension;")
    public Dimension method2823() {
        Container var1 = this.method2815();
        int var2 = Math.max(var1.getWidth(), Statics.field1940);
        int var3 = Math.max(var1.getHeight(), Statics.field1103);
        if (Statics.field1609 != null) {
            Insets var4 = Statics.field1609.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    @ObfuscatedName("ek.e(I)V")
    public abstract void method272();

    @ObfuscatedName("ek.c(I)V")
    public abstract void method244();

    public abstract void init();

    @ObfuscatedName("ek.a(B)V")
    public abstract void method365();

    @ObfuscatedName("ek.q(I)V")
    public abstract void method246();

    @ObfuscatedName("ek.d(B)V")
    public abstract void method241();
}
