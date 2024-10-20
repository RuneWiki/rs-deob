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

@ObfuscatedName("c")
public abstract class class19 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("c.t")
    public static class19 field115 = null;

    @ObfuscatedName("c.v")
    public static int field126 = 0;

    @ObfuscatedName("c.j")
    public static long field117 = 0L;

    @ObfuscatedName("c.l")
    public static boolean field100 = false;

    @ObfuscatedName("c.n")
    public boolean field130 = false;

    @ObfuscatedName("c.o")
    public static int field102 = 20;

    @ObfuscatedName("c.r")
    public static int field103 = 1;

    @ObfuscatedName("c.p")
    public static int field120 = 0;

    @ObfuscatedName("c.a")
    public static long[] field105 = new long[32];

    @ObfuscatedName("c.u")
    public static long[] field112 = new long[32];

    @ObfuscatedName("c.c")
    public int field104;

    @ObfuscatedName("c.i")
    public int field98;

    @ObfuscatedName("c.m")
    public int field109 = 0;

    @ObfuscatedName("c.b")
    public int field110 = 0;

    @ObfuscatedName("c.g")
    public int field111;

    @ObfuscatedName("c.ae")
    public int field108;

    @ObfuscatedName("c.an")
    public int field113;

    @ObfuscatedName("c.am")
    public int field114;

    @ObfuscatedName("c.aa")
    public Frame field99;

    @ObfuscatedName("c.ab")
    public Canvas field106;

    @ObfuscatedName("c.ax")
    public volatile boolean field116 = true;

    @ObfuscatedName("c.av")
    public static int field118 = 500;

    @ObfuscatedName("c.as")
    public boolean field119 = false;

    @ObfuscatedName("c.ao")
    public volatile boolean field107 = false;

    @ObfuscatedName("c.az")
    public volatile long field121 = 0L;

    @ObfuscatedName("c.at")
    public class10 field122;

    @ObfuscatedName("c.af")
    public Clipboard field97;

    @ObfuscatedName("c.ar")
    public final EventQueue field124;

    @ObfuscatedName("c.ay")
    public static volatile boolean field125 = true;

    @ObfuscatedName("c.ag")
    public static long field123 = -1L;

    @ObfuscatedName("c.ai")
    public static long field127 = -1L;

    public class19() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field124 = var1;
        class25.method1339(new class12());
    }

    @ObfuscatedName("c.w(III)V")
    public final void method297(int arg0, int arg1) {
        if (this.field113 != arg0 || this.field114 != arg1) {
            this.method252();
        }
        this.field113 = arg0;
        this.field114 = arg1;
    }

    @ObfuscatedName("c.f(Ljava/lang/Object;I)V")
    public final void method245(Object arg0) {
        if (this.field124 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field124.peekEvent() != null; var2++) {
            class383.method3882(1L);
        }
        if (arg0 != null) {
            this.field124.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("c.o(I)Leo;")
    public class132 method194() {
        if (this.field122 == null) {
            this.field122 = new class10();
            this.field122.method64(this.field106);
        }
        return this.field122;
    }

    @ObfuscatedName("c.x(I)V")
    public void method195() {
        this.field97 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("c.r(Ljava/lang/String;B)V")
    public void method191(String arg0) {
        this.field97.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("c.p(I)V")
    public final void method196() {
        if (Statics.field1469.toLowerCase().indexOf("microsoft") == -1) {
            class11.field40[44] = 71;
            class11.field40[45] = 26;
            class11.field40[46] = 72;
            class11.field40[47] = 73;
            class11.field40[59] = 57;
            class11.field40[61] = 27;
            class11.field40[91] = 42;
            class11.field40[92] = 74;
            class11.field40[93] = 43;
            class11.field40[192] = 28;
            class11.field40[222] = 58;
            class11.field40[520] = 59;
        } else {
            class11.field40[186] = 57;
            class11.field40[187] = 27;
            class11.field40[188] = 71;
            class11.field40[189] = 26;
            class11.field40[190] = 72;
            class11.field40[191] = 73;
            class11.field40[192] = 58;
            class11.field40[219] = 42;
            class11.field40[220] = 74;
            class11.field40[221] = 43;
            class11.field40[222] = 59;
            class11.field40[223] = 28;
        }
        Canvas var1 = this.field106;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class11.field59);
        var1.addFocusListener(class11.field59);
    }

    @ObfuscatedName("c.h(B)V")
    public final void method197() {
        class20.method3265(this.field106);
    }

    @ObfuscatedName("c.k(I)V")
    public final void method198() {
        Container var1 = this.method289();
        if (var1 == null) {
            return;
        }
        class337 var2 = this.method223();
        this.field104 = Math.max(var2.field3923, this.field111);
        this.field98 = Math.max(var2.field3921, this.field108);
        if (this.field104 <= 0) {
            this.field104 = 1;
        }
        if (this.field98 <= 0) {
            this.field98 = 1;
        }
        Statics.field971 = Math.min(this.field104, this.field113);
        Statics.field687 = Math.min(this.field98, this.field114);
        this.field109 = (this.field104 - Statics.field971) / 2;
        this.field110 = 0;
        this.field106.setSize(Statics.field971, Statics.field687);
        Statics.field3194 = new class18(Statics.field971, Statics.field687, this.field106);
        if (this.field99 == var1) {
            Insets var3 = this.field99.getInsets();
            this.field106.setLocation(this.field109 + var3.left, this.field110 + var3.top);
        } else {
            this.field106.setLocation(this.field109, this.field110);
        }
        this.field116 = true;
        this.method202();
    }

    @ObfuscatedName("c.q(I)V")
    public void method200() {
        int var1 = this.field109;
        int var2 = this.field110;
        int var3 = this.field104 - Statics.field971 - var1;
        int var4 = this.field98 - Statics.field687 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method289();
            int var6 = 0;
            int var7 = 0;
            if (this.field99 == var5) {
                Insets var8 = this.field99.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field98);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field104, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field104 + var6 - var3, var7, var3, this.field98);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field98 + var7 - var4, this.field104, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("c.u(S)V")
    public final void method338() {
        Canvas var1 = this.field106;
        var1.removeKeyListener(class11.field59);
        var1.removeFocusListener(class11.field59);
        class11.field51 = -1;
        class20.method3226(this.field106);
        if (this.field122 != null) {
            this.field122.method66(this.field106);
        }
        this.method313();
        Canvas var2 = this.field106;
        var2.setFocusTraversalKeysEnabled(false);
        var2.addKeyListener(class11.field59);
        var2.addFocusListener(class11.field59);
        class20.method3265(this.field106);
        if (this.field122 != null) {
            this.field122.method64(this.field106);
        }
        this.method252();
    }

    @ObfuscatedName("c.e(IIII)V")
    public final void method256(int arg0, int arg1, int arg2) {
        try {
            if (field115 != null) {
                field126++;
                if (field126 >= 3) {
                    this.method221("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field115 = this;
            Statics.field971 = arg0;
            Statics.field687 = arg1;
            Statics.field4317 = arg2;
            Statics.field4318 = this;
            if (Statics.field101 == null) {
                Statics.field101 = new class130();
            }
            Statics.field101.method2288(this, 1);
        } catch (Exception var5) {
            class409.method5337((String) null, var5);
            this.method221("crash");
        }
    }

    @ObfuscatedName("c.c(I)V")
    public final synchronized void method313() {
        Container var1 = this.method289();
        if (this.field106 != null) {
            this.field106.removeFocusListener(this);
            var1.remove(this.field106);
        }
        Statics.field971 = Math.max(var1.getWidth(), this.field111);
        Statics.field687 = Math.max(var1.getHeight(), this.field108);
        if (this.field99 != null) {
            Insets var2 = this.field99.getInsets();
            Statics.field971 -= var2.right + var2.left;
            Statics.field687 -= var2.top + var2.bottom;
        }
        this.field106 = new class13(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field106);
        this.field106.setSize(Statics.field971, Statics.field687);
        this.field106.setVisible(true);
        this.field106.setBackground(Color.BLACK);
        if (this.field99 == var1) {
            Insets var3 = this.field99.getInsets();
            this.field106.setLocation(this.field109 + var3.left, this.field110 + var3.top);
        } else {
            this.field106.setLocation(this.field109, this.field110);
        }
        this.field106.addFocusListener(this);
        this.field106.requestFocus();
        this.field116 = true;
        if (Statics.field3194 != null && Statics.field971 == Statics.field3194.field4254 && Statics.field687 == Statics.field3194.field4253) {
            ((class18) Statics.field3194).method175(this.field106);
            Statics.field3194.method176(0, 0);
        } else {
            Statics.field3194 = new class18(Statics.field971, Statics.field687, this.field106);
        }
        this.field107 = false;
        this.field121 = class382.method2013();
    }

    @ObfuscatedName("c.i(I)Z")
    public final boolean method193() {
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
                this.method221("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1469 != null) {
                String var1 = Statics.field1469.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1463;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method221("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class306.method4572(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (Statics.method4323(var4) && class306.method4541(var4) < 10) {
                            this.method221("wrongjava");
                            return;
                        }
                    }
                    field103 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method313();
            this.method314();
            class137 var5;
            try {
                var5 = new class129();
            } catch (Throwable var9) {
                var5 = new class135();
            }
            Statics.field1199 = var5;
            while (field117 == 0L || class382.method2013() < field117) {
                Statics.field3167 = Statics.field1199.method2283(field102, field103);
                for (int var7 = 0; var7 < Statics.field3167; var7++) {
                    this.method204();
                }
                this.method205();
                this.method245(this.field106);
            }
        } catch (Exception var10) {
            class409.method5337((String) null, var10);
            this.method221("crash");
        }
        this.method207();
    }

    @ObfuscatedName("c.m(I)V")
    public void method204() {
        long var1 = class382.method2013();
        long var3 = field112[Statics.field3864];
        field112[Statics.field3864] = var1;
        Statics.field3864 = Statics.field3864 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field3128 = field125;
        }
        this.method217();
    }

    @ObfuscatedName("c.b(I)V")
    public void method205() {
        Container var1 = this.method289();
        long var2 = class382.method2013();
        long var4 = field105[Statics.field1485];
        field105[Statics.field1485] = var2;
        Statics.field1485 = Statics.field1485 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field120 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field118 - 1 > 50) {
            field118 -= 50;
            this.field116 = true;
            this.field106.setSize(Statics.field971, Statics.field687);
            this.field106.setVisible(true);
            if (this.field99 == var1) {
                Insets var7 = this.field99.getInsets();
                this.field106.setLocation(this.field109 + var7.left, this.field110 + var7.top);
            } else {
                this.field106.setLocation(this.field109, this.field110);
            }
        }
        if (this.field107) {
            this.method338();
        }
        this.method206();
        this.method229(this.field116);
        if (this.field116) {
            this.method200();
        }
        this.field116 = false;
    }

    @ObfuscatedName("c.z(I)V")
    public final void method206() {
        class337 var1 = this.method223();
        if (this.field104 != var1.field3923 || this.field98 != var1.field3921 || this.field119) {
            this.method198();
            this.field119 = false;
        }
    }

    @ObfuscatedName("c.d(I)V")
    public final void method252() {
        this.field119 = true;
    }

    @ObfuscatedName("c.y(I)V")
    public final synchronized void method207() {
        if (field100) {
            return;
        }
        field100 = true;
        try {
            this.field106.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method218();
        } catch (Exception var7) {
        }
        if (this.field99 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field101 != null) {
            try {
                Statics.field101.method2299();
            } catch (Exception var5) {
            }
        }
        this.method225();
    }

    public final void start() {
        if (field115 == this && !field100) {
            field117 = 0L;
        }
    }

    public final void stop() {
        if (field115 == this && !field100) {
            field117 = class382.method2013() + 4000L;
        }
    }

    public final void destroy() {
        if (field115 == this && !field100) {
            field117 = class382.method2013();
            class383.method3882(5000L);
            this.method207();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field115 != this || field100) {
            return;
        }
        this.field116 = true;
        if (class382.method2013() - this.field121 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field971 && var2.height >= Statics.field687) {
                this.field107 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field125 = true;
        this.field116 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field125 = false;
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

    @ObfuscatedName("c.au(ILjava/lang/String;ZI)V")
    public final void method219(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field106.getGraphics();
            if (Statics.field13 == null) {
                Statics.field13 = new Font("Helvetica", 1, 13);
                Statics.field1250 = this.field106.getFontMetrics(Statics.field13);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field971, Statics.field687);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field795 == null) {
                    Statics.field795 = this.field106.createImage(304, 34);
                }
                Graphics var6 = Statics.field795.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field13);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field1250.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field795, Statics.field971 / 2 - 152, Statics.field687 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field971 / 2 - 152;
                int var9 = Statics.field687 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field13);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field1250.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field106.repaint();
        }
    }

    @ObfuscatedName("c.av(I)V")
    public final void method220() {
        Statics.field795 = null;
        Statics.field13 = null;
        Statics.field1250 = null;
    }

    @ObfuscatedName("c.as(Ljava/lang/String;I)V")
    public void method221(String arg0) {
        if (this.field130) {
            return;
        }
        this.field130 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("c.ao(B)Ljava/awt/Container;")
    public Container method289() {
        return this.field99 == null ? this : this.field99;
    }

    @ObfuscatedName("c.az(B)Llo;")
    public class337 method223() {
        Container var1 = this.method289();
        int var2 = Math.max(var1.getWidth(), this.field111);
        int var3 = Math.max(var1.getHeight(), this.field108);
        if (this.field99 != null) {
            Insets var4 = this.field99.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class337(var2, var3);
    }

    @ObfuscatedName("c.ak(I)Z")
    public final boolean method224() {
        return this.field99 != null;
    }

    @ObfuscatedName("jn.aj(I)I")
    public static int method4378() {
        int var0 = 0;
        if (Statics.field1694 == null || !Statics.field1694.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field1694 = var2;
                        field127 = -1L;
                        field123 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field1694 != null) {
            long var4 = class382.method2013();
            long var6 = Statics.field1694.getCollectionTime();
            if (field123 != -1L) {
                long var8 = var6 - field123;
                long var10 = var4 - field127;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field123 = var6;
            field127 = var4;
        }
        return var0;
    }

    @ObfuscatedName("c.a(B)V")
    public abstract void method202();

    @ObfuscatedName("c.aa(I)V")
    public abstract void method217();

    @ObfuscatedName("c.ax(B)V")
    public abstract void method218();

    @ObfuscatedName("c.at(B)V")
    public abstract void method225();

    @ObfuscatedName("c.ab(ZI)V")
    public abstract void method229(boolean arg0);

    public abstract void init();

    @ObfuscatedName("c.g(B)V")
    public abstract void method314();
}
