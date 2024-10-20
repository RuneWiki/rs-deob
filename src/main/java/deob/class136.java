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

@ObfuscatedName("es")
public abstract class class136 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("es.pw")
    public static class136 field2109 = null;

    @ObfuscatedName("es.pu")
    public static int field2108 = 0;

    @ObfuscatedName("es.pq")
    public static long field2095 = 0L;

    @ObfuscatedName("es.pg")
    public static boolean field2096 = false;

    @ObfuscatedName("es.py")
    public static int field2098 = 20;

    @ObfuscatedName("es.qo")
    public static int field2099 = 1;

    @ObfuscatedName("es.qe")
    public static int field2100 = 0;

    @ObfuscatedName("es.qx")
    public static long[] field2101 = new long[32];

    @ObfuscatedName("es.qj")
    public static long[] field2106 = new long[32];

    @ObfuscatedName("es.qa")
    public static int field2114 = 0;

    @ObfuscatedName("es.qn")
    public static int field2104 = 0;

    @ObfuscatedName("es.qi")
    public static volatile boolean field2105 = true;

    @ObfuscatedName("es.qm")
    public static int field2110 = 500;

    @ObfuscatedName("es.qu")
    public static boolean field2107 = false;

    @ObfuscatedName("es.qz")
    public static volatile boolean field2112 = false;

    @ObfuscatedName("es.qr")
    public static volatile long field2103 = 0L;

    @ObfuscatedName("es.rc")
    public static volatile boolean field2093 = true;

    @ObfuscatedName("es.px")
    public boolean field2097 = false;

    @ObfuscatedName("es.pb(IIII)V")
    public final void method2670(int arg0, int arg1, int arg2) {
        try {
            if (field2109 != null) {
                field2108++;
                if (field2108 >= 3) {
                    this.method2679("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2109 = this;
            Statics.field594 = arg0;
            Statics.field1958 = arg1;
            Statics.field2129 = arg2;
            Statics.field2135 = this;
            if (Statics.field1983 == null) {
                Statics.field1983 = new class128();
            }
            Statics.field1983.method2547(this, 1);
        } catch (Exception var5) {
            class140.method1((String) null, var5);
            this.method2679("crash");
        }
    }

    @ObfuscatedName("es.pw(B)V")
    public final synchronized void method2669() {
        Container var1 = this.method2680();
        if (Statics.field1618 != null) {
            Statics.field1618.removeFocusListener(this);
            var1.remove(Statics.field1618);
        }
        Statics.field594 = Math.max(var1.getWidth(), Statics.field737);
        Statics.field1958 = Math.max(var1.getHeight(), Statics.field231);
        if (Statics.field1314 != null) {
            Insets var2 = Statics.field1314.getInsets();
            Statics.field594 -= var2.right + var2.left;
            Statics.field1958 -= var2.top + var2.bottom;
        }
        Statics.field1618 = new class131(this);
        var1.add(Statics.field1618);
        Statics.field1618.setSize(Statics.field594, Statics.field1958);
        Statics.field1618.setVisible(true);
        if (Statics.field1314 == var1) {
            Insets var3 = Statics.field1314.getInsets();
            Statics.field1618.setLocation(field2114 + var3.left, field2104 + var3.top);
        } else {
            Statics.field1618.setLocation(field2114, field2104);
        }
        Statics.field1618.addFocusListener(this);
        Statics.field1618.requestFocus();
        field2105 = true;
        class73 var4 = class73.method2998(Statics.field594, Statics.field1958, Statics.field1618);
        if (Statics.field1489 != null) {
            Statics.field1489.method1383(var4.field1333.getGraphics(), 0, 0);
        }
        Statics.field1489 = var4;
        field2112 = false;
        field2103 = class107.method579();
    }

    @ObfuscatedName("es.pu(I)Z")
    public final boolean method2676() {
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
                this.method2679("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1990 != null) {
                String var1 = Statics.field1990.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1988;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2679("wrongjava");
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
                        if (class154.method14(var6)) {
                            int var7 = class154.method3025(var6, 10, true);
                            if (var7 < 10) {
                                this.method2679("wrongjava");
                                return;
                            }
                        }
                    }
                    field2099 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2669();
            this.method183();
            class125 var8;
            try {
                var8 = new class139();
            } catch (Throwable var12) {
                var8 = new class133();
            }
            Statics.field2802 = var8;
            while (field2095 == 0L || class107.method579() < field2095) {
                Statics.field29 = Statics.field2802.method2518(field2098, field2099);
                for (int var10 = 0; var10 < Statics.field29; var10++) {
                    this.method2672();
                }
                this.method2738();
                class134.method1909(Statics.field1983, Statics.field1618);
            }
        } catch (Exception var13) {
            class140.method1((String) null, var13);
            this.method2679("crash");
        }
        this.method2674();
    }

    @ObfuscatedName("es.pq(I)V")
    public void method2672() {
        long var1 = class107.method579();
        long var3 = field2106[Statics.field147];
        field2106[Statics.field147] = var1;
        Statics.field147 = Statics.field147 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field575 = field2093;
        }
        this.method398();
    }

    @ObfuscatedName("es.pg(I)V")
    public void method2738() {
        Container var1 = this.method2680();
        long var2 = class107.method579();
        long var4 = field2101[Statics.field1018];
        field2101[Statics.field1018] = var2;
        Statics.field1018 = Statics.field1018 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2100 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2110 - 1 > 50) {
            field2110 -= 50;
            field2105 = true;
            Statics.field1618.setSize(Statics.field594, Statics.field1958);
            Statics.field1618.setVisible(true);
            if (Statics.field1314 == var1) {
                Insets var7 = Statics.field1314.getInsets();
                Statics.field1618.setLocation(field2114 + var7.left, field2104 + var7.top);
            } else {
                Statics.field1618.setLocation(field2114, field2104);
            }
        }
        this.method185();
    }

    @ObfuscatedName("es.px(I)V")
    public final synchronized void method2674() {
        if (field2096) {
            return;
        }
        field2096 = true;
        try {
            Statics.field1618.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method186();
        } catch (Exception var7) {
        }
        if (Statics.field1314 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1983 != null) {
            try {
                Statics.field1983.method2544();
            } catch (Exception var5) {
            }
        }
        this.method181();
    }

    public void start() {
        if (field2109 == this && !field2096) {
            field2095 = 0L;
        }
    }

    public void stop() {
        if (field2109 == this && !field2096) {
            field2095 = class107.method579() + 4000L;
        }
    }

    public void destroy() {
        if (field2109 == this && !field2096) {
            field2095 = class107.method579();
            class119.method1371(5000L);
            this.method2674();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2109 != this || field2096) {
            return;
        }
        field2105 = true;
        if (Statics.field1988 != null && Statics.field1988.startsWith("1.5") && class107.method579() - field2103 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field594 && var2.height >= Statics.field1958) {
                field2112 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2093 = true;
        field2105 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2093 = false;
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

    @ObfuscatedName("fq.po(ILjava/lang/String;Ljava/awt/Color;ZI)V")
    public static final void method3358(int arg0, String arg1, Color arg2, boolean arg3) {
        try {
            Graphics var4 = Statics.field1618.getGraphics();
            if (Statics.field1863 == null) {
                Statics.field1863 = new Font("Helvetica", 1, 13);
                Statics.field1970 = Statics.field1618.getFontMetrics(Statics.field1863);
            }
            if (arg3) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field594, Statics.field1958);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field1797 == null) {
                    Statics.field1797 = Statics.field1618.createImage(304, 34);
                }
                Graphics var5 = Statics.field1797.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(Statics.field1863);
                var5.setColor(Color.white);
                var5.drawString(arg1, (304 - Statics.field1970.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field1797, Statics.field594 / 2 - 152, Statics.field1958 / 2 - 18, (ImageObserver) null);
            } catch (Exception var10) {
                int var7 = Statics.field594 / 2 - 152;
                int var8 = Statics.field1958 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1863);
                var4.setColor(Color.white);
                var4.drawString(arg1, var7 + (304 - Statics.field1970.stringWidth(arg1)) / 2, var8 + 22);
            }
        } catch (Exception var11) {
            Statics.field1618.repaint();
        }
    }

    @ObfuscatedName("cw.py(B)V")
    public static final void method2019() {
        Statics.field1797 = null;
        Statics.field1863 = null;
        Statics.field1970 = null;
    }

    @ObfuscatedName("es.qo(Ljava/lang/String;B)V")
    public void method2679(String arg0) {
        if (this.field2097) {
            return;
        }
        this.field2097 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("es.qe(B)Ljava/awt/Container;")
    public Container method2680() {
        return Statics.field1314 == null ? this : Statics.field1314;
    }

    @ObfuscatedName("es.qh(I)Ljava/awt/Dimension;")
    public Dimension method2681() {
        Container var1 = this.method2680();
        int var2 = Math.max(var1.getWidth(), Statics.field737);
        int var3 = Math.max(var1.getHeight(), Statics.field231);
        if (Statics.field1314 != null) {
            Insets var4 = Statics.field1314.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    public abstract void init();

    @ObfuscatedName("es.t(I)V")
    public abstract void method398();

    @ObfuscatedName("es.s(B)V")
    public abstract void method185();

    @ObfuscatedName("es.e(B)V")
    public abstract void method181();

    @ObfuscatedName("es.c(I)V")
    public abstract void method186();

    @ObfuscatedName("es.w(I)V")
    public abstract void method183();
}
