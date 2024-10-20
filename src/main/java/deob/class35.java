package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.URL;
import java.util.Iterator;

@ObfuscatedName("aj")
public abstract class class35 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("aj.v")
    public static class35 field217 = null;

    @ObfuscatedName("aj.s")
    public static int field230 = 0;

    @ObfuscatedName("aj.z")
    public static long field208 = 0L;

    @ObfuscatedName("aj.j")
    public static boolean field209 = false;

    @ObfuscatedName("aj.i")
    public boolean field210 = false;

    @ObfuscatedName("aj.l")
    public static int field211 = 20;

    @ObfuscatedName("aj.k")
    public static int field212 = 1;

    @ObfuscatedName("aj.c")
    public static int field213 = 0;

    @ObfuscatedName("aj.m")
    public static long[] field205 = new long[32];

    @ObfuscatedName("aj.h")
    public static long[] field215 = new long[32];

    @ObfuscatedName("aj.o")
    public int field238;

    @ObfuscatedName("aj.u")
    public int field221;

    @ObfuscatedName("aj.a")
    public int field218 = 0;

    @ObfuscatedName("aj.q")
    public int field206 = 0;

    @ObfuscatedName("aj.g")
    public int field225;

    @ObfuscatedName("aj.af")
    public int field222;

    @ObfuscatedName("aj.aa")
    public int field219;

    @ObfuscatedName("aj.ai")
    public int field224;

    @ObfuscatedName("aj.ar")
    public Frame field223;

    @ObfuscatedName("aj.al")
    public Canvas field226;

    @ObfuscatedName("aj.at")
    public volatile boolean field227 = true;

    @ObfuscatedName("aj.ax")
    public static int field228 = 500;

    @ObfuscatedName("aj.az")
    public boolean field214 = false;

    @ObfuscatedName("aj.ap")
    public volatile boolean field216 = false;

    @ObfuscatedName("aj.ay")
    public volatile long field229 = 0L;

    @ObfuscatedName("aj.aq")
    public class22 field232;

    @ObfuscatedName("aj.ak")
    public Clipboard field233;

    @ObfuscatedName("aj.au")
    public final EventQueue field234;

    @ObfuscatedName("aj.ae")
    public static volatile boolean field235 = true;

    @ObfuscatedName("aj.ad")
    public static class26 field237 = new class26();

    @ObfuscatedName("aj.an")
    public static long field231 = -1L;

    @ObfuscatedName("aj.am")
    public static long field239 = -1L;

    public class35() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field234 = var1;
        class23 var3 = new class23();
        Statics.field1782 = var3;
    }

    @ObfuscatedName("aj.j(III)V")
    public final void method490(int arg0, int arg1) {
        if (this.field219 != arg0 || this.field224 != arg1) {
            this.method510();
        }
        this.field219 = arg0;
        this.field224 = arg1;
    }

    @ObfuscatedName("aj.i(Ljava/lang/Object;I)V")
    public final void method491(Object arg0) {
        if (this.field234 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field234.peekEvent() != null; var2++) {
            class288.method3270(1L);
        }
        if (arg0 != null) {
            this.field234.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("aj.n(I)Lfr;")
    public class171 method492() {
        if (this.field232 == null) {
            this.field232 = new class22();
            this.field232.method300(this.field226);
        }
        return this.field232;
    }

    @ObfuscatedName("aj.l(I)V")
    public void method493() {
        this.field233 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("aj.k(Ljava/lang/String;I)V")
    public void method494(String arg0) {
        this.field233.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("aj.c(I)Ljava/awt/datatransfer/Clipboard;")
    public Clipboard method495() {
        return this.field233;
    }

    @ObfuscatedName("aj.r(I)V")
    public final void method542() {
        if (Statics.field1838.toLowerCase().indexOf("microsoft") == -1) {
            class29.field178[44] = 71;
            class29.field178[45] = 26;
            class29.field178[46] = 72;
            class29.field178[47] = 73;
            class29.field178[59] = 57;
            class29.field178[61] = 27;
            class29.field178[91] = 42;
            class29.field178[92] = 74;
            class29.field178[93] = 43;
            class29.field178[192] = 28;
            class29.field178[222] = 58;
            class29.field178[520] = 59;
        } else {
            class29.field178[186] = 57;
            class29.field178[187] = 27;
            class29.field178[188] = 71;
            class29.field178[189] = 26;
            class29.field178[190] = 72;
            class29.field178[191] = 73;
            class29.field178[192] = 58;
            class29.field178[219] = 42;
            class29.field178[220] = 74;
            class29.field178[221] = 43;
            class29.field178[222] = 59;
            class29.field178[223] = 28;
        }
        field237.method347(this.field226);
    }

    @ObfuscatedName("aj.b(B)V")
    public final void method514() {
        field237.method349();
    }

    @ObfuscatedName("aj.m(Lag;II)V")
    public void method498(class30 arg0, int arg1) {
        field237.method345(arg0, arg1);
    }

    @ObfuscatedName("aj.t(I)V")
    public final void method499() {
        Canvas var1 = this.field226;
        var1.addMouseListener(class36.field244);
        var1.addMouseMotionListener(class36.field244);
        var1.addFocusListener(class36.field244);
    }

    @ObfuscatedName("aj.h(I)V")
    public final void method500() {
        Container var1 = this.method523();
        if (var1 == null) {
            return;
        }
        class414 var2 = this.method633();
        this.field238 = Math.max(var2.field4626, this.field225);
        this.field221 = Math.max(var2.field4629, this.field222);
        if (this.field238 <= 0) {
            this.field238 = 1;
        }
        if (this.field221 <= 0) {
            this.field221 = 1;
        }
        Statics.field220 = Math.min(this.field238, this.field219);
        Statics.field1559 = Math.min(this.field221, this.field224);
        this.field218 = (this.field238 - Statics.field220) / 2;
        this.field206 = 0;
        this.field226.setSize(Statics.field220, Statics.field1559);
        Statics.field153 = new class33(Statics.field220, Statics.field1559, this.field226);
        if (this.field223 == var1) {
            Insets var3 = this.field223.getInsets();
            this.field226.setLocation(this.field218 + var3.left, this.field206 + var3.top);
        } else {
            this.field226.setLocation(this.field218, this.field206);
        }
        this.field227 = true;
        this.method603();
    }

    @ObfuscatedName("aj.o(B)V")
    public void method551() {
        int var1 = this.field218;
        int var2 = this.field206;
        int var3 = this.field238 - Statics.field220 - var1;
        int var4 = this.field221 - Statics.field1559 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method523();
            int var6 = 0;
            int var7 = 0;
            if (this.field223 == var5) {
                Insets var8 = this.field223.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field221);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field238, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field238 + var6 - var3, var7, var3, this.field221);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field221 + var7 - var4, this.field238, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("aj.u(I)V")
    public final void method503() {
        field237.method365(this.field226);
        class36.method3418(this.field226);
        if (this.field232 != null) {
            this.field232.method301(this.field226);
        }
        this.method505();
        field237.method347(this.field226);
        Canvas var1 = this.field226;
        var1.addMouseListener(class36.field244);
        var1.addMouseMotionListener(class36.field244);
        var1.addFocusListener(class36.field244);
        if (this.field232 != null) {
            this.field232.method300(this.field226);
        }
        this.method510();
    }

    @ObfuscatedName("aj.x(IIIII)V")
    public final void method504(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (field217 != null) {
                field230++;
                if (field230 >= 3) {
                    this.method522("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field217 = this;
            Statics.field220 = arg0;
            Statics.field1559 = arg1;
            Statics.field5093 = arg2;
            Statics.field5090 = arg3;
            Statics.field5091 = this;
            if (Statics.field207 == null) {
                Statics.field207 = new class168();
            }
            Statics.field207.method3226(this, 1);
        } catch (Exception var6) {
            class500.method2855((String) null, var6);
            this.method522("crash");
        }
    }

    @ObfuscatedName("aj.a(I)V")
    public final synchronized void method505() {
        Container var1 = this.method523();
        if (this.field226 != null) {
            this.field226.removeFocusListener(this);
            var1.remove(this.field226);
        }
        Statics.field220 = Math.max(var1.getWidth(), this.field225);
        Statics.field1559 = Math.max(var1.getHeight(), this.field222);
        if (this.field223 != null) {
            Insets var2 = this.field223.getInsets();
            Statics.field220 -= var2.right + var2.left;
            Statics.field1559 -= var2.top + var2.bottom;
        }
        this.field226 = new class24(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field226);
        this.field226.setSize(Statics.field220, Statics.field1559);
        this.field226.setVisible(true);
        this.field226.setBackground(Color.BLACK);
        if (this.field223 == var1) {
            Insets var3 = this.field223.getInsets();
            this.field226.setLocation(this.field218 + var3.left, this.field206 + var3.top);
        } else {
            this.field226.setLocation(this.field218, this.field206);
        }
        this.field226.addFocusListener(this);
        this.field226.requestFocus();
        this.field227 = true;
        if (Statics.field153 != null && Statics.field220 == Statics.field153.field5013 && Statics.field1559 == Statics.field153.field5014) {
            ((class33) Statics.field153).method466(this.field226);
            Statics.field153.method467(0, 0);
        } else {
            Statics.field153 = new class33(Statics.field220, Statics.field1559, this.field226);
        }
        this.field216 = false;
        this.field229 = class287.method3099();
    }

    @ObfuscatedName("aj.q(I)Z")
    public final boolean method506() {
        String var1 = this.getDocumentBase().getHost().toLowerCase();
        if (var1.equals("jagex.com") || var1.endsWith(".jagex.com")) {
            return true;
        } else if (var1.equals("runescape.com") || var1.endsWith(".runescape.com")) {
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
                this.method522("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1838 != null) {
                String var1 = Statics.field1838.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1837;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method522("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class365.method3873(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class365.method3003(var4) && class365.method4987(var4) < 10) {
                            this.method522("wrongjava");
                            return;
                        }
                    }
                    field212 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method505();
            this.method516();
            Statics.field1908 = class179.method3141();
            while (field208 == 0L || class287.method3099() < field208) {
                Statics.field1057 = Statics.field1908.method3146(field211, field212);
                for (int var5 = 0; var5 < Statics.field1057; var5++) {
                    this.method524();
                }
                this.method636();
                this.method491(this.field226);
            }
        } catch (Exception var7) {
            class500.method2855((String) null, var7);
            this.method522("crash");
        }
        this.method511();
    }

    @ObfuscatedName("aj.d(I)V")
    public void method524() {
        long var1 = class287.method3099();
        long var3 = field215[Statics.field280];
        field215[Statics.field280] = var1;
        Statics.field280 = Statics.field280 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field236 = field235;
        }
        this.method496();
    }

    @ObfuscatedName("aj.e(I)V")
    public void method636() {
        Container var1 = this.method523();
        long var2 = class287.method3099();
        long var4 = field205[Statics.field118];
        field205[Statics.field118] = var2;
        Statics.field118 = Statics.field118 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field213 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field228 - 1 > 50) {
            field228 -= 50;
            this.field227 = true;
            this.field226.setSize(Statics.field220, Statics.field1559);
            this.field226.setVisible(true);
            if (this.field223 == var1) {
                Insets var7 = this.field223.getInsets();
                this.field226.setLocation(this.field218 + var7.left, this.field206 + var7.top);
            } else {
                this.field226.setLocation(this.field218, this.field206);
            }
        }
        if (this.field216) {
            this.method503();
        }
        this.method509();
        this.method518(this.field227);
        if (this.field227) {
            this.method551();
        }
        this.field227 = false;
    }

    @ObfuscatedName("aj.g(I)V")
    public final void method509() {
        class414 var1 = this.method633();
        if (this.field238 != var1.field4626 || this.field221 != var1.field4629 || this.field214) {
            this.method500();
            this.field214 = false;
        }
    }

    @ObfuscatedName("aj.y(I)V")
    public final void method510() {
        this.field214 = true;
    }

    @ObfuscatedName("aj.af(I)V")
    public final synchronized void method511() {
        if (field209) {
            return;
        }
        field209 = true;
        try {
            this.field226.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method519();
        } catch (Exception var7) {
        }
        if (this.field223 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field207 != null) {
            try {
                Statics.field207.method3217();
            } catch (Exception var5) {
            }
        }
        this.method533();
    }

    @ObfuscatedName("gu.aa(I)V")
    public static final void method3810() {
        Statics.field1908.method3151();
        for (int var0 = 0; var0 < 32; var0++) {
            field205[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field215[var1] = 0L;
        }
        Statics.field1057 = 0;
    }

    public final void start() {
        if (field217 == this && !field209) {
            field208 = 0L;
        }
    }

    public final void stop() {
        if (field217 == this && !field209) {
            field208 = class287.method3099() + 4000L;
        }
    }

    public final void destroy() {
        if (field217 == this && !field209) {
            field208 = class287.method3099();
            class288.method3270(5000L);
            this.method511();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field217 != this || field209) {
            return;
        }
        this.field227 = true;
        if (class287.method3099() - this.field229 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field220 && var2.height >= Statics.field1559) {
                this.field216 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field235 = true;
        this.field227 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field235 = false;
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

    @ObfuscatedName("aj.ay(ILjava/lang/String;ZI)V")
    public final void method520(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field226.getGraphics();
            if (Statics.field3 == null) {
                Statics.field3 = new Font("Helvetica", 1, 13);
                Statics.field1762 = this.field226.getFontMetrics(Statics.field3);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field220, Statics.field1559);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field4370 == null) {
                    Statics.field4370 = this.field226.createImage(304, 34);
                }
                Graphics var6 = Statics.field4370.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field3);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field1762.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field4370, Statics.field220 / 2 - 152, Statics.field1559 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field220 / 2 - 152;
                int var9 = Statics.field1559 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field3);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field1762.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field226.repaint();
        }
    }

    @ObfuscatedName("aj.ac(S)V")
    public final void method625() {
        Statics.field4370 = null;
        Statics.field3 = null;
        Statics.field1762 = null;
    }

    @ObfuscatedName("aj.av(Ljava/lang/String;I)V")
    public void method522(String arg0) {
        if (this.field210) {
            return;
        }
        this.field210 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("aj.aq(B)Ljava/awt/Container;")
    public Container method523() {
        return this.field223 == null ? this : this.field223;
    }

    @ObfuscatedName("aj.ak(I)Loj;")
    public class414 method633() {
        Container var1 = this.method523();
        int var2 = Math.max(var1.getWidth(), this.field225);
        int var3 = Math.max(var1.getHeight(), this.field222);
        if (this.field223 != null) {
            Insets var4 = this.field223.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class414(var2, var3);
    }

    @ObfuscatedName("aj.au(I)Z")
    public final boolean method525() {
        return this.field223 != null;
    }

    @ObfuscatedName("ku.ae(I)I")
    public static int method5081() {
        int var0 = 0;
        if (Statics.field81 == null || !Statics.field81.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field81 = var2;
                        field239 = -1L;
                        field231 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field81 != null) {
            long var4 = class287.method3099();
            long var6 = Statics.field81.getCollectionTime();
            if (field231 != -1L) {
                long var8 = var6 - field231;
                long var10 = var4 - field239;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field231 = var6;
            field239 = var4;
        }
        return var0;
    }

    @ObfuscatedName("aj.ax(I)V")
    public abstract void method496();

    @ObfuscatedName("aj.ai(I)V")
    public abstract void method516();

    @ObfuscatedName("aj.az(ZI)V")
    public abstract void method518(boolean arg0);

    @ObfuscatedName("aj.ap(I)V")
    public abstract void method519();

    public abstract void init();

    @ObfuscatedName("aj.ah(I)V")
    public abstract void method533();

    @ObfuscatedName("aj.p(I)V")
    public abstract void method603();
}
