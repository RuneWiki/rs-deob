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

@ObfuscatedName("el")
public abstract class class144 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("el.pv")
    public static class144 field2189 = null;

    @ObfuscatedName("el.pd")
    public static int field2186 = 0;

    @ObfuscatedName("el.pr")
    public static long field2181 = 0L;

    @ObfuscatedName("el.ps")
    public static boolean field2182 = false;

    @ObfuscatedName("el.qj")
    public static int field2184 = 20;

    @ObfuscatedName("el.qb")
    public static int field2185 = 1;

    @ObfuscatedName("el.qo")
    public static int field2179 = 0;

    @ObfuscatedName("el.ql")
    public static long[] field2187 = new long[32];

    @ObfuscatedName("el.qa")
    public static long[] field2192 = new long[32];

    @ObfuscatedName("el.qq")
    public static int field2180 = 0;

    @ObfuscatedName("el.qc")
    public static int field2190 = 0;

    @ObfuscatedName("el.qn")
    public static volatile boolean field2191 = true;

    @ObfuscatedName("el.qm")
    public static int field2194 = 500;

    @ObfuscatedName("el.qi")
    public static boolean field2188 = false;

    @ObfuscatedName("el.qt")
    public static volatile boolean field2193 = false;

    @ObfuscatedName("el.ro")
    public static volatile long field2195 = 0L;

    @ObfuscatedName("el.ri")
    public static volatile boolean field2196 = true;

    @ObfuscatedName("el.pg")
    public boolean field2183 = false;

    @ObfuscatedName("el.pr(IIII)V")
    public final void method2839(int arg0, int arg1, int arg2) {
        try {
            if (field2189 != null) {
                field2186++;
                if (field2186 >= 3) {
                    this.method2877("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2189 = this;
            Statics.field108 = arg0;
            Statics.field750 = arg1;
            Statics.field2211 = arg2;
            Statics.field2212 = this;
            if (Statics.field2057 == null) {
                Statics.field2057 = new class136();
            }
            Statics.field2057.method2719(this, 1);
        } catch (Exception var5) {
            class148.method643((String) null, var5);
            this.method2877("crash");
        }
    }

    @ObfuscatedName("el.ps(B)V")
    public final synchronized void method2865() {
        Container var1 = this.method2850();
        if (Statics.field1043 != null) {
            Statics.field1043.removeFocusListener(this);
            var1.remove(Statics.field1043);
        }
        Statics.field108 = Math.max(var1.getWidth(), Statics.field1986);
        Statics.field750 = Math.max(var1.getHeight(), Statics.field2161);
        if (Statics.field1218 != null) {
            Insets var2 = Statics.field1218.getInsets();
            Statics.field108 -= var2.right + var2.left;
            Statics.field750 -= var2.top + var2.bottom;
        }
        Statics.field1043 = new class139(this);
        var1.add(Statics.field1043);
        Statics.field1043.setSize(Statics.field108, Statics.field750);
        Statics.field1043.setVisible(true);
        if (Statics.field1218 == var1) {
            Insets var3 = Statics.field1218.getInsets();
            Statics.field1043.setLocation(field2180 + var3.left, field2190 + var3.top);
        } else {
            Statics.field1043.setLocation(field2180, field2190);
        }
        Statics.field1043.addFocusListener(this);
        Statics.field1043.requestFocus();
        field2191 = true;
        class78 var4 = class78.method240(Statics.field108, Statics.field750, Statics.field1043);
        if (Statics.field2150 != null) {
            Statics.field2150.method1525(var4.field1393.getGraphics(), 0, 0);
        }
        Statics.field2150 = var4;
        field2193 = false;
        field2195 = class115.method207();
    }

    @ObfuscatedName("el.pg(I)Z")
    public final boolean method2841() {
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
                this.method2877("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2081 != null) {
                String var1 = Statics.field2081.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1901;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2877("wrongjava");
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
                        boolean var7 = false;
                        boolean var8 = false;
                        int var9 = 0;
                        int var10 = var6.length();
                        int var11 = 0;
                        boolean var13;
                        while (true) {
                            if (var11 >= var10) {
                                var13 = var8;
                                break;
                            }
                            label177: {
                                char var12 = var6.charAt(var11);
                                if (var11 == 0) {
                                    if (var12 == '-') {
                                        var7 = true;
                                        break label177;
                                    }
                                    if (var12 == '+') {
                                        break label177;
                                    }
                                }
                                int var20;
                                if (var12 >= '0' && var12 <= '9') {
                                    var20 = var12 - '0';
                                } else if (var12 >= 'A' && var12 <= 'Z') {
                                    var20 = var12 - '7';
                                } else {
                                    if (var12 < 'a' || var12 > 'z') {
                                        var13 = false;
                                        break;
                                    }
                                    var20 = var12 - 'W';
                                }
                                if (var20 >= 10) {
                                    var13 = false;
                                    break;
                                }
                                if (var7) {
                                    var20 = -var20;
                                }
                                int var14 = var9 * 10 + var20;
                                if (var14 / 10 != var9) {
                                    var13 = false;
                                    break;
                                }
                                var9 = var14;
                                var8 = true;
                            }
                            var11++;
                        }
                        if (var13) {
                            int var16 = class163.method2271(var6, 10, true);
                            if (var16 < 10) {
                                this.method2877("wrongjava");
                                return;
                            }
                        }
                    }
                    field2185 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2865();
            this.method401();
            Statics.field683 = class133.method2965();
            while (field2181 == 0L || class115.method207() < field2181) {
                Statics.field1023 = Statics.field683.method2683(field2184, field2185);
                for (int var17 = 0; var17 < Statics.field1023; var17++) {
                    this.method2882();
                }
                this.method2843();
                class142.method2232(Statics.field2057, Statics.field1043);
            }
        } catch (Exception var19) {
            class148.method643((String) null, var19);
            this.method2877("crash");
        }
        this.method2844();
    }

    @ObfuscatedName("el.pc(B)V")
    public void method2882() {
        long var1 = class115.method207();
        long var3 = field2192[Statics.field1892];
        field2192[Statics.field1892] = var1;
        Statics.field1892 = Statics.field1892 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1058 = field2196;
        }
        this.method246();
    }

    @ObfuscatedName("el.qj(I)V")
    public void method2843() {
        Container var1 = this.method2850();
        long var2 = class115.method207();
        long var4 = field2187[Statics.field1762];
        field2187[Statics.field1762] = var2;
        Statics.field1762 = Statics.field1762 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2179 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2194 - 1 > 50) {
            field2194 -= 50;
            field2191 = true;
            Statics.field1043.setSize(Statics.field108, Statics.field750);
            Statics.field1043.setVisible(true);
            if (Statics.field1218 == var1) {
                Insets var7 = Statics.field1218.getInsets();
                Statics.field1043.setLocation(field2180 + var7.left, field2190 + var7.top);
            } else {
                Statics.field1043.setLocation(field2180, field2190);
            }
        }
        this.method365();
    }

    @ObfuscatedName("el.qb(I)V")
    public final synchronized void method2844() {
        if (field2182) {
            return;
        }
        field2182 = true;
        try {
            Statics.field1043.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method248();
        } catch (Exception var7) {
        }
        if (Statics.field1218 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field2057 != null) {
            try {
                Statics.field2057.method2707();
            } catch (Exception var5) {
            }
        }
        this.method256();
    }

    public void start() {
        if (field2189 == this && !field2182) {
            field2181 = 0L;
        }
    }

    public void stop() {
        if (field2189 == this && !field2182) {
            field2181 = class115.method207() + 4000L;
        }
    }

    public void destroy() {
        if (field2189 == this && !field2182) {
            field2181 = class115.method207();
            class127.method2148(5000L);
            this.method2844();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2189 != this || field2182) {
            return;
        }
        field2191 = true;
        if (Statics.field1901 != null && Statics.field1901.startsWith("1.5") && class115.method207() - field2195 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field108 && var2.height >= Statics.field750) {
                field2193 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2196 = true;
        field2191 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2196 = false;
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

    @ObfuscatedName("ar.qy(ILjava/lang/String;Ljava/awt/Color;ZI)V")
    public static final void method776(int arg0, String arg1, Color arg2, boolean arg3) {
        try {
            Graphics var4 = Statics.field1043.getGraphics();
            if (Statics.field1100 == null) {
                Statics.field1100 = new Font("Helvetica", 1, 13);
                Statics.field2125 = Statics.field1043.getFontMetrics(Statics.field1100);
            }
            if (arg3) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field108, Statics.field750);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field1755 == null) {
                    Statics.field1755 = Statics.field1043.createImage(304, 34);
                }
                Graphics var5 = Statics.field1755.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(Statics.field1100);
                var5.setColor(Color.white);
                var5.drawString(arg1, (304 - Statics.field2125.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field1755, Statics.field108 / 2 - 152, Statics.field750 / 2 - 18, (ImageObserver) null);
            } catch (Exception var10) {
                int var7 = Statics.field108 / 2 - 152;
                int var8 = Statics.field750 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1100);
                var4.setColor(Color.white);
                var4.drawString(arg1, var7 + (304 - Statics.field2125.stringWidth(arg1)) / 2, var8 + 22);
            }
        } catch (Exception var11) {
            Statics.field1043.repaint();
        }
    }

    @ObfuscatedName("el.qe(Ljava/lang/String;I)V")
    public void method2877(String arg0) {
        if (this.field2183) {
            return;
        }
        this.field2183 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("el.ql(I)Ljava/awt/Container;")
    public Container method2850() {
        return Statics.field1218 == null ? this : Statics.field1218;
    }

    @ObfuscatedName("el.qx(B)Ljava/awt/Dimension;")
    public Dimension method2851() {
        Container var1 = this.method2850();
        int var2 = Math.max(var1.getWidth(), Statics.field1986);
        int var3 = Math.max(var1.getHeight(), Statics.field2161);
        if (Statics.field1218 != null) {
            Insets var4 = Statics.field1218.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    @ObfuscatedName("el.e(I)V")
    public abstract void method401();

    @ObfuscatedName("el.j(B)V")
    public abstract void method248();

    @ObfuscatedName("el.g(B)V")
    public abstract void method246();

    @ObfuscatedName("el.m(I)V")
    public abstract void method365();

    @ObfuscatedName("el.f(I)V")
    public abstract void method256();

    public abstract void init();
}
