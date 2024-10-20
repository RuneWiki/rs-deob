package deob;

import java.applet.Applet;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;

@ObfuscatedName("ef")
public abstract class class144 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ef.pv")
    public static class144 field2188 = null;

    @ObfuscatedName("ef.pt")
    public static int field2187 = 0;

    @ObfuscatedName("ef.pe")
    public static long field2179 = 0L;

    @ObfuscatedName("ef.pi")
    public static boolean field2180 = false;

    @ObfuscatedName("ef.pd")
    public static int field2182 = 20;

    @ObfuscatedName("ef.qh")
    public static int field2183 = 1;

    @ObfuscatedName("ef.qg")
    public static int field2176 = 0;

    @ObfuscatedName("ef.qv")
    public static long[] field2185 = new long[32];

    @ObfuscatedName("ef.qp")
    public static long[] field2194 = new long[32];

    @ObfuscatedName("ef.qo")
    public static int field2184 = 0;

    @ObfuscatedName("ef.qd")
    public static int field2190 = 0;

    @ObfuscatedName("ef.qn")
    public static volatile boolean field2181 = true;

    @ObfuscatedName("ef.qy")
    public static int field2191 = 500;

    @ObfuscatedName("ef.ql")
    public static boolean field2192 = false;

    @ObfuscatedName("ef.qf")
    public static volatile boolean field2193 = false;

    @ObfuscatedName("ef.qr")
    public static volatile long field2197 = 0L;

    @ObfuscatedName("ef.rk")
    public static volatile boolean field2195 = true;

    @ObfuscatedName("ef.pb")
    public boolean field2186 = false;

    @ObfuscatedName("ef.pk(IIII)V")
    public final void method2791(int arg0, int arg1, int arg2) {
        try {
            if (field2188 != null) {
                field2187++;
                if (field2187 >= 3) {
                    this.method2820("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2188 = this;
            Statics.field2178 = arg0;
            Statics.field164 = arg1;
            Statics.field2211 = arg2;
            Statics.field2216 = this;
            if (Statics.field2177 == null) {
                Statics.field2177 = new class136();
            }
            Statics.field2177.method2666(this, 1);
        } catch (Exception var5) {
            class148.method2604((String) null, var5);
            this.method2820("crash");
        }
    }

    @ObfuscatedName("ef.pm(I)V")
    public final synchronized void method2792() {
        Container var1 = this.method2802();
        if (Statics.field1038 != null) {
            Statics.field1038.removeFocusListener(this);
            var1.remove(Statics.field1038);
        }
        Statics.field2178 = Math.max(var1.getWidth(), Statics.field679);
        Statics.field164 = Math.max(var1.getHeight(), Statics.field2189);
        if (Statics.field872 != null) {
            Insets var2 = Statics.field872.getInsets();
            Statics.field2178 -= var2.right + var2.left;
            Statics.field164 -= var2.top + var2.bottom;
        }
        Statics.field1038 = new class139(this);
        var1.add(Statics.field1038);
        Statics.field1038.setSize(Statics.field2178, Statics.field164);
        Statics.field1038.setVisible(true);
        if (Statics.field872 == var1) {
            Insets var3 = Statics.field872.getInsets();
            Statics.field1038.setLocation(field2184 + var3.left, field2190 + var3.top);
        } else {
            Statics.field1038.setLocation(field2184, field2190);
        }
        Statics.field1038.addFocusListener(this);
        Statics.field1038.requestFocus();
        field2181 = true;
        class78 var4 = class78.method3079(Statics.field2178, Statics.field164, Statics.field1038);
        if (Statics.field3103 != null) {
            Statics.field3103.method1458(var4.field1380.getGraphics(), 0, 0);
        }
        Statics.field3103 = var4;
        field2193 = false;
        field2197 = class115.method568();
    }

    @ObfuscatedName("ef.pc(I)Z")
    public final boolean method2801() {
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
                this.method2820("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2084 != null) {
                String var1 = Statics.field2084.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1966;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2820("wrongjava");
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
                        boolean var7 = class163.method25(var6, 10, true);
                        if (var7 && class163.method107(var6) < 10) {
                            this.method2820("wrongjava");
                            return;
                        }
                    }
                    field2183 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2792();
            this.method228();
            class133 var8;
            try {
                var8 = new class147();
            } catch (Throwable var12) {
                var8 = new class141();
            }
            Statics.field780 = var8;
            while (field2179 == 0L || class115.method568() < field2179) {
                Statics.field1192 = Statics.field780.method2626(field2182, field2183);
                for (int var10 = 0; var10 < Statics.field1192; var10++) {
                    this.method2794();
                }
                this.method2795();
                class142.method2714(Statics.field2177, Statics.field1038);
            }
        } catch (Exception var13) {
            class148.method2604((String) null, var13);
            this.method2820("crash");
        }
        this.method2796();
    }

    @ObfuscatedName("ef.pz(B)V")
    public void method2794() {
        long var1 = class115.method568();
        long var3 = field2194[Statics.field151];
        field2194[Statics.field151] = var1;
        Statics.field151 = Statics.field151 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1998 = field2195;
        }
        this.method229();
    }

    @ObfuscatedName("ef.pn(I)V")
    public void method2795() {
        Container var1 = this.method2802();
        long var2 = class115.method568();
        long var4 = field2185[Statics.field1950];
        field2185[Statics.field1950] = var2;
        Statics.field1950 = Statics.field1950 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2176 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2191 - 1 > 50) {
            field2191 -= 50;
            field2181 = true;
            Statics.field1038.setSize(Statics.field2178, Statics.field164);
            Statics.field1038.setVisible(true);
            if (Statics.field872 == var1) {
                Insets var7 = Statics.field872.getInsets();
                Statics.field1038.setLocation(field2184 + var7.left, field2190 + var7.top);
            } else {
                Statics.field1038.setLocation(field2184, field2190);
            }
        }
        this.method231();
    }

    @ObfuscatedName("ef.pv(B)V")
    public final synchronized void method2796() {
        if (field2180) {
            return;
        }
        field2180 = true;
        try {
            Statics.field1038.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method483();
        } catch (Exception var7) {
        }
        if (Statics.field872 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field2177 != null) {
            try {
                Statics.field2177.method2657();
            } catch (Exception var5) {
            }
        }
        this.method415();
    }

    public void start() {
        if (field2188 == this && !field2180) {
            field2179 = 0L;
        }
    }

    public void stop() {
        if (field2188 == this && !field2180) {
            field2179 = class115.method568() + 4000L;
        }
    }

    public void destroy() {
        if (field2188 == this && !field2180) {
            field2179 = class115.method568();
            class127.method16(5000L);
            this.method2796();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2188 != this || field2180) {
            return;
        }
        field2181 = true;
        if (Statics.field1966 != null && Statics.field1966.startsWith("1.5") && class115.method568() - field2197 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field2178 && var2.height >= Statics.field164) {
                field2193 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2195 = true;
        field2181 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2195 = false;
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

    @ObfuscatedName("ef.pt(Ljava/lang/String;I)V")
    public void method2820(String arg0) {
        if (this.field2186) {
            return;
        }
        this.field2186 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ef.pe(B)Ljava/awt/Container;")
    public Container method2802() {
        return Statics.field872 == null ? this : Statics.field872;
    }

    @ObfuscatedName("ef.pi(I)Ljava/awt/Dimension;")
    public Dimension method2806() {
        Container var1 = this.method2802();
        int var2 = Math.max(var1.getWidth(), Statics.field679);
        int var3 = Math.max(var1.getHeight(), Statics.field2189);
        if (Statics.field872 != null) {
            Insets var4 = Statics.field872.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    public abstract void init();

    @ObfuscatedName("ef.u(B)V")
    public abstract void method228();

    @ObfuscatedName("ef.i(I)V")
    public abstract void method415();

    @ObfuscatedName("ef.p(I)V")
    public abstract void method483();

    @ObfuscatedName("ef.m(I)V")
    public abstract void method229();

    @ObfuscatedName("ef.y(I)V")
    public abstract void method231();
}
