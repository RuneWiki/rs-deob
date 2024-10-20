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

@ObfuscatedName("bt")
public abstract class class59 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bt.s")
    public static class59 field642 = null;

    @ObfuscatedName("bt.r")
    public static int field664 = 0;

    @ObfuscatedName("bt.g")
    public static long field643 = 0L;

    @ObfuscatedName("bt.f")
    public static boolean field644 = false;

    @ObfuscatedName("bt.u")
    public boolean field645 = false;

    @ObfuscatedName("bt.k")
    public static int field646 = 20;

    @ObfuscatedName("bt.n")
    public static int field669 = 1;

    @ObfuscatedName("bt.d")
    public static int field658 = 0;

    @ObfuscatedName("bt.q")
    public static long[] field640 = new long[32];

    @ObfuscatedName("bt.m")
    public static long[] field652 = new long[32];

    @ObfuscatedName("bt.c")
    public int field653;

    @ObfuscatedName("bt.p")
    public int field663;

    @ObfuscatedName("bt.i")
    public int field655 = 0;

    @ObfuscatedName("bt.l")
    public int field656 = 0;

    @ObfuscatedName("bt.v")
    public int field657;

    @ObfuscatedName("bt.av")
    public int field647;

    @ObfuscatedName("bt.au")
    public int field659;

    @ObfuscatedName("bt.ae")
    public int field660;

    @ObfuscatedName("bt.an")
    public Frame field661;

    @ObfuscatedName("bt.am")
    public Canvas field662;

    @ObfuscatedName("bt.ar")
    public volatile boolean field654 = true;

    @ObfuscatedName("bt.at")
    public static int field648 = 500;

    @ObfuscatedName("bt.ac")
    public boolean field665 = false;

    @ObfuscatedName("bt.as")
    public volatile boolean field666 = false;

    @ObfuscatedName("bt.ah")
    public volatile long field667 = 0L;

    @ObfuscatedName("bt.aj")
    public class50 field668;

    @ObfuscatedName("bt.ap")
    public Clipboard field649;

    @ObfuscatedName("bt.ag")
    public final EventQueue field670;

    @ObfuscatedName("bt.af")
    public static volatile boolean field651 = true;

    @ObfuscatedName("bt.ax")
    public static long field672 = -1L;

    @ObfuscatedName("bt.ai")
    public static long field673 = -1L;

    public class59() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field670 = var1;
        class52 var3 = new class52();
        Statics.field1541 = var3;
    }

    @ObfuscatedName("bt.d(III)V")
    public final void method710(int arg0, int arg1) {
        if (this.field659 != arg0 || this.field660 != arg1) {
            this.method817();
        }
        this.field659 = arg0;
        this.field660 = arg1;
    }

    @ObfuscatedName("bt.o(Ljava/lang/Object;I)V")
    public final void method711(Object arg0) {
        if (this.field670 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field670.peekEvent() != null; var2++) {
            class189.method2888(1L);
        }
        if (arg0 != null) {
            this.field670.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bt.a(B)Lft;")
    public class158 method737() {
        if (this.field668 == null) {
            this.field668 = new class50();
            this.field668.method609(this.field662);
        }
        return this.field668;
    }

    @ObfuscatedName("bt.q(B)V")
    public void method764() {
        this.field649 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bt.j(Ljava/lang/String;B)V")
    public void method729(String arg0) {
        this.field649.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bt.c(I)V")
    public final void method714() {
        class51.method2673();
        class51.method595(this.field662);
    }

    @ObfuscatedName("bt.i(B)V")
    public final void method796() {
        class60.method967(this.field662);
    }

    @ObfuscatedName("bt.e(B)V")
    public final void method716() {
        Container var1 = this.method739();
        if (var1 == null) {
            return;
        }
        class288 var2 = this.method740();
        this.field653 = Math.max(var2.field3792, this.field657);
        this.field663 = Math.max(var2.field3790, this.field647);
        if (this.field653 <= 0) {
            this.field653 = 1;
        }
        if (this.field663 <= 0) {
            this.field663 = 1;
        }
        Statics.field764 = Math.min(this.field653, this.field659);
        Statics.field1394 = Math.min(this.field663, this.field660);
        this.field655 = (this.field653 - Statics.field764) / 2;
        this.field656 = 0;
        this.field662.setSize(Statics.field764, Statics.field1394);
        Statics.field3228 = new class58(Statics.field764, Statics.field1394, this.field662);
        if (this.field661 == var1) {
            Insets var3 = this.field661.getInsets();
            this.field662.setLocation(this.field655 + var3.left, this.field656 + var3.top);
        } else {
            this.field662.setLocation(this.field655, this.field656);
        }
        this.field654 = true;
        this.method717();
    }

    @ObfuscatedName("bt.w(I)V")
    public void method806() {
        int var1 = this.field655;
        int var2 = this.field656;
        int var3 = this.field653 - Statics.field764 - var1;
        int var4 = this.field663 - Statics.field1394 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method739();
            int var6 = 0;
            int var7 = 0;
            if (this.field661 == var5) {
                Insets var8 = this.field661.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field663);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field653, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field653 + var6 - var3, var7, var3, this.field663);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field663 + var7 - var4, this.field653, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bt.av(B)V")
    public final void method719() {
        Canvas var1 = this.field662;
        var1.removeKeyListener(class51.field601);
        var1.removeFocusListener(class51.field601);
        class51.field592 = -1;
        Canvas var2 = this.field662;
        var2.removeMouseListener(class60.field676);
        var2.removeMouseMotionListener(class60.field676);
        var2.removeFocusListener(class60.field676);
        class60.field678 = 0;
        if (this.field668 != null) {
            this.field668.method614(this.field662);
        }
        this.method721();
        class51.method595(this.field662);
        class60.method967(this.field662);
        if (this.field668 != null) {
            this.field668.method609(this.field662);
        }
        this.method817();
    }

    @ObfuscatedName("bt.au(IIII)V")
    public final void method720(int arg0, int arg1, int arg2) {
        try {
            if (field642 != null) {
                field664++;
                if (field664 >= 3) {
                    this.method738("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field642 = this;
            Statics.field764 = arg0;
            Statics.field1394 = arg1;
            Statics.field2122 = arg2;
            Statics.field2121 = this;
            if (Statics.field671 == null) {
                Statics.field671 = new class156();
            }
            Statics.field671.method2739(this, 1);
        } catch (Exception var5) {
            class154.method607((String) null, var5);
            this.method738("crash");
        }
    }

    @ObfuscatedName("bt.ae(I)V")
    public final synchronized void method721() {
        Container var1 = this.method739();
        if (this.field662 != null) {
            this.field662.removeFocusListener(this);
            var1.remove(this.field662);
        }
        Statics.field764 = Math.max(var1.getWidth(), this.field657);
        Statics.field1394 = Math.max(var1.getHeight(), this.field647);
        if (this.field661 != null) {
            Insets var2 = this.field661.getInsets();
            Statics.field764 -= var2.right + var2.left;
            Statics.field1394 -= var2.top + var2.bottom;
        }
        this.field662 = new class54(this);
        var1.add(this.field662);
        this.field662.setSize(Statics.field764, Statics.field1394);
        this.field662.setVisible(true);
        this.field662.setBackground(Color.BLACK);
        if (this.field661 == var1) {
            Insets var3 = this.field661.getInsets();
            this.field662.setLocation(this.field655 + var3.left, this.field656 + var3.top);
        } else {
            this.field662.setLocation(this.field655, this.field656);
        }
        this.field662.addFocusListener(this);
        this.field662.requestFocus();
        this.field654 = true;
        if (Statics.field3228 != null && Statics.field764 == Statics.field3228.field3814 && Statics.field1394 == Statics.field3228.field3813) {
            ((class58) Statics.field3228).method694(this.field662);
            Statics.field3228.method704(0, 0);
        } else {
            Statics.field3228 = new class58(Statics.field764, Statics.field1394, this.field662);
        }
        this.field666 = false;
        this.field667 = class183.method1711();
    }

    @ObfuscatedName("bt.ak(I)Z")
    public final boolean method833() {
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
                this.method738("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2140 != null) {
                String var1 = Statics.field2140.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2135;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method738("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class278.method4574(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class278.method2672(var4)) {
                            int var5 = class278.method913(var4, 10, true);
                            if (var5 < 10) {
                                this.method738("wrongjava");
                                return;
                            }
                        }
                    }
                    field669 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method721();
            this.method844();
            class160 var6;
            try {
                var6 = new class152();
            } catch (Throwable var10) {
                var6 = new class153();
            }
            Statics.field641 = var6;
            while (field643 == 0L || class183.method1711() < field643) {
                Statics.field3260 = Statics.field641.method2706(field646, field669);
                for (int var8 = 0; var8 < Statics.field3260; var8++) {
                    this.method723();
                }
                this.method732();
                this.method711(this.field662);
            }
        } catch (Exception var11) {
            class154.method607((String) null, var11);
            this.method738("crash");
        }
        this.method794();
    }

    @ObfuscatedName("bt.aq(I)V")
    public void method723() {
        long var1 = class183.method1711();
        long var3 = field652[Statics.field789];
        field652[Statics.field789] = var1;
        Statics.field789 = Statics.field789 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field609 = field651;
        }
        this.method773();
    }

    @ObfuscatedName("bt.an(B)V")
    public void method732() {
        Container var1 = this.method739();
        long var2 = class183.method1711();
        long var4 = field640[Statics.field3335];
        field640[Statics.field3335] = var2;
        Statics.field3335 = Statics.field3335 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field658 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field648 - 1 > 50) {
            field648 -= 50;
            this.field654 = true;
            this.field662.setSize(Statics.field764, Statics.field1394);
            this.field662.setVisible(true);
            if (this.field661 == var1) {
                Insets var7 = this.field661.getInsets();
                this.field662.setLocation(this.field655 + var7.left, this.field656 + var7.top);
            } else {
                this.field662.setLocation(this.field655, this.field656);
            }
        }
        if (this.field666) {
            this.method719();
        }
        this.method828();
        this.method734(this.field654);
        if (this.field654) {
            this.method806();
        }
        this.field654 = false;
    }

    @ObfuscatedName("bt.am(I)V")
    public final void method828() {
        class288 var1 = this.method740();
        if (this.field653 != var1.field3792 || this.field663 != var1.field3790 || this.field665) {
            this.method716();
            this.field665 = false;
        }
    }

    @ObfuscatedName("bt.ar(B)V")
    public final void method817() {
        this.field665 = true;
    }

    @ObfuscatedName("bt.ao(B)V")
    public final synchronized void method794() {
        if (field644) {
            return;
        }
        field644 = true;
        try {
            this.field662.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method735();
        } catch (Exception var7) {
        }
        if (this.field661 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field671 != null) {
            try {
                Statics.field671.method2723();
            } catch (Exception var5) {
            }
        }
        this.method742();
    }

    @ObfuscatedName("bi.at(B)V")
    public static final void method651() {
        Statics.field641.method2709();
        for (int var0 = 0; var0 < 32; var0++) {
            field640[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field652[var1] = 0L;
        }
        Statics.field3260 = 0;
    }

    public final void start() {
        if (field642 == this && !field644) {
            field643 = 0L;
        }
    }

    public final void stop() {
        if (field642 == this && !field644) {
            field643 = class183.method1711() + 4000L;
        }
    }

    public final void destroy() {
        if (field642 == this && !field644) {
            field643 = class183.method1711();
            class189.method2888(5000L);
            this.method794();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field642 != this || field644) {
            return;
        }
        this.field654 = true;
        if (class183.method1711() - this.field667 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field764 && var2.height >= Statics.field1394) {
                this.field666 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field651 = true;
        this.field654 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field651 = false;
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

    @ObfuscatedName("bt.al(ILjava/lang/String;ZI)V")
    public final void method755(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field662.getGraphics();
            if (Statics.field3788 == null) {
                Statics.field3788 = new Font("Helvetica", 1, 13);
                Statics.field738 = this.field662.getFontMetrics(Statics.field3788);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field764, Statics.field1394);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field3338 == null) {
                    Statics.field3338 = this.field662.createImage(304, 34);
                }
                Graphics var6 = Statics.field3338.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field3788);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field738.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field3338, Statics.field764 / 2 - 152, Statics.field1394 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field764 / 2 - 152;
                int var9 = Statics.field1394 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field3788);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field738.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field662.repaint();
        }
    }

    @ObfuscatedName("bt.aj(I)V")
    public final void method713() {
        Statics.field3338 = null;
        Statics.field3788 = null;
        Statics.field738 = null;
    }

    @ObfuscatedName("bt.ap(Ljava/lang/String;I)V")
    public void method738(String arg0) {
        if (this.field645) {
            return;
        }
        this.field645 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bt.ag(I)Ljava/awt/Container;")
    public Container method739() {
        return this.field661 == null ? this : this.field661;
    }

    @ObfuscatedName("bt.af(I)Lkr;")
    public class288 method740() {
        Container var1 = this.method739();
        int var2 = Math.max(var1.getWidth(), this.field657);
        int var3 = Math.max(var1.getHeight(), this.field647);
        if (this.field661 != null) {
            Insets var4 = this.field661.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class288(var2, var3);
    }

    @ObfuscatedName("bt.ay(B)Z")
    public final boolean method741() {
        return this.field661 != null;
    }

    @ObfuscatedName("ia.ab(I)I")
    public static int method3992() {
        int var0 = 0;
        if (Statics.field3709 == null || !Statics.field3709.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field3709 = var2;
                        field673 = -1L;
                        field672 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field3709 != null) {
            long var4 = class183.method1711();
            long var6 = Statics.field3709.getCollectionTime();
            if (field672 != -1L) {
                long var8 = var6 - field672;
                long var10 = var4 - field673;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field672 = var6;
            field673 = var4;
        }
        return var0;
    }

    @ObfuscatedName("bt.v(I)V")
    public abstract void method717();

    public abstract void init();

    @ObfuscatedName("bt.ah(ZI)V")
    public abstract void method734(boolean arg0);

    @ObfuscatedName("bt.aw(B)V")
    public abstract void method735();

    @ObfuscatedName("bt.ax(I)V")
    public abstract void method742();

    @ObfuscatedName("bt.as(B)V")
    public abstract void method773();

    @ObfuscatedName("bt.ac(B)V")
    public abstract void method844();
}
