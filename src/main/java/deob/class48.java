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

@ObfuscatedName("ah")
public abstract class class48 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ah.l")
    public static class48 field418 = null;

    @ObfuscatedName("ah.s")
    public static int field420 = 0;

    @ObfuscatedName("ah.e")
    public static long field421 = 0L;

    @ObfuscatedName("ah.a")
    public static boolean field422 = false;

    @ObfuscatedName("ah.c")
    public boolean field423 = false;

    @ObfuscatedName("ah.r")
    public static int field425 = 20;

    @ObfuscatedName("ah.m")
    public static int field426 = 1;

    @ObfuscatedName("ah.d")
    public static int field427 = 0;

    @ObfuscatedName("ah.g")
    public static long[] field428 = new long[32];

    @ObfuscatedName("ah.b")
    public static long[] field442 = new long[32];

    @ObfuscatedName("ah.t")
    public int field440;

    @ObfuscatedName("ah.n")
    public int field429;

    @ObfuscatedName("ah.h")
    public int field433 = 0;

    @ObfuscatedName("ah.o")
    public int field430 = 0;

    @ObfuscatedName("ah.q")
    public int field437;

    @ObfuscatedName("ah.av")
    public int field436;

    @ObfuscatedName("ah.ag")
    public int field432;

    @ObfuscatedName("ah.af")
    public int field438;

    @ObfuscatedName("ah.ac")
    public Frame field439;

    @ObfuscatedName("ah.am")
    public Canvas field431;

    @ObfuscatedName("ah.aw")
    public volatile boolean field441 = true;

    @ObfuscatedName("ah.as")
    public static int field451 = 500;

    @ObfuscatedName("ah.al")
    public boolean field435 = false;

    @ObfuscatedName("ah.ad")
    public volatile boolean field444 = false;

    @ObfuscatedName("ah.ax")
    public volatile long field434 = 0L;

    @ObfuscatedName("ah.ap")
    public class39 field443;

    @ObfuscatedName("ah.ar")
    public Clipboard field447;

    @ObfuscatedName("ah.ab")
    public final EventQueue field448;

    @ObfuscatedName("ah.aq")
    public static volatile boolean field449 = true;

    @ObfuscatedName("ah.ah")
    public static long field450 = -1L;

    @ObfuscatedName("ah.ai")
    public static long field446 = -1L;

    public class48() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field448 = var1;
        class41 var3 = new class41();
        Statics.field1208 = var3;
    }

    @ObfuscatedName("ah.p(IIB)V")
    public final void method727(int arg0, int arg1) {
        if (this.field432 != arg0 || this.field438 != arg1) {
            this.method810();
        }
        this.field432 = arg0;
        this.field438 = arg1;
    }

    @ObfuscatedName("ah.r(Ljava/lang/Object;I)V")
    public final void method728(Object arg0) {
        if (this.field448 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field448.peekEvent() != null; var2++) {
            class194.method1752(1L);
        }
        if (arg0 != null) {
            this.field448.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("ah.m(I)Lfm;")
    public class159 method774() {
        if (this.field443 == null) {
            this.field443 = new class39();
            this.field443.method618(this.field431);
        }
        return this.field443;
    }

    @ObfuscatedName("ah.d(I)V")
    public void method730() {
        this.field447 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("ah.z(Ljava/lang/String;S)V")
    public void method731(String arg0) {
        this.field447.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("ah.x(I)V")
    public final void method818() {
        class40.method117();
        class40.method3022(this.field431);
    }

    @ObfuscatedName("ah.v(B)V")
    public final void method775() {
        class49.method2637(this.field431);
    }

    @ObfuscatedName("ah.g(I)V")
    public final void method734() {
        Container var1 = this.method767();
        if (var1 == null) {
            return;
        }
        class316 var2 = this.method762();
        this.field440 = Math.max(var2.field3830, this.field437);
        this.field429 = Math.max(var2.field3831, this.field436);
        if (this.field440 <= 0) {
            this.field440 = 1;
        }
        if (this.field429 <= 0) {
            this.field429 = 1;
        }
        Statics.field2652 = Math.min(this.field440, this.field432);
        Statics.field253 = Math.min(this.field429, this.field438);
        this.field433 = (this.field440 - Statics.field2652) / 2;
        this.field430 = 0;
        this.field431.setSize(Statics.field2652, Statics.field253);
        Statics.field1916 = new class47(Statics.field2652, Statics.field253, this.field431);
        if (this.field439 == var1) {
            Insets var3 = this.field439.getInsets();
            this.field431.setLocation(this.field433 + var3.left, this.field430 + var3.top);
        } else {
            this.field431.setLocation(this.field433, this.field430);
        }
        this.field441 = true;
        this.method752();
    }

    @ObfuscatedName("ah.o(I)V")
    public void method736() {
        int var1 = this.field433;
        int var2 = this.field430;
        int var3 = this.field440 - Statics.field2652 - var1;
        int var4 = this.field429 - Statics.field253 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method767();
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
                var9.fillRect(var6, var7, var1, this.field429);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field440, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field440 + var6 - var3, var7, var3, this.field429);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field429 + var7 - var4, this.field440, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("ah.i(I)V")
    public final void method741() {
        Canvas var1 = this.field431;
        var1.removeKeyListener(class40.field390);
        var1.removeFocusListener(class40.field390);
        class40.field363 = -1;
        class49.method3156(this.field431);
        if (this.field443 != null) {
            this.field443.method619(this.field431);
        }
        this.method735();
        class40.method3022(this.field431);
        class49.method2637(this.field431);
        if (this.field443 != null) {
            this.field443.method618(this.field431);
        }
        this.method810();
    }

    @ObfuscatedName("ah.k(IIIB)V")
    public final void method738(int arg0, int arg1, int arg2) {
        try {
            if (field418 != null) {
                field420++;
                if (field420 >= 3) {
                    this.method754("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field418 = this;
            Statics.field2652 = arg0;
            Statics.field253 = arg1;
            Statics.field1996 = arg2;
            Statics.field1999 = this;
            if (Statics.field445 == null) {
                Statics.field445 = new class157();
            }
            Statics.field445.method3077(this, 1);
        } catch (Exception var5) {
            class155.method2919((String) null, var5);
            this.method754("crash");
        }
    }

    @ObfuscatedName("ah.q(I)V")
    public final synchronized void method735() {
        Container var1 = this.method767();
        if (this.field431 != null) {
            this.field431.removeFocusListener(this);
            var1.remove(this.field431);
        }
        Statics.field2652 = Math.max(var1.getWidth(), this.field437);
        Statics.field253 = Math.max(var1.getHeight(), this.field436);
        if (this.field439 != null) {
            Insets var2 = this.field439.getInsets();
            Statics.field2652 -= var2.right + var2.left;
            Statics.field253 -= var2.top + var2.bottom;
        }
        this.field431 = new class43(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field431);
        this.field431.setSize(Statics.field2652, Statics.field253);
        this.field431.setVisible(true);
        this.field431.setBackground(Color.BLACK);
        if (this.field439 == var1) {
            Insets var3 = this.field439.getInsets();
            this.field431.setLocation(this.field433 + var3.left, this.field430 + var3.top);
        } else {
            this.field431.setLocation(this.field433, this.field430);
        }
        this.field431.addFocusListener(this);
        this.field431.requestFocus();
        this.field441 = true;
        if (Statics.field1916 != null && Statics.field2652 == Statics.field1916.field3856 && Statics.field253 == Statics.field1916.field3855) {
            ((class47) Statics.field1916).method710(this.field431);
            Statics.field1916.method711(0, 0);
        } else {
            Statics.field1916 = new class47(Statics.field2652, Statics.field253, this.field431);
        }
        this.field444 = false;
        this.field434 = Statics.method1926();
    }

    @ObfuscatedName("ah.at(I)Z")
    public final boolean method733() {
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
                this.method754("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field4012 != null) {
                String var1 = Statics.field4012.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2020;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method754("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class308.method5021(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class308.method3921(var4) && class308.method1769(var4) < 10) {
                            this.method754("wrongjava");
                            return;
                        }
                    }
                    field426 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method735();
            this.method749();
            class163 var5;
            try {
                var5 = new class152();
            } catch (Throwable var9) {
                var5 = new class153();
            }
            Statics.field1200 = var5;
            while (field421 == 0L || Statics.method1926() < field421) {
                Statics.field424 = Statics.field1200.method3031(field425, field426);
                for (int var7 = 0; var7 < Statics.field424; var7++) {
                    this.method742();
                }
                this.method743();
                this.method728(this.field431);
            }
        } catch (Exception var10) {
            class155.method2919((String) null, var10);
            this.method754("crash");
        }
        this.method825();
    }

    @ObfuscatedName("ah.ac(I)V")
    public void method742() {
        long var1 = Statics.method1926();
        long var3 = field442[Statics.field419];
        field442[Statics.field419] = var1;
        Statics.field419 = Statics.field419 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field2088 = field449;
        }
        this.method750();
    }

    @ObfuscatedName("ah.am(B)V")
    public void method743() {
        Container var1 = this.method767();
        long var2 = Statics.method1926();
        long var4 = field428[Statics.field2004];
        field428[Statics.field2004] = var2;
        Statics.field2004 = Statics.field2004 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field427 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field451 - 1 > 50) {
            field451 -= 50;
            this.field441 = true;
            this.field431.setSize(Statics.field2652, Statics.field253);
            this.field431.setVisible(true);
            if (this.field439 == var1) {
                Insets var7 = this.field439.getInsets();
                this.field431.setLocation(this.field433 + var7.left, this.field430 + var7.top);
            } else {
                this.field431.setLocation(this.field433, this.field430);
            }
        }
        if (this.field444) {
            this.method741();
        }
        this.method744();
        this.method751(this.field441);
        if (this.field441) {
            this.method736();
        }
        this.field441 = false;
    }

    @ObfuscatedName("ah.aw(I)V")
    public final void method744() {
        class316 var1 = this.method762();
        if (this.field440 != var1.field3830 || this.field429 != var1.field3831 || this.field435) {
            this.method734();
            this.field435 = false;
        }
    }

    @ObfuscatedName("ah.aa(B)V")
    public final void method810() {
        this.field435 = true;
    }

    @ObfuscatedName("ah.as(I)V")
    public final synchronized void method825() {
        if (field422) {
            return;
        }
        field422 = true;
        try {
            this.field431.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method748();
        } catch (Exception var7) {
        }
        if (this.field439 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field445 != null) {
            try {
                Statics.field445.method3074();
            } catch (Exception var5) {
            }
        }
        this.method758();
    }

    public final void start() {
        if (field418 == this && !field422) {
            field421 = 0L;
        }
    }

    public final void stop() {
        if (field418 == this && !field422) {
            field421 = Statics.method1926() + 4000L;
        }
    }

    public final void destroy() {
        if (field418 == this && !field422) {
            field421 = Statics.method1926();
            class194.method1752(5000L);
            this.method825();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field418 != this || field422) {
            return;
        }
        this.field441 = true;
        if (Statics.method1926() - this.field434 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field2652 && var2.height >= Statics.field253) {
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

    @ObfuscatedName("ah.ae(ILjava/lang/String;ZB)V")
    public final void method756(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field431.getGraphics();
            if (Statics.field1955 == null) {
                Statics.field1955 = new Font("Helvetica", 1, 13);
                Statics.field85 = this.field431.getFontMetrics(Statics.field1955);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field2652, Statics.field253);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field343 == null) {
                    Statics.field343 = this.field431.createImage(304, 34);
                }
                Graphics var6 = Statics.field343.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field1955);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field85.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field343, Statics.field2652 / 2 - 152, Statics.field253 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field2652 / 2 - 152;
                int var9 = Statics.field253 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1955);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field85.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field431.repaint();
        }
    }

    @ObfuscatedName("ah.ap(I)V")
    public final void method753() {
        Statics.field343 = null;
        Statics.field1955 = null;
        Statics.field85 = null;
    }

    @ObfuscatedName("ah.ar(Ljava/lang/String;B)V")
    public void method754(String arg0) {
        if (this.field423) {
            return;
        }
        this.field423 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ah.ab(I)Ljava/awt/Container;")
    public Container method767() {
        return this.field439 == null ? this : this.field439;
    }

    @ObfuscatedName("ah.aq(I)Llo;")
    public class316 method762() {
        Container var1 = this.method767();
        int var2 = Math.max(var1.getWidth(), this.field437);
        int var3 = Math.max(var1.getHeight(), this.field436);
        if (this.field439 != null) {
            Insets var4 = this.field439.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class316(var2, var3);
    }

    @ObfuscatedName("ah.au(I)Z")
    public final boolean method828() {
        return this.field439 != null;
    }

    @ObfuscatedName("eh.aj(I)I")
    public static int method3038() {
        int var0 = 0;
        if (Statics.field3427 == null || !Statics.field3427.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field3427 = var2;
                        field446 = -1L;
                        field450 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field3427 != null) {
            long var4 = Statics.method1926();
            long var6 = Statics.field3427.getCollectionTime();
            if (field450 != -1L) {
                long var8 = var6 - field450;
                long var10 = var4 - field446;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field450 = var6;
            field446 = var4;
        }
        return var0;
    }

    @ObfuscatedName("ah.ao(I)V")
    public abstract void method748();

    public abstract void init();

    @ObfuscatedName("ah.al(I)V")
    public abstract void method749();

    @ObfuscatedName("ah.ad(I)V")
    public abstract void method750();

    @ObfuscatedName("ah.ax(ZI)V")
    public abstract void method751(boolean arg0);

    @ObfuscatedName("ah.u(I)V")
    public abstract void method752();

    @ObfuscatedName("ah.ah(I)V")
    public abstract void method758();
}
