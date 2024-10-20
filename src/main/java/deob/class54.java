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

@ObfuscatedName("bg")
public abstract class class54 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bg.t")
    public static class54 field425 = null;

    @ObfuscatedName("bg.n")
    public static int field432 = 0;

    @ObfuscatedName("bg.q")
    public static long field427 = 0L;

    @ObfuscatedName("bg.v")
    public static boolean field421 = false;

    @ObfuscatedName("bg.l")
    public boolean field444 = false;

    @ObfuscatedName("bg.o")
    public static int field424 = 20;

    @ObfuscatedName("bg.i")
    public static int field422 = 1;

    @ObfuscatedName("bg.d")
    public static int field428 = 0;

    @ObfuscatedName("bg.h")
    public static long[] field430 = new long[32];

    @ObfuscatedName("bg.j")
    public static long[] field431 = new long[32];

    @ObfuscatedName("bg.e")
    public int field440;

    @ObfuscatedName("bg.s")
    public int field433;

    @ObfuscatedName("bg.b")
    public int field434 = 0;

    @ObfuscatedName("bg.z")
    public int field439 = 0;

    @ObfuscatedName("bg.u")
    public int field436;

    @ObfuscatedName("bg.aa")
    public int field420;

    @ObfuscatedName("bg.aw")
    public int field438;

    @ObfuscatedName("bg.ar")
    public int field426;

    @ObfuscatedName("bg.ag")
    public Frame field435;

    @ObfuscatedName("bg.ak")
    public Canvas field441;

    @ObfuscatedName("bg.av")
    public volatile boolean field442 = true;

    @ObfuscatedName("bg.ab")
    public static int field443 = 500;

    @ObfuscatedName("bg.ax")
    public boolean field437 = false;

    @ObfuscatedName("bg.al")
    public volatile boolean field445 = false;

    @ObfuscatedName("bg.ap")
    public volatile long field446 = 0L;

    @ObfuscatedName("bg.au")
    public class45 field423;

    @ObfuscatedName("bg.ah")
    public Clipboard field448;

    @ObfuscatedName("bg.an")
    public final EventQueue field449;

    @ObfuscatedName("bg.af")
    public static volatile boolean field450 = true;

    @ObfuscatedName("bg.ao")
    public static long field451 = -1L;

    @ObfuscatedName("bg.ai")
    public static long field452 = -1L;

    public class54() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field449 = var1;
        class106.method5064(new class47());
    }

    @ObfuscatedName("bg.c(III)V")
    public final void method895(int arg0, int arg1) {
        if (this.field438 != arg0 || this.field426 != arg1) {
            this.method838();
        }
        this.field438 = arg0;
        this.field426 = arg1;
    }

    @ObfuscatedName("bg.o(Ljava/lang/Object;I)V")
    public final void method822(Object arg0) {
        if (this.field449 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field449.peekEvent() != null; var2++) {
            Statics.method4888(1L);
        }
        if (arg0 != null) {
            this.field449.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bg.i(I)Lfl;")
    public class169 method823() {
        if (this.field423 == null) {
            this.field423 = new class45();
            this.field423.method711(this.field441);
        }
        return this.field423;
    }

    @ObfuscatedName("bg.d(I)V")
    public void method824() {
        this.field448 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bg.m(Ljava/lang/String;B)V")
    public void method825(String arg0) {
        this.field448.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bg.p(B)V")
    public final void method826() {
        class46.method78();
        Canvas var1 = this.field441;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class46.field391);
        var1.addFocusListener(class46.field391);
    }

    @ObfuscatedName("bg.h(I)V")
    public final void method827() {
        Canvas var1 = this.field441;
        var1.addMouseListener(class55.field472);
        var1.addMouseMotionListener(class55.field472);
        var1.addFocusListener(class55.field472);
    }

    @ObfuscatedName("bg.k(B)V")
    public final void method828() {
        Container var1 = this.method851();
        if (var1 == null) {
            return;
        }
        class319 var2 = this.method891();
        this.field440 = Math.max(var2.field3828, this.field436);
        this.field433 = Math.max(var2.field3826, this.field420);
        if (this.field440 <= 0) {
            this.field440 = 1;
        }
        if (this.field433 <= 0) {
            this.field433 = 1;
        }
        Statics.field3628 = Math.min(this.field440, this.field438);
        Statics.field3243 = Math.min(this.field433, this.field426);
        this.field434 = (this.field440 - Statics.field3628) / 2;
        this.field439 = 0;
        this.field441.setSize(Statics.field3628, Statics.field3243);
        Statics.field155 = new class53(Statics.field3628, Statics.field3243, this.field441);
        if (this.field435 == var1) {
            Insets var3 = this.field435.getInsets();
            this.field441.setLocation(this.field434 + var3.left, this.field439 + var3.top);
        } else {
            this.field441.setLocation(this.field434, this.field439);
        }
        this.field442 = true;
        this.method829();
    }

    @ObfuscatedName("bg.j(B)V")
    public void method928() {
        int var1 = this.field434;
        int var2 = this.field439;
        int var3 = this.field440 - Statics.field3628 - var1;
        int var4 = this.field433 - Statics.field3243 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method851();
            int var6 = 0;
            int var7 = 0;
            if (this.field435 == var5) {
                Insets var8 = this.field435.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field433);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field440, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field440 + var6 - var3, var7, var3, this.field433);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field433 + var7 - var4, this.field440, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bg.r(I)V")
    public final void method831() {
        Canvas var1 = this.field441;
        var1.removeKeyListener(class46.field391);
        var1.removeFocusListener(class46.field391);
        class46.field381 = -1;
        class55.method740(this.field441);
        if (this.field423 != null) {
            this.field423.method712(this.field441);
        }
        this.method840();
        Canvas var2 = this.field441;
        var2.setFocusTraversalKeysEnabled(false);
        var2.addKeyListener(class46.field391);
        var2.addFocusListener(class46.field391);
        Canvas var3 = this.field441;
        var3.addMouseListener(class55.field472);
        var3.addMouseMotionListener(class55.field472);
        var3.addFocusListener(class55.field472);
        if (this.field423 != null) {
            this.field423.method711(this.field441);
        }
        this.method838();
    }

    @ObfuscatedName("bg.e(IIIB)V")
    public final void method832(int arg0, int arg1, int arg2) {
        try {
            if (field425 != null) {
                field432++;
                if (field432 >= 3) {
                    this.method834("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field425 = this;
            Statics.field3628 = arg0;
            Statics.field3243 = arg1;
            Statics.field4045 = arg2;
            Statics.field4047 = this;
            if (Statics.field447 == null) {
                Statics.field447 = new class167();
            }
            Statics.field447.method3260(this, 1);
        } catch (Exception var5) {
            class341.method4728((String) null, var5);
            this.method834("crash");
        }
    }

    @ObfuscatedName("bg.ag(I)V")
    public final synchronized void method840() {
        Container var1 = this.method851();
        if (this.field441 != null) {
            this.field441.removeFocusListener(this);
            var1.remove(this.field441);
        }
        Statics.field3628 = Math.max(var1.getWidth(), this.field436);
        Statics.field3243 = Math.max(var1.getHeight(), this.field420);
        if (this.field435 != null) {
            Insets var2 = this.field435.getInsets();
            Statics.field3628 -= var2.right + var2.left;
            Statics.field3243 -= var2.top + var2.bottom;
        }
        this.field441 = new class49(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field441);
        this.field441.setSize(Statics.field3628, Statics.field3243);
        this.field441.setVisible(true);
        this.field441.setBackground(Color.BLACK);
        if (this.field435 == var1) {
            Insets var3 = this.field435.getInsets();
            this.field441.setLocation(this.field434 + var3.left, this.field439 + var3.top);
        } else {
            this.field441.setLocation(this.field434, this.field439);
        }
        this.field441.addFocusListener(this);
        this.field441.requestFocus();
        this.field442 = true;
        if (Statics.field155 != null && Statics.field3628 == Statics.field155.field3843 && Statics.field3243 == Statics.field155.field3841) {
            ((class53) Statics.field155).method808(this.field441);
            Statics.field155.method804(0, 0);
        } else {
            Statics.field155 = new class53(Statics.field3628, Statics.field3243, this.field441);
        }
        this.field445 = false;
        this.field446 = class297.method3777();
    }

    @ObfuscatedName("bg.ak(I)Z")
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
                this.method834("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2017 != null) {
                String var1 = Statics.field2017.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2013;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method834("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class291.method3401(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class291.method276(var4) && class291.method1750(var4) < 10) {
                            this.method834("wrongjava");
                            return;
                        }
                    }
                    field422 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method840();
            this.method844();
            class171 var5;
            try {
                var5 = new class164();
            } catch (Throwable var9) {
                var5 = new class165();
            }
            Statics.field429 = var5;
            while (field427 == 0L || class297.method3777() < field427) {
                Statics.field525 = Statics.field429.method3250(field424, field422);
                for (int var7 = 0; var7 < Statics.field525; var7++) {
                    this.method835();
                }
                this.method907();
                this.method822(this.field441);
            }
        } catch (Exception var10) {
            class341.method4728((String) null, var10);
            this.method834("crash");
        }
        this.method960();
    }

    @ObfuscatedName("bg.av(B)V")
    public void method835() {
        long var1 = class297.method3777();
        long var3 = field431[Statics.field401];
        field431[Statics.field401] = var1;
        Statics.field401 = Statics.field401 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field256 = field450;
        }
        this.method845();
    }

    @ObfuscatedName("bg.am(B)V")
    public void method907() {
        Container var1 = this.method851();
        long var2 = class297.method3777();
        long var4 = field430[Statics.field1252];
        field430[Statics.field1252] = var2;
        Statics.field1252 = Statics.field1252 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field428 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field443 - 1 > 50) {
            field443 -= 50;
            this.field442 = true;
            this.field441.setSize(Statics.field3628, Statics.field3243);
            this.field441.setVisible(true);
            if (this.field435 == var1) {
                Insets var7 = this.field435.getInsets();
                this.field441.setLocation(this.field434 + var7.left, this.field439 + var7.top);
            } else {
                this.field441.setLocation(this.field434, this.field439);
            }
        }
        if (this.field445) {
            this.method831();
        }
        this.method837();
        this.method846(this.field442);
        if (this.field442) {
            this.method928();
        }
        this.field442 = false;
    }

    @ObfuscatedName("bg.ab(I)V")
    public final void method837() {
        class319 var1 = this.method891();
        if (this.field440 != var1.field3828 || this.field433 != var1.field3826 || this.field437) {
            this.method828();
            this.field437 = false;
        }
    }

    @ObfuscatedName("bg.ax(I)V")
    public final void method838() {
        this.field437 = true;
    }

    @ObfuscatedName("bg.al(B)V")
    public final synchronized void method960() {
        if (field421) {
            return;
        }
        field421 = true;
        try {
            this.field441.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method847();
        } catch (Exception var7) {
        }
        if (this.field435 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field447 != null) {
            try {
                Statics.field447.method3259();
            } catch (Exception var5) {
            }
        }
        this.method854();
    }

    @ObfuscatedName("cx.ap(I)V")
    public static final void method1950() {
        Statics.field429.method3253();
        for (int var0 = 0; var0 < 32; var0++) {
            field430[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field431[var1] = 0L;
        }
        Statics.field525 = 0;
    }

    public final void start() {
        if (field425 == this && !field421) {
            field427 = 0L;
        }
    }

    public final void stop() {
        if (field425 == this && !field421) {
            field427 = class297.method3777() + 4000L;
        }
    }

    public final void destroy() {
        if (field425 == this && !field421) {
            field427 = class297.method3777();
            Statics.method4888(5000L);
            this.method960();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field425 != this || field421) {
            return;
        }
        this.field442 = true;
        if (class297.method3777() - this.field446 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field3628 && var2.height >= Statics.field3243) {
                this.field445 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field450 = true;
        this.field442 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field450 = false;
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

    @ObfuscatedName("bg.an(ILjava/lang/String;ZB)V")
    public final void method910(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field441.getGraphics();
            if (Statics.field64 == null) {
                Statics.field64 = new Font("Helvetica", 1, 13);
                Statics.field253 = this.field441.getFontMetrics(Statics.field64);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field3628, Statics.field3243);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field997 == null) {
                    Statics.field997 = this.field441.createImage(304, 34);
                }
                Graphics var6 = Statics.field997.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field64);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field253.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field997, Statics.field3628 / 2 - 152, Statics.field3243 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field3628 / 2 - 152;
                int var9 = Statics.field3243 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field64);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field253.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field441.repaint();
        }
    }

    @ObfuscatedName("bg.af(I)V")
    public final void method855() {
        Statics.field997 = null;
        Statics.field64 = null;
        Statics.field253 = null;
    }

    @ObfuscatedName("bg.ay(Ljava/lang/String;B)V")
    public void method834(String arg0) {
        if (this.field444) {
            return;
        }
        this.field444 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bg.az(I)Ljava/awt/Container;")
    public Container method851() {
        return this.field435 == null ? this : this.field435;
    }

    @ObfuscatedName("bg.ao(I)Lls;")
    public class319 method891() {
        Container var1 = this.method851();
        int var2 = Math.max(var1.getWidth(), this.field436);
        int var3 = Math.max(var1.getHeight(), this.field420);
        if (this.field435 != null) {
            Insets var4 = this.field435.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class319(var2, var3);
    }

    @ObfuscatedName("bg.ai(B)Z")
    public final boolean method853() {
        return this.field435 != null;
    }

    @ObfuscatedName("b.ac(S)I")
    public static int method252() {
        int var0 = 0;
        if (Statics.field166 == null || !Statics.field166.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field166 = var2;
                        field452 = -1L;
                        field451 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field166 != null) {
            long var4 = class297.method3777();
            long var6 = Statics.field166.getCollectionTime();
            if (field451 != -1L) {
                long var8 = var6 - field451;
                long var10 = var4 - field452;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field451 = var6;
            field452 = var4;
        }
        return var0;
    }

    @ObfuscatedName("bg.x(I)V")
    public abstract void method829();

    public abstract void init();

    @ObfuscatedName("bg.aj(I)V")
    public abstract void method844();

    @ObfuscatedName("bg.ae(B)V")
    public abstract void method845();

    @ObfuscatedName("bg.au(ZI)V")
    public abstract void method846(boolean arg0);

    @ObfuscatedName("bg.ah(I)V")
    public abstract void method847();

    @ObfuscatedName("bg.at(B)V")
    public abstract void method854();
}
