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

@ObfuscatedName("am")
public abstract class class32 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("am.b")
    public static class32 field199 = null;

    @ObfuscatedName("am.p")
    public static int field183 = 0;

    @ObfuscatedName("am.m")
    public static long field193 = 0L;

    @ObfuscatedName("am.t")
    public static boolean field189 = false;

    @ObfuscatedName("am.s")
    public boolean field186 = false;

    @ObfuscatedName("am.n")
    public static int field188 = 20;

    @ObfuscatedName("am.r")
    public static int field201 = 1;

    @ObfuscatedName("am.o")
    public static int field187 = 0;

    @ObfuscatedName("am.h")
    public static long[] field191 = new long[32];

    @ObfuscatedName("am.e")
    public static long[] field203 = new long[32];

    @ObfuscatedName("am.u")
    public int field184;

    @ObfuscatedName("am.k")
    public int field195;

    @ObfuscatedName("am.f")
    public int field185 = 0;

    @ObfuscatedName("am.l")
    public int field197 = 0;

    @ObfuscatedName("am.i")
    public int field198;

    @ObfuscatedName("am.ah")
    public int field196;

    @ObfuscatedName("am.ao")
    public int field200;

    @ObfuscatedName("am.ab")
    public int field194;

    @ObfuscatedName("am.am")
    public Frame field209;

    @ObfuscatedName("am.az")
    public Canvas field216;

    @ObfuscatedName("am.au")
    public volatile boolean field204 = true;

    @ObfuscatedName("am.ap")
    public static int field205 = 500;

    @ObfuscatedName("am.ac")
    public boolean field206 = false;

    @ObfuscatedName("am.aj")
    public volatile boolean field207 = false;

    @ObfuscatedName("am.af")
    public volatile long field208 = 0L;

    @ObfuscatedName("am.al")
    public class23 field181;

    @ObfuscatedName("am.aa")
    public Clipboard field210;

    @ObfuscatedName("am.as")
    public final EventQueue field211;

    @ObfuscatedName("am.at")
    public static volatile boolean field212 = true;

    @ObfuscatedName("am.aw")
    public static long field213 = -1L;

    @ObfuscatedName("am.ay")
    public static long field214 = -1L;

    public class32() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field211 = var1;
        class40.method2617(new class25());
    }

    @ObfuscatedName("am.m(III)V")
    public final void method459(int arg0, int arg1) {
        if (this.field200 != arg0 || this.field194 != arg1) {
            this.method474();
        }
        this.field200 = arg0;
        this.field194 = arg1;
    }

    @ObfuscatedName("am.t(Ljava/lang/Object;B)V")
    public final void method592(Object arg0) {
        if (this.field211 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field211.peekEvent() != null; var2++) {
            class417.method5965(1L);
        }
        if (arg0 != null) {
            this.field211.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("am.s(I)Leq;")
    public class155 method585() {
        if (this.field181 == null) {
            this.field181 = new class23();
            this.field181.method340(this.field216);
        }
        return this.field181;
    }

    @ObfuscatedName("am.j(I)V")
    public void method462() {
        this.field210 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("am.w(Ljava/lang/String;I)V")
    public void method484(String arg0) {
        this.field210.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("am.n(I)V")
    public final void method463() {
        class24.method2626();
        class24.method385(this.field216);
    }

    @ObfuscatedName("am.r(I)V")
    public final void method464() {
        class33.method2630(this.field216);
    }

    @ObfuscatedName("am.o(I)V")
    public final void method465() {
        Container var1 = this.method518();
        if (var1 == null) {
            return;
        }
        class363 var2 = this.method491();
        this.field184 = Math.max(var2.field4177, this.field198);
        this.field195 = Math.max(var2.field4175, this.field196);
        if (this.field184 <= 0) {
            this.field184 = 1;
        }
        if (this.field195 <= 0) {
            this.field195 = 1;
        }
        Statics.field2137 = Math.min(this.field184, this.field200);
        Statics.field2535 = Math.min(this.field195, this.field194);
        this.field185 = (this.field184 - Statics.field2137) / 2;
        this.field197 = 0;
        this.field216.setSize(Statics.field2137, Statics.field2535);
        Statics.field107 = new class31(Statics.field2137, Statics.field2535, this.field216);
        if (this.field209 == var1) {
            Insets var3 = this.field209.getInsets();
            this.field216.setLocation(this.field185 + var3.left, this.field197 + var3.top);
        } else {
            this.field216.setLocation(this.field185, this.field197);
        }
        this.field204 = true;
        this.method466();
    }

    @ObfuscatedName("am.d(I)V")
    public void method469() {
        int var1 = this.field185;
        int var2 = this.field197;
        int var3 = this.field184 - Statics.field2137 - var1;
        int var4 = this.field195 - Statics.field2535 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method518();
            int var6 = 0;
            int var7 = 0;
            if (this.field209 == var5) {
                Insets var8 = this.field209.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field195);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field184, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field184 + var6 - var3, var7, var3, this.field195);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field195 + var7 - var4, this.field184, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("am.h(I)V")
    public final void method478() {
        Canvas var1 = this.field216;
        var1.removeKeyListener(class24.field126);
        var1.removeFocusListener(class24.field126);
        class24.field121 = -1;
        class33.method4970(this.field216);
        if (this.field181 != null) {
            this.field181.method337(this.field216);
        }
        this.method554();
        class24.method385(this.field216);
        class33.method2630(this.field216);
        if (this.field181 != null) {
            this.field181.method340(this.field216);
        }
        this.method474();
    }

    @ObfuscatedName("am.g(IIII)V")
    public final void method582(int arg0, int arg1, int arg2) {
        try {
            if (field199 != null) {
                field183++;
                if (field183 >= 3) {
                    this.method577("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field199 = this;
            Statics.field2137 = arg0;
            Statics.field2535 = arg1;
            Statics.field4618 = arg2;
            Statics.field4616 = this;
            if (Statics.field190 == null) {
                Statics.field190 = new class153();
            }
            Statics.field190.method2776(this, 1);
        } catch (Exception var5) {
            class443.method6513((String) null, var5);
            this.method577("crash");
        }
    }

    @ObfuscatedName("am.e(I)V")
    public final synchronized void method554() {
        Container var1 = this.method518();
        if (this.field216 != null) {
            this.field216.removeFocusListener(this);
            var1.remove(this.field216);
        }
        Statics.field2137 = Math.max(var1.getWidth(), this.field198);
        Statics.field2535 = Math.max(var1.getHeight(), this.field196);
        if (this.field209 != null) {
            Insets var2 = this.field209.getInsets();
            Statics.field2137 -= var2.right + var2.left;
            Statics.field2535 -= var2.top + var2.bottom;
        }
        this.field216 = new class26(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field216);
        this.field216.setSize(Statics.field2137, Statics.field2535);
        this.field216.setVisible(true);
        this.field216.setBackground(Color.BLACK);
        if (this.field209 == var1) {
            Insets var3 = this.field209.getInsets();
            this.field216.setLocation(this.field185 + var3.left, this.field197 + var3.top);
        } else {
            this.field216.setLocation(this.field185, this.field197);
        }
        this.field216.addFocusListener(this);
        this.field216.requestFocus();
        this.field204 = true;
        if (Statics.field107 != null && Statics.field2137 == Statics.field107.field4551 && Statics.field2535 == Statics.field107.field4550) {
            ((class31) Statics.field107).method450(this.field216);
            Statics.field107.method452(0, 0);
        } else {
            Statics.field107 = new class31(Statics.field2137, Statics.field2535, this.field216);
        }
        this.field207 = false;
        this.field208 = class416.method5860();
    }

    @ObfuscatedName("am.a(I)Z")
    public final boolean method470() {
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
                this.method577("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1673 != null) {
                String var1 = Statics.field1673.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1212;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method577("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class331.method4851(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class331.method2685(var4) && class331.method2606(var4) < 10) {
                            this.method577("wrongjava");
                            return;
                        }
                    }
                    field201 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method554();
            this.method485();
            class160 var5;
            try {
                var5 = new class152();
            } catch (Throwable var9) {
                var5 = new class158();
            }
            Statics.field1219 = var5;
            while (field193 == 0L || class416.method5860() < field193) {
                Statics.field202 = Statics.field1219.method2761(field188, field201);
                for (int var7 = 0; var7 < Statics.field202; var7++) {
                    this.method471();
                }
                this.method472();
                this.method592(this.field216);
            }
        } catch (Exception var10) {
            class443.method6513((String) null, var10);
            this.method577("crash");
        }
        this.method475();
    }

    @ObfuscatedName("am.u(B)V")
    public void method471() {
        long var1 = class416.method5860();
        long var3 = field203[Statics.field449];
        field203[Statics.field449] = var1;
        Statics.field449 = Statics.field449 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field769 = field212;
        }
        this.method589();
    }

    @ObfuscatedName("am.k(B)V")
    public void method472() {
        Container var1 = this.method518();
        long var2 = class416.method5860();
        long var4 = field191[Statics.field192];
        field191[Statics.field192] = var2;
        Statics.field192 = Statics.field192 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field187 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field205 - 1 > 50) {
            field205 -= 50;
            this.field204 = true;
            this.field216.setSize(Statics.field2137, Statics.field2535);
            this.field216.setVisible(true);
            if (this.field209 == var1) {
                Insets var7 = this.field209.getInsets();
                this.field216.setLocation(this.field185 + var7.left, this.field197 + var7.top);
            } else {
                this.field216.setLocation(this.field185, this.field197);
            }
        }
        if (this.field207) {
            this.method478();
        }
        this.method586();
        this.method487(this.field204);
        if (this.field204) {
            this.method469();
        }
        this.field204 = false;
    }

    @ObfuscatedName("am.f(I)V")
    public final void method586() {
        class363 var1 = this.method491();
        if (this.field184 != var1.field4177 || this.field195 != var1.field4175 || this.field206) {
            this.method465();
            this.field206 = false;
        }
    }

    @ObfuscatedName("am.l(B)V")
    public final void method474() {
        this.field206 = true;
    }

    @ObfuscatedName("am.q(B)V")
    public final synchronized void method475() {
        if (field189) {
            return;
        }
        field189 = true;
        try {
            this.field216.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method488();
        } catch (Exception var7) {
        }
        if (this.field209 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field190 != null) {
            try {
                Statics.field190.method2772();
            } catch (Exception var5) {
            }
        }
        this.method483();
    }

    @ObfuscatedName("u.x(I)V")
    public static final void method284() {
        Statics.field1219.method2770();
        for (int var0 = 0; var0 < 32; var0++) {
            field191[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field203[var1] = 0L;
        }
        Statics.field202 = 0;
    }

    public final void start() {
        if (field199 == this && !field189) {
            field193 = 0L;
        }
    }

    public final void stop() {
        if (field199 == this && !field189) {
            field193 = class416.method5860() + 4000L;
        }
    }

    public final void destroy() {
        if (field199 == this && !field189) {
            field193 = class416.method5860();
            class417.method5965(5000L);
            this.method475();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field199 != this || field189) {
            return;
        }
        this.field204 = true;
        if (class416.method5860() - this.field208 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field2137 && var2.height >= Statics.field2535) {
                this.field207 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field212 = true;
        this.field204 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field212 = false;
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

    @ObfuscatedName("am.ao(ILjava/lang/String;ZI)V")
    public final void method489(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field216.getGraphics();
            if (Statics.field1530 == null) {
                Statics.field1530 = new Font("Helvetica", 1, 13);
                Statics.field1390 = this.field216.getFontMetrics(Statics.field1530);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field2137, Statics.field2535);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field98 == null) {
                    Statics.field98 = this.field216.createImage(304, 34);
                }
                Graphics var6 = Statics.field98.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field1530);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field1390.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field98, Statics.field2137 / 2 - 152, Statics.field2535 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field2137 / 2 - 152;
                int var9 = Statics.field2535 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1530);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field1390.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field216.repaint();
        }
    }

    @ObfuscatedName("am.ab(B)V")
    public final void method490() {
        Statics.field98 = null;
        Statics.field1530 = null;
        Statics.field1390 = null;
    }

    @ObfuscatedName("am.an(Ljava/lang/String;I)V")
    public void method577(String arg0) {
        if (this.field186) {
            return;
        }
        this.field186 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("am.ax(I)Ljava/awt/Container;")
    public Container method518() {
        return this.field209 == null ? this : this.field209;
    }

    @ObfuscatedName("am.am(I)Lme;")
    public class363 method491() {
        Container var1 = this.method518();
        int var2 = Math.max(var1.getWidth(), this.field198);
        int var3 = Math.max(var1.getHeight(), this.field196);
        if (this.field209 != null) {
            Insets var4 = this.field209.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class363(var2, var3);
    }

    @ObfuscatedName("am.az(B)Z")
    public final boolean method512() {
        return this.field209 != null;
    }

    @ObfuscatedName("en.au(I)I")
    public static int method2726() {
        int var0 = 0;
        if (Statics.field2926 == null || !Statics.field2926.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field2926 = var2;
                        field214 = -1L;
                        field213 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field2926 != null) {
            long var4 = class416.method5860();
            long var6 = Statics.field2926.getCollectionTime();
            if (field213 != -1L) {
                long var8 = var6 - field213;
                long var10 = var4 - field214;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field213 = var6;
            field214 = var4;
        }
        return var0;
    }

    @ObfuscatedName("am.v(I)V")
    public abstract void method466();

    @ObfuscatedName("am.av(B)V")
    public abstract void method483();

    @ObfuscatedName("am.z(I)V")
    public abstract void method485();

    @ObfuscatedName("am.y(ZI)V")
    public abstract void method487(boolean arg0);

    @ObfuscatedName("am.ah(I)V")
    public abstract void method488();

    public abstract void init();

    @ObfuscatedName("am.i(S)V")
    public abstract void method589();
}
