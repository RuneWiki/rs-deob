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
import java.awt.LayoutManager;
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

@ObfuscatedName("bj")
public abstract class class53 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bj.i")
    public static class53 field452 = null;

    @ObfuscatedName("bj.p")
    public static int field421 = 0;

    @ObfuscatedName("bj.b")
    public static long field422 = 0L;

    @ObfuscatedName("bj.e")
    public static boolean field430 = false;

    @ObfuscatedName("bj.a")
    public boolean field424 = false;

    @ObfuscatedName("bj.c")
    public static int field426 = 20;

    @ObfuscatedName("bj.o")
    public static int field427 = 1;

    @ObfuscatedName("bj.v")
    public static int field446 = 0;

    @ObfuscatedName("bj.l")
    public static long[] field435 = new long[32];

    @ObfuscatedName("bj.j")
    public static long[] field429 = new long[32];

    @ObfuscatedName("bj.u")
    public int field432;

    @ObfuscatedName("bj.z")
    public int field433;

    @ObfuscatedName("bj.h")
    public int field438 = 0;

    @ObfuscatedName("bj.m")
    public int field425 = 0;

    @ObfuscatedName("bj.q")
    public int field423;

    @ObfuscatedName("bj.aa")
    public int field420;

    @ObfuscatedName("bj.av")
    public int field436;

    @ObfuscatedName("bj.aw")
    public int field439;

    @ObfuscatedName("bj.au")
    public Frame field440;

    @ObfuscatedName("bj.ah")
    public Canvas field441;

    @ObfuscatedName("bj.aq")
    public volatile boolean field442 = true;

    @ObfuscatedName("bj.an")
    public static int field443 = 500;

    @ObfuscatedName("bj.ar")
    public boolean field444 = false;

    @ObfuscatedName("bj.az")
    public volatile boolean field445 = false;

    @ObfuscatedName("bj.ay")
    public volatile long field419 = 0L;

    @ObfuscatedName("bj.al")
    public class44 field448;

    @ObfuscatedName("bj.ae")
    public Clipboard field437;

    @ObfuscatedName("bj.ad")
    public final EventQueue field450;

    @ObfuscatedName("bj.aj")
    public static volatile boolean field451 = true;

    @ObfuscatedName("bj.af")
    public static long field453 = -1L;

    @ObfuscatedName("bj.ap")
    public static long field454 = -1L;

    public class53() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field450 = var1;
        class104.method4872(new class46());
    }

    @ObfuscatedName("bj.a(III)V")
    public final void method923(int arg0, int arg1) {
        if (this.field436 != arg0 || this.field439 != arg1) {
            this.method795();
        }
        this.field436 = arg0;
        this.field439 = arg1;
    }

    @ObfuscatedName("bj.d(Ljava/lang/Object;B)V")
    public final void method779(Object arg0) {
        if (this.field450 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field450.peekEvent() != null; var2++) {
            class298.method3743(1L);
        }
        if (arg0 != null) {
            this.field450.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bj.c(I)Lfs;")
    public class169 method866() {
        if (this.field448 == null) {
            this.field448 = new class44();
            this.field448.method657(this.field441);
        }
        return this.field448;
    }

    @ObfuscatedName("bj.o(I)V")
    public void method901() {
        this.field437 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bj.l(Ljava/lang/String;S)V")
    public void method910(String arg0) {
        this.field437.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bj.t(B)V")
    public final void method783() {
        class45.method602();
        class45.method73(this.field441);
    }

    @ObfuscatedName("bj.j(B)V")
    public final void method784() {
        Canvas var1 = this.field441;
        var1.addMouseListener(class54.field456);
        var1.addMouseMotionListener(class54.field456);
        var1.addFocusListener(class54.field456);
    }

    @ObfuscatedName("bj.n(B)V")
    public final void method909() {
        Container var1 = this.method808();
        if (var1 == null) {
            return;
        }
        class319 var2 = this.method809();
        this.field432 = Math.max(var2.field3835, this.field423);
        this.field433 = Math.max(var2.field3838, this.field420);
        if (this.field432 <= 0) {
            this.field432 = 1;
        }
        if (this.field433 <= 0) {
            this.field433 = 1;
        }
        Statics.field45 = Math.min(this.field432, this.field436);
        Statics.field1152 = Math.min(this.field433, this.field439);
        this.field438 = (this.field432 - Statics.field45) / 2;
        this.field425 = 0;
        this.field441.setSize(Statics.field45, Statics.field1152);
        Statics.field3579 = new class52(Statics.field45, Statics.field1152, this.field441);
        if (this.field440 == var1) {
            Insets var3 = this.field440.getInsets();
            this.field441.setLocation(this.field438 + var3.left, this.field425 + var3.top);
        } else {
            this.field441.setLocation(this.field438, this.field425);
        }
        this.field442 = true;
        this.method829();
    }

    @ObfuscatedName("bj.z(B)V")
    public void method787() {
        int var1 = this.field438;
        int var2 = this.field425;
        int var3 = this.field432 - Statics.field45 - var1;
        int var4 = this.field433 - Statics.field1152 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method808();
            int var6 = 0;
            int var7 = 0;
            if (this.field440 == var5) {
                Insets var8 = this.field440.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field433);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field432, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field432 + var6 - var3, var7, var3, this.field433);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field433 + var7 - var4, this.field432, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bj.h(I)V")
    public final void method788() {
        class45.method3747(this.field441);
        Canvas var1 = this.field441;
        var1.removeMouseListener(class54.field456);
        var1.removeMouseMotionListener(class54.field456);
        var1.removeFocusListener(class54.field456);
        class54.field461 = 0;
        if (this.field448 != null) {
            this.field448.method654(this.field441);
        }
        this.method790();
        class45.method73(this.field441);
        Canvas var2 = this.field441;
        var2.addMouseListener(class54.field456);
        var2.addMouseMotionListener(class54.field456);
        var2.addFocusListener(class54.field456);
        if (this.field448 != null) {
            this.field448.method657(this.field441);
        }
        this.method795();
    }

    @ObfuscatedName("bj.m(IIII)V")
    public final void method789(int arg0, int arg1, int arg2) {
        try {
            if (field452 != null) {
                field421++;
                if (field421 >= 3) {
                    this.method807("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field452 = this;
            Statics.field45 = arg0;
            Statics.field1152 = arg1;
            Statics.field4044 = arg2;
            Statics.field4046 = this;
            if (Statics.field449 == null) {
                Statics.field449 = new class167();
            }
            Statics.field449.method3159(this, 1);
        } catch (Exception var5) {
            class341.method5815((String) null, var5);
            this.method807("crash");
        }
    }

    @ObfuscatedName("bj.aa(I)V")
    public final synchronized void method790() {
        Container var1 = this.method808();
        if (this.field441 != null) {
            this.field441.removeFocusListener(this);
            var1.remove(this.field441);
        }
        Statics.field45 = Math.max(var1.getWidth(), this.field423);
        Statics.field1152 = Math.max(var1.getHeight(), this.field420);
        if (this.field440 != null) {
            Insets var2 = this.field440.getInsets();
            Statics.field45 -= var2.right + var2.left;
            Statics.field1152 -= var2.top + var2.bottom;
        }
        this.field441 = new class48(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field441);
        this.field441.setSize(Statics.field45, Statics.field1152);
        this.field441.setVisible(true);
        this.field441.setBackground(Color.BLACK);
        if (this.field440 == var1) {
            Insets var3 = this.field440.getInsets();
            this.field441.setLocation(this.field438 + var3.left, this.field425 + var3.top);
        } else {
            this.field441.setLocation(this.field438, this.field425);
        }
        this.field441.addFocusListener(this);
        this.field441.requestFocus();
        this.field442 = true;
        if (Statics.field3579 != null && Statics.field45 == Statics.field3579.field3848 && Statics.field1152 == Statics.field3579.field3849) {
            ((class52) Statics.field3579).method768(this.field441);
            Statics.field3579.method763(0, 0);
        } else {
            Statics.field3579 = new class52(Statics.field45, Statics.field1152, this.field441);
        }
        this.field445 = false;
        this.field419 = class297.method481();
    }

    @ObfuscatedName("bj.av(I)Z")
    public final boolean method791() {
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
                this.method807("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2019 != null) {
                String var1 = Statics.field2019.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2017;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method807("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class291.method3938(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class291.method1948(var4) && class291.method3871(var4) < 10) {
                            this.method807("wrongjava");
                            return;
                        }
                    }
                    field427 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method790();
            this.method897();
            Statics.field2514 = class171.method477();
            while (field422 == 0L || class297.method481() < field422) {
                Statics.field434 = Statics.field2514.method3151(field426, field427);
                for (int var5 = 0; var5 < Statics.field434; var5++) {
                    this.method801();
                }
                this.method793();
                this.method779(this.field441);
            }
        } catch (Exception var7) {
            class341.method5815((String) null, var7);
            this.method807("crash");
        }
        this.method796();
    }

    @ObfuscatedName("bj.aw(B)V")
    public void method801() {
        long var1 = class297.method481();
        long var3 = field429[Statics.field431];
        field429[Statics.field431] = var1;
        Statics.field431 = Statics.field431 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field428 = field451;
        }
        this.method802();
    }

    @ObfuscatedName("bj.as(I)V")
    public void method793() {
        Container var1 = this.method808();
        long var2 = class297.method481();
        long var4 = field435[Statics.field249];
        field435[Statics.field249] = var2;
        Statics.field249 = Statics.field249 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field446 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field443 - 1 > 50) {
            field443 -= 50;
            this.field442 = true;
            this.field441.setSize(Statics.field45, Statics.field1152);
            this.field441.setVisible(true);
            if (this.field440 == var1) {
                Insets var7 = this.field440.getInsets();
                this.field441.setLocation(this.field438 + var7.left, this.field425 + var7.top);
            } else {
                this.field441.setLocation(this.field438, this.field425);
            }
        }
        if (this.field445) {
            this.method788();
        }
        this.method857();
        this.method803(this.field442);
        if (this.field442) {
            this.method787();
        }
        this.field442 = false;
    }

    @ObfuscatedName("bj.ak(B)V")
    public final void method857() {
        class319 var1 = this.method809();
        if (this.field432 != var1.field3835 || this.field433 != var1.field3838 || this.field444) {
            this.method909();
            this.field444 = false;
        }
    }

    @ObfuscatedName("bj.au(B)V")
    public final void method795() {
        this.field444 = true;
    }

    @ObfuscatedName("bj.ah(B)V")
    public final synchronized void method796() {
        if (field430) {
            return;
        }
        field430 = true;
        try {
            this.field441.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method861();
        } catch (Exception var7) {
        }
        if (this.field440 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field449 != null) {
            try {
                Statics.field449.method3161();
            } catch (Exception var5) {
            }
        }
        this.method811();
    }

    @ObfuscatedName("ek.aq(I)V")
    public static final void method2832() {
        Statics.field2514.method3150();
        for (int var0 = 0; var0 < 32; var0++) {
            field435[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field429[var1] = 0L;
        }
        Statics.field434 = 0;
    }

    public final void start() {
        if (field452 == this && !field430) {
            field422 = 0L;
        }
    }

    public final void stop() {
        if (field452 == this && !field430) {
            field422 = class297.method481() + 4000L;
        }
    }

    public final void destroy() {
        if (field452 == this && !field430) {
            field422 = class297.method481();
            class298.method3743(5000L);
            this.method796();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field452 != this || field430) {
            return;
        }
        this.field442 = true;
        if (class297.method481() - this.field419 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field45 && var2.height >= Statics.field1152) {
                this.field445 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field451 = true;
        this.field442 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field451 = false;
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

    @ObfuscatedName("bj.ax(ILjava/lang/String;ZB)V")
    public final void method805(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field441.getGraphics();
            if (Statics.field2052 == null) {
                Statics.field2052 = new Font("Helvetica", 1, 13);
                Statics.field219 = this.field441.getFontMetrics(Statics.field2052);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field45, Statics.field1152);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field2334 == null) {
                    Statics.field2334 = this.field441.createImage(304, 34);
                }
                Graphics var6 = Statics.field2334.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field2052);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field219.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field2334, Statics.field45 / 2 - 152, Statics.field1152 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field45 / 2 - 152;
                int var9 = Statics.field1152 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field2052);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field219.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field441.repaint();
        }
    }

    @ObfuscatedName("bj.at(B)V")
    public final void method806() {
        Statics.field2334 = null;
        Statics.field2052 = null;
        Statics.field219 = null;
    }

    @ObfuscatedName("bj.af(Ljava/lang/String;I)V")
    public void method807(String arg0) {
        if (this.field424) {
            return;
        }
        this.field424 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bj.ap(I)Ljava/awt/Container;")
    public Container method808() {
        return this.field440 == null ? this : this.field440;
    }

    @ObfuscatedName("bj.ai(I)Llh;")
    public class319 method809() {
        Container var1 = this.method808();
        int var2 = Math.max(var1.getWidth(), this.field423);
        int var3 = Math.max(var1.getHeight(), this.field420);
        if (this.field440 != null) {
            Insets var4 = this.field440.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class319(var2, var3);
    }

    @ObfuscatedName("bj.am(B)Z")
    public final boolean method810() {
        return this.field440 != null;
    }

    @ObfuscatedName("z.ab(B)I")
    public static int method217() {
        int var0 = 0;
        if (Statics.field1082 == null || !Statics.field1082.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field1082 = var2;
                        field454 = -1L;
                        field453 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field1082 != null) {
            long var4 = class297.method481();
            long var6 = Statics.field1082.getCollectionTime();
            if (field453 != -1L) {
                long var8 = var6 - field453;
                long var10 = var4 - field454;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field453 = var6;
            field454 = var4;
        }
        return var0;
    }

    public abstract void init();

    @ObfuscatedName("bj.ae(I)V")
    public abstract void method802();

    @ObfuscatedName("bj.ad(ZI)V")
    public abstract void method803(boolean arg0);

    @ObfuscatedName("bj.bj(I)V")
    public abstract void method811();

    @ObfuscatedName("bj.u(I)V")
    public abstract void method829();

    @ObfuscatedName("bj.aj(I)V")
    public abstract void method861();

    @ObfuscatedName("bj.ao(I)V")
    public abstract void method897();
}
