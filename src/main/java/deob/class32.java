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

@ObfuscatedName("aj")
public abstract class class32 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("aj.q")
    public static class32 field180 = null;

    @ObfuscatedName("aj.l")
    public static int field181 = 0;

    @ObfuscatedName("aj.k")
    public static long field197 = 0L;

    @ObfuscatedName("aj.a")
    public static boolean field193 = false;

    @ObfuscatedName("aj.m")
    public boolean field192 = false;

    @ObfuscatedName("aj.s")
    public static int field186 = 20;

    @ObfuscatedName("aj.r")
    public static int field188 = 1;

    @ObfuscatedName("aj.v")
    public static int field182 = 0;

    @ObfuscatedName("aj.t")
    public static long[] field189 = new long[32];

    @ObfuscatedName("aj.n")
    public static long[] field190 = new long[32];

    @ObfuscatedName("aj.h")
    public int field191;

    @ObfuscatedName("aj.f")
    public int field210;

    @ObfuscatedName("aj.d")
    public int field217 = 0;

    @ObfuscatedName("aj.j")
    public int field194 = 0;

    @ObfuscatedName("aj.u")
    public int field195;

    @ObfuscatedName("aj.ag")
    public int field196;

    @ObfuscatedName("aj.ar")
    public int field183;

    @ObfuscatedName("aj.am")
    public int field184;

    @ObfuscatedName("aj.aj")
    public Frame field199;

    @ObfuscatedName("aj.ae")
    public Canvas field200;

    @ObfuscatedName("aj.az")
    public volatile boolean field201 = true;

    @ObfuscatedName("aj.as")
    public static int field203 = 500;

    @ObfuscatedName("aj.au")
    public boolean field179 = false;

    @ObfuscatedName("aj.ak")
    public volatile boolean field205 = false;

    @ObfuscatedName("aj.af")
    public volatile long field206 = 0L;

    @ObfuscatedName("aj.ad")
    public class23 field204;

    @ObfuscatedName("aj.an")
    public Clipboard field209;

    @ObfuscatedName("aj.aw")
    public final EventQueue field187;

    @ObfuscatedName("aj.ah")
    public static volatile boolean field208 = true;

    @ObfuscatedName("aj.ai")
    public static long field212 = -1L;

    @ObfuscatedName("aj.ay")
    public static long field213 = -1L;

    public class32() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field187 = var1;
        class25 var3 = new class25();
        Statics.field299 = var3;
    }

    @ObfuscatedName("aj.m(III)V")
    public final void method402(int arg0, int arg1) {
        if (this.field183 != arg0 || this.field184 != arg1) {
            this.method418();
        }
        this.field183 = arg0;
        this.field184 = arg1;
    }

    @ObfuscatedName("aj.p(Ljava/lang/Object;B)V")
    public final void method403(Object arg0) {
        if (this.field187 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field187.peekEvent() != null; var2++) {
            class271.method4446(1L);
        }
        if (arg0 != null) {
            this.field187.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("aj.s(I)Lfy;")
    public class159 method415() {
        if (this.field204 == null) {
            this.field204 = new class23();
            this.field204.method276(this.field200);
        }
        return this.field204;
    }

    @ObfuscatedName("aj.r(I)V")
    public void method405() {
        this.field209 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("aj.v(Ljava/lang/String;B)V")
    public void method422(String arg0) {
        this.field209.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("aj.y(I)V")
    public final void method407() {
        if (Statics.field1759.toLowerCase().indexOf("microsoft") == -1) {
            class24.field147[44] = 71;
            class24.field147[45] = 26;
            class24.field147[46] = 72;
            class24.field147[47] = 73;
            class24.field147[59] = 57;
            class24.field147[61] = 27;
            class24.field147[91] = 42;
            class24.field147[92] = 74;
            class24.field147[93] = 43;
            class24.field147[192] = 28;
            class24.field147[222] = 58;
            class24.field147[520] = 59;
        } else {
            class24.field147[186] = 57;
            class24.field147[187] = 27;
            class24.field147[188] = 71;
            class24.field147[189] = 26;
            class24.field147[190] = 72;
            class24.field147[191] = 73;
            class24.field147[192] = 58;
            class24.field147[219] = 42;
            class24.field147[220] = 74;
            class24.field147[221] = 43;
            class24.field147[222] = 59;
            class24.field147[223] = 28;
        }
        Canvas var1 = this.field200;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class24.field126);
        var1.addFocusListener(class24.field126);
    }

    @ObfuscatedName("aj.c(B)V")
    public final void method408() {
        class33.method2975(this.field200);
    }

    @ObfuscatedName("aj.w(B)V")
    public final void method453() {
        Container var1 = this.method433();
        if (var1 == null) {
            return;
        }
        class385 var2 = this.method434();
        this.field191 = Math.max(var2.field4387, this.field195);
        this.field210 = Math.max(var2.field4388, this.field196);
        if (this.field191 <= 0) {
            this.field191 = 1;
        }
        if (this.field210 <= 0) {
            this.field210 = 1;
        }
        Statics.field841 = Math.min(this.field191, this.field183);
        Statics.field4663 = Math.min(this.field210, this.field184);
        this.field217 = (this.field191 - Statics.field841) / 2;
        this.field194 = 0;
        this.field200.setSize(Statics.field841, Statics.field4663);
        Statics.field153 = new class31(Statics.field841, Statics.field4663, this.field200);
        if (this.field199 == var1) {
            Insets var3 = this.field199.getInsets();
            this.field200.setLocation(this.field217 + var3.left, this.field194 + var3.top);
        } else {
            this.field200.setLocation(this.field217, this.field194);
        }
        this.field201 = true;
        this.method506();
    }

    @ObfuscatedName("aj.t(I)V")
    public void method411() {
        int var1 = this.field217;
        int var2 = this.field194;
        int var3 = this.field191 - Statics.field841 - var1;
        int var4 = this.field210 - Statics.field4663 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method433();
            int var6 = 0;
            int var7 = 0;
            if (this.field199 == var5) {
                Insets var8 = this.field199.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field210);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field191, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field191 + var6 - var3, var7, var3, this.field210);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field210 + var7 - var4, this.field191, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("aj.g(B)V")
    public final void method412() {
        Canvas var1 = this.field200;
        var1.removeKeyListener(class24.field126);
        var1.removeFocusListener(class24.field126);
        class24.field136 = -1;
        class33.method6026(this.field200);
        if (this.field204 != null) {
            this.field204.method277(this.field200);
        }
        this.method451();
        Canvas var2 = this.field200;
        var2.setFocusTraversalKeysEnabled(false);
        var2.addKeyListener(class24.field126);
        var2.addFocusListener(class24.field126);
        class33.method2975(this.field200);
        if (this.field204 != null) {
            this.field204.method276(this.field200);
        }
        this.method418();
    }

    @ObfuscatedName("aj.x(IIII)V")
    public final void method413(int arg0, int arg1, int arg2) {
        try {
            if (field180 != null) {
                field181++;
                if (field181 >= 3) {
                    this.method513("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field180 = this;
            Statics.field841 = arg0;
            Statics.field4663 = arg1;
            Statics.field4389 = arg2;
            Statics.field4810 = this;
            if (Statics.field198 == null) {
                Statics.field198 = new class157();
            }
            Statics.field198.method2882(this, 1);
        } catch (Exception var5) {
            class464.method5148((String) null, var5);
            this.method513("crash");
        }
    }

    @ObfuscatedName("aj.n(I)V")
    public final synchronized void method451() {
        Container var1 = this.method433();
        if (this.field200 != null) {
            this.field200.removeFocusListener(this);
            var1.remove(this.field200);
        }
        Statics.field841 = Math.max(var1.getWidth(), this.field195);
        Statics.field4663 = Math.max(var1.getHeight(), this.field196);
        if (this.field199 != null) {
            Insets var2 = this.field199.getInsets();
            Statics.field841 -= var2.right + var2.left;
            Statics.field4663 -= var2.top + var2.bottom;
        }
        this.field200 = new class26(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field200);
        this.field200.setSize(Statics.field841, Statics.field4663);
        this.field200.setVisible(true);
        this.field200.setBackground(Color.BLACK);
        if (this.field199 == var1) {
            Insets var3 = this.field199.getInsets();
            this.field200.setLocation(this.field217 + var3.left, this.field194 + var3.top);
        } else {
            this.field200.setLocation(this.field217, this.field194);
        }
        this.field200.addFocusListener(this);
        this.field200.requestFocus();
        this.field201 = true;
        if (Statics.field153 != null && Statics.field841 == Statics.field153.field4752 && Statics.field4663 == Statics.field153.field4751) {
            ((class31) Statics.field153).method383(this.field200);
            Statics.field153.method385(0, 0);
        } else {
            Statics.field153 = new class31(Statics.field841, Statics.field4663, this.field200);
        }
        this.field205 = false;
        this.field206 = class270.method2485();
    }

    @ObfuscatedName("aj.e(I)Z")
    public final boolean method414() {
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
                this.method513("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1759 != null) {
                String var1 = Statics.field1759.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1761;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method513("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class344.method4910(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class344.method5187(var4) && class344.method2246(var4) < 10) {
                            this.method513("wrongjava");
                            return;
                        }
                    }
                    field188 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method451();
            this.method443();
            Statics.field1389 = class168.method4085();
            while (field197 == 0L || class270.method2485() < field197) {
                Statics.field185 = Statics.field1389.method2790(field186, field188);
                for (int var5 = 0; var5 < Statics.field185; var5++) {
                    this.method491();
                }
                this.method416();
                this.method403(this.field200);
            }
        } catch (Exception var7) {
            class464.method5148((String) null, var7);
            this.method513("crash");
        }
        this.method409();
    }

    @ObfuscatedName("aj.h(I)V")
    public void method491() {
        long var1 = class270.method2485();
        long var3 = field190[Statics.field3986];
        field190[Statics.field3986] = var1;
        Statics.field3986 = Statics.field3986 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field2753 = field208;
        }
        this.method428();
    }

    @ObfuscatedName("aj.f(I)V")
    public void method416() {
        Container var1 = this.method433();
        long var2 = class270.method2485();
        long var4 = field189[Statics.field450];
        field189[Statics.field450] = var2;
        Statics.field450 = Statics.field450 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field182 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field203 - 1 > 50) {
            field203 -= 50;
            this.field201 = true;
            this.field200.setSize(Statics.field841, Statics.field4663);
            this.field200.setVisible(true);
            if (this.field199 == var1) {
                Insets var7 = this.field199.getInsets();
                this.field200.setLocation(this.field217 + var7.left, this.field194 + var7.top);
            } else {
                this.field200.setLocation(this.field217, this.field194);
            }
        }
        if (this.field205) {
            this.method412();
        }
        this.method417();
        this.method464(this.field201);
        if (this.field201) {
            this.method411();
        }
        this.field201 = false;
    }

    @ObfuscatedName("aj.d(B)V")
    public final void method417() {
        class385 var1 = this.method434();
        if (this.field191 != var1.field4387 || this.field210 != var1.field4388 || this.field179) {
            this.method453();
            this.field179 = false;
        }
    }

    @ObfuscatedName("aj.j(I)V")
    public final void method418() {
        this.field179 = true;
    }

    @ObfuscatedName("aj.z(B)V")
    public final synchronized void method409() {
        if (field193) {
            return;
        }
        field193 = true;
        try {
            this.field200.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method429();
        } catch (Exception var7) {
        }
        if (this.field199 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field198 != null) {
            try {
                Statics.field198.method2867();
            } catch (Exception var5) {
            }
        }
        this.method436();
    }

    @ObfuscatedName("op.i(B)V")
    public static final void method6636() {
        Statics.field1389.method2789();
        for (int var0 = 0; var0 < 32; var0++) {
            field189[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field190[var1] = 0L;
        }
        Statics.field185 = 0;
    }

    public final void start() {
        if (field180 == this && !field193) {
            field197 = 0L;
        }
    }

    public final void stop() {
        if (field180 == this && !field193) {
            field197 = class270.method2485() + 4000L;
        }
    }

    public final void destroy() {
        if (field180 == this && !field193) {
            field197 = class270.method2485();
            class271.method4446(5000L);
            this.method409();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field180 != this || field193) {
            return;
        }
        this.field201 = true;
        if (class270.method2485() - this.field206 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field841 && var2.height >= Statics.field4663) {
                this.field205 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field208 = true;
        this.field201 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field208 = false;
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

    @ObfuscatedName("aj.ac(ILjava/lang/String;ZB)V")
    public final void method430(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field200.getGraphics();
            if (Statics.field1523 == null) {
                Statics.field1523 = new Font("Helvetica", 1, 13);
                Statics.field1618 = this.field200.getFontMetrics(Statics.field1523);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field841, Statics.field4663);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field202 == null) {
                    Statics.field202 = this.field200.createImage(304, 34);
                }
                Graphics var6 = Statics.field202.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field1523);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field1618.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field202, Statics.field841 / 2 - 152, Statics.field4663 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field841 / 2 - 152;
                int var9 = Statics.field4663 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1523);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field1618.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field200.repaint();
        }
    }

    @ObfuscatedName("aj.ab(B)V")
    public final void method431() {
        Statics.field202 = null;
        Statics.field1523 = null;
        Statics.field1618 = null;
    }

    @ObfuscatedName("aj.aj(Ljava/lang/String;I)V")
    public void method513(String arg0) {
        if (this.field192) {
            return;
        }
        this.field192 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("aj.ae(B)Ljava/awt/Container;")
    public Container method433() {
        return this.field199 == null ? this : this.field199;
    }

    @ObfuscatedName("aj.az(I)Lne;")
    public class385 method434() {
        Container var1 = this.method433();
        int var2 = Math.max(var1.getWidth(), this.field195);
        int var3 = Math.max(var1.getHeight(), this.field196);
        if (this.field199 != null) {
            Insets var4 = this.field199.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class385(var2, var3);
    }

    @ObfuscatedName("aj.ap(I)Z")
    public final boolean method435() {
        return this.field199 != null;
    }

    @ObfuscatedName("n.as(I)I")
    public static int method230() {
        int var0 = 0;
        if (Statics.field2791 == null || !Statics.field2791.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field2791 = var2;
                        field213 = -1L;
                        field212 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field2791 != null) {
            long var4 = class270.method2485();
            long var6 = Statics.field2791.getCollectionTime();
            if (field212 != -1L) {
                long var8 = var6 - field212;
                long var10 = var4 - field213;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field212 = var6;
            field213 = var4;
        }
        return var0;
    }

    @ObfuscatedName("aj.ag(I)V")
    public abstract void method428();

    @ObfuscatedName("aj.am(B)V")
    public abstract void method429();

    @ObfuscatedName("aj.au(B)V")
    public abstract void method436();

    @ObfuscatedName("aj.u(S)V")
    public abstract void method443();

    @ObfuscatedName("aj.ar(ZI)V")
    public abstract void method464(boolean arg0);

    @ObfuscatedName("aj.b(I)V")
    public abstract void method506();

    public abstract void init();
}
