package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
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

@ObfuscatedName("bh")
public abstract class class72 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bh.oj")
    public static class72 field1316 = null;

    @ObfuscatedName("bh.ob")
    public static int field1306 = 0;

    @ObfuscatedName("bh.op")
    public static long field1307 = 0L;

    @ObfuscatedName("bh.om")
    public static boolean field1308 = false;

    @ObfuscatedName("bh.oz")
    public static int field1310 = 20;

    @ObfuscatedName("bh.ol")
    public static int field1311 = 1;

    @ObfuscatedName("bh.ow")
    public static int field1312 = 0;

    @ObfuscatedName("bh.pn")
    public static long[] field1317 = new long[32];

    @ObfuscatedName("bh.pg")
    public static long[] field1313 = new long[32];

    @ObfuscatedName("bh.pb")
    public static volatile boolean field1315 = true;

    @ObfuscatedName("bh.pw")
    public static int field1314 = 500;

    @ObfuscatedName("bh.pv")
    public static volatile boolean field1305 = false;

    @ObfuscatedName("bh.px")
    public static volatile long field1318 = 0L;

    @ObfuscatedName("bh.py")
    public static volatile boolean field1319 = true;

    @ObfuscatedName("bh.oh")
    public boolean field1309 = false;

    @ObfuscatedName("bh.ms(IIII)V")
    public final void method1384(int arg0, int arg1, int arg2) {
        try {
            if (field1316 != null) {
                field1306++;
                if (field1306 >= 3) {
                    this.method1403("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1316 = this;
            Statics.field1278 = arg0;
            Statics.field1254 = arg1;
            Statics.field1415 = arg2;
            Statics.field1422 = this;
            if (Statics.field1175 == null) {
                Statics.field1175 = new class73();
            }
            Statics.field1175.method1458(this, 1);
        } catch (Exception var5) {
            class79.method720((String) null, var5);
            this.method1403("crash");
        }
    }

    @ObfuscatedName("bh.mh(B)V")
    public final synchronized void method1385() {
        Container var1;
        if (Statics.field349 == null) {
            var1 = this;
        } else {
            var1 = Statics.field349;
        }
        if (Statics.field740 != null) {
            Statics.field740.removeFocusListener(this);
            var1.remove(Statics.field740);
        }
        Statics.field740 = new class75(this);
        var1.add(Statics.field740);
        Statics.field740.setSize(Statics.field1278, Statics.field1254);
        Statics.field740.setVisible(true);
        if (Statics.field349 == null) {
            Statics.field740.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field349.getInsets();
            Statics.field740.setLocation(var2.left, var2.top);
        }
        Statics.field740.addFocusListener(this);
        Statics.field740.requestFocus();
        field1315 = true;
        field1305 = false;
        field1318 = class120.method1322();
    }

    @ObfuscatedName("bh.nq(I)Z")
    public final boolean method1389() {
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
                this.method1403("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1331 != null) {
                String var1 = Statics.field1331.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1322;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method1403("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class146.method2154(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class146.method72(var4)) {
                            int var5 = class146.method2641(var4, 10, true);
                            if (var5 < 10) {
                                this.method1403("wrongjava");
                                return;
                            }
                        }
                    }
                    field1311 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1385();
            int var6 = Statics.field1278;
            int var7 = Statics.field1254;
            Canvas var8 = Statics.field740;
            class84 var10;
            try {
                class87 var9 = new class87();
                var9.method1602(var6, var7, var8);
                var10 = var9;
            } catch (Throwable var18) {
                class82 var12 = new class82();
                var12.method1602(var6, var7, var8);
                var10 = var12;
            }
            Statics.field269 = var10;
            this.method248();
            class67 var13;
            try {
                var13 = new class80();
            } catch (Throwable var17) {
                var13 = new class64();
            }
            Statics.field366 = var13;
            while (field1307 == 0L || class120.method1322() < field1307) {
                Statics.field206 = Statics.field366.method1304(field1310, field1311);
                for (int var15 = 0; var15 < Statics.field206; var15++) {
                    this.method1386();
                }
                this.method1387();
                class68.method218(Statics.field1175, Statics.field740);
            }
        } catch (Exception var19) {
            class79.method720((String) null, var19);
            this.method1403("crash");
        }
        this.method1388();
    }

    @ObfuscatedName("bh.ne(I)V")
    public void method1386() {
        long var1 = class120.method1322();
        long var3 = field1313[Statics.field16];
        field1313[Statics.field16] = var1;
        Statics.field16 = Statics.field16 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field93 = field1319;
        }
        this.method249();
    }

    @ObfuscatedName("bh.np(I)V")
    public void method1387() {
        long var1 = class120.method1322();
        long var3 = field1317[Statics.field254];
        field1317[Statics.field254] = var1;
        Statics.field254 = Statics.field254 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field1312 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field1314 - 1 > 50) {
            field1314 -= 50;
            field1315 = true;
            Statics.field740.setSize(Statics.field1278, Statics.field1254);
            Statics.field740.setVisible(true);
            if (Statics.field349 == null) {
                Statics.field740.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field349.getInsets();
                Statics.field740.setLocation(var6.left, var6.top);
            }
        }
        this.method250();
    }

    @ObfuscatedName("bh.nz(I)V")
    public final synchronized void method1388() {
        if (field1308) {
            return;
        }
        field1308 = true;
        try {
            Statics.field740.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method251();
        } catch (Exception var7) {
        }
        if (Statics.field349 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1175 != null) {
            try {
                Statics.field1175.method1455();
            } catch (Exception var5) {
            }
        }
        this.method246();
    }

    @ObfuscatedName("ac.nk(I)V")
    public static final void method606() {
        Statics.field366.method1303();
        for (int var0 = 0; var0 < 32; var0++) {
            field1317[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field1313[var1] = 0L;
        }
        Statics.field206 = 0;
    }

    public void start() {
        if (field1316 == this && !field1308) {
            field1307 = 0L;
        }
    }

    public void stop() {
        if (field1316 == this && !field1308) {
            field1307 = class120.method1322() + 4000L;
        }
    }

    public void destroy() {
        if (field1316 == this && !field1308) {
            field1307 = class120.method1322();
            class125.method123(5000L);
            this.method1388();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1316 != this || field1308) {
            return;
        }
        field1315 = true;
        if (Statics.field1322 != null && Statics.field1322.startsWith("1.5") && class120.method1322() - field1318 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1278 && var2.height >= Statics.field1254) {
                field1305 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1319 = true;
        field1315 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1319 = false;
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

    @ObfuscatedName("bg.nn(ILjava/lang/String;Ljava/awt/Color;I)V")
    public static final void method1311(int arg0, String arg1, Color arg2) {
        try {
            Graphics var3 = Statics.field740.getGraphics();
            if (Statics.field1821 == null) {
                Statics.field1821 = new Font("Helvetica", 1, 13);
                Statics.field747 = Statics.field740.getFontMetrics(Statics.field1821);
            }
            if (field1315) {
                field1315 = false;
                var3.setColor(Color.black);
                var3.fillRect(0, 0, Statics.field1278, Statics.field1254);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field1264 == null) {
                    Statics.field1264 = Statics.field740.createImage(304, 34);
                }
                Graphics var4 = Statics.field1264.getGraphics();
                var4.setColor(arg2);
                var4.drawRect(0, 0, 303, 33);
                var4.fillRect(2, 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(1, 1, 301, 31);
                var4.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1821);
                var4.setColor(Color.white);
                var4.drawString(arg1, (304 - Statics.field747.stringWidth(arg1)) / 2, 22);
                var3.drawImage(Statics.field1264, Statics.field1278 / 2 - 152, Statics.field1254 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var6 = Statics.field1278 / 2 - 152;
                int var7 = Statics.field1254 / 2 - 18;
                var3.setColor(arg2);
                var3.drawRect(var6, var7, 303, 33);
                var3.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var3.setColor(Color.black);
                var3.drawRect(var6 + 1, var7 + 1, 301, 31);
                var3.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var3.setFont(Statics.field1821);
                var3.setColor(Color.white);
                var3.drawString(arg1, var6 + (304 - Statics.field747.stringWidth(arg1)) / 2, var7 + 22);
            }
        } catch (Exception var10) {
            Statics.field740.repaint();
        }
    }

    @ObfuscatedName("bh.nd(Ljava/lang/String;I)V")
    public void method1403(String arg0) {
        if (this.field1309) {
            return;
        }
        this.field1309 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    public abstract void init();

    @ObfuscatedName("bh.k(B)V")
    public abstract void method248();

    @ObfuscatedName("bh.n(I)V")
    public abstract void method250();

    @ObfuscatedName("bh.h(I)V")
    public abstract void method246();

    @ObfuscatedName("bh.c(I)V")
    public abstract void method251();

    @ObfuscatedName("bh.g(B)V")
    public abstract void method249();
}
