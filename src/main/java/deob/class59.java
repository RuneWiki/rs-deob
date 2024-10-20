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

@ObfuscatedName("bn")
public abstract class class59 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bn.p")
    public static class59 field677 = null;

    @ObfuscatedName("bn.i")
    public static int field678 = 0;

    @ObfuscatedName("bn.j")
    public static long field693 = 0L;

    @ObfuscatedName("bn.f")
    public static boolean field680 = false;

    @ObfuscatedName("bn.m")
    public boolean field695 = false;

    @ObfuscatedName("bn.z")
    public static int field683 = 20;

    @ObfuscatedName("bn.h")
    public static int field684 = 1;

    @ObfuscatedName("bn.g")
    public static int field685 = 0;

    @ObfuscatedName("bn.a")
    public static long[] field688 = new long[32];

    @ObfuscatedName("bn.b")
    public static long[] field689 = new long[32];

    @ObfuscatedName("bn.v")
    public int field690;

    @ObfuscatedName("bn.t")
    public int field691;

    @ObfuscatedName("bn.l")
    public int field692 = 0;

    @ObfuscatedName("bn.q")
    public int field696 = 0;

    @ObfuscatedName("bn.u")
    public int field694;

    @ObfuscatedName("bn.ae")
    public int field686;

    @ObfuscatedName("bn.ao")
    public int field703;

    @ObfuscatedName("bn.ad")
    public int field697;

    @ObfuscatedName("bn.an")
    public Frame field707;

    @ObfuscatedName("bn.al")
    public Canvas field699;

    @ObfuscatedName("bn.at")
    public volatile boolean field700 = true;

    @ObfuscatedName("bn.ak")
    public static int field701 = 500;

    @ObfuscatedName("bn.as")
    public boolean field676 = false;

    @ObfuscatedName("bn.ah")
    public volatile boolean field698 = false;

    @ObfuscatedName("bn.ab")
    public volatile long field681 = 0L;

    @ObfuscatedName("bn.ax")
    public class50 field705;

    @ObfuscatedName("bn.av")
    public Clipboard field706;

    @ObfuscatedName("bn.aq")
    public final EventQueue field702;

    @ObfuscatedName("bn.af")
    public static volatile boolean field682 = true;

    public class59() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field702 = var1;
        class110.method982(new class52());
    }

    @ObfuscatedName("bn.g(III)V")
    public final void method744(int arg0, int arg1) {
        if (this.field703 != arg0 || this.field697 != arg1) {
            this.method839();
        }
        this.field703 = arg0;
        this.field697 = arg1;
    }

    @ObfuscatedName("bn.e(Ljava/lang/Object;I)V")
    public final void method745(Object arg0) {
        if (this.field702 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field702.peekEvent() != null; var2++) {
            class182.method1713(1L);
        }
        if (arg0 != null) {
            this.field702.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bn.o(I)Lfa;")
    public class157 method746() {
        if (this.field705 == null) {
            this.field705 = new class50();
            this.field705.method629(this.field699);
        }
        return this.field705;
    }

    @ObfuscatedName("bn.x(S)V")
    public void method834() {
        this.field706 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bn.a(Ljava/lang/String;I)V")
    public void method849(String arg0) {
        this.field706.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bn.y(I)V")
    public final void method784() {
        Statics.method460();
        Canvas var1 = this.field699;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class51.field627);
        var1.addFocusListener(class51.field627);
    }

    @ObfuscatedName("bn.r(B)V")
    public final void method750() {
        Canvas var1 = this.field699;
        var1.addMouseListener(class60.field727);
        var1.addMouseMotionListener(class60.field727);
        var1.addFocusListener(class60.field727);
    }

    @ObfuscatedName("bn.w(I)V")
    public final void method813() {
        Container var1 = this.method773();
        if (var1 == null) {
            return;
        }
        class279 var2 = this.method876();
        this.field690 = Math.max(var2.field3740, this.field694);
        this.field691 = Math.max(var2.field3739, this.field686);
        if (this.field690 <= 0) {
            this.field690 = 1;
        }
        if (this.field691 <= 0) {
            this.field691 = 1;
        }
        Statics.field2409 = Math.min(this.field690, this.field703);
        Statics.field22 = Math.min(this.field691, this.field697);
        this.field692 = (this.field690 - Statics.field2409) / 2;
        this.field696 = 0;
        this.field699.setSize(Statics.field2409, Statics.field22);
        Statics.field602 = new class58(Statics.field2409, Statics.field22, this.field699);
        if (this.field707 == var1) {
            Insets var3 = this.field707.getInsets();
            this.field699.setLocation(this.field692 + var3.left, this.field696 + var3.top);
        } else {
            this.field699.setLocation(this.field692, this.field696);
        }
        this.field700 = true;
        this.method749();
    }

    @ObfuscatedName("bn.aa(S)V")
    public void method752() {
        int var1 = this.field692;
        int var2 = this.field696;
        int var3 = this.field690 - Statics.field2409 - var1;
        int var4 = this.field691 - Statics.field22 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method773();
            int var6 = 0;
            int var7 = 0;
            if (this.field707 == var5) {
                Insets var8 = this.field707.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field691);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field690, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field690 + var6 - var3, var7, var3, this.field691);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field691 + var7 - var4, this.field690, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bn.aw(B)V")
    public final void method753() {
        class51.method89(this.field699);
        Canvas var1 = this.field699;
        var1.removeMouseListener(class60.field727);
        var1.removeMouseMotionListener(class60.field727);
        var1.removeFocusListener(class60.field727);
        class60.field713 = 0;
        if (this.field705 != null) {
            this.field705.method628(this.field699);
        }
        this.method755();
        Canvas var2 = this.field699;
        var2.setFocusTraversalKeysEnabled(false);
        var2.addKeyListener(class51.field627);
        var2.addFocusListener(class51.field627);
        Canvas var3 = this.field699;
        var3.addMouseListener(class60.field727);
        var3.addMouseMotionListener(class60.field727);
        var3.addFocusListener(class60.field727);
        if (this.field705 != null) {
            this.field705.method629(this.field699);
        }
        this.method839();
    }

    @ObfuscatedName("bn.an(IIII)V")
    public final void method754(int arg0, int arg1, int arg2) {
        try {
            if (field677 != null) {
                field678++;
                if (field678 >= 3) {
                    this.method772("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field677 = this;
            Statics.field2409 = arg0;
            Statics.field22 = arg1;
            Statics.field2228 = arg2;
            Statics.field305 = this;
            if (Statics.field679 == null) {
                Statics.field679 = new class155();
            }
            Statics.field679.method2715(this, 1);
        } catch (Exception var5) {
            class153.method1609((String) null, var5);
            this.method772("crash");
        }
    }

    @ObfuscatedName("bn.al(I)V")
    public final synchronized void method755() {
        Container var1 = this.method773();
        if (this.field699 != null) {
            this.field699.removeFocusListener(this);
            var1.remove(this.field699);
        }
        Statics.field2409 = Math.max(var1.getWidth(), this.field694);
        Statics.field22 = Math.max(var1.getHeight(), this.field686);
        if (this.field707 != null) {
            Insets var2 = this.field707.getInsets();
            Statics.field2409 -= var2.right + var2.left;
            Statics.field22 -= var2.top + var2.bottom;
        }
        this.field699 = new class54(this);
        var1.add(this.field699);
        this.field699.setSize(Statics.field2409, Statics.field22);
        this.field699.setVisible(true);
        this.field699.setBackground(Color.BLACK);
        if (this.field707 == var1) {
            Insets var3 = this.field707.getInsets();
            this.field699.setLocation(this.field692 + var3.left, this.field696 + var3.top);
        } else {
            this.field699.setLocation(this.field692, this.field696);
        }
        this.field699.addFocusListener(this);
        this.field699.requestFocus();
        this.field700 = true;
        if (Statics.field602 != null && Statics.field2409 == Statics.field602.field3761 && Statics.field22 == Statics.field602.field3760) {
            ((class58) Statics.field602).method726(this.field699);
            Statics.field602.method727(0, 0);
        } else {
            Statics.field602 = new class58(Statics.field2409, Statics.field22, this.field699);
        }
        this.field698 = false;
        this.field681 = class176.method2396();
    }

    @ObfuscatedName("bn.at(I)Z")
    public final boolean method756() {
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
                this.method772("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2242 != null) {
                String var1 = Statics.field2242.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2243;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method772("wrongjava");
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
                        if (class271.method2751(var6) && class271.method3718(var6) < 10) {
                            this.method772("wrongjava");
                            return;
                        }
                    }
                    field684 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method755();
            this.method762();
            class159 var7;
            try {
                var7 = new class151();
            } catch (Throwable var11) {
                var7 = new class152();
            }
            Statics.field704 = var7;
            while (field693 == 0L || class176.method2396() < field693) {
                Statics.field710 = Statics.field704.method2697(field683, field684);
                for (int var9 = 0; var9 < Statics.field710; var9++) {
                    this.method768();
                }
                this.method774();
                this.method745(this.field699);
            }
        } catch (Exception var12) {
            class153.method1609((String) null, var12);
            this.method772("crash");
        }
        this.method761();
    }

    @ObfuscatedName("bn.au(I)V")
    public void method768() {
        long var1 = class176.method2396();
        long var3 = field689[Statics.field572];
        field689[Statics.field572] = var1;
        Statics.field572 = Statics.field572 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field761 = field682;
        }
        this.method837();
    }

    @ObfuscatedName("bn.ak(I)V")
    public void method774() {
        Container var1 = this.method773();
        long var2 = class176.method2396();
        long var4 = field688[Statics.field2838];
        field688[Statics.field2838] = var2;
        Statics.field2838 = Statics.field2838 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field685 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field701 - 1 > 50) {
            field701 -= 50;
            this.field700 = true;
            this.field699.setSize(Statics.field2409, Statics.field22);
            this.field699.setVisible(true);
            if (this.field707 == var1) {
                Insets var7 = this.field707.getInsets();
                this.field699.setLocation(this.field692 + var7.left, this.field696 + var7.top);
            } else {
                this.field699.setLocation(this.field692, this.field696);
            }
        }
        if (this.field698) {
            this.method753();
        }
        this.method760();
        this.method829(this.field700);
        if (this.field700) {
            this.method752();
        }
        this.field700 = false;
    }

    @ObfuscatedName("bn.as(I)V")
    public final void method760() {
        class279 var1 = this.method876();
        if (this.field690 != var1.field3740 || this.field691 != var1.field3739 || this.field676) {
            this.method813();
            this.field676 = false;
        }
    }

    @ObfuscatedName("bn.ah(I)V")
    public final void method839() {
        this.field676 = true;
    }

    @ObfuscatedName("bn.ab(I)V")
    public final synchronized void method761() {
        if (field680) {
            return;
        }
        field680 = true;
        try {
            this.field699.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method769();
        } catch (Exception var7) {
        }
        if (this.field707 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field679 != null) {
            try {
                Statics.field679.method2712();
            } catch (Exception var5) {
            }
        }
        this.method874();
    }

    public final void start() {
        if (field677 == this && !field680) {
            field693 = 0L;
        }
    }

    public final void stop() {
        if (field677 == this && !field680) {
            field693 = class176.method2396() + 4000L;
        }
    }

    public final void destroy() {
        if (field677 == this && !field680) {
            field693 = class176.method2396();
            class182.method1713(5000L);
            this.method761();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field677 != this || field680) {
            return;
        }
        this.field700 = true;
        if (class176.method2396() - this.field681 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field2409 && var2.height >= Statics.field22) {
                this.field698 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field682 = true;
        this.field700 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field682 = false;
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

    @ObfuscatedName("bn.aq(ILjava/lang/String;ZI)V")
    public final void method770(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field699.getGraphics();
            if (Statics.field299 == null) {
                Statics.field299 = new Font("Helvetica", 1, 13);
                Statics.field1881 = this.field699.getFontMetrics(Statics.field299);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field2409, Statics.field22);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field331 == null) {
                    Statics.field331 = this.field699.createImage(304, 34);
                }
                Graphics var6 = Statics.field331.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field299);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field1881.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field331, Statics.field2409 / 2 - 152, Statics.field22 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field2409 / 2 - 152;
                int var9 = Statics.field22 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field299);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field1881.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field699.repaint();
        }
    }

    @ObfuscatedName("bn.af(I)V")
    public final void method771() {
        Statics.field331 = null;
        Statics.field299 = null;
        Statics.field1881 = null;
    }

    @ObfuscatedName("bn.ag(Ljava/lang/String;I)V")
    public void method772(String arg0) {
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

    @ObfuscatedName("bn.ar(I)Ljava/awt/Container;")
    public Container method773() {
        return this.field707 == null ? this : this.field707;
    }

    @ObfuscatedName("bn.aj(B)Ljw;")
    public class279 method876() {
        Container var1 = this.method773();
        int var2 = Math.max(var1.getWidth(), this.field694);
        int var3 = Math.max(var1.getHeight(), this.field686);
        if (this.field707 != null) {
            Insets var4 = this.field707.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class279(var2, var3);
    }

    @ObfuscatedName("bn.ay(I)Z")
    public final boolean method775() {
        return this.field707 != null;
    }

    @ObfuscatedName("bn.u(B)V")
    public abstract void method749();

    @ObfuscatedName("bn.am(I)V")
    public abstract void method762();

    @ObfuscatedName("bn.av(B)V")
    public abstract void method769();

    public abstract void init();

    @ObfuscatedName("bn.ax(ZI)V")
    public abstract void method829(boolean arg0);

    @ObfuscatedName("bn.ac(B)V")
    public abstract void method837();

    @ObfuscatedName("bn.ap(B)V")
    public abstract void method874();
}
