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

@ObfuscatedName("bh")
public abstract class class60 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bh.q")
    public static class60 field665 = null;

    @ObfuscatedName("bh.i")
    public static int field645 = 0;

    @ObfuscatedName("bh.a")
    public static long field672 = 0L;

    @ObfuscatedName("bh.l")
    public static boolean field663 = false;

    @ObfuscatedName("bh.b")
    public boolean field648 = false;

    @ObfuscatedName("bh.p")
    public static int field646 = 20;

    @ObfuscatedName("bh.g")
    public static int field650 = 1;

    @ObfuscatedName("bh.n")
    public static int field651 = 0;

    @ObfuscatedName("bh.v")
    public static long[] field653 = new long[32];

    @ObfuscatedName("bh.j")
    public static long[] field654 = new long[32];

    @ObfuscatedName("bh.z")
    public int field655;

    @ObfuscatedName("bh.s")
    public int field656;

    @ObfuscatedName("bh.d")
    public int field657 = 0;

    @ObfuscatedName("bh.f")
    public int field670 = 0;

    @ObfuscatedName("bh.m")
    public int field660;

    @ObfuscatedName("bh.ay")
    public int field643;

    @ObfuscatedName("bh.ao")
    public int field662;

    @ObfuscatedName("bh.av")
    public int field668;

    @ObfuscatedName("bh.am")
    public Frame field664;

    @ObfuscatedName("bh.az")
    public Canvas field644;

    @ObfuscatedName("bh.ap")
    public volatile boolean field666 = true;

    @ObfuscatedName("bh.au")
    public static int field647 = 500;

    @ObfuscatedName("bh.ax")
    public boolean field667 = false;

    @ObfuscatedName("bh.ar")
    public volatile boolean field669 = false;

    @ObfuscatedName("bh.an")
    public volatile long field658 = 0L;

    @ObfuscatedName("bh.at")
    public class51 field649;

    @ObfuscatedName("bh.ag")
    public Clipboard field671;

    @ObfuscatedName("bh.as")
    public final EventQueue field673;

    @ObfuscatedName("bh.aw")
    public static volatile boolean field674 = true;

    @ObfuscatedName("bh.af")
    public static long field661 = -1L;

    @ObfuscatedName("bh.ak")
    public static long field676 = -1L;

    public class60() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field673 = var1;
        class108.method1566(new class53());
    }

    @ObfuscatedName("bh.b(III)V")
    public final void method800(int arg0, int arg1) {
        if (this.field662 != arg0 || this.field668 != arg1) {
            this.method817();
        }
        this.field662 = arg0;
        this.field668 = arg1;
    }

    @ObfuscatedName("bh.e(Ljava/lang/Object;I)V")
    public final void method933(Object arg0) {
        if (this.field673 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field673.peekEvent() != null; var2++) {
            class204.method1827(1L);
        }
        if (arg0 != null) {
            this.field673.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bh.x(B)Lfs;")
    public class169 method802() {
        if (this.field649 == null) {
            this.field649 = new class51();
            this.field649.method680(this.field644);
        }
        return this.field649;
    }

    @ObfuscatedName("bh.p(B)V")
    public void method803() {
        this.field671 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bh.o(Ljava/lang/String;I)V")
    public void method812(String arg0) {
        this.field671.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bh.c(I)V")
    public final void method805() {
        Statics.method3216();
        class52.method4076(this.field644);
    }

    @ObfuscatedName("bh.u(I)V")
    public final void method916() {
        class61.method717(this.field644);
    }

    @ObfuscatedName("bh.k(I)V")
    public final void method910() {
        Container var1 = this.method831();
        if (var1 == null) {
            return;
        }
        class324 var2 = this.method825();
        this.field655 = Math.max(var2.field3944, this.field660);
        this.field656 = Math.max(var2.field3945, this.field643);
        if (this.field655 <= 0) {
            this.field655 = 1;
        }
        if (this.field656 <= 0) {
            this.field656 = 1;
        }
        Statics.field2021 = Math.min(this.field655, this.field662);
        Statics.field659 = Math.min(this.field656, this.field668);
        this.field657 = (this.field655 - Statics.field2021) / 2;
        this.field670 = 0;
        this.field644.setSize(Statics.field2021, Statics.field659);
        Statics.field605 = new class59(Statics.field2021, Statics.field659, this.field644);
        if (this.field664 == var1) {
            Insets var3 = this.field664.getInsets();
            this.field644.setLocation(this.field657 + var3.left, this.field670 + var3.top);
        } else {
            this.field644.setLocation(this.field657, this.field670);
        }
        this.field666 = true;
        this.method807();
    }

    @ObfuscatedName("bh.w(I)V")
    public void method868() {
        int var1 = this.field657;
        int var2 = this.field670;
        int var3 = this.field655 - Statics.field2021 - var1;
        int var4 = this.field656 - Statics.field659 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method831();
            int var6 = 0;
            int var7 = 0;
            if (this.field664 == var5) {
                Insets var8 = this.field664.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field656);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field655, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field655 + var6 - var3, var7, var3, this.field656);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field656 + var7 - var4, this.field655, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bh.s(I)V")
    public final void method804() {
        Canvas var1 = this.field644;
        var1.removeKeyListener(class52.field609);
        var1.removeFocusListener(class52.field609);
        class52.field604 = -1;
        Canvas var2 = this.field644;
        var2.removeMouseListener(class61.field680);
        var2.removeMouseMotionListener(class61.field680);
        var2.removeFocusListener(class61.field680);
        class61.field691 = 0;
        if (this.field649 != null) {
            this.field649.method681(this.field644);
        }
        this.method811();
        class52.method4076(this.field644);
        class61.method717(this.field644);
        if (this.field649 != null) {
            this.field649.method680(this.field644);
        }
        this.method817();
    }

    @ObfuscatedName("bh.d(IIII)V")
    public final void method810(int arg0, int arg1, int arg2) {
        try {
            if (field665 != null) {
                field645++;
                if (field645 >= 3) {
                    this.method822("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field665 = this;
            Statics.field2021 = arg0;
            Statics.field659 = arg1;
            Statics.field3849 = arg2;
            Statics.field2155 = this;
            if (Statics.field675 == null) {
                Statics.field675 = new class167();
            }
            Statics.field675.method2972(this, 1);
        } catch (Exception var5) {
            class165.method2453((String) null, var5);
            this.method822("crash");
        }
    }

    @ObfuscatedName("bh.f(I)V")
    public final synchronized void method811() {
        Container var1 = this.method831();
        if (this.field644 != null) {
            this.field644.removeFocusListener(this);
            var1.remove(this.field644);
        }
        Statics.field2021 = Math.max(var1.getWidth(), this.field660);
        Statics.field659 = Math.max(var1.getHeight(), this.field643);
        if (this.field664 != null) {
            Insets var2 = this.field664.getInsets();
            Statics.field2021 -= var2.right + var2.left;
            Statics.field659 -= var2.top + var2.bottom;
        }
        this.field644 = new class55(this);
        var1.add(this.field644);
        this.field644.setSize(Statics.field2021, Statics.field659);
        this.field644.setVisible(true);
        this.field644.setBackground(Color.BLACK);
        if (this.field664 == var1) {
            Insets var3 = this.field664.getInsets();
            this.field644.setLocation(this.field657 + var3.left, this.field670 + var3.top);
        } else {
            this.field644.setLocation(this.field657, this.field670);
        }
        this.field644.addFocusListener(this);
        this.field644.requestFocus();
        this.field666 = true;
        if (Statics.field605 != null && Statics.field2021 == Statics.field605.field3965 && Statics.field659 == Statics.field605.field3966) {
            ((class59) Statics.field605).method778(this.field644);
            Statics.field605.method780(0, 0);
        } else {
            Statics.field605 = new class59(Statics.field2021, Statics.field659, this.field644);
        }
        this.field669 = false;
        this.field658 = Statics.method426();
    }

    @ObfuscatedName("bh.r(I)Z")
    public final boolean method858() {
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
                this.method822("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2172 != null) {
                String var1 = Statics.field2172.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2167;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method822("wrongjava");
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
                        if (class319.method2962(var6) && class319.method2933(var6) < 10) {
                            this.method822("wrongjava");
                            return;
                        }
                    }
                    field650 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method811();
            this.method906();
            Statics.field652 = class173.method490();
            while (field672 == 0L || Statics.method426() < field672) {
                Statics.field2484 = Statics.field652.method2936(field646, field650);
                for (int var7 = 0; var7 < Statics.field2484; var7++) {
                    this.method814();
                }
                this.method815();
                this.method933(this.field644);
            }
        } catch (Exception var9) {
            class165.method2453((String) null, var9);
            this.method822("crash");
        }
        this.method818();
    }

    @ObfuscatedName("bh.y(I)V")
    public void method814() {
        long var1 = Statics.method426();
        long var3 = field654[Statics.field3564];
        field654[Statics.field3564] = var1;
        Statics.field3564 = Statics.field3564 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field2551 = field674;
        }
        this.method865();
    }

    @ObfuscatedName("bh.h(I)V")
    public void method815() {
        Container var1 = this.method831();
        long var2 = Statics.method426();
        long var4 = field653[Statics.field19];
        field653[Statics.field19] = var2;
        Statics.field19 = Statics.field19 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field651 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field647 - 1 > 50) {
            field647 -= 50;
            this.field666 = true;
            this.field644.setSize(Statics.field2021, Statics.field659);
            this.field644.setVisible(true);
            if (this.field664 == var1) {
                Insets var7 = this.field664.getInsets();
                this.field644.setLocation(this.field657 + var7.left, this.field670 + var7.top);
            } else {
                this.field644.setLocation(this.field657, this.field670);
            }
        }
        if (this.field669) {
            this.method804();
        }
        this.method816();
        this.method828(this.field666);
        if (this.field666) {
            this.method868();
        }
        this.field666 = false;
    }

    @ObfuscatedName("bh.av(I)V")
    public final void method816() {
        class324 var1 = this.method825();
        if (this.field655 != var1.field3944 || this.field656 != var1.field3945 || this.field667) {
            this.method910();
            this.field667 = false;
        }
    }

    @ObfuscatedName("bh.aj(B)V")
    public final void method817() {
        this.field667 = true;
    }

    @ObfuscatedName("bh.ae(I)V")
    public final synchronized void method818() {
        if (field663) {
            return;
        }
        field663 = true;
        try {
            this.field644.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method829();
        } catch (Exception var7) {
        }
        if (this.field664 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field675 != null) {
            try {
                Statics.field675.method2995();
            } catch (Exception var5) {
            }
        }
        this.method834();
    }

    @ObfuscatedName("p.am(I)V")
    public static final void method34() {
        Statics.field652.method2935();
        for (int var0 = 0; var0 < 32; var0++) {
            field653[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field654[var1] = 0L;
        }
        Statics.field2484 = 0;
    }

    public final void start() {
        if (field665 == this && !field663) {
            field672 = 0L;
        }
    }

    public final void stop() {
        if (field665 == this && !field663) {
            field672 = Statics.method426() + 4000L;
        }
    }

    public final void destroy() {
        if (field665 == this && !field663) {
            field672 = Statics.method426();
            class204.method1827(5000L);
            this.method818();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field665 != this || field663) {
            return;
        }
        this.field666 = true;
        if (Statics.method426() - this.field658 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field2021 && var2.height >= Statics.field659) {
                this.field669 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field674 = true;
        this.field666 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field674 = false;
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

    @ObfuscatedName("bh.ag(ILjava/lang/String;ZB)V")
    public final void method830(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field644.getGraphics();
            if (Statics.field321 == null) {
                Statics.field321 = new Font("Helvetica", 1, 13);
                Statics.field2584 = this.field644.getFontMetrics(Statics.field321);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field2021, Statics.field659);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field2092 == null) {
                    Statics.field2092 = this.field644.createImage(304, 34);
                }
                Graphics var6 = Statics.field2092.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field321);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field2584.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field2092, Statics.field2021 / 2 - 152, Statics.field659 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field2021 / 2 - 152;
                int var9 = Statics.field659 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field321);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field2584.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field644.repaint();
        }
    }

    @ObfuscatedName("bh.as(I)V")
    public final void method900() {
        Statics.field2092 = null;
        Statics.field321 = null;
        Statics.field2584 = null;
    }

    @ObfuscatedName("bh.aw(Ljava/lang/String;I)V")
    public void method822(String arg0) {
        if (this.field648) {
            return;
        }
        this.field648 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bh.aq(I)Ljava/awt/Container;")
    public Container method831() {
        return this.field664 == null ? this : this.field664;
    }

    @ObfuscatedName("bh.aa(B)Llb;")
    public class324 method825() {
        Container var1 = this.method831();
        int var2 = Math.max(var1.getWidth(), this.field660);
        int var3 = Math.max(var1.getHeight(), this.field643);
        if (this.field664 != null) {
            Insets var4 = this.field664.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class324(var2, var3);
    }

    @ObfuscatedName("bh.af(I)Z")
    public final boolean method912() {
        return this.field664 != null;
    }

    @ObfuscatedName("bh.z(I)V")
    public abstract void method807();

    public abstract void init();

    @ObfuscatedName("bh.ah(ZI)V")
    public abstract void method828(boolean arg0);

    @ObfuscatedName("bh.at(B)V")
    public abstract void method829();

    @ObfuscatedName("bh.ak(B)V")
    public abstract void method834();

    @ObfuscatedName("bh.ap(I)V")
    public abstract void method865();

    @ObfuscatedName("bh.az(I)V")
    public abstract void method906();
}
