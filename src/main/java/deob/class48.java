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

@ObfuscatedName("ax")
public abstract class class48 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ax.n")
    public static class48 field427 = null;

    @ObfuscatedName("ax.u")
    public static int field421 = 0;

    @ObfuscatedName("ax.i")
    public static long field440 = 0L;

    @ObfuscatedName("ax.r")
    public static boolean field423 = false;

    @ObfuscatedName("ax.j")
    public boolean field424 = false;

    @ObfuscatedName("ax.e")
    public static int field426 = 20;

    @ObfuscatedName("ax.s")
    public static int field451 = 1;

    @ObfuscatedName("ax.v")
    public static int field428 = 0;

    @ObfuscatedName("ax.q")
    public static long[] field430 = new long[32];

    @ObfuscatedName("ax.f")
    public static long[] field432 = new long[32];

    @ObfuscatedName("ax.a")
    public int field433;

    @ObfuscatedName("ax.b")
    public int field434;

    @ObfuscatedName("ax.g")
    public int field435 = 0;

    @ObfuscatedName("ax.d")
    public int field450 = 0;

    @ObfuscatedName("ax.h")
    public int field437;

    @ObfuscatedName("ax.an")
    public int field438;

    @ObfuscatedName("ax.al")
    public int field420;

    @ObfuscatedName("ax.ah")
    public int field454;

    @ObfuscatedName("ax.ag")
    public Frame field441;

    @ObfuscatedName("ax.av")
    public Canvas field442;

    @ObfuscatedName("ax.am")
    public volatile boolean field443 = true;

    @ObfuscatedName("ax.au")
    public static int field444 = 500;

    @ObfuscatedName("ax.ae")
    public boolean field445 = false;

    @ObfuscatedName("ax.ai")
    public volatile boolean field446 = false;

    @ObfuscatedName("ax.ab")
    public volatile long field452 = 0L;

    @ObfuscatedName("ax.aq")
    public class39 field449;

    @ObfuscatedName("ax.az")
    public Clipboard field422;

    @ObfuscatedName("ax.ay")
    public final EventQueue field419;

    @ObfuscatedName("ax.ao")
    public static volatile boolean field439 = true;

    @ObfuscatedName("ax.ax")
    public static long field453 = -1L;

    @ObfuscatedName("ax.ar")
    public static long field436 = -1L;

    public class48() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field419 = var1;
        class41 var3 = new class41();
        Statics.field1109 = var3;
    }

    @ObfuscatedName("ax.v(III)V")
    public final void method728(int arg0, int arg1) {
        if (this.field420 != arg0 || this.field454 != arg1) {
            this.method742();
        }
        this.field420 = arg0;
        this.field454 = arg1;
    }

    @ObfuscatedName("ax.k(Ljava/lang/Object;B)V")
    public final void method729(Object arg0) {
        if (this.field419 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field419.peekEvent() != null; var2++) {
            class194.method1689(1L);
        }
        if (arg0 != null) {
            this.field419.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("ax.o(I)Lfs;")
    public class159 method734() {
        if (this.field449 == null) {
            this.field449 = new class39();
            this.field449.method615(this.field442);
        }
        return this.field449;
    }

    @ObfuscatedName("ax.q(I)V")
    public void method758() {
        this.field422 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("ax.l(Ljava/lang/String;B)V")
    public void method863(String arg0) {
        this.field422.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("ax.f(B)V")
    public final void method732() {
        class40.method3508();
        Canvas var1 = this.field442;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class40.field383);
        var1.addFocusListener(class40.field383);
    }

    @ObfuscatedName("ax.z(B)V")
    public final void method727() {
        class49.method4212(this.field442);
    }

    @ObfuscatedName("ax.a(I)V")
    public final void method854() {
        Container var1 = this.method759();
        if (var1 == null) {
            return;
        }
        class316 var2 = this.method750();
        this.field433 = Math.max(var2.field3804, this.field437);
        this.field434 = Math.max(var2.field3807, this.field438);
        if (this.field433 <= 0) {
            this.field433 = 1;
        }
        if (this.field434 <= 0) {
            this.field434 = 1;
        }
        Statics.field226 = Math.min(this.field433, this.field420);
        Statics.field387 = Math.min(this.field434, this.field454);
        this.field435 = (this.field433 - Statics.field226) / 2;
        this.field450 = 0;
        this.field442.setSize(Statics.field226, Statics.field387);
        Statics.field448 = new class47(Statics.field226, Statics.field387, this.field442);
        if (this.field441 == var1) {
            Insets var3 = this.field441.getInsets();
            this.field442.setLocation(this.field435 + var3.left, this.field450 + var3.top);
        } else {
            this.field442.setLocation(this.field435, this.field450);
        }
        this.field443 = true;
        this.method735();
    }

    @ObfuscatedName("ax.t(I)V")
    public void method773() {
        int var1 = this.field435;
        int var2 = this.field450;
        int var3 = this.field433 - Statics.field226 - var1;
        int var4 = this.field434 - Statics.field387 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method759();
            int var6 = 0;
            int var7 = 0;
            if (this.field441 == var5) {
                Insets var8 = this.field441.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field434);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field433, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field433 + var6 - var3, var7, var3, this.field434);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field434 + var7 - var4, this.field433, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("ax.h(I)V")
    public final void method736() {
        Canvas var1 = this.field442;
        var1.removeKeyListener(class40.field383);
        var1.removeFocusListener(class40.field383);
        class40.field371 = -1;
        class49.method707(this.field442);
        if (this.field449 != null) {
            this.field449.method606(this.field442);
        }
        this.method853();
        Canvas var2 = this.field442;
        var2.setFocusTraversalKeysEnabled(false);
        var2.addKeyListener(class40.field383);
        var2.addFocusListener(class40.field383);
        class49.method4212(this.field442);
        if (this.field449 != null) {
            this.field449.method615(this.field442);
        }
        this.method742();
    }

    @ObfuscatedName("ax.ah(IIII)V")
    public final void method737(int arg0, int arg1, int arg2) {
        try {
            if (field427 != null) {
                field421++;
                if (field421 >= 3) {
                    this.method756("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field427 = this;
            Statics.field226 = arg0;
            Statics.field387 = arg1;
            Statics.field1980 = arg2;
            Statics.field1827 = this;
            if (Statics.field447 == null) {
                Statics.field447 = new class157();
            }
            Statics.field447.method2995(this, 1);
        } catch (Exception var5) {
            class155.method917((String) null, var5);
            this.method756("crash");
        }
    }

    @ObfuscatedName("ax.ad(I)V")
    public final synchronized void method853() {
        Container var1 = this.method759();
        if (this.field442 != null) {
            this.field442.removeFocusListener(this);
            var1.remove(this.field442);
        }
        Statics.field226 = Math.max(var1.getWidth(), this.field437);
        Statics.field387 = Math.max(var1.getHeight(), this.field438);
        if (this.field441 != null) {
            Insets var2 = this.field441.getInsets();
            Statics.field226 -= var2.right + var2.left;
            Statics.field387 -= var2.top + var2.bottom;
        }
        this.field442 = new class43(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field442);
        this.field442.setSize(Statics.field226, Statics.field387);
        this.field442.setVisible(true);
        this.field442.setBackground(Color.BLACK);
        if (this.field441 == var1) {
            Insets var3 = this.field441.getInsets();
            this.field442.setLocation(this.field435 + var3.left, this.field450 + var3.top);
        } else {
            this.field442.setLocation(this.field435, this.field450);
        }
        this.field442.addFocusListener(this);
        this.field442.requestFocus();
        this.field443 = true;
        if (Statics.field448 != null && Statics.field226 == Statics.field448.field3827 && Statics.field387 == Statics.field448.field3829) {
            ((class47) Statics.field448).method716(this.field442);
            Statics.field448.method712(0, 0);
        } else {
            Statics.field448 = new class47(Statics.field226, Statics.field387, this.field442);
        }
        this.field446 = false;
        this.field452 = class187.method1700();
    }

    @ObfuscatedName("ax.aa(I)Z")
    public final boolean method828() {
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
                this.method756("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1995 != null) {
                String var1 = Statics.field1995.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1994;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method756("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class308.method3240(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class308.method4224(var4) && class308.method508(var4) < 10) {
                            this.method756("wrongjava");
                            return;
                        }
                    }
                    field451 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method853();
            this.method867();
            Statics.field3262 = class163.method3070();
            while (field440 == 0L || class187.method1700() < field440) {
                Statics.field425 = Statics.field3262.method2952(field426, field451);
                for (int var5 = 0; var5 < Statics.field425; var5++) {
                    this.method851();
                }
                this.method813();
                this.method729(this.field442);
            }
        } catch (Exception var7) {
            class155.method917((String) null, var7);
            this.method756("crash");
        }
        this.method743();
    }

    @ObfuscatedName("ax.ag(I)V")
    public void method851() {
        long var1 = class187.method1700();
        long var3 = field432[Statics.field164];
        field432[Statics.field164] = var1;
        Statics.field164 = Statics.field164 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field27 = field439;
        }
        this.method751();
    }

    @ObfuscatedName("ax.av(B)V")
    public void method813() {
        Container var1 = this.method759();
        long var2 = class187.method1700();
        long var4 = field430[Statics.field431];
        field430[Statics.field431] = var2;
        Statics.field431 = Statics.field431 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field428 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field444 - 1 > 50) {
            field444 -= 50;
            this.field443 = true;
            this.field442.setSize(Statics.field226, Statics.field387);
            this.field442.setVisible(true);
            if (this.field441 == var1) {
                Insets var7 = this.field441.getInsets();
                this.field442.setLocation(this.field435 + var7.left, this.field450 + var7.top);
            } else {
                this.field442.setLocation(this.field435, this.field450);
            }
        }
        if (this.field446) {
            this.method736();
        }
        this.method741();
        this.method752(this.field443);
        if (this.field443) {
            this.method773();
        }
        this.field443 = false;
    }

    @ObfuscatedName("ax.am(B)V")
    public final void method741() {
        class316 var1 = this.method750();
        if (this.field433 != var1.field3804 || this.field434 != var1.field3807 || this.field445) {
            this.method854();
            this.field445 = false;
        }
    }

    @ObfuscatedName("ax.ap(I)V")
    public final void method742() {
        this.field445 = true;
    }

    @ObfuscatedName("ax.au(I)V")
    public final synchronized void method743() {
        if (field423) {
            return;
        }
        field423 = true;
        try {
            this.field442.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method753();
        } catch (Exception var7) {
        }
        if (this.field441 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field447 != null) {
            try {
                Statics.field447.method3002();
            } catch (Exception var5) {
            }
        }
        this.method760();
    }

    @ObfuscatedName("fj.ae(B)V")
    public static final void method3072() {
        Statics.field3262.method2951();
        for (int var0 = 0; var0 < 32; var0++) {
            field430[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field432[var1] = 0L;
        }
        Statics.field425 = 0;
    }

    public final void start() {
        if (field427 == this && !field423) {
            field440 = 0L;
        }
    }

    public final void stop() {
        if (field427 == this && !field423) {
            field440 = class187.method1700() + 4000L;
        }
    }

    public final void destroy() {
        if (field427 == this && !field423) {
            field440 = class187.method1700();
            class194.method1689(5000L);
            this.method743();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field427 != this || field423) {
            return;
        }
        this.field443 = true;
        if (class187.method1700() - this.field452 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field226 && var2.height >= Statics.field387) {
                this.field446 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field439 = true;
        this.field443 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field439 = false;
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

    @ObfuscatedName("ax.aq(ILjava/lang/String;ZB)V")
    public final void method754(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field442.getGraphics();
            if (Statics.field117 == null) {
                Statics.field117 = new Font("Helvetica", 1, 13);
                Statics.field3183 = this.field442.getFontMetrics(Statics.field117);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field226, Statics.field387);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field1908 == null) {
                    Statics.field1908 = this.field442.createImage(304, 34);
                }
                Graphics var6 = Statics.field1908.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field117);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field3183.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field1908, Statics.field226 / 2 - 152, Statics.field387 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field226 / 2 - 152;
                int var9 = Statics.field387 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field117);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field3183.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field442.repaint();
        }
    }

    @ObfuscatedName("ax.az(I)V")
    public final void method755() {
        Statics.field1908 = null;
        Statics.field117 = null;
        Statics.field3183 = null;
    }

    @ObfuscatedName("ax.ay(Ljava/lang/String;B)V")
    public void method756(String arg0) {
        if (this.field424) {
            return;
        }
        this.field424 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ax.ao(I)Ljava/awt/Container;")
    public Container method759() {
        return this.field441 == null ? this : this.field441;
    }

    @ObfuscatedName("ax.ak(I)Llj;")
    public class316 method750() {
        Container var1 = this.method759();
        int var2 = Math.max(var1.getWidth(), this.field437);
        int var3 = Math.max(var1.getHeight(), this.field438);
        if (this.field441 != null) {
            Insets var4 = this.field441.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class316(var2, var3);
    }

    @ObfuscatedName("ax.af(B)Z")
    public final boolean method745() {
        return this.field441 != null;
    }

    @ObfuscatedName("z.ax(B)I")
    public static int method175() {
        int var0 = 0;
        if (Statics.field314 == null || !Statics.field314.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field314 = var2;
                        field436 = -1L;
                        field453 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field314 != null) {
            long var4 = class187.method1700();
            long var6 = Statics.field314.getCollectionTime();
            if (field453 != -1L) {
                long var8 = var6 - field453;
                long var10 = var4 - field436;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field453 = var6;
            field436 = var4;
        }
        return var0;
    }

    @ObfuscatedName("ax.x(B)V")
    public abstract void method735();

    public abstract void init();

    @ObfuscatedName("ax.ab(I)V")
    public abstract void method751();

    @ObfuscatedName("ax.aw(ZI)V")
    public abstract void method752(boolean arg0);

    @ObfuscatedName("ax.ac(I)V")
    public abstract void method753();

    @ObfuscatedName("ax.ar(B)V")
    public abstract void method760();

    @ObfuscatedName("ax.ai(B)V")
    public abstract void method867();
}
