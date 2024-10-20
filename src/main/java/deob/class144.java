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

@ObfuscatedName("ek")
public abstract class class144 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ek.pl")
    public static class144 field2174 = null;

    @ObfuscatedName("ek.pw")
    public static int field2176 = 0;

    @ObfuscatedName("ek.pm")
    public static long field2161 = 0L;

    @ObfuscatedName("ek.py")
    public static boolean field2162 = false;

    @ObfuscatedName("ek.pv")
    public static int field2164 = 20;

    @ObfuscatedName("ek.qh")
    public static int field2167 = 1;

    @ObfuscatedName("ek.qo")
    public static int field2175 = 0;

    @ObfuscatedName("ek.qb")
    public static long[] field2160 = new long[32];

    @ObfuscatedName("ek.qk")
    public static long[] field2170 = new long[32];

    @ObfuscatedName("ek.qv")
    public static int field2169 = 0;

    @ObfuscatedName("ek.qn")
    public static int field2165 = 0;

    @ObfuscatedName("ek.qs")
    public static volatile boolean field2171 = true;

    @ObfuscatedName("ek.qa")
    public static int field2172 = 500;

    @ObfuscatedName("ek.qw")
    public static boolean field2173 = false;

    @ObfuscatedName("ek.qi")
    public static volatile boolean field2159 = false;

    @ObfuscatedName("ek.qg")
    public static volatile long field2166 = 0L;

    @ObfuscatedName("ek.rj")
    public static volatile boolean field2168 = true;

    @ObfuscatedName("ek.pe")
    public boolean field2163 = false;

    @ObfuscatedName("ek.qp(IIIB)V")
    public final void method2789(int arg0, int arg1, int arg2) {
        try {
            if (field2174 != null) {
                field2176++;
                if (field2176 >= 3) {
                    this.method2794("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2174 = this;
            Statics.field1604 = arg0;
            Statics.field776 = arg1;
            Statics.field3134 = arg2;
            Statics.field2192 = this;
            if (Statics.field1993 == null) {
                Statics.field1993 = new class136();
            }
            Statics.field1993.method2680(this, 1);
        } catch (Exception var5) {
            class148.method2598((String) null, var5);
            this.method2794("crash");
        }
    }

    @ObfuscatedName("ek.qa(I)V")
    public final synchronized void method2791() {
        Container var1 = this.method2795();
        if (Statics.field1839 != null) {
            Statics.field1839.removeFocusListener(this);
            var1.remove(Statics.field1839);
        }
        Statics.field1604 = Math.max(var1.getWidth(), Statics.field2155);
        Statics.field776 = Math.max(var1.getHeight(), Statics.field2050);
        if (Statics.field2011 != null) {
            Insets var2 = Statics.field2011.getInsets();
            Statics.field1604 -= var2.right + var2.left;
            Statics.field776 -= var2.top + var2.bottom;
        }
        Statics.field1839 = new class139(this);
        var1.add(Statics.field1839);
        Statics.field1839.setSize(Statics.field1604, Statics.field776);
        Statics.field1839.setVisible(true);
        if (Statics.field2011 == var1) {
            Insets var3 = Statics.field2011.getInsets();
            Statics.field1839.setLocation(field2169 + var3.left, field2165 + var3.top);
        } else {
            Statics.field1839.setLocation(field2169, field2165);
        }
        Statics.field1839.addFocusListener(this);
        Statics.field1839.requestFocus();
        field2171 = true;
        int var4 = Statics.field1604;
        int var5 = Statics.field776;
        Canvas var6 = Statics.field1839;
        class78 var8;
        try {
            class82 var7 = new class82();
            var7.method1488(var4, var5, var6);
            var8 = var7;
        } catch (Throwable var12) {
            class76 var10 = new class76();
            var10.method1488(var4, var5, var6);
            var8 = var10;
        }
        if (Statics.field211 != null) {
            Statics.field211.method1486(var8.field1379.getGraphics(), 0, 0);
        }
        Statics.field211 = var8;
        field2159 = false;
        field2166 = class115.method2622();
    }

    @ObfuscatedName("ek.qw(I)Z")
    public final boolean method2784() {
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
                this.method2794("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2066 != null) {
                String var1 = Statics.field2066.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2068;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2794("wrongjava");
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
                        if (class163.method2229(var6)) {
                            int var7 = class163.method47(var6, 10, true);
                            if (var7 < 10) {
                                this.method2794("wrongjava");
                                return;
                            }
                        }
                    }
                    field2167 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2791();
            this.method231();
            Statics.field973 = class133.method963();
            while (field2161 == 0L || class115.method2622() < field2161) {
                Statics.field1574 = Statics.field973.method2634(field2164, field2167);
                for (int var8 = 0; var8 < Statics.field1574; var8++) {
                    this.method2786();
                }
                this.method2787();
                class142.method2569(Statics.field1993, Statics.field1839);
            }
        } catch (Exception var10) {
            class148.method2598((String) null, var10);
            this.method2794("crash");
        }
        this.method2790();
    }

    @ObfuscatedName("ek.qi(B)V")
    public void method2786() {
        long var1 = class115.method2622();
        long var3 = field2170[Statics.field242];
        field2170[Statics.field242] = var1;
        Statics.field242 = Statics.field242 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field2691 = field2168;
        }
        this.method232();
    }

    @ObfuscatedName("ek.qg(I)V")
    public void method2787() {
        Container var1 = this.method2795();
        long var2 = class115.method2622();
        long var4 = field2160[Statics.field784];
        field2160[Statics.field784] = var2;
        Statics.field784 = Statics.field784 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2175 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2172 - 1 > 50) {
            field2172 -= 50;
            field2171 = true;
            Statics.field1839.setSize(Statics.field1604, Statics.field776);
            Statics.field1839.setVisible(true);
            if (Statics.field2011 == var1) {
                Insets var7 = Statics.field2011.getInsets();
                Statics.field1839.setLocation(field2169 + var7.left, field2165 + var7.top);
            } else {
                Statics.field1839.setLocation(field2169, field2165);
            }
        }
        this.method329();
    }

    @ObfuscatedName("ek.rv(B)V")
    public final synchronized void method2790() {
        if (field2162) {
            return;
        }
        field2162 = true;
        try {
            Statics.field1839.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method234();
        } catch (Exception var7) {
        }
        if (Statics.field2011 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1993 != null) {
            try {
                Statics.field1993.method2659();
            } catch (Exception var5) {
            }
        }
        this.method229();
    }

    @ObfuscatedName("cc.rj(I)V")
    public static final void method1998() {
        Statics.field973.method2633();
        for (int var0 = 0; var0 < 32; var0++) {
            field2160[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2170[var1] = 0L;
        }
        Statics.field1574 = 0;
    }

    public void start() {
        if (field2174 == this && !field2162) {
            field2161 = 0L;
        }
    }

    public void stop() {
        if (field2174 == this && !field2162) {
            field2161 = class115.method2622() + 4000L;
        }
    }

    public void destroy() {
        if (field2174 == this && !field2162) {
            field2161 = class115.method2622();
            class127.method2079(5000L);
            this.method2790();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2174 != this || field2162) {
            return;
        }
        field2171 = true;
        if (Statics.field2068 != null && Statics.field2068.startsWith("1.5") && class115.method2622() - field2166 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1604 && var2.height >= Statics.field776) {
                field2159 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2168 = true;
        field2171 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2168 = false;
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

    @ObfuscatedName("y.rz(ILjava/lang/String;Ljava/awt/Color;ZI)V")
    public static final void method130(int arg0, String arg1, Color arg2, boolean arg3) {
        try {
            Graphics var4 = Statics.field1839.getGraphics();
            if (Statics.field1043 == null) {
                Statics.field1043 = new Font("Helvetica", 1, 13);
                Statics.field881 = Statics.field1839.getFontMetrics(Statics.field1043);
            }
            if (arg3) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field1604, Statics.field776);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field95 == null) {
                    Statics.field95 = Statics.field1839.createImage(304, 34);
                }
                Graphics var5 = Statics.field95.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(Statics.field1043);
                var5.setColor(Color.white);
                var5.drawString(arg1, (304 - Statics.field881.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field95, Statics.field1604 / 2 - 152, Statics.field776 / 2 - 18, (ImageObserver) null);
            } catch (Exception var10) {
                int var7 = Statics.field1604 / 2 - 152;
                int var8 = Statics.field776 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1043);
                var4.setColor(Color.white);
                var4.drawString(arg1, var7 + (304 - Statics.field881.stringWidth(arg1)) / 2, var8 + 22);
            }
        } catch (Exception var11) {
            Statics.field1839.repaint();
        }
    }

    @ObfuscatedName("du.rg(I)V")
    public static final void method2164() {
        Statics.field95 = null;
        Statics.field1043 = null;
        Statics.field881 = null;
    }

    @ObfuscatedName("ek.ro(Ljava/lang/String;B)V")
    public void method2794(String arg0) {
        if (this.field2163) {
            return;
        }
        this.field2163 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ek.rc(I)Ljava/awt/Container;")
    public Container method2795() {
        return Statics.field2011 == null ? this : Statics.field2011;
    }

    @ObfuscatedName("ek.rx(S)Ljava/awt/Dimension;")
    public Dimension method2820() {
        Container var1 = this.method2795();
        int var2 = Math.max(var1.getWidth(), Statics.field2155);
        int var3 = Math.max(var1.getHeight(), Statics.field2050);
        if (Statics.field2011 != null) {
            Insets var4 = Statics.field2011.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    public abstract void init();

    @ObfuscatedName("ek.w(I)V")
    public abstract void method234();

    @ObfuscatedName("ek.h(I)V")
    public abstract void method229();

    @ObfuscatedName("ek.o(I)V")
    public abstract void method232();

    @ObfuscatedName("ek.g(I)V")
    public abstract void method231();

    @ObfuscatedName("ek.i(B)V")
    public abstract void method329();
}
