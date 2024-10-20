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

    @ObfuscatedName("bh.h")
    public static class59 field691 = null;

    @ObfuscatedName("bh.f")
    public static int field692 = 0;

    @ObfuscatedName("bh.p")
    public static long field693 = 0L;

    @ObfuscatedName("bh.g")
    public static boolean field706 = false;

    @ObfuscatedName("bh.c")
    public boolean field695 = false;

    @ObfuscatedName("bh.b")
    public static int field697 = 20;

    @ObfuscatedName("bh.o")
    public static int field698 = 1;

    @ObfuscatedName("bh.m")
    public static int field699 = 0;

    @ObfuscatedName("bh.r")
    public static long[] field701 = new long[32];

    @ObfuscatedName("bh.a")
    public static long[] field702 = new long[32];

    @ObfuscatedName("bh.t")
    public int field714;

    @ObfuscatedName("bh.z")
    public int field703;

    @ObfuscatedName("bh.u")
    public int field709 = 0;

    @ObfuscatedName("bh.k")
    public int field705 = 0;

    @ObfuscatedName("bh.d")
    public int field708;

    @ObfuscatedName("bh.ax")
    public int field715;

    @ObfuscatedName("bh.ao")
    public int field690;

    @ObfuscatedName("bh.an")
    public int field711;

    @ObfuscatedName("bh.av")
    public Frame field712;

    @ObfuscatedName("bh.ab")
    public Canvas field694;

    @ObfuscatedName("bh.aj")
    public volatile boolean field716 = true;

    @ObfuscatedName("bh.at")
    public static int field719 = 500;

    @ObfuscatedName("bh.as")
    public boolean field713 = false;

    @ObfuscatedName("bh.af")
    public volatile boolean field707 = false;

    @ObfuscatedName("bh.au")
    public volatile long field718 = 0L;

    @ObfuscatedName("bh.am")
    public class50 field717;

    @ObfuscatedName("bh.ah")
    public Clipboard field720;

    @ObfuscatedName("bh.ap")
    public final EventQueue field721;

    @ObfuscatedName("bh.ad")
    public static volatile boolean field704 = true;

    @ObfuscatedName("bh.aq")
    public static long field723 = -1L;

    @ObfuscatedName("bh.ai")
    public static long field724 = -1L;

    public class59() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field721 = var1;
        class111.method4399(new class52());
    }

    @ObfuscatedName("bh.c(III)V")
    public final void method777(int arg0, int arg1) {
        if (this.field690 != arg0 || this.field711 != arg1) {
            this.method881();
        }
        this.field690 = arg0;
        this.field711 = arg1;
    }

    @ObfuscatedName("bh.l(Ljava/lang/Object;I)V")
    public final void method778(Object arg0) {
        if (this.field721 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field721.peekEvent() != null; var2++) {
            class183.method40(1L);
        }
        if (arg0 != null) {
            this.field721.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bh.w(I)Lfz;")
    public class158 method794() {
        if (this.field717 == null) {
            this.field717 = new class50();
            this.field717.method659(this.field694);
        }
        return this.field717;
    }

    @ObfuscatedName("bh.b(B)V")
    public void method803() {
        this.field720 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bh.o(Ljava/lang/String;I)V")
    public void method781(String arg0) {
        this.field720.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bh.m(B)V")
    public final void method817() {
        class51.method42();
        Canvas var1 = this.field694;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class51.field649);
        var1.addFocusListener(class51.field649);
    }

    @ObfuscatedName("bh.e(I)V")
    public final void method892() {
        Canvas var1 = this.field694;
        var1.addMouseListener(class60.field744);
        var1.addMouseMotionListener(class60.field744);
        var1.addFocusListener(class60.field744);
    }

    @ObfuscatedName("bh.a(B)V")
    public final void method836() {
        Container var1 = this.method806();
        if (var1 == null) {
            return;
        }
        class280 var2 = this.method807();
        this.field714 = Math.max(var2.field3727, this.field708);
        this.field703 = Math.max(var2.field3728, this.field715);
        if (this.field714 <= 0) {
            this.field714 = 1;
        }
        if (this.field703 <= 0) {
            this.field703 = 1;
        }
        Statics.field710 = Math.min(this.field714, this.field690);
        Statics.field1 = Math.min(this.field703, this.field711);
        this.field709 = (this.field714 - Statics.field710) / 2;
        this.field705 = 0;
        this.field694.setSize(Statics.field710, Statics.field1);
        Statics.field2287 = new class58(Statics.field710, Statics.field1, this.field694);
        if (this.field712 == var1) {
            Insets var3 = this.field712.getInsets();
            this.field694.setLocation(this.field709 + var3.left, this.field705 + var3.top);
        } else {
            this.field694.setLocation(this.field709, this.field705);
        }
        this.field716 = true;
        this.method784();
    }

    @ObfuscatedName("bh.t(I)V")
    public void method785() {
        int var1 = this.field709;
        int var2 = this.field705;
        int var3 = this.field714 - Statics.field710 - var1;
        int var4 = this.field703 - Statics.field1 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method806();
            int var6 = 0;
            int var7 = 0;
            if (this.field712 == var5) {
                Insets var8 = this.field712.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field703);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field714, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field714 + var6 - var3, var7, var3, this.field703);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field703 + var7 - var4, this.field714, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bh.y(I)V")
    public final void method786() {
        Canvas var1 = this.field694;
        var1.removeKeyListener(class51.field649);
        var1.removeFocusListener(class51.field649);
        class51.field646 = -1;
        class60.method954(this.field694);
        if (this.field717 != null) {
            this.field717.method660(this.field694);
        }
        this.method788();
        Canvas var2 = this.field694;
        var2.setFocusTraversalKeysEnabled(false);
        var2.addKeyListener(class51.field649);
        var2.addFocusListener(class51.field649);
        Canvas var3 = this.field694;
        var3.addMouseListener(class60.field744);
        var3.addMouseMotionListener(class60.field744);
        var3.addFocusListener(class60.field744);
        if (this.field717 != null) {
            this.field717.method659(this.field694);
        }
        this.method881();
    }

    @ObfuscatedName("bh.u(IIII)V")
    public final void method787(int arg0, int arg1, int arg2) {
        try {
            if (field691 != null) {
                field692++;
                if (field692 >= 3) {
                    this.method866("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field691 = this;
            Statics.field710 = arg0;
            Statics.field1 = arg1;
            Statics.field1420 = arg2;
            Statics.field2225 = this;
            if (Statics.field722 == null) {
                Statics.field722 = new class156();
            }
            Statics.field722.method2704(this, 1);
        } catch (Exception var5) {
            Statics.method1698((String) null, var5);
            this.method866("crash");
        }
    }

    @ObfuscatedName("bh.n(I)V")
    public final synchronized void method788() {
        Container var1 = this.method806();
        if (this.field694 != null) {
            this.field694.removeFocusListener(this);
            var1.remove(this.field694);
        }
        Statics.field710 = Math.max(var1.getWidth(), this.field708);
        Statics.field1 = Math.max(var1.getHeight(), this.field715);
        if (this.field712 != null) {
            Insets var2 = this.field712.getInsets();
            Statics.field710 -= var2.right + var2.left;
            Statics.field1 -= var2.top + var2.bottom;
        }
        this.field694 = new class54(this);
        var1.add(this.field694);
        this.field694.setSize(Statics.field710, Statics.field1);
        this.field694.setVisible(true);
        this.field694.setBackground(Color.BLACK);
        if (this.field712 == var1) {
            Insets var3 = this.field712.getInsets();
            this.field694.setLocation(this.field709 + var3.left, this.field705 + var3.top);
        } else {
            this.field694.setLocation(this.field709, this.field705);
        }
        this.field694.addFocusListener(this);
        this.field694.requestFocus();
        this.field716 = true;
        if (Statics.field2287 != null && Statics.field710 == Statics.field2287.field3751 && Statics.field1 == Statics.field2287.field3752) {
            ((class58) Statics.field2287).method760(this.field694);
            Statics.field2287.method761(0, 0);
        } else {
            Statics.field2287 = new class58(Statics.field710, Statics.field1, this.field694);
        }
        this.field707 = false;
        this.field718 = class177.method1067();
    }

    @ObfuscatedName("bh.d(I)Z")
    public final boolean method789() {
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
                this.method866("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2237 != null) {
                String var1 = Statics.field2237.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2236;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method866("wrongjava");
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
                        if (class272.method2666(var6)) {
                            int var7 = class272.method150(var6, 10, true);
                            if (var7 < 10) {
                                this.method866("wrongjava");
                                return;
                            }
                        }
                    }
                    field698 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method788();
            this.method799();
            class160 var8;
            try {
                var8 = new class152();
            } catch (Throwable var12) {
                var8 = new class153();
            }
            Statics.field700 = var8;
            while (field693 == 0L || class177.method1067() < field693) {
                Statics.field696 = Statics.field700.method2693(field697, field698);
                for (int var10 = 0; var10 < Statics.field696; var10++) {
                    this.method911();
                }
                this.method827();
                this.method778(this.field694);
            }
        } catch (Exception var13) {
            Statics.method1698((String) null, var13);
            this.method866("crash");
        }
        this.method811();
    }

    @ObfuscatedName("bh.ax(B)V")
    public void method911() {
        long var1 = class177.method1067();
        long var3 = field702[Statics.field3347];
        field702[Statics.field3347] = var1;
        Statics.field3347 = Statics.field3347 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field3298 = field704;
        }
        this.method800();
    }

    @ObfuscatedName("bh.ao(I)V")
    public void method827() {
        Container var1 = this.method806();
        long var2 = class177.method1067();
        long var4 = field701[Statics.field268];
        field701[Statics.field268] = var2;
        Statics.field268 = Statics.field268 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field699 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field719 - 1 > 50) {
            field719 -= 50;
            this.field716 = true;
            this.field694.setSize(Statics.field710, Statics.field1);
            this.field694.setVisible(true);
            if (this.field712 == var1) {
                Insets var7 = this.field712.getInsets();
                this.field694.setLocation(this.field709 + var7.left, this.field705 + var7.top);
            } else {
                this.field694.setLocation(this.field709, this.field705);
            }
        }
        if (this.field707) {
            this.method786();
        }
        this.method798();
        this.method801(this.field716);
        if (this.field716) {
            this.method785();
        }
        this.field716 = false;
    }

    @ObfuscatedName("bh.aj(I)V")
    public final void method798() {
        class280 var1 = this.method807();
        if (this.field714 != var1.field3727 || this.field703 != var1.field3728 || this.field713) {
            this.method836();
            this.field713 = false;
        }
    }

    @ObfuscatedName("bh.ae(I)V")
    public final void method881() {
        this.field713 = true;
    }

    @ObfuscatedName("bh.at(B)V")
    public final synchronized void method811() {
        if (field706) {
            return;
        }
        field706 = true;
        try {
            this.field694.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method782();
        } catch (Exception var7) {
        }
        if (this.field712 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field722 != null) {
            try {
                Statics.field722.method2724();
            } catch (Exception var5) {
            }
        }
        this.method790();
    }

    public final void start() {
        if (field691 == this && !field706) {
            field693 = 0L;
        }
    }

    public final void stop() {
        if (field691 == this && !field706) {
            field693 = class177.method1067() + 4000L;
        }
    }

    public final void destroy() {
        if (field691 == this && !field706) {
            field693 = class177.method1067();
            class183.method40(5000L);
            this.method811();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field691 != this || field706) {
            return;
        }
        this.field716 = true;
        if (class177.method1067() - this.field718 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field710 && var2.height >= Statics.field1) {
                this.field707 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field704 = true;
        this.field716 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field704 = false;
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

    @ObfuscatedName("bh.al(ILjava/lang/String;ZI)V")
    public final void method795(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field694.getGraphics();
            if (Statics.field2290 == null) {
                Statics.field2290 = new Font("Helvetica", 1, 13);
                Statics.field1649 = this.field694.getFontMetrics(Statics.field2290);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field710, Statics.field1);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field564 == null) {
                    Statics.field564 = this.field694.createImage(304, 34);
                }
                Graphics var6 = Statics.field564.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field2290);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field1649.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field564, Statics.field710 / 2 - 152, Statics.field1 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field710 / 2 - 152;
                int var9 = Statics.field1 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field2290);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field1649.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field694.repaint();
        }
    }

    @ObfuscatedName("bh.am(I)V")
    public final void method804() {
        Statics.field564 = null;
        Statics.field2290 = null;
        Statics.field1649 = null;
    }

    @ObfuscatedName("bh.ah(Ljava/lang/String;I)V")
    public void method866(String arg0) {
        if (this.field695) {
            return;
        }
        this.field695 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bh.ap(B)Ljava/awt/Container;")
    public Container method806() {
        return this.field712 == null ? this : this.field712;
    }

    @ObfuscatedName("bh.ad(B)Lju;")
    public class280 method807() {
        Container var1 = this.method806();
        int var2 = Math.max(var1.getWidth(), this.field708);
        int var3 = Math.max(var1.getHeight(), this.field715);
        if (this.field712 != null) {
            Insets var4 = this.field712.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class280(var2, var3);
    }

    @ObfuscatedName("bh.aa(I)Z")
    public final boolean method882() {
        return this.field712 != null;
    }

    @ObfuscatedName("r.aw(I)I")
    public static int method73() {
        int var0 = 0;
        if (Statics.field619 == null || !Statics.field619.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field619 = var2;
                        field724 = -1L;
                        field723 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field619 != null) {
            long var4 = class177.method1067();
            long var6 = Statics.field619.getCollectionTime();
            if (field723 != -1L) {
                long var8 = var6 - field723;
                long var10 = var4 - field724;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field723 = var6;
            field724 = var4;
        }
        return var0;
    }

    @ObfuscatedName("bh.az(I)V")
    public abstract void method782();

    @ObfuscatedName("bh.v(B)V")
    public abstract void method784();

    @ObfuscatedName("bh.aq(B)V")
    public abstract void method790();

    public abstract void init();

    @ObfuscatedName("bh.as(I)V")
    public abstract void method799();

    @ObfuscatedName("bh.af(I)V")
    public abstract void method800();

    @ObfuscatedName("bh.au(ZI)V")
    public abstract void method801(boolean arg0);
}
