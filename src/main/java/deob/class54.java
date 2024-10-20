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

@ObfuscatedName("bn")
public abstract class class54 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bn.t")
    public static class54 field423 = null;

    @ObfuscatedName("bn.g")
    public static int field435 = 0;

    @ObfuscatedName("bn.l")
    public static long field437 = 0L;

    @ObfuscatedName("bn.u")
    public static boolean field422 = false;

    @ObfuscatedName("bn.j")
    public boolean field433 = false;

    @ObfuscatedName("bn.d")
    public static int field443 = 20;

    @ObfuscatedName("bn.z")
    public static int field426 = 1;

    @ObfuscatedName("bn.n")
    public static int field451 = 0;

    @ObfuscatedName("bn.s")
    public static long[] field428 = new long[32];

    @ObfuscatedName("bn.e")
    public static long[] field419 = new long[32];

    @ObfuscatedName("bn.q")
    public int field430;

    @ObfuscatedName("bn.r")
    public int field431;

    @ObfuscatedName("bn.k")
    public int field420 = 0;

    @ObfuscatedName("bn.m")
    public int field427 = 0;

    @ObfuscatedName("bn.b")
    public int field436;

    @ObfuscatedName("bn.ag")
    public int field429;

    @ObfuscatedName("bn.at")
    public int field421;

    @ObfuscatedName("bn.ao")
    public int field438;

    @ObfuscatedName("bn.al")
    public Frame field439;

    @ObfuscatedName("bn.as")
    public Canvas field440;

    @ObfuscatedName("bn.ad")
    public volatile boolean field441 = true;

    @ObfuscatedName("bn.ax")
    public static int field442 = 500;

    @ObfuscatedName("bn.aj")
    public boolean field432 = false;

    @ObfuscatedName("bn.ab")
    public volatile boolean field444 = false;

    @ObfuscatedName("bn.af")
    public volatile long field445 = 0L;

    @ObfuscatedName("bn.ae")
    public class45 field446;

    @ObfuscatedName("bn.ah")
    public Clipboard field447;

    @ObfuscatedName("bn.aa")
    public final EventQueue field448;

    @ObfuscatedName("bn.aq")
    public static volatile boolean field449 = true;

    @ObfuscatedName("bn.az")
    public static long field425 = -1L;

    @ObfuscatedName("bn.ai")
    public static long field418 = -1L;

    public class54() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field448 = var1;
        class47 var3 = new class47();
        Statics.field1088 = var3;
    }

    @ObfuscatedName("bn.g(III)V")
    public final void method759(int arg0, int arg1) {
        if (this.field421 != arg0 || this.field438 != arg1) {
            this.method783();
        }
        this.field421 = arg0;
        this.field438 = arg1;
    }

    @ObfuscatedName("bn.l(Ljava/lang/Object;I)V")
    public final void method760(Object arg0) {
        if (this.field448 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field448.peekEvent() != null; var2++) {
            class298.method4811(1L);
        }
        if (arg0 != null) {
            this.field448.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bn.u(I)Lfa;")
    public class169 method761() {
        if (this.field446 == null) {
            this.field446 = new class45();
            this.field446.method640(this.field440);
        }
        return this.field446;
    }

    @ObfuscatedName("bn.j(I)V")
    public void method785() {
        this.field447 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bn.v(Ljava/lang/String;I)V")
    public void method763(String arg0) {
        this.field447.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bn.d(I)V")
    public final void method764() {
        class46.method29();
        class46.method3992(this.field440);
    }

    @ObfuscatedName("bn.z(I)V")
    public final void method765() {
        Canvas var1 = this.field440;
        var1.addMouseListener(class55.field455);
        var1.addMouseMotionListener(class55.field455);
        var1.addFocusListener(class55.field455);
    }

    @ObfuscatedName("bn.s(B)V")
    public final void method852() {
        Container var1 = this.method791();
        if (var1 == null) {
            return;
        }
        class319 var2 = this.method792();
        this.field430 = Math.max(var2.field3835, this.field436);
        this.field431 = Math.max(var2.field3836, this.field429);
        if (this.field430 <= 0) {
            this.field430 = 1;
        }
        if (this.field431 <= 0) {
            this.field431 = 1;
        }
        Statics.field3796 = Math.min(this.field430, this.field421);
        Statics.field434 = Math.min(this.field431, this.field438);
        this.field420 = (this.field430 - Statics.field3796) / 2;
        this.field427 = 0;
        this.field440.setSize(Statics.field3796, Statics.field434);
        Statics.field394 = new class53(Statics.field3796, Statics.field434, this.field440);
        if (this.field439 == var1) {
            Insets var3 = this.field439.getInsets();
            this.field440.setLocation(this.field420 + var3.left, this.field427 + var3.top);
        } else {
            this.field440.setLocation(this.field420, this.field427);
        }
        this.field441 = true;
        this.method810();
    }

    @ObfuscatedName("bn.e(B)V")
    public void method767() {
        int var1 = this.field420;
        int var2 = this.field427;
        int var3 = this.field430 - Statics.field3796 - var1;
        int var4 = this.field431 - Statics.field434 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method791();
            int var6 = 0;
            int var7 = 0;
            if (this.field439 == var5) {
                Insets var8 = this.field439.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field431);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field430, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field430 + var6 - var3, var7, var3, this.field431);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field431 + var7 - var4, this.field430, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bn.i(B)V")
    public final void method790() {
        Canvas var1 = this.field440;
        var1.removeKeyListener(class46.field387);
        var1.removeFocusListener(class46.field387);
        class46.field367 = -1;
        Canvas var2 = this.field440;
        var2.removeMouseListener(class55.field455);
        var2.removeMouseMotionListener(class55.field455);
        var2.removeFocusListener(class55.field455);
        class55.field457 = 0;
        if (this.field446 != null) {
            this.field446.method641(this.field440);
        }
        this.method770();
        class46.method3992(this.field440);
        Canvas var3 = this.field440;
        var3.addMouseListener(class55.field455);
        var3.addMouseMotionListener(class55.field455);
        var3.addFocusListener(class55.field455);
        if (this.field446 != null) {
            this.field446.method640(this.field440);
        }
        this.method783();
    }

    @ObfuscatedName("bn.q(IIII)V")
    public final void method769(int arg0, int arg1, int arg2) {
        try {
            if (field423 != null) {
                field435++;
                if (field435 >= 3) {
                    this.method811("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field423 = this;
            Statics.field3796 = arg0;
            Statics.field434 = arg1;
            Statics.field4045 = arg2;
            Statics.field4046 = this;
            if (Statics.field450 == null) {
                Statics.field450 = new class167();
            }
            Statics.field450.method3195(this, 1);
        } catch (Exception var5) {
            class341.method3361((String) null, var5);
            this.method811("crash");
        }
    }

    @ObfuscatedName("bn.r(I)V")
    public final synchronized void method770() {
        Container var1 = this.method791();
        if (this.field440 != null) {
            this.field440.removeFocusListener(this);
            var1.remove(this.field440);
        }
        Statics.field3796 = Math.max(var1.getWidth(), this.field436);
        Statics.field434 = Math.max(var1.getHeight(), this.field429);
        if (this.field439 != null) {
            Insets var2 = this.field439.getInsets();
            Statics.field3796 -= var2.right + var2.left;
            Statics.field434 -= var2.top + var2.bottom;
        }
        this.field440 = new class49(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field440);
        this.field440.setSize(Statics.field3796, Statics.field434);
        this.field440.setVisible(true);
        this.field440.setBackground(Color.BLACK);
        if (this.field439 == var1) {
            Insets var3 = this.field439.getInsets();
            this.field440.setLocation(this.field420 + var3.left, this.field427 + var3.top);
        } else {
            this.field440.setLocation(this.field420, this.field427);
        }
        this.field440.addFocusListener(this);
        this.field440.requestFocus();
        this.field441 = true;
        if (Statics.field394 != null && Statics.field3796 == Statics.field394.field3849 && Statics.field434 == Statics.field394.field3850) {
            ((class53) Statics.field394).method757(this.field440);
            Statics.field394.method744(0, 0);
        } else {
            Statics.field394 = new class53(Statics.field3796, Statics.field434, this.field440);
        }
        this.field444 = false;
        this.field445 = Statics.method2303();
    }

    @ObfuscatedName("bn.k(I)Z")
    public final boolean method882() {
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
                this.method811("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2005 != null) {
                String var1 = Statics.field2005.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2004;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method811("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class291.method1572(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class291.method2058(var4) && class291.method4721(var4) < 10) {
                            this.method811("wrongjava");
                            return;
                        }
                    }
                    field426 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method770();
            this.method784();
            Statics.field1036 = class171.method3169();
            while (field437 == 0L || Statics.method2303() < field437) {
                Statics.field424 = Statics.field1036.method3185(field443, field426);
                for (int var5 = 0; var5 < Statics.field424; var5++) {
                    this.method890();
                }
                this.method774();
                this.method760(this.field440);
            }
        } catch (Exception var7) {
            class341.method3361((String) null, var7);
            this.method811("crash");
        }
        this.method776();
    }

    @ObfuscatedName("bn.w(I)V")
    public void method890() {
        long var1 = Statics.method2303();
        long var3 = field419[Statics.field3595];
        field419[Statics.field3595] = var1;
        Statics.field3595 = Statics.field3595 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field909 = field449;
        }
        this.method768();
    }

    @ObfuscatedName("bn.m(B)V")
    public void method774() {
        Container var1 = this.method791();
        long var2 = Statics.method2303();
        long var4 = field428[Statics.field2307];
        field428[Statics.field2307] = var2;
        Statics.field2307 = Statics.field2307 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field451 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field442 - 1 > 50) {
            field442 -= 50;
            this.field441 = true;
            this.field440.setSize(Statics.field3796, Statics.field434);
            this.field440.setVisible(true);
            if (this.field439 == var1) {
                Insets var7 = this.field439.getInsets();
                this.field440.setLocation(this.field420 + var7.left, this.field427 + var7.top);
            } else {
                this.field440.setLocation(this.field420, this.field427);
            }
        }
        if (this.field444) {
            this.method790();
        }
        this.method775();
        this.method786(this.field441);
        if (this.field441) {
            this.method767();
        }
        this.field441 = false;
    }

    @ObfuscatedName("bn.o(B)V")
    public final void method775() {
        class319 var1 = this.method792();
        if (this.field430 != var1.field3835 || this.field431 != var1.field3836 || this.field432) {
            this.method852();
            this.field432 = false;
        }
    }

    @ObfuscatedName("bn.a(B)V")
    public final void method783() {
        this.field432 = true;
    }

    @ObfuscatedName("bn.b(I)V")
    public final synchronized void method776() {
        if (field422) {
            return;
        }
        field422 = true;
        try {
            this.field440.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method787();
        } catch (Exception var7) {
        }
        if (this.field439 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field450 != null) {
            try {
                Statics.field450.method3192();
            } catch (Exception var5) {
            }
        }
        this.method794();
    }

    @ObfuscatedName("es.ag(B)V")
    public static final void method3036() {
        Statics.field1036.method3183();
        for (int var0 = 0; var0 < 32; var0++) {
            field428[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field419[var1] = 0L;
        }
        Statics.field424 = 0;
    }

    public final void start() {
        if (field423 == this && !field422) {
            field437 = 0L;
        }
    }

    public final void stop() {
        if (field423 == this && !field422) {
            field437 = Statics.method2303() + 4000L;
        }
    }

    public final void destroy() {
        if (field423 == this && !field422) {
            field437 = Statics.method2303();
            class298.method4811(5000L);
            this.method776();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field423 != this || field422) {
            return;
        }
        this.field441 = true;
        if (Statics.method2303() - this.field445 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field3796 && var2.height >= Statics.field434) {
                this.field444 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field449 = true;
        this.field441 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field449 = false;
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

    @ObfuscatedName("bn.al(ILjava/lang/String;ZB)V")
    public final void method788(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field440.getGraphics();
            if (Statics.field413 == null) {
                Statics.field413 = new Font("Helvetica", 1, 13);
                Statics.field368 = this.field440.getFontMetrics(Statics.field413);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field3796, Statics.field434);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field359 == null) {
                    Statics.field359 = this.field440.createImage(304, 34);
                }
                Graphics var6 = Statics.field359.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field413);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field368.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field359, Statics.field3796 / 2 - 152, Statics.field434 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field3796 / 2 - 152;
                int var9 = Statics.field434 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field413);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field368.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field440.repaint();
        }
    }

    @ObfuscatedName("bn.ax(I)V")
    public final void method789() {
        Statics.field359 = null;
        Statics.field413 = null;
        Statics.field368 = null;
    }

    @ObfuscatedName("bn.aj(Ljava/lang/String;I)V")
    public void method811(String arg0) {
        if (this.field433) {
            return;
        }
        this.field433 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bn.ab(I)Ljava/awt/Container;")
    public Container method791() {
        return this.field439 == null ? this : this.field439;
    }

    @ObfuscatedName("bn.af(I)Llr;")
    public class319 method792() {
        Container var1 = this.method791();
        int var2 = Math.max(var1.getWidth(), this.field436);
        int var3 = Math.max(var1.getHeight(), this.field429);
        if (this.field439 != null) {
            Insets var4 = this.field439.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class319(var2, var3);
    }

    @ObfuscatedName("bn.ak(S)Z")
    public final boolean method793() {
        return this.field439 != null;
    }

    @ObfuscatedName("ai.ay(I)I")
    public static int method695() {
        int var0 = 0;
        if (Statics.field55 == null || !Statics.field55.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field55 = var2;
                        field418 = -1L;
                        field425 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field55 != null) {
            long var4 = Statics.method2303();
            long var6 = Statics.field55.getCollectionTime();
            if (field425 != -1L) {
                long var8 = var6 - field425;
                long var10 = var4 - field418;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field425 = var6;
            field418 = var4;
        }
        return var0;
    }

    @ObfuscatedName("bn.ao(I)V")
    public abstract void method768();

    public abstract void init();

    @ObfuscatedName("bn.at(B)V")
    public abstract void method784();

    @ObfuscatedName("bn.av(ZI)V")
    public abstract void method786(boolean arg0);

    @ObfuscatedName("bn.an(I)V")
    public abstract void method787();

    @ObfuscatedName("bn.ae(I)V")
    public abstract void method794();

    @ObfuscatedName("bn.p(I)V")
    public abstract void method810();
}
