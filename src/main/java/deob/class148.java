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

@ObfuscatedName("em")
public abstract class class148 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("em.pp")
    public static class148 field2271 = null;

    @ObfuscatedName("em.pl")
    public static int field2253 = 0;

    @ObfuscatedName("em.pm")
    public static long field2254 = 0L;

    @ObfuscatedName("em.pg")
    public static boolean field2255 = false;

    @ObfuscatedName("em.pi")
    public static int field2252 = 20;

    @ObfuscatedName("em.qm")
    public static int field2257 = 1;

    @ObfuscatedName("em.qg")
    public static int field2265 = 0;

    @ObfuscatedName("em.qt")
    public static long[] field2260 = new long[32];

    @ObfuscatedName("em.qd")
    public static long[] field2261 = new long[32];

    @ObfuscatedName("em.qw")
    public static int field2269 = 0;

    @ObfuscatedName("em.qf")
    public static int field2263 = 0;

    @ObfuscatedName("em.qe")
    public static volatile boolean field2264 = true;

    @ObfuscatedName("em.qj")
    public static int field2259 = 500;

    @ObfuscatedName("em.qi")
    public static boolean field2266 = false;

    @ObfuscatedName("em.qx")
    public static volatile boolean field2267 = false;

    @ObfuscatedName("em.qv")
    public static volatile long field2268 = 0L;

    @ObfuscatedName("em.rv")
    public static volatile boolean field2262 = true;

    @ObfuscatedName("em.pd")
    public boolean field2256 = false;

    @ObfuscatedName("em.qq(IIIB)V")
    public final void method3001(int arg0, int arg1, int arg2) {
        try {
            if (field2271 != null) {
                field2253++;
                if (field2253 >= 3) {
                    this.method3013("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2271 = this;
            Statics.field3057 = arg0;
            Statics.field893 = arg1;
            Statics.field2285 = arg2;
            Statics.field2287 = this;
            if (Statics.field2071 == null) {
                Statics.field2071 = new class140();
            }
            Statics.field2071.method2880(this, 1);
        } catch (Exception var5) {
            class152.method169((String) null, var5);
            this.method3013("crash");
        }
    }

    @ObfuscatedName("em.qb(I)V")
    public final synchronized void method3002() {
        Container var1 = this.method3016();
        if (Statics.field1868 != null) {
            Statics.field1868.removeFocusListener(this);
            var1.remove(Statics.field1868);
        }
        Statics.field3057 = Math.max(var1.getWidth(), Statics.field1758);
        Statics.field893 = Math.max(var1.getHeight(), Statics.field2090);
        if (Statics.field2014 != null) {
            Insets var2 = Statics.field2014.getInsets();
            Statics.field3057 -= var2.right + var2.left;
            Statics.field893 -= var2.top + var2.bottom;
        }
        Statics.field1868 = new class143(this);
        var1.add(Statics.field1868);
        Statics.field1868.setSize(Statics.field3057, Statics.field893);
        Statics.field1868.setVisible(true);
        if (Statics.field2014 == var1) {
            Insets var3 = Statics.field2014.getInsets();
            Statics.field1868.setLocation(field2269 + var3.left, field2263 + var3.top);
        } else {
            Statics.field1868.setLocation(field2269, field2263);
        }
        Statics.field1868.addFocusListener(this);
        Statics.field1868.requestFocus();
        field2264 = true;
        class81 var4 = class81.method566(Statics.field3057, Statics.field893, Statics.field1868);
        if (Statics.field1174 != null) {
            Statics.field1174.method1622(var4.field1476.getGraphics(), 0, 0);
        }
        Statics.field1174 = var4;
        field2267 = false;
        field2268 = class119.method1224();
    }

    @ObfuscatedName("em.qp(B)Z")
    public final boolean method3003() {
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
                this.method3013("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2153 != null) {
                String var1 = Statics.field2153.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2147;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method3013("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class167.method787(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        boolean var5 = false;
                        boolean var6 = false;
                        int var7 = 0;
                        int var8 = var4.length();
                        int var9 = 0;
                        boolean var11;
                        while (true) {
                            if (var9 >= var8) {
                                var11 = var6;
                                break;
                            }
                            label186: {
                                char var10 = var4.charAt(var9);
                                if (var9 == 0) {
                                    if (var10 == '-') {
                                        var5 = true;
                                        break label186;
                                    }
                                    if (var10 == '+') {
                                        break label186;
                                    }
                                }
                                int var21;
                                if (var10 >= '0' && var10 <= '9') {
                                    var21 = var10 - '0';
                                } else if (var10 >= 'A' && var10 <= 'Z') {
                                    var21 = var10 - '7';
                                } else {
                                    if (var10 < 'a' || var10 > 'z') {
                                        var11 = false;
                                        break;
                                    }
                                    var21 = var10 - 'W';
                                }
                                if (var21 >= 10) {
                                    var11 = false;
                                    break;
                                }
                                if (var5) {
                                    var21 = -var21;
                                }
                                int var12 = var7 * 10 + var21;
                                if (var12 / 10 != var7) {
                                    var11 = false;
                                    break;
                                }
                                var7 = var12;
                                var6 = true;
                            }
                            var9++;
                        }
                        if (var11) {
                            int var14 = class167.method92(var4, 10, true);
                            if (var14 < 10) {
                                this.method3013("wrongjava");
                                return;
                            }
                        }
                    }
                    field2257 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method3002();
            this.method251();
            Statics.field1670 = class137.method1112();
            label104: while (true) {
                class140 var16;
                Canvas var17;
                do {
                    if (field2254 != 0L && class119.method1224() >= field2254) {
                        break label104;
                    }
                    Statics.field1051 = Statics.field1670.method2849(field2252, field2257);
                    for (int var15 = 0; var15 < Statics.field1051; var15++) {
                        this.method3004();
                    }
                    this.method3005();
                    var16 = Statics.field2071;
                    var17 = Statics.field1868;
                } while (var16.field2152 == null);
                for (int var18 = 0; var18 < 50 && var16.field2152.peekEvent() != null; var18++) {
                    class131.method587(1L);
                }
                if (var17 != null) {
                    var16.field2152.postEvent(new ActionEvent(var17, 1001, "dummy"));
                }
            }
        } catch (Exception var20) {
            class152.method169((String) null, var20);
            this.method3013("crash");
        }
        this.method3020();
    }

    @ObfuscatedName("em.qk(I)V")
    public void method3004() {
        long var1 = class119.method1224();
        long var3 = field2261[Statics.field287];
        field2261[Statics.field287] = var1;
        Statics.field287 = Statics.field287 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1173 = field2262;
        }
        this.method252();
    }

    @ObfuscatedName("em.qc(I)V")
    public void method3005() {
        Container var1 = this.method3016();
        long var2 = class119.method1224();
        long var4 = field2260[Statics.field1746];
        field2260[Statics.field1746] = var2;
        Statics.field1746 = Statics.field1746 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2265 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2259 - 1 > 50) {
            field2259 -= 50;
            field2264 = true;
            Statics.field1868.setSize(Statics.field3057, Statics.field893);
            Statics.field1868.setVisible(true);
            if (Statics.field2014 == var1) {
                Insets var7 = Statics.field2014.getInsets();
                Statics.field1868.setLocation(field2269 + var7.left, field2263 + var7.top);
            } else {
                Statics.field1868.setLocation(field2269, field2263);
            }
        }
        this.method368();
    }

    @ObfuscatedName("em.qu(I)V")
    public final synchronized void method3020() {
        if (field2255) {
            return;
        }
        field2255 = true;
        try {
            Statics.field1868.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method274();
        } catch (Exception var7) {
        }
        if (Statics.field2014 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field2071 != null) {
            try {
                Statics.field2071.method2877();
            } catch (Exception var5) {
            }
        }
        this.method555();
    }

    public void start() {
        if (field2271 == this && !field2255) {
            field2254 = 0L;
        }
    }

    public void stop() {
        if (field2271 == this && !field2255) {
            field2254 = class119.method1224() + 4000L;
        }
    }

    public void destroy() {
        if (field2271 == this && !field2255) {
            field2254 = class119.method1224();
            class131.method587(5000L);
            this.method3020();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2271 != this || field2255) {
            return;
        }
        field2264 = true;
        if (Statics.field2147 != null && Statics.field2147.startsWith("1.5") && class119.method1224() - field2268 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field3057 && var2.height >= Statics.field893) {
                field2267 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2262 = true;
        field2264 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2262 = false;
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

    @ObfuscatedName("dz.qy(ILjava/lang/String;Ljava/awt/Color;ZI)V")
    public static final void method2413(int arg0, String arg1, Color arg2, boolean arg3) {
        try {
            Graphics var4 = Statics.field1868.getGraphics();
            if (Statics.field19 == null) {
                Statics.field19 = new Font("Helvetica", 1, 13);
                Statics.field585 = Statics.field1868.getFontMetrics(Statics.field19);
            }
            if (arg3) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field3057, Statics.field893);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field2130 == null) {
                    Statics.field2130 = Statics.field1868.createImage(304, 34);
                }
                Graphics var5 = Statics.field2130.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(Statics.field19);
                var5.setColor(Color.white);
                var5.drawString(arg1, (304 - Statics.field585.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field2130, Statics.field3057 / 2 - 152, Statics.field893 / 2 - 18, (ImageObserver) null);
            } catch (Exception var10) {
                int var7 = Statics.field3057 / 2 - 152;
                int var8 = Statics.field893 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field19);
                var4.setColor(Color.white);
                var4.drawString(arg1, var7 + (304 - Statics.field585.stringWidth(arg1)) / 2, var8 + 22);
            }
        } catch (Exception var11) {
            Statics.field1868.repaint();
        }
    }

    @ObfuscatedName("au.qz(I)V")
    public static final void method983() {
        Statics.field2130 = null;
        Statics.field19 = null;
        Statics.field585 = null;
    }

    @ObfuscatedName("em.qe(Ljava/lang/String;I)V")
    public void method3013(String arg0) {
        if (this.field2256) {
            return;
        }
        this.field2256 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("em.qn(I)Ljava/awt/Container;")
    public Container method3016() {
        return Statics.field2014 == null ? this : Statics.field2014;
    }

    @ObfuscatedName("em.qj(I)Ljava/awt/Dimension;")
    public Dimension method3015() {
        Container var1 = this.method3016();
        int var2 = Math.max(var1.getWidth(), Statics.field1758);
        int var3 = Math.max(var1.getHeight(), Statics.field2090);
        if (Statics.field2014 != null) {
            Insets var4 = Statics.field2014.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    public abstract void init();

    @ObfuscatedName("em.s(B)V")
    public abstract void method251();

    @ObfuscatedName("em.r(I)V")
    public abstract void method555();

    @ObfuscatedName("em.u(B)V")
    public abstract void method368();

    @ObfuscatedName("em.n(I)V")
    public abstract void method274();

    @ObfuscatedName("em.k(I)V")
    public abstract void method252();
}
