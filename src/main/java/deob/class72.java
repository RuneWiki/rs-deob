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

@ObfuscatedName("bc")
public abstract class class72 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bc.ol")
    public static class72 field1309 = null;

    @ObfuscatedName("bc.oe")
    public static int field1313 = 0;

    @ObfuscatedName("bc.oz")
    public static long field1305 = 0L;

    @ObfuscatedName("bc.ot")
    public static boolean field1306 = false;

    @ObfuscatedName("bc.ob")
    public static int field1308 = 20;

    @ObfuscatedName("bc.oq")
    public static int field1303 = 1;

    @ObfuscatedName("bc.ov")
    public static int field1310 = 0;

    @ObfuscatedName("bc.oy")
    public static long[] field1311 = new long[32];

    @ObfuscatedName("bc.pf")
    public static long[] field1304 = new long[32];

    @ObfuscatedName("bc.pq")
    public static volatile boolean field1307 = true;

    @ObfuscatedName("bc.pe")
    public static int field1314 = 500;

    @ObfuscatedName("bc.pv")
    public static volatile boolean field1315 = false;

    @ObfuscatedName("bc.pg")
    public static volatile long field1316 = 0L;

    @ObfuscatedName("bc.pw")
    public static volatile boolean field1317 = true;

    @ObfuscatedName("bc.on")
    public boolean field1312 = false;

    @ObfuscatedName("bc.or(IIII)V")
    public final void method1442(int arg0, int arg1, int arg2) {
        try {
            if (field1309 != null) {
                field1313++;
                if (field1313 >= 3) {
                    this.method1397("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1309 = this;
            Statics.field757 = arg0;
            Statics.field1359 = arg1;
            Statics.field1408 = arg2;
            Statics.field854 = this;
            if (Statics.field16 == null) {
                Statics.field16 = new class73();
            }
            Statics.field16.method1455(this, 1);
        } catch (Exception var5) {
            class79.method2299((String) null, var5);
            this.method1397("crash");
        }
    }

    @ObfuscatedName("bc.oa(B)V")
    public final synchronized void method1388() {
        Container var1;
        if (Statics.field843 == null) {
            var1 = this;
        } else {
            var1 = Statics.field843;
        }
        if (Statics.field1997 != null) {
            Statics.field1997.removeFocusListener(this);
            var1.remove(Statics.field1997);
        }
        Statics.field1997 = new class75(this);
        var1.add(Statics.field1997);
        Statics.field1997.setSize(Statics.field757, Statics.field1359);
        Statics.field1997.setVisible(true);
        if (Statics.field843 == null) {
            Statics.field1997.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field843.getInsets();
            Statics.field1997.setLocation(var2.left, var2.top);
        }
        Statics.field1997.addFocusListener(this);
        Statics.field1997.requestFocus();
        field1307 = true;
        field1315 = false;
        field1316 = class120.method2616();
    }

    @ObfuscatedName("bc.of(B)Z")
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
                this.method1397("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1326 != null) {
                String var1 = Statics.field1326.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1319;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method1397("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class146.method1483(var2.charAt(var3)); var3++) {
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
                            label171: {
                                char var10 = var4.charAt(var9);
                                if (var9 == 0) {
                                    if (var10 == '-') {
                                        var5 = true;
                                        break label171;
                                    }
                                    if (var10 == '+') {
                                        break label171;
                                    }
                                }
                                int var25;
                                if (var10 >= '0' && var10 <= '9') {
                                    var25 = var10 - '0';
                                } else if (var10 >= 'A' && var10 <= 'Z') {
                                    var25 = var10 - '7';
                                } else {
                                    if (var10 < 'a' || var10 > 'z') {
                                        var11 = false;
                                        break;
                                    }
                                    var25 = var10 - 'W';
                                }
                                if (var25 >= 10) {
                                    var11 = false;
                                    break;
                                }
                                if (var5) {
                                    var25 = -var25;
                                }
                                int var12 = var7 * 10 + var25;
                                if (var12 / 10 != var7) {
                                    var11 = false;
                                    break;
                                }
                                var7 = var12;
                                var6 = true;
                            }
                            var9++;
                        }
                        if (var11 && class146.method565(var4) < 10) {
                            this.method1397("wrongjava");
                            return;
                        }
                    }
                    field1303 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1388();
            int var14 = Statics.field757;
            int var15 = Statics.field1359;
            Canvas var16 = Statics.field1997;
            class84 var18;
            try {
                class87 var17 = new class87();
                var17.method1577(var14, var15, var16);
                var18 = var17;
            } catch (Throwable var23) {
                class82 var20 = new class82();
                var20.method1577(var14, var15, var16);
                var18 = var20;
            }
            Statics.field1532 = var18;
            this.method249();
            Statics.field753 = class67.method164();
            while (field1305 == 0L || class120.method2616() < field1305) {
                Statics.field174 = Statics.field753.method1315(field1308, field1303);
                for (int var21 = 0; var21 < Statics.field174; var21++) {
                    this.method1399();
                }
                this.method1390();
                class68.method1486(Statics.field16, Statics.field1997);
            }
        } catch (Exception var24) {
            class79.method2299((String) null, var24);
            this.method1397("crash");
        }
        this.method1391();
    }

    @ObfuscatedName("bc.ol(I)V")
    public void method1399() {
        long var1 = class120.method2616();
        long var3 = field1304[Statics.field1243];
        field1304[Statics.field1243] = var1;
        Statics.field1243 = Statics.field1243 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field66 = field1317;
        }
        this.method454();
    }

    @ObfuscatedName("bc.oe(I)V")
    public void method1390() {
        long var1 = class120.method2616();
        long var3 = field1311[Statics.field737];
        field1311[Statics.field737] = var1;
        Statics.field737 = Statics.field737 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field1310 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field1314 - 1 > 50) {
            field1314 -= 50;
            field1307 = true;
            Statics.field1997.setSize(Statics.field757, Statics.field1359);
            Statics.field1997.setVisible(true);
            if (Statics.field843 == null) {
                Statics.field1997.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field843.getInsets();
                Statics.field1997.setLocation(var6.left, var6.top);
            }
        }
        this.method251();
    }

    @ObfuscatedName("bc.oz(B)V")
    public final synchronized void method1391() {
        if (field1306) {
            return;
        }
        field1306 = true;
        try {
            Statics.field1997.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method392();
        } catch (Exception var7) {
        }
        if (Statics.field843 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field16 != null) {
            try {
                Statics.field16.method1475();
            } catch (Exception var5) {
            }
        }
        this.method246();
    }

    @ObfuscatedName("z.ot(I)V")
    public static final void method23() {
        Statics.field753.method1314();
        for (int var0 = 0; var0 < 32; var0++) {
            field1311[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field1304[var1] = 0L;
        }
        Statics.field174 = 0;
    }

    public void start() {
        if (field1309 == this && !field1306) {
            field1305 = 0L;
        }
    }

    public void stop() {
        if (field1309 == this && !field1306) {
            field1305 = class120.method2616() + 4000L;
        }
    }

    public void destroy() {
        if (field1309 == this && !field1306) {
            field1305 = class120.method2616();
            class125.method112(5000L);
            this.method1391();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1309 != this || field1306) {
            return;
        }
        field1307 = true;
        if (Statics.field1319 != null && Statics.field1319.startsWith("1.5") && class120.method2616() - field1316 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field757 && var2.height >= Statics.field1359) {
                field1315 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1317 = true;
        field1307 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1317 = false;
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

    @ObfuscatedName("ai.on(ILjava/lang/String;Ljava/awt/Color;B)V")
    public static final void method854(int arg0, String arg1, Color arg2) {
        try {
            Graphics var3 = Statics.field1997.getGraphics();
            if (Statics.field2023 == null) {
                Statics.field2023 = new Font("Helvetica", 1, 13);
                Statics.field1964 = Statics.field1997.getFontMetrics(Statics.field2023);
            }
            if (field1307) {
                field1307 = false;
                var3.setColor(Color.black);
                var3.fillRect(0, 0, Statics.field757, Statics.field1359);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field1008 == null) {
                    Statics.field1008 = Statics.field1997.createImage(304, 34);
                }
                Graphics var4 = Statics.field1008.getGraphics();
                var4.setColor(arg2);
                var4.drawRect(0, 0, 303, 33);
                var4.fillRect(2, 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(1, 1, 301, 31);
                var4.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field2023);
                var4.setColor(Color.white);
                var4.drawString(arg1, (304 - Statics.field1964.stringWidth(arg1)) / 2, 22);
                var3.drawImage(Statics.field1008, Statics.field757 / 2 - 152, Statics.field1359 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var6 = Statics.field757 / 2 - 152;
                int var7 = Statics.field1359 / 2 - 18;
                var3.setColor(arg2);
                var3.drawRect(var6, var7, 303, 33);
                var3.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var3.setColor(Color.black);
                var3.drawRect(var6 + 1, var7 + 1, 301, 31);
                var3.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var3.setFont(Statics.field2023);
                var3.setColor(Color.white);
                var3.drawString(arg1, var6 + (304 - Statics.field1964.stringWidth(arg1)) / 2, var7 + 22);
            }
        } catch (Exception var10) {
            Statics.field1997.repaint();
        }
    }

    @ObfuscatedName("bc.oh(Ljava/lang/String;I)V")
    public void method1397(String arg0) {
        if (this.field1312) {
            return;
        }
        this.field1312 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    public abstract void init();

    @ObfuscatedName("bc.s(I)V")
    public abstract void method249();

    @ObfuscatedName("bc.g(I)V")
    public abstract void method251();

    @ObfuscatedName("bc.z(B)V")
    public abstract void method246();

    @ObfuscatedName("bc.i(B)V")
    public abstract void method454();

    @ObfuscatedName("bc.q(I)V")
    public abstract void method392();
}
