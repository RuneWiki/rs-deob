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

@ObfuscatedName("er")
public abstract class class144 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("er.pw")
    public static class144 field2189 = null;

    @ObfuscatedName("er.pp")
    public static int field2177 = 0;

    @ObfuscatedName("er.pb")
    public static long field2178 = 0L;

    @ObfuscatedName("er.pv")
    public static boolean field2175 = false;

    @ObfuscatedName("er.pe")
    public static int field2179 = 20;

    @ObfuscatedName("er.qd")
    public static int field2188 = 1;

    @ObfuscatedName("er.qe")
    public static int field2174 = 0;

    @ObfuscatedName("er.qc")
    public static long[] field2180 = new long[32];

    @ObfuscatedName("er.qi")
    public static long[] field2181 = new long[32];

    @ObfuscatedName("er.qb")
    public static int field2182 = 0;

    @ObfuscatedName("er.qu")
    public static int field2183 = 0;

    @ObfuscatedName("er.qh")
    public static volatile boolean field2173 = true;

    @ObfuscatedName("er.qn")
    public static int field2185 = 500;

    @ObfuscatedName("er.qy")
    public static boolean field2186 = false;

    @ObfuscatedName("er.qt")
    public static volatile boolean field2187 = false;

    @ObfuscatedName("er.qg")
    public static volatile long field2184 = 0L;

    @ObfuscatedName("er.ri")
    public static volatile boolean field2172 = true;

    @ObfuscatedName("er.ph")
    public boolean field2176 = false;

    @ObfuscatedName("er.rp(IIIB)V")
    public final void method2818(int arg0, int arg1, int arg2) {
        try {
            if (field2189 != null) {
                field2177++;
                if (field2177 >= 3) {
                    this.method2827("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2189 = this;
            Statics.field63 = arg0;
            Statics.field686 = arg1;
            Statics.field2205 = arg2;
            Statics.field2207 = this;
            if (Statics.field2889 == null) {
                Statics.field2889 = new class136();
            }
            Statics.field2889.method2697(this, 1);
        } catch (Exception var5) {
            class148.method145((String) null, var5);
            this.method2827("crash");
        }
    }

    @ObfuscatedName("er.rc(B)V")
    public final synchronized void method2819() {
        Container var1 = this.method2828();
        if (Statics.field1781 != null) {
            Statics.field1781.removeFocusListener(this);
            var1.remove(Statics.field1781);
        }
        Statics.field63 = Math.max(var1.getWidth(), Statics.field765);
        Statics.field686 = Math.max(var1.getHeight(), Statics.field918);
        if (Statics.field1399 != null) {
            Insets var2 = Statics.field1399.getInsets();
            Statics.field63 -= var2.right + var2.left;
            Statics.field686 -= var2.top + var2.bottom;
        }
        Statics.field1781 = new class139(this);
        var1.add(Statics.field1781);
        Statics.field1781.setSize(Statics.field63, Statics.field686);
        Statics.field1781.setVisible(true);
        if (Statics.field1399 == var1) {
            Insets var3 = Statics.field1399.getInsets();
            Statics.field1781.setLocation(field2182 + var3.left, field2183 + var3.top);
        } else {
            Statics.field1781.setLocation(field2182, field2183);
        }
        Statics.field1781.addFocusListener(this);
        Statics.field1781.requestFocus();
        field2173 = true;
        int var4 = Statics.field63;
        int var5 = Statics.field686;
        Canvas var6 = Statics.field1781;
        class78 var8;
        try {
            class82 var7 = new class82();
            var7.method1527(var4, var5, var6);
            var8 = var7;
        } catch (Throwable var12) {
            class76 var10 = new class76();
            var10.method1527(var4, var5, var6);
            var8 = var10;
        }
        if (Statics.field1379 != null) {
            Statics.field1379.method1528(var8.field1396.getGraphics(), 0, 0);
        }
        Statics.field1379 = var8;
        field2187 = false;
        field2184 = class115.method2134();
    }

    @ObfuscatedName("er.rb(I)Z")
    public final boolean method2820() {
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
                this.method2827("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2091 != null) {
                String var1 = Statics.field2091.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2093;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2827("wrongjava");
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
                        if (class163.method2018(var6) && class163.method1088(var6) < 10) {
                            this.method2827("wrongjava");
                            return;
                        }
                    }
                    field2188 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2819();
            this.method223();
            Statics.field2640 = class133.method1944();
            while (field2178 == 0L || class115.method2134() < field2178) {
                Statics.field71 = Statics.field2640.method2673(field2179, field2188);
                for (int var7 = 0; var7 < Statics.field71; var7++) {
                    this.method2821();
                }
                this.method2822();
                class142.method603(Statics.field2889, Statics.field1781);
            }
        } catch (Exception var9) {
            class148.method145((String) null, var9);
            this.method2827("crash");
        }
        this.method2830();
    }

    @ObfuscatedName("er.rx(I)V")
    public void method2821() {
        long var1 = class115.method2134();
        long var3 = field2181[Statics.field1103];
        field2181[Statics.field1103] = var1;
        Statics.field1103 = Statics.field1103 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1670 = field2172;
        }
        this.method224();
    }

    @ObfuscatedName("er.rf(S)V")
    public void method2822() {
        Container var1 = this.method2828();
        long var2 = class115.method2134();
        long var4 = field2180[Statics.field75];
        field2180[Statics.field75] = var2;
        Statics.field75 = Statics.field75 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2174 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2185 - 1 > 50) {
            field2185 -= 50;
            field2173 = true;
            Statics.field1781.setSize(Statics.field63, Statics.field686);
            Statics.field1781.setVisible(true);
            if (Statics.field1399 == var1) {
                Insets var7 = Statics.field1399.getInsets();
                Statics.field1781.setLocation(field2182 + var7.left, field2183 + var7.top);
            } else {
                Statics.field1781.setLocation(field2182, field2183);
            }
        }
        this.method225();
    }

    @ObfuscatedName("er.rz(I)V")
    public final synchronized void method2830() {
        if (field2175) {
            return;
        }
        field2175 = true;
        try {
            Statics.field1781.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method421();
        } catch (Exception var7) {
        }
        if (Statics.field1399 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field2889 != null) {
            try {
                Statics.field2889.method2693();
            } catch (Exception var5) {
            }
        }
        this.method395();
    }

    @ObfuscatedName("cv.rl(B)V")
    public static final void method2021() {
        Statics.field2640.method2672();
        for (int var0 = 0; var0 < 32; var0++) {
            field2180[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2181[var1] = 0L;
        }
        Statics.field71 = 0;
    }

    public void start() {
        if (field2189 == this && !field2175) {
            field2178 = 0L;
        }
    }

    public void stop() {
        if (field2189 == this && !field2175) {
            field2178 = class115.method2134() + 4000L;
        }
    }

    public void destroy() {
        if (field2189 == this && !field2175) {
            field2178 = class115.method2134();
            class127.method731(5000L);
            this.method2830();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2189 != this || field2175) {
            return;
        }
        field2173 = true;
        if (Statics.field2093 != null && Statics.field2093.startsWith("1.5") && class115.method2134() - field2184 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field63 && var2.height >= Statics.field686) {
                field2187 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2172 = true;
        field2173 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2172 = false;
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

    @ObfuscatedName("z.rw(ILjava/lang/String;Ljava/awt/Color;ZI)V")
    public static final void method144(int arg0, String arg1, Color arg2, boolean arg3) {
        try {
            Graphics var4 = Statics.field1781.getGraphics();
            if (Statics.field2005 == null) {
                Statics.field2005 = new Font("Helvetica", 1, 13);
                Statics.field2018 = Statics.field1781.getFontMetrics(Statics.field2005);
            }
            if (arg3) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field63, Statics.field686);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field172 == null) {
                    Statics.field172 = Statics.field1781.createImage(304, 34);
                }
                Graphics var5 = Statics.field172.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(Statics.field2005);
                var5.setColor(Color.white);
                var5.drawString(arg1, (304 - Statics.field2018.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field172, Statics.field63 / 2 - 152, Statics.field686 / 2 - 18, (ImageObserver) null);
            } catch (Exception var10) {
                int var7 = Statics.field63 / 2 - 152;
                int var8 = Statics.field686 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field2005);
                var4.setColor(Color.white);
                var4.drawString(arg1, var7 + (304 - Statics.field2018.stringWidth(arg1)) / 2, var8 + 22);
            }
        } catch (Exception var11) {
            Statics.field1781.repaint();
        }
    }

    @ObfuscatedName("ai.rq(I)V")
    public static final void method744() {
        Statics.field172 = null;
        Statics.field2005 = null;
        Statics.field2018 = null;
    }

    @ObfuscatedName("er.ry(Ljava/lang/String;I)V")
    public void method2827(String arg0) {
        if (this.field2176) {
            return;
        }
        this.field2176 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("er.rt(B)Ljava/awt/Container;")
    public Container method2828() {
        return Statics.field1399 == null ? this : Statics.field1399;
    }

    @ObfuscatedName("er.rn(I)Ljava/awt/Dimension;")
    public Dimension method2851() {
        Container var1 = this.method2828();
        int var2 = Math.max(var1.getWidth(), Statics.field765);
        int var3 = Math.max(var1.getHeight(), Statics.field918);
        if (Statics.field1399 != null) {
            Insets var4 = Statics.field1399.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    @ObfuscatedName("er.x(I)V")
    public abstract void method395();

    public abstract void init();

    @ObfuscatedName("er.h(I)V")
    public abstract void method223();

    @ObfuscatedName("er.y(S)V")
    public abstract void method421();

    @ObfuscatedName("er.c(I)V")
    public abstract void method225();

    @ObfuscatedName("er.d(B)V")
    public abstract void method224();
}
