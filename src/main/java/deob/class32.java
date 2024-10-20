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

@ObfuscatedName("al")
public abstract class class32 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("al.l")
    public static class32 field186 = null;

    @ObfuscatedName("al.s")
    public static int field187 = 0;

    @ObfuscatedName("al.e")
    public static long field188 = 0L;

    @ObfuscatedName("al.r")
    public static boolean field204 = false;

    @ObfuscatedName("al.o")
    public boolean field190 = false;

    @ObfuscatedName("al.v")
    public static int field191 = 20;

    @ObfuscatedName("al.a")
    public static int field185 = 1;

    @ObfuscatedName("al.u")
    public static int field193 = 0;

    @ObfuscatedName("al.p")
    public static long[] field195 = new long[32];

    @ObfuscatedName("al.m")
    public static long[] field210 = new long[32];

    @ObfuscatedName("al.j")
    public int field197;

    @ObfuscatedName("al.f")
    public int field198;

    @ObfuscatedName("al.g")
    public int field218 = 0;

    @ObfuscatedName("al.t")
    public int field200 = 0;

    @ObfuscatedName("al.z")
    public int field201;

    @ObfuscatedName("al.ap")
    public int field202;

    @ObfuscatedName("al.af")
    public int field196;

    @ObfuscatedName("al.ak")
    public int field215;

    @ObfuscatedName("al.al")
    public Frame field214;

    @ObfuscatedName("al.aa")
    public Canvas field206;

    @ObfuscatedName("al.ao")
    public volatile boolean field207 = true;

    @ObfuscatedName("al.ay")
    public static int field208 = 500;

    @ObfuscatedName("al.ac")
    public boolean field209 = false;

    @ObfuscatedName("al.ab")
    public volatile boolean field192 = false;

    @ObfuscatedName("al.as")
    public volatile long field211 = 0L;

    @ObfuscatedName("al.ad")
    public class23 field212;

    @ObfuscatedName("al.au")
    public Clipboard field213;

    @ObfuscatedName("al.at")
    public final EventQueue field216;

    @ObfuscatedName("al.ae")
    public static volatile boolean field205 = true;

    @ObfuscatedName("al.aj")
    public static long field217 = -1L;

    @ObfuscatedName("al.ax")
    public static long field199 = -1L;

    public class32() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field216 = var1;
        class25 var3 = new class25();
        Statics.field4068 = var3;
    }

    @ObfuscatedName("al.r(IIB)V")
    public final void method429(int arg0, int arg1) {
        if (this.field196 != arg0 || this.field215 != arg1) {
            this.method489();
        }
        this.field196 = arg0;
        this.field215 = arg1;
    }

    @ObfuscatedName("al.o(Ljava/lang/Object;S)V")
    public final void method430(Object arg0) {
        if (this.field216 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field216.peekEvent() != null; var2++) {
            class263.method5249(1L);
        }
        if (arg0 != null) {
            this.field216.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("al.i(I)Lei;")
    public class155 method448() {
        if (this.field212 == null) {
            this.field212 = new class23();
            this.field212.method301(this.field206);
        }
        return this.field212;
    }

    @ObfuscatedName("al.w(I)V")
    public void method470() {
        this.field213 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("al.v(Ljava/lang/String;B)V")
    public void method444(String arg0) {
        this.field213.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("al.a(I)V")
    public final void method531() {
        class24.method2371();
        class24.method2176(this.field206);
    }

    @ObfuscatedName("al.y(S)V")
    public final void method434() {
        class33.method2702(this.field206);
    }

    @ObfuscatedName("al.u(I)V")
    public final void method555() {
        Container var1 = this.method456();
        if (var1 == null) {
            return;
        }
        class368 var2 = this.method457();
        this.field197 = Math.max(var2.field4223, this.field201);
        this.field198 = Math.max(var2.field4224, this.field202);
        if (this.field197 <= 0) {
            this.field197 = 1;
        }
        if (this.field198 <= 0) {
            this.field198 = 1;
        }
        Statics.field3209 = Math.min(this.field197, this.field196);
        Statics.field1246 = Math.min(this.field198, this.field215);
        this.field218 = (this.field197 - Statics.field3209) / 2;
        this.field200 = 0;
        this.field206.setSize(Statics.field3209, Statics.field1246);
        Statics.field309 = new class31(Statics.field3209, Statics.field1246, this.field206);
        if (this.field214 == var1) {
            Insets var3 = this.field214.getInsets();
            this.field206.setLocation(this.field218 + var3.left, this.field200 + var3.top);
        } else {
            this.field206.setLocation(this.field218, this.field200);
        }
        this.field207 = true;
        this.method436();
    }

    @ObfuscatedName("al.q(I)V")
    public void method437() {
        int var1 = this.field218;
        int var2 = this.field200;
        int var3 = this.field197 - Statics.field3209 - var1;
        int var4 = this.field198 - Statics.field1246 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method456();
            int var6 = 0;
            int var7 = 0;
            if (this.field214 == var5) {
                Insets var8 = this.field214.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field198);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field197, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field197 + var6 - var3, var7, var3, this.field198);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field198 + var7 - var4, this.field197, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("al.x(B)V")
    public final void method438() {
        Canvas var1 = this.field206;
        var1.removeKeyListener(class24.field144);
        var1.removeFocusListener(class24.field144);
        class24.field149 = -1;
        Canvas var2 = this.field206;
        var2.removeMouseListener(class33.field228);
        var2.removeMouseMotionListener(class33.field228);
        var2.removeFocusListener(class33.field228);
        class33.field234 = 0;
        if (this.field212 != null) {
            this.field212.method309(this.field206);
        }
        this.method520();
        class24.method2176(this.field206);
        class33.method2702(this.field206);
        if (this.field212 != null) {
            this.field212.method301(this.field206);
        }
        this.method489();
    }

    @ObfuscatedName("al.p(IIII)V")
    public final void method560(int arg0, int arg1, int arg2) {
        try {
            if (field186 != null) {
                field187++;
                if (field187 >= 3) {
                    this.method455("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field186 = this;
            Statics.field3209 = arg0;
            Statics.field1246 = arg1;
            Statics.field1 = arg2;
            Statics.field4653 = this;
            if (Statics.field203 == null) {
                Statics.field203 = new class153();
            }
            Statics.field203.method2751(this, 1);
        } catch (Exception var5) {
            class445.method3452((String) null, var5);
            this.method455("crash");
        }
    }

    @ObfuscatedName("al.n(B)V")
    public final synchronized void method520() {
        Container var1 = this.method456();
        if (this.field206 != null) {
            this.field206.removeFocusListener(this);
            var1.remove(this.field206);
        }
        Statics.field3209 = Math.max(var1.getWidth(), this.field201);
        Statics.field1246 = Math.max(var1.getHeight(), this.field202);
        if (this.field214 != null) {
            Insets var2 = this.field214.getInsets();
            Statics.field3209 -= var2.right + var2.left;
            Statics.field1246 -= var2.top + var2.bottom;
        }
        this.field206 = new class26(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field206);
        this.field206.setSize(Statics.field3209, Statics.field1246);
        this.field206.setVisible(true);
        this.field206.setBackground(Color.BLACK);
        if (this.field214 == var1) {
            Insets var3 = this.field214.getInsets();
            this.field206.setLocation(this.field218 + var3.left, this.field200 + var3.top);
        } else {
            this.field206.setLocation(this.field218, this.field200);
        }
        this.field206.addFocusListener(this);
        this.field206.requestFocus();
        this.field207 = true;
        if (Statics.field309 != null && Statics.field3209 == Statics.field309.field4585 && Statics.field1246 == Statics.field309.field4586) {
            ((class31) Statics.field309).method414(this.field206);
            Statics.field309.method427(0, 0);
        } else {
            Statics.field309 = new class31(Statics.field3209, Statics.field1246, this.field206);
        }
        this.field192 = false;
        this.field211 = class262.method4787();
    }

    @ObfuscatedName("al.m(I)Z")
    public final boolean method441() {
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
                this.method455("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1687 != null) {
                String var1 = Statics.field1687.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1571;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method455("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class336.method2525(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class336.method2516(var4) && Statics.method2340(var4) < 10) {
                            this.method455("wrongjava");
                            return;
                        }
                    }
                    field185 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method520();
            this.method449();
            class160 var5;
            try {
                var5 = new class152();
            } catch (Throwable var9) {
                var5 = new class158();
            }
            Statics.field194 = var5;
            while (field188 == 0L || class262.method4787() < field188) {
                Statics.field1668 = Statics.field194.method2738(field191, field185);
                for (int var7 = 0; var7 < Statics.field1668; var7++) {
                    this.method442();
                }
                this.method443();
                this.method430(this.field206);
            }
        } catch (Exception var10) {
            class445.method3452((String) null, var10);
            this.method455("crash");
        }
        this.method568();
    }

    @ObfuscatedName("al.d(I)V")
    public void method442() {
        long var1 = class262.method4787();
        long var3 = field210[Statics.field3216];
        field210[Statics.field3216] = var1;
        Statics.field3216 = Statics.field3216 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field3516 = field205;
        }
        this.method464();
    }

    @ObfuscatedName("al.j(I)V")
    public void method443() {
        Container var1 = this.method456();
        long var2 = class262.method4787();
        long var4 = field195[Statics.field75];
        field195[Statics.field75] = var2;
        Statics.field75 = Statics.field75 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field193 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field208 - 1 > 50) {
            field208 -= 50;
            this.field207 = true;
            this.field206.setSize(Statics.field3209, Statics.field1246);
            this.field206.setVisible(true);
            if (this.field214 == var1) {
                Insets var7 = this.field214.getInsets();
                this.field206.setLocation(this.field218 + var7.left, this.field200 + var7.top);
            } else {
                this.field206.setLocation(this.field218, this.field200);
            }
        }
        if (this.field192) {
            this.method438();
        }
        this.method477();
        this.method451(this.field207);
        if (this.field207) {
            this.method437();
        }
        this.field207 = false;
    }

    @ObfuscatedName("al.f(I)V")
    public final void method477() {
        class368 var1 = this.method457();
        if (this.field197 != var1.field4223 || this.field198 != var1.field4224 || this.field209) {
            this.method555();
            this.field209 = false;
        }
    }

    @ObfuscatedName("al.g(B)V")
    public final void method489() {
        this.field209 = true;
    }

    @ObfuscatedName("al.t(B)V")
    public final synchronized void method568() {
        if (field204) {
            return;
        }
        field204 = true;
        try {
            this.field206.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method439();
        } catch (Exception var7) {
        }
        if (this.field214 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field203 != null) {
            try {
                Statics.field203.method2746();
            } catch (Exception var5) {
            }
        }
        this.method459();
    }

    @ObfuscatedName("bm.k(I)V")
    public static final void method1049() {
        Statics.field194.method2737();
        for (int var0 = 0; var0 < 32; var0++) {
            field195[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field210[var1] = 0L;
        }
        Statics.field1668 = 0;
    }

    public final void start() {
        if (field186 == this && !field204) {
            field188 = 0L;
        }
    }

    public final void stop() {
        if (field186 == this && !field204) {
            field188 = class262.method4787() + 4000L;
        }
    }

    public final void destroy() {
        if (field186 == this && !field204) {
            field188 = class262.method4787();
            class263.method5249(5000L);
            this.method568();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field186 != this || field204) {
            return;
        }
        this.field207 = true;
        if (class262.method4787() - this.field211 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field3209 && var2.height >= Statics.field1246) {
                this.field192 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field205 = true;
        this.field207 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field205 = false;
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

    @ObfuscatedName("al.ak(ILjava/lang/String;ZS)V")
    public final void method453(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field206.getGraphics();
            if (Statics.field2381 == null) {
                Statics.field2381 = new Font("Helvetica", 1, 13);
                Statics.field3090 = this.field206.getFontMetrics(Statics.field2381);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field3209, Statics.field1246);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field1741 == null) {
                    Statics.field1741 = this.field206.createImage(304, 34);
                }
                Graphics var6 = Statics.field1741.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field2381);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field3090.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field1741, Statics.field3209 / 2 - 152, Statics.field1246 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field3209 / 2 - 152;
                int var9 = Statics.field1246 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field2381);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field3090.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field206.repaint();
        }
    }

    @ObfuscatedName("al.av(I)V")
    public final void method445() {
        Statics.field1741 = null;
        Statics.field2381 = null;
        Statics.field3090 = null;
    }

    @ObfuscatedName("al.ar(Ljava/lang/String;B)V")
    public void method455(String arg0) {
        if (this.field190) {
            return;
        }
        this.field190 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("al.al(I)Ljava/awt/Container;")
    public Container method456() {
        return this.field214 == null ? this : this.field214;
    }

    @ObfuscatedName("al.aa(I)Lna;")
    public class368 method457() {
        Container var1 = this.method456();
        int var2 = Math.max(var1.getWidth(), this.field201);
        int var3 = Math.max(var1.getHeight(), this.field202);
        if (this.field214 != null) {
            Insets var4 = this.field214.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class368(var2, var3);
    }

    @ObfuscatedName("al.ao(I)Z")
    public final boolean method458() {
        return this.field214 != null;
    }

    @ObfuscatedName("dr.aq(I)I")
    public static int method2381() {
        int var0 = 0;
        if (Statics.field189 == null || !Statics.field189.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field189 = var2;
                        field199 = -1L;
                        field217 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field189 != null) {
            long var4 = class262.method4787();
            long var6 = Statics.field189.getCollectionTime();
            if (field217 != -1L) {
                long var8 = var6 - field217;
                long var10 = var4 - field199;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field217 = var6;
            field199 = var4;
        }
        return var0;
    }

    @ObfuscatedName("al.h(I)V")
    public abstract void method436();

    @ObfuscatedName("al.af(B)V")
    public abstract void method439();

    public abstract void init();

    @ObfuscatedName("al.b(I)V")
    public abstract void method449();

    @ObfuscatedName("al.ap(ZI)V")
    public abstract void method451(boolean arg0);

    @ObfuscatedName("al.ay(I)V")
    public abstract void method459();

    @ObfuscatedName("al.z(I)V")
    public abstract void method464();
}
