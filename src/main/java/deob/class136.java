package deob;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
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

@ObfuscatedName("ew")
public abstract class class136 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ew.pq")
    public static class136 field2054 = null;

    @ObfuscatedName("ew.pw")
    public static int field2051 = 0;

    @ObfuscatedName("ew.pn")
    public static long field2056 = 0L;

    @ObfuscatedName("ew.pf")
    public static boolean field2053 = false;

    @ObfuscatedName("ew.pl")
    public static int field2055 = 20;

    @ObfuscatedName("ew.pt")
    public static int field2060 = 1;

    @ObfuscatedName("ew.ph")
    public static int field2057 = 0;

    @ObfuscatedName("ew.po")
    public static long[] field2058 = new long[32];

    @ObfuscatedName("ew.pa")
    public static long[] field2050 = new long[32];

    @ObfuscatedName("ew.pe")
    public static volatile boolean field2061 = true;

    @ObfuscatedName("ew.pp")
    public static int field2052 = 500;

    @ObfuscatedName("ew.pm")
    public static volatile boolean field2062 = false;

    @ObfuscatedName("ew.qc")
    public static volatile long field2059 = 0L;

    @ObfuscatedName("ew.qg")
    public static volatile boolean field2064 = true;

    @ObfuscatedName("ew.pj")
    public boolean field2063 = false;

    @ObfuscatedName("ew.op(IIII)V")
    public final void method2689(int arg0, int arg1, int arg2) {
        try {
            if (field2054 != null) {
                field2051++;
                if (field2051 >= 3) {
                    this.method2711("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2054 = this;
            Statics.field115 = arg0;
            Statics.field204 = arg1;
            Statics.field2087 = arg2;
            Statics.field2078 = this;
            if (Statics.field879 == null) {
                Statics.field879 = new class128();
            }
            Statics.field879.method2566(this, 1);
        } catch (Exception var5) {
            class140.method2555((String) null, var5);
            this.method2711("crash");
        }
    }

    @ObfuscatedName("ew.ob(B)V")
    public final synchronized void method2723() {
        Container var1;
        if (Statics.field1545 == null) {
            var1 = this;
        } else {
            var1 = Statics.field1545;
        }
        if (Statics.field2498 != null) {
            Statics.field2498.removeFocusListener(this);
            var1.remove(Statics.field2498);
        }
        Statics.field2498 = new class131(this);
        var1.add(Statics.field2498);
        Statics.field2498.setSize(Statics.field115, Statics.field204);
        Statics.field2498.setVisible(true);
        if (Statics.field1545 == null) {
            Statics.field2498.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field1545.getInsets();
            Statics.field2498.setLocation(var2.left, var2.top);
        }
        Statics.field2498.addFocusListener(this);
        Statics.field2498.requestFocus();
        field2061 = true;
        field2062 = false;
        field2059 = class107.method635();
    }

    @ObfuscatedName("ew.ox(I)Z")
    public final boolean method2691() {
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
                this.method2711("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1946 != null) {
                String var1 = Statics.field1946.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1947;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2711("wrongjava");
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
                        if (class154.method574(var6)) {
                            int var7 = Statics.method1113(var6, 10, true);
                            if (var7 < 10) {
                                this.method2711("wrongjava");
                                return;
                            }
                        }
                    }
                    field2060 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2723();
            Statics.field580 = class73.method2612(Statics.field115, Statics.field204, Statics.field2498);
            this.method216();
            Statics.field878 = class125.method1930();
            while (field2056 == 0L || class107.method635() < field2056) {
                Statics.field1261 = Statics.field878.method2534(field2055, field2060);
                for (int var8 = 0; var8 < Statics.field1261; var8++) {
                    this.method2696();
                }
                this.method2692();
                class134.method2006(Statics.field879, Statics.field2498);
            }
        } catch (Exception var10) {
            class140.method2555((String) null, var10);
            this.method2711("crash");
        }
        this.method2693();
    }

    @ObfuscatedName("ew.pb(I)V")
    public void method2696() {
        long var1 = class107.method635();
        long var3 = field2050[Statics.field511];
        field2050[Statics.field511] = var1;
        Statics.field511 = Statics.field511 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1403 = field2064;
        }
        this.method217();
    }

    @ObfuscatedName("ew.pq(I)V")
    public void method2692() {
        long var1 = class107.method635();
        long var3 = field2058[Statics.field176];
        field2058[Statics.field176] = var1;
        Statics.field176 = Statics.field176 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field2057 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field2052 - 1 > 50) {
            field2052 -= 50;
            field2061 = true;
            Statics.field2498.setSize(Statics.field115, Statics.field204);
            Statics.field2498.setVisible(true);
            if (Statics.field1545 == null) {
                Statics.field2498.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field1545.getInsets();
                Statics.field2498.setLocation(var6.left, var6.top);
            }
        }
        this.method393();
    }

    @ObfuscatedName("ew.pw(I)V")
    public final synchronized void method2693() {
        if (field2053) {
            return;
        }
        field2053 = true;
        try {
            Statics.field2498.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method219();
        } catch (Exception var7) {
        }
        if (Statics.field1545 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field879 != null) {
            try {
                Statics.field879.method2565();
            } catch (Exception var5) {
            }
        }
        this.method213();
    }

    public void start() {
        if (field2054 == this && !field2053) {
            field2056 = 0L;
        }
    }

    public void stop() {
        if (field2054 == this && !field2053) {
            field2056 = class107.method635() + 4000L;
        }
    }

    public void destroy() {
        if (field2054 == this && !field2053) {
            field2056 = class107.method635();
            class119.method837(5000L);
            this.method2693();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2054 != this || field2053) {
            return;
        }
        field2061 = true;
        if (Statics.field1947 != null && Statics.field1947.startsWith("1.5") && class107.method635() - field2059 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field115 && var2.height >= Statics.field204) {
                field2062 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2064 = true;
        field2061 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2064 = false;
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

    @ObfuscatedName("ab.pn(ILjava/lang/String;Ljava/awt/Color;I)V")
    public static final void method643(int arg0, String arg1, Color arg2) {
        try {
            Graphics var3 = Statics.field2498.getGraphics();
            if (Statics.field514 == null) {
                Statics.field514 = new Font("Helvetica", 1, 13);
                Statics.field1322 = Statics.field2498.getFontMetrics(Statics.field514);
            }
            if (field2061) {
                field2061 = false;
                var3.setColor(Color.black);
                var3.fillRect(0, 0, Statics.field115, Statics.field204);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field972 == null) {
                    Statics.field972 = Statics.field2498.createImage(304, 34);
                }
                Graphics var4 = Statics.field972.getGraphics();
                var4.setColor(arg2);
                var4.drawRect(0, 0, 303, 33);
                var4.fillRect(2, 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(1, 1, 301, 31);
                var4.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field514);
                var4.setColor(Color.white);
                var4.drawString(arg1, (304 - Statics.field1322.stringWidth(arg1)) / 2, 22);
                var3.drawImage(Statics.field972, Statics.field115 / 2 - 152, Statics.field204 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var6 = Statics.field115 / 2 - 152;
                int var7 = Statics.field204 / 2 - 18;
                var3.setColor(arg2);
                var3.drawRect(var6, var7, 303, 33);
                var3.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var3.setColor(Color.black);
                var3.drawRect(var6 + 1, var7 + 1, 301, 31);
                var3.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var3.setFont(Statics.field514);
                var3.setColor(Color.white);
                var3.drawString(arg1, var6 + (304 - Statics.field1322.stringWidth(arg1)) / 2, var7 + 22);
            }
        } catch (Exception var10) {
            Statics.field2498.repaint();
        }
    }

    @ObfuscatedName("ew.pf(Ljava/lang/String;I)V")
    public void method2711(String arg0) {
        if (this.field2063) {
            return;
        }
        this.field2063 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    public abstract void init();

    @ObfuscatedName("ew.i(I)V")
    public abstract void method217();

    @ObfuscatedName("ew.f(I)V")
    public abstract void method219();

    @ObfuscatedName("ew.c(B)V")
    public abstract void method213();

    @ObfuscatedName("ew.r(I)V")
    public abstract void method393();

    @ObfuscatedName("ew.w(I)V")
    public abstract void method216();
}
