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

@ObfuscatedName("ed")
public abstract class class144 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ed.pi")
    public static class144 field2204 = null;

    @ObfuscatedName("ed.pv")
    public static int field2203 = 0;

    @ObfuscatedName("ed.pq")
    public static long field2196 = 0L;

    @ObfuscatedName("ed.pf")
    public static boolean field2205 = false;

    @ObfuscatedName("ed.ph")
    public static int field2197 = 20;

    @ObfuscatedName("ed.qg")
    public static int field2200 = 1;

    @ObfuscatedName("ed.qa")
    public static int field2201 = 0;

    @ObfuscatedName("ed.qk")
    public static long[] field2202 = new long[32];

    @ObfuscatedName("ed.qb")
    public static long[] field2208 = new long[32];

    @ObfuscatedName("ed.qd")
    public static int field2215 = 0;

    @ObfuscatedName("ed.qj")
    public static int field2206 = 0;

    @ObfuscatedName("ed.qz")
    public static volatile boolean field2195 = true;

    @ObfuscatedName("ed.qx")
    public static int field2207 = 500;

    @ObfuscatedName("ed.qe")
    public static boolean field2199 = false;

    @ObfuscatedName("ed.qu")
    public static volatile boolean field2209 = false;

    @ObfuscatedName("ed.qf")
    public static volatile long field2210 = 0L;

    @ObfuscatedName("ed.ro")
    public static volatile boolean field2211 = true;

    @ObfuscatedName("ed.py")
    public boolean field2198 = false;

    @ObfuscatedName("ed.qq(IIII)V")
    public final void method2789(int arg0, int arg1, int arg2) {
        try {
            if (field2204 != null) {
                field2203++;
                if (field2203 >= 3) {
                    this.method2834("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2204 = this;
            Statics.field2056 = arg0;
            Statics.field2096 = arg1;
            Statics.field2232 = arg2;
            Statics.field1384 = this;
            if (Statics.field606 == null) {
                Statics.field606 = new class136();
            }
            Statics.field606.method2675(this, 1);
        } catch (Exception var5) {
            class148.method623((String) null, var5);
            this.method2834("crash");
        }
    }

    @ObfuscatedName("ed.qk(I)V")
    public final synchronized void method2790() {
        Container var1 = this.method2796();
        if (Statics.field147 != null) {
            Statics.field147.removeFocusListener(this);
            var1.remove(Statics.field147);
        }
        Statics.field2056 = Math.max(var1.getWidth(), Statics.field3052);
        Statics.field2096 = Math.max(var1.getHeight(), Statics.field191);
        if (Statics.field1628 != null) {
            Insets var2 = Statics.field1628.getInsets();
            Statics.field2056 -= var2.right + var2.left;
            Statics.field2096 -= var2.top + var2.bottom;
        }
        Statics.field147 = new class139(this);
        var1.add(Statics.field147);
        Statics.field147.setSize(Statics.field2056, Statics.field2096);
        Statics.field147.setVisible(true);
        if (Statics.field1628 == var1) {
            Insets var3 = Statics.field1628.getInsets();
            Statics.field147.setLocation(field2215 + var3.left, field2206 + var3.top);
        } else {
            Statics.field147.setLocation(field2215, field2206);
        }
        Statics.field147.addFocusListener(this);
        Statics.field147.requestFocus();
        field2195 = true;
        int var4 = Statics.field2056;
        int var5 = Statics.field2096;
        Canvas var6 = Statics.field147;
        class78 var8;
        try {
            class82 var7 = new class82();
            var7.method1471(var4, var5, var6);
            var8 = var7;
        } catch (Throwable var12) {
            class76 var10 = new class76();
            var10.method1471(var4, var5, var6);
            var8 = var10;
        }
        if (Statics.field2003 != null) {
            Statics.field2003.method1490(var8.field1396.getGraphics(), 0, 0);
        }
        Statics.field2003 = var8;
        field2209 = false;
        field2210 = class115.method82();
    }

    @ObfuscatedName("ed.qv(B)Z")
    public final boolean method2791() {
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
                this.method2834("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2087 != null) {
                String var1 = Statics.field2087.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2086;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2834("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class163.method2889(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (Statics.method2502(var4)) {
                            int var5 = class163.method894(var4, 10, true);
                            if (var5 < 10) {
                                this.method2834("wrongjava");
                                return;
                            }
                        }
                    }
                    field2200 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2790();
            this.method222();
            Statics.field242 = Statics.method2094();
            label77: while (true) {
                class136 var7;
                Canvas var8;
                do {
                    if (field2196 != 0L && class115.method82() >= field2196) {
                        break label77;
                    }
                    Statics.field9 = Statics.field242.method2655(field2197, field2200);
                    for (int var6 = 0; var6 < Statics.field9; var6++) {
                        this.method2849();
                    }
                    this.method2793();
                    var7 = Statics.field606;
                    var8 = Statics.field147;
                } while (var7.field2091 == null);
                for (int var9 = 0; var9 < 50 && var7.field2091.peekEvent() != null; var9++) {
                    class127.method712(1L);
                }
                if (var8 != null) {
                    var7.field2091.postEvent(new ActionEvent(var8, 1001, "dummy"));
                }
            }
        } catch (Exception var11) {
            class148.method623((String) null, var11);
            this.method2834("crash");
        }
        this.method2794();
    }

    @ObfuscatedName("ed.qb(I)V")
    public void method2849() {
        long var1 = class115.method82();
        long var3 = field2208[Statics.field2252];
        field2208[Statics.field2252] = var1;
        Statics.field2252 = Statics.field2252 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field146 = field2211;
        }
        this.method223();
    }

    @ObfuscatedName("ed.qc(B)V")
    public void method2793() {
        Container var1 = this.method2796();
        long var2 = class115.method82();
        long var4 = field2202[Statics.field1872];
        field2202[Statics.field1872] = var2;
        Statics.field1872 = Statics.field1872 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2201 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2207 - 1 > 50) {
            field2207 -= 50;
            field2195 = true;
            Statics.field147.setSize(Statics.field2056, Statics.field2096);
            Statics.field147.setVisible(true);
            if (Statics.field1628 == var1) {
                Insets var7 = Statics.field1628.getInsets();
                Statics.field147.setLocation(field2215 + var7.left, field2206 + var7.top);
            } else {
                Statics.field147.setLocation(field2215, field2206);
            }
        }
        this.method224();
    }

    @ObfuscatedName("ed.ql(I)V")
    public final synchronized void method2794() {
        if (field2205) {
            return;
        }
        field2205 = true;
        try {
            Statics.field147.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method225();
        } catch (Exception var7) {
        }
        if (Statics.field1628 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field606 != null) {
            try {
                Statics.field606.method2671();
            } catch (Exception var5) {
            }
        }
        this.method422();
    }

    @ObfuscatedName("ar.qm(B)V")
    public static final void method935() {
        Statics.field242.method2647();
        for (int var0 = 0; var0 < 32; var0++) {
            field2202[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2208[var1] = 0L;
        }
        Statics.field9 = 0;
    }

    public void start() {
        if (field2204 == this && !field2205) {
            field2196 = 0L;
        }
    }

    public void stop() {
        if (field2204 == this && !field2205) {
            field2196 = class115.method82() + 4000L;
        }
    }

    public void destroy() {
        if (field2204 == this && !field2205) {
            field2196 = class115.method82();
            class127.method712(5000L);
            this.method2794();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2204 != this || field2205) {
            return;
        }
        field2195 = true;
        if (Statics.field2086 != null && Statics.field2086.startsWith("1.5") && class115.method82() - field2210 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field2056 && var2.height >= Statics.field2096) {
                field2209 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2211 = true;
        field2195 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2211 = false;
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

    @ObfuscatedName("dx.qd(ILjava/lang/String;Ljava/awt/Color;ZI)V")
    public static final void method2609(int arg0, String arg1, Color arg2, boolean arg3) {
        try {
            Graphics var4 = Statics.field147.getGraphics();
            if (Statics.field2100 == null) {
                Statics.field2100 = new Font("Helvetica", 1, 13);
                Statics.field775 = Statics.field147.getFontMetrics(Statics.field2100);
            }
            if (arg3) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field2056, Statics.field2096);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field2176 == null) {
                    Statics.field2176 = Statics.field147.createImage(304, 34);
                }
                Graphics var5 = Statics.field2176.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(Statics.field2100);
                var5.setColor(Color.white);
                var5.drawString(arg1, (304 - Statics.field775.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field2176, Statics.field2056 / 2 - 152, Statics.field2096 / 2 - 18, (ImageObserver) null);
            } catch (Exception var10) {
                int var7 = Statics.field2056 / 2 - 152;
                int var8 = Statics.field2096 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field2100);
                var4.setColor(Color.white);
                var4.drawString(arg1, var7 + (304 - Statics.field775.stringWidth(arg1)) / 2, var8 + 22);
            }
        } catch (Exception var11) {
            Statics.field147.repaint();
        }
    }

    @ObfuscatedName("ay.qj(I)V")
    public static final void method624() {
        Statics.field2176 = null;
        Statics.field2100 = null;
        Statics.field775 = null;
    }

    @ObfuscatedName("ed.qs(Ljava/lang/String;I)V")
    public void method2834(String arg0) {
        if (this.field2198) {
            return;
        }
        this.field2198 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ed.qt(B)Ljava/awt/Container;")
    public Container method2796() {
        return Statics.field1628 == null ? this : Statics.field1628;
    }

    @ObfuscatedName("ed.qo(I)Ljava/awt/Dimension;")
    public Dimension method2802() {
        Container var1 = this.method2796();
        int var2 = Math.max(var1.getWidth(), Statics.field3052);
        int var3 = Math.max(var1.getHeight(), Statics.field191);
        if (Statics.field1628 != null) {
            Insets var4 = Statics.field1628.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    @ObfuscatedName("ed.d(I)V")
    public abstract void method222();

    @ObfuscatedName("ed.l(B)V")
    public abstract void method223();

    @ObfuscatedName("ed.r(I)V")
    public abstract void method224();

    @ObfuscatedName("ed.q(B)V")
    public abstract void method422();

    @ObfuscatedName("ed.g(I)V")
    public abstract void method225();

    public abstract void init();
}
