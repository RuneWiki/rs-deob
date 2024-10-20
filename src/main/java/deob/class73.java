package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;

@ObfuscatedName("bl")
public abstract class class73 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bl.ol")
    public static class73 field1326 = null;

    @ObfuscatedName("bl.ow")
    public static int field1320 = 0;

    @ObfuscatedName("bl.ox")
    public static long field1324 = 0L;

    @ObfuscatedName("bl.on")
    public static boolean field1321 = false;

    @ObfuscatedName("bl.oy")
    public static int field1325 = 20;

    @ObfuscatedName("bl.ot")
    public static int field1332 = 1;

    @ObfuscatedName("bl.oc")
    public static int field1318 = 0;

    @ObfuscatedName("bl.pr")
    public static long[] field1330 = new long[32];

    @ObfuscatedName("bl.po")
    public static long[] field1327 = new long[32];

    @ObfuscatedName("bl.pz")
    public static volatile boolean field1328 = true;

    @ObfuscatedName("bl.pi")
    public static int field1329 = 500;

    @ObfuscatedName("bl.pk")
    public static volatile boolean field1323 = false;

    @ObfuscatedName("bl.pq")
    public static volatile long field1331 = 0L;

    @ObfuscatedName("bl.pw")
    public static volatile boolean field1319 = true;

    @ObfuscatedName("bl.or")
    public boolean field1322 = false;

    @ObfuscatedName("bl.nw(IIIB)V")
    public final void method1407(int arg0, int arg1, int arg2) {
        try {
            if (field1326 != null) {
                field1320++;
                if (field1320 >= 3) {
                    this.method1399("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1326 = this;
            Statics.field183 = arg0;
            Statics.field780 = arg1;
            Statics.field1421 = arg2;
            Statics.field2458 = this;
            if (Statics.field2703 == null) {
                Statics.field2703 = new class74();
            }
            Statics.field2703.method1454(this, 1);
        } catch (Exception var5) {
            class80.method1333((String) null, var5);
            this.method1399("crash");
        }
    }

    @ObfuscatedName("bl.nh(B)V")
    public final synchronized void method1445() {
        Container var1;
        if (Statics.field1057 == null) {
            var1 = this;
        } else {
            var1 = Statics.field1057;
        }
        if (Statics.field13 != null) {
            Statics.field13.removeFocusListener(this);
            var1.remove(Statics.field13);
        }
        Statics.field13 = new class76(this);
        var1.add(Statics.field13);
        Statics.field13.setSize(Statics.field183, Statics.field780);
        Statics.field13.setVisible(true);
        if (Statics.field1057 == null) {
            Statics.field13.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field1057.getInsets();
            Statics.field13.setLocation(var2.left, var2.top);
        }
        Statics.field13.addFocusListener(this);
        Statics.field13.requestFocus();
        field1328 = true;
        field1323 = false;
        field1331 = class121.method245();
    }

    @ObfuscatedName("bl.np(I)Z")
    public final boolean method1390() {
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
                this.method1399("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1351 != null) {
                String var1 = Statics.field1351.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1336;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method1399("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class147.method793(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class147.method1301(var4)) {
                            int var5 = class147.method1346(var4, 10, true);
                            if (var5 < 10) {
                                this.method1399("wrongjava");
                                return;
                            }
                        }
                    }
                    field1332 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1445();
            Statics.field1552 = class85.method195(Statics.field183, Statics.field780, Statics.field13);
            this.method280();
            class68 var6;
            try {
                var6 = new class81();
            } catch (Throwable var13) {
                var6 = new class65();
            }
            Statics.field355 = var6;
            label85: while (true) {
                class74 var9;
                Canvas var10;
                do {
                    if (field1324 != 0L && class121.method245() >= field1324) {
                        break label85;
                    }
                    Statics.field1294 = Statics.field355.method1328(field1325, field1332);
                    for (int var8 = 0; var8 < Statics.field1294; var8++) {
                        this.method1391();
                    }
                    this.method1392();
                    var9 = Statics.field2703;
                    var10 = Statics.field13;
                } while (var9.field1342 == null);
                for (int var11 = 0; var11 < 50 && var9.field1342.peekEvent() != null; var11++) {
                    class126.method164(1L);
                }
                if (var10 != null) {
                    var9.field1342.postEvent(new ActionEvent(var10, 1001, "dummy"));
                }
            }
        } catch (Exception var14) {
            class80.method1333((String) null, var14);
            this.method1399("crash");
        }
        this.method1393();
    }

    @ObfuscatedName("bl.ns(I)V")
    public void method1391() {
        long var1 = class121.method245();
        long var3 = field1327[Statics.field755];
        field1327[Statics.field755] = var1;
        Statics.field755 = Statics.field755 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field185 = field1319;
        }
        this.method480();
    }

    @ObfuscatedName("bl.nv(I)V")
    public void method1392() {
        long var1 = class121.method245();
        long var3 = field1330[Statics.field912];
        field1330[Statics.field912] = var1;
        Statics.field912 = Statics.field912 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field1318 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field1329 - 1 > 50) {
            field1329 -= 50;
            field1328 = true;
            Statics.field13.setSize(Statics.field183, Statics.field780);
            Statics.field13.setVisible(true);
            if (Statics.field1057 == null) {
                Statics.field13.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field1057.getInsets();
                Statics.field13.setLocation(var6.left, var6.top);
            }
        }
        this.method282();
    }

    @ObfuscatedName("bl.nm(I)V")
    public final synchronized void method1393() {
        if (field1321) {
            return;
        }
        field1321 = true;
        try {
            Statics.field13.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method283();
        } catch (Exception var7) {
        }
        if (Statics.field1057 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field2703 != null) {
            try {
                Statics.field2703.method1453();
            } catch (Exception var5) {
            }
        }
        this.method448();
    }

    @ObfuscatedName("i.nx(I)V")
    public static final void method256() {
        Statics.field355.method1327();
        for (int var0 = 0; var0 < 32; var0++) {
            field1330[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field1327[var1] = 0L;
        }
        Statics.field1294 = 0;
    }

    public void start() {
        if (field1326 == this && !field1321) {
            field1324 = 0L;
        }
    }

    public void stop() {
        if (field1326 == this && !field1321) {
            field1324 = class121.method245() + 4000L;
        }
    }

    public void destroy() {
        if (field1326 == this && !field1321) {
            field1324 = class121.method245();
            class126.method164(5000L);
            this.method1393();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1326 != this || field1321) {
            return;
        }
        field1328 = true;
        if (Statics.field1336 != null && Statics.field1336.startsWith("1.5") && class121.method245() - field1331 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field183 && var2.height >= Statics.field780) {
                field1323 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1319 = true;
        field1328 = true;
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

    @ObfuscatedName("bl.nq(Ljava/lang/String;I)V")
    public void method1399(String arg0) {
        if (this.field1322) {
            return;
        }
        this.field1322 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bl.o(B)V")
    public abstract void method280();

    @ObfuscatedName("bl.l(B)V")
    public abstract void method480();

    @ObfuscatedName("bl.r(I)V")
    public abstract void method448();

    @ObfuscatedName("bl.t(I)V")
    public abstract void method282();

    public abstract void init();

    @ObfuscatedName("bl.q(I)V")
    public abstract void method283();
}
