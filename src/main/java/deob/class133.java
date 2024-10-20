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

@ObfuscatedName("ef")
public abstract class class133 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ef.oj")
    public static class133 field2036 = null;

    @ObfuscatedName("ef.oi")
    public static int field2034 = 0;

    @ObfuscatedName("ef.pc")
    public static long field2035 = 0L;

    @ObfuscatedName("ef.pm")
    public static boolean field2043 = false;

    @ObfuscatedName("ef.pz")
    public static int field2038 = 20;

    @ObfuscatedName("ef.pl")
    public static int field2039 = 1;

    @ObfuscatedName("ef.pr")
    public static int field2040 = 0;

    @ObfuscatedName("ef.pt")
    public static long[] field2042 = new long[32];

    @ObfuscatedName("ef.pd")
    public static long[] field2041 = new long[32];

    @ObfuscatedName("ef.pf")
    public static volatile boolean field2033 = true;

    @ObfuscatedName("ef.pe")
    public static int field2044 = 500;

    @ObfuscatedName("ef.pg")
    public static volatile boolean field2045 = false;

    @ObfuscatedName("ef.pq")
    public static volatile long field2046 = 0L;

    @ObfuscatedName("ef.py")
    public static volatile boolean field2047 = true;

    @ObfuscatedName("ef.pa")
    public boolean field2037 = false;

    @ObfuscatedName("ef.oc(IIII)V")
    public final void method2546(int arg0, int arg1, int arg2) {
        try {
            if (field2036 != null) {
                field2034++;
                if (field2034 >= 3) {
                    this.method2557("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2036 = this;
            Statics.field183 = arg0;
            Statics.field980 = arg1;
            Statics.field1888 = arg2;
            Statics.field2068 = this;
            if (Statics.field519 == null) {
                Statics.field519 = new class125();
            }
            Statics.field519.method2442(this, 1);
        } catch (Exception var5) {
            class137.method2362((String) null, var5);
            this.method2557("crash");
        }
    }

    @ObfuscatedName("ef.oa(B)V")
    public final synchronized void method2547() {
        Container var1;
        if (Statics.field928 == null) {
            var1 = this;
        } else {
            var1 = Statics.field928;
        }
        if (Statics.field683 != null) {
            Statics.field683.removeFocusListener(this);
            var1.remove(Statics.field683);
        }
        Statics.field683 = new class128(this);
        var1.add(Statics.field683);
        Statics.field683.setSize(Statics.field183, Statics.field980);
        Statics.field683.setVisible(true);
        if (Statics.field928 == null) {
            Statics.field683.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field928.getInsets();
            Statics.field683.setLocation(var2.left, var2.top);
        }
        Statics.field683.addFocusListener(this);
        Statics.field683.requestFocus();
        field2033 = true;
        field2045 = false;
        field2046 = class104.method528();
    }

    @ObfuscatedName("ef.ok(I)Z")
    public final boolean method2548() {
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
                this.method2557("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1937 != null) {
                String var1 = Statics.field1937.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1929;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2557("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class211.method2634(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class211.method515(var4) && class211.method1738(var4) < 10) {
                            this.method2557("wrongjava");
                            return;
                        }
                    }
                    field2039 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2547();
            int var5 = Statics.field183;
            int var6 = Statics.field980;
            Canvas var7 = Statics.field683;
            class72 var9;
            try {
                class76 var8 = new class76();
                var8.method1293(var5, var6, var7);
                var9 = var8;
            } catch (Throwable var20) {
                class70 var11 = new class70();
                var11.method1293(var5, var6, var7);
                var9 = var11;
            }
            Statics.field1449 = var9;
            this.method298();
            class122 var12;
            try {
                var12 = new class136();
            } catch (Throwable var19) {
                var12 = new class130();
            }
            Statics.field145 = var12;
            label93: while (true) {
                class125 var15;
                Canvas var16;
                do {
                    if (field2035 != 0L && class104.method528() >= field2035) {
                        break label93;
                    }
                    Statics.field1282 = Statics.field145.method2415(field2038, field2039);
                    for (int var14 = 0; var14 < Statics.field1282; var14++) {
                        this.method2551();
                    }
                    this.method2549();
                    var15 = Statics.field519;
                    var16 = Statics.field683;
                } while (var15.field1936 == null);
                for (int var17 = 0; var17 < 50 && var15.field1936.peekEvent() != null; var17++) {
                    class116.method154(1L);
                }
                if (var16 != null) {
                    var15.field1936.postEvent(new ActionEvent(var16, 1001, "dummy"));
                }
            }
        } catch (Exception var21) {
            class137.method2362((String) null, var21);
            this.method2557("crash");
        }
        this.method2579();
    }

    @ObfuscatedName("ef.ox(I)V")
    public void method2551() {
        long var1 = class104.method528();
        long var3 = field2041[Statics.field167];
        field2041[Statics.field167] = var1;
        Statics.field167 = Statics.field167 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field734 = field2047;
        }
        this.method171();
    }

    @ObfuscatedName("ef.ol(B)V")
    public void method2549() {
        long var1 = class104.method528();
        long var3 = field2042[Statics.field2472];
        field2042[Statics.field2472] = var1;
        Statics.field2472 = Statics.field2472 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field2040 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field2044 - 1 > 50) {
            field2044 -= 50;
            field2033 = true;
            Statics.field683.setSize(Statics.field183, Statics.field980);
            Statics.field683.setVisible(true);
            if (Statics.field928 == null) {
                Statics.field683.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field928.getInsets();
                Statics.field683.setLocation(var6.left, var6.top);
            }
        }
        this.method172();
    }

    @ObfuscatedName("ef.oy(I)V")
    public final synchronized void method2579() {
        if (field2043) {
            return;
        }
        field2043 = true;
        try {
            Statics.field683.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method255();
        } catch (Exception var7) {
        }
        if (Statics.field928 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field519 != null) {
            try {
                Statics.field519.method2439();
            } catch (Exception var5) {
            }
        }
        this.method167();
    }

    @ObfuscatedName("ah.or(I)V")
    public static final void method704() {
        Statics.field145.method2414();
        for (int var0 = 0; var0 < 32; var0++) {
            field2042[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2041[var1] = 0L;
        }
        Statics.field1282 = 0;
    }

    public void start() {
        if (field2036 == this && !field2043) {
            field2035 = 0L;
        }
    }

    public void stop() {
        if (field2036 == this && !field2043) {
            field2035 = class104.method528() + 4000L;
        }
    }

    public void destroy() {
        if (field2036 == this && !field2043) {
            field2035 = class104.method528();
            class116.method154(5000L);
            this.method2579();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2036 != this || field2043) {
            return;
        }
        field2033 = true;
        if (Statics.field1929 != null && Statics.field1929.startsWith("1.5") && class104.method528() - field2046 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field183 && var2.height >= Statics.field980) {
                field2045 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2047 = true;
        field2033 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2047 = false;
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

    @ObfuscatedName("aa.ou(ILjava/lang/String;Ljava/awt/Color;I)V")
    public static final void method757(int arg0, String arg1, Color arg2) {
        try {
            Graphics var3 = Statics.field683.getGraphics();
            if (Statics.field27 == null) {
                Statics.field27 = new Font("Helvetica", 1, 13);
                Statics.field2049 = Statics.field683.getFontMetrics(Statics.field27);
            }
            if (field2033) {
                field2033 = false;
                var3.setColor(Color.black);
                var3.fillRect(0, 0, Statics.field183, Statics.field980);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field1070 == null) {
                    Statics.field1070 = Statics.field683.createImage(304, 34);
                }
                Graphics var4 = Statics.field1070.getGraphics();
                var4.setColor(arg2);
                var4.drawRect(0, 0, 303, 33);
                var4.fillRect(2, 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(1, 1, 301, 31);
                var4.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field27);
                var4.setColor(Color.white);
                var4.drawString(arg1, (304 - Statics.field2049.stringWidth(arg1)) / 2, 22);
                var3.drawImage(Statics.field1070, Statics.field183 / 2 - 152, Statics.field980 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var6 = Statics.field183 / 2 - 152;
                int var7 = Statics.field980 / 2 - 18;
                var3.setColor(arg2);
                var3.drawRect(var6, var7, 303, 33);
                var3.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var3.setColor(Color.black);
                var3.drawRect(var6 + 1, var7 + 1, 301, 31);
                var3.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var3.setFont(Statics.field27);
                var3.setColor(Color.white);
                var3.drawString(arg1, var6 + (304 - Statics.field2049.stringWidth(arg1)) / 2, var7 + 22);
            }
        } catch (Exception var10) {
            Statics.field683.repaint();
        }
    }

    @ObfuscatedName("ef.ot(Ljava/lang/String;B)V")
    public void method2557(String arg0) {
        if (this.field2037) {
            return;
        }
        this.field2037 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ef.w(B)V")
    public abstract void method171();

    public abstract void init();

    @ObfuscatedName("ef.l(I)V")
    public abstract void method172();

    @ObfuscatedName("ef.n(B)V")
    public abstract void method255();

    @ObfuscatedName("ef.b(B)V")
    public abstract void method167();

    @ObfuscatedName("ef.c(I)V")
    public abstract void method298();
}
