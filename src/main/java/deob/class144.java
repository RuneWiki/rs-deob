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

@ObfuscatedName("ek")
public abstract class class144 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ek.pv")
    public static class144 field2192 = null;

    @ObfuscatedName("ek.pu")
    public static int field2176 = 0;

    @ObfuscatedName("ek.pd")
    public static long field2175 = 0L;

    @ObfuscatedName("ek.pm")
    public static boolean field2177 = false;

    @ObfuscatedName("ek.pz")
    public static int field2181 = 20;

    @ObfuscatedName("ek.qb")
    public static int field2184 = 1;

    @ObfuscatedName("ek.qd")
    public static int field2182 = 0;

    @ObfuscatedName("ek.qj")
    public static long[] field2185 = new long[32];

    @ObfuscatedName("ek.ql")
    public static long[] field2178 = new long[32];

    @ObfuscatedName("ek.qo")
    public static int field2180 = 0;

    @ObfuscatedName("ek.qy")
    public static int field2183 = 0;

    @ObfuscatedName("ek.qq")
    public static volatile boolean field2187 = true;

    @ObfuscatedName("ek.qi")
    public static int field2188 = 500;

    @ObfuscatedName("ek.qa")
    public static boolean field2189 = false;

    @ObfuscatedName("ek.qn")
    public static volatile boolean field2186 = false;

    @ObfuscatedName("ek.qx")
    public static volatile long field2191 = 0L;

    @ObfuscatedName("ek.rx")
    public static volatile boolean field2190 = true;

    @ObfuscatedName("ek.pq")
    public boolean field2179 = false;

    @ObfuscatedName("ek.qi(IIII)V")
    public final void method2829(int arg0, int arg1, int arg2) {
        try {
            if (field2192 != null) {
                field2176++;
                if (field2176 >= 3) {
                    this.method2847("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2192 = this;
            Statics.field1778 = arg0;
            Statics.field2119 = arg1;
            Statics.field2210 = arg2;
            Statics.field2208 = this;
            if (Statics.field2013 == null) {
                Statics.field2013 = new class136();
            }
            Statics.field2013.method2709(this, 1);
        } catch (Exception var5) {
            Statics.method2798((String) null, var5);
            this.method2847("crash");
        }
    }

    @ObfuscatedName("ek.qa(B)V")
    public final synchronized void method2830() {
        Container var1 = this.method2840();
        if (Statics.field1961 != null) {
            Statics.field1961.removeFocusListener(this);
            var1.remove(Statics.field1961);
        }
        Statics.field1778 = Math.max(var1.getWidth(), Statics.field2574);
        Statics.field2119 = Math.max(var1.getHeight(), Statics.field1857);
        if (Statics.field2009 != null) {
            Insets var2 = Statics.field2009.getInsets();
            Statics.field1778 -= var2.right + var2.left;
            Statics.field2119 -= var2.top + var2.bottom;
        }
        Statics.field1961 = new class139(this);
        var1.add(Statics.field1961);
        Statics.field1961.setSize(Statics.field1778, Statics.field2119);
        Statics.field1961.setVisible(true);
        if (Statics.field2009 == var1) {
            Insets var3 = Statics.field2009.getInsets();
            Statics.field1961.setLocation(field2180 + var3.left, field2183 + var3.top);
        } else {
            Statics.field1961.setLocation(field2180, field2183);
        }
        Statics.field1961.addFocusListener(this);
        Statics.field1961.requestFocus();
        field2187 = true;
        class78 var4 = class78.method2218(Statics.field1778, Statics.field2119, Statics.field1961);
        if (Statics.field650 != null) {
            Statics.field650.method1482(var4.field1379.getGraphics(), 0, 0);
        }
        Statics.field650 = var4;
        field2186 = false;
        field2191 = class115.method1998();
    }

    @ObfuscatedName("ek.qn(B)Z")
    public final boolean method2831() {
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
                this.method2847("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2078 != null) {
                String var1 = Statics.field2078.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2897;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2847("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class163.method1926(var2.charAt(var3)); var3++) {
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
                            int var14 = class163.method37(var4, 10, true);
                            if (var14 < 10) {
                                this.method2847("wrongjava");
                                return;
                            }
                        }
                    }
                    field2184 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2830();
            this.method219();
            class133 var15;
            try {
                var15 = new class147();
            } catch (Throwable var22) {
                var15 = new class141();
            }
            Statics.field2171 = var15;
            label112: while (true) {
                class136 var18;
                Canvas var19;
                do {
                    if (field2175 != 0L && class115.method1998() >= field2175) {
                        break label112;
                    }
                    Statics.field1944 = Statics.field2171.method2678(field2181, field2184);
                    for (int var17 = 0; var17 < Statics.field1944; var17++) {
                        this.method2864();
                    }
                    this.method2833();
                    var18 = Statics.field2013;
                    var19 = Statics.field1961;
                } while (var18.field2080 == null);
                for (int var20 = 0; var20 < 50 && var18.field2080.peekEvent() != null; var20++) {
                    class127.method1160(1L);
                }
                if (var19 != null) {
                    var18.field2080.postEvent(new ActionEvent(var19, 1001, "dummy"));
                }
            }
        } catch (Exception var23) {
            Statics.method2798((String) null, var23);
            this.method2847("crash");
        }
        this.method2834();
    }

    @ObfuscatedName("ek.qx(B)V")
    public void method2864() {
        long var1 = class115.method1998();
        long var3 = field2178[Statics.field1744];
        field2178[Statics.field1744] = var1;
        Statics.field1744 = Statics.field1744 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1767 = field2190;
        }
        this.method369();
    }

    @ObfuscatedName("ek.rf(I)V")
    public void method2833() {
        Container var1 = this.method2840();
        long var2 = class115.method1998();
        long var4 = field2185[Statics.field1505];
        field2185[Statics.field1505] = var2;
        Statics.field1505 = Statics.field1505 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2182 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2188 - 1 > 50) {
            field2188 -= 50;
            field2187 = true;
            Statics.field1961.setSize(Statics.field1778, Statics.field2119);
            Statics.field1961.setVisible(true);
            if (Statics.field2009 == var1) {
                Insets var7 = Statics.field2009.getInsets();
                Statics.field1961.setLocation(field2180 + var7.left, field2183 + var7.top);
            } else {
                Statics.field1961.setLocation(field2180, field2183);
            }
        }
        this.method221();
    }

    @ObfuscatedName("ek.rx(I)V")
    public final synchronized void method2834() {
        if (field2177) {
            return;
        }
        field2177 = true;
        try {
            Statics.field1961.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method222();
        } catch (Exception var7) {
        }
        if (Statics.field2009 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field2013 != null) {
            try {
                Statics.field2013.method2705();
            } catch (Exception var5) {
            }
        }
        this.method217();
    }

    @ObfuscatedName("s.rv(I)V")
    public static final void method18() {
        Statics.field2171.method2677();
        for (int var0 = 0; var0 < 32; var0++) {
            field2185[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2178[var1] = 0L;
        }
        Statics.field1944 = 0;
    }

    public void start() {
        if (field2192 == this && !field2177) {
            field2175 = 0L;
        }
    }

    public void stop() {
        if (field2192 == this && !field2177) {
            field2175 = class115.method1998() + 4000L;
        }
    }

    public void destroy() {
        if (field2192 == this && !field2177) {
            field2175 = class115.method1998();
            class127.method1160(5000L);
            this.method2834();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2192 != this || field2177) {
            return;
        }
        field2187 = true;
        if (Statics.field2897 != null && Statics.field2897.startsWith("1.5") && class115.method1998() - field2191 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1778 && var2.height >= Statics.field2119) {
                field2186 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2190 = true;
        field2187 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2190 = false;
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

    @ObfuscatedName("aq.re(ILjava/lang/String;Ljava/awt/Color;ZI)V")
    public static final void method623(int arg0, String arg1, Color arg2, boolean arg3) {
        try {
            Graphics var4 = Statics.field1961.getGraphics();
            if (Statics.field159 == null) {
                Statics.field159 = new Font("Helvetica", 1, 13);
                Statics.field256 = Statics.field1961.getFontMetrics(Statics.field159);
            }
            if (arg3) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field1778, Statics.field2119);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field680 == null) {
                    Statics.field680 = Statics.field1961.createImage(304, 34);
                }
                Graphics var5 = Statics.field680.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(Statics.field159);
                var5.setColor(Color.white);
                var5.drawString(arg1, (304 - Statics.field256.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field680, Statics.field1778 / 2 - 152, Statics.field2119 / 2 - 18, (ImageObserver) null);
            } catch (Exception var10) {
                int var7 = Statics.field1778 / 2 - 152;
                int var8 = Statics.field2119 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field159);
                var4.setColor(Color.white);
                var4.drawString(arg1, var7 + (304 - Statics.field256.stringWidth(arg1)) / 2, var8 + 22);
            }
        } catch (Exception var11) {
            Statics.field1961.repaint();
        }
    }

    @ObfuscatedName("ds.rq(B)V")
    public static final void method2617() {
        Statics.field680 = null;
        Statics.field159 = null;
        Statics.field256 = null;
    }

    @ObfuscatedName("ek.ru(Ljava/lang/String;I)V")
    public void method2847(String arg0) {
        if (this.field2179) {
            return;
        }
        this.field2179 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ek.rc(I)Ljava/awt/Container;")
    public Container method2840() {
        return Statics.field2009 == null ? this : Statics.field2009;
    }

    @ObfuscatedName("ek.ry(I)Ljava/awt/Dimension;")
    public Dimension method2893() {
        Container var1 = this.method2840();
        int var2 = Math.max(var1.getWidth(), Statics.field2574);
        int var3 = Math.max(var1.getHeight(), Statics.field1857);
        if (Statics.field2009 != null) {
            Insets var4 = Statics.field2009.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    public abstract void init();

    @ObfuscatedName("ek.k(S)V")
    public abstract void method369();

    @ObfuscatedName("ek.i(I)V")
    public abstract void method221();

    @ObfuscatedName("ek.m(I)V")
    public abstract void method222();

    @ObfuscatedName("ek.j(I)V")
    public abstract void method219();

    @ObfuscatedName("ek.s(I)V")
    public abstract void method217();
}
