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
public abstract class class73 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bc.ou")
    public static class73 field1334 = null;

    @ObfuscatedName("bc.ok")
    public static int field1338 = 0;

    @ObfuscatedName("bc.ol")
    public static long field1329 = 0L;

    @ObfuscatedName("bc.os")
    public static boolean field1332 = false;

    @ObfuscatedName("bc.ot")
    public static int field1343 = 20;

    @ObfuscatedName("bc.oq")
    public static int field1335 = 1;

    @ObfuscatedName("bc.of")
    public static int field1336 = 0;

    @ObfuscatedName("bc.oz")
    public static long[] field1337 = new long[32];

    @ObfuscatedName("bc.pn")
    public static long[] field1331 = new long[32];

    @ObfuscatedName("bc.pm")
    public static volatile boolean field1339 = true;

    @ObfuscatedName("bc.pp")
    public static int field1330 = 500;

    @ObfuscatedName("bc.pg")
    public static volatile boolean field1341 = false;

    @ObfuscatedName("bc.pb")
    public static volatile long field1342 = 0L;

    @ObfuscatedName("bc.ph")
    public static volatile boolean field1340 = true;

    @ObfuscatedName("bc.or")
    public boolean field1333 = false;

    @ObfuscatedName("bc.pe(IIII)V")
    public final void method1422(int arg0, int arg1, int arg2) {
        try {
            if (field1334 != null) {
                field1338++;
                if (field1338 >= 3) {
                    this.method1434("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1334 = this;
            Statics.field217 = arg0;
            Statics.field851 = arg1;
            Statics.field82 = arg2;
            Statics.field1425 = this;
            if (Statics.field896 == null) {
                Statics.field896 = new class74();
            }
            Statics.field896.method1512(this, 1);
        } catch (Exception var5) {
            class80.method1544((String) null, var5);
            this.method1434("crash");
        }
    }

    @ObfuscatedName("bc.pm(B)V")
    public final synchronized void method1476() {
        Container var1;
        if (Statics.field1186 == null) {
            var1 = this;
        } else {
            var1 = Statics.field1186;
        }
        if (Statics.field865 != null) {
            Statics.field865.removeFocusListener(this);
            var1.remove(Statics.field865);
        }
        Statics.field865 = new class76(this);
        var1.add(Statics.field865);
        Statics.field865.setSize(Statics.field217, Statics.field851);
        Statics.field865.setVisible(true);
        if (Statics.field1186 == null) {
            Statics.field865.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field1186.getInsets();
            Statics.field865.setLocation(var2.left, var2.top);
        }
        Statics.field865.addFocusListener(this);
        Statics.field865.requestFocus();
        field1339 = true;
        field1341 = false;
        field1342 = class121.method2140();
    }

    @ObfuscatedName("bc.py(I)Z")
    public final boolean method1424() {
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
                this.method1434("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1347 != null) {
                String var1 = Statics.field1347.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1348;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method1434("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class148.method2322(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class148.method2725(var4) && class148.method564(var4) < 10) {
                            this.method1434("wrongjava");
                            return;
                        }
                    }
                    field1335 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1476();
            int var5 = Statics.field217;
            int var6 = Statics.field851;
            Canvas var7 = Statics.field865;
            class85 var9;
            try {
                class88 var8 = new class88();
                var8.method1600(var5, var6, var7);
                var9 = var8;
            } catch (Throwable var17) {
                class83 var11 = new class83();
                var11.method1600(var5, var6, var7);
                var9 = var11;
            }
            Statics.field1287 = var9;
            this.method388();
            class68 var12;
            try {
                var12 = new class81();
            } catch (Throwable var16) {
                var12 = new class65();
            }
            Statics.field252 = var12;
            while (field1329 == 0L || class121.method2140() < field1329) {
                Statics.field2724 = Statics.field252.method1353(field1343, field1335);
                for (int var14 = 0; var14 < Statics.field2724; var14++) {
                    this.method1425();
                }
                this.method1428();
                class69.method653(Statics.field896, Statics.field865);
            }
        } catch (Exception var18) {
            class80.method1544((String) null, var18);
            this.method1434("crash");
        }
        this.method1430();
    }

    @ObfuscatedName("bc.pp(I)V")
    public void method1425() {
        long var1 = class121.method2140();
        long var3 = field1331[Statics.field60];
        field1331[Statics.field60] = var1;
        Statics.field60 = Statics.field60 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field21 = field1340;
        }
        this.method254();
    }

    @ObfuscatedName("bc.pg(I)V")
    public void method1428() {
        long var1 = class121.method2140();
        long var3 = field1337[Statics.field1765];
        field1337[Statics.field1765] = var1;
        Statics.field1765 = Statics.field1765 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field1336 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field1330 - 1 > 50) {
            field1330 -= 50;
            field1339 = true;
            Statics.field865.setSize(Statics.field217, Statics.field851);
            Statics.field865.setVisible(true);
            if (Statics.field1186 == null) {
                Statics.field865.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field1186.getInsets();
                Statics.field865.setLocation(var6.left, var6.top);
            }
        }
        this.method447();
    }

    @ObfuscatedName("bc.pb(B)V")
    public final synchronized void method1430() {
        if (field1332) {
            return;
        }
        field1332 = true;
        try {
            Statics.field865.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method256();
        } catch (Exception var7) {
        }
        if (Statics.field1186 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field896 != null) {
            try {
                Statics.field896.method1488();
            } catch (Exception var5) {
            }
        }
        this.method251();
    }

    public void start() {
        if (field1334 == this && !field1332) {
            field1329 = 0L;
        }
    }

    public void stop() {
        if (field1334 == this && !field1332) {
            field1329 = class121.method2140() + 4000L;
        }
    }

    public void destroy() {
        if (field1334 == this && !field1332) {
            field1329 = class121.method2140();
            class126.method768(5000L);
            this.method1430();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1334 != this || field1332) {
            return;
        }
        field1339 = true;
        if (Statics.field1348 != null && Statics.field1348.startsWith("1.5") && class121.method2140() - field1342 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field217 && var2.height >= Statics.field851) {
                field1341 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1340 = true;
        field1339 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1340 = false;
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

    @ObfuscatedName("ad.ph(ILjava/lang/String;Ljava/awt/Color;I)V")
    public static final void method620(int arg0, String arg1, Color arg2) {
        try {
            Graphics var3 = Statics.field865.getGraphics();
            if (Statics.field947 == null) {
                Statics.field947 = new Font("Helvetica", 1, 13);
                Statics.field1969 = Statics.field865.getFontMetrics(Statics.field947);
            }
            if (field1339) {
                field1339 = false;
                var3.setColor(Color.black);
                var3.fillRect(0, 0, Statics.field217, Statics.field851);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field381 == null) {
                    Statics.field381 = Statics.field865.createImage(304, 34);
                }
                Graphics var4 = Statics.field381.getGraphics();
                var4.setColor(arg2);
                var4.drawRect(0, 0, 303, 33);
                var4.fillRect(2, 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(1, 1, 301, 31);
                var4.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field947);
                var4.setColor(Color.white);
                var4.drawString(arg1, (304 - Statics.field1969.stringWidth(arg1)) / 2, 22);
                var3.drawImage(Statics.field381, Statics.field217 / 2 - 152, Statics.field851 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var6 = Statics.field217 / 2 - 152;
                int var7 = Statics.field851 / 2 - 18;
                var3.setColor(arg2);
                var3.drawRect(var6, var7, 303, 33);
                var3.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var3.setColor(Color.black);
                var3.drawRect(var6 + 1, var7 + 1, 301, 31);
                var3.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var3.setFont(Statics.field947);
                var3.setColor(Color.white);
                var3.drawString(arg1, var6 + (304 - Statics.field1969.stringWidth(arg1)) / 2, var7 + 22);
            }
        } catch (Exception var10) {
            Statics.field865.repaint();
        }
    }

    @ObfuscatedName("bc.pv(Ljava/lang/String;B)V")
    public void method1434(String arg0) {
        if (this.field1333) {
            return;
        }
        this.field1333 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    public abstract void init();

    @ObfuscatedName("bc.t(B)V")
    public abstract void method447();

    @ObfuscatedName("bc.n(B)V")
    public abstract void method256();

    @ObfuscatedName("bc.o(B)V")
    public abstract void method251();

    @ObfuscatedName("bc.q(B)V")
    public abstract void method254();

    @ObfuscatedName("bc.a(I)V")
    public abstract void method388();
}
