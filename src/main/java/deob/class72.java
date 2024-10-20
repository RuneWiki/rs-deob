package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
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

@ObfuscatedName("bn")
public abstract class class72 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bn.ox")
    public static class72 field1314 = null;

    @ObfuscatedName("bn.ou")
    public static int field1313 = 0;

    @ObfuscatedName("bn.or")
    public static long field1328 = 0L;

    @ObfuscatedName("bn.ob")
    public static boolean field1315 = false;

    @ObfuscatedName("bn.om")
    public static int field1316 = 20;

    @ObfuscatedName("bn.oa")
    public static int field1318 = 1;

    @ObfuscatedName("bn.oe")
    public static int field1319 = 0;

    @ObfuscatedName("bn.oj")
    public static long[] field1320 = new long[32];

    @ObfuscatedName("bn.pa")
    public static long[] field1321 = new long[32];

    @ObfuscatedName("bn.py")
    public static volatile boolean field1322 = true;

    @ObfuscatedName("bn.pp")
    public static int field1323 = 500;

    @ObfuscatedName("bn.pk")
    public static volatile boolean field1324 = false;

    @ObfuscatedName("bn.pf")
    public static volatile long field1325 = 0L;

    @ObfuscatedName("bn.pb")
    public static volatile boolean field1326 = true;

    @ObfuscatedName("bn.ow")
    public boolean field1317 = false;

    @ObfuscatedName("bn.pz(IIII)V")
    public final void method1402(int arg0, int arg1, int arg2) {
        try {
            if (field1314 != null) {
                field1313++;
                if (field1313 >= 3) {
                    this.method1414("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1314 = this;
            Statics.field2637 = arg0;
            Statics.field2481 = arg1;
            Statics.field1412 = arg2;
            Statics.field1414 = this;
            if (Statics.field1445 == null) {
                Statics.field1445 = new class73();
            }
            Statics.field1445.method1475(this, 1);
        } catch (Exception var5) {
            class79.method218((String) null, var5);
            this.method1414("crash");
        }
    }

    @ObfuscatedName("bn.pq(I)V")
    public final synchronized void method1423() {
        Container var1;
        if (Statics.field1382 == null) {
            var1 = this;
        } else {
            var1 = Statics.field1382;
        }
        if (Statics.field1780 != null) {
            Statics.field1780.removeFocusListener(this);
            var1.remove(Statics.field1780);
        }
        Statics.field1780 = new class75(this);
        var1.add(Statics.field1780);
        Statics.field1780.setSize(Statics.field2637, Statics.field2481);
        Statics.field1780.setVisible(true);
        if (Statics.field1382 == null) {
            Statics.field1780.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field1382.getInsets();
            Statics.field1780.setLocation(var2.left, var2.top);
        }
        Statics.field1780.addFocusListener(this);
        Statics.field1780.requestFocus();
        field1322 = true;
        field1324 = false;
        field1325 = class120.method228();
    }

    @ObfuscatedName("bn.pg(I)Z")
    public final boolean method1404() {
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
                this.method1414("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2638 != null) {
                String var1 = Statics.field2638.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1334;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method1414("wrongjava");
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
                            label208: {
                                char var12 = var6.charAt(var11);
                                if (var11 == 0) {
                                    if (var12 == '-') {
                                        var7 = true;
                                        break label208;
                                    }
                                    if (var12 == '+') {
                                        break label208;
                                    }
                                }
                                int var31;
                                if (var12 >= '0' && var12 <= '9') {
                                    var31 = var12 - '0';
                                } else if (var12 >= 'A' && var12 <= 'Z') {
                                    var31 = var12 - '7';
                                } else {
                                    if (var12 < 'a' || var12 > 'z') {
                                        var13 = false;
                                        break;
                                    }
                                    var31 = var12 - 'W';
                                }
                                if (var31 >= 10) {
                                    var13 = false;
                                    break;
                                }
                                if (var7) {
                                    var31 = -var31;
                                }
                                int var14 = var9 * 10 + var31;
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
                            int var16 = class146.method1531(var6, 10, true);
                            if (var16 < 10) {
                                this.method1414("wrongjava");
                                return;
                            }
                        }
                    }
                    field1318 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1423();
            int var17 = Statics.field2637;
            int var18 = Statics.field2481;
            Canvas var19 = Statics.field1780;
            class84 var21;
            try {
                class87 var20 = new class87();
                var20.method1620(var17, var18, var19);
                var21 = var20;
            } catch (Throwable var29) {
                class82 var23 = new class82();
                var23.method1620(var17, var18, var19);
                var21 = var23;
            }
            Statics.field87 = var21;
            this.method354();
            Statics.field245 = class67.method39();
            label118: while (true) {
                class73 var25;
                Canvas var26;
                do {
                    if (field1328 != 0L && class120.method228() >= field1328) {
                        break label118;
                    }
                    Statics.field1506 = Statics.field245.method1331(field1316, field1318);
                    for (int var24 = 0; var24 < Statics.field1506; var24++) {
                        this.method1406();
                    }
                    this.method1407();
                    var25 = Statics.field1445;
                    var26 = Statics.field1780;
                } while (var25.field1329 == null);
                for (int var27 = 0; var27 < 50 && var25.field1329.peekEvent() != null; var27++) {
                    class125.method2379(1L);
                }
                if (var26 != null) {
                    var25.field1329.postEvent(new ActionEvent(var26, 1001, "dummy"));
                }
            }
        } catch (Exception var30) {
            class79.method218((String) null, var30);
            this.method1414("crash");
        }
        this.method1408();
    }

    @ObfuscatedName("bn.pj(I)V")
    public void method1406() {
        long var1 = class120.method228();
        long var3 = field1321[Statics.field208];
        field1321[Statics.field208] = var1;
        Statics.field208 = Statics.field208 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field2279 = field1326;
        }
        this.method257();
    }

    @ObfuscatedName("bn.po(I)V")
    public void method1407() {
        long var1 = class120.method228();
        long var3 = field1320[Statics.field311];
        field1320[Statics.field311] = var1;
        Statics.field311 = Statics.field311 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field1319 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field1323 - 1 > 50) {
            field1323 -= 50;
            field1322 = true;
            Statics.field1780.setSize(Statics.field2637, Statics.field2481);
            Statics.field1780.setVisible(true);
            if (Statics.field1382 == null) {
                Statics.field1780.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field1382.getInsets();
                Statics.field1780.setLocation(var6.left, var6.top);
            }
        }
        this.method274();
    }

    @ObfuscatedName("bn.py(I)V")
    public final synchronized void method1408() {
        if (field1315) {
            return;
        }
        field1315 = true;
        try {
            Statics.field1780.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method259();
        } catch (Exception var7) {
        }
        if (Statics.field1382 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1445 != null) {
            try {
                Statics.field1445.method1473();
            } catch (Exception var5) {
            }
        }
        this.method254();
    }

    public void start() {
        if (field1314 == this && !field1315) {
            field1328 = 0L;
        }
    }

    public void stop() {
        if (field1314 == this && !field1315) {
            field1328 = class120.method228() + 4000L;
        }
    }

    public void destroy() {
        if (field1314 == this && !field1315) {
            field1328 = class120.method228();
            class125.method2379(5000L);
            this.method1408();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1314 != this || field1315) {
            return;
        }
        field1322 = true;
        if (Statics.field1334 != null && Statics.field1334.startsWith("1.5") && class120.method228() - field1325 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field2637 && var2.height >= Statics.field2481) {
                field1324 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1326 = true;
        field1322 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1326 = false;
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

    @ObfuscatedName("bo.pi(ILjava/lang/String;Ljava/awt/Color;I)V")
    public static final void method1391(int arg0, String arg1, Color arg2) {
        try {
            Graphics var3 = Statics.field1780.getGraphics();
            if (Statics.field946 == null) {
                Statics.field946 = new Font("Helvetica", 1, 13);
                Statics.field957 = Statics.field1780.getFontMetrics(Statics.field946);
            }
            if (field1322) {
                field1322 = false;
                var3.setColor(Color.black);
                var3.fillRect(0, 0, Statics.field2637, Statics.field2481);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field1664 == null) {
                    Statics.field1664 = Statics.field1780.createImage(304, 34);
                }
                Graphics var4 = Statics.field1664.getGraphics();
                var4.setColor(arg2);
                var4.drawRect(0, 0, 303, 33);
                var4.fillRect(2, 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(1, 1, 301, 31);
                var4.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field946);
                var4.setColor(Color.white);
                var4.drawString(arg1, (304 - Statics.field957.stringWidth(arg1)) / 2, 22);
                var3.drawImage(Statics.field1664, Statics.field2637 / 2 - 152, Statics.field2481 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var6 = Statics.field2637 / 2 - 152;
                int var7 = Statics.field2481 / 2 - 18;
                var3.setColor(arg2);
                var3.drawRect(var6, var7, 303, 33);
                var3.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var3.setColor(Color.black);
                var3.drawRect(var6 + 1, var7 + 1, 301, 31);
                var3.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var3.setFont(Statics.field946);
                var3.setColor(Color.white);
                var3.drawString(arg1, var6 + (304 - Statics.field957.stringWidth(arg1)) / 2, var7 + 22);
            }
        } catch (Exception var10) {
            Statics.field1780.repaint();
        }
    }

    @ObfuscatedName("h.pp(I)V")
    public static final void method12() {
        Statics.field1664 = null;
        Statics.field946 = null;
        Statics.field957 = null;
    }

    @ObfuscatedName("bn.pk(Ljava/lang/String;B)V")
    public void method1414(String arg0) {
        if (this.field1317) {
            return;
        }
        this.field1317 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bn.b(I)V")
    public abstract void method259();

    @ObfuscatedName("bn.l(I)V")
    public abstract void method254();

    public abstract void init();

    @ObfuscatedName("bn.g(B)V")
    public abstract void method354();

    @ObfuscatedName("bn.o(I)V")
    public abstract void method274();

    @ObfuscatedName("bn.t(B)V")
    public abstract void method257();
}
