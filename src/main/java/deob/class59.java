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

@ObfuscatedName("bh")
public abstract class class59 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bh.q")
    public static class59 field664 = null;

    @ObfuscatedName("bh.e")
    public static int field671 = 0;

    @ObfuscatedName("bh.f")
    public static long field666 = 0L;

    @ObfuscatedName("bh.v")
    public static boolean field674 = false;

    @ObfuscatedName("bh.t")
    public boolean field689 = false;

    @ObfuscatedName("bh.r")
    public static int field670 = 20;

    @ObfuscatedName("bh.g")
    public static int field684 = 1;

    @ObfuscatedName("bh.s")
    public static int field672 = 0;

    @ObfuscatedName("bh.u")
    public static long[] field673 = new long[32];

    @ObfuscatedName("bh.k")
    public static long[] field681 = new long[32];

    @ObfuscatedName("bh.c")
    public int field675;

    @ObfuscatedName("bh.l")
    public int field676;

    @ObfuscatedName("bh.m")
    public int field691 = 0;

    @ObfuscatedName("bh.a")
    public int field678 = 0;

    @ObfuscatedName("bh.j")
    public int field679;

    @ObfuscatedName("bh.am")
    public int field680;

    @ObfuscatedName("bh.ac")
    public int field687;

    @ObfuscatedName("bh.ax")
    public int field669;

    @ObfuscatedName("bh.ar")
    public Frame field683;

    @ObfuscatedName("bh.ae")
    public Canvas field677;

    @ObfuscatedName("bh.ai")
    public volatile boolean field685 = true;

    @ObfuscatedName("bh.ad")
    public static int field686 = 500;

    @ObfuscatedName("bh.ah")
    public boolean field682 = false;

    @ObfuscatedName("bh.ao")
    public volatile boolean field688 = false;

    @ObfuscatedName("bh.av")
    public volatile long field663 = 0L;

    @ObfuscatedName("bh.ay")
    public class50 field690;

    @ObfuscatedName("bh.an")
    public Clipboard field668;

    @ObfuscatedName("bh.af")
    public final EventQueue field692;

    @ObfuscatedName("bh.aa")
    public static volatile boolean field693 = true;

    @ObfuscatedName("bh.ap")
    public static long field694 = -1L;

    @ObfuscatedName("bh.aw")
    public static long field695 = -1L;

    public class59() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field692 = var1;
        class112.method2758(new class52());
    }

    @ObfuscatedName("bh.v(IIB)V")
    public final void method836(int arg0, int arg1) {
        if (this.field687 != arg0 || this.field669 != arg1) {
            this.method891();
        }
        this.field687 = arg0;
        this.field669 = arg1;
    }

    @ObfuscatedName("bh.t(Ljava/lang/Object;I)V")
    public final void method740(Object arg0) {
        if (this.field692 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field692.peekEvent() != null; var2++) {
            class182.method2253(1L);
        }
        if (arg0 != null) {
            this.field692.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bh.i(B)Lfm;")
    public class157 method871() {
        if (this.field690 == null) {
            this.field690 = new class50();
            this.field690.method631(this.field677);
        }
        return this.field690;
    }

    @ObfuscatedName("bh.r(I)V")
    public void method784() {
        this.field668 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bh.g(Ljava/lang/String;B)V")
    public void method743(String arg0) {
        this.field668.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bh.s(I)V")
    public final void method744() {
        class51.method153();
        class51.method1566(this.field677);
    }

    @ObfuscatedName("bh.o(B)V")
    public final void method881() {
        Canvas var1 = this.field677;
        var1.addMouseListener(class60.field700);
        var1.addMouseMotionListener(class60.field700);
        var1.addFocusListener(class60.field700);
    }

    @ObfuscatedName("bh.p(I)V")
    public final void method860() {
        Container var1 = this.method795();
        if (var1 == null) {
            return;
        }
        class279 var2 = this.method772();
        this.field675 = Math.max(var2.field3727, this.field679);
        this.field676 = Math.max(var2.field3726, this.field680);
        if (this.field675 <= 0) {
            this.field675 = 1;
        }
        if (this.field676 <= 0) {
            this.field676 = 1;
        }
        Statics.field419 = Math.min(this.field675, this.field687);
        Statics.field800 = Math.min(this.field676, this.field669);
        this.field691 = (this.field675 - Statics.field419) / 2;
        this.field678 = 0;
        this.field677.setSize(Statics.field419, Statics.field800);
        Statics.field583 = new class58(Statics.field419, Statics.field800, this.field677);
        if (this.field683 == var1) {
            Insets var3 = this.field683.getInsets();
            this.field677.setLocation(this.field691 + var3.left, this.field678 + var3.top);
        } else {
            this.field677.setLocation(this.field691, this.field678);
        }
        this.field685 = true;
        this.method886();
    }

    @ObfuscatedName("bh.b(I)V")
    public void method858() {
        int var1 = this.field691;
        int var2 = this.field678;
        int var3 = this.field675 - Statics.field419 - var1;
        int var4 = this.field676 - Statics.field800 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method795();
            int var6 = 0;
            int var7 = 0;
            if (this.field683 == var5) {
                Insets var8 = this.field683.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field676);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field675, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field675 + var6 - var3, var7, var3, this.field676);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field676 + var7 - var4, this.field675, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bh.w(I)V")
    public final void method822() {
        class51.method3657(this.field677);
        class60.method671(this.field677);
        if (this.field690 != null) {
            this.field690.method632(this.field677);
        }
        this.method750();
        class51.method1566(this.field677);
        Canvas var1 = this.field677;
        var1.addMouseListener(class60.field700);
        var1.addMouseMotionListener(class60.field700);
        var1.addFocusListener(class60.field700);
        if (this.field690 != null) {
            this.field690.method631(this.field677);
        }
        this.method891();
    }

    @ObfuscatedName("bh.k(IIIB)V")
    public final void method749(int arg0, int arg1, int arg2) {
        try {
            if (field664 != null) {
                field671++;
                if (field671 >= 3) {
                    this.method794("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field664 = this;
            Statics.field419 = arg0;
            Statics.field800 = arg1;
            Statics.field2192 = arg2;
            Statics.field2194 = this;
            if (Statics.field665 == null) {
                Statics.field665 = new class155();
            }
            Statics.field665.method2686(this, 1);
        } catch (Exception var5) {
            class153.method158((String) null, var5);
            this.method794("crash");
        }
    }

    @ObfuscatedName("bh.c(I)V")
    public final synchronized void method750() {
        Container var1 = this.method795();
        if (this.field677 != null) {
            this.field677.removeFocusListener(this);
            var1.remove(this.field677);
        }
        Statics.field419 = Math.max(var1.getWidth(), this.field679);
        Statics.field800 = Math.max(var1.getHeight(), this.field680);
        if (this.field683 != null) {
            Insets var2 = this.field683.getInsets();
            Statics.field419 -= var2.right + var2.left;
            Statics.field800 -= var2.top + var2.bottom;
        }
        this.field677 = new class54(this);
        var1.add(this.field677);
        this.field677.setSize(Statics.field419, Statics.field800);
        this.field677.setVisible(true);
        this.field677.setBackground(Color.BLACK);
        if (this.field683 == var1) {
            Insets var3 = this.field683.getInsets();
            this.field677.setLocation(this.field691 + var3.left, this.field678 + var3.top);
        } else {
            this.field677.setLocation(this.field691, this.field678);
        }
        this.field677.addFocusListener(this);
        this.field677.requestFocus();
        this.field685 = true;
        if (Statics.field583 != null && Statics.field419 == Statics.field583.field3748 && Statics.field800 == Statics.field583.field3746) {
            ((class58) Statics.field583).method732(this.field677);
            Statics.field583.method722(0, 0);
        } else {
            Statics.field583 = new class58(Statics.field419, Statics.field800, this.field677);
        }
        this.field688 = false;
        this.field663 = class176.method3746();
    }

    @ObfuscatedName("bh.h(I)Z")
    public final boolean method751() {
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
                this.method794("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2208 != null) {
                String var1 = Statics.field2208.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2210;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method794("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class271.method2772(var2.charAt(var3)); var3++) {
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
                            label162: {
                                char var10 = var4.charAt(var9);
                                if (var9 == 0) {
                                    if (var10 == '-') {
                                        var5 = true;
                                        break label162;
                                    }
                                    if (var10 == '+') {
                                        break label162;
                                    }
                                }
                                int var18;
                                if (var10 >= '0' && var10 <= '9') {
                                    var18 = var10 - '0';
                                } else if (var10 >= 'A' && var10 <= 'Z') {
                                    var18 = var10 - '7';
                                } else {
                                    if (var10 < 'a' || var10 > 'z') {
                                        var11 = false;
                                        break;
                                    }
                                    var18 = var10 - 'W';
                                }
                                if (var18 >= 10) {
                                    var11 = false;
                                    break;
                                }
                                if (var5) {
                                    var18 = -var18;
                                }
                                int var12 = var7 * 10 + var18;
                                if (var12 / 10 != var7) {
                                    var11 = false;
                                    break;
                                }
                                var7 = var12;
                                var6 = true;
                            }
                            var9++;
                        }
                        if (var11) {
                            int var14 = class271.method2729(var4, 10, true);
                            if (var14 < 10) {
                                this.method794("wrongjava");
                                return;
                            }
                        }
                    }
                    field684 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method750();
            this.method759();
            Statics.field808 = class159.method2000();
            while (field666 == 0L || class176.method3746() < field666) {
                Statics.field667 = Statics.field808.method2669(field670, field684);
                for (int var15 = 0; var15 < Statics.field667; var15++) {
                    this.method842();
                }
                this.method752();
                this.method740(this.field677);
            }
        } catch (Exception var17) {
            class153.method158((String) null, var17);
            this.method794("crash");
        }
        this.method778();
    }

    @ObfuscatedName("bh.z(I)V")
    public void method842() {
        long var1 = class176.method3746();
        long var3 = field681[Statics.field2256];
        field681[Statics.field2256] = var1;
        Statics.field2256 = Statics.field2256 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field2381 = field693;
        }
        this.method765();
    }

    @ObfuscatedName("bh.j(B)V")
    public void method752() {
        Container var1 = this.method795();
        long var2 = class176.method3746();
        long var4 = field673[Statics.field300];
        field673[Statics.field300] = var2;
        Statics.field300 = Statics.field300 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field672 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field686 - 1 > 50) {
            field686 -= 50;
            this.field685 = true;
            this.field677.setSize(Statics.field419, Statics.field800);
            this.field677.setVisible(true);
            if (this.field683 == var1) {
                Insets var7 = this.field683.getInsets();
                this.field677.setLocation(this.field691 + var7.left, this.field678 + var7.top);
            } else {
                this.field677.setLocation(this.field691, this.field678);
            }
        }
        if (this.field688) {
            this.method822();
        }
        this.method753();
        this.method766(this.field685);
        if (this.field685) {
            this.method858();
        }
        this.field685 = false;
    }

    @ObfuscatedName("bh.am(B)V")
    public final void method753() {
        class279 var1 = this.method772();
        if (this.field675 != var1.field3727 || this.field676 != var1.field3726 || this.field682) {
            this.method860();
            this.field682 = false;
        }
    }

    @ObfuscatedName("bh.ac(I)V")
    public final void method891() {
        this.field682 = true;
    }

    @ObfuscatedName("bh.ai(B)V")
    public final synchronized void method778() {
        if (field674) {
            return;
        }
        field674 = true;
        try {
            this.field677.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method767();
        } catch (Exception var7) {
        }
        if (this.field683 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field665 != null) {
            try {
                Statics.field665.method2683();
            } catch (Exception var5) {
            }
        }
        this.method774();
    }

    @ObfuscatedName("gv.au(B)V")
    public static final void method3406() {
        Statics.field808.method2668();
        for (int var0 = 0; var0 < 32; var0++) {
            field673[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field681[var1] = 0L;
        }
        Statics.field667 = 0;
    }

    public final void start() {
        if (field664 == this && !field674) {
            field666 = 0L;
        }
    }

    public final void stop() {
        if (field664 == this && !field674) {
            field666 = class176.method3746() + 4000L;
        }
    }

    public final void destroy() {
        if (field664 == this && !field674) {
            field666 = class176.method3746();
            class182.method2253(5000L);
            this.method778();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field664 != this || field674) {
            return;
        }
        this.field685 = true;
        if (class176.method3746() - this.field663 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field419 && var2.height >= Statics.field800) {
                this.field688 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field693 = true;
        this.field685 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field693 = false;
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

    @ObfuscatedName("bh.az(ILjava/lang/String;ZB)V")
    public final void method768(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field677.getGraphics();
            if (Statics.field2095 == null) {
                Statics.field2095 = new Font("Helvetica", 1, 13);
                Statics.field3724 = this.field677.getFontMetrics(Statics.field2095);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field419, Statics.field800);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field1189 == null) {
                    Statics.field1189 = this.field677.createImage(304, 34);
                }
                Graphics var6 = Statics.field1189.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field2095);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field3724.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field1189, Statics.field419 / 2 - 152, Statics.field800 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field419 / 2 - 152;
                int var9 = Statics.field800 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field2095);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field3724.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field677.repaint();
        }
    }

    @ObfuscatedName("bh.aq(B)V")
    public final void method769() {
        Statics.field1189 = null;
        Statics.field2095 = null;
        Statics.field3724 = null;
    }

    @ObfuscatedName("bh.ay(Ljava/lang/String;I)V")
    public void method794(String arg0) {
        if (this.field689) {
            return;
        }
        this.field689 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bh.an(I)Ljava/awt/Container;")
    public Container method795() {
        return this.field683 == null ? this : this.field683;
    }

    @ObfuscatedName("bh.af(I)Ljg;")
    public class279 method772() {
        Container var1 = this.method795();
        int var2 = Math.max(var1.getWidth(), this.field679);
        int var3 = Math.max(var1.getHeight(), this.field680);
        if (this.field683 != null) {
            Insets var4 = this.field683.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class279(var2, var3);
    }

    @ObfuscatedName("bh.aa(I)Z")
    public final boolean method773() {
        return this.field683 != null;
    }

    @ObfuscatedName("e.ak(I)I")
    public static int method12() {
        int var0 = 0;
        if (Statics.field825 == null || !Statics.field825.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field825 = var2;
                        field695 = -1L;
                        field694 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field825 != null) {
            long var4 = class176.method3746();
            long var6 = Statics.field825.getCollectionTime();
            if (field694 != -1L) {
                long var8 = var6 - field694;
                long var10 = var4 - field695;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field694 = var6;
            field695 = var4;
        }
        return var0;
    }

    @ObfuscatedName("bh.ad(I)V")
    public abstract void method759();

    public abstract void init();

    @ObfuscatedName("bh.ah(I)V")
    public abstract void method765();

    @ObfuscatedName("bh.ao(ZB)V")
    public abstract void method766(boolean arg0);

    @ObfuscatedName("bh.av(I)V")
    public abstract void method767();

    @ObfuscatedName("bh.as(B)V")
    public abstract void method774();

    @ObfuscatedName("bh.u(I)V")
    public abstract void method886();
}
