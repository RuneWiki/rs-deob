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

@ObfuscatedName("ey")
public abstract class class144 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ey.pa")
    public static class144 field2193 = null;

    @ObfuscatedName("ey.ps")
    public static int field2190 = 0;

    @ObfuscatedName("ey.pm")
    public static long field2178 = 0L;

    @ObfuscatedName("ey.px")
    public static boolean field2179 = false;

    @ObfuscatedName("ey.ph")
    public static int field2181 = 20;

    @ObfuscatedName("ey.qc")
    public static int field2182 = 1;

    @ObfuscatedName("ey.qj")
    public static int field2192 = 0;

    @ObfuscatedName("ey.qm")
    public static long[] field2184 = new long[32];

    @ObfuscatedName("ey.qo")
    public static long[] field2185 = new long[32];

    @ObfuscatedName("ey.qf")
    public static int field2186 = 0;

    @ObfuscatedName("ey.qp")
    public static int field2187 = 0;

    @ObfuscatedName("ey.qs")
    public static volatile boolean field2183 = true;

    @ObfuscatedName("ey.ql")
    public static int field2189 = 500;

    @ObfuscatedName("ey.qq")
    public static boolean field2194 = false;

    @ObfuscatedName("ey.qu")
    public static volatile boolean field2191 = false;

    @ObfuscatedName("ey.qy")
    public static volatile long field2188 = 0L;

    @ObfuscatedName("ey.rr")
    public static volatile boolean field2177 = true;

    @ObfuscatedName("ey.pn")
    public boolean field2180 = false;

    @ObfuscatedName("ey.qa(IIII)V")
    public final void method2937(int arg0, int arg1, int arg2) {
        try {
            if (field2193 != null) {
                field2190++;
                if (field2190 >= 3) {
                    this.method2894("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2193 = this;
            Statics.field2115 = arg0;
            Statics.field705 = arg1;
            Statics.field2208 = arg2;
            Statics.field2216 = this;
            if (Statics.field2158 == null) {
                Statics.field2158 = new class136();
            }
            Statics.field2158.method2780(this, 1);
        } catch (Exception var5) {
            class148.method190((String) null, var5);
            this.method2894("crash");
        }
    }

    @ObfuscatedName("ey.qw(B)V")
    public final synchronized void method2890() {
        Container var1 = this.method2897();
        if (Statics.field2897 != null) {
            Statics.field2897.removeFocusListener(this);
            var1.remove(Statics.field2897);
        }
        Statics.field2115 = Math.max(var1.getWidth(), Statics.field706);
        Statics.field705 = Math.max(var1.getHeight(), Statics.field876);
        if (Statics.field1156 != null) {
            Insets var2 = Statics.field1156.getInsets();
            Statics.field2115 -= var2.right + var2.left;
            Statics.field705 -= var2.top + var2.bottom;
        }
        Statics.field2897 = new class139(this);
        var1.add(Statics.field2897);
        Statics.field2897.setSize(Statics.field2115, Statics.field705);
        Statics.field2897.setVisible(true);
        if (Statics.field1156 == var1) {
            Insets var3 = Statics.field1156.getInsets();
            Statics.field2897.setLocation(field2186 + var3.left, field2187 + var3.top);
        } else {
            Statics.field2897.setLocation(field2186, field2187);
        }
        Statics.field2897.addFocusListener(this);
        Statics.field2897.requestFocus();
        field2183 = true;
        int var4 = Statics.field2115;
        int var5 = Statics.field705;
        Canvas var6 = Statics.field2897;
        class78 var8;
        try {
            class82 var7 = new class82();
            var7.method1519(var4, var5, var6);
            var8 = var7;
        } catch (Throwable var12) {
            class76 var10 = new class76();
            var10.method1519(var4, var5, var6);
            var8 = var10;
        }
        if (Statics.field2075 != null) {
            Statics.field2075.method1520(var8.field1397.getGraphics(), 0, 0);
        }
        Statics.field2075 = var8;
        field2191 = false;
        field2188 = class115.method2082();
    }

    @ObfuscatedName("ey.qi(I)Z")
    public final boolean method2891() {
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
                this.method2894("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2081 != null) {
                String var1 = Statics.field2081.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field3147;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2894("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class163.method127(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class163.method2258(var4) && class163.method122(var4) < 10) {
                            this.method2894("wrongjava");
                            return;
                        }
                    }
                    field2182 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2890();
            this.method427();
            class133 var5;
            try {
                var5 = new class147();
            } catch (Throwable var12) {
                var5 = new class141();
            }
            Statics.field2063 = var5;
            label85: while (true) {
                class136 var8;
                Canvas var9;
                do {
                    if (field2178 != 0L && class115.method2082() >= field2178) {
                        break label85;
                    }
                    Statics.field1760 = Statics.field2063.method2731(field2181, field2182);
                    for (int var7 = 0; var7 < Statics.field1760; var7++) {
                        this.method2888();
                    }
                    this.method2942();
                    var8 = Statics.field2158;
                    var9 = Statics.field2897;
                } while (var8.field2083 == null);
                for (int var10 = 0; var10 < 50 && var8.field2083.peekEvent() != null; var10++) {
                    class127.method2075(1L);
                }
                if (var9 != null) {
                    var8.field2083.postEvent(new ActionEvent(var9, 1001, "dummy"));
                }
            }
        } catch (Exception var13) {
            class148.method190((String) null, var13);
            this.method2894("crash");
        }
        this.method2892();
    }

    @ObfuscatedName("ey.qv(I)V")
    public void method2888() {
        long var1 = class115.method2082();
        long var3 = field2185[Statics.field1087];
        field2185[Statics.field1087] = var1;
        Statics.field1087 = Statics.field1087 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field3123 = field2177;
        }
        this.method237();
    }

    @ObfuscatedName("ey.qg(B)V")
    public void method2942() {
        Container var1 = this.method2897();
        long var2 = class115.method2082();
        long var4 = field2184[Statics.field1384];
        field2184[Statics.field1384] = var2;
        Statics.field1384 = Statics.field1384 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2192 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2189 - 1 > 50) {
            field2189 -= 50;
            field2183 = true;
            Statics.field2897.setSize(Statics.field2115, Statics.field705);
            Statics.field2897.setVisible(true);
            if (Statics.field1156 == var1) {
                Insets var7 = Statics.field1156.getInsets();
                Statics.field2897.setLocation(field2186 + var7.left, field2187 + var7.top);
            } else {
                Statics.field2897.setLocation(field2186, field2187);
            }
        }
        this.method238();
    }

    @ObfuscatedName("ey.qs(S)V")
    public final synchronized void method2892() {
        if (field2179) {
            return;
        }
        field2179 = true;
        try {
            Statics.field2897.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method239();
        } catch (Exception var7) {
        }
        if (Statics.field1156 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field2158 != null) {
            try {
                Statics.field2158.method2759();
            } catch (Exception var5) {
            }
        }
        this.method233();
    }

    @ObfuscatedName("em.qz(I)V")
    public static final void method2755() {
        Statics.field2063.method2730();
        for (int var0 = 0; var0 < 32; var0++) {
            field2184[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2185[var1] = 0L;
        }
        Statics.field1760 = 0;
    }

    public void start() {
        if (field2193 == this && !field2179) {
            field2178 = 0L;
        }
    }

    public void stop() {
        if (field2193 == this && !field2179) {
            field2178 = class115.method2082() + 4000L;
        }
    }

    public void destroy() {
        if (field2193 == this && !field2179) {
            field2178 = class115.method2082();
            class127.method2075(5000L);
            this.method2892();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2193 != this || field2179) {
            return;
        }
        field2183 = true;
        if (Statics.field3147 != null && Statics.field3147.startsWith("1.5") && class115.method2082() - field2188 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field2115 && var2.height >= Statics.field705) {
                field2191 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2177 = true;
        field2183 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2177 = false;
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

    @ObfuscatedName("cg.ql(ILjava/lang/String;Ljava/awt/Color;ZB)V")
    public static final void method2160(int arg0, String arg1, Color arg2, boolean arg3) {
        try {
            Graphics var4 = Statics.field2897.getGraphics();
            if (Statics.field190 == null) {
                Statics.field190 = new Font("Helvetica", 1, 13);
                Statics.field108 = Statics.field2897.getFontMetrics(Statics.field190);
            }
            if (arg3) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field2115, Statics.field705);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field1165 == null) {
                    Statics.field1165 = Statics.field2897.createImage(304, 34);
                }
                Graphics var5 = Statics.field1165.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(Statics.field190);
                var5.setColor(Color.white);
                var5.drawString(arg1, (304 - Statics.field108.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field1165, Statics.field2115 / 2 - 152, Statics.field705 / 2 - 18, (ImageObserver) null);
            } catch (Exception var10) {
                int var7 = Statics.field2115 / 2 - 152;
                int var8 = Statics.field705 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field190);
                var4.setColor(Color.white);
                var4.drawString(arg1, var7 + (304 - Statics.field108.stringWidth(arg1)) / 2, var8 + 22);
            }
        } catch (Exception var11) {
            Statics.field2897.repaint();
        }
    }

    @ObfuscatedName("du.qq(I)V")
    public static final void method2257() {
        Statics.field1165 = null;
        Statics.field190 = null;
        Statics.field108 = null;
    }

    @ObfuscatedName("ey.qu(Ljava/lang/String;B)V")
    public void method2894(String arg0) {
        if (this.field2180) {
            return;
        }
        this.field2180 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ey.qy(I)Ljava/awt/Container;")
    public Container method2897() {
        return Statics.field1156 == null ? this : Statics.field1156;
    }

    @ObfuscatedName("ey.rg(I)Ljava/awt/Dimension;")
    public Dimension method2901() {
        Container var1 = this.method2897();
        int var2 = Math.max(var1.getWidth(), Statics.field706);
        int var3 = Math.max(var1.getHeight(), Statics.field876);
        if (Statics.field1156 != null) {
            Insets var4 = Statics.field1156.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    public abstract void init();

    @ObfuscatedName("ey.o(I)V")
    public abstract void method237();

    @ObfuscatedName("ey.s(B)V")
    public abstract void method238();

    @ObfuscatedName("ey.v(I)V")
    public abstract void method233();

    @ObfuscatedName("ey.k(I)V")
    public abstract void method239();

    @ObfuscatedName("ey.g(I)V")
    public abstract void method427();
}
