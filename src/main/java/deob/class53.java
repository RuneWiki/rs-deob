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

@ObfuscatedName("ba")
public abstract class class53 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ba.f")
    public static class53 field417 = null;

    @ObfuscatedName("ba.q")
    public static int field432 = 0;

    @ObfuscatedName("ba.o")
    public static long field440 = 0L;

    @ObfuscatedName("ba.u")
    public static boolean field420 = false;

    @ObfuscatedName("ba.g")
    public boolean field421 = false;

    @ObfuscatedName("ba.e")
    public static int field433 = 20;

    @ObfuscatedName("ba.d")
    public static int field431 = 1;

    @ObfuscatedName("ba.k")
    public static int field430 = 0;

    @ObfuscatedName("ba.a")
    public static long[] field426 = new long[32];

    @ObfuscatedName("ba.j")
    public static long[] field427 = new long[32];

    @ObfuscatedName("ba.t")
    public int field429;

    @ObfuscatedName("ba.h")
    public int field435;

    @ObfuscatedName("ba.b")
    public int field447 = 0;

    @ObfuscatedName("ba.c")
    public int field424 = 0;

    @ObfuscatedName("ba.v")
    public int field446;

    @ObfuscatedName("ba.ag")
    public int field434;

    @ObfuscatedName("ba.aq")
    public int field436;

    @ObfuscatedName("ba.aj")
    public int field418;

    @ObfuscatedName("ba.ac")
    public Frame field451;

    @ObfuscatedName("ba.ay")
    public Canvas field438;

    @ObfuscatedName("ba.ah")
    public volatile boolean field439 = true;

    @ObfuscatedName("ba.aw")
    public static int field423 = 500;

    @ObfuscatedName("ba.al")
    public boolean field441 = false;

    @ObfuscatedName("ba.ab")
    public volatile boolean field442 = false;

    @ObfuscatedName("ba.ae")
    public volatile long field443 = 0L;

    @ObfuscatedName("ba.ap")
    public class44 field444;

    @ObfuscatedName("ba.as")
    public Clipboard field445;

    @ObfuscatedName("ba.am")
    public final EventQueue field416;

    @ObfuscatedName("ba.an")
    public static volatile boolean field437 = true;

    @ObfuscatedName("ba.ao")
    public static long field448 = -1L;

    @ObfuscatedName("ba.aa")
    public static long field449 = -1L;

    public class53() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field416 = var1;
        class46 var3 = new class46();
        Statics.field583 = var3;
    }

    @ObfuscatedName("ba.u(IIB)V")
    public final void method784(int arg0, int arg1) {
        if (this.field436 != arg0 || this.field418 != arg1) {
            this.method801();
        }
        this.field436 = arg0;
        this.field418 = arg1;
    }

    @ObfuscatedName("ba.g(Ljava/lang/Object;I)V")
    public final void method785(Object arg0) {
        if (this.field416 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field416.peekEvent() != null; var2++) {
            class211.method3659(1L);
        }
        if (arg0 != null) {
            this.field416.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("ba.l(B)Lfv;")
    public class170 method913() {
        if (this.field444 == null) {
            this.field444 = new class44();
            this.field444.method674(this.field438);
        }
        return this.field444;
    }

    @ObfuscatedName("ba.e(I)V")
    public void method815() {
        this.field445 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("ba.x(Ljava/lang/String;I)V")
    public void method788(String arg0) {
        this.field445.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("ba.d(I)V")
    public final void method789() {
        if (Statics.field2031.toLowerCase().indexOf("microsoft") == -1) {
            class45.field377[44] = 71;
            class45.field377[45] = 26;
            class45.field377[46] = 72;
            class45.field377[47] = 73;
            class45.field377[59] = 57;
            class45.field377[61] = 27;
            class45.field377[91] = 42;
            class45.field377[92] = 74;
            class45.field377[93] = 43;
            class45.field377[192] = 28;
            class45.field377[222] = 58;
            class45.field377[520] = 59;
        } else {
            class45.field377[186] = 57;
            class45.field377[187] = 27;
            class45.field377[188] = 71;
            class45.field377[189] = 26;
            class45.field377[190] = 72;
            class45.field377[191] = 73;
            class45.field377[192] = 58;
            class45.field377[219] = 42;
            class45.field377[220] = 74;
            class45.field377[221] = 43;
            class45.field377[222] = 59;
            class45.field377[223] = 28;
        }
        Canvas var1 = this.field438;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class45.field371);
        var1.addFocusListener(class45.field371);
    }

    @ObfuscatedName("ba.a(I)V")
    public final void method790() {
        Canvas var1 = this.field438;
        var1.addMouseListener(class54.field455);
        var1.addMouseMotionListener(class54.field455);
        var1.addFocusListener(class54.field455);
    }

    @ObfuscatedName("ba.z(I)V")
    public final void method791() {
        Container var1 = this.method813();
        if (var1 == null) {
            return;
        }
        class320 var2 = this.method814();
        this.field429 = Math.max(var2.field3855, this.field446);
        this.field435 = Math.max(var2.field3853, this.field434);
        if (this.field429 <= 0) {
            this.field429 = 1;
        }
        if (this.field435 <= 0) {
            this.field435 = 1;
        }
        Statics.field1402 = Math.min(this.field429, this.field436);
        Statics.field2370 = Math.min(this.field435, this.field418);
        this.field447 = (this.field429 - Statics.field1402) / 2;
        this.field424 = 0;
        this.field438.setSize(Statics.field1402, Statics.field2370);
        Statics.field2396 = new class52(Statics.field1402, Statics.field2370, this.field438);
        if (this.field451 == var1) {
            Insets var3 = this.field451.getInsets();
            this.field438.setLocation(this.field447 + var3.left, this.field424 + var3.top);
        } else {
            this.field438.setLocation(this.field447, this.field424);
        }
        this.field439 = true;
        this.method920();
    }

    @ObfuscatedName("ba.p(B)V")
    public void method793() {
        int var1 = this.field447;
        int var2 = this.field424;
        int var3 = this.field429 - Statics.field1402 - var1;
        int var4 = this.field435 - Statics.field2370 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method813();
            int var6 = 0;
            int var7 = 0;
            if (this.field451 == var5) {
                Insets var8 = this.field451.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field435);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field429, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field429 + var6 - var3, var7, var3, this.field435);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field435 + var7 - var4, this.field429, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("ba.v(I)V")
    public final void method794() {
        Canvas var1 = this.field438;
        var1.removeKeyListener(class45.field371);
        var1.removeFocusListener(class45.field371);
        class45.field368 = -1;
        Canvas var2 = this.field438;
        var2.removeMouseListener(class54.field455);
        var2.removeMouseMotionListener(class54.field455);
        var2.removeFocusListener(class54.field455);
        class54.field476 = 0;
        if (this.field444 != null) {
            this.field444.method675(this.field438);
        }
        this.method891();
        Canvas var3 = this.field438;
        var3.setFocusTraversalKeysEnabled(false);
        var3.addKeyListener(class45.field371);
        var3.addFocusListener(class45.field371);
        Canvas var4 = this.field438;
        var4.addMouseListener(class54.field455);
        var4.addMouseMotionListener(class54.field455);
        var4.addFocusListener(class54.field455);
        if (this.field444 != null) {
            this.field444.method674(this.field438);
        }
        this.method801();
    }

    @ObfuscatedName("ba.ag(IIII)V")
    public final void method795(int arg0, int arg1, int arg2) {
        try {
            if (field417 != null) {
                field432++;
                if (field432 >= 3) {
                    this.method812("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field417 = this;
            Statics.field1402 = arg0;
            Statics.field2370 = arg1;
            Statics.field2011 = arg2;
            Statics.field2017 = this;
            if (Statics.field419 == null) {
                Statics.field419 = new class168();
            }
            Statics.field419.method3147(this, 1);
        } catch (Exception var5) {
            class166.method4746((String) null, var5);
            this.method812("crash");
        }
    }

    @ObfuscatedName("ba.aq(B)V")
    public final synchronized void method891() {
        Container var1 = this.method813();
        if (this.field438 != null) {
            this.field438.removeFocusListener(this);
            var1.remove(this.field438);
        }
        Statics.field1402 = Math.max(var1.getWidth(), this.field446);
        Statics.field2370 = Math.max(var1.getHeight(), this.field434);
        if (this.field451 != null) {
            Insets var2 = this.field451.getInsets();
            Statics.field1402 -= var2.right + var2.left;
            Statics.field2370 -= var2.top + var2.bottom;
        }
        this.field438 = new class48(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field438);
        this.field438.setSize(Statics.field1402, Statics.field2370);
        this.field438.setVisible(true);
        this.field438.setBackground(Color.BLACK);
        if (this.field451 == var1) {
            Insets var3 = this.field451.getInsets();
            this.field438.setLocation(this.field447 + var3.left, this.field424 + var3.top);
        } else {
            this.field438.setLocation(this.field447, this.field424);
        }
        this.field438.addFocusListener(this);
        this.field438.requestFocus();
        this.field439 = true;
        if (Statics.field2396 != null && Statics.field1402 == Statics.field2396.field3879 && Statics.field2370 == Statics.field2396.field3878) {
            ((class52) Statics.field2396).method766(this.field438);
            Statics.field2396.method767(0, 0);
        } else {
            Statics.field2396 = new class52(Statics.field1402, Statics.field2370, this.field438);
        }
        this.field442 = false;
        this.field443 = class204.method3658();
    }

    @ObfuscatedName("ba.aj(B)Z")
    public final boolean method797() {
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
                this.method812("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2031 != null) {
                String var1 = Statics.field2031.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2032;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method812("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class309.method3109(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class309.method3054(var4) && class309.method947(var4) < 10) {
                            this.method812("wrongjava");
                            return;
                        }
                    }
                    field431 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method891();
            this.method807();
            class174 var5;
            try {
                var5 = new class163();
            } catch (Throwable var9) {
                var5 = new class164();
            }
            Statics.field1975 = var5;
            while (field440 == 0L || class204.method3658() < field440) {
                Statics.field422 = Statics.field1975.method3111(field433, field431);
                for (int var7 = 0; var7 < Statics.field422; var7++) {
                    this.method798();
                }
                this.method874();
                this.method785(this.field438);
            }
        } catch (Exception var10) {
            class166.method4746((String) null, var10);
            this.method812("crash");
        }
        this.method899();
    }

    @ObfuscatedName("ba.av(B)V")
    public void method798() {
        long var1 = class204.method3658();
        long var3 = field427[Statics.field428];
        field427[Statics.field428] = var1;
        Statics.field428 = Statics.field428 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field2800 = field437;
        }
        this.method832();
    }

    @ObfuscatedName("ba.ar(B)V")
    public void method874() {
        Container var1 = this.method813();
        long var2 = class204.method3658();
        long var4 = field426[Statics.field34];
        field426[Statics.field34] = var2;
        Statics.field34 = Statics.field34 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field430 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field423 - 1 > 50) {
            field423 -= 50;
            this.field439 = true;
            this.field438.setSize(Statics.field1402, Statics.field2370);
            this.field438.setVisible(true);
            if (this.field451 == var1) {
                Insets var7 = this.field451.getInsets();
                this.field438.setLocation(this.field447 + var7.left, this.field424 + var7.top);
            } else {
                this.field438.setLocation(this.field447, this.field424);
            }
        }
        if (this.field442) {
            this.method794();
        }
        this.method800();
        this.method846(this.field439);
        if (this.field439) {
            this.method793();
        }
        this.field439 = false;
    }

    @ObfuscatedName("ba.ac(I)V")
    public final void method800() {
        class320 var1 = this.method814();
        if (this.field429 != var1.field3855 || this.field435 != var1.field3853 || this.field441) {
            this.method791();
            this.field441 = false;
        }
    }

    @ObfuscatedName("ba.ay(I)V")
    public final void method801() {
        this.field441 = true;
    }

    @ObfuscatedName("ba.ah(I)V")
    public final synchronized void method899() {
        if (field420) {
            return;
        }
        field420 = true;
        try {
            this.field438.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method809();
        } catch (Exception var7) {
        }
        if (this.field451 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field419 != null) {
            try {
                Statics.field419.method3154();
            } catch (Exception var5) {
            }
        }
        this.method816();
    }

    @ObfuscatedName("k.ak(B)V")
    public static final void method128() {
        Statics.field1975.method3112();
        for (int var0 = 0; var0 < 32; var0++) {
            field426[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field427[var1] = 0L;
        }
        Statics.field422 = 0;
    }

    public final void start() {
        if (field417 == this && !field420) {
            field440 = 0L;
        }
    }

    public final void stop() {
        if (field417 == this && !field420) {
            field440 = class204.method3658() + 4000L;
        }
    }

    public final void destroy() {
        if (field417 == this && !field420) {
            field440 = class204.method3658();
            class211.method3659(5000L);
            this.method899();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field417 != this || field420) {
            return;
        }
        this.field439 = true;
        if (class204.method3658() - this.field443 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1402 && var2.height >= Statics.field2370) {
                this.field442 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field437 = true;
        this.field439 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field437 = false;
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

    @ObfuscatedName("ba.at(ILjava/lang/String;ZB)V")
    public final void method810(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field438.getGraphics();
            if (Statics.field2828 == null) {
                Statics.field2828 = new Font("Helvetica", 1, 13);
                Statics.field526 = this.field438.getFontMetrics(Statics.field2828);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field1402, Statics.field2370);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field3169 == null) {
                    Statics.field3169 = this.field438.createImage(304, 34);
                }
                Graphics var6 = Statics.field3169.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field2828);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field526.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field3169, Statics.field1402 / 2 - 152, Statics.field2370 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field1402 / 2 - 152;
                int var9 = Statics.field2370 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field2828);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field526.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field438.repaint();
        }
    }

    @ObfuscatedName("ba.ad(I)V")
    public final void method842() {
        Statics.field3169 = null;
        Statics.field2828 = null;
        Statics.field526 = null;
    }

    @ObfuscatedName("ba.ap(Ljava/lang/String;B)V")
    public void method812(String arg0) {
        if (this.field421) {
            return;
        }
        this.field421 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ba.as(I)Ljava/awt/Container;")
    public Container method813() {
        return this.field451 == null ? this : this.field451;
    }

    @ObfuscatedName("ba.am(I)Lla;")
    public class320 method814() {
        Container var1 = this.method813();
        int var2 = Math.max(var1.getWidth(), this.field446);
        int var3 = Math.max(var1.getHeight(), this.field434);
        if (this.field451 != null) {
            Insets var4 = this.field451.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class320(var2, var3);
    }

    @ObfuscatedName("ba.an(B)Z")
    public final boolean method905() {
        return this.field451 != null;
    }

    @ObfuscatedName("cf.az(I)I")
    public static int method2035() {
        int var0 = 0;
        if (Statics.field3221 == null || !Statics.field3221.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field3221 = var2;
                        field449 = -1L;
                        field448 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field3221 != null) {
            long var4 = class204.method3658();
            long var6 = Statics.field3221.getCollectionTime();
            if (field448 != -1L) {
                long var8 = var6 - field448;
                long var10 = var4 - field449;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field448 = var6;
            field449 = var4;
        }
        return var0;
    }

    public abstract void init();

    @ObfuscatedName("ba.aw(I)V")
    public abstract void method807();

    @ObfuscatedName("ba.ae(I)V")
    public abstract void method809();

    @ObfuscatedName("ba.au(I)V")
    public abstract void method816();

    @ObfuscatedName("ba.al(I)V")
    public abstract void method832();

    @ObfuscatedName("ba.ab(ZI)V")
    public abstract void method846(boolean arg0);

    @ObfuscatedName("ba.j(I)V")
    public abstract void method920();
}
