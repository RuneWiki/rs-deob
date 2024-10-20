package deob;

import java.applet.Applet;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;

@ObfuscatedName("en")
public abstract class class133 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("en.oz")
    public static class133 field2037 = null;

    @ObfuscatedName("en.op")
    public static int field2050 = 0;

    @ObfuscatedName("en.pf")
    public static long field2043 = 0L;

    @ObfuscatedName("en.pe")
    public static boolean field2038 = false;

    @ObfuscatedName("en.pb")
    public static int field2040 = 20;

    @ObfuscatedName("en.pq")
    public static int field2042 = 1;

    @ObfuscatedName("en.pk")
    public static int field2036 = 0;

    @ObfuscatedName("en.pu")
    public static long[] field2041 = new long[32];

    @ObfuscatedName("en.po")
    public static long[] field2044 = new long[32];

    @ObfuscatedName("en.pr")
    public static volatile boolean field2045 = true;

    @ObfuscatedName("en.pw")
    public static int field2046 = 500;

    @ObfuscatedName("en.pt")
    public static volatile boolean field2048 = false;

    @ObfuscatedName("en.pn")
    public static volatile long field2035 = 0L;

    @ObfuscatedName("en.pc")
    public static volatile boolean field2049 = true;

    @ObfuscatedName("en.ps")
    public boolean field2039 = false;

    @ObfuscatedName("en.pw(IIII)V")
    public final void method2622(int arg0, int arg1, int arg2) {
        try {
            if (field2037 != null) {
                field2050++;
                if (field2050 >= 3) {
                    this.method2621("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2037 = this;
            Statics.field130 = arg0;
            Statics.field624 = arg1;
            Statics.field2069 = arg2;
            Statics.field2066 = this;
            if (Statics.field122 == null) {
                Statics.field122 = new class125();
            }
            Statics.field122.method2500(this, 1);
        } catch (Exception var5) {
            class137.method880((String) null, var5);
            this.method2621("crash");
        }
    }

    @ObfuscatedName("en.pt(I)V")
    public final synchronized void method2637() {
        Container var1;
        if (Statics.field154 == null) {
            var1 = this;
        } else {
            var1 = Statics.field154;
        }
        if (Statics.field1007 != null) {
            Statics.field1007.removeFocusListener(this);
            var1.remove(Statics.field1007);
        }
        Statics.field1007 = new class128(this);
        var1.add(Statics.field1007);
        Statics.field1007.setSize(Statics.field130, Statics.field624);
        Statics.field1007.setVisible(true);
        if (Statics.field154 == null) {
            Statics.field1007.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field154.getInsets();
            Statics.field1007.setLocation(var2.left, var2.top);
        }
        Statics.field1007.addFocusListener(this);
        Statics.field1007.requestFocus();
        field2045 = true;
        field2048 = false;
        field2035 = class104.method1388();
    }

    @ObfuscatedName("en.pn(I)Z")
    public final boolean method2624() {
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
                this.method2621("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1943 != null) {
                String var1 = Statics.field1943.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1939;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2621("wrongjava");
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
                            label184: {
                                char var12 = var6.charAt(var11);
                                if (var11 == 0) {
                                    if (var12 == '-') {
                                        var7 = true;
                                        break label184;
                                    }
                                    if (var12 == '+') {
                                        break label184;
                                    }
                                }
                                int var23;
                                if (var12 >= '0' && var12 <= '9') {
                                    var23 = var12 - '0';
                                } else if (var12 >= 'A' && var12 <= 'Z') {
                                    var23 = var12 - '7';
                                } else {
                                    if (var12 < 'a' || var12 > 'z') {
                                        var13 = false;
                                        break;
                                    }
                                    var23 = var12 - 'W';
                                }
                                if (var23 >= 10) {
                                    var13 = false;
                                    break;
                                }
                                if (var7) {
                                    var23 = -var23;
                                }
                                int var14 = var9 * 10 + var23;
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
                            int var16 = class211.method2858(var6, 10, true);
                            if (var16 < 10) {
                                this.method2621("wrongjava");
                                return;
                            }
                        }
                    }
                    field2042 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2637();
            Statics.field1120 = class72.method1799(Statics.field130, Statics.field624, Statics.field1007);
            this.method147();
            class122 var17;
            try {
                var17 = new class136();
            } catch (Throwable var21) {
                var17 = new class130();
            }
            Statics.field1906 = var17;
            while (field2043 == 0L || class104.method1388() < field2043) {
                Statics.field1843 = Statics.field1906.method2465(field2040, field2042);
                for (int var19 = 0; var19 < Statics.field1843; var19++) {
                    this.method2626();
                }
                this.method2663();
                class131.method2723(Statics.field122, Statics.field1007);
            }
        } catch (Exception var22) {
            class137.method880((String) null, var22);
            this.method2621("crash");
        }
        this.method2654();
    }

    @ObfuscatedName("en.pp(I)V")
    public void method2626() {
        long var1 = class104.method1388();
        long var3 = field2044[Statics.field195];
        field2044[Statics.field195] = var1;
        Statics.field195 = Statics.field195 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field578 = field2049;
        }
        this.method184();
    }

    @ObfuscatedName("en.pc(I)V")
    public void method2663() {
        long var1 = class104.method1388();
        long var3 = field2041[Statics.field173];
        field2041[Statics.field173] = var1;
        Statics.field173 = Statics.field173 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field2036 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field2046 - 1 > 50) {
            field2046 -= 50;
            field2045 = true;
            Statics.field1007.setSize(Statics.field130, Statics.field624);
            Statics.field1007.setVisible(true);
            if (Statics.field154 == null) {
                Statics.field1007.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field154.getInsets();
                Statics.field1007.setLocation(var6.left, var6.top);
            }
        }
        this.method402();
    }

    @ObfuscatedName("en.qi(I)V")
    public final synchronized void method2654() {
        if (field2038) {
            return;
        }
        field2038 = true;
        try {
            Statics.field1007.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method150();
        } catch (Exception var7) {
        }
        if (Statics.field154 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field122 != null) {
            try {
                Statics.field122.method2496();
            } catch (Exception var5) {
            }
        }
        this.method155();
    }

    @ObfuscatedName("at.qm(I)V")
    public static final void method529() {
        Statics.field1906.method2467();
        for (int var0 = 0; var0 < 32; var0++) {
            field2041[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2044[var1] = 0L;
        }
        Statics.field1843 = 0;
    }

    public void start() {
        if (field2037 == this && !field2038) {
            field2043 = 0L;
        }
    }

    public void stop() {
        if (field2037 == this && !field2038) {
            field2043 = class104.method1388() + 4000L;
        }
    }

    public void destroy() {
        if (field2037 == this && !field2038) {
            field2043 = class104.method1388();
            class116.method2713(5000L);
            this.method2654();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2037 != this || field2038) {
            return;
        }
        field2045 = true;
        if (Statics.field1939 != null && Statics.field1939.startsWith("1.5") && class104.method1388() - field2035 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field130 && var2.height >= Statics.field624) {
                field2048 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2049 = true;
        field2045 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2049 = false;
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

    @ObfuscatedName("m.qe(B)V")
    public static final void method491() {
        Statics.field74 = null;
        Statics.field2502 = null;
        Statics.field636 = null;
    }

    @ObfuscatedName("en.qo(Ljava/lang/String;I)V")
    public void method2621(String arg0) {
        if (this.field2039) {
            return;
        }
        this.field2039 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("en.r(I)V")
    public abstract void method155();

    public abstract void init();

    @ObfuscatedName("en.k(B)V")
    public abstract void method184();

    @ObfuscatedName("en.v(B)V")
    public abstract void method150();

    @ObfuscatedName("en.g(B)V")
    public abstract void method402();

    @ObfuscatedName("en.b(I)V")
    public abstract void method147();
}
