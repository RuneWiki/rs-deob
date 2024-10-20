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

@ObfuscatedName("eb")
public abstract class class144 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("eb.pk")
    public static class144 field2197 = null;

    @ObfuscatedName("eb.pn")
    public static int field2190 = 0;

    @ObfuscatedName("eb.pc")
    public static long field2192 = 0L;

    @ObfuscatedName("eb.pz")
    public static boolean field2193 = false;

    @ObfuscatedName("eb.qa")
    public static int field2209 = 20;

    @ObfuscatedName("eb.qz")
    public static int field2196 = 1;

    @ObfuscatedName("eb.qp")
    public static int field2198 = 0;

    @ObfuscatedName("eb.qn")
    public static long[] field2208 = new long[32];

    @ObfuscatedName("eb.qu")
    public static long[] field2199 = new long[32];

    @ObfuscatedName("eb.qs")
    public static int field2200 = 0;

    @ObfuscatedName("eb.ql")
    public static int field2201 = 0;

    @ObfuscatedName("eb.qj")
    public static volatile boolean field2202 = true;

    @ObfuscatedName("eb.qd")
    public static int field2195 = 500;

    @ObfuscatedName("eb.qm")
    public static boolean field2204 = false;

    @ObfuscatedName("eb.qi")
    public static volatile boolean field2205 = false;

    @ObfuscatedName("eb.ro")
    public static volatile long field2206 = 0L;

    @ObfuscatedName("eb.rp")
    public static volatile boolean field2191 = true;

    @ObfuscatedName("eb.pg")
    public boolean field2194 = false;

    @ObfuscatedName("eb.qi(IIII)V")
    public final void method2846(int arg0, int arg1, int arg2) {
        try {
            if (field2197 != null) {
                field2190++;
                if (field2190 >= 3) {
                    this.method2866("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2197 = this;
            Statics.field1543 = arg0;
            Statics.field121 = arg1;
            Statics.field2223 = arg2;
            Statics.field2225 = this;
            if (Statics.field93 == null) {
                Statics.field93 = new class136();
            }
            Statics.field93.method2736(this, 1);
        } catch (Exception var5) {
            class148.method2819((String) null, var5);
            this.method2866("crash");
        }
    }

    @ObfuscatedName("eb.ro(S)V")
    public final synchronized void method2847() {
        Container var1 = this.method2856();
        if (Statics.field1652 != null) {
            Statics.field1652.removeFocusListener(this);
            var1.remove(Statics.field1652);
        }
        Statics.field1543 = Math.max(var1.getWidth(), Statics.field792);
        Statics.field121 = Math.max(var1.getHeight(), Statics.field1345);
        if (Statics.field2022 != null) {
            Insets var2 = Statics.field2022.getInsets();
            Statics.field1543 -= var2.right + var2.left;
            Statics.field121 -= var2.top + var2.bottom;
        }
        Statics.field1652 = new class139(this);
        var1.add(Statics.field1652);
        Statics.field1652.setSize(Statics.field1543, Statics.field121);
        Statics.field1652.setVisible(true);
        if (Statics.field2022 == var1) {
            Insets var3 = Statics.field2022.getInsets();
            Statics.field1652.setLocation(field2200 + var3.left, field2201 + var3.top);
        } else {
            Statics.field1652.setLocation(field2200, field2201);
        }
        Statics.field1652.addFocusListener(this);
        Statics.field1652.requestFocus();
        field2202 = true;
        class78 var4 = class78.method98(Statics.field1543, Statics.field121, Statics.field1652);
        if (Statics.field157 != null) {
            Statics.field157.method1536(var4.field1385.getGraphics(), 0, 0);
        }
        Statics.field157 = var4;
        field2205 = false;
        field2206 = class115.method2266();
    }

    @ObfuscatedName("eb.ri(B)Z")
    public final boolean method2848() {
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
                this.method2866("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2096 != null) {
                String var1 = Statics.field2096.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2087;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2866("wrongjava");
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
                        if (class163.method670(var6)) {
                            int var7 = class163.method562(var6, 10, true);
                            if (var7 < 10) {
                                this.method2866("wrongjava");
                                return;
                            }
                        }
                    }
                    field2196 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2847();
            this.method234();
            Statics.field1072 = Statics.method47();
            label83: while (true) {
                class136 var9;
                Canvas var10;
                do {
                    if (field2192 != 0L && class115.method2266() >= field2192) {
                        break label83;
                    }
                    Statics.field1040 = Statics.field1072.method2701(field2209, field2196);
                    for (int var8 = 0; var8 < Statics.field1040; var8++) {
                        this.method2854();
                    }
                    this.method2849();
                    var9 = Statics.field93;
                    var10 = Statics.field1652;
                } while (var9.field2094 == null);
                for (int var11 = 0; var11 < 50 && var9.field2094.peekEvent() != null; var11++) {
                    class127.method2667(1L);
                }
                if (var10 != null) {
                    var9.field2094.postEvent(new ActionEvent(var10, 1001, "dummy"));
                }
            }
        } catch (Exception var13) {
            class148.method2819((String) null, var13);
            this.method2866("crash");
        }
        this.method2883();
    }

    @ObfuscatedName("eb.rp(B)V")
    public void method2854() {
        long var1 = class115.method2266();
        long var3 = field2199[Statics.field1961];
        field2199[Statics.field1961] = var1;
        Statics.field1961 = Statics.field1961 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1874 = field2191;
        }
        this.method235();
    }

    @ObfuscatedName("eb.rz(B)V")
    public void method2849() {
        Container var1 = this.method2856();
        long var2 = class115.method2266();
        long var4 = field2208[Statics.field2043];
        field2208[Statics.field2043] = var2;
        Statics.field2043 = Statics.field2043 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2198 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2195 - 1 > 50) {
            field2195 -= 50;
            field2202 = true;
            Statics.field1652.setSize(Statics.field1543, Statics.field121);
            Statics.field1652.setVisible(true);
            if (Statics.field2022 == var1) {
                Insets var7 = Statics.field2022.getInsets();
                Statics.field1652.setLocation(field2200 + var7.left, field2201 + var7.top);
            } else {
                Statics.field1652.setLocation(field2200, field2201);
            }
        }
        this.method367();
    }

    @ObfuscatedName("eb.rf(I)V")
    public final synchronized void method2883() {
        if (field2193) {
            return;
        }
        field2193 = true;
        try {
            Statics.field1652.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method537();
        } catch (Exception var7) {
        }
        if (Statics.field2022 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field93 != null) {
            try {
                Statics.field93.method2720();
            } catch (Exception var5) {
            }
        }
        this.method344();
    }

    @ObfuscatedName("g.rt(I)V")
    public static final void method48() {
        Statics.field1072.method2700();
        for (int var0 = 0; var0 < 32; var0++) {
            field2208[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2199[var1] = 0L;
        }
        Statics.field1040 = 0;
    }

    public void start() {
        if (field2197 == this && !field2193) {
            field2192 = 0L;
        }
    }

    public void stop() {
        if (field2197 == this && !field2193) {
            field2192 = class115.method2266() + 4000L;
        }
    }

    public void destroy() {
        if (field2197 == this && !field2193) {
            field2192 = class115.method2266();
            class127.method2667(5000L);
            this.method2883();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2197 != this || field2193) {
            return;
        }
        field2202 = true;
        if (Statics.field2087 != null && Statics.field2087.startsWith("1.5") && class115.method2266() - field2206 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1543 && var2.height >= Statics.field121) {
                field2205 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2191 = true;
        field2202 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2191 = false;
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

    @ObfuscatedName("h.rr(ILjava/lang/String;Ljava/awt/Color;ZI)V")
    public static final void method584(int arg0, String arg1, Color arg2, boolean arg3) {
        try {
            Graphics var4 = Statics.field1652.getGraphics();
            if (Statics.field1860 == null) {
                Statics.field1860 = new Font("Helvetica", 1, 13);
                Statics.field1204 = Statics.field1652.getFontMetrics(Statics.field1860);
            }
            if (arg3) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field1543, Statics.field121);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field1665 == null) {
                    Statics.field1665 = Statics.field1652.createImage(304, 34);
                }
                Graphics var5 = Statics.field1665.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(Statics.field1860);
                var5.setColor(Color.white);
                var5.drawString(arg1, (304 - Statics.field1204.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field1665, Statics.field1543 / 2 - 152, Statics.field121 / 2 - 18, (ImageObserver) null);
            } catch (Exception var10) {
                int var7 = Statics.field1543 / 2 - 152;
                int var8 = Statics.field121 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1860);
                var4.setColor(Color.white);
                var4.drawString(arg1, var7 + (304 - Statics.field1204.stringWidth(arg1)) / 2, var8 + 22);
            }
        } catch (Exception var11) {
            Statics.field1652.repaint();
        }
    }

    @ObfuscatedName("fd.ru(I)V")
    public static final void method3170() {
        Statics.field1665 = null;
        Statics.field1860 = null;
        Statics.field1204 = null;
    }

    @ObfuscatedName("eb.rj(Ljava/lang/String;I)V")
    public void method2866(String arg0) {
        if (this.field2194) {
            return;
        }
        this.field2194 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("eb.rq(I)Ljava/awt/Container;")
    public Container method2856() {
        return Statics.field2022 == null ? this : Statics.field2022;
    }

    @ObfuscatedName("eb.ra(B)Ljava/awt/Dimension;")
    public Dimension method2857() {
        Container var1 = this.method2856();
        int var2 = Math.max(var1.getWidth(), Statics.field792);
        int var3 = Math.max(var1.getHeight(), Statics.field1345);
        if (Statics.field2022 != null) {
            Insets var4 = Statics.field2022.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    public abstract void init();

    @ObfuscatedName("eb.b(I)V")
    public abstract void method235();

    @ObfuscatedName("eb.p(I)V")
    public abstract void method367();

    @ObfuscatedName("eb.t(B)V")
    public abstract void method537();

    @ObfuscatedName("eb.o(B)V")
    public abstract void method344();

    @ObfuscatedName("eb.m(I)V")
    public abstract void method234();
}
