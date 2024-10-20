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

@ObfuscatedName("eo")
public abstract class class144 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("eo.pl")
    public static class144 field2187 = null;

    @ObfuscatedName("eo.ps")
    public static int field2196 = 0;

    @ObfuscatedName("eo.pw")
    public static long field2189 = 0L;

    @ObfuscatedName("eo.pn")
    public static boolean field2190 = false;

    @ObfuscatedName("eo.qf")
    public static int field2192 = 20;

    @ObfuscatedName("eo.qt")
    public static int field2193 = 1;

    @ObfuscatedName("eo.qm")
    public static int field2194 = 0;

    @ObfuscatedName("eo.qj")
    public static long[] field2195 = new long[32];

    @ObfuscatedName("eo.qi")
    public static long[] field2197 = new long[32];

    @ObfuscatedName("eo.qp")
    public static int field2203 = 0;

    @ObfuscatedName("eo.qn")
    public static int field2198 = 0;

    @ObfuscatedName("eo.qc")
    public static volatile boolean field2188 = true;

    @ObfuscatedName("eo.qr")
    public static int field2200 = 500;

    @ObfuscatedName("eo.qe")
    public static boolean field2201 = false;

    @ObfuscatedName("eo.qq")
    public static volatile boolean field2202 = false;

    @ObfuscatedName("eo.rm")
    public static volatile long field2191 = 0L;

    @ObfuscatedName("eo.rf")
    public static volatile boolean field2204 = true;

    @ObfuscatedName("eo.pp")
    public boolean field2199 = false;

    @ObfuscatedName("eo.re(IIIB)V")
    public final void method2835(int arg0, int arg1, int arg2) {
        try {
            if (field2187 != null) {
                field2196++;
                if (field2196 >= 3) {
                    this.method2888("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2187 = this;
            Statics.field1146 = arg0;
            Statics.field590 = arg1;
            Statics.field2219 = arg2;
            Statics.field2217 = this;
            if (Statics.field2024 == null) {
                Statics.field2024 = new class136();
            }
            Statics.field2024.method2710(this, 1);
        } catch (Exception var5) {
            class148.method2262((String) null, var5);
            this.method2888("crash");
        }
    }

    @ObfuscatedName("eo.rf(B)V")
    public final synchronized void method2836() {
        Container var1 = this.method2848();
        if (Statics.field60 != null) {
            Statics.field60.removeFocusListener(this);
            var1.remove(Statics.field60);
        }
        Statics.field1146 = Math.max(var1.getWidth(), Statics.field1546);
        Statics.field590 = Math.max(var1.getHeight(), Statics.field1943);
        if (Statics.field2747 != null) {
            Insets var2 = Statics.field2747.getInsets();
            Statics.field1146 -= var2.right + var2.left;
            Statics.field590 -= var2.top + var2.bottom;
        }
        Statics.field60 = new class139(this);
        var1.add(Statics.field60);
        Statics.field60.setSize(Statics.field1146, Statics.field590);
        Statics.field60.setVisible(true);
        if (Statics.field2747 == var1) {
            Insets var3 = Statics.field2747.getInsets();
            Statics.field60.setLocation(field2203 + var3.left, field2198 + var3.top);
        } else {
            Statics.field60.setLocation(field2203, field2198);
        }
        Statics.field60.addFocusListener(this);
        Statics.field60.requestFocus();
        field2188 = true;
        int var4 = Statics.field1146;
        int var5 = Statics.field590;
        Canvas var6 = Statics.field60;
        class78 var8;
        try {
            class82 var7 = new class82();
            var7.method1500(var4, var5, var6);
            var8 = var7;
        } catch (Throwable var12) {
            class76 var10 = new class76();
            var10.method1500(var4, var5, var6);
            var8 = var10;
        }
        if (Statics.field2138 != null) {
            Statics.field2138.method1479(var8.field1388.getGraphics(), 0, 0);
        }
        Statics.field2138 = var8;
        field2202 = false;
        field2191 = class115.method102();
    }

    @ObfuscatedName("eo.rh(I)Z")
    public final boolean method2850() {
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
                this.method2888("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2084 != null) {
                String var1 = Statics.field2084.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2076;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2888("wrongjava");
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
                        if (class163.method741(var6) && class163.method664(var6) < 10) {
                            this.method2888("wrongjava");
                            return;
                        }
                    }
                    field2193 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2836();
            this.method246();
            class133 var7;
            try {
                var7 = new class147();
            } catch (Throwable var11) {
                var7 = new class141();
            }
            Statics.field2041 = var7;
            while (field2189 == 0L || class115.method102() < field2189) {
                Statics.field2639 = Statics.field2041.method2692(field2192, field2193);
                for (int var9 = 0; var9 < Statics.field2639; var9++) {
                    this.method2870();
                }
                this.method2839();
                class142.method2037(Statics.field2024, Statics.field60);
            }
        } catch (Exception var12) {
            class148.method2262((String) null, var12);
            this.method2888("crash");
        }
        this.method2840();
    }

    @ObfuscatedName("eo.rk(I)V")
    public void method2870() {
        long var1 = class115.method102();
        long var3 = field2197[Statics.field1579];
        field2197[Statics.field1579] = var1;
        Statics.field1579 = Statics.field1579 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1960 = field2204;
        }
        this.method476();
    }

    @ObfuscatedName("eo.rl(I)V")
    public void method2839() {
        Container var1 = this.method2848();
        long var2 = class115.method102();
        long var4 = field2195[Statics.field214];
        field2195[Statics.field214] = var2;
        Statics.field214 = Statics.field214 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2194 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2200 - 1 > 50) {
            field2200 -= 50;
            field2188 = true;
            Statics.field60.setSize(Statics.field1146, Statics.field590);
            Statics.field60.setVisible(true);
            if (Statics.field2747 == var1) {
                Insets var7 = Statics.field2747.getInsets();
                Statics.field60.setLocation(field2203 + var7.left, field2198 + var7.top);
            } else {
                Statics.field60.setLocation(field2203, field2198);
            }
        }
        this.method446();
    }

    @ObfuscatedName("eo.rt(I)V")
    public final synchronized void method2840() {
        if (field2190) {
            return;
        }
        field2190 = true;
        try {
            Statics.field60.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method249();
        } catch (Exception var7) {
        }
        if (Statics.field2747 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field2024 != null) {
            try {
                Statics.field2024.method2707();
            } catch (Exception var5) {
            }
        }
        this.method243();
    }

    @ObfuscatedName("eg.rp(B)V")
    public static final void method2766() {
        Statics.field2041.method2684();
        for (int var0 = 0; var0 < 32; var0++) {
            field2195[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2197[var1] = 0L;
        }
        Statics.field2639 = 0;
    }

    public void start() {
        if (field2187 == this && !field2190) {
            field2189 = 0L;
        }
    }

    public void stop() {
        if (field2187 == this && !field2190) {
            field2189 = class115.method102() + 4000L;
        }
    }

    public void destroy() {
        if (field2187 == this && !field2190) {
            field2189 = class115.method102();
            class127.method2614(5000L);
            this.method2840();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2187 != this || field2190) {
            return;
        }
        field2188 = true;
        if (Statics.field2076 != null && Statics.field2076.startsWith("1.5") && class115.method102() - field2191 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1146 && var2.height >= Statics.field590) {
                field2202 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2204 = true;
        field2188 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2204 = false;
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

    @ObfuscatedName("aw.rv(ILjava/lang/String;Ljava/awt/Color;ZB)V")
    public static final void method955(int arg0, String arg1, Color arg2, boolean arg3) {
        try {
            Graphics var4 = Statics.field60.getGraphics();
            if (Statics.field1953 == null) {
                Statics.field1953 = new Font("Helvetica", 1, 13);
                Statics.field2255 = Statics.field60.getFontMetrics(Statics.field1953);
            }
            if (arg3) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field1146, Statics.field590);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field2015 == null) {
                    Statics.field2015 = Statics.field60.createImage(304, 34);
                }
                Graphics var5 = Statics.field2015.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(Statics.field1953);
                var5.setColor(Color.white);
                var5.drawString(arg1, (304 - Statics.field2255.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field2015, Statics.field1146 / 2 - 152, Statics.field590 / 2 - 18, (ImageObserver) null);
            } catch (Exception var10) {
                int var7 = Statics.field1146 / 2 - 152;
                int var8 = Statics.field590 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1953);
                var4.setColor(Color.white);
                var4.drawString(arg1, var7 + (304 - Statics.field2255.stringWidth(arg1)) / 2, var8 + 22);
            }
        } catch (Exception var11) {
            Statics.field60.repaint();
        }
    }

    @ObfuscatedName("eo.rd(Ljava/lang/String;I)V")
    public void method2888(String arg0) {
        if (this.field2199) {
            return;
        }
        this.field2199 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("eo.rs(B)Ljava/awt/Container;")
    public Container method2848() {
        return Statics.field2747 == null ? this : Statics.field2747;
    }

    @ObfuscatedName("eo.rj(B)Ljava/awt/Dimension;")
    public Dimension method2849() {
        Container var1 = this.method2848();
        int var2 = Math.max(var1.getWidth(), Statics.field1546);
        int var3 = Math.max(var1.getHeight(), Statics.field1943);
        if (Statics.field2747 != null) {
            Insets var4 = Statics.field2747.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    @ObfuscatedName("eo.y(B)V")
    public abstract void method476();

    @ObfuscatedName("eo.t(I)V")
    public abstract void method446();

    @ObfuscatedName("eo.b(I)V")
    public abstract void method243();

    public abstract void init();

    @ObfuscatedName("eo.w(B)V")
    public abstract void method249();

    @ObfuscatedName("eo.s(I)V")
    public abstract void method246();
}
