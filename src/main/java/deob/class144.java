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

@ObfuscatedName("ei")
public abstract class class144 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ei.ps")
    public static class144 field2206 = null;

    @ObfuscatedName("ei.pv")
    public static int field2197 = 0;

    @ObfuscatedName("ei.pn")
    public static long field2199 = 0L;

    @ObfuscatedName("ei.pp")
    public static boolean field2200 = false;

    @ObfuscatedName("ei.ql")
    public static int field2202 = 20;

    @ObfuscatedName("ei.qf")
    public static int field2203 = 1;

    @ObfuscatedName("ei.qy")
    public static int field2214 = 0;

    @ObfuscatedName("ei.qp")
    public static long[] field2204 = new long[32];

    @ObfuscatedName("ei.qr")
    public static long[] field2201 = new long[32];

    @ObfuscatedName("ei.qn")
    public static int field2207 = 0;

    @ObfuscatedName("ei.qi")
    public static int field2208 = 0;

    @ObfuscatedName("ei.qo")
    public static volatile boolean field2211 = true;

    @ObfuscatedName("ei.qe")
    public static int field2210 = 500;

    @ObfuscatedName("ei.qg")
    public static boolean field2198 = false;

    @ObfuscatedName("ei.qs")
    public static volatile boolean field2212 = false;

    @ObfuscatedName("ei.rn")
    public static volatile long field2209 = 0L;

    @ObfuscatedName("ei.rq")
    public static volatile boolean field2213 = true;

    @ObfuscatedName("ei.pq")
    public boolean field2205 = false;

    @ObfuscatedName("ei.px(IIII)V")
    public final void method2822(int arg0, int arg1, int arg2) {
        try {
            if (field2206 != null) {
                field2197++;
                if (field2197 >= 3) {
                    this.method2832("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2206 = this;
            Statics.field1957 = arg0;
            Statics.field716 = arg1;
            Statics.field2230 = arg2;
            Statics.field2231 = this;
            if (Statics.field2031 == null) {
                Statics.field2031 = new class136();
            }
            Statics.field2031.method2718(this, 1);
        } catch (Exception var5) {
            class148.method1777((String) null, var5);
            this.method2832("crash");
        }
    }

    @ObfuscatedName("ei.pz(I)V")
    public final synchronized void method2823() {
        Container var1 = this.method2833();
        if (Statics.field1854 != null) {
            Statics.field1854.removeFocusListener(this);
            var1.remove(Statics.field1854);
        }
        Statics.field1957 = Math.max(var1.getWidth(), Statics.field3139);
        Statics.field716 = Math.max(var1.getHeight(), Statics.field73);
        if (Statics.field16 != null) {
            Insets var2 = Statics.field16.getInsets();
            Statics.field1957 -= var2.right + var2.left;
            Statics.field716 -= var2.top + var2.bottom;
        }
        Statics.field1854 = new class139(this);
        var1.add(Statics.field1854);
        Statics.field1854.setSize(Statics.field1957, Statics.field716);
        Statics.field1854.setVisible(true);
        if (Statics.field16 == var1) {
            Insets var3 = Statics.field16.getInsets();
            Statics.field1854.setLocation(field2207 + var3.left, field2208 + var3.top);
        } else {
            Statics.field1854.setLocation(field2207, field2208);
        }
        Statics.field1854.addFocusListener(this);
        Statics.field1854.requestFocus();
        field2211 = true;
        class78 var4 = class78.method971(Statics.field1957, Statics.field716, Statics.field1854);
        if (Statics.field2039 != null) {
            Statics.field2039.method1509(var4.field1390.getGraphics(), 0, 0);
        }
        Statics.field2039 = var4;
        field2212 = false;
        field2209 = class115.method819();
    }

    @ObfuscatedName("ei.ps(I)Z")
    public final boolean method2821() {
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
                this.method2832("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2096 != null) {
                String var1 = Statics.field2096.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2093;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2832("wrongjava");
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
                        boolean var7 = class163.method752(var6, 10, true);
                        if (var7 && class163.method635(var6) < 10) {
                            this.method2832("wrongjava");
                            return;
                        }
                    }
                    field2203 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2823();
            this.method244();
            class133 var8;
            try {
                var8 = new class147();
            } catch (Throwable var12) {
                var8 = new class141();
            }
            Statics.field1887 = var8;
            while (field2199 == 0L || class115.method819() < field2199) {
                Statics.field753 = Statics.field1887.method2688(field2202, field2203);
                for (int var10 = 0; var10 < Statics.field753; var10++) {
                    this.method2824();
                }
                this.method2850();
                class142.method1232(Statics.field2031, Statics.field1854);
            }
        } catch (Exception var13) {
            class148.method1777((String) null, var13);
            this.method2832("crash");
        }
        this.method2860();
    }

    @ObfuscatedName("ei.pv(I)V")
    public void method2824() {
        long var1 = class115.method819();
        long var3 = field2201[Statics.field874];
        field2201[Statics.field874] = var1;
        Statics.field874 = Statics.field874 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1067 = field2213;
        }
        this.method245();
    }

    @ObfuscatedName("ei.pn(B)V")
    public void method2850() {
        Container var1 = this.method2833();
        long var2 = class115.method819();
        long var4 = field2204[Statics.field1930];
        field2204[Statics.field1930] = var2;
        Statics.field1930 = Statics.field1930 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2214 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2210 - 1 > 50) {
            field2210 -= 50;
            field2211 = true;
            Statics.field1854.setSize(Statics.field1957, Statics.field716);
            Statics.field1854.setVisible(true);
            if (Statics.field16 == var1) {
                Insets var7 = Statics.field16.getInsets();
                Statics.field1854.setLocation(field2207 + var7.left, field2208 + var7.top);
            } else {
                Statics.field1854.setLocation(field2207, field2208);
            }
        }
        this.method405();
    }

    @ObfuscatedName("ei.pp(I)V")
    public final synchronized void method2860() {
        if (field2200) {
            return;
        }
        field2200 = true;
        try {
            Statics.field1854.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method445();
        } catch (Exception var7) {
        }
        if (Statics.field16 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field2031 != null) {
            try {
                Statics.field2031.method2715();
            } catch (Exception var5) {
            }
        }
        this.method397();
    }

    public void start() {
        if (field2206 == this && !field2200) {
            field2199 = 0L;
        }
    }

    public void stop() {
        if (field2206 == this && !field2200) {
            field2199 = class115.method819() + 4000L;
        }
    }

    public void destroy() {
        if (field2206 == this && !field2200) {
            field2199 = class115.method819();
            class127.method2134(5000L);
            this.method2860();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2206 != this || field2200) {
            return;
        }
        field2211 = true;
        if (Statics.field2093 != null && Statics.field2093.startsWith("1.5") && class115.method819() - field2209 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1957 && var2.height >= Statics.field716) {
                field2212 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2213 = true;
        field2211 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2213 = false;
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

    @ObfuscatedName("df.pq(ILjava/lang/String;Ljava/awt/Color;ZI)V")
    public static final void method2656(int arg0, String arg1, Color arg2, boolean arg3) {
        try {
            Graphics var4 = Statics.field1854.getGraphics();
            if (Statics.field769 == null) {
                Statics.field769 = new Font("Helvetica", 1, 13);
                Statics.field1651 = Statics.field1854.getFontMetrics(Statics.field769);
            }
            if (arg3) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field1957, Statics.field716);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field1192 == null) {
                    Statics.field1192 = Statics.field1854.createImage(304, 34);
                }
                Graphics var5 = Statics.field1192.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(Statics.field769);
                var5.setColor(Color.white);
                var5.drawString(arg1, (304 - Statics.field1651.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field1192, Statics.field1957 / 2 - 152, Statics.field716 / 2 - 18, (ImageObserver) null);
            } catch (Exception var10) {
                int var7 = Statics.field1957 / 2 - 152;
                int var8 = Statics.field716 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field769);
                var4.setColor(Color.white);
                var4.drawString(arg1, var7 + (304 - Statics.field1651.stringWidth(arg1)) / 2, var8 + 22);
            }
        } catch (Exception var11) {
            Statics.field1854.repaint();
        }
    }

    @ObfuscatedName("ei.pj(Ljava/lang/String;B)V")
    public void method2832(String arg0) {
        if (this.field2205) {
            return;
        }
        this.field2205 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ei.ql(I)Ljava/awt/Container;")
    public Container method2833() {
        return Statics.field16 == null ? this : Statics.field16;
    }

    @ObfuscatedName("ei.qf(I)Ljava/awt/Dimension;")
    public Dimension method2834() {
        Container var1 = this.method2833();
        int var2 = Math.max(var1.getWidth(), Statics.field3139);
        int var3 = Math.max(var1.getHeight(), Statics.field73);
        if (Statics.field16 != null) {
            Insets var4 = Statics.field16.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    @ObfuscatedName("ei.c(S)V")
    public abstract void method244();

    @ObfuscatedName("ei.p(B)V")
    public abstract void method245();

    @ObfuscatedName("ei.j(I)V")
    public abstract void method405();

    @ObfuscatedName("ei.a(B)V")
    public abstract void method445();

    @ObfuscatedName("ei.d(I)V")
    public abstract void method397();

    public abstract void init();
}
