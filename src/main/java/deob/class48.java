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
import java.net.URL;

@ObfuscatedName("ai")
public abstract class class48 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ai.h")
    public static class48 field415 = null;

    @ObfuscatedName("ai.e")
    public static int field413 = 0;

    @ObfuscatedName("ai.b")
    public static long field405 = 0L;

    @ObfuscatedName("ai.l")
    public static boolean field393 = false;

    @ObfuscatedName("ai.d")
    public boolean field394 = false;

    @ObfuscatedName("ai.s")
    public static int field395 = 20;

    @ObfuscatedName("ai.g")
    public static int field401 = 1;

    @ObfuscatedName("ai.a")
    public static int field397 = 0;

    @ObfuscatedName("ai.m")
    public static long[] field400 = new long[32];

    @ObfuscatedName("ai.u")
    public static long[] field399 = new long[32];

    @ObfuscatedName("ai.t")
    public int field391;

    @ObfuscatedName("ai.v")
    public int field422;

    @ObfuscatedName("ai.p")
    public int field421 = 0;

    @ObfuscatedName("ai.z")
    public int field403 = 0;

    @ObfuscatedName("ai.c")
    public int field404;

    @ObfuscatedName("ai.av")
    public int field402;

    @ObfuscatedName("ai.as")
    public int field406;

    @ObfuscatedName("ai.al")
    public int field407;

    @ObfuscatedName("ai.aa")
    public Frame field409;

    @ObfuscatedName("ai.ag")
    public Canvas field410;

    @ObfuscatedName("ai.aj")
    public volatile boolean field411 = true;

    @ObfuscatedName("ai.ap")
    public static int field412 = 500;

    @ObfuscatedName("ai.am")
    public boolean field390 = false;

    @ObfuscatedName("ai.ae")
    public volatile boolean field414 = false;

    @ObfuscatedName("ai.ac")
    public volatile long field396 = 0L;

    @ObfuscatedName("ai.af")
    public class39 field416;

    @ObfuscatedName("ai.ab")
    public Clipboard field417;

    @ObfuscatedName("ai.ar")
    public final EventQueue field418;

    @ObfuscatedName("ai.ao")
    public static volatile boolean field419 = true;

    @ObfuscatedName("ai.ai")
    public static long field420 = -1L;

    @ObfuscatedName("ai.ak")
    public static long field389 = -1L;

    public class48() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field418 = var1;
        class41 var3 = new class41();
        Statics.field1230 = var3;
    }

    @ObfuscatedName("ai.b(III)V")
    public final void method704(int arg0, int arg1) {
        if (this.field406 != arg0 || this.field407 != arg1) {
            this.method703();
        }
        this.field406 = arg0;
        this.field407 = arg1;
    }

    @ObfuscatedName("ai.l(Ljava/lang/Object;B)V")
    public final void method705(Object arg0) {
        if (this.field418 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field418.peekEvent() != null; var2++) {
            class194.method3013(1L);
        }
        if (arg0 != null) {
            this.field418.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("ai.w(B)Lfi;")
    public class159 method706() {
        if (this.field416 == null) {
            this.field416 = new class39();
            this.field416.method608(this.field410);
        }
        return this.field416;
    }

    @ObfuscatedName("ai.d(I)V")
    public void method778() {
        this.field417 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("ai.n(Ljava/lang/String;I)V")
    public void method707(String arg0) {
        this.field417.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("ai.s(I)V")
    public final void method708() {
        if (Statics.field2005.toLowerCase().indexOf("microsoft") == -1) {
            class40.field337[44] = 71;
            class40.field337[45] = 26;
            class40.field337[46] = 72;
            class40.field337[47] = 73;
            class40.field337[59] = 57;
            class40.field337[61] = 27;
            class40.field337[91] = 42;
            class40.field337[92] = 74;
            class40.field337[93] = 43;
            class40.field337[192] = 28;
            class40.field337[222] = 58;
            class40.field337[520] = 59;
        } else {
            class40.field337[186] = 57;
            class40.field337[187] = 27;
            class40.field337[188] = 71;
            class40.field337[189] = 26;
            class40.field337[190] = 72;
            class40.field337[191] = 73;
            class40.field337[192] = 58;
            class40.field337[219] = 42;
            class40.field337[220] = 74;
            class40.field337[221] = 43;
            class40.field337[222] = 59;
            class40.field337[223] = 28;
        }
        class40.method527(this.field410);
    }

    @ObfuscatedName("ai.g(I)V")
    public final void method809() {
        Canvas var1 = this.field410;
        var1.addMouseListener(class49.field428);
        var1.addMouseMotionListener(class49.field428);
        var1.addFocusListener(class49.field428);
    }

    @ObfuscatedName("ai.k(I)V")
    public final void method710() {
        Container var1 = this.method734();
        if (var1 == null) {
            return;
        }
        class316 var2 = this.method735();
        this.field391 = Math.max(var2.field3832, this.field404);
        this.field422 = Math.max(var2.field3828, this.field402);
        if (this.field391 <= 0) {
            this.field391 = 1;
        }
        if (this.field422 <= 0) {
            this.field422 = 1;
        }
        Statics.field2097 = Math.min(this.field391, this.field406);
        Statics.field3800 = Math.min(this.field422, this.field407);
        this.field421 = (this.field391 - Statics.field2097) / 2;
        this.field403 = 0;
        this.field410.setSize(Statics.field2097, Statics.field3800);
        Statics.field3231 = new class47(Statics.field2097, Statics.field3800, this.field410);
        if (this.field409 == var1) {
            Insets var3 = this.field409.getInsets();
            this.field410.setLocation(this.field421 + var3.left, this.field403 + var3.top);
        } else {
            this.field410.setLocation(this.field421, this.field403);
        }
        this.field411 = true;
        this.method805();
    }

    @ObfuscatedName("ai.q(B)V")
    public void method749() {
        int var1 = this.field421;
        int var2 = this.field403;
        int var3 = this.field391 - Statics.field2097 - var1;
        int var4 = this.field422 - Statics.field3800 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method734();
            int var6 = 0;
            int var7 = 0;
            if (this.field409 == var5) {
                Insets var8 = this.field409.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field422);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field391, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field391 + var6 - var3, var7, var3, this.field422);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field422 + var7 - var4, this.field391, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("ai.x(I)V")
    public final void method713() {
        class40.method2588(this.field410);
        Canvas var1 = this.field410;
        var1.removeMouseListener(class49.field428);
        var1.removeMouseMotionListener(class49.field428);
        var1.removeFocusListener(class49.field428);
        class49.field430 = 0;
        if (this.field416 != null) {
            this.field416.method610(this.field410);
        }
        this.method715();
        class40.method527(this.field410);
        Canvas var2 = this.field410;
        var2.addMouseListener(class49.field428);
        var2.addMouseMotionListener(class49.field428);
        var2.addFocusListener(class49.field428);
        if (this.field416 != null) {
            this.field416.method608(this.field410);
        }
        this.method703();
    }

    @ObfuscatedName("ai.u(IIII)V")
    public final void method820(int arg0, int arg1, int arg2) {
        try {
            if (field415 != null) {
                field413++;
                if (field413 >= 3) {
                    this.method744("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field415 = this;
            Statics.field2097 = arg0;
            Statics.field3800 = arg1;
            Statics.field1981 = arg2;
            Statics.field1987 = this;
            if (Statics.field392 == null) {
                Statics.field392 = new class157();
            }
            Statics.field392.method3052(this, 1);
        } catch (Exception var5) {
            class155.method1834((String) null, var5);
            this.method744("crash");
        }
    }

    @ObfuscatedName("ai.o(B)V")
    public final synchronized void method715() {
        Container var1 = this.method734();
        if (this.field410 != null) {
            this.field410.removeFocusListener(this);
            var1.remove(this.field410);
        }
        Statics.field2097 = Math.max(var1.getWidth(), this.field404);
        Statics.field3800 = Math.max(var1.getHeight(), this.field402);
        if (this.field409 != null) {
            Insets var2 = this.field409.getInsets();
            Statics.field2097 -= var2.right + var2.left;
            Statics.field3800 -= var2.top + var2.bottom;
        }
        this.field410 = new class43(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field410);
        this.field410.setSize(Statics.field2097, Statics.field3800);
        this.field410.setVisible(true);
        this.field410.setBackground(Color.BLACK);
        if (this.field409 == var1) {
            Insets var3 = this.field409.getInsets();
            this.field410.setLocation(this.field421 + var3.left, this.field403 + var3.top);
        } else {
            this.field410.setLocation(this.field421, this.field403);
        }
        this.field410.addFocusListener(this);
        this.field410.requestFocus();
        this.field411 = true;
        if (Statics.field3231 != null && Statics.field2097 == Statics.field3231.field3853 && Statics.field3800 == Statics.field3231.field3856) {
            ((class47) Statics.field3231).method689(this.field410);
            Statics.field3231.method688(0, 0);
        } else {
            Statics.field3231 = new class47(Statics.field2097, Statics.field3800, this.field410);
        }
        this.field414 = false;
        this.field396 = class187.method2864();
    }

    @ObfuscatedName("ai.as(I)Z")
    public final boolean method716() {
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
                this.method744("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2005 != null) {
                String var1 = Statics.field2005.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1998;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method744("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class308.method4479(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        boolean var5 = class308.method875(var4, 10, true);
                        if (var5) {
                            int var6 = class308.method2935(var4, 10, true);
                            if (var6 < 10) {
                                this.method744("wrongjava");
                                return;
                            }
                        }
                    }
                    field401 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method715();
            this.method767();
            class163 var7;
            try {
                var7 = new class152();
            } catch (Throwable var11) {
                var7 = new class153();
            }
            Statics.field367 = var7;
            while (field405 == 0L || class187.method2864() < field405) {
                Statics.field331 = Statics.field367.method3015(field395, field401);
                for (int var9 = 0; var9 < Statics.field331; var9++) {
                    this.method717();
                }
                this.method711();
                this.method705(this.field410);
            }
        } catch (Exception var12) {
            class155.method1834((String) null, var12);
            this.method744("crash");
        }
        this.method815();
    }

    @ObfuscatedName("ai.al(I)V")
    public void method717() {
        long var1 = class187.method2864();
        long var3 = field399[Statics.field1926];
        field399[Statics.field1926] = var1;
        Statics.field1926 = Statics.field1926 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1501 = field419;
        }
        this.method720();
    }

    @ObfuscatedName("ai.ax(B)V")
    public void method711() {
        Container var1 = this.method734();
        long var2 = class187.method2864();
        long var4 = field400[Statics.field1954];
        field400[Statics.field1954] = var2;
        Statics.field1954 = Statics.field1954 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field397 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field412 - 1 > 50) {
            field412 -= 50;
            this.field411 = true;
            this.field410.setSize(Statics.field2097, Statics.field3800);
            this.field410.setVisible(true);
            if (this.field409 == var1) {
                Insets var7 = this.field409.getInsets();
                this.field410.setLocation(this.field421 + var7.left, this.field403 + var7.top);
            } else {
                this.field410.setLocation(this.field421, this.field403);
            }
        }
        if (this.field414) {
            this.method713();
        }
        this.method719();
        this.method810(this.field411);
        if (this.field411) {
            this.method749();
        }
        this.field411 = false;
    }

    @ObfuscatedName("ai.ay(I)V")
    public final void method719() {
        class316 var1 = this.method735();
        if (this.field391 != var1.field3832 || this.field422 != var1.field3828 || this.field390) {
            this.method710();
            this.field390 = false;
        }
    }

    @ObfuscatedName("ai.aa(I)V")
    public final void method703() {
        this.field390 = true;
    }

    @ObfuscatedName("ai.ag(I)V")
    public final synchronized void method815() {
        if (field393) {
            return;
        }
        field393 = true;
        try {
            this.field410.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method731();
        } catch (Exception var7) {
        }
        if (this.field409 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field392 != null) {
            try {
                Statics.field392.method3050();
            } catch (Exception var5) {
            }
        }
        this.method736();
    }

    @ObfuscatedName("client.aj(I)V")
    public static final void method1390() {
        Statics.field367.method3019();
        for (int var0 = 0; var0 < 32; var0++) {
            field400[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field399[var1] = 0L;
        }
        Statics.field331 = 0;
    }

    public final void start() {
        if (field415 == this && !field393) {
            field405 = 0L;
        }
    }

    public final void stop() {
        if (field415 == this && !field393) {
            field405 = class187.method2864() + 4000L;
        }
    }

    public final void destroy() {
        if (field415 == this && !field393) {
            field405 = class187.method2864();
            class194.method3013(5000L);
            this.method815();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field415 != this || field393) {
            return;
        }
        this.field411 = true;
        if (class187.method2864() - this.field396 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field2097 && var2.height >= Statics.field3800) {
                this.field414 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field419 = true;
        this.field411 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field419 = false;
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

    @ObfuscatedName("ai.ac(ILjava/lang/String;ZI)V")
    public final void method780(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field410.getGraphics();
            if (Statics.field408 == null) {
                Statics.field408 = new Font("Helvetica", 1, 13);
                Statics.field1120 = this.field410.getFontMetrics(Statics.field408);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field2097, Statics.field3800);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field1400 == null) {
                    Statics.field1400 = this.field410.createImage(304, 34);
                }
                Graphics var6 = Statics.field1400.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field408);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field1120.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field1400, Statics.field2097 / 2 - 152, Statics.field3800 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field2097 / 2 - 152;
                int var9 = Statics.field3800 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field408);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field1120.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field410.repaint();
        }
    }

    @ObfuscatedName("ai.ah(I)V")
    public final void method729() {
        Statics.field1400 = null;
        Statics.field408 = null;
        Statics.field1120 = null;
    }

    @ObfuscatedName("ai.aq(Ljava/lang/String;I)V")
    public void method744(String arg0) {
        if (this.field394) {
            return;
        }
        this.field394 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ai.af(B)Ljava/awt/Container;")
    public Container method734() {
        return this.field409 == null ? this : this.field409;
    }

    @ObfuscatedName("ai.ab(B)Llo;")
    public class316 method735() {
        Container var1 = this.method734();
        int var2 = Math.max(var1.getWidth(), this.field404);
        int var3 = Math.max(var1.getHeight(), this.field402);
        if (this.field409 != null) {
            Insets var4 = this.field409.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class316(var2, var3);
    }

    @ObfuscatedName("ai.ar(I)Z")
    public final boolean method837() {
        return this.field409 != null;
    }

    @ObfuscatedName("ai.ap(B)V")
    public abstract void method720();

    @ObfuscatedName("ai.ae(I)V")
    public abstract void method731();

    public abstract void init();

    @ObfuscatedName("ai.ao(I)V")
    public abstract void method736();

    @ObfuscatedName("ai.an(I)V")
    public abstract void method767();

    @ObfuscatedName("ai.m(I)V")
    public abstract void method805();

    @ObfuscatedName("ai.am(ZI)V")
    public abstract void method810(boolean arg0);
}
