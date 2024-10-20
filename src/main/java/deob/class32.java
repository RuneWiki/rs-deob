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

@ObfuscatedName("ap")
public abstract class class32 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ap.v")
    public static class32 field213 = null;

    @ObfuscatedName("ap.q")
    public static int field180 = 0;

    @ObfuscatedName("ap.f")
    public static long field181 = 0L;

    @ObfuscatedName("ap.j")
    public static boolean field178 = false;

    @ObfuscatedName("ap.e")
    public boolean field183 = false;

    @ObfuscatedName("ap.i")
    public static int field191 = 20;

    @ObfuscatedName("ap.s")
    public static int field185 = 1;

    @ObfuscatedName("ap.t")
    public static int field189 = 0;

    @ObfuscatedName("ap.u")
    public static long[] field187 = new long[32];

    @ObfuscatedName("ap.h")
    public static long[] field188 = new long[32];

    @ObfuscatedName("ap.a")
    public int field193;

    @ObfuscatedName("ap.p")
    public int field190;

    @ObfuscatedName("ap.b")
    public int field206 = 0;

    @ObfuscatedName("ap.n")
    public int field192 = 0;

    @ObfuscatedName("ap.d")
    public int field211;

    @ObfuscatedName("ap.ad")
    public int field194;

    @ObfuscatedName("ap.ak")
    public int field195;

    @ObfuscatedName("ap.al")
    public int field196;

    @ObfuscatedName("ap.ap")
    public Frame field197;

    @ObfuscatedName("ap.ac")
    public Canvas field198;

    @ObfuscatedName("ap.ae")
    public volatile boolean field179 = true;

    @ObfuscatedName("ap.am")
    public static int field200 = 500;

    @ObfuscatedName("ap.an")
    public boolean field201 = false;

    @ObfuscatedName("ap.af")
    public volatile boolean field202 = false;

    @ObfuscatedName("ap.ax")
    public volatile long field186 = 0L;

    @ObfuscatedName("ap.ag")
    public class23 field182;

    @ObfuscatedName("ap.aq")
    public Clipboard field205;

    @ObfuscatedName("ap.ah")
    public final EventQueue field209;

    @ObfuscatedName("ap.ai")
    public static volatile boolean field207 = true;

    @ObfuscatedName("ap.aw")
    public static long field208 = -1L;

    @ObfuscatedName("ap.au")
    public static long field184 = -1L;

    public class32() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field209 = var1;
        class40.method2711(new class25());
    }

    @ObfuscatedName("ap.i(IIB)V")
    public final void method376(int arg0, int arg1) {
        if (this.field195 != arg0 || this.field196 != arg1) {
            this.method472();
        }
        this.field195 = arg0;
        this.field196 = arg1;
    }

    @ObfuscatedName("ap.s(Ljava/lang/Object;I)V")
    public final void method378(Object arg0) {
        if (this.field209 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field209.peekEvent() != null; var2++) {
            class270.method1896(1L);
        }
        if (arg0 != null) {
            this.field209.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("ap.t(I)Lfh;")
    public class159 method483() {
        if (this.field182 == null) {
            this.field182 = new class23();
            this.field182.method265(this.field198);
        }
        return this.field182;
    }

    @ObfuscatedName("ap.z(B)V")
    public void method379() {
        this.field205 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("ap.r(Ljava/lang/String;B)V")
    public void method380(String arg0) {
        this.field205.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("ap.u(B)V")
    public final void method388() {
        class24.method6894();
        class24.method2236(this.field198);
    }

    @ObfuscatedName("ap.k(B)V")
    public final void method382() {
        Canvas var1 = this.field198;
        var1.addMouseListener(class33.field217);
        var1.addMouseMotionListener(class33.field217);
        var1.addFocusListener(class33.field217);
    }

    @ObfuscatedName("ap.h(I)V")
    public final void method383() {
        Container var1 = this.method407();
        if (var1 == null) {
            return;
        }
        class384 var2 = this.method375();
        this.field193 = Math.max(var2.field4380, this.field211);
        this.field190 = Math.max(var2.field4381, this.field194);
        if (this.field193 <= 0) {
            this.field193 = 1;
        }
        if (this.field190 <= 0) {
            this.field190 = 1;
        }
        Statics.field976 = Math.min(this.field193, this.field195);
        Statics.field1028 = Math.min(this.field190, this.field196);
        this.field206 = (this.field193 - Statics.field976) / 2;
        this.field192 = 0;
        this.field198.setSize(Statics.field976, Statics.field1028);
        Statics.field458 = new class31(Statics.field976, Statics.field1028, this.field198);
        if (this.field197 == var1) {
            Insets var3 = this.field197.getInsets();
            this.field198.setLocation(this.field206 + var3.left, this.field192 + var3.top);
        } else {
            this.field198.setLocation(this.field206, this.field192);
        }
        this.field179 = true;
        this.method435();
    }

    @ObfuscatedName("ap.l(I)V")
    public void method385() {
        int var1 = this.field206;
        int var2 = this.field192;
        int var3 = this.field193 - Statics.field976 - var1;
        int var4 = this.field190 - Statics.field1028 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method407();
            int var6 = 0;
            int var7 = 0;
            if (this.field197 == var5) {
                Insets var8 = this.field197.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field190);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field193, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field193 + var6 - var3, var7, var3, this.field190);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field190 + var7 - var4, this.field193, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("ap.a(B)V")
    public final void method493() {
        class24.method3384(this.field198);
        Canvas var1 = this.field198;
        var1.removeMouseListener(class33.field217);
        var1.removeMouseMotionListener(class33.field217);
        var1.removeFocusListener(class33.field217);
        class33.field219 = 0;
        if (this.field182 != null) {
            this.field182.method262(this.field198);
        }
        this.method406();
        class24.method2236(this.field198);
        Canvas var2 = this.field198;
        var2.addMouseListener(class33.field217);
        var2.addMouseMotionListener(class33.field217);
        var2.addFocusListener(class33.field217);
        if (this.field182 != null) {
            this.field182.method265(this.field198);
        }
        this.method472();
    }

    @ObfuscatedName("ap.p(IIIII)V")
    public final void method503(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (field213 != null) {
                field180++;
                if (field180 >= 3) {
                    this.method408("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field213 = this;
            Statics.field976 = arg0;
            Statics.field1028 = arg1;
            Statics.field4839 = arg2;
            Statics.field4840 = arg3;
            Statics.field4842 = this;
            if (Statics.field203 == null) {
                Statics.field203 = new class157();
            }
            Statics.field203.method2949(this, 1);
        } catch (Exception var6) {
            class467.method4655((String) null, var6);
            this.method408("crash");
        }
    }

    @ObfuscatedName("ap.b(I)V")
    public final synchronized void method406() {
        Container var1 = this.method407();
        if (this.field198 != null) {
            this.field198.removeFocusListener(this);
            var1.remove(this.field198);
        }
        Statics.field976 = Math.max(var1.getWidth(), this.field211);
        Statics.field1028 = Math.max(var1.getHeight(), this.field194);
        if (this.field197 != null) {
            Insets var2 = this.field197.getInsets();
            Statics.field976 -= var2.right + var2.left;
            Statics.field1028 -= var2.top + var2.bottom;
        }
        this.field198 = new class26(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field198);
        this.field198.setSize(Statics.field976, Statics.field1028);
        this.field198.setVisible(true);
        this.field198.setBackground(Color.BLACK);
        if (this.field197 == var1) {
            Insets var3 = this.field197.getInsets();
            this.field198.setLocation(this.field206 + var3.left, this.field192 + var3.top);
        } else {
            this.field198.setLocation(this.field206, this.field192);
        }
        this.field198.addFocusListener(this);
        this.field198.requestFocus();
        this.field179 = true;
        if (Statics.field458 != null && Statics.field976 == Statics.field458.field4776 && Statics.field1028 == Statics.field458.field4777) {
            ((class31) Statics.field458).method368(this.field198);
            Statics.field458.method360(0, 0);
        } else {
            Statics.field458 = new class31(Statics.field976, Statics.field1028, this.field198);
        }
        this.field202 = false;
        this.field186 = class269.method2567();
    }

    @ObfuscatedName("ap.n(I)Z")
    public final boolean method389() {
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
                this.method408("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field4267 != null) {
                String var1 = Statics.field4267.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1752;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method408("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class343.method2024(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class343.method2524(var4) && class343.method4010(var4) < 10) {
                            this.method408("wrongjava");
                            return;
                        }
                    }
                    field185 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method406();
            this.method400();
            Statics.field43 = class167.method1512();
            while (field181 == 0L || class269.method2567() < field181) {
                Statics.field1334 = Statics.field43.method2872(field191, field185);
                for (int var5 = 0; var5 < Statics.field1334; var5++) {
                    this.method390();
                }
                this.method391();
                this.method378(this.field198);
            }
        } catch (Exception var7) {
            class467.method4655((String) null, var7);
            this.method408("crash");
        }
        this.method436();
    }

    @ObfuscatedName("ap.o(I)V")
    public void method390() {
        long var1 = class269.method2567();
        long var3 = field188[Statics.field210];
        field188[Statics.field210] = var1;
        Statics.field210 = Statics.field210 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field2620 = field207;
        }
        this.method401();
    }

    @ObfuscatedName("ap.m(I)V")
    public void method391() {
        Container var1 = this.method407();
        long var2 = class269.method2567();
        long var4 = field187[Statics.field4320];
        field187[Statics.field4320] = var2;
        Statics.field4320 = Statics.field4320 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field189 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field200 - 1 > 50) {
            field200 -= 50;
            this.field179 = true;
            this.field198.setSize(Statics.field976, Statics.field1028);
            this.field198.setVisible(true);
            if (this.field197 == var1) {
                Insets var7 = this.field197.getInsets();
                this.field198.setLocation(this.field206 + var7.left, this.field192 + var7.top);
            } else {
                this.field198.setLocation(this.field206, this.field192);
            }
        }
        if (this.field202) {
            this.method493();
        }
        this.method392();
        this.method464(this.field179);
        if (this.field179) {
            this.method385();
        }
        this.field179 = false;
    }

    @ObfuscatedName("ap.d(I)V")
    public final void method392() {
        class384 var1 = this.method375();
        if (this.field193 != var1.field4380 || this.field190 != var1.field4381 || this.field201) {
            this.method383();
            this.field201 = false;
        }
    }

    @ObfuscatedName("ap.ad(I)V")
    public final void method472() {
        this.field201 = true;
    }

    @ObfuscatedName("ap.ak(I)V")
    public final synchronized void method436() {
        if (field178) {
            return;
        }
        field178 = true;
        try {
            this.field198.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method403();
        } catch (Exception var7) {
        }
        if (this.field197 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field203 != null) {
            try {
                Statics.field203.method2946();
            } catch (Exception var5) {
            }
        }
        this.method502();
    }

    @ObfuscatedName("jf.al(I)V")
    public static final void method4983() {
        Statics.field43.method2871();
        for (int var0 = 0; var0 < 32; var0++) {
            field187[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field188[var1] = 0L;
        }
        Statics.field1334 = 0;
    }

    public final void start() {
        if (field213 == this && !field178) {
            field181 = 0L;
        }
    }

    public final void stop() {
        if (field213 == this && !field178) {
            field181 = class269.method2567() + 4000L;
        }
    }

    public final void destroy() {
        if (field213 == this && !field178) {
            field181 = class269.method2567();
            class270.method1896(5000L);
            this.method436();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field213 != this || field178) {
            return;
        }
        this.field179 = true;
        if (class269.method2567() - this.field186 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field976 && var2.height >= Statics.field1028) {
                this.field202 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field207 = true;
        this.field179 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field207 = false;
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

    @ObfuscatedName("ap.an(ILjava/lang/String;ZB)V")
    public final void method397(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field198.getGraphics();
            if (Statics.field2215 == null) {
                Statics.field2215 = new Font("Helvetica", 1, 13);
                Statics.field60 = this.field198.getFontMetrics(Statics.field2215);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field976, Statics.field1028);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field1782 == null) {
                    Statics.field1782 = this.field198.createImage(304, 34);
                }
                Graphics var6 = Statics.field1782.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field2215);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field60.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field1782, Statics.field976 / 2 - 152, Statics.field1028 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field976 / 2 - 152;
                int var9 = Statics.field1028 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field2215);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field60.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field198.repaint();
        }
    }

    @ObfuscatedName("ap.af(I)V")
    public final void method405() {
        Statics.field1782 = null;
        Statics.field2215 = null;
        Statics.field60 = null;
    }

    @ObfuscatedName("ap.ax(Ljava/lang/String;I)V")
    public void method408(String arg0) {
        if (this.field183) {
            return;
        }
        this.field183 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ap.ar(B)Ljava/awt/Container;")
    public Container method407() {
        return this.field197 == null ? this : this.field197;
    }

    @ObfuscatedName("ap.at(B)Lns;")
    public class384 method375() {
        Container var1 = this.method407();
        int var2 = Math.max(var1.getWidth(), this.field211);
        int var3 = Math.max(var1.getHeight(), this.field194);
        if (this.field197 != null) {
            Insets var4 = this.field197.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class384(var2, var3);
    }

    @ObfuscatedName("ap.ag(B)Z")
    public final boolean method409() {
        return this.field197 != null;
    }

    @ObfuscatedName("fw.aq(I)I")
    public static int method2987() {
        int var0 = 0;
        if (Statics.field1786 == null || !Statics.field1786.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field1786 = var2;
                        field184 = -1L;
                        field208 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field1786 != null) {
            long var4 = class269.method2567();
            long var6 = Statics.field1786.getCollectionTime();
            if (field208 != -1L) {
                long var8 = var6 - field208;
                long var10 = var4 - field184;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field208 = var6;
            field184 = var4;
        }
        return var0;
    }

    public abstract void init();

    @ObfuscatedName("ap.ao(I)V")
    public abstract void method400();

    @ObfuscatedName("ap.ab(I)V")
    public abstract void method401();

    @ObfuscatedName("ap.am(I)V")
    public abstract void method403();

    @ObfuscatedName("ap.x(I)V")
    public abstract void method435();

    @ObfuscatedName("ap.aj(ZI)V")
    public abstract void method464(boolean arg0);

    @ObfuscatedName("ap.ah(B)V")
    public abstract void method502();
}
