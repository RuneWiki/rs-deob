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

    @ObfuscatedName("bn.k")
    public static class59 field704 = null;

    @ObfuscatedName("bn.e")
    public static int field719 = 0;

    @ObfuscatedName("bn.p")
    public static long field706 = 0L;

    @ObfuscatedName("bn.q")
    public static boolean field707 = false;

    @ObfuscatedName("bn.s")
    public boolean field705 = false;

    @ObfuscatedName("bn.g")
    public static int field709 = 20;

    @ObfuscatedName("bn.v")
    public static int field710 = 1;

    @ObfuscatedName("bn.t")
    public static int field711 = 0;

    @ObfuscatedName("bn.u")
    public static long[] field712 = new long[32];

    @ObfuscatedName("bn.f")
    public static long[] field732 = new long[32];

    @ObfuscatedName("bn.c")
    public int field714;

    @ObfuscatedName("bn.h")
    public int field715;

    @ObfuscatedName("bn.a")
    public int field734 = 0;

    @ObfuscatedName("bn.z")
    public int field724 = 0;

    @ObfuscatedName("bn.m")
    public int field718;

    @ObfuscatedName("bn.ae")
    public int field708;

    @ObfuscatedName("bn.ai")
    public int field720;

    @ObfuscatedName("bn.ah")
    public int field721;

    @ObfuscatedName("bn.ag")
    public Frame field723;

    @ObfuscatedName("bn.as")
    public Canvas field735;

    @ObfuscatedName("bn.af")
    public volatile boolean field713 = true;

    @ObfuscatedName("bn.am")
    public static int field726 = 500;

    @ObfuscatedName("bn.az")
    public boolean field717 = false;

    @ObfuscatedName("bn.av")
    public volatile boolean field728 = false;

    @ObfuscatedName("bn.an")
    public volatile long field729 = 0L;

    @ObfuscatedName("bn.aj")
    public class50 field730;

    @ObfuscatedName("bn.ap")
    public Clipboard field716;

    @ObfuscatedName("bn.ao")
    public final EventQueue field736;

    @ObfuscatedName("bn.at")
    public static volatile boolean field733 = true;

    @ObfuscatedName("bn.ac")
    public static long field731 = -1L;

    @ObfuscatedName("bn.au")
    public static long field725 = -1L;

    public class59() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field736 = var1;
        class52 var3 = new class52();
        Statics.field1615 = var3;
    }

    @ObfuscatedName("bn.r(III)V")
    public final void method771(int arg0, int arg1) {
        if (this.field720 != arg0 || this.field721 != arg1) {
            this.method788();
        }
        this.field720 = arg0;
        this.field721 = arg1;
    }

    @ObfuscatedName("bn.g(Ljava/lang/Object;I)V")
    public final void method772(Object arg0) {
        if (this.field736 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field736.peekEvent() != null; var2++) {
            class182.method3711(1L);
        }
        if (arg0 != null) {
            this.field736.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bn.v(I)Lfb;")
    public class157 method844() {
        if (this.field730 == null) {
            this.field730 = new class50();
            this.field730.method650(this.field735);
        }
        return this.field730;
    }

    @ObfuscatedName("bn.t(I)V")
    public void method774() {
        this.field716 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bn.y(Ljava/lang/String;I)V")
    public void method775(String arg0) {
        this.field716.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bn.o(I)V")
    public final void method776() {
        if (Statics.field2248.toLowerCase().indexOf("microsoft") == -1) {
            class51.field668[44] = 71;
            class51.field668[45] = 26;
            class51.field668[46] = 72;
            class51.field668[47] = 73;
            class51.field668[59] = 57;
            class51.field668[61] = 27;
            class51.field668[91] = 42;
            class51.field668[92] = 74;
            class51.field668[93] = 43;
            class51.field668[192] = 28;
            class51.field668[222] = 58;
            class51.field668[520] = 59;
        } else {
            class51.field668[186] = 57;
            class51.field668[187] = 27;
            class51.field668[188] = 71;
            class51.field668[189] = 26;
            class51.field668[190] = 72;
            class51.field668[191] = 73;
            class51.field668[192] = 58;
            class51.field668[219] = 42;
            class51.field668[220] = 74;
            class51.field668[221] = 43;
            class51.field668[222] = 59;
            class51.field668[223] = 28;
        }
        class51.method4160(this.field735);
    }

    @ObfuscatedName("bn.i(I)V")
    public final void method823() {
        Canvas var1 = this.field735;
        var1.addMouseListener(class60.field740);
        var1.addMouseMotionListener(class60.field740);
        var1.addFocusListener(class60.field740);
    }

    @ObfuscatedName("bn.u(B)V")
    public final void method777() {
        Container var1 = this.method801();
        if (var1 == null) {
            return;
        }
        class280 var2 = this.method835();
        this.field714 = Math.max(var2.field3755, this.field718);
        this.field715 = Math.max(var2.field3756, this.field708);
        if (this.field714 <= 0) {
            this.field714 = 1;
        }
        if (this.field715 <= 0) {
            this.field715 = 1;
        }
        Statics.field762 = Math.min(this.field714, this.field720);
        Statics.field633 = Math.min(this.field715, this.field721);
        this.field734 = (this.field714 - Statics.field762) / 2;
        this.field724 = 0;
        this.field735.setSize(Statics.field762, Statics.field633);
        Statics.field276 = new class58(Statics.field762, Statics.field633, this.field735);
        if (this.field723 == var1) {
            Insets var3 = this.field723.getInsets();
            this.field735.setLocation(this.field734 + var3.left, this.field724 + var3.top);
        } else {
            this.field735.setLocation(this.field734, this.field724);
        }
        this.field713 = true;
        this.method779();
    }

    @ObfuscatedName("bn.c(I)V")
    public void method770() {
        int var1 = this.field734;
        int var2 = this.field724;
        int var3 = this.field714 - Statics.field762 - var1;
        int var4 = this.field715 - Statics.field633 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method801();
            int var6 = 0;
            int var7 = 0;
            if (this.field723 == var5) {
                Insets var8 = this.field723.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field715);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field714, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field714 + var6 - var3, var7, var3, this.field715);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field715 + var7 - var4, this.field714, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bn.h(I)V")
    public final void method781() {
        class51.method1590(this.field735);
        Canvas var1 = this.field735;
        var1.removeMouseListener(class60.field740);
        var1.removeMouseMotionListener(class60.field740);
        var1.removeFocusListener(class60.field740);
        class60.field741 = 0;
        if (this.field730 != null) {
            this.field730.method663(this.field735);
        }
        this.method913();
        class51.method4160(this.field735);
        class60.method574(this.field735);
        if (this.field730 != null) {
            this.field730.method650(this.field735);
        }
        this.method788();
    }

    @ObfuscatedName("bn.a(IIIB)V")
    public final void method782(int arg0, int arg1, int arg2) {
        try {
            if (field704 != null) {
                field719++;
                if (field719 >= 3) {
                    this.method800("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field704 = this;
            Statics.field762 = arg0;
            Statics.field633 = arg1;
            Statics.field2224 = arg2;
            Statics.field2231 = this;
            if (Statics.field727 == null) {
                Statics.field727 = new class155();
            }
            Statics.field727.method2774(this, 1);
        } catch (Exception var5) {
            class153.method1775((String) null, var5);
            this.method800("crash");
        }
    }

    @ObfuscatedName("bn.ai(I)V")
    public final synchronized void method913() {
        Container var1 = this.method801();
        if (this.field735 != null) {
            this.field735.removeFocusListener(this);
            var1.remove(this.field735);
        }
        Statics.field762 = Math.max(var1.getWidth(), this.field718);
        Statics.field633 = Math.max(var1.getHeight(), this.field708);
        if (this.field723 != null) {
            Insets var2 = this.field723.getInsets();
            Statics.field762 -= var2.right + var2.left;
            Statics.field633 -= var2.top + var2.bottom;
        }
        this.field735 = new class54(this);
        var1.add(this.field735);
        this.field735.setSize(Statics.field762, Statics.field633);
        this.field735.setVisible(true);
        this.field735.setBackground(Color.BLACK);
        if (this.field723 == var1) {
            Insets var3 = this.field723.getInsets();
            this.field735.setLocation(this.field734 + var3.left, this.field724 + var3.top);
        } else {
            this.field735.setLocation(this.field734, this.field724);
        }
        this.field735.addFocusListener(this);
        this.field735.requestFocus();
        this.field713 = true;
        if (Statics.field276 != null && Statics.field762 == Statics.field276.field3776 && Statics.field633 == Statics.field276.field3777) {
            ((class58) Statics.field276).method752(this.field735);
            Statics.field276.method753(0, 0);
        } else {
            Statics.field276 = new class58(Statics.field762, Statics.field633, this.field735);
        }
        this.field728 = false;
        this.field729 = class176.method2725();
    }

    @ObfuscatedName("bn.ah(B)Z")
    public final boolean method784() {
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
                this.method800("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2248 != null) {
                String var1 = Statics.field2248.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2244;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method800("wrongjava");
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
                        if (class271.method3859(var6)) {
                            int var7 = class271.method536(var6, 10, true);
                            if (var7 < 10) {
                                this.method800("wrongjava");
                                return;
                            }
                        }
                    }
                    field710 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method913();
            this.method794();
            Statics.field1676 = Statics.method144();
            while (field706 == 0L || class176.method2725() < field706) {
                Statics.field698 = Statics.field1676.method2741(field709, field710);
                for (int var8 = 0; var8 < Statics.field698; var8++) {
                    this.method912();
                }
                this.method786();
                this.method772(this.field735);
            }
        } catch (Exception var10) {
            class153.method1775((String) null, var10);
            this.method800("crash");
        }
        this.method810();
    }

    @ObfuscatedName("bn.ab(I)V")
    public void method912() {
        long var1 = class176.method2725();
        long var3 = field732[Statics.field398];
        field732[Statics.field398] = var1;
        Statics.field398 = Statics.field398 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field596 = field733;
        }
        this.method795();
    }

    @ObfuscatedName("bn.ad(S)V")
    public void method786() {
        Container var1 = this.method801();
        long var2 = class176.method2725();
        long var4 = field712[Statics.field3392];
        field712[Statics.field3392] = var2;
        Statics.field3392 = Statics.field3392 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field711 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field726 - 1 > 50) {
            field726 -= 50;
            this.field713 = true;
            this.field735.setSize(Statics.field762, Statics.field633);
            this.field735.setVisible(true);
            if (this.field723 == var1) {
                Insets var7 = this.field723.getInsets();
                this.field735.setLocation(this.field734 + var7.left, this.field724 + var7.top);
            } else {
                this.field735.setLocation(this.field734, this.field724);
            }
        }
        if (this.field728) {
            this.method781();
        }
        this.method787();
        this.method791(this.field713);
        if (this.field713) {
            this.method770();
        }
        this.field713 = false;
    }

    @ObfuscatedName("bn.ag(S)V")
    public final void method787() {
        class280 var1 = this.method835();
        if (this.field714 != var1.field3755 || this.field715 != var1.field3756 || this.field717) {
            this.method777();
            this.field717 = false;
        }
    }

    @ObfuscatedName("bn.as(I)V")
    public final void method788() {
        this.field717 = true;
    }

    @ObfuscatedName("bn.af(I)V")
    public final synchronized void method810() {
        if (field707) {
            return;
        }
        field707 = true;
        try {
            this.field735.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method797();
        } catch (Exception var7) {
        }
        if (this.field723 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field727 != null) {
            try {
                Statics.field727.method2764();
            } catch (Exception var5) {
            }
        }
        this.method804();
    }

    @ObfuscatedName("z.aq(I)V")
    public static final void method143() {
        Statics.field1676.method2747();
        for (int var0 = 0; var0 < 32; var0++) {
            field712[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field732[var1] = 0L;
        }
        Statics.field698 = 0;
    }

    public final void start() {
        if (field704 == this && !field707) {
            field706 = 0L;
        }
    }

    public final void stop() {
        if (field704 == this && !field707) {
            field706 = class176.method2725() + 4000L;
        }
    }

    public final void destroy() {
        if (field704 == this && !field707) {
            field706 = class176.method2725();
            class182.method3711(5000L);
            this.method810();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field704 != this || field707) {
            return;
        }
        this.field713 = true;
        if (class176.method2725() - this.field729 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field762 && var2.height >= Statics.field633) {
                this.field728 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field733 = true;
        this.field713 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field733 = false;
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

    @ObfuscatedName("bn.ar(ILjava/lang/String;ZI)V")
    public final void method798(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field735.getGraphics();
            if (Statics.field722 == null) {
                Statics.field722 = new Font("Helvetica", 1, 13);
                Statics.field2361 = this.field735.getFontMetrics(Statics.field722);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field762, Statics.field633);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field638 == null) {
                    Statics.field638 = this.field735.createImage(304, 34);
                }
                Graphics var6 = Statics.field638.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field722);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field2361.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field638, Statics.field762 / 2 - 152, Statics.field633 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field762 / 2 - 152;
                int var9 = Statics.field633 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field722);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field2361.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field735.repaint();
        }
    }

    @ObfuscatedName("bn.aa(I)V")
    public final void method799() {
        Statics.field638 = null;
        Statics.field722 = null;
        Statics.field2361 = null;
    }

    @ObfuscatedName("bn.aj(Ljava/lang/String;I)V")
    public void method800(String arg0) {
        if (this.field705) {
            return;
        }
        this.field705 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bn.ap(I)Ljava/awt/Container;")
    public Container method801() {
        return this.field723 == null ? this : this.field723;
    }

    @ObfuscatedName("bn.ao(I)Ljt;")
    public class280 method835() {
        Container var1 = this.method801();
        int var2 = Math.max(var1.getWidth(), this.field718);
        int var3 = Math.max(var1.getHeight(), this.field708);
        if (this.field723 != null) {
            Insets var4 = this.field723.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class280(var2, var3);
    }

    @ObfuscatedName("bn.at(I)Z")
    public final boolean method803() {
        return this.field723 != null;
    }

    @ObfuscatedName("bn.x(I)V")
    public abstract void method779();

    @ObfuscatedName("bn.av(ZB)V")
    public abstract void method791(boolean arg0);

    public abstract void init();

    @ObfuscatedName("bn.am(I)V")
    public abstract void method794();

    @ObfuscatedName("bn.az(I)V")
    public abstract void method795();

    @ObfuscatedName("bn.an(I)V")
    public abstract void method797();

    @ObfuscatedName("bn.aw(B)V")
    public abstract void method804();
}
