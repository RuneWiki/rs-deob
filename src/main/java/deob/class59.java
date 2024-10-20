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

@ObfuscatedName("bo")
public abstract class class59 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bo.o")
    public static class59 field688 = null;

    @ObfuscatedName("bo.i")
    public static int field698 = 0;

    @ObfuscatedName("bo.u")
    public static long field707 = 0L;

    @ObfuscatedName("bo.g")
    public static boolean field691 = false;

    @ObfuscatedName("bo.m")
    public boolean field717 = false;

    @ObfuscatedName("bo.p")
    public static int field694 = 20;

    @ObfuscatedName("bo.k")
    public static int field695 = 1;

    @ObfuscatedName("bo.r")
    public static int field696 = 0;

    @ObfuscatedName("bo.t")
    public static long[] field697 = new long[32];

    @ObfuscatedName("bo.e")
    public static long[] field687 = new long[32];

    @ObfuscatedName("bo.q")
    public int field710;

    @ObfuscatedName("bo.f")
    public int field709;

    @ObfuscatedName("bo.j")
    public int field715 = 0;

    @ObfuscatedName("bo.n")
    public int field702 = 0;

    @ObfuscatedName("bo.d")
    public int field703;

    @ObfuscatedName("bo.ap")
    public int field704;

    @ObfuscatedName("bo.aj")
    public int field705;

    @ObfuscatedName("bo.am")
    public int field706;

    @ObfuscatedName("bo.al")
    public Frame field692;

    @ObfuscatedName("bo.ab")
    public Canvas field708;

    @ObfuscatedName("bo.af")
    public volatile boolean field713 = true;

    @ObfuscatedName("bo.ar")
    public static int field722 = 500;

    @ObfuscatedName("bo.an")
    public boolean field711 = false;

    @ObfuscatedName("bo.at")
    public volatile boolean field712 = false;

    @ObfuscatedName("bo.aw")
    public volatile long field701 = 0L;

    @ObfuscatedName("bo.ae")
    public class50 field714;

    @ObfuscatedName("bo.ah")
    public Clipboard field716;

    @ObfuscatedName("bo.ax")
    public final EventQueue field690;

    @ObfuscatedName("bo.ai")
    public static volatile boolean field689 = true;

    @ObfuscatedName("bo.as")
    public static long field718 = -1L;

    @ObfuscatedName("bo.au")
    public static long field719 = -1L;

    public class59() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field690 = var1;
        class110.method964(new class52());
    }

    @ObfuscatedName("bo.g(III)V")
    public final void method825(int arg0, int arg1) {
        if (this.field705 != arg0 || this.field706 != arg1) {
            this.method733();
        }
        this.field705 = arg0;
        this.field706 = arg1;
    }

    @ObfuscatedName("bo.m(Ljava/lang/Object;I)V")
    public final void method716(Object arg0) {
        if (this.field690 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field690.peekEvent() != null; var2++) {
            Statics.method2614(1L);
        }
        if (arg0 != null) {
            this.field690.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bo.s(B)Lfr;")
    public class157 method717() {
        if (this.field714 == null) {
            this.field714 = new class50();
            this.field714.method610(this.field708);
        }
        return this.field714;
    }

    @ObfuscatedName("bo.x(B)V")
    public void method718() {
        this.field716 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bo.p(Ljava/lang/String;B)V")
    public void method719(String arg0) {
        this.field716.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bo.k(I)V")
    public final void method720() {
        class51.method2421();
        Canvas var1 = this.field708;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class51.field638);
        var1.addFocusListener(class51.field638);
    }

    @ObfuscatedName("bo.r(B)V")
    public final void method721() {
        Canvas var1 = this.field708;
        var1.addMouseListener(class60.field725);
        var1.addMouseMotionListener(class60.field725);
        var1.addFocusListener(class60.field725);
    }

    @ObfuscatedName("bo.w(I)V")
    public final void method774() {
        Container var1 = this.method749();
        if (var1 == null) {
            return;
        }
        class279 var2 = this.method750();
        this.field710 = Math.max(var2.field3727, this.field703);
        this.field709 = Math.max(var2.field3728, this.field704);
        if (this.field710 <= 0) {
            this.field710 = 1;
        }
        if (this.field709 <= 0) {
            this.field709 = 1;
        }
        Statics.field584 = Math.min(this.field710, this.field705);
        Statics.field248 = Math.min(this.field709, this.field706);
        this.field715 = (this.field710 - Statics.field584) / 2;
        this.field702 = 0;
        this.field708.setSize(Statics.field584, Statics.field248);
        Statics.field418 = new class58(Statics.field584, Statics.field248, this.field708);
        if (this.field692 == var1) {
            Insets var3 = this.field692.getInsets();
            this.field708.setLocation(this.field715 + var3.left, this.field702 + var3.top);
        } else {
            this.field708.setLocation(this.field715, this.field702);
        }
        this.field713 = true;
        this.method789();
    }

    @ObfuscatedName("bo.h(S)V")
    public void method795() {
        int var1 = this.field715;
        int var2 = this.field702;
        int var3 = this.field710 - Statics.field584 - var1;
        int var4 = this.field709 - Statics.field248 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method749();
            int var6 = 0;
            int var7 = 0;
            if (this.field692 == var5) {
                Insets var8 = this.field692.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field709);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field710, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field710 + var6 - var3, var7, var3, this.field709);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field709 + var7 - var4, this.field710, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bo.t(I)V")
    public final void method762() {
        class51.method160(this.field708);
        class60.method2821(this.field708);
        if (this.field714 != null) {
            this.field714.method619(this.field708);
        }
        this.method727();
        Canvas var1 = this.field708;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class51.field638);
        var1.addFocusListener(class51.field638);
        Canvas var2 = this.field708;
        var2.addMouseListener(class60.field725);
        var2.addMouseMotionListener(class60.field725);
        var2.addFocusListener(class60.field725);
        if (this.field714 != null) {
            this.field714.method610(this.field708);
        }
        this.method733();
    }

    @ObfuscatedName("bo.l(IIIB)V")
    public final void method726(int arg0, int arg1, int arg2) {
        try {
            if (field688 != null) {
                field698++;
                if (field698 >= 3) {
                    this.method724("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field688 = this;
            Statics.field584 = arg0;
            Statics.field248 = arg1;
            Statics.field2180 = arg2;
            Statics.field2178 = this;
            if (Statics.field699 == null) {
                Statics.field699 = new class155();
            }
            Statics.field699.method2645(this, 1);
        } catch (Exception var5) {
            class153.method463((String) null, var5);
            this.method724("crash");
        }
    }

    @ObfuscatedName("bo.q(S)V")
    public final synchronized void method727() {
        Container var1 = this.method749();
        if (this.field708 != null) {
            this.field708.removeFocusListener(this);
            var1.remove(this.field708);
        }
        Statics.field584 = Math.max(var1.getWidth(), this.field703);
        Statics.field248 = Math.max(var1.getHeight(), this.field704);
        if (this.field692 != null) {
            Insets var2 = this.field692.getInsets();
            Statics.field584 -= var2.right + var2.left;
            Statics.field248 -= var2.top + var2.bottom;
        }
        this.field708 = new class54(this);
        var1.add(this.field708);
        this.field708.setSize(Statics.field584, Statics.field248);
        this.field708.setVisible(true);
        this.field708.setBackground(Color.BLACK);
        if (this.field692 == var1) {
            Insets var3 = this.field692.getInsets();
            this.field708.setLocation(this.field715 + var3.left, this.field702 + var3.top);
        } else {
            this.field708.setLocation(this.field715, this.field702);
        }
        this.field708.addFocusListener(this);
        this.field708.requestFocus();
        this.field713 = true;
        if (Statics.field418 != null && Statics.field584 == Statics.field418.field3748 && Statics.field248 == Statics.field418.field3750) {
            ((class58) Statics.field418).method699(this.field708);
            Statics.field418.method700(0, 0);
        } else {
            Statics.field418 = new class58(Statics.field584, Statics.field248, this.field708);
        }
        this.field712 = false;
        this.field701 = class176.method2679();
    }

    @ObfuscatedName("bo.f(I)Z")
    public final boolean method728() {
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
                this.method724("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2198 != null) {
                String var1 = Statics.field2198.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2104;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method724("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class271.method6(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class271.method464(var4) && class271.method2621(var4) < 10) {
                            this.method724("wrongjava");
                            return;
                        }
                    }
                    field695 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method727();
            this.method742();
            Statics.field1751 = class159.method2314();
            while (field707 == 0L || class176.method2679() < field707) {
                Statics.field693 = Statics.field1751.method2624(field694, field695);
                for (int var5 = 0; var5 < Statics.field693; var5++) {
                    this.method725();
                }
                this.method740();
                this.method716(this.field708);
            }
        } catch (Exception var7) {
            class153.method463((String) null, var7);
            this.method724("crash");
        }
        this.method734();
    }

    @ObfuscatedName("bo.j(B)V")
    public void method725() {
        long var1 = class176.method2679();
        long var3 = field687[Statics.field2243];
        field687[Statics.field2243] = var1;
        Statics.field2243 = Statics.field2243 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field426 = field689;
        }
        this.method743();
    }

    @ObfuscatedName("bo.n(B)V")
    public void method740() {
        Container var1 = this.method749();
        long var2 = class176.method2679();
        long var4 = field697[Statics.field588];
        field697[Statics.field588] = var2;
        Statics.field588 = Statics.field588 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field696 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field722 - 1 > 50) {
            field722 -= 50;
            this.field713 = true;
            this.field708.setSize(Statics.field584, Statics.field248);
            this.field708.setVisible(true);
            if (this.field692 == var1) {
                Insets var7 = this.field692.getInsets();
                this.field708.setLocation(this.field715 + var7.left, this.field702 + var7.top);
            } else {
                this.field708.setLocation(this.field715, this.field702);
            }
        }
        if (this.field712) {
            this.method762();
        }
        this.method732();
        this.method744(this.field713);
        if (this.field713) {
            this.method795();
        }
        this.field713 = false;
    }

    @ObfuscatedName("bo.z(I)V")
    public final void method732() {
        class279 var1 = this.method750();
        if (this.field710 != var1.field3727 || this.field709 != var1.field3728 || this.field711) {
            this.method774();
            this.field711 = false;
        }
    }

    @ObfuscatedName("bo.ap(I)V")
    public final void method733() {
        this.field711 = true;
    }

    @ObfuscatedName("bo.aj(B)V")
    public final synchronized void method734() {
        if (field691) {
            return;
        }
        field691 = true;
        try {
            this.field708.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method745();
        } catch (Exception var7) {
        }
        if (this.field692 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field699 != null) {
            try {
                Statics.field699.method2658();
            } catch (Exception var5) {
            }
        }
        this.method752();
    }

    public final void start() {
        if (field688 == this && !field691) {
            field707 = 0L;
        }
    }

    public final void stop() {
        if (field688 == this && !field691) {
            field707 = class176.method2679() + 4000L;
        }
    }

    public final void destroy() {
        if (field688 == this && !field691) {
            field707 = class176.method2679();
            Statics.method2614(5000L);
            this.method734();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field688 != this || field691) {
            return;
        }
        this.field713 = true;
        if (class176.method2679() - this.field701 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field584 && var2.height >= Statics.field248) {
                this.field712 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field689 = true;
        this.field713 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field689 = false;
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

    @ObfuscatedName("bo.ab(ILjava/lang/String;ZB)V")
    public final void method746(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field708.getGraphics();
            if (Statics.field309 == null) {
                Statics.field309 = new Font("Helvetica", 1, 13);
                Statics.field255 = this.field708.getFontMetrics(Statics.field309);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field584, Statics.field248);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field2787 == null) {
                    Statics.field2787 = this.field708.createImage(304, 34);
                }
                Graphics var6 = Statics.field2787.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field309);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field255.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field2787, Statics.field584 / 2 - 152, Statics.field248 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field584 / 2 - 152;
                int var9 = Statics.field248 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field309);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field255.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field708.repaint();
        }
    }

    @ObfuscatedName("bo.an(B)V")
    public final void method747() {
        Statics.field2787 = null;
        Statics.field309 = null;
        Statics.field255 = null;
    }

    @ObfuscatedName("bo.at(Ljava/lang/String;I)V")
    public void method724(String arg0) {
        if (this.field717) {
            return;
        }
        this.field717 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bo.aw(I)Ljava/awt/Container;")
    public Container method749() {
        return this.field692 == null ? this : this.field692;
    }

    @ObfuscatedName("bo.ad(I)Lje;")
    public class279 method750() {
        Container var1 = this.method749();
        int var2 = Math.max(var1.getWidth(), this.field703);
        int var3 = Math.max(var1.getHeight(), this.field704);
        if (this.field692 != null) {
            Insets var4 = this.field692.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class279(var2, var3);
    }

    @ObfuscatedName("bo.ac(B)Z")
    public final boolean method751() {
        return this.field692 != null;
    }

    public abstract void init();

    @ObfuscatedName("bo.am(B)V")
    public abstract void method742();

    @ObfuscatedName("bo.ag(I)V")
    public abstract void method743();

    @ObfuscatedName("bo.av(ZI)V")
    public abstract void method744(boolean arg0);

    @ObfuscatedName("bo.al(I)V")
    public abstract void method745();

    @ObfuscatedName("bo.ae(S)V")
    public abstract void method752();

    @ObfuscatedName("bo.v(I)V")
    public abstract void method789();
}
