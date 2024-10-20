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

@ObfuscatedName("bj")
public abstract class class72 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bj.oo")
    public static class72 field1308 = null;

    @ObfuscatedName("bj.oh")
    public static int field1302 = 0;

    @ObfuscatedName("bj.og")
    public static long field1316 = 0L;

    @ObfuscatedName("bj.ol")
    public static boolean field1303 = false;

    @ObfuscatedName("bj.ok")
    public static int field1306 = 20;

    @ObfuscatedName("bj.ot")
    public static int field1307 = 1;

    @ObfuscatedName("bj.oj")
    public static int field1301 = 0;

    @ObfuscatedName("bj.ow")
    public static long[] field1309 = new long[32];

    @ObfuscatedName("bj.pv")
    public static long[] field1318 = new long[32];

    @ObfuscatedName("bj.pz")
    public static volatile boolean field1311 = true;

    @ObfuscatedName("bj.pw")
    public static int field1312 = 500;

    @ObfuscatedName("bj.pb")
    public static volatile boolean field1313 = false;

    @ObfuscatedName("bj.ph")
    public static volatile long field1314 = 0L;

    @ObfuscatedName("bj.pq")
    public static volatile boolean field1310 = true;

    @ObfuscatedName("bj.or")
    public boolean field1305 = false;

    @ObfuscatedName("bj.og(IIII)V")
    public final void method1416(int arg0, int arg1, int arg2) {
        try {
            if (field1308 != null) {
                field1302++;
                if (field1302 >= 3) {
                    this.method1428("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1308 = this;
            Statics.field786 = arg0;
            Statics.field137 = arg1;
            Statics.field1405 = arg2;
            Statics.field1411 = this;
            if (Statics.field1791 == null) {
                Statics.field1791 = new class73();
            }
            Statics.field1791.method1485(this, 1);
        } catch (Exception var5) {
            class79.method126((String) null, var5);
            this.method1428("crash");
        }
    }

    @ObfuscatedName("bj.ol(B)V")
    public final synchronized void method1417() {
        Container var1;
        if (Statics.field942 == null) {
            var1 = this;
        } else {
            var1 = Statics.field942;
        }
        if (Statics.field1013 != null) {
            Statics.field1013.removeFocusListener(this);
            var1.remove(Statics.field1013);
        }
        Statics.field1013 = new class75(this);
        var1.add(Statics.field1013);
        Statics.field1013.setSize(Statics.field786, Statics.field137);
        Statics.field1013.setVisible(true);
        if (Statics.field942 == null) {
            Statics.field1013.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field942.getInsets();
            Statics.field1013.setLocation(var2.left, var2.top);
        }
        Statics.field1013.addFocusListener(this);
        Statics.field1013.requestFocus();
        field1311 = true;
        field1313 = false;
        field1314 = class120.method8();
    }

    @ObfuscatedName("bj.or(I)Z")
    public final boolean method1418() {
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
                this.method1428("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1335 != null) {
                String var1 = Statics.field1335.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1321;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method1428("wrongjava");
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
                            label227: {
                                char var12 = var6.charAt(var11);
                                if (var11 == 0) {
                                    if (var12 == '-') {
                                        var7 = true;
                                        break label227;
                                    }
                                    if (var12 == '+') {
                                        break label227;
                                    }
                                }
                                int var33;
                                if (var12 >= '0' && var12 <= '9') {
                                    var33 = var12 - '0';
                                } else if (var12 >= 'A' && var12 <= 'Z') {
                                    var33 = var12 - '7';
                                } else {
                                    if (var12 < 'a' || var12 > 'z') {
                                        var13 = false;
                                        break;
                                    }
                                    var33 = var12 - 'W';
                                }
                                if (var33 >= 10) {
                                    var13 = false;
                                    break;
                                }
                                if (var7) {
                                    var33 = -var33;
                                }
                                int var14 = var9 * 10 + var33;
                                if (var14 / 10 != var9) {
                                    var13 = false;
                                    break;
                                }
                                var9 = var14;
                                var8 = true;
                            }
                            var11++;
                        }
                        if (var13 && class146.method32(var6) < 10) {
                            this.method1428("wrongjava");
                            return;
                        }
                    }
                    field1307 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1417();
            int var16 = Statics.field786;
            int var17 = Statics.field137;
            Canvas var18 = Statics.field1013;
            class84 var20;
            try {
                class87 var19 = new class87();
                var19.method1612(var16, var17, var18);
                var20 = var19;
            } catch (Throwable var31) {
                class82 var22 = new class82();
                var22.method1612(var16, var17, var18);
                var20 = var22;
            }
            Statics.field1187 = var20;
            this.method250();
            class67 var23;
            try {
                var23 = new class80();
            } catch (Throwable var30) {
                var23 = new class64();
            }
            Statics.field1256 = var23;
            label126: while (true) {
                class73 var26;
                Canvas var27;
                do {
                    if (field1316 != 0L && class120.method8() >= field1316) {
                        break label126;
                    }
                    Statics.field794 = Statics.field1256.method1338(field1306, field1307);
                    for (int var25 = 0; var25 < Statics.field794; var25++) {
                        this.method1420();
                    }
                    this.method1477();
                    var26 = Statics.field1791;
                    var27 = Statics.field1013;
                } while (var26.field1330 == null);
                for (int var28 = 0; var28 < 50 && var26.field1330.peekEvent() != null; var28++) {
                    class125.method2058(1L);
                }
                if (var27 != null) {
                    var26.field1330.postEvent(new ActionEvent(var27, 1001, "dummy"));
                }
            }
        } catch (Exception var32) {
            class79.method126((String) null, var32);
            this.method1428("crash");
        }
        this.method1423();
    }

    @ObfuscatedName("bj.oq(I)V")
    public void method1420() {
        long var1 = class120.method8();
        long var3 = field1318[Statics.field739];
        field1318[Statics.field739] = var1;
        Statics.field739 = Statics.field739 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field945 = field1310;
        }
        this.method251();
    }

    @ObfuscatedName("bj.ok(I)V")
    public void method1477() {
        long var1 = class120.method8();
        long var3 = field1309[Statics.field1261];
        field1309[Statics.field1261] = var1;
        Statics.field1261 = Statics.field1261 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field1301 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field1312 - 1 > 50) {
            field1312 -= 50;
            field1311 = true;
            Statics.field1013.setSize(Statics.field786, Statics.field137);
            Statics.field1013.setVisible(true);
            if (Statics.field942 == null) {
                Statics.field1013.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field942.getInsets();
                Statics.field1013.setLocation(var6.left, var6.top);
            }
        }
        this.method252();
    }

    @ObfuscatedName("bj.ot(B)V")
    public final synchronized void method1423() {
        if (field1303) {
            return;
        }
        field1303 = true;
        try {
            Statics.field1013.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method253();
        } catch (Exception var7) {
        }
        if (Statics.field942 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1791 != null) {
            try {
                Statics.field1791.method1482();
            } catch (Exception var5) {
            }
        }
        this.method248();
    }

    @ObfuscatedName("ao.oj(I)V")
    public static final void method714() {
        Statics.field1256.method1335();
        for (int var0 = 0; var0 < 32; var0++) {
            field1309[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field1318[var1] = 0L;
        }
        Statics.field794 = 0;
    }

    public void start() {
        if (field1308 == this && !field1303) {
            field1316 = 0L;
        }
    }

    public void stop() {
        if (field1308 == this && !field1303) {
            field1316 = class120.method8() + 4000L;
        }
    }

    public void destroy() {
        if (field1308 == this && !field1303) {
            field1316 = class120.method8();
            class125.method2058(5000L);
            this.method1423();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1308 != this || field1303) {
            return;
        }
        field1311 = true;
        if (Statics.field1321 != null && Statics.field1321.startsWith("1.5") && class120.method8() - field1314 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field786 && var2.height >= Statics.field137) {
                field1313 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1310 = true;
        field1311 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1310 = false;
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

    @ObfuscatedName("db.on(I)V")
    public static final void method2353() {
        Statics.field1030 = null;
        Statics.field198 = null;
        Statics.field331 = null;
    }

    @ObfuscatedName("bj.oi(Ljava/lang/String;I)V")
    public void method1428(String arg0) {
        if (this.field1305) {
            return;
        }
        this.field1305 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    public abstract void init();

    @ObfuscatedName("bj.n(B)V")
    public abstract void method248();

    @ObfuscatedName("bj.o(I)V")
    public abstract void method251();

    @ObfuscatedName("bj.l(I)V")
    public abstract void method252();

    @ObfuscatedName("bj.p(I)V")
    public abstract void method253();

    @ObfuscatedName("bj.i(B)V")
    public abstract void method250();
}
