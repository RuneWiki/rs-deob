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

@ObfuscatedName("bf")
public abstract class class53 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bf.h")
    public static class53 field435 = null;

    @ObfuscatedName("bf.l")
    public static int field449 = 0;

    @ObfuscatedName("bf.g")
    public static long field429 = 0L;

    @ObfuscatedName("bf.b")
    public static boolean field455 = false;

    @ObfuscatedName("bf.a")
    public boolean field431 = false;

    @ObfuscatedName("bf.z")
    public static int field428 = 20;

    @ObfuscatedName("bf.j")
    public static int field426 = 1;

    @ObfuscatedName("bf.d")
    public static int field434 = 0;

    @ObfuscatedName("bf.i")
    public static long[] field436 = new long[32];

    @ObfuscatedName("bf.v")
    public static long[] field437 = new long[32];

    @ObfuscatedName("bf.p")
    public int field438;

    @ObfuscatedName("bf.k")
    public int field439;

    @ObfuscatedName("bf.o")
    public int field440 = 0;

    @ObfuscatedName("bf.s")
    public int field441 = 0;

    @ObfuscatedName("bf.q")
    public int field430;

    @ObfuscatedName("bf.aa")
    public int field444;

    @ObfuscatedName("bf.ai")
    public int field445;

    @ObfuscatedName("bf.ag")
    public int field446;

    @ObfuscatedName("bf.as")
    public Frame field458;

    @ObfuscatedName("bf.ac")
    public Canvas field448;

    @ObfuscatedName("bf.an")
    public volatile boolean field427 = true;

    @ObfuscatedName("bf.ah")
    public static int field450 = 500;

    @ObfuscatedName("bf.al")
    public boolean field451 = false;

    @ObfuscatedName("bf.am")
    public volatile boolean field452 = false;

    @ObfuscatedName("bf.ao")
    public volatile long field453 = 0L;

    @ObfuscatedName("bf.ab")
    public class44 field454;

    @ObfuscatedName("bf.ae")
    public Clipboard field447;

    @ObfuscatedName("bf.au")
    public final EventQueue field443;

    @ObfuscatedName("bf.ay")
    public static volatile boolean field457 = true;

    @ObfuscatedName("bf.ar")
    public static long field432 = -1L;

    @ObfuscatedName("bf.ax")
    public static long field459 = -1L;

    public class53() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field443 = var1;
        class103.method4906(new class46());
    }

    @ObfuscatedName("bf.a(III)V")
    public final void method752(int arg0, int arg1) {
        if (this.field445 != arg0 || this.field446 != arg1) {
            this.method769();
        }
        this.field445 = arg0;
        this.field446 = arg1;
    }

    @ObfuscatedName("bf.c(Ljava/lang/Object;I)V")
    public final void method786(Object arg0) {
        if (this.field443 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field443.peekEvent() != null; var2++) {
            class199.method3065(1L);
        }
        if (arg0 != null) {
            this.field443.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bf.z(I)Lfn;")
    public class164 method806() {
        if (this.field454 == null) {
            this.field454 = new class44();
            this.field454.method650(this.field448);
        }
        return this.field454;
    }

    @ObfuscatedName("bf.j(B)V")
    public void method755() {
        this.field447 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bf.d(Ljava/lang/String;B)V")
    public void method756(String arg0) {
        this.field447.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bf.i(B)V")
    public final void method893() {
        if (Statics.field2038.toLowerCase().indexOf("microsoft") == -1) {
            class45.field394[44] = 71;
            class45.field394[45] = 26;
            class45.field394[46] = 72;
            class45.field394[47] = 73;
            class45.field394[59] = 57;
            class45.field394[61] = 27;
            class45.field394[91] = 42;
            class45.field394[92] = 74;
            class45.field394[93] = 43;
            class45.field394[192] = 28;
            class45.field394[222] = 58;
            class45.field394[520] = 59;
        } else {
            class45.field394[186] = 57;
            class45.field394[187] = 27;
            class45.field394[188] = 71;
            class45.field394[189] = 26;
            class45.field394[190] = 72;
            class45.field394[191] = 73;
            class45.field394[192] = 58;
            class45.field394[219] = 42;
            class45.field394[220] = 74;
            class45.field394[221] = 43;
            class45.field394[222] = 59;
            class45.field394[223] = 28;
        }
        Canvas var1 = this.field448;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class45.field368);
        var1.addFocusListener(class45.field368);
    }

    @ObfuscatedName("bf.m(I)V")
    public final void method811() {
        class54.method687(this.field448);
    }

    @ObfuscatedName("bf.v(I)V")
    public final void method881() {
        Container var1 = this.method783();
        if (var1 == null) {
            return;
        }
        class319 var2 = this.method784();
        this.field438 = Math.max(var2.field3835, this.field430);
        this.field439 = Math.max(var2.field3836, this.field444);
        if (this.field438 <= 0) {
            this.field438 = 1;
        }
        if (this.field439 <= 0) {
            this.field439 = 1;
        }
        Statics.field1878 = Math.min(this.field438, this.field445);
        Statics.field442 = Math.min(this.field439, this.field446);
        this.field440 = (this.field438 - Statics.field1878) / 2;
        this.field441 = 0;
        this.field448.setSize(Statics.field1878, Statics.field442);
        Statics.field184 = new class52(Statics.field1878, Statics.field442, this.field448);
        if (this.field458 == var1) {
            Insets var3 = this.field458.getInsets();
            this.field448.setLocation(this.field440 + var3.left, this.field441 + var3.top);
        } else {
            this.field448.setLocation(this.field440, this.field441);
        }
        this.field427 = true;
        this.method863();
    }

    @ObfuscatedName("bf.x(I)V")
    public void method761() {
        int var1 = this.field440;
        int var2 = this.field441;
        int var3 = this.field438 - Statics.field1878 - var1;
        int var4 = this.field439 - Statics.field442 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method783();
            int var6 = 0;
            int var7 = 0;
            if (this.field458 == var5) {
                Insets var8 = this.field458.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field439);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field438, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field438 + var6 - var3, var7, var3, this.field439);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field439 + var7 - var4, this.field438, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bf.y(B)V")
    public final void method762() {
        class45.method4820(this.field448);
        Canvas var1 = this.field448;
        var1.removeMouseListener(class54.field463);
        var1.removeMouseMotionListener(class54.field463);
        var1.removeFocusListener(class54.field463);
        class54.field465 = 0;
        if (this.field454 != null) {
            this.field454.method659(this.field448);
        }
        this.method766();
        Canvas var2 = this.field448;
        var2.setFocusTraversalKeysEnabled(false);
        var2.addKeyListener(class45.field368);
        var2.addFocusListener(class45.field368);
        Canvas var3 = this.field448;
        var3.addMouseListener(class54.field463);
        var3.addMouseMotionListener(class54.field463);
        var3.addFocusListener(class54.field463);
        if (this.field454 != null) {
            this.field454.method650(this.field448);
        }
        this.method769();
    }

    @ObfuscatedName("bf.p(IIII)V")
    public final void method775(int arg0, int arg1, int arg2) {
        try {
            if (field435 != null) {
                field449++;
                if (field449 >= 3) {
                    this.method782("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field435 = this;
            Statics.field1878 = arg0;
            Statics.field442 = arg1;
            Statics.field2019 = arg2;
            Statics.field2023 = this;
            if (Statics.field456 == null) {
                Statics.field456 = new class162();
            }
            Statics.field456.method3254(this, 1);
        } catch (Exception var5) {
            class160.method943((String) null, var5);
            this.method782("crash");
        }
    }

    @ObfuscatedName("bf.u(I)V")
    public final synchronized void method766() {
        Container var1 = this.method783();
        if (this.field448 != null) {
            this.field448.removeFocusListener(this);
            var1.remove(this.field448);
        }
        Statics.field1878 = Math.max(var1.getWidth(), this.field430);
        Statics.field442 = Math.max(var1.getHeight(), this.field444);
        if (this.field458 != null) {
            Insets var2 = this.field458.getInsets();
            Statics.field1878 -= var2.right + var2.left;
            Statics.field442 -= var2.top + var2.bottom;
        }
        this.field448 = new class48(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field448);
        this.field448.setSize(Statics.field1878, Statics.field442);
        this.field448.setVisible(true);
        this.field448.setBackground(Color.BLACK);
        if (this.field458 == var1) {
            Insets var3 = this.field458.getInsets();
            this.field448.setLocation(this.field440 + var3.left, this.field441 + var3.top);
        } else {
            this.field448.setLocation(this.field440, this.field441);
        }
        this.field448.addFocusListener(this);
        this.field448.requestFocus();
        this.field427 = true;
        if (Statics.field184 != null && Statics.field1878 == Statics.field184.field3863 && Statics.field442 == Statics.field184.field3861) {
            ((class52) Statics.field184).method737(this.field448);
            Statics.field184.method738(0, 0);
        } else {
            Statics.field184 = new class52(Statics.field1878, Statics.field442, this.field448);
        }
        this.field452 = false;
        this.field453 = class192.method81();
    }

    @ObfuscatedName("bf.aa(B)Z")
    public final boolean method819() {
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
                this.method782("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2038 != null) {
                String var1 = Statics.field2038.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2035;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method782("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class311.method515(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (Statics.method4372(var4) && class311.method689(var4) < 10) {
                            this.method782("wrongjava");
                            return;
                        }
                    }
                    field426 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method766();
            this.method776();
            Statics.field1946 = class168.method226();
            while (field429 == 0L || class192.method81() < field429) {
                Statics.field2661 = Statics.field1946.method3210(field428, field426);
                for (int var5 = 0; var5 < Statics.field2661; var5++) {
                    this.method753();
                }
                this.method772();
                this.method786(this.field448);
            }
        } catch (Exception var7) {
            class160.method943((String) null, var7);
            this.method782("crash");
        }
        this.method760();
    }

    @ObfuscatedName("bf.ai(I)V")
    public void method753() {
        long var1 = class192.method81();
        long var3 = field437[Statics.field261];
        field437[Statics.field261] = var1;
        Statics.field261 = Statics.field261 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field21 = field457;
        }
        this.method777();
    }

    @ObfuscatedName("bf.ag(I)V")
    public void method772() {
        Container var1 = this.method783();
        long var2 = class192.method81();
        long var4 = field436[Statics.field2659];
        field436[Statics.field2659] = var2;
        Statics.field2659 = Statics.field2659 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field434 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field450 - 1 > 50) {
            field450 -= 50;
            this.field427 = true;
            this.field448.setSize(Statics.field1878, Statics.field442);
            this.field448.setVisible(true);
            if (this.field458 == var1) {
                Insets var7 = this.field458.getInsets();
                this.field448.setLocation(this.field440 + var7.left, this.field441 + var7.top);
            } else {
                this.field448.setLocation(this.field440, this.field441);
            }
        }
        if (this.field452) {
            this.method762();
        }
        this.method860();
        this.method778(this.field427);
        if (this.field427) {
            this.method761();
        }
        this.field427 = false;
    }

    @ObfuscatedName("bf.at(I)V")
    public final void method860() {
        class319 var1 = this.method784();
        if (this.field438 != var1.field3835 || this.field439 != var1.field3836 || this.field451) {
            this.method881();
            this.field451 = false;
        }
    }

    @ObfuscatedName("bf.ad(I)V")
    public final void method769() {
        this.field451 = true;
    }

    @ObfuscatedName("bf.as(I)V")
    public final synchronized void method760() {
        if (field455) {
            return;
        }
        field455 = true;
        try {
            this.field448.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method779();
        } catch (Exception var7) {
        }
        if (this.field458 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field456 != null) {
            try {
                Statics.field456.method3249();
            } catch (Exception var5) {
            }
        }
        this.method785();
    }

    public final void start() {
        if (field435 == this && !field455) {
            field429 = 0L;
        }
    }

    public final void stop() {
        if (field435 == this && !field455) {
            field429 = class192.method81() + 4000L;
        }
    }

    public final void destroy() {
        if (field435 == this && !field455) {
            field429 = class192.method81();
            class199.method3065(5000L);
            this.method760();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field435 != this || field455) {
            return;
        }
        this.field427 = true;
        if (class192.method81() - this.field453 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1878 && var2.height >= Statics.field442) {
                this.field452 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field457 = true;
        this.field427 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field457 = false;
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

    @ObfuscatedName("bf.al(ILjava/lang/String;ZB)V")
    public final void method780(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field448.getGraphics();
            if (Statics.field1199 == null) {
                Statics.field1199 = new Font("Helvetica", 1, 13);
                Statics.field1991 = this.field448.getFontMetrics(Statics.field1199);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field1878, Statics.field442);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field1134 == null) {
                    Statics.field1134 = this.field448.createImage(304, 34);
                }
                Graphics var6 = Statics.field1134.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field1199);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field1991.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field1134, Statics.field1878 / 2 - 152, Statics.field442 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field1878 / 2 - 152;
                int var9 = Statics.field442 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1199);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field1991.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field448.repaint();
        }
    }

    @ObfuscatedName("bf.am(I)V")
    public final void method781() {
        Statics.field1134 = null;
        Statics.field1199 = null;
        Statics.field1991 = null;
    }

    @ObfuscatedName("bf.ao(Ljava/lang/String;I)V")
    public void method782(String arg0) {
        if (this.field431) {
            return;
        }
        this.field431 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bf.aq(I)Ljava/awt/Container;")
    public Container method783() {
        return this.field458 == null ? this : this.field458;
    }

    @ObfuscatedName("bf.aw(I)Llb;")
    public class319 method784() {
        Container var1 = this.method783();
        int var2 = Math.max(var1.getWidth(), this.field430);
        int var3 = Math.max(var1.getHeight(), this.field444);
        if (this.field458 != null) {
            Insets var4 = this.field458.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class319(var2, var3);
    }

    @ObfuscatedName("bf.ab(I)Z")
    public final boolean method770() {
        return this.field458 != null;
    }

    public abstract void init();

    @ObfuscatedName("bf.ac(I)V")
    public abstract void method776();

    @ObfuscatedName("bf.an(I)V")
    public abstract void method777();

    @ObfuscatedName("bf.ak(ZI)V")
    public abstract void method778(boolean arg0);

    @ObfuscatedName("bf.ah(B)V")
    public abstract void method779();

    @ObfuscatedName("bf.au(I)V")
    public abstract void method785();

    @ObfuscatedName("bf.r(B)V")
    public abstract void method863();
}
