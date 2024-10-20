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

@ObfuscatedName("bz")
public abstract class class60 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bz.e")
    public static class60 field676 = null;

    @ObfuscatedName("bz.b")
    public static int field667 = 0;

    @ObfuscatedName("bz.z")
    public static long field668 = 0L;

    @ObfuscatedName("bz.n")
    public static boolean field669 = false;

    @ObfuscatedName("bz.l")
    public boolean field670 = false;

    @ObfuscatedName("bz.c")
    public static int field692 = 20;

    @ObfuscatedName("bz.h")
    public static int field673 = 1;

    @ObfuscatedName("bz.i")
    public static int field677 = 0;

    @ObfuscatedName("bz.r")
    public static long[] field674 = new long[32];

    @ObfuscatedName("bz.q")
    public static long[] field695 = new long[32];

    @ObfuscatedName("bz.j")
    public int field682;

    @ObfuscatedName("bz.v")
    public int field685;

    @ObfuscatedName("bz.u")
    public int field679 = 0;

    @ObfuscatedName("bz.k")
    public int field680 = 0;

    @ObfuscatedName("bz.t")
    public int field681;

    @ObfuscatedName("bz.ax")
    public int field666;

    @ObfuscatedName("bz.ai")
    public int field683;

    @ObfuscatedName("bz.aj")
    public int field684;

    @ObfuscatedName("bz.ay")
    public Frame field696;

    @ObfuscatedName("bz.as")
    public Canvas field665;

    @ObfuscatedName("bz.av")
    public volatile boolean field687 = true;

    @ObfuscatedName("bz.ak")
    public static int field689 = 500;

    @ObfuscatedName("bz.ad")
    public boolean field678 = false;

    @ObfuscatedName("bz.az")
    public volatile boolean field691 = false;

    @ObfuscatedName("bz.aa")
    public volatile long field672 = 0L;

    @ObfuscatedName("bz.af")
    public class51 field693;

    @ObfuscatedName("bz.ah")
    public Clipboard field694;

    @ObfuscatedName("bz.au")
    public final EventQueue field699;

    @ObfuscatedName("bz.ap")
    public static volatile boolean field675 = true;

    @ObfuscatedName("bz.an")
    public static long field697 = -1L;

    @ObfuscatedName("bz.ae")
    public static long field698 = -1L;

    public class60() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field699 = var1;
        class53 var3 = new class53();
        Statics.field798 = var3;
    }

    @ObfuscatedName("bz.l(III)V")
    public final void method807(int arg0, int arg1) {
        if (this.field683 != arg0 || this.field684 != arg1) {
            this.method822();
        }
        this.field683 = arg0;
        this.field684 = arg1;
    }

    @ObfuscatedName("bz.s(Ljava/lang/Object;I)V")
    public final void method940(Object arg0) {
        if (this.field699 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field699.peekEvent() != null; var2++) {
            class204.method48(1L);
        }
        if (arg0 != null) {
            this.field699.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bz.y(B)Lfo;")
    public class169 method808() {
        if (this.field693 == null) {
            this.field693 = new class51();
            this.field693.method694(this.field665);
        }
        return this.field693;
    }

    @ObfuscatedName("bz.c(B)V")
    public void method809() {
        this.field694 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bz.o(Ljava/lang/String;I)V")
    public void method810(String arg0) {
        this.field694.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bz.d(I)V")
    public final void method813() {
        class52.method3029();
        class52.method3289(this.field665);
    }

    @ObfuscatedName("bz.r(B)V")
    public final void method933() {
        class61.method177(this.field665);
    }

    @ObfuscatedName("bz.p(I)V")
    public final void method889() {
        Container var1 = this.method837();
        if (var1 == null) {
            return;
        }
        class324 var2 = this.method838();
        this.field682 = Math.max(var2.field3947, this.field681);
        this.field685 = Math.max(var2.field3945, this.field666);
        if (this.field682 <= 0) {
            this.field682 = 1;
        }
        if (this.field685 <= 0) {
            this.field685 = 1;
        }
        Statics.field2039 = Math.min(this.field682, this.field683);
        Statics.field328 = Math.min(this.field685, this.field684);
        this.field679 = (this.field682 - Statics.field2039) / 2;
        this.field680 = 0;
        this.field665.setSize(Statics.field2039, Statics.field328);
        Statics.field309 = new class59(Statics.field2039, Statics.field328, this.field665);
        if (this.field696 == var1) {
            Insets var3 = this.field696.getInsets();
            this.field665.setLocation(this.field679 + var3.left, this.field680 + var3.top);
        } else {
            this.field665.setLocation(this.field679, this.field680);
        }
        this.field687 = true;
        this.method844();
    }

    @ObfuscatedName("bz.f(I)V")
    public void method938() {
        int var1 = this.field679;
        int var2 = this.field680;
        int var3 = this.field682 - Statics.field2039 - var1;
        int var4 = this.field685 - Statics.field328 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method837();
            int var6 = 0;
            int var7 = 0;
            if (this.field696 == var5) {
                Insets var8 = this.field696.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field685);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field682, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field682 + var6 - var3, var7, var3, this.field685);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field685 + var7 - var4, this.field682, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bz.j(I)V")
    public final void method816() {
        Canvas var1 = this.field665;
        var1.removeKeyListener(class52.field623);
        var1.removeFocusListener(class52.field623);
        class52.field615 = -1;
        class61.method553(this.field665);
        if (this.field693 != null) {
            this.field693.method696(this.field665);
        }
        this.method818();
        class52.method3289(this.field665);
        class61.method177(this.field665);
        if (this.field693 != null) {
            this.field693.method694(this.field665);
        }
        this.method822();
    }

    @ObfuscatedName("bz.v(IIII)V")
    public final void method825(int arg0, int arg1, int arg2) {
        try {
            if (field676 != null) {
                field667++;
                if (field667 >= 3) {
                    this.method930("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field676 = this;
            Statics.field2039 = arg0;
            Statics.field328 = arg1;
            Statics.field2118 = arg2;
            Statics.field2169 = this;
            if (Statics.field671 == null) {
                Statics.field671 = new class167();
            }
            Statics.field671.method3080(this, 1);
        } catch (Exception var5) {
            class165.method4257((String) null, var5);
            this.method930("crash");
        }
    }

    @ObfuscatedName("bz.u(B)V")
    public final synchronized void method818() {
        Container var1 = this.method837();
        if (this.field665 != null) {
            this.field665.removeFocusListener(this);
            var1.remove(this.field665);
        }
        Statics.field2039 = Math.max(var1.getWidth(), this.field681);
        Statics.field328 = Math.max(var1.getHeight(), this.field666);
        if (this.field696 != null) {
            Insets var2 = this.field696.getInsets();
            Statics.field2039 -= var2.right + var2.left;
            Statics.field328 -= var2.top + var2.bottom;
        }
        this.field665 = new class55(this);
        var1.add(this.field665);
        this.field665.setSize(Statics.field2039, Statics.field328);
        this.field665.setVisible(true);
        this.field665.setBackground(Color.BLACK);
        if (this.field696 == var1) {
            Insets var3 = this.field696.getInsets();
            this.field665.setLocation(this.field679 + var3.left, this.field680 + var3.top);
        } else {
            this.field665.setLocation(this.field679, this.field680);
        }
        this.field665.addFocusListener(this);
        this.field665.requestFocus();
        this.field687 = true;
        if (Statics.field309 != null && Statics.field2039 == Statics.field309.field3967 && Statics.field328 == Statics.field309.field3968) {
            ((class59) Statics.field309).method790(this.field665);
            Statics.field309.method791(0, 0);
        } else {
            Statics.field309 = new class59(Statics.field2039, Statics.field328, this.field665);
        }
        this.field691 = false;
        this.field672 = class197.method4873();
    }

    @ObfuscatedName("bz.k(I)Z")
    public final boolean method819() {
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
                this.method930("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2190 != null) {
                String var1 = Statics.field2190.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2186;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method930("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class319.method4260(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        boolean var5 = class319.method5088(var4, 10, true);
                        if (var5 && class319.method1887(var4) < 10) {
                            this.method930("wrongjava");
                            return;
                        }
                    }
                    field673 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method818();
            this.method830();
            class173 var6;
            try {
                var6 = new class162();
            } catch (Throwable var10) {
                var6 = new class163();
            }
            Statics.field3949 = var6;
            while (field668 == 0L || class197.method4873() < field668) {
                Statics.field690 = Statics.field3949.method3037(field692, field673);
                for (int var8 = 0; var8 < Statics.field690; var8++) {
                    this.method820();
                }
                this.method836();
                this.method940(this.field665);
            }
        } catch (Exception var11) {
            class165.method4257((String) null, var11);
            this.method930("crash");
        }
        this.method823();
    }

    @ObfuscatedName("bz.w(I)V")
    public void method820() {
        long var1 = class197.method4873();
        long var3 = field695[Statics.field343];
        field695[Statics.field343] = var1;
        Statics.field343 = Statics.field343 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field644 = field675;
        }
        this.method831();
    }

    @ObfuscatedName("bz.x(B)V")
    public void method836() {
        Container var1 = this.method837();
        long var2 = class197.method4873();
        long var4 = field674[Statics.field2692];
        field674[Statics.field2692] = var2;
        Statics.field2692 = Statics.field2692 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field677 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field689 - 1 > 50) {
            field689 -= 50;
            this.field687 = true;
            this.field665.setSize(Statics.field2039, Statics.field328);
            this.field665.setVisible(true);
            if (this.field696 == var1) {
                Insets var7 = this.field696.getInsets();
                this.field665.setLocation(this.field679 + var7.left, this.field680 + var7.top);
            } else {
                this.field665.setLocation(this.field679, this.field680);
            }
        }
        if (this.field691) {
            this.method816();
        }
        this.method900();
        this.method832(this.field687);
        if (this.field687) {
            this.method938();
        }
        this.field687 = false;
    }

    @ObfuscatedName("bz.t(I)V")
    public final void method900() {
        class324 var1 = this.method838();
        if (this.field682 != var1.field3947 || this.field685 != var1.field3945 || this.field678) {
            this.method889();
            this.field678 = false;
        }
    }

    @ObfuscatedName("bz.ax(I)V")
    public final void method822() {
        this.field678 = true;
    }

    @ObfuscatedName("bz.ay(B)V")
    public final synchronized void method823() {
        if (field669) {
            return;
        }
        field669 = true;
        try {
            this.field665.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method954();
        } catch (Exception var7) {
        }
        if (this.field696 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field671 != null) {
            try {
                Statics.field671.method3076();
            } catch (Exception var5) {
            }
        }
        this.method840();
    }

    @ObfuscatedName("el.as(S)V")
    public static final void method3011() {
        Statics.field3949.method3036();
        for (int var0 = 0; var0 < 32; var0++) {
            field674[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field695[var1] = 0L;
        }
        Statics.field690 = 0;
    }

    public final void start() {
        if (field676 == this && !field669) {
            field668 = 0L;
        }
    }

    public final void stop() {
        if (field676 == this && !field669) {
            field668 = class197.method4873() + 4000L;
        }
    }

    public final void destroy() {
        if (field676 == this && !field669) {
            field668 = class197.method4873();
            class204.method48(5000L);
            this.method823();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field676 != this || field669) {
            return;
        }
        this.field687 = true;
        if (class197.method4873() - this.field672 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field2039 && var2.height >= Statics.field328) {
                this.field691 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field675 = true;
        this.field687 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field675 = false;
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

    @ObfuscatedName("bz.az(ILjava/lang/String;ZI)V")
    public final void method834(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field665.getGraphics();
            if (Statics.field266 == null) {
                Statics.field266 = new Font("Helvetica", 1, 13);
                Statics.field2248 = this.field665.getFontMetrics(Statics.field266);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field2039, Statics.field328);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field688 == null) {
                    Statics.field688 = this.field665.createImage(304, 34);
                }
                Graphics var6 = Statics.field688.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field266);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field2248.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field688, Statics.field2039 / 2 - 152, Statics.field328 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field2039 / 2 - 152;
                int var9 = Statics.field328 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field266);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field2248.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field665.repaint();
        }
    }

    @ObfuscatedName("bz.aa(B)V")
    public final void method929() {
        Statics.field688 = null;
        Statics.field266 = null;
        Statics.field2248 = null;
    }

    @ObfuscatedName("bz.ab(Ljava/lang/String;I)V")
    public void method930(String arg0) {
        if (this.field670) {
            return;
        }
        this.field670 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bz.al(B)Ljava/awt/Container;")
    public Container method837() {
        return this.field696 == null ? this : this.field696;
    }

    @ObfuscatedName("bz.af(I)Lls;")
    public class324 method838() {
        Container var1 = this.method837();
        int var2 = Math.max(var1.getWidth(), this.field681);
        int var3 = Math.max(var1.getHeight(), this.field666);
        if (this.field696 != null) {
            Insets var4 = this.field696.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class324(var2, var3);
    }

    @ObfuscatedName("bz.ah(S)Z")
    public final boolean method839() {
        return this.field696 != null;
    }

    @ObfuscatedName("af.au(I)I")
    public static int method544() {
        int var0 = 0;
        if (Statics.field573 == null || !Statics.field573.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field573 = var2;
                        field698 = -1L;
                        field697 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field573 != null) {
            long var4 = class197.method4873();
            long var6 = Statics.field573.getCollectionTime();
            if (field697 != -1L) {
                long var8 = var6 - field697;
                long var10 = var4 - field698;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field697 = var6;
            field698 = var4;
        }
        return var0;
    }

    public abstract void init();

    @ObfuscatedName("bz.av(I)V")
    public abstract void method830();

    @ObfuscatedName("bz.ao(I)V")
    public abstract void method831();

    @ObfuscatedName("bz.ak(ZI)V")
    public abstract void method832(boolean arg0);

    @ObfuscatedName("bz.ap(I)V")
    public abstract void method840();

    @ObfuscatedName("bz.q(I)V")
    public abstract void method844();

    @ObfuscatedName("bz.ad(I)V")
    public abstract void method954();
}
