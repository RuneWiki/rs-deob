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

@ObfuscatedName("bt")
public abstract class class59 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bt.g")
    public static class59 field650 = null;

    @ObfuscatedName("bt.m")
    public static int field649 = 0;

    @ObfuscatedName("bt.h")
    public static long field672 = 0L;

    @ObfuscatedName("bt.i")
    public static boolean field651 = false;

    @ObfuscatedName("bt.t")
    public boolean field670 = false;

    @ObfuscatedName("bt.z")
    public static int field654 = 20;

    @ObfuscatedName("bt.k")
    public static int field655 = 1;

    @ObfuscatedName("bt.c")
    public static int field656 = 0;

    @ObfuscatedName("bt.f")
    public static long[] field676 = new long[32];

    @ObfuscatedName("bt.r")
    public static long[] field677 = new long[32];

    @ObfuscatedName("bt.b")
    public int field659;

    @ObfuscatedName("bt.p")
    public int field660;

    @ObfuscatedName("bt.n")
    public int field661 = 0;

    @ObfuscatedName("bt.j")
    public int field662 = 0;

    @ObfuscatedName("bt.a")
    public int field664;

    @ObfuscatedName("bt.ad")
    public int field665;

    @ObfuscatedName("bt.al")
    public int field675;

    @ObfuscatedName("bt.aq")
    public int field667;

    @ObfuscatedName("bt.af")
    public Frame field668;

    @ObfuscatedName("bt.as")
    public Canvas field647;

    @ObfuscatedName("bt.ax")
    public volatile boolean field666 = true;

    @ObfuscatedName("bt.aw")
    public static int field671 = 500;

    @ObfuscatedName("bt.ai")
    public boolean field657 = false;

    @ObfuscatedName("bt.ab")
    public volatile boolean field673 = false;

    @ObfuscatedName("bt.am")
    public volatile long field674 = 0L;

    @ObfuscatedName("bt.az")
    public class50 field648;

    @ObfuscatedName("bt.ae")
    public Clipboard field652;

    @ObfuscatedName("bt.ao")
    public final EventQueue field680;

    @ObfuscatedName("bt.av")
    public static volatile boolean field678 = true;

    @ObfuscatedName("bt.au")
    public static long field679 = -1L;

    @ObfuscatedName("bt.ay")
    public static long field658 = -1L;

    public class59() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field680 = var1;
        class52 var3 = new class52();
        Statics.field376 = var3;
    }

    @ObfuscatedName("bt.t(III)V")
    public final void method715(int arg0, int arg1) {
        if (this.field675 != arg0 || this.field667 != arg1) {
            this.method772();
        }
        this.field675 = arg0;
        this.field667 = arg1;
    }

    @ObfuscatedName("bt.d(Ljava/lang/Object;I)V")
    public final void method716(Object arg0) {
        if (this.field680 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field680.peekEvent() != null; var2++) {
            class193.method2520(1L);
        }
        if (arg0 != null) {
            this.field680.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bt.z(I)Lfa;")
    public class159 method847() {
        if (this.field648 == null) {
            this.field648 = new class50();
            this.field648.method617(this.field647);
        }
        return this.field648;
    }

    @ObfuscatedName("bt.k(I)V")
    public void method765() {
        this.field652 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bt.c(Ljava/lang/String;I)V")
    public void method719(String arg0) {
        this.field652.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bt.o(I)V")
    public final void method755() {
        class51.method4338();
        Statics.method1562(this.field647);
    }

    @ObfuscatedName("bt.l(I)V")
    public final void method721() {
        Canvas var1 = this.field647;
        var1.addMouseListener(class60.field685);
        var1.addMouseMotionListener(class60.field685);
        var1.addFocusListener(class60.field685);
    }

    @ObfuscatedName("bt.f(I)V")
    public final void method763() {
        Container var1 = this.method746();
        if (var1 == null) {
            return;
        }
        class303 var2 = this.method747();
        this.field659 = Math.max(var2.field3859, this.field664);
        this.field660 = Math.max(var2.field3860, this.field665);
        if (this.field659 <= 0) {
            this.field659 = 1;
        }
        if (this.field660 <= 0) {
            this.field660 = 1;
        }
        Statics.field663 = Math.min(this.field659, this.field675);
        Statics.field2191 = Math.min(this.field660, this.field667);
        this.field661 = (this.field659 - Statics.field663) / 2;
        this.field662 = 0;
        this.field647.setSize(Statics.field663, Statics.field2191);
        Statics.field336 = new class58(Statics.field663, Statics.field2191, this.field647);
        if (this.field668 == var1) {
            Insets var3 = this.field668.getInsets();
            this.field647.setLocation(this.field661 + var3.left, this.field662 + var3.top);
        } else {
            this.field647.setLocation(this.field661, this.field662);
        }
        this.field666 = true;
        this.method723();
    }

    @ObfuscatedName("bt.r(I)V")
    public void method831() {
        int var1 = this.field661;
        int var2 = this.field662;
        int var3 = this.field659 - Statics.field663 - var1;
        int var4 = this.field660 - Statics.field2191 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method746();
            int var6 = 0;
            int var7 = 0;
            if (this.field668 == var5) {
                Insets var8 = this.field668.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field660);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field659, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field659 + var6 - var3, var7, var3, this.field660);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field660 + var7 - var4, this.field659, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bt.x(I)V")
    public final void method820() {
        Canvas var1 = this.field647;
        var1.removeKeyListener(class51.field620);
        var1.removeFocusListener(class51.field620);
        class51.field615 = -1;
        Canvas var2 = this.field647;
        var2.removeMouseListener(class60.field685);
        var2.removeMouseMotionListener(class60.field685);
        var2.removeFocusListener(class60.field685);
        class60.field687 = 0;
        if (this.field648 != null) {
            this.field648.method616(this.field647);
        }
        this.method727();
        Statics.method1562(this.field647);
        class60.method49(this.field647);
        if (this.field648 != null) {
            this.field648.method617(this.field647);
        }
        this.method772();
    }

    @ObfuscatedName("bt.u(IIIB)V")
    public final void method806(int arg0, int arg1, int arg2) {
        try {
            if (field650 != null) {
                field649++;
                if (field649 >= 3) {
                    this.method745("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field650 = this;
            Statics.field663 = arg0;
            Statics.field2191 = arg1;
            Statics.field2119 = arg2;
            Statics.field2123 = this;
            if (Statics.field669 == null) {
                Statics.field669 = new class157();
            }
            Statics.field669.method2993(this, 1);
        } catch (Exception var5) {
            class155.method73((String) null, var5);
            this.method745("crash");
        }
    }

    @ObfuscatedName("bt.an(I)V")
    public final synchronized void method727() {
        Container var1 = this.method746();
        if (this.field647 != null) {
            this.field647.removeFocusListener(this);
            var1.remove(this.field647);
        }
        Statics.field663 = Math.max(var1.getWidth(), this.field664);
        Statics.field2191 = Math.max(var1.getHeight(), this.field665);
        if (this.field668 != null) {
            Insets var2 = this.field668.getInsets();
            Statics.field663 -= var2.right + var2.left;
            Statics.field2191 -= var2.top + var2.bottom;
        }
        this.field647 = new class54(this);
        var1.add(this.field647);
        this.field647.setSize(Statics.field663, Statics.field2191);
        this.field647.setVisible(true);
        this.field647.setBackground(Color.BLACK);
        if (this.field668 == var1) {
            Insets var3 = this.field668.getInsets();
            this.field647.setLocation(this.field661 + var3.left, this.field662 + var3.top);
        } else {
            this.field647.setLocation(this.field661, this.field662);
        }
        this.field647.addFocusListener(this);
        this.field647.requestFocus();
        this.field666 = true;
        if (Statics.field336 != null && Statics.field663 == Statics.field336.field3879 && Statics.field2191 == Statics.field336.field3880) {
            ((class58) Statics.field336).method695(this.field647);
            Statics.field336.method698(0, 0);
        } else {
            Statics.field336 = new class58(Statics.field663, Statics.field2191, this.field647);
        }
        this.field673 = false;
        this.field674 = class187.method2705();
    }

    @ObfuscatedName("bt.af(B)Z")
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
                this.method745("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2534 != null) {
                String var1 = Statics.field2534.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2140;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method745("wrongjava");
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
                            label177: {
                                char var12 = var6.charAt(var11);
                                if (var11 == 0) {
                                    if (var12 == '-') {
                                        var7 = true;
                                        break label177;
                                    }
                                    if (var12 == '+') {
                                        break label177;
                                    }
                                }
                                int var20;
                                if (var12 >= '0' && var12 <= '9') {
                                    var20 = var12 - '0';
                                } else if (var12 >= 'A' && var12 <= 'Z') {
                                    var20 = var12 - '7';
                                } else {
                                    if (var12 < 'a' || var12 > 'z') {
                                        var13 = false;
                                        break;
                                    }
                                    var20 = var12 - 'W';
                                }
                                if (var20 >= 10) {
                                    var13 = false;
                                    break;
                                }
                                if (var7) {
                                    var20 = -var20;
                                }
                                int var14 = var9 * 10 + var20;
                                if (var14 / 10 != var9) {
                                    var13 = false;
                                    break;
                                }
                                var9 = var14;
                                var8 = true;
                            }
                            var11++;
                        }
                        if (var13) {
                            int var16 = class294.method1818(var6, 10, true);
                            if (var16 < 10) {
                                this.method745("wrongjava");
                                return;
                            }
                        }
                    }
                    field655 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method727();
            this.method766();
            Statics.field492 = class163.method2918();
            while (field672 == 0L || class187.method2705() < field672) {
                Statics.field653 = Statics.field492.method2955(field654, field655);
                for (int var17 = 0; var17 < Statics.field653; var17++) {
                    this.method799();
                }
                this.method731();
                this.method716(this.field647);
            }
        } catch (Exception var19) {
            class155.method73((String) null, var19);
            this.method745("crash");
        }
        this.method734();
    }

    @ObfuscatedName("bt.as(B)V")
    public void method799() {
        long var1 = class187.method2705();
        long var3 = field677[Statics.field2236];
        field677[Statics.field2236] = var1;
        Statics.field2236 = Statics.field2236 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field15 = field678;
        }
        this.method740();
    }

    @ObfuscatedName("bt.ax(I)V")
    public void method731() {
        Container var1 = this.method746();
        long var2 = class187.method2705();
        long var4 = field676[Statics.field3275];
        field676[Statics.field3275] = var2;
        Statics.field3275 = Statics.field3275 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field656 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field671 - 1 > 50) {
            field671 -= 50;
            this.field666 = true;
            this.field647.setSize(Statics.field663, Statics.field2191);
            this.field647.setVisible(true);
            if (this.field668 == var1) {
                Insets var7 = this.field668.getInsets();
                this.field647.setLocation(this.field661 + var7.left, this.field662 + var7.top);
            } else {
                this.field647.setLocation(this.field661, this.field662);
            }
        }
        if (this.field673) {
            this.method820();
        }
        this.method732();
        this.method752(this.field666);
        if (this.field666) {
            this.method831();
        }
        this.field666 = false;
    }

    @ObfuscatedName("bt.ak(B)V")
    public final void method732() {
        class303 var1 = this.method747();
        if (this.field659 != var1.field3859 || this.field660 != var1.field3860 || this.field657) {
            this.method763();
            this.field657 = false;
        }
    }

    @ObfuscatedName("bt.aw(I)V")
    public final void method772() {
        this.field657 = true;
    }

    @ObfuscatedName("bt.ai(I)V")
    public final synchronized void method734() {
        if (field651) {
            return;
        }
        field651 = true;
        try {
            this.field647.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method844();
        } catch (Exception var7) {
        }
        if (this.field668 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field669 != null) {
            try {
                Statics.field669.method2992();
            } catch (Exception var5) {
            }
        }
        this.method749();
    }

    public final void start() {
        if (field650 == this && !field651) {
            field672 = 0L;
        }
    }

    public final void stop() {
        if (field650 == this && !field651) {
            field672 = class187.method2705() + 4000L;
        }
    }

    public final void destroy() {
        if (field650 == this && !field651) {
            field672 = class187.method2705();
            class193.method2520(5000L);
            this.method734();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field650 != this || field651) {
            return;
        }
        this.field666 = true;
        if (class187.method2705() - this.field674 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field663 && var2.height >= Statics.field2191) {
                this.field673 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field678 = true;
        this.field666 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field678 = false;
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

    @ObfuscatedName("bt.az(ILjava/lang/String;ZB)V")
    public final void method774(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field647.getGraphics();
            if (Statics.field3458 == null) {
                Statics.field3458 = new Font("Helvetica", 1, 13);
                Statics.field1463 = this.field647.getFontMetrics(Statics.field3458);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field663, Statics.field2191);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field3713 == null) {
                    Statics.field3713 = this.field647.createImage(304, 34);
                }
                Graphics var6 = Statics.field3713.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field3458);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field1463.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field3713, Statics.field663 / 2 - 152, Statics.field2191 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field663 / 2 - 152;
                int var9 = Statics.field2191 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field3458);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field1463.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field647.repaint();
        }
    }

    @ObfuscatedName("bt.ae(B)V")
    public final void method744() {
        Statics.field3713 = null;
        Statics.field3458 = null;
        Statics.field1463 = null;
    }

    @ObfuscatedName("bt.ao(Ljava/lang/String;B)V")
    public void method745(String arg0) {
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

    @ObfuscatedName("bt.av(I)Ljava/awt/Container;")
    public Container method746() {
        return this.field668 == null ? this : this.field668;
    }

    @ObfuscatedName("bt.aj(I)Lkk;")
    public class303 method747() {
        Container var1 = this.method746();
        int var2 = Math.max(var1.getWidth(), this.field664);
        int var3 = Math.max(var1.getHeight(), this.field665);
        if (this.field668 != null) {
            Insets var4 = this.field668.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class303(var2, var3);
    }

    @ObfuscatedName("bt.ap(B)Z")
    public final boolean method748() {
        return this.field668 != null;
    }

    @ObfuscatedName("bt.q(B)V")
    public abstract void method723();

    @ObfuscatedName("bt.am(B)V")
    public abstract void method740();

    @ObfuscatedName("bt.au(I)V")
    public abstract void method749();

    @ObfuscatedName("bt.ah(ZI)V")
    public abstract void method752(boolean arg0);

    @ObfuscatedName("bt.ab(I)V")
    public abstract void method766();

    public abstract void init();

    @ObfuscatedName("bt.ag(B)V")
    public abstract void method844();
}
