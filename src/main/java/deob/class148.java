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

@ObfuscatedName("ev")
public abstract class class148 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ev.pt")
    public static class148 field2268 = null;

    @ObfuscatedName("ev.py")
    public static int field2265 = 0;

    @ObfuscatedName("ev.pj")
    public static long field2263 = 0L;

    @ObfuscatedName("ev.po")
    public static boolean field2272 = false;

    @ObfuscatedName("ev.pg")
    public static int field2273 = 20;

    @ObfuscatedName("ev.qk")
    public static int field2267 = 1;

    @ObfuscatedName("ev.qn")
    public static int field2275 = 0;

    @ObfuscatedName("ev.qo")
    public static long[] field2269 = new long[32];

    @ObfuscatedName("ev.qm")
    public static long[] field2270 = new long[32];

    @ObfuscatedName("ev.ql")
    public static int field2271 = 0;

    @ObfuscatedName("ev.qy")
    public static int field2264 = 0;

    @ObfuscatedName("ev.qf")
    public static volatile boolean field2274 = true;

    @ObfuscatedName("ev.qe")
    public static int field2262 = 500;

    @ObfuscatedName("ev.qs")
    public static boolean field2266 = false;

    @ObfuscatedName("ev.qg")
    public static volatile boolean field2276 = false;

    @ObfuscatedName("ev.qu")
    public static volatile long field2277 = 0L;

    @ObfuscatedName("ev.ra")
    public static volatile boolean field2278 = true;

    @ObfuscatedName("ev.ph")
    public boolean field2261 = false;

    @ObfuscatedName("ev.qy(IIII)V")
    public final void method2952(int arg0, int arg1, int arg2) {
        try {
            if (field2268 != null) {
                field2265++;
                if (field2265 >= 3) {
                    this.method2905("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2268 = this;
            Statics.field2375 = arg0;
            Statics.field1644 = arg1;
            Statics.field2294 = arg2;
            Statics.field2292 = this;
            if (Statics.field2104 == null) {
                Statics.field2104 = new class140();
            }
            Statics.field2104.method2794(this, 1);
        } catch (Exception var5) {
            class152.method2703((String) null, var5);
            this.method2905("crash");
        }
    }

    @ObfuscatedName("ev.qd(I)V")
    public final synchronized void method2914() {
        Container var1 = this.method2906();
        if (Statics.field1458 != null) {
            Statics.field1458.removeFocusListener(this);
            var1.remove(Statics.field1458);
        }
        Statics.field2375 = Math.max(var1.getWidth(), Statics.field1649);
        Statics.field1644 = Math.max(var1.getHeight(), Statics.field152);
        if (Statics.field1622 != null) {
            Insets var2 = Statics.field1622.getInsets();
            Statics.field2375 -= var2.right + var2.left;
            Statics.field1644 -= var2.top + var2.bottom;
        }
        Statics.field1458 = new class143(this);
        var1.add(Statics.field1458);
        Statics.field1458.setSize(Statics.field2375, Statics.field1644);
        Statics.field1458.setVisible(true);
        if (Statics.field1622 == var1) {
            Insets var3 = Statics.field1622.getInsets();
            Statics.field1458.setLocation(field2271 + var3.left, field2264 + var3.top);
        } else {
            Statics.field1458.setLocation(field2271, field2264);
        }
        Statics.field1458.addFocusListener(this);
        Statics.field1458.requestFocus();
        field2274 = true;
        class81 var4 = class81.method11(Statics.field2375, Statics.field1644, Statics.field1458);
        if (Statics.field2074 != null) {
            Statics.field2074.method1558(var4.field1471.getGraphics(), 0, 0);
        }
        Statics.field2074 = var4;
        field2276 = false;
        field2277 = class119.method64();
    }

    @ObfuscatedName("ev.qc(B)Z")
    public final boolean method2896() {
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
                this.method2905("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2163 != null) {
                String var1 = Statics.field2163.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2162;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2905("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class167.method1581(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class167.method1628(var4)) {
                            int var5 = class167.method2872(var4, 10, true);
                            if (var5 < 10) {
                                this.method2905("wrongjava");
                                return;
                            }
                        }
                    }
                    field2267 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2914();
            this.method340();
            class137 var6;
            try {
                var6 = new class151();
            } catch (Throwable var10) {
                var6 = new class145();
            }
            Statics.field1700 = var6;
            while (field2263 == 0L || class119.method64() < field2263) {
                Statics.field1703 = Statics.field1700.method2753(field2273, field2267);
                for (int var8 = 0; var8 < Statics.field1703; var8++) {
                    this.method2897();
                }
                this.method2899();
                class146.method2717(Statics.field2104, Statics.field1458);
            }
        } catch (Exception var11) {
            class152.method2703((String) null, var11);
            this.method2905("crash");
        }
        this.method2960();
    }

    @ObfuscatedName("ev.qw(I)V")
    public void method2897() {
        long var1 = class119.method64();
        long var3 = field2270[Statics.field2169];
        field2270[Statics.field2169] = var1;
        Statics.field2169 = Statics.field2169 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field633 = field2278;
        }
        this.method240();
    }

    @ObfuscatedName("ev.qr(I)V")
    public void method2899() {
        Container var1 = this.method2906();
        long var2 = class119.method64();
        long var4 = field2269[Statics.field702];
        field2269[Statics.field702] = var2;
        Statics.field702 = Statics.field702 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2275 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2262 - 1 > 50) {
            field2262 -= 50;
            field2274 = true;
            Statics.field1458.setSize(Statics.field2375, Statics.field1644);
            Statics.field1458.setVisible(true);
            if (Statics.field1622 == var1) {
                Insets var7 = Statics.field1622.getInsets();
                Statics.field1458.setLocation(field2271 + var7.left, field2264 + var7.top);
            } else {
                Statics.field1458.setLocation(field2271, field2264);
            }
        }
        this.method339();
    }

    @ObfuscatedName("ev.qh(I)V")
    public final synchronized void method2960() {
        if (field2272) {
            return;
        }
        field2272 = true;
        try {
            Statics.field1458.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method348();
        } catch (Exception var7) {
        }
        if (Statics.field1622 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field2104 != null) {
            try {
                Statics.field2104.method2776();
            } catch (Exception var5) {
            }
        }
        this.method237();
    }

    public void start() {
        if (field2268 == this && !field2272) {
            field2263 = 0L;
        }
    }

    public void stop() {
        if (field2268 == this && !field2272) {
            field2263 = class119.method64() + 4000L;
        }
    }

    public void destroy() {
        if (field2268 == this && !field2272) {
            field2263 = class119.method64();
            class131.method674(5000L);
            this.method2960();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2268 != this || field2272) {
            return;
        }
        field2274 = true;
        if (Statics.field2162 != null && Statics.field2162.startsWith("1.5") && class119.method64() - field2277 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field2375 && var2.height >= Statics.field1644) {
                field2276 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2278 = true;
        field2274 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2278 = false;
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

    @ObfuscatedName("da.qv(ILjava/lang/String;Ljava/awt/Color;ZB)V")
    public static final void method2345(int arg0, String arg1, Color arg2, boolean arg3) {
        try {
            Graphics var4 = Statics.field1458.getGraphics();
            if (Statics.field732 == null) {
                Statics.field732 = new Font("Helvetica", 1, 13);
                Statics.field1846 = Statics.field1458.getFontMetrics(Statics.field732);
            }
            if (arg3) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field2375, Statics.field1644);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field1853 == null) {
                    Statics.field1853 = Statics.field1458.createImage(304, 34);
                }
                Graphics var5 = Statics.field1853.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(Statics.field732);
                var5.setColor(Color.white);
                var5.drawString(arg1, (304 - Statics.field1846.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field1853, Statics.field2375 / 2 - 152, Statics.field1644 / 2 - 18, (ImageObserver) null);
            } catch (Exception var10) {
                int var7 = Statics.field2375 / 2 - 152;
                int var8 = Statics.field1644 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field732);
                var4.setColor(Color.white);
                var4.drawString(arg1, var7 + (304 - Statics.field1846.stringWidth(arg1)) / 2, var8 + 22);
            }
        } catch (Exception var11) {
            Statics.field1458.repaint();
        }
    }

    @ObfuscatedName("aj.qx(B)V")
    public static final void method1049() {
        Statics.field1853 = null;
        Statics.field732 = null;
        Statics.field1846 = null;
    }

    @ObfuscatedName("ev.qi(Ljava/lang/String;I)V")
    public void method2905(String arg0) {
        if (this.field2261) {
            return;
        }
        this.field2261 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ev.qf(B)Ljava/awt/Container;")
    public Container method2906() {
        return Statics.field1622 == null ? this : Statics.field1622;
    }

    @ObfuscatedName("ev.qa(I)Ljava/awt/Dimension;")
    public Dimension method2907() {
        Container var1 = this.method2906();
        int var2 = Math.max(var1.getWidth(), Statics.field1649);
        int var3 = Math.max(var1.getHeight(), Statics.field152);
        if (Statics.field1622 != null) {
            Insets var4 = Statics.field1622.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    @ObfuscatedName("ev.z(S)V")
    public abstract void method340();

    @ObfuscatedName("ev.d(B)V")
    public abstract void method237();

    @ObfuscatedName("ev.i(B)V")
    public abstract void method348();

    @ObfuscatedName("ev.n(B)V")
    public abstract void method339();

    public abstract void init();

    @ObfuscatedName("ev.t(I)V")
    public abstract void method240();
}
