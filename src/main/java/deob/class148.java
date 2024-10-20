package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;

@ObfuscatedName("em")
public abstract class class148 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("em.pr")
    public static class148 field2261 = null;

    @ObfuscatedName("em.pc")
    public static int field2243 = 0;

    @ObfuscatedName("em.pj")
    public static long field2244 = 0L;

    @ObfuscatedName("em.pu")
    public static boolean field2245 = false;

    @ObfuscatedName("em.pd")
    public static int field2256 = 20;

    @ObfuscatedName("em.qt")
    public static int field2259 = 1;

    @ObfuscatedName("em.ql")
    public static int field2249 = 0;

    @ObfuscatedName("em.qy")
    public static long[] field2250 = new long[32];

    @ObfuscatedName("em.qd")
    public static long[] field2257 = new long[32];

    @ObfuscatedName("em.qi")
    public static int field2242 = 0;

    @ObfuscatedName("em.qh")
    public static int field2253 = 0;

    @ObfuscatedName("em.qv")
    public static volatile boolean field2254 = true;

    @ObfuscatedName("em.qw")
    public static int field2255 = 500;

    @ObfuscatedName("em.qr")
    public static boolean field2248 = false;

    @ObfuscatedName("em.qs")
    public static volatile boolean field2247 = false;

    @ObfuscatedName("em.qm")
    public static volatile long field2252 = 0L;

    @ObfuscatedName("em.rc")
    public static volatile boolean field2258 = true;

    @ObfuscatedName("em.pm")
    public boolean field2246 = false;

    @ObfuscatedName("em.pw(IIIB)V")
    public final void method2905(int arg0, int arg1, int arg2) {
        try {
            if (field2261 != null) {
                field2243++;
                if (field2243 >= 3) {
                    this.method2897("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2261 = this;
            Statics.field1268 = arg0;
            Statics.field1429 = arg1;
            Statics.field2274 = arg2;
            Statics.field2279 = this;
            if (Statics.field899 == null) {
                Statics.field899 = new class140();
            }
            Statics.field899.method2773(this, 1);
        } catch (Exception var5) {
            class152.method2021((String) null, var5);
            this.method2897("crash");
        }
    }

    @ObfuscatedName("em.ps(I)V")
    public final synchronized void method2943() {
        Container var1 = this.method2912();
        if (Statics.field2694 != null) {
            Statics.field2694.removeFocusListener(this);
            var1.remove(Statics.field2694);
        }
        Statics.field1268 = Math.max(var1.getWidth(), Statics.field2015);
        Statics.field1429 = Math.max(var1.getHeight(), Statics.field2103);
        if (Statics.field16 != null) {
            Insets var2 = Statics.field16.getInsets();
            Statics.field1268 -= var2.right + var2.left;
            Statics.field1429 -= var2.top + var2.bottom;
        }
        Statics.field2694 = new class143(this);
        var1.add(Statics.field2694);
        Statics.field2694.setSize(Statics.field1268, Statics.field1429);
        Statics.field2694.setVisible(true);
        if (Statics.field16 == var1) {
            Insets var3 = Statics.field16.getInsets();
            Statics.field2694.setLocation(field2242 + var3.left, field2253 + var3.top);
        } else {
            Statics.field2694.setLocation(field2242, field2253);
        }
        Statics.field2694.addFocusListener(this);
        Statics.field2694.requestFocus();
        field2254 = true;
        class81 var4 = class81.method946(Statics.field1268, Statics.field1429, Statics.field2694);
        if (Statics.field3217 != null) {
            Statics.field3217.method1553(var4.field1448.getGraphics(), 0, 0);
        }
        Statics.field3217 = var4;
        field2247 = false;
        field2252 = class119.method719();
    }

    @ObfuscatedName("em.pp(I)Z")
    public final boolean method2892() {
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
                this.method2897("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1615 != null) {
                String var1 = Statics.field1615.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2141;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2897("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class167.method2864(var2.charAt(var3)); var3++) {
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
                            int var14 = class167.method2868(var4, 10, true);
                            if (var14 < 10) {
                                this.method2897("wrongjava");
                                return;
                            }
                        }
                    }
                    field2259 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2943();
            this.method441();
            Statics.field2788 = class137.method2713();
            label104: while (true) {
                class140 var16;
                Canvas var17;
                do {
                    if (field2244 != 0L && class119.method719() >= field2244) {
                        break label104;
                    }
                    Statics.field790 = Statics.field2788.method2738(field2256, field2259);
                    for (int var15 = 0; var15 < Statics.field790; var15++) {
                        this.method2893();
                    }
                    this.method2894();
                    var16 = Statics.field899;
                    var17 = Statics.field2694;
                } while (var16.field2149 == null);
                for (int var18 = 0; var18 < 50 && var16.field2149.peekEvent() != null; var18++) {
                    class131.method3297(1L);
                }
                if (var17 != null) {
                    var16.field2149.postEvent(new ActionEvent(var17, 1001, "dummy"));
                }
            }
        } catch (Exception var20) {
            class152.method2021((String) null, var20);
            this.method2897("crash");
        }
        this.method2946();
    }

    @ObfuscatedName("em.pn(B)V")
    public void method2893() {
        long var1 = class119.method719();
        long var3 = field2257[Statics.field3133];
        field2257[Statics.field3133] = var1;
        Statics.field3133 = Statics.field3133 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field834 = field2258;
        }
        this.method354();
    }

    @ObfuscatedName("em.py(B)V")
    public void method2894() {
        Container var1 = this.method2912();
        long var2 = class119.method719();
        long var4 = field2250[Statics.field74];
        field2250[Statics.field74] = var2;
        Statics.field74 = Statics.field74 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2249 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2255 - 1 > 50) {
            field2255 -= 50;
            field2254 = true;
            Statics.field2694.setSize(Statics.field1268, Statics.field1429);
            Statics.field2694.setVisible(true);
            if (Statics.field16 == var1) {
                Insets var7 = Statics.field16.getInsets();
                Statics.field2694.setLocation(field2242 + var7.left, field2253 + var7.top);
            } else {
                Statics.field2694.setLocation(field2242, field2253);
            }
        }
        this.method507();
    }

    @ObfuscatedName("em.po(I)V")
    public final synchronized void method2946() {
        if (field2245) {
            return;
        }
        field2245 = true;
        try {
            Statics.field2694.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method235();
        } catch (Exception var7) {
        }
        if (Statics.field16 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field899 != null) {
            try {
                Statics.field899.method2770();
            } catch (Exception var5) {
            }
        }
        this.method284();
    }

    @ObfuscatedName("fq.ph(I)V")
    public static final void method3048() {
        Statics.field2788.method2746();
        for (int var0 = 0; var0 < 32; var0++) {
            field2250[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2257[var1] = 0L;
        }
        Statics.field790 = 0;
    }

    public void start() {
        if (field2261 == this && !field2245) {
            field2244 = 0L;
        }
    }

    public void stop() {
        if (field2261 == this && !field2245) {
            field2244 = class119.method719() + 4000L;
        }
    }

    public void destroy() {
        if (field2261 == this && !field2245) {
            field2244 = class119.method719();
            class131.method3297(5000L);
            this.method2946();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2261 != this || field2245) {
            return;
        }
        field2254 = true;
        if (Statics.field2141 != null && Statics.field2141.startsWith("1.5") && class119.method719() - field2252 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1268 && var2.height >= Statics.field1429) {
                field2247 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2258 = true;
        field2254 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2258 = false;
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

    @ObfuscatedName("dh.pi(I)V")
    public static final void method2666() {
        Statics.field1825 = null;
        Statics.field685 = null;
        Statics.field2747 = null;
    }

    @ObfuscatedName("em.pg(Ljava/lang/String;I)V")
    public void method2897(String arg0) {
        if (this.field2246) {
            return;
        }
        this.field2246 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("em.pl(I)Ljava/awt/Container;")
    public Container method2912() {
        return Statics.field16 == null ? this : Statics.field16;
    }

    @ObfuscatedName("em.pb(S)Ljava/awt/Dimension;")
    public Dimension method2902() {
        Container var1 = this.method2912();
        int var2 = Math.max(var1.getWidth(), Statics.field2015);
        int var3 = Math.max(var1.getHeight(), Statics.field2103);
        if (Statics.field16 != null) {
            Insets var4 = Statics.field16.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    public abstract void init();

    @ObfuscatedName("em.n(S)V")
    public abstract void method441();

    @ObfuscatedName("em.u(I)V")
    public abstract void method354();

    @ObfuscatedName("em.d(I)V")
    public abstract void method507();

    @ObfuscatedName("em.l(B)V")
    public abstract void method235();

    @ObfuscatedName("em.e(I)V")
    public abstract void method284();
}
