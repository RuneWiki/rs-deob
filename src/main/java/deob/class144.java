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

    @ObfuscatedName("ev.ph")
    public static class144 field2177 = null;

    @ObfuscatedName("ev.pi")
    public static int field2176 = 0;

    @ObfuscatedName("ev.py")
    public static long field2184 = 0L;

    @ObfuscatedName("ev.pk")
    public static boolean field2178 = false;

    @ObfuscatedName("ev.qk")
    public static int field2179 = 20;

    @ObfuscatedName("ev.qe")
    public static int field2181 = 1;

    @ObfuscatedName("ev.qy")
    public static int field2175 = 0;

    @ObfuscatedName("ev.qc")
    public static long[] field2183 = new long[32];

    @ObfuscatedName("ev.qj")
    public static long[] field2180 = new long[32];

    @ObfuscatedName("ev.qb")
    public static int field2185 = 0;

    @ObfuscatedName("ev.qd")
    public static int field2182 = 0;

    @ObfuscatedName("ev.qr")
    public static volatile boolean field2193 = true;

    @ObfuscatedName("ev.qv")
    public static int field2189 = 500;

    @ObfuscatedName("ev.qw")
    public static boolean field2190 = false;

    @ObfuscatedName("ev.qf")
    public static volatile boolean field2191 = false;

    @ObfuscatedName("ev.rr")
    public static volatile long field2192 = 0L;

    @ObfuscatedName("ev.rt")
    public static volatile boolean field2186 = true;

    @ObfuscatedName("ev.pb")
    public boolean field2188 = false;

    @ObfuscatedName("ev.rr(IIII)V")
    public final void method2874(int arg0, int arg1, int arg2) {
        try {
            if (field2177 != null) {
                field2176++;
                if (field2176 >= 3) {
                    this.method2893("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2177 = this;
            Statics.field963 = arg0;
            Statics.field1048 = arg1;
            Statics.field2208 = arg2;
            Statics.field2209 = this;
            if (Statics.field162 == null) {
                Statics.field162 = new class136();
            }
            Statics.field162.method2713(this, 1);
        } catch (Exception var5) {
            class148.method2765((String) null, var5);
            this.method2893("crash");
        }
    }

    @ObfuscatedName("ev.rg(I)V")
    public final synchronized void method2853() {
        Container var1 = this.method2864();
        if (Statics.field1886 != null) {
            Statics.field1886.removeFocusListener(this);
            var1.remove(Statics.field1886);
        }
        Statics.field963 = Math.max(var1.getWidth(), Statics.field636);
        Statics.field1048 = Math.max(var1.getHeight(), Statics.field778);
        if (Statics.field1439 != null) {
            Insets var2 = Statics.field1439.getInsets();
            Statics.field963 -= var2.right + var2.left;
            Statics.field1048 -= var2.top + var2.bottom;
        }
        Statics.field1886 = new class139(this);
        var1.add(Statics.field1886);
        Statics.field1886.setSize(Statics.field963, Statics.field1048);
        Statics.field1886.setVisible(true);
        if (Statics.field1439 == var1) {
            Insets var3 = Statics.field1439.getInsets();
            Statics.field1886.setLocation(field2185 + var3.left, field2182 + var3.top);
        } else {
            Statics.field1886.setLocation(field2185, field2182);
        }
        Statics.field1886.addFocusListener(this);
        Statics.field1886.requestFocus();
        field2193 = true;
        int var4 = Statics.field963;
        int var5 = Statics.field1048;
        Canvas var6 = Statics.field1886;
        class78 var8;
        try {
            class82 var7 = new class82();
            var7.method1513(var4, var5, var6);
            var8 = var7;
        } catch (Throwable var12) {
            class76 var10 = new class76();
            var10.method1513(var4, var5, var6);
            var8 = var10;
        }
        if (Statics.field945 != null) {
            Statics.field945.method1514(var8.field1380.getGraphics(), 0, 0);
        }
        Statics.field945 = var8;
        field2191 = false;
        field2192 = class115.method179();
    }

    @ObfuscatedName("ev.rt(B)Z")
    public final boolean method2854() {
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
                this.method2893("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2080 != null) {
                String var1 = Statics.field2080.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2073;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2893("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class163.method2971(var2.charAt(var3)); var3++) {
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
                            int var14 = class163.method2155(var4, 10, true);
                            if (var14 < 10) {
                                this.method2893("wrongjava");
                                return;
                            }
                        }
                    }
                    field2181 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2853();
            this.method246();
            class133 var15;
            try {
                var15 = new class147();
            } catch (Throwable var22) {
                var15 = new class141();
            }
            Statics.field1061 = var15;
            label112: while (true) {
                class136 var18;
                Canvas var19;
                do {
                    if (field2184 != 0L && class115.method179() >= field2184) {
                        break label112;
                    }
                    Statics.field1889 = Statics.field1061.method2683(field2179, field2181);
                    for (int var17 = 0; var17 < Statics.field1889; var17++) {
                        this.method2855();
                    }
                    this.method2856();
                    var18 = Statics.field162;
                    var19 = Statics.field1886;
                } while (var18.field2079 == null);
                for (int var20 = 0; var20 < 50 && var18.field2079.peekEvent() != null; var20++) {
                    class127.method1567(1L);
                }
                if (var19 != null) {
                    var18.field2079.postEvent(new ActionEvent(var19, 1001, "dummy"));
                }
            }
        } catch (Exception var23) {
            class148.method2765((String) null, var23);
            this.method2893("crash");
        }
        this.method2857();
    }

    @ObfuscatedName("ev.ri(I)V")
    public void method2855() {
        long var1 = class115.method179();
        long var3 = field2180[Statics.field633];
        field2180[Statics.field633] = var1;
        Statics.field633 = Statics.field633 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field2119 = field2186;
        }
        this.method440();
    }

    @ObfuscatedName("ev.rf(B)V")
    public void method2856() {
        Container var1 = this.method2864();
        long var2 = class115.method179();
        long var4 = field2183[Statics.field695];
        field2183[Statics.field695] = var2;
        Statics.field695 = Statics.field695 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2175 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2189 - 1 > 50) {
            field2189 -= 50;
            field2193 = true;
            Statics.field1886.setSize(Statics.field963, Statics.field1048);
            Statics.field1886.setVisible(true);
            if (Statics.field1439 == var1) {
                Insets var7 = Statics.field1439.getInsets();
                Statics.field1886.setLocation(field2185 + var7.left, field2182 + var7.top);
            } else {
                Statics.field1886.setLocation(field2185, field2182);
            }
        }
        this.method247();
    }

    @ObfuscatedName("ev.rn(B)V")
    public final synchronized void method2857() {
        if (field2178) {
            return;
        }
        field2178 = true;
        try {
            Statics.field1886.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method248();
        } catch (Exception var7) {
        }
        if (Statics.field1439 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field162 != null) {
            try {
                Statics.field162.method2709();
            } catch (Exception var5) {
            }
        }
        this.method244();
    }

    public void start() {
        if (field2177 == this && !field2178) {
            field2184 = 0L;
        }
    }

    public void stop() {
        if (field2177 == this && !field2178) {
            field2184 = class115.method179() + 4000L;
        }
    }

    public void destroy() {
        if (field2177 == this && !field2178) {
            field2184 = class115.method179();
            class127.method1567(5000L);
            this.method2857();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2177 != this || field2178) {
            return;
        }
        field2193 = true;
        if (Statics.field2073 != null && Statics.field2073.startsWith("1.5") && class115.method179() - field2192 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field963 && var2.height >= Statics.field1048) {
                field2191 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2186 = true;
        field2193 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2186 = false;
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

    @ObfuscatedName("ck.rl(ILjava/lang/String;Ljava/awt/Color;ZI)V")
    public static final void method1782(int arg0, String arg1, Color arg2, boolean arg3) {
        try {
            Graphics var4 = Statics.field1886.getGraphics();
            if (Statics.field2187 == null) {
                Statics.field2187 = new Font("Helvetica", 1, 13);
                Statics.field668 = Statics.field1886.getFontMetrics(Statics.field2187);
            }
            if (arg3) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field963, Statics.field1048);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field2082 == null) {
                    Statics.field2082 = Statics.field1886.createImage(304, 34);
                }
                Graphics var5 = Statics.field2082.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(Statics.field2187);
                var5.setColor(Color.white);
                var5.drawString(arg1, (304 - Statics.field668.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field2082, Statics.field963 / 2 - 152, Statics.field1048 / 2 - 18, (ImageObserver) null);
            } catch (Exception var10) {
                int var7 = Statics.field963 / 2 - 152;
                int var8 = Statics.field1048 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field2187);
                var4.setColor(Color.white);
                var4.drawString(arg1, var7 + (304 - Statics.field668.stringWidth(arg1)) / 2, var8 + 22);
            }
        } catch (Exception var11) {
            Statics.field1886.repaint();
        }
    }

    @ObfuscatedName("ev.rd(Ljava/lang/String;I)V")
    public void method2893(String arg0) {
        if (this.field2188) {
            return;
        }
        this.field2188 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ev.rz(B)Ljava/awt/Container;")
    public Container method2864() {
        return Statics.field1439 == null ? this : Statics.field1439;
    }

    @ObfuscatedName("ev.rm(I)Ljava/awt/Dimension;")
    public Dimension method2865() {
        Container var1 = this.method2864();
        int var2 = Math.max(var1.getWidth(), Statics.field636);
        int var3 = Math.max(var1.getHeight(), Statics.field778);
        if (Statics.field1439 != null) {
            Insets var4 = Statics.field1439.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    public abstract void init();

    @ObfuscatedName("ev.u(B)V")
    public abstract void method246();

    @ObfuscatedName("ev.j(I)V")
    public abstract void method440();

    @ObfuscatedName("ev.w(I)V")
    public abstract void method247();

    @ObfuscatedName("ev.y(B)V")
    public abstract void method248();

    @ObfuscatedName("ev.c(I)V")
    public abstract void method244();
}
