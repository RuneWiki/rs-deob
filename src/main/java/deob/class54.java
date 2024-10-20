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

@ObfuscatedName("bw")
public abstract class class54 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bw.j")
    public static class54 field413 = null;

    @ObfuscatedName("bw.i")
    public static int field431 = 0;

    @ObfuscatedName("bw.k")
    public static long field415 = 0L;

    @ObfuscatedName("bw.u")
    public static boolean field416 = false;

    @ObfuscatedName("bw.n")
    public boolean field417 = false;

    @ObfuscatedName("bw.q")
    public static int field448 = 20;

    @ObfuscatedName("bw.d")
    public static int field420 = 1;

    @ObfuscatedName("bw.f")
    public static int field421 = 0;

    @ObfuscatedName("bw.p")
    public static long[] field424 = new long[32];

    @ObfuscatedName("bw.g")
    public static long[] field418 = new long[32];

    @ObfuscatedName("bw.z")
    public int field449;

    @ObfuscatedName("bw.a")
    public int field427;

    @ObfuscatedName("bw.l")
    public int field445 = 0;

    @ObfuscatedName("bw.h")
    public int field412 = 0;

    @ObfuscatedName("bw.o")
    public int field430;

    @ObfuscatedName("bw.av")
    public int field429;

    @ObfuscatedName("bw.am")
    public int field432;

    @ObfuscatedName("bw.ai")
    public int field433;

    @ObfuscatedName("bw.aj")
    public Frame field434;

    @ObfuscatedName("bw.an")
    public Canvas field428;

    @ObfuscatedName("bw.at")
    public volatile boolean field436 = true;

    @ObfuscatedName("bw.ak")
    public static int field437 = 500;

    @ObfuscatedName("bw.ao")
    public boolean field438 = false;

    @ObfuscatedName("bw.ac")
    public volatile boolean field439 = false;

    @ObfuscatedName("bw.ar")
    public volatile long field425 = 0L;

    @ObfuscatedName("bw.ag")
    public class45 field435;

    @ObfuscatedName("bw.aa")
    public Clipboard field442;

    @ObfuscatedName("bw.ap")
    public final EventQueue field443;

    @ObfuscatedName("bw.aq")
    public static volatile boolean field444 = true;

    @ObfuscatedName("bw.al")
    public static long field419 = -1L;

    @ObfuscatedName("bw.ah")
    public static long field446 = -1L;

    public class54() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field443 = var1;
        class106.method2709(new class47());
    }

    @ObfuscatedName("bw.n(III)V")
    public final void method740(int arg0, int arg1) {
        if (this.field432 != arg0 || this.field433 != arg1) {
            this.method757();
        }
        this.field432 = arg0;
        this.field433 = arg1;
    }

    @ObfuscatedName("bw.t(Ljava/lang/Object;I)V")
    public final void method741(Object arg0) {
        if (this.field443 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field443.peekEvent() != null; var2++) {
            class298.method4739(1L);
        }
        if (arg0 != null) {
            this.field443.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bw.q(B)Lfo;")
    public class169 method742() {
        if (this.field435 == null) {
            this.field435 = new class45();
            this.field435.method640(this.field428);
        }
        return this.field435;
    }

    @ObfuscatedName("bw.x(B)V")
    public void method743() {
        this.field442 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bw.d(Ljava/lang/String;I)V")
    public void method876(String arg0) {
        this.field442.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bw.f(I)V")
    public final void method753() {
        if (Statics.field2021.toLowerCase().indexOf("microsoft") == -1) {
            class46.field368[44] = 71;
            class46.field368[45] = 26;
            class46.field368[46] = 72;
            class46.field368[47] = 73;
            class46.field368[59] = 57;
            class46.field368[61] = 27;
            class46.field368[91] = 42;
            class46.field368[92] = 74;
            class46.field368[93] = 43;
            class46.field368[192] = 28;
            class46.field368[222] = 58;
            class46.field368[520] = 59;
        } else {
            class46.field368[186] = 57;
            class46.field368[187] = 27;
            class46.field368[188] = 71;
            class46.field368[189] = 26;
            class46.field368[190] = 72;
            class46.field368[191] = 73;
            class46.field368[192] = 58;
            class46.field368[219] = 42;
            class46.field368[220] = 74;
            class46.field368[221] = 43;
            class46.field368[222] = 59;
            class46.field368[223] = 28;
        }
        Canvas var1 = this.field428;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class46.field367);
        var1.addFocusListener(class46.field367);
    }

    @ObfuscatedName("bw.c(I)V")
    public final void method796() {
        class55.method1936(this.field428);
    }

    @ObfuscatedName("bw.r(I)V")
    public final void method746() {
        Container var1 = this.method770();
        if (var1 == null) {
            return;
        }
        class319 var2 = this.method771();
        this.field449 = Math.max(var2.field3842, this.field430);
        this.field427 = Math.max(var2.field3840, this.field429);
        if (this.field449 <= 0) {
            this.field449 = 1;
        }
        if (this.field427 <= 0) {
            this.field427 = 1;
        }
        Statics.field3255 = Math.min(this.field449, this.field432);
        Statics.field256 = Math.min(this.field427, this.field433);
        this.field445 = (this.field449 - Statics.field3255) / 2;
        this.field412 = 0;
        this.field428.setSize(Statics.field3255, Statics.field256);
        Statics.field3235 = new class53(Statics.field3255, Statics.field256, this.field428);
        if (this.field434 == var1) {
            Insets var3 = this.field434.getInsets();
            this.field428.setLocation(this.field445 + var3.left, this.field412 + var3.top);
        } else {
            this.field428.setLocation(this.field445, this.field412);
        }
        this.field436 = true;
        this.method747();
    }

    @ObfuscatedName("bw.w(I)V")
    public void method748() {
        int var1 = this.field445;
        int var2 = this.field412;
        int var3 = this.field449 - Statics.field3255 - var1;
        int var4 = this.field427 - Statics.field256 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method770();
            int var6 = 0;
            int var7 = 0;
            if (this.field434 == var5) {
                Insets var8 = this.field434.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field427);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field449, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field449 + var6 - var3, var7, var3, this.field427);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field427 + var7 - var4, this.field449, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bw.l(I)V")
    public final void method749() {
        class46.method4107(this.field428);
        class55.method3380(this.field428);
        if (this.field435 != null) {
            this.field435.method644(this.field428);
        }
        this.method751();
        Canvas var1 = this.field428;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class46.field367);
        var1.addFocusListener(class46.field367);
        Canvas var2 = this.field428;
        var2.addMouseListener(class55.field453);
        var2.addMouseMotionListener(class55.field453);
        var2.addFocusListener(class55.field453);
        if (this.field435 != null) {
            this.field435.method640(this.field428);
        }
        this.method757();
    }

    @ObfuscatedName("bw.h(IIIB)V")
    public final void method811(int arg0, int arg1, int arg2) {
        try {
            if (field413 != null) {
                field431++;
                if (field431 >= 3) {
                    this.method813("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field413 = this;
            Statics.field3255 = arg0;
            Statics.field256 = arg1;
            Statics.field2486 = arg2;
            Statics.field4045 = this;
            if (Statics.field441 == null) {
                Statics.field441 = new class167();
            }
            Statics.field441.method3192(this, 1);
        } catch (Exception var5) {
            class341.method40((String) null, var5);
            this.method813("crash");
        }
    }

    @ObfuscatedName("bw.v(I)V")
    public final synchronized void method751() {
        Container var1 = this.method770();
        if (this.field428 != null) {
            this.field428.removeFocusListener(this);
            var1.remove(this.field428);
        }
        Statics.field3255 = Math.max(var1.getWidth(), this.field430);
        Statics.field256 = Math.max(var1.getHeight(), this.field429);
        if (this.field434 != null) {
            Insets var2 = this.field434.getInsets();
            Statics.field3255 -= var2.right + var2.left;
            Statics.field256 -= var2.top + var2.bottom;
        }
        this.field428 = new class49(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field428);
        this.field428.setSize(Statics.field3255, Statics.field256);
        this.field428.setVisible(true);
        this.field428.setBackground(Color.BLACK);
        if (this.field434 == var1) {
            Insets var3 = this.field434.getInsets();
            this.field428.setLocation(this.field445 + var3.left, this.field412 + var3.top);
        } else {
            this.field428.setLocation(this.field445, this.field412);
        }
        this.field428.addFocusListener(this);
        this.field428.requestFocus();
        this.field436 = true;
        if (Statics.field3235 != null && Statics.field3255 == Statics.field3235.field3855 && Statics.field256 == Statics.field3235.field3857) {
            ((class53) Statics.field3235).method725(this.field428);
            Statics.field3235.method729(0, 0);
        } else {
            Statics.field3235 = new class53(Statics.field3255, Statics.field256, this.field428);
        }
        this.field439 = false;
        this.field425 = class297.method4369();
    }

    @ObfuscatedName("bw.m(I)Z")
    public final boolean method752() {
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
                this.method813("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2021 != null) {
                String var1 = Statics.field2021.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2015;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method813("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class291.method3927(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class291.method3195(var4) && class291.method3042(var4) < 10) {
                            this.method813("wrongjava");
                            return;
                        }
                    }
                    field420 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method751();
            this.method763();
            Statics.field422 = class171.method5471();
            while (field415 == 0L || class297.method4369() < field415) {
                Statics.field414 = Statics.field422.method3173(field448, field420);
                for (int var5 = 0; var5 < Statics.field414; var5++) {
                    this.method754();
                }
                this.method755();
                this.method741(this.field428);
            }
        } catch (Exception var7) {
            class341.method40((String) null, var7);
            this.method813("crash");
        }
        this.method758();
    }

    @ObfuscatedName("bw.o(I)V")
    public void method754() {
        long var1 = class297.method4369();
        long var3 = field418[Statics.field3847];
        field418[Statics.field3847] = var1;
        Statics.field3847 = Statics.field3847 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field22 = field444;
        }
        this.method851();
    }

    @ObfuscatedName("bw.av(I)V")
    public void method755() {
        Container var1 = this.method770();
        long var2 = class297.method4369();
        long var4 = field424[Statics.field331];
        field424[Statics.field331] = var2;
        Statics.field331 = Statics.field331 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field421 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field437 - 1 > 50) {
            field437 -= 50;
            this.field436 = true;
            this.field428.setSize(Statics.field3255, Statics.field256);
            this.field428.setVisible(true);
            if (this.field434 == var1) {
                Insets var7 = this.field434.getInsets();
                this.field428.setLocation(this.field445 + var7.left, this.field412 + var7.top);
            } else {
                this.field428.setLocation(this.field445, this.field412);
            }
        }
        if (this.field439) {
            this.method749();
        }
        this.method802();
        this.method765(this.field436);
        if (this.field436) {
            this.method748();
        }
        this.field436 = false;
    }

    @ObfuscatedName("bw.am(B)V")
    public final void method802() {
        class319 var1 = this.method771();
        if (this.field449 != var1.field3842 || this.field427 != var1.field3840 || this.field438) {
            this.method746();
            this.field438 = false;
        }
    }

    @ObfuscatedName("bw.ai(I)V")
    public final void method757() {
        this.field438 = true;
    }

    @ObfuscatedName("bw.af(B)V")
    public final synchronized void method758() {
        if (field416) {
            return;
        }
        field416 = true;
        try {
            this.field428.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method766();
        } catch (Exception var7) {
        }
        if (this.field434 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field441 != null) {
            try {
                Statics.field441.method3190();
            } catch (Exception var5) {
            }
        }
        this.method745();
    }

    public final void start() {
        if (field413 == this && !field416) {
            field415 = 0L;
        }
    }

    public final void stop() {
        if (field413 == this && !field416) {
            field415 = class297.method4369() + 4000L;
        }
    }

    public final void destroy() {
        if (field413 == this && !field416) {
            field415 = class297.method4369();
            class298.method4739(5000L);
            this.method758();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field413 != this || field416) {
            return;
        }
        this.field436 = true;
        if (class297.method4369() - this.field425 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field3255 && var2.height >= Statics.field256) {
                this.field439 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field444 = true;
        this.field436 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field444 = false;
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

    @ObfuscatedName("bw.as(ILjava/lang/String;ZI)V")
    public final void method767(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field428.getGraphics();
            if (Statics.field327 == null) {
                Statics.field327 = new Font("Helvetica", 1, 13);
                Statics.field988 = this.field428.getFontMetrics(Statics.field327);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field3255, Statics.field256);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field75 == null) {
                    Statics.field75 = this.field428.createImage(304, 34);
                }
                Graphics var6 = Statics.field75.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field327);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field988.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field75, Statics.field3255 / 2 - 152, Statics.field256 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field3255 / 2 - 152;
                int var9 = Statics.field256 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field327);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field988.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field428.repaint();
        }
    }

    @ObfuscatedName("bw.ak(I)V")
    public final void method768() {
        Statics.field75 = null;
        Statics.field327 = null;
        Statics.field988 = null;
    }

    @ObfuscatedName("bw.ao(Ljava/lang/String;I)V")
    public void method813(String arg0) {
        if (this.field417) {
            return;
        }
        this.field417 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bw.ac(I)Ljava/awt/Container;")
    public Container method770() {
        return this.field434 == null ? this : this.field434;
    }

    @ObfuscatedName("bw.ar(B)Llh;")
    public class319 method771() {
        Container var1 = this.method770();
        int var2 = Math.max(var1.getWidth(), this.field430);
        int var3 = Math.max(var1.getHeight(), this.field429);
        if (this.field434 != null) {
            Insets var4 = this.field434.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class319(var2, var3);
    }

    @ObfuscatedName("bw.au(I)Z")
    public final boolean method772() {
        return this.field434 != null;
    }

    @ObfuscatedName("ho.ax(I)I")
    public static int method3748() {
        int var0 = 0;
        if (Statics.field56 == null || !Statics.field56.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field56 = var2;
                        field446 = -1L;
                        field419 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field56 != null) {
            long var4 = class297.method4369();
            long var6 = Statics.field56.getCollectionTime();
            if (field419 != -1L) {
                long var8 = var6 - field419;
                long var10 = var4 - field446;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field419 = var6;
            field446 = var4;
        }
        return var0;
    }

    @ObfuscatedName("bw.ag(I)V")
    public abstract void method745();

    @ObfuscatedName("bw.y(I)V")
    public abstract void method747();

    public abstract void init();

    @ObfuscatedName("bw.az(I)V")
    public abstract void method763();

    @ObfuscatedName("bw.an(ZI)V")
    public abstract void method765(boolean arg0);

    @ObfuscatedName("bw.at(I)V")
    public abstract void method766();

    @ObfuscatedName("bw.aj(I)V")
    public abstract void method851();
}
