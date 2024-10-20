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
import java.net.URL;

@ObfuscatedName("bb")
public abstract class class59 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bb.j")
    public static class59 field682 = null;

    @ObfuscatedName("bb.n")
    public static int field695 = 0;

    @ObfuscatedName("bb.r")
    public static long field684 = 0L;

    @ObfuscatedName("bb.v")
    public static boolean field685 = false;

    @ObfuscatedName("bb.e")
    public boolean field704 = false;

    @ObfuscatedName("bb.s")
    public static int field686 = 20;

    @ObfuscatedName("bb.p")
    public static int field688 = 1;

    @ObfuscatedName("bb.m")
    public static int field689 = 0;

    @ObfuscatedName("bb.k")
    public static long[] field691 = new long[32];

    @ObfuscatedName("bb.c")
    public static long[] field701 = new long[32];

    @ObfuscatedName("bb.f")
    public int field700;

    @ObfuscatedName("bb.h")
    public int field694;

    @ObfuscatedName("bb.z")
    public int field693 = 0;

    @ObfuscatedName("bb.i")
    public int field696 = 0;

    @ObfuscatedName("bb.q")
    public int field709;

    @ObfuscatedName("bb.ai")
    public int field698;

    @ObfuscatedName("bb.ae")
    public int field699;

    @ObfuscatedName("bb.au")
    public int field692;

    @ObfuscatedName("bb.ar")
    public Frame field683;

    @ObfuscatedName("bb.am")
    public Canvas field702;

    @ObfuscatedName("bb.aw")
    public volatile boolean field703 = true;

    @ObfuscatedName("bb.aa")
    public static int field681 = 500;

    @ObfuscatedName("bb.ag")
    public boolean field705 = false;

    @ObfuscatedName("bb.aj")
    public volatile boolean field706 = false;

    @ObfuscatedName("bb.ax")
    public volatile long field707 = 0L;

    @ObfuscatedName("bb.as")
    public class50 field708;

    @ObfuscatedName("bb.av")
    public Clipboard field711;

    @ObfuscatedName("bb.ab")
    public final EventQueue field710;

    @ObfuscatedName("bb.at")
    public static volatile boolean field690 = true;

    public class59() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field710 = var1;
        class52 var3 = new class52();
        Statics.field3667 = var3;
    }

    @ObfuscatedName("bb.e(III)V")
    public final void method822(int arg0, int arg1) {
        if (this.field699 != arg0 || this.field692 != arg1) {
            this.method751();
        }
        this.field699 = arg0;
        this.field692 = arg1;
    }

    @ObfuscatedName("bb.l(Ljava/lang/Object;I)V")
    public final void method856(Object arg0) {
        if (this.field710 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field710.peekEvent() != null; var2++) {
            class182.method318(1L);
        }
        if (arg0 != null) {
            this.field710.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bb.s(I)Lfh;")
    public class157 method736() {
        if (this.field708 == null) {
            this.field708 = new class50();
            this.field708.method640(this.field702);
        }
        return this.field708;
    }

    @ObfuscatedName("bb.w(B)V")
    public void method737() {
        this.field711 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bb.p(Ljava/lang/String;S)V")
    public void method738(String arg0) {
        this.field711.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bb.m(I)V")
    public final void method739() {
        class51.method85();
        Canvas var1 = this.field702;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class51.field637);
        var1.addFocusListener(class51.field637);
    }

    @ObfuscatedName("bb.u(B)V")
    public final void method740() {
        Canvas var1 = this.field702;
        var1.addMouseListener(class60.field717);
        var1.addMouseMotionListener(class60.field717);
        var1.addFocusListener(class60.field717);
    }

    @ObfuscatedName("bb.g(I)V")
    public final void method741() {
        Container var1 = this.method765();
        if (var1 == null) {
            return;
        }
        class279 var2 = this.method796();
        this.field700 = Math.max(var2.field3743, this.field709);
        this.field694 = Math.max(var2.field3744, this.field698);
        if (this.field700 <= 0) {
            this.field700 = 1;
        }
        if (this.field694 <= 0) {
            this.field694 = 1;
        }
        Statics.field1214 = Math.min(this.field700, this.field699);
        Statics.field3350 = Math.min(this.field694, this.field692);
        this.field693 = (this.field700 - Statics.field1214) / 2;
        this.field696 = 0;
        this.field702.setSize(Statics.field1214, Statics.field3350);
        Statics.field2328 = new class58(Statics.field1214, Statics.field3350, this.field702);
        if (this.field683 == var1) {
            Insets var3 = this.field683.getInsets();
            this.field702.setLocation(this.field693 + var3.left, this.field696 + var3.top);
        } else {
            this.field702.setLocation(this.field693, this.field696);
        }
        this.field703 = true;
        this.method742();
    }

    @ObfuscatedName("bb.c(B)V")
    public void method743() {
        int var1 = this.field693;
        int var2 = this.field696;
        int var3 = this.field700 - Statics.field1214 - var1;
        int var4 = this.field694 - Statics.field3350 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method765();
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
                var9.fillRect(var6, var7, var1, this.field694);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field700, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field700 + var6 - var3, var7, var3, this.field694);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field694 + var7 - var4, this.field700, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bb.d(I)V")
    public final void method836() {
        Canvas var1 = this.field702;
        var1.removeKeyListener(class51.field637);
        var1.removeFocusListener(class51.field637);
        class51.field626 = -1;
        class60.method2268(this.field702);
        if (this.field708 != null) {
            this.field708.method636(this.field702);
        }
        this.method746();
        Canvas var2 = this.field702;
        var2.setFocusTraversalKeysEnabled(false);
        var2.addKeyListener(class51.field637);
        var2.addFocusListener(class51.field637);
        Canvas var3 = this.field702;
        var3.addMouseListener(class60.field717);
        var3.addMouseMotionListener(class60.field717);
        var3.addFocusListener(class60.field717);
        if (this.field708 != null) {
            this.field708.method640(this.field702);
        }
        this.method751();
    }

    @ObfuscatedName("bb.ai(IIII)V")
    public final void method745(int arg0, int arg1, int arg2) {
        try {
            if (field682 != null) {
                field695++;
                if (field695 >= 3) {
                    this.method764("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field682 = this;
            Statics.field1214 = arg0;
            Statics.field3350 = arg1;
            Statics.field2210 = arg2;
            Statics.field2214 = this;
            if (Statics.field697 == null) {
                Statics.field697 = new class155();
            }
            Statics.field697.method2677(this, 1);
        } catch (Exception var5) {
            class153.method683((String) null, var5);
            this.method764("crash");
        }
    }

    @ObfuscatedName("bb.ae(I)V")
    public final synchronized void method746() {
        Container var1 = this.method765();
        if (this.field702 != null) {
            this.field702.removeFocusListener(this);
            var1.remove(this.field702);
        }
        Statics.field1214 = Math.max(var1.getWidth(), this.field709);
        Statics.field3350 = Math.max(var1.getHeight(), this.field698);
        if (this.field683 != null) {
            Insets var2 = this.field683.getInsets();
            Statics.field1214 -= var2.right + var2.left;
            Statics.field3350 -= var2.top + var2.bottom;
        }
        this.field702 = new class54(this);
        var1.add(this.field702);
        this.field702.setSize(Statics.field1214, Statics.field3350);
        this.field702.setVisible(true);
        this.field702.setBackground(Color.BLACK);
        if (this.field683 == var1) {
            Insets var3 = this.field683.getInsets();
            this.field702.setLocation(this.field693 + var3.left, this.field696 + var3.top);
        } else {
            this.field702.setLocation(this.field693, this.field696);
        }
        this.field702.addFocusListener(this);
        this.field702.requestFocus();
        this.field703 = true;
        if (Statics.field2328 != null && Statics.field1214 == Statics.field2328.field3764 && Statics.field3350 == Statics.field2328.field3763) {
            ((class58) Statics.field2328).method720(this.field702);
            Statics.field2328.method718(0, 0);
        } else {
            Statics.field2328 = new class58(Statics.field1214, Statics.field3350, this.field702);
        }
        this.field706 = false;
        this.field707 = class176.method584();
    }

    @ObfuscatedName("bb.au(S)Z")
    public final boolean method810() {
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
                this.method764("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2228 != null) {
                String var1 = Statics.field2228.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2227;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method764("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class271.method2801(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        boolean var5 = class271.method3941(var4, 10, true);
                        if (var5) {
                            int var6 = class271.method4447(var4, 10, true);
                            if (var6 < 10) {
                                this.method764("wrongjava");
                                return;
                            }
                        }
                    }
                    field688 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method746();
            this.method758();
            class159 var7;
            try {
                var7 = new class151();
            } catch (Throwable var11) {
                var7 = new class152();
            }
            Statics.field598 = var7;
            while (field684 == 0L || class176.method584() < field684) {
                Statics.field3738 = Statics.field598.method2650(field686, field688);
                for (int var9 = 0; var9 < Statics.field3738; var9++) {
                    this.method753();
                }
                this.method749();
                this.method856(this.field702);
            }
        } catch (Exception var12) {
            class153.method683((String) null, var12);
            this.method764("crash");
        }
        this.method752();
    }

    @ObfuscatedName("bb.ak(B)V")
    public void method753() {
        long var1 = class176.method584();
        long var3 = field701[Statics.field461];
        field701[Statics.field461] = var1;
        Statics.field461 = Statics.field461 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field340 = field690;
        }
        this.method861();
    }

    @ObfuscatedName("bb.ap(I)V")
    public void method749() {
        Container var1 = this.method765();
        long var2 = class176.method584();
        long var4 = field691[Statics.field528];
        field691[Statics.field528] = var2;
        Statics.field528 = Statics.field528 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field689 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field681 - 1 > 50) {
            field681 -= 50;
            this.field703 = true;
            this.field702.setSize(Statics.field1214, Statics.field3350);
            this.field702.setVisible(true);
            if (this.field683 == var1) {
                Insets var7 = this.field683.getInsets();
                this.field702.setLocation(this.field693 + var7.left, this.field696 + var7.top);
            } else {
                this.field702.setLocation(this.field693, this.field696);
            }
        }
        if (this.field706) {
            this.method836();
        }
        this.method750();
        this.method769(this.field703);
        if (this.field703) {
            this.method743();
        }
        this.field703 = false;
    }

    @ObfuscatedName("bb.ar(I)V")
    public final void method750() {
        class279 var1 = this.method796();
        if (this.field700 != var1.field3743 || this.field694 != var1.field3744 || this.field705) {
            this.method741();
            this.field705 = false;
        }
    }

    @ObfuscatedName("bb.am(B)V")
    public final void method751() {
        this.field705 = true;
    }

    @ObfuscatedName("bb.aw(I)V")
    public final synchronized void method752() {
        if (field685) {
            return;
        }
        field685 = true;
        try {
            this.field702.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method761();
        } catch (Exception var7) {
        }
        if (this.field683 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field697 != null) {
            try {
                Statics.field697.method2674();
            } catch (Exception var5) {
            }
        }
        this.method768();
    }

    @ObfuscatedName("t.aq(I)V")
    public static final void method71() {
        Statics.field598.method2648();
        for (int var0 = 0; var0 < 32; var0++) {
            field691[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field701[var1] = 0L;
        }
        Statics.field3738 = 0;
    }

    public final void start() {
        if (field682 == this && !field685) {
            field684 = 0L;
        }
    }

    public final void stop() {
        if (field682 == this && !field685) {
            field684 = class176.method584() + 4000L;
        }
    }

    public final void destroy() {
        if (field682 == this && !field685) {
            field684 = class176.method584();
            class182.method318(5000L);
            this.method752();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field682 != this || field685) {
            return;
        }
        this.field703 = true;
        if (class176.method584() - this.field707 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1214 && var2.height >= Statics.field3350) {
                this.field706 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field690 = true;
        this.field703 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field690 = false;
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

    @ObfuscatedName("bb.ad(ILjava/lang/String;ZI)V")
    public final void method762(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field702.getGraphics();
            if (Statics.field658 == null) {
                Statics.field658 = new Font("Helvetica", 1, 13);
                Statics.field2418 = this.field702.getFontMetrics(Statics.field658);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field1214, Statics.field3350);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field2259 == null) {
                    Statics.field2259 = this.field702.createImage(304, 34);
                }
                Graphics var6 = Statics.field2259.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field658);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field2418.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field2259, Statics.field1214 / 2 - 152, Statics.field3350 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field1214 / 2 - 152;
                int var9 = Statics.field3350 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field658);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field2418.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field702.repaint();
        }
    }

    @ObfuscatedName("bb.az(I)V")
    public final void method763() {
        Statics.field2259 = null;
        Statics.field658 = null;
        Statics.field2418 = null;
    }

    @ObfuscatedName("bb.as(Ljava/lang/String;I)V")
    public void method764(String arg0) {
        if (this.field704) {
            return;
        }
        this.field704 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bb.av(S)Ljava/awt/Container;")
    public Container method765() {
        return this.field683 == null ? this : this.field683;
    }

    @ObfuscatedName("bb.ab(I)Ljj;")
    public class279 method796() {
        Container var1 = this.method765();
        int var2 = Math.max(var1.getWidth(), this.field709);
        int var3 = Math.max(var1.getHeight(), this.field698);
        if (this.field683 != null) {
            Insets var4 = this.field683.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class279(var2, var3);
    }

    @ObfuscatedName("bb.at(I)Z")
    public final boolean method767() {
        return this.field683 != null;
    }

    @ObfuscatedName("bb.k(I)V")
    public abstract void method742();

    public abstract void init();

    @ObfuscatedName("bb.aa(I)V")
    public abstract void method758();

    @ObfuscatedName("bb.ax(I)V")
    public abstract void method761();

    @ObfuscatedName("bb.al(I)V")
    public abstract void method768();

    @ObfuscatedName("bb.aj(ZI)V")
    public abstract void method769(boolean arg0);

    @ObfuscatedName("bb.ag(B)V")
    public abstract void method861();
}
