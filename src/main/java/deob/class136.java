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

@ObfuscatedName("en")
public abstract class class136 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("en.pg")
    public static class136 field2093 = null;

    @ObfuscatedName("en.pi")
    public static int field2092 = 0;

    @ObfuscatedName("en.pn")
    public static long field2104 = 0L;

    @ObfuscatedName("en.ph")
    public static boolean field2094 = false;

    @ObfuscatedName("en.pk")
    public static int field2096 = 20;

    @ObfuscatedName("en.qo")
    public static int field2097 = 1;

    @ObfuscatedName("en.qi")
    public static int field2091 = 0;

    @ObfuscatedName("en.qg")
    public static long[] field2100 = new long[32];

    @ObfuscatedName("en.qb")
    public static long[] field2109 = new long[32];

    @ObfuscatedName("en.qj")
    public static int field2102 = 0;

    @ObfuscatedName("en.qz")
    public static int field2101 = 0;

    @ObfuscatedName("en.qr")
    public static volatile boolean field2103 = true;

    @ObfuscatedName("en.qk")
    public static int field2105 = 500;

    @ObfuscatedName("en.qv")
    public static boolean field2106 = false;

    @ObfuscatedName("en.qh")
    public static volatile boolean field2107 = false;

    @ObfuscatedName("en.qc")
    public static volatile long field2108 = 0L;

    @ObfuscatedName("en.re")
    public static volatile boolean field2098 = true;

    @ObfuscatedName("en.pm")
    public boolean field2095 = false;

    @ObfuscatedName("en.qu(IIII)V")
    public final void method2733(int arg0, int arg1, int arg2) {
        try {
            if (field2093 != null) {
                field2092++;
                if (field2092 >= 3) {
                    this.method2753("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2093 = this;
            Statics.field696 = arg0;
            Statics.field1848 = arg1;
            Statics.field742 = arg2;
            Statics.field2123 = this;
            if (Statics.field202 == null) {
                Statics.field202 = new class128();
            }
            Statics.field202.method2610(this, 1);
        } catch (Exception var5) {
            class140.method2571((String) null, var5);
            this.method2753("crash");
        }
    }

    @ObfuscatedName("en.qg(I)V")
    public final synchronized void method2734() {
        Container var1 = this.method2774();
        if (Statics.field1850 != null) {
            Statics.field1850.removeFocusListener(this);
            var1.remove(Statics.field1850);
        }
        Statics.field696 = Math.max(var1.getWidth(), Statics.field648);
        Statics.field1848 = Math.max(var1.getHeight(), Statics.field1925);
        if (Statics.field1896 != null) {
            Insets var2 = Statics.field1896.getInsets();
            Statics.field696 -= var2.right + var2.left;
            Statics.field1848 -= var2.top + var2.bottom;
        }
        Statics.field1850 = new class131(this);
        var1.add(Statics.field1850);
        Statics.field1850.setSize(Statics.field696, Statics.field1848);
        Statics.field1850.setVisible(true);
        if (Statics.field1896 == var1) {
            Insets var3 = Statics.field1896.getInsets();
            Statics.field1850.setLocation(field2102 + var3.left, field2101 + var3.top);
        } else {
            Statics.field1850.setLocation(field2102, field2101);
        }
        Statics.field1850.addFocusListener(this);
        Statics.field1850.requestFocus();
        field2103 = true;
        class73 var4 = class73.method500(Statics.field696, Statics.field1848, Statics.field1850);
        if (Statics.field1967 != null) {
            Statics.field1967.method1435(var4.field1338.getGraphics(), 0, 0);
        }
        Statics.field1967 = var4;
        field2107 = false;
        field2108 = class107.method1430();
    }

    @ObfuscatedName("en.qw(I)Z")
    public final boolean method2735() {
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
                this.method2753("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1994 != null) {
                String var1 = Statics.field1994.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1995;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2753("wrongjava");
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
                        boolean var7 = class154.method1968(var6, 10, true);
                        if (var7) {
                            int var8 = class154.method620(var6, 10, true);
                            if (var8 < 10) {
                                this.method2753("wrongjava");
                                return;
                            }
                        }
                    }
                    field2097 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2734();
            this.method170();
            class125 var9;
            try {
                var9 = new class139();
            } catch (Throwable var16) {
                var9 = new class133();
            }
            Statics.field1914 = var9;
            label91: while (true) {
                class128 var12;
                Canvas var13;
                do {
                    if (field2104 != 0L && class107.method1430() >= field2104) {
                        break label91;
                    }
                    Statics.field989 = Statics.field1914.method2581(field2096, field2097);
                    for (int var11 = 0; var11 < Statics.field989; var11++) {
                        this.method2741();
                    }
                    this.method2763();
                    var12 = Statics.field202;
                    var13 = Statics.field1850;
                } while (var12.field2001 == null);
                for (int var14 = 0; var14 < 50 && var12.field2001.peekEvent() != null; var14++) {
                    class119.method2156(1L);
                }
                if (var13 != null) {
                    var12.field2001.postEvent(new ActionEvent(var13, 1001, "dummy"));
                }
            }
        } catch (Exception var17) {
            class140.method2571((String) null, var17);
            this.method2753("crash");
        }
        this.method2782();
    }

    @ObfuscatedName("en.qb(B)V")
    public void method2741() {
        long var1 = class107.method1430();
        long var3 = field2109[Statics.field1938];
        field2109[Statics.field1938] = var1;
        Statics.field1938 = Statics.field1938 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field888 = field2098;
        }
        this.method171();
    }

    @ObfuscatedName("en.qd(I)V")
    public void method2763() {
        Container var1 = this.method2774();
        long var2 = class107.method1430();
        long var4 = field2100[Statics.field1908];
        field2100[Statics.field1908] = var2;
        Statics.field1908 = Statics.field1908 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2091 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2105 - 1 > 50) {
            field2105 -= 50;
            field2103 = true;
            Statics.field1850.setSize(Statics.field696, Statics.field1848);
            Statics.field1850.setVisible(true);
            if (Statics.field1896 == var1) {
                Insets var7 = Statics.field1896.getInsets();
                Statics.field1850.setLocation(field2102 + var7.left, field2101 + var7.top);
            } else {
                Statics.field1850.setLocation(field2102, field2101);
            }
        }
        this.method202();
    }

    @ObfuscatedName("en.qs(B)V")
    public final synchronized void method2782() {
        if (field2094) {
            return;
        }
        field2094 = true;
        try {
            Statics.field1850.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method173();
        } catch (Exception var7) {
        }
        if (Statics.field1896 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field202 != null) {
            try {
                Statics.field202.method2617();
            } catch (Exception var5) {
            }
        }
        this.method239();
    }

    public void start() {
        if (field2093 == this && !field2094) {
            field2104 = 0L;
        }
    }

    public void stop() {
        if (field2093 == this && !field2094) {
            field2104 = class107.method1430() + 4000L;
        }
    }

    public void destroy() {
        if (field2093 == this && !field2094) {
            field2104 = class107.method1430();
            class119.method2156(5000L);
            this.method2782();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2093 != this || field2094) {
            return;
        }
        field2103 = true;
        if (Statics.field1995 != null && Statics.field1995.startsWith("1.5") && class107.method1430() - field2108 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field696 && var2.height >= Statics.field1848) {
                field2107 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2098 = true;
        field2103 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2098 = false;
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

    @ObfuscatedName("cj.qf(ILjava/lang/String;Ljava/awt/Color;ZB)V")
    public static final void method1874(int arg0, String arg1, Color arg2, boolean arg3) {
        try {
            Graphics var4 = Statics.field1850.getGraphics();
            if (Statics.field1987 == null) {
                Statics.field1987 = new Font("Helvetica", 1, 13);
                Statics.field248 = Statics.field1850.getFontMetrics(Statics.field1987);
            }
            if (arg3) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field696, Statics.field1848);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field1302 == null) {
                    Statics.field1302 = Statics.field1850.createImage(304, 34);
                }
                Graphics var5 = Statics.field1302.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(Statics.field1987);
                var5.setColor(Color.white);
                var5.drawString(arg1, (304 - Statics.field248.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field1302, Statics.field696 / 2 - 152, Statics.field1848 / 2 - 18, (ImageObserver) null);
            } catch (Exception var10) {
                int var7 = Statics.field696 / 2 - 152;
                int var8 = Statics.field1848 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1987);
                var4.setColor(Color.white);
                var4.drawString(arg1, var7 + (304 - Statics.field248.stringWidth(arg1)) / 2, var8 + 22);
            }
        } catch (Exception var11) {
            Statics.field1850.repaint();
        }
    }

    @ObfuscatedName("en.qj(Ljava/lang/String;B)V")
    public void method2753(String arg0) {
        if (this.field2095) {
            return;
        }
        this.field2095 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("en.qz(I)Ljava/awt/Container;")
    public Container method2774() {
        return Statics.field1896 == null ? this : Statics.field1896;
    }

    @ObfuscatedName("en.qx(B)Ljava/awt/Dimension;")
    public Dimension method2745() {
        Container var1 = this.method2774();
        int var2 = Math.max(var1.getWidth(), Statics.field648);
        int var3 = Math.max(var1.getHeight(), Statics.field1925);
        if (Statics.field1896 != null) {
            Insets var4 = Statics.field1896.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    public abstract void init();

    @ObfuscatedName("en.i(I)V")
    public abstract void method170();

    @ObfuscatedName("en.l(I)V")
    public abstract void method202();

    @ObfuscatedName("en.r(I)V")
    public abstract void method171();

    @ObfuscatedName("en.f(B)V")
    public abstract void method173();

    @ObfuscatedName("en.w(I)V")
    public abstract void method239();
}
