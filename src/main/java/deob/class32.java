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

@ObfuscatedName("ai")
public abstract class class32 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ai.p")
    public static class32 field198 = null;

    @ObfuscatedName("ai.f")
    public static int field211 = 0;

    @ObfuscatedName("ai.n")
    public static long field189 = 0L;

    @ObfuscatedName("ai.k")
    public static boolean field190 = false;

    @ObfuscatedName("ai.s")
    public boolean field191 = false;

    @ObfuscatedName("ai.m")
    public static int field214 = 20;

    @ObfuscatedName("ai.j")
    public static int field193 = 1;

    @ObfuscatedName("ai.v")
    public static int field194 = 0;

    @ObfuscatedName("ai.u")
    public static long[] field203 = new long[32];

    @ObfuscatedName("ai.b")
    public static long[] field197 = new long[32];

    @ObfuscatedName("ai.l")
    public int field209;

    @ObfuscatedName("ai.e")
    public int field199;

    @ObfuscatedName("ai.g")
    public int field188 = 0;

    @ObfuscatedName("ai.i")
    public int field201 = 0;

    @ObfuscatedName("ai.o")
    public int field202;

    @ObfuscatedName("ai.as")
    public int field208;

    @ObfuscatedName("ai.ac")
    public int field204;

    @ObfuscatedName("ai.ao")
    public int field205;

    @ObfuscatedName("ai.ai")
    public Frame field206;

    @ObfuscatedName("ai.an")
    public Canvas field207;

    @ObfuscatedName("ai.aa")
    public volatile boolean field200 = true;

    @ObfuscatedName("ai.am")
    public static int field192 = 500;

    @ObfuscatedName("ai.ap")
    public boolean field210 = false;

    @ObfuscatedName("ai.ab")
    public volatile boolean field195 = false;

    @ObfuscatedName("ai.az")
    public volatile long field212 = 0L;

    @ObfuscatedName("ai.aj")
    public class23 field213;

    @ObfuscatedName("ai.ax")
    public Clipboard field217;

    @ObfuscatedName("ai.av")
    public final EventQueue field215;

    @ObfuscatedName("ai.ae")
    public static volatile boolean field216 = true;

    @ObfuscatedName("ai.aw")
    public static long field187 = -1L;

    @ObfuscatedName("ai.ah")
    public static long field218 = -1L;

    public class32() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field215 = var1;
        class40.method2026(new class25());
    }

    @ObfuscatedName("ai.k(III)V")
    public final void method534(int arg0, int arg1) {
        if (this.field204 != arg0 || this.field205 != arg1) {
            this.method533();
        }
        this.field204 = arg0;
        this.field205 = arg1;
    }

    @ObfuscatedName("ai.w(Ljava/lang/Object;I)V")
    public final void method468(Object arg0) {
        if (this.field215 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field215.peekEvent() != null; var2++) {
            class272.method406(1L);
        }
        if (arg0 != null) {
            this.field215.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("ai.s(B)Lfv;")
    public class160 method456() {
        if (this.field213 == null) {
            this.field213 = new class23();
            this.field213.method319(this.field207);
        }
        return this.field213;
    }

    @ObfuscatedName("ai.q(I)V")
    public void method439() {
        this.field217 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("ai.m(Ljava/lang/String;I)V")
    public void method440(String arg0) {
        this.field217.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("ai.x(I)V")
    public final void method441() {
        class24.method317();
        Canvas var1 = this.field207;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class24.field133);
        var1.addFocusListener(class24.field133);
    }

    @ObfuscatedName("ai.j(B)V")
    public final void method442() {
        class33.method2115(this.field207);
    }

    @ObfuscatedName("ai.v(I)V")
    public final void method443() {
        Container var1 = this.method459();
        if (var1 == null) {
            return;
        }
        class386 var2 = this.method485();
        this.field209 = Math.max(var2.field4422, this.field202);
        this.field199 = Math.max(var2.field4419, this.field208);
        if (this.field209 <= 0) {
            this.field209 = 1;
        }
        if (this.field199 <= 0) {
            this.field199 = 1;
        }
        Statics.field1514 = Math.min(this.field209, this.field204);
        Statics.field1825 = Math.min(this.field199, this.field205);
        this.field188 = (this.field209 - Statics.field1514) / 2;
        this.field201 = 0;
        this.field207.setSize(Statics.field1514, Statics.field1825);
        Statics.field114 = new class31(Statics.field1514, Statics.field1825, this.field207);
        if (this.field206 == var1) {
            Insets var3 = this.field206.getInsets();
            this.field207.setLocation(this.field188 + var3.left, this.field201 + var3.top);
        } else {
            this.field207.setLocation(this.field188, this.field201);
        }
        this.field200 = true;
        this.method444();
    }

    @ObfuscatedName("ai.t(S)V")
    public void method445() {
        int var1 = this.field188;
        int var2 = this.field201;
        int var3 = this.field209 - Statics.field1514 - var1;
        int var4 = this.field199 - Statics.field1825 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method459();
            int var6 = 0;
            int var7 = 0;
            if (this.field206 == var5) {
                Insets var8 = this.field206.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field199);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field209, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field209 + var6 - var3, var7, var3, this.field199);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field199 + var7 - var4, this.field209, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("ai.u(I)V")
    public final void method446() {
        class24.method2448(this.field207);
        Canvas var1 = this.field207;
        var1.removeMouseListener(class33.field223);
        var1.removeMouseMotionListener(class33.field223);
        var1.removeFocusListener(class33.field223);
        class33.field225 = 0;
        if (this.field213 != null) {
            this.field213.method320(this.field207);
        }
        this.method448();
        Canvas var2 = this.field207;
        var2.setFocusTraversalKeysEnabled(false);
        var2.addKeyListener(class24.field133);
        var2.addFocusListener(class24.field133);
        class33.method2115(this.field207);
        if (this.field213 != null) {
            this.field213.method319(this.field207);
        }
        this.method533();
    }

    @ObfuscatedName("ai.d(IIIIB)V")
    public final void method447(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (field198 != null) {
                field211++;
                if (field211 >= 3) {
                    this.method463("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field198 = this;
            Statics.field1514 = arg0;
            Statics.field1825 = arg1;
            Statics.field4868 = arg2;
            Statics.field3338 = arg3;
            Statics.field4870 = this;
            if (Statics.field58 == null) {
                Statics.field58 = new class158();
            }
            Statics.field58.method3093(this, 1);
        } catch (Exception var6) {
            Statics.method3146((String) null, var6);
            this.method463("crash");
        }
    }

    @ObfuscatedName("ai.b(I)V")
    public final synchronized void method448() {
        Container var1 = this.method459();
        if (this.field207 != null) {
            this.field207.removeFocusListener(this);
            var1.remove(this.field207);
        }
        Statics.field1514 = Math.max(var1.getWidth(), this.field202);
        Statics.field1825 = Math.max(var1.getHeight(), this.field208);
        if (this.field206 != null) {
            Insets var2 = this.field206.getInsets();
            Statics.field1514 -= var2.right + var2.left;
            Statics.field1825 -= var2.top + var2.bottom;
        }
        this.field207 = new class26(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field207);
        this.field207.setSize(Statics.field1514, Statics.field1825);
        this.field207.setVisible(true);
        this.field207.setBackground(Color.BLACK);
        if (this.field206 == var1) {
            Insets var3 = this.field206.getInsets();
            this.field207.setLocation(this.field188 + var3.left, this.field201 + var3.top);
        } else {
            this.field207.setLocation(this.field188, this.field201);
        }
        this.field207.addFocusListener(this);
        this.field207.requestFocus();
        this.field200 = true;
        if (Statics.field114 != null && Statics.field1514 == Statics.field114.field4807 && Statics.field1825 == Statics.field114.field4809) {
            ((class31) Statics.field114).method420(this.field207);
            Statics.field114.method421(0, 0);
        } else {
            Statics.field114 = new class31(Statics.field1514, Statics.field1825, this.field207);
        }
        this.field195 = false;
        this.field212 = class271.method5624();
    }

    @ObfuscatedName("ai.a(I)Z")
    public final boolean method466() {
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
                this.method463("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1760 != null) {
                String var1 = Statics.field1760.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1753;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method463("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class345.method4651(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class345.method2992(var4) && class345.method4977(var4) < 10) {
                            this.method463("wrongjava");
                            return;
                        }
                    }
                    field193 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method448();
            this.method581();
            Statics.field72 = class168.method2681();
            while (field189 == 0L || class271.method5624() < field189) {
                Statics.field2894 = Statics.field72.method2998(field214, field193);
                for (int var5 = 0; var5 < Statics.field2894; var5++) {
                    this.method483();
                }
                this.method451();
                this.method468(this.field207);
            }
        } catch (Exception var7) {
            Statics.method3146((String) null, var7);
            this.method463("crash");
        }
        this.method477();
    }

    @ObfuscatedName("ai.l(I)V")
    public void method483() {
        long var1 = class271.method5624();
        long var3 = field197[Statics.field1876];
        field197[Statics.field1876] = var1;
        Statics.field1876 = Statics.field1876 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1268 = field216;
        }
        this.method458();
    }

    @ObfuscatedName("ai.e(I)V")
    public void method451() {
        Container var1 = this.method459();
        long var2 = class271.method5624();
        long var4 = field203[Statics.field196];
        field203[Statics.field196] = var2;
        Statics.field196 = Statics.field196 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field194 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field192 - 1 > 50) {
            field192 -= 50;
            this.field200 = true;
            this.field207.setSize(Statics.field1514, Statics.field1825);
            this.field207.setVisible(true);
            if (this.field206 == var1) {
                Insets var7 = this.field206.getInsets();
                this.field207.setLocation(this.field188 + var7.left, this.field201 + var7.top);
            } else {
                this.field207.setLocation(this.field188, this.field201);
            }
        }
        if (this.field195) {
            this.method446();
        }
        this.method526();
        this.method473(this.field200);
        if (this.field200) {
            this.method445();
        }
        this.field200 = false;
    }

    @ObfuscatedName("ai.g(I)V")
    public final void method526() {
        class386 var1 = this.method485();
        if (this.field209 != var1.field4422 || this.field199 != var1.field4419 || this.field210) {
            this.method443();
            this.field210 = false;
        }
    }

    @ObfuscatedName("ai.y(I)V")
    public final void method533() {
        this.field210 = true;
    }

    @ObfuscatedName("ai.i(I)V")
    public final synchronized void method477() {
        if (field190) {
            return;
        }
        field190 = true;
        try {
            this.field207.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method583();
        } catch (Exception var7) {
        }
        if (this.field206 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field58 != null) {
            try {
                Statics.field58.method3089();
            } catch (Exception var5) {
            }
        }
        this.method462();
    }

    @ObfuscatedName("l.r(I)V")
    public static final void method276() {
        Statics.field72.method3000();
        for (int var0 = 0; var0 < 32; var0++) {
            field203[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field197[var1] = 0L;
        }
        Statics.field2894 = 0;
    }

    public final void start() {
        if (field198 == this && !field190) {
            field189 = 0L;
        }
    }

    public final void stop() {
        if (field198 == this && !field190) {
            field189 = class271.method5624() + 4000L;
        }
    }

    public final void destroy() {
        if (field198 == this && !field190) {
            field189 = class271.method5624();
            class272.method406(5000L);
            this.method477();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field198 != this || field190) {
            return;
        }
        this.field200 = true;
        if (class271.method5624() - this.field212 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1514 && var2.height >= Statics.field1825) {
                this.field195 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field216 = true;
        this.field200 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field216 = false;
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

    @ObfuscatedName("ai.ao(ILjava/lang/String;ZB)V")
    public final void method461(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field207.getGraphics();
            if (Statics.field888 == null) {
                Statics.field888 = new Font("Helvetica", 1, 13);
                Statics.field1544 = this.field207.getFontMetrics(Statics.field888);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field1514, Statics.field1825);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field1562 == null) {
                    Statics.field1562 = this.field207.createImage(304, 34);
                }
                Graphics var6 = Statics.field1562.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field888);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field1544.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field1562, Statics.field1514 / 2 - 152, Statics.field1825 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field1514 / 2 - 152;
                int var9 = Statics.field1825 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field888);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field1544.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field207.repaint();
        }
    }

    @ObfuscatedName("ai.ar(B)V")
    public final void method487() {
        Statics.field1562 = null;
        Statics.field888 = null;
        Statics.field1544 = null;
    }

    @ObfuscatedName("ai.aq(Ljava/lang/String;B)V")
    public void method463(String arg0) {
        if (this.field191) {
            return;
        }
        this.field191 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ai.ai(I)Ljava/awt/Container;")
    public Container method459() {
        return this.field206 == null ? this : this.field206;
    }

    @ObfuscatedName("ai.an(I)Lnk;")
    public class386 method485() {
        Container var1 = this.method459();
        int var2 = Math.max(var1.getWidth(), this.field202);
        int var3 = Math.max(var1.getHeight(), this.field208);
        if (this.field206 != null) {
            Insets var4 = this.field206.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class386(var2, var3);
    }

    @ObfuscatedName("ai.aa(I)Z")
    public final boolean method454() {
        return this.field206 != null;
    }

    @ObfuscatedName("bb.ak(S)I")
    public static int method2039() {
        int var0 = 0;
        if (Statics.field1874 == null || !Statics.field1874.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field1874 = var2;
                        field218 = -1L;
                        field187 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field1874 != null) {
            long var4 = class271.method5624();
            long var6 = Statics.field1874.getCollectionTime();
            if (field187 != -1L) {
                long var8 = var6 - field187;
                long var10 = var4 - field218;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field187 = var6;
            field218 = var4;
        }
        return var0;
    }

    @ObfuscatedName("ai.h(B)V")
    public abstract void method444();

    public abstract void init();

    @ObfuscatedName("ai.o(I)V")
    public abstract void method458();

    @ObfuscatedName("ai.am(B)V")
    public abstract void method462();

    @ObfuscatedName("ai.as(ZS)V")
    public abstract void method473(boolean arg0);

    @ObfuscatedName("ai.z(I)V")
    public abstract void method581();

    @ObfuscatedName("ai.ac(I)V")
    public abstract void method583();
}
