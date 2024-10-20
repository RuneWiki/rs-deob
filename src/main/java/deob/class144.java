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

@ObfuscatedName("em")
public abstract class class144 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("em.pc")
    public static class144 field2204 = null;

    @ObfuscatedName("em.px")
    public static int field2188 = 0;

    @ObfuscatedName("em.pd")
    public static long field2187 = 0L;

    @ObfuscatedName("em.pl")
    public static boolean field2190 = false;

    @ObfuscatedName("em.qf")
    public static int field2192 = 20;

    @ObfuscatedName("em.qa")
    public static int field2199 = 1;

    @ObfuscatedName("em.ql")
    public static int field2189 = 0;

    @ObfuscatedName("em.qe")
    public static long[] field2195 = new long[32];

    @ObfuscatedName("em.qq")
    public static long[] field2196 = new long[32];

    @ObfuscatedName("em.qc")
    public static int field2198 = 0;

    @ObfuscatedName("em.qu")
    public static int field2207 = 0;

    @ObfuscatedName("em.qh")
    public static volatile boolean field2200 = true;

    @ObfuscatedName("em.qg")
    public static int field2202 = 500;

    @ObfuscatedName("em.qx")
    public static boolean field2203 = false;

    @ObfuscatedName("em.qt")
    public static volatile boolean field2193 = false;

    @ObfuscatedName("em.rj")
    public static volatile long field2205 = 0L;

    @ObfuscatedName("em.rz")
    public static volatile boolean field2194 = true;

    @ObfuscatedName("em.pe")
    public boolean field2191 = false;

    @ObfuscatedName("em.qw(IIIB)V")
    public final void method2875(int arg0, int arg1, int arg2) {
        try {
            if (field2204 != null) {
                field2188++;
                if (field2188 >= 3) {
                    this.method2886("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2204 = this;
            Statics.field2014 = arg0;
            Statics.field2019 = arg1;
            Statics.field2219 = arg2;
            Statics.field2220 = this;
            if (Statics.field107 == null) {
                Statics.field107 = new class136();
            }
            Statics.field107.method2742(this, 1);
        } catch (Exception var5) {
            class148.method2631((String) null, var5);
            this.method2886("crash");
        }
    }

    @ObfuscatedName("em.qi(I)V")
    public final synchronized void method2876() {
        Container var1 = this.method2887();
        if (Statics.field1362 != null) {
            Statics.field1362.removeFocusListener(this);
            var1.remove(Statics.field1362);
        }
        Statics.field2014 = Math.max(var1.getWidth(), Statics.field2182);
        Statics.field2019 = Math.max(var1.getHeight(), Statics.field2168);
        if (Statics.field703 != null) {
            Insets var2 = Statics.field703.getInsets();
            Statics.field2014 -= var2.right + var2.left;
            Statics.field2019 -= var2.top + var2.bottom;
        }
        Statics.field1362 = new class139(this);
        var1.add(Statics.field1362);
        Statics.field1362.setSize(Statics.field2014, Statics.field2019);
        Statics.field1362.setVisible(true);
        if (Statics.field703 == var1) {
            Insets var3 = Statics.field703.getInsets();
            Statics.field1362.setLocation(field2198 + var3.left, field2207 + var3.top);
        } else {
            Statics.field1362.setLocation(field2198, field2207);
        }
        Statics.field1362.addFocusListener(this);
        Statics.field1362.requestFocus();
        field2200 = true;
        class78 var4 = class78.method2289(Statics.field2014, Statics.field2019, Statics.field1362);
        if (Statics.field137 != null) {
            Statics.field137.method1542(var4.field1390.getGraphics(), 0, 0);
        }
        Statics.field137 = var4;
        field2193 = false;
        field2205 = class115.method579();
    }

    @ObfuscatedName("em.qk(I)Z")
    public final boolean method2889() {
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
                this.method2886("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2088 != null) {
                String var1 = Statics.field2088.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2098;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2886("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class163.method732(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class163.method2869(var4) && class163.method2788(var4) < 10) {
                            this.method2886("wrongjava");
                            return;
                        }
                    }
                    field2199 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2876();
            this.method467();
            class133 var5;
            try {
                var5 = new class147();
            } catch (Throwable var9) {
                var5 = new class141();
            }
            Statics.field113 = var5;
            while (field2187 == 0L || class115.method579() < field2187) {
                Statics.field66 = Statics.field113.method2717(field2192, field2199);
                for (int var7 = 0; var7 < Statics.field66; var7++) {
                    this.method2878();
                }
                this.method2879();
                class142.method947(Statics.field107, Statics.field1362);
            }
        } catch (Exception var10) {
            class148.method2631((String) null, var10);
            this.method2886("crash");
        }
        this.method2880();
    }

    @ObfuscatedName("em.qz(I)V")
    public void method2878() {
        long var1 = class115.method579();
        long var3 = field2196[Statics.field2057];
        field2196[Statics.field2057] = var1;
        Statics.field2057 = Statics.field2057 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1363 = field2194;
        }
        this.method250();
    }

    @ObfuscatedName("em.qh(I)V")
    public void method2879() {
        Container var1 = this.method2887();
        long var2 = class115.method579();
        long var4 = field2195[Statics.field1660];
        field2195[Statics.field1660] = var2;
        Statics.field1660 = Statics.field1660 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2189 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2202 - 1 > 50) {
            field2202 -= 50;
            field2200 = true;
            Statics.field1362.setSize(Statics.field2014, Statics.field2019);
            Statics.field1362.setVisible(true);
            if (Statics.field703 == var1) {
                Insets var7 = Statics.field703.getInsets();
                Statics.field1362.setLocation(field2198 + var7.left, field2207 + var7.top);
            } else {
                Statics.field1362.setLocation(field2198, field2207);
            }
        }
        this.method322();
    }

    @ObfuscatedName("em.qy(I)V")
    public final synchronized void method2880() {
        if (field2190) {
            return;
        }
        field2190 = true;
        try {
            Statics.field1362.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method252();
        } catch (Exception var7) {
        }
        if (Statics.field703 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field107 != null) {
            try {
                Statics.field107.method2743();
            } catch (Exception var5) {
            }
        }
        this.method488();
    }

    @ObfuscatedName("ed.qg(I)V")
    public static final void method2844() {
        Statics.field113.method2715();
        for (int var0 = 0; var0 < 32; var0++) {
            field2195[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2196[var1] = 0L;
        }
        Statics.field66 = 0;
    }

    public void start() {
        if (field2204 == this && !field2190) {
            field2187 = 0L;
        }
    }

    public void stop() {
        if (field2204 == this && !field2190) {
            field2187 = class115.method579() + 4000L;
        }
    }

    public void destroy() {
        if (field2204 == this && !field2190) {
            field2187 = class115.method579();
            class127.method2632(5000L);
            this.method2880();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2204 != this || field2190) {
            return;
        }
        field2200 = true;
        if (Statics.field2098 != null && Statics.field2098.startsWith("1.5") && class115.method579() - field2205 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field2014 && var2.height >= Statics.field2019) {
                field2193 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2194 = true;
        field2200 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2194 = false;
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

    @ObfuscatedName("bk.qx(ILjava/lang/String;Ljava/awt/Color;ZB)V")
    public static final void method1516(int arg0, String arg1, Color arg2, boolean arg3) {
        try {
            Graphics var4 = Statics.field1362.getGraphics();
            if (Statics.field2032 == null) {
                Statics.field2032 = new Font("Helvetica", 1, 13);
                Statics.field2126 = Statics.field1362.getFontMetrics(Statics.field2032);
            }
            if (arg3) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field2014, Statics.field2019);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field2201 == null) {
                    Statics.field2201 = Statics.field1362.createImage(304, 34);
                }
                Graphics var5 = Statics.field2201.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(Statics.field2032);
                var5.setColor(Color.white);
                var5.drawString(arg1, (304 - Statics.field2126.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field2201, Statics.field2014 / 2 - 152, Statics.field2019 / 2 - 18, (ImageObserver) null);
            } catch (Exception var10) {
                int var7 = Statics.field2014 / 2 - 152;
                int var8 = Statics.field2019 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field2032);
                var4.setColor(Color.white);
                var4.drawString(arg1, var7 + (304 - Statics.field2126.stringWidth(arg1)) / 2, var8 + 22);
            }
        } catch (Exception var11) {
            Statics.field1362.repaint();
        }
    }

    @ObfuscatedName("em.qt(Ljava/lang/String;I)V")
    public void method2886(String arg0) {
        if (this.field2191) {
            return;
        }
        this.field2191 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("em.rj(S)Ljava/awt/Container;")
    public Container method2887() {
        return Statics.field703 == null ? this : Statics.field703;
    }

    @ObfuscatedName("em.ru(B)Ljava/awt/Dimension;")
    public Dimension method2937() {
        Container var1 = this.method2887();
        int var2 = Math.max(var1.getWidth(), Statics.field2182);
        int var3 = Math.max(var1.getHeight(), Statics.field2168);
        if (Statics.field703 != null) {
            Insets var4 = Statics.field703.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    @ObfuscatedName("em.d(I)V")
    public abstract void method467();

    public abstract void init();

    @ObfuscatedName("em.z(B)V")
    public abstract void method250();

    @ObfuscatedName("em.l(B)V")
    public abstract void method322();

    @ObfuscatedName("em.b(I)V")
    public abstract void method488();

    @ObfuscatedName("em.m(I)V")
    public abstract void method252();
}
