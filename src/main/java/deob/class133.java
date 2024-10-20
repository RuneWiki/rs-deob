package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
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

@ObfuscatedName("eb")
public abstract class class133 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("eb.oy")
    public static class133 field2061 = null;

    @ObfuscatedName("eb.ob")
    public static int field2063 = 0;

    @ObfuscatedName("eb.pe")
    public static long field2049 = 0L;

    @ObfuscatedName("eb.pv")
    public static boolean field2062 = false;

    @ObfuscatedName("eb.pg")
    public static int field2052 = 20;

    @ObfuscatedName("eb.py")
    public static int field2053 = 1;

    @ObfuscatedName("eb.pq")
    public static int field2054 = 0;

    @ObfuscatedName("eb.pb")
    public static long[] field2047 = new long[32];

    @ObfuscatedName("eb.pn")
    public static long[] field2056 = new long[32];

    @ObfuscatedName("eb.pr")
    public static volatile boolean field2058 = true;

    @ObfuscatedName("eb.ps")
    public static int field2055 = 500;

    @ObfuscatedName("eb.pz")
    public static volatile boolean field2050 = false;

    @ObfuscatedName("eb.pf")
    public static volatile long field2060 = 0L;

    @ObfuscatedName("eb.pi")
    public static volatile boolean field2059 = true;

    @ObfuscatedName("eb.pm")
    public boolean field2051 = false;

    @ObfuscatedName("eb.pr(IIII)V")
    public final void method2619(int arg0, int arg1, int arg2) {
        try {
            if (field2061 != null) {
                field2063++;
                if (field2063 >= 3) {
                    this.method2630("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2061 = this;
            Statics.field923 = arg0;
            Statics.field519 = arg1;
            Statics.field520 = arg2;
            Statics.field2078 = this;
            if (Statics.field1891 == null) {
                Statics.field1891 = new class125();
            }
            Statics.field1891.method2500(this, 1);
        } catch (Exception var5) {
            class137.method483((String) null, var5);
            this.method2630("crash");
        }
    }

    @ObfuscatedName("eb.po(I)V")
    public final synchronized void method2625() {
        Container var1;
        if (Statics.field982 == null) {
            var1 = this;
        } else {
            var1 = Statics.field982;
        }
        if (Statics.field1929 != null) {
            Statics.field1929.removeFocusListener(this);
            var1.remove(Statics.field1929);
        }
        Statics.field1929 = new class128(this);
        var1.add(Statics.field1929);
        Statics.field1929.setSize(Statics.field923, Statics.field519);
        Statics.field1929.setVisible(true);
        if (Statics.field982 == null) {
            Statics.field1929.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field982.getInsets();
            Statics.field1929.setLocation(var2.left, var2.top);
        }
        Statics.field1929.addFocusListener(this);
        Statics.field1929.requestFocus();
        field2058 = true;
        field2050 = false;
        field2060 = class104.method27();
    }

    @ObfuscatedName("eb.ps(I)Z")
    public final boolean method2620() {
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
                this.method2630("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1948 != null) {
                String var1 = Statics.field1948.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1947;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2630("wrongjava");
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
                        boolean var7 = class211.method1794(var6, 10, true);
                        if (var7 && class211.method600(var6) < 10) {
                            this.method2630("wrongjava");
                            return;
                        }
                    }
                    field2053 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2625();
            Statics.field60 = class72.method602(Statics.field923, Statics.field519, Statics.field1929);
            this.method160();
            class122 var8;
            try {
                var8 = new class136();
            } catch (Throwable var15) {
                var8 = new class130();
            }
            Statics.field2110 = var8;
            label91: while (true) {
                class125 var11;
                Canvas var12;
                do {
                    if (field2049 != 0L && class104.method27() >= field2049) {
                        break label91;
                    }
                    Statics.field1461 = Statics.field2110.method2469(field2052, field2053);
                    for (int var10 = 0; var10 < Statics.field1461; var10++) {
                        this.method2621();
                    }
                    this.method2622();
                    var11 = Statics.field1891;
                    var12 = Statics.field1929;
                } while (var11.field1953 == null);
                for (int var13 = 0; var13 < 50 && var11.field1953.peekEvent() != null; var13++) {
                    class116.method1361(1L);
                }
                if (var12 != null) {
                    var11.field1953.postEvent(new ActionEvent(var12, 1001, "dummy"));
                }
            }
        } catch (Exception var16) {
            class137.method483((String) null, var16);
            this.method2630("crash");
        }
        this.method2637();
    }

    @ObfuscatedName("eb.pz(I)V")
    public void method2621() {
        long var1 = class104.method27();
        long var3 = field2056[Statics.field1892];
        field2056[Statics.field1892] = var1;
        Statics.field1892 = Statics.field1892 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field967 = field2059;
        }
        this.method161();
    }

    @ObfuscatedName("eb.pf(I)V")
    public void method2622() {
        long var1 = class104.method27();
        long var3 = field2047[Statics.field2011];
        field2047[Statics.field2011] = var1;
        Statics.field2011 = Statics.field2011 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field2054 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field2055 - 1 > 50) {
            field2055 -= 50;
            field2058 = true;
            Statics.field1929.setSize(Statics.field923, Statics.field519);
            Statics.field1929.setVisible(true);
            if (Statics.field982 == null) {
                Statics.field1929.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field982.getInsets();
                Statics.field1929.setLocation(var6.left, var6.top);
            }
        }
        this.method326();
    }

    @ObfuscatedName("eb.pc(I)V")
    public final synchronized void method2637() {
        if (field2062) {
            return;
        }
        field2062 = true;
        try {
            Statics.field1929.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method163();
        } catch (Exception var7) {
        }
        if (Statics.field982 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1891 != null) {
            try {
                Statics.field1891.method2497();
            } catch (Exception var5) {
            }
        }
        this.method157();
    }

    public void start() {
        if (field2061 == this && !field2062) {
            field2049 = 0L;
        }
    }

    public void stop() {
        if (field2061 == this && !field2062) {
            field2049 = class104.method27() + 4000L;
        }
    }

    public void destroy() {
        if (field2061 == this && !field2062) {
            field2049 = class104.method27();
            class116.method1361(5000L);
            this.method2637();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2061 != this || field2062) {
            return;
        }
        field2058 = true;
        if (Statics.field1947 != null && Statics.field1947.startsWith("1.5") && class104.method27() - field2060 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field923 && var2.height >= Statics.field519) {
                field2050 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2059 = true;
        field2058 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2059 = false;
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

    @ObfuscatedName("ae.pi(ILjava/lang/String;Ljava/awt/Color;B)V")
    public static final void method539(int arg0, String arg1, Color arg2) {
        try {
            Graphics var3 = Statics.field1929.getGraphics();
            if (Statics.field2104 == null) {
                Statics.field2104 = new Font("Helvetica", 1, 13);
                Statics.field2057 = Statics.field1929.getFontMetrics(Statics.field2104);
            }
            if (field2058) {
                field2058 = false;
                var3.setColor(Color.black);
                var3.fillRect(0, 0, Statics.field923, Statics.field519);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field801 == null) {
                    Statics.field801 = Statics.field1929.createImage(304, 34);
                }
                Graphics var4 = Statics.field801.getGraphics();
                var4.setColor(arg2);
                var4.drawRect(0, 0, 303, 33);
                var4.fillRect(2, 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(1, 1, 301, 31);
                var4.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field2104);
                var4.setColor(Color.white);
                var4.drawString(arg1, (304 - Statics.field2057.stringWidth(arg1)) / 2, 22);
                var3.drawImage(Statics.field801, Statics.field923 / 2 - 152, Statics.field519 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var6 = Statics.field923 / 2 - 152;
                int var7 = Statics.field519 / 2 - 18;
                var3.setColor(arg2);
                var3.drawRect(var6, var7, 303, 33);
                var3.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var3.setColor(Color.black);
                var3.drawRect(var6 + 1, var7 + 1, 301, 31);
                var3.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var3.setFont(Statics.field2104);
                var3.setColor(Color.white);
                var3.drawString(arg1, var6 + (304 - Statics.field2057.stringWidth(arg1)) / 2, var7 + 22);
            }
        } catch (Exception var10) {
            Statics.field1929.repaint();
        }
    }

    @ObfuscatedName("eb.qg(Ljava/lang/String;I)V")
    public void method2630(String arg0) {
        if (this.field2051) {
            return;
        }
        this.field2051 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    public abstract void init();

    @ObfuscatedName("eb.i(B)V")
    public abstract void method160();

    @ObfuscatedName("eb.l(I)V")
    public abstract void method326();

    @ObfuscatedName("eb.k(I)V")
    public abstract void method163();

    @ObfuscatedName("eb.h(B)V")
    public abstract void method157();

    @ObfuscatedName("eb.u(I)V")
    public abstract void method161();
}
