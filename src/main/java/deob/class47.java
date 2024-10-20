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

@ObfuscatedName("af")
public abstract class class47 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("af.n")
    public static class47 field331 = null;

    @ObfuscatedName("af.f")
    public static int field354 = 0;

    @ObfuscatedName("af.p")
    public static long field333 = 0L;

    @ObfuscatedName("af.j")
    public static boolean field334 = false;

    @ObfuscatedName("af.r")
    public boolean field337 = false;

    @ObfuscatedName("af.d")
    public static int field336 = 20;

    @ObfuscatedName("af.s")
    public static int field344 = 1;

    @ObfuscatedName("af.u")
    public static int field338 = 0;

    @ObfuscatedName("af.c")
    public static long[] field363 = new long[32];

    @ObfuscatedName("af.g")
    public static long[] field342 = new long[32];

    @ObfuscatedName("af.k")
    public int field360;

    @ObfuscatedName("af.m")
    public int field345;

    @ObfuscatedName("af.z")
    public int field346 = 0;

    @ObfuscatedName("af.t")
    public int field330 = 0;

    @ObfuscatedName("af.i")
    public int field351;

    @ObfuscatedName("af.ae")
    public int field349;

    @ObfuscatedName("af.ap")
    public int field350;

    @ObfuscatedName("af.ab")
    public int field340;

    @ObfuscatedName("af.ai")
    public Frame field352;

    @ObfuscatedName("af.ar")
    public Canvas field353;

    @ObfuscatedName("af.ag")
    public volatile boolean field365 = true;

    @ObfuscatedName("af.as")
    public static int field356 = 500;

    @ObfuscatedName("af.aj")
    public boolean field357 = false;

    @ObfuscatedName("af.am")
    public volatile boolean field332 = false;

    @ObfuscatedName("af.az")
    public volatile long field364 = 0L;

    @ObfuscatedName("af.at")
    public class38 field367;

    @ObfuscatedName("af.ah")
    public Clipboard field361;

    @ObfuscatedName("af.ao")
    public final EventQueue field358;

    @ObfuscatedName("af.aq")
    public static volatile boolean field347 = true;

    @ObfuscatedName("af.ak")
    public static long field335 = -1L;

    @ObfuscatedName("af.ay")
    public static long field359 = -1L;

    public class47() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field358 = var1;
        class53.method164(new class40());
    }

    @ObfuscatedName("af.p(III)V")
    public final void method373(int arg0, int arg1) {
        if (this.field350 != arg0 || this.field340 != arg1) {
            this.method391();
        }
        this.field350 = arg0;
        this.field340 = arg1;
    }

    @ObfuscatedName("af.j(Ljava/lang/Object;B)V")
    public final void method374(Object arg0) {
        if (this.field358 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field358.peekEvent() != null; var2++) {
            try {
                Thread.sleep(1L);
            } catch (InterruptedException var4) {
            }
        }
        if (arg0 != null) {
            this.field358.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("af.r(B)Ldw;")
    public class130 method375() {
        if (this.field367 == null) {
            this.field367 = new class38();
            this.field367.method257(this.field353);
        }
        return this.field367;
    }

    @ObfuscatedName("af.b(I)V")
    public void method515() {
        this.field361 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("af.d(Ljava/lang/String;I)V")
    public void method467(String arg0) {
        this.field361.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("af.s(I)V")
    public final void method378() {
        Statics.method4242();
        class39.method2035(this.field353);
    }

    @ObfuscatedName("af.u(B)V")
    public final void method396() {
        Canvas var1 = this.field353;
        var1.addMouseListener(class48.field371);
        var1.addMouseMotionListener(class48.field371);
        var1.addFocusListener(class48.field371);
    }

    @ObfuscatedName("af.l(I)V")
    public final void method420() {
        Container var1 = this.method404();
        if (var1 == null) {
            return;
        }
        class337 var2 = this.method405();
        this.field360 = Math.max(var2.field3911, this.field351);
        this.field345 = Math.max(var2.field3912, this.field349);
        if (this.field360 <= 0) {
            this.field360 = 1;
        }
        if (this.field345 <= 0) {
            this.field345 = 1;
        }
        Statics.field247 = Math.min(this.field360, this.field350);
        Statics.field603 = Math.min(this.field345, this.field340);
        this.field346 = (this.field360 - Statics.field247) / 2;
        this.field330 = 0;
        this.field353.setSize(Statics.field247, Statics.field603);
        Statics.field222 = new class46(Statics.field247, Statics.field603, this.field353);
        if (this.field352 == var1) {
            Insets var3 = this.field352.getInsets();
            this.field353.setLocation(this.field346 + var3.left, this.field330 + var3.top);
        } else {
            this.field353.setLocation(this.field346, this.field330);
        }
        this.field365 = true;
        this.method381();
    }

    @ObfuscatedName("af.c(I)V")
    public void method382() {
        int var1 = this.field346;
        int var2 = this.field330;
        int var3 = this.field360 - Statics.field247 - var1;
        int var4 = this.field345 - Statics.field603 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method404();
            int var6 = 0;
            int var7 = 0;
            if (this.field352 == var5) {
                Insets var8 = this.field352.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field345);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field360, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field360 + var6 - var3, var7, var3, this.field345);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field345 + var7 - var4, this.field360, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("af.e(B)V")
    public final void method383() {
        class39.method681(this.field353);
        Canvas var1 = this.field353;
        var1.removeMouseListener(class48.field371);
        var1.removeMouseMotionListener(class48.field371);
        var1.removeFocusListener(class48.field371);
        class48.field372 = 0;
        if (this.field367 != null) {
            this.field367.method253(this.field353);
        }
        this.method385();
        class39.method2035(this.field353);
        Canvas var2 = this.field353;
        var2.addMouseListener(class48.field371);
        var2.addMouseMotionListener(class48.field371);
        var2.addFocusListener(class48.field371);
        if (this.field367 != null) {
            this.field367.method257(this.field353);
        }
        this.method391();
    }

    @ObfuscatedName("af.g(IIII)V")
    public final void method384(int arg0, int arg1, int arg2) {
        try {
            if (field331 != null) {
                field354++;
                if (field354 >= 3) {
                    this.method403("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field331 = this;
            Statics.field247 = arg0;
            Statics.field603 = arg1;
            Statics.field4296 = arg2;
            Statics.field4297 = this;
            if (Statics.field348 == null) {
                Statics.field348 = new class128();
            }
            Statics.field348.method2295(this, 1);
        } catch (Exception var5) {
            class406.method4407((String) null, var5);
            this.method403("crash");
        }
    }

    @ObfuscatedName("af.a(I)V")
    public final synchronized void method385() {
        Container var1 = this.method404();
        if (this.field353 != null) {
            this.field353.removeFocusListener(this);
            var1.remove(this.field353);
        }
        Statics.field247 = Math.max(var1.getWidth(), this.field351);
        Statics.field603 = Math.max(var1.getHeight(), this.field349);
        if (this.field352 != null) {
            Insets var2 = this.field352.getInsets();
            Statics.field247 -= var2.right + var2.left;
            Statics.field603 -= var2.top + var2.bottom;
        }
        this.field353 = new class41(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field353);
        this.field353.setSize(Statics.field247, Statics.field603);
        this.field353.setVisible(true);
        this.field353.setBackground(Color.BLACK);
        if (this.field352 == var1) {
            Insets var3 = this.field352.getInsets();
            this.field353.setLocation(this.field346 + var3.left, this.field330 + var3.top);
        } else {
            this.field353.setLocation(this.field346, this.field330);
        }
        this.field353.addFocusListener(this);
        this.field353.requestFocus();
        this.field365 = true;
        if (Statics.field222 != null && Statics.field247 == Statics.field222.field4228 && Statics.field603 == Statics.field222.field4230) {
            ((class46) Statics.field222).method354(this.field353);
            Statics.field222.method371(0, 0);
        } else {
            Statics.field222 = new class46(Statics.field247, Statics.field603, this.field353);
        }
        this.field332 = false;
        this.field364 = class380.method2744();
    }

    @ObfuscatedName("af.k(I)Z")
    public final boolean method386() {
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
                this.method403("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1485 != null) {
                String var1 = Statics.field1485.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1479;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method403("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class304.method2255(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class304.method167(var4) && class304.method1725(var4) < 10) {
                            this.method403("wrongjava");
                            return;
                        }
                    }
                    field344 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method385();
            this.method397();
            class135 var5;
            try {
                var5 = new class127();
            } catch (Throwable var9) {
                var5 = new class133();
            }
            Statics.field339 = var5;
            while (field333 == 0L || class380.method2744() < field333) {
                Statics.field3194 = Statics.field339.method2286(field336, field344);
                for (int var7 = 0; var7 < Statics.field3194; var7++) {
                    this.method388();
                }
                this.method389();
                this.method374(this.field353);
            }
        } catch (Exception var10) {
            class406.method4407((String) null, var10);
            this.method403("crash");
        }
        this.method392();
    }

    @ObfuscatedName("af.m(I)V")
    public void method388() {
        long var1 = class380.method2744();
        long var3 = field342[Statics.field343];
        field342[Statics.field343] = var1;
        Statics.field343 = Statics.field343 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field2127 = field347;
        }
        this.method490();
    }

    @ObfuscatedName("af.x(B)V")
    public void method389() {
        Container var1 = this.method404();
        long var2 = class380.method2744();
        long var4 = field363[Statics.field341];
        field363[Statics.field341] = var2;
        Statics.field341 = Statics.field341 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field338 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field356 - 1 > 50) {
            field356 -= 50;
            this.field365 = true;
            this.field353.setSize(Statics.field247, Statics.field603);
            this.field353.setVisible(true);
            if (this.field352 == var1) {
                Insets var7 = this.field352.getInsets();
                this.field353.setLocation(this.field346 + var7.left, this.field330 + var7.top);
            } else {
                this.field353.setLocation(this.field346, this.field330);
            }
        }
        if (this.field332) {
            this.method383();
        }
        this.method394();
        this.method399(this.field365);
        if (this.field365) {
            this.method382();
        }
        this.field365 = false;
    }

    @ObfuscatedName("af.i(B)V")
    public final void method394() {
        class337 var1 = this.method405();
        if (this.field360 != var1.field3911 || this.field345 != var1.field3912 || this.field357) {
            this.method420();
            this.field357 = false;
        }
    }

    @ObfuscatedName("af.ae(I)V")
    public final void method391() {
        this.field357 = true;
    }

    @ObfuscatedName("af.ap(I)V")
    public final synchronized void method392() {
        if (field334) {
            return;
        }
        field334 = true;
        try {
            this.field353.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method400();
        } catch (Exception var7) {
        }
        if (this.field352 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field348 != null) {
            try {
                Statics.field348.method2303();
            } catch (Exception var5) {
            }
        }
        this.method407();
    }

    public final void start() {
        if (field331 == this && !field334) {
            field333 = 0L;
        }
    }

    public final void stop() {
        if (field331 == this && !field334) {
            field333 = class380.method2744() + 4000L;
        }
    }

    public final void destroy() {
        if (field331 != this || field334) {
            return;
        }
        field333 = class380.method2744();
        long var1 = 4999L;
        try {
            Thread.sleep(var1);
        } catch (InterruptedException var6) {
        }
        try {
            Thread.sleep(1L);
        } catch (InterruptedException var5) {
        }
        this.method392();
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field331 != this || field334) {
            return;
        }
        this.field365 = true;
        if (class380.method2744() - this.field364 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field247 && var2.height >= Statics.field603) {
                this.field332 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field347 = true;
        this.field365 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field347 = false;
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

    @ObfuscatedName("af.ar(ILjava/lang/String;ZI)V")
    public final void method401(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field353.getGraphics();
            if (Statics.field1590 == null) {
                Statics.field1590 = new Font("Helvetica", 1, 13);
                Statics.field3896 = this.field353.getFontMetrics(Statics.field1590);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field247, Statics.field603);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field355 == null) {
                    Statics.field355 = this.field353.createImage(304, 34);
                }
                Graphics var6 = Statics.field355.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field1590);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field3896.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field355, Statics.field247 / 2 - 152, Statics.field603 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field247 / 2 - 152;
                int var9 = Statics.field603 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1590);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field3896.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field353.repaint();
        }
    }

    @ObfuscatedName("af.ag(B)V")
    public final void method402() {
        Statics.field355 = null;
        Statics.field1590 = null;
        Statics.field3896 = null;
    }

    @ObfuscatedName("af.ax(Ljava/lang/String;B)V")
    public void method403(String arg0) {
        if (this.field337) {
            return;
        }
        this.field337 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("af.as(I)Ljava/awt/Container;")
    public Container method404() {
        return this.field352 == null ? this : this.field352;
    }

    @ObfuscatedName("af.aj(I)Lli;")
    public class337 method405() {
        Container var1 = this.method404();
        int var2 = Math.max(var1.getWidth(), this.field351);
        int var3 = Math.max(var1.getHeight(), this.field349);
        if (this.field352 != null) {
            Insets var4 = this.field352.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class337(var2, var3);
    }

    @ObfuscatedName("af.am(B)Z")
    public final boolean method516() {
        return this.field352 != null;
    }

    @ObfuscatedName("ao.az(I)I")
    public static int method339() {
        int var0 = 0;
        if (Statics.field1468 == null || !Statics.field1468.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field1468 = var2;
                        field359 = -1L;
                        field335 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field1468 != null) {
            long var4 = class380.method2744();
            long var6 = Statics.field1468.getCollectionTime();
            if (field335 != -1L) {
                long var8 = var6 - field335;
                long var10 = var4 - field359;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field335 = var6;
            field359 = var4;
        }
        return var0;
    }

    @ObfuscatedName("af.o(B)V")
    public abstract void method381();

    @ObfuscatedName("af.ab(I)V")
    public abstract void method397();

    @ObfuscatedName("af.ad(ZS)V")
    public abstract void method399(boolean arg0);

    @ObfuscatedName("af.ai(I)V")
    public abstract void method400();

    @ObfuscatedName("af.av(I)V")
    public abstract void method407();

    @ObfuscatedName("af.al(B)V")
    public abstract void method490();

    public abstract void init();
}
