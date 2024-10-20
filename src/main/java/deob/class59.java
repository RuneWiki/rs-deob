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

@ObfuscatedName("bn")
public abstract class class59 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bn.i")
    public static class59 field628 = null;

    @ObfuscatedName("bn.s")
    public static int field629 = 0;

    @ObfuscatedName("bn.j")
    public static long field638 = 0L;

    @ObfuscatedName("bn.a")
    public static boolean field654 = false;

    @ObfuscatedName("bn.t")
    public boolean field632 = false;

    @ObfuscatedName("bn.m")
    public static int field634 = 20;

    @ObfuscatedName("bn.h")
    public static int field635 = 1;

    @ObfuscatedName("bn.o")
    public static int field636 = 0;

    @ObfuscatedName("bn.n")
    public static long[] field637 = new long[32];

    @ObfuscatedName("bn.l")
    public static long[] field639 = new long[32];

    @ObfuscatedName("bn.k")
    public int field657;

    @ObfuscatedName("bn.e")
    public int field641;

    @ObfuscatedName("bn.u")
    public int field642 = 0;

    @ObfuscatedName("bn.g")
    public int field643 = 0;

    @ObfuscatedName("bn.c")
    public int field644;

    @ObfuscatedName("bn.aa")
    public int field648;

    @ObfuscatedName("bn.ap")
    public int field646;

    @ObfuscatedName("bn.ao")
    public int field647;

    @ObfuscatedName("bn.ax")
    public Frame field645;

    @ObfuscatedName("bn.ae")
    public Canvas field649;

    @ObfuscatedName("bn.ah")
    public volatile boolean field650 = true;

    @ObfuscatedName("bn.au")
    public static int field651 = 500;

    @ObfuscatedName("bn.am")
    public boolean field631 = false;

    @ObfuscatedName("bn.af")
    public volatile boolean field630 = false;

    @ObfuscatedName("bn.an")
    public volatile long field653 = 0L;

    @ObfuscatedName("bn.aw")
    public class50 field652;

    @ObfuscatedName("bn.ad")
    public Clipboard field656;

    @ObfuscatedName("bn.ab")
    public final EventQueue field627;

    @ObfuscatedName("bn.aq")
    public static volatile boolean field658 = true;

    @ObfuscatedName("bn.az")
    public static long field659 = -1L;

    @ObfuscatedName("bn.as")
    public static long field660 = -1L;

    public class59() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field627 = var1;
        class52 var3 = new class52();
        Statics.field2049 = var3;
    }

    @ObfuscatedName("bn.a(IIB)V")
    public final void method733(int arg0, int arg1) {
        if (this.field646 != arg0 || this.field647 != arg1) {
            this.method862();
        }
        this.field646 = arg0;
        this.field647 = arg1;
    }

    @ObfuscatedName("bn.t(Ljava/lang/Object;I)V")
    public final void method734(Object arg0) {
        if (this.field627 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field627.peekEvent() != null; var2++) {
            class193.method4(1L);
        }
        if (arg0 != null) {
            this.field627.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bn.r(I)Lfj;")
    public class159 method858() {
        if (this.field652 == null) {
            this.field652 = new class50();
            this.field652.method635(this.field649);
        }
        return this.field652;
    }

    @ObfuscatedName("bn.m(I)V")
    public void method736() {
        this.field656 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bn.h(Ljava/lang/String;I)V")
    public void method821(String arg0) {
        this.field656.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bn.o(I)V")
    public final void method757() {
        class51.method117();
        Canvas var1 = this.field649;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class51.field584);
        var1.addFocusListener(class51.field584);
    }

    @ObfuscatedName("bn.x(I)V")
    public final void method739() {
        class60.method63(this.field649);
    }

    @ObfuscatedName("bn.q(B)V")
    public final void method827() {
        Container var1 = this.method763();
        if (var1 == null) {
            return;
        }
        class303 var2 = this.method764();
        this.field657 = Math.max(var2.field3834, this.field644);
        this.field641 = Math.max(var2.field3835, this.field648);
        if (this.field657 <= 0) {
            this.field657 = 1;
        }
        if (this.field641 <= 0) {
            this.field641 = 1;
        }
        Statics.field408 = Math.min(this.field657, this.field646);
        Statics.field3453 = Math.min(this.field641, this.field647);
        this.field642 = (this.field657 - Statics.field408) / 2;
        this.field643 = 0;
        this.field649.setSize(Statics.field408, Statics.field3453);
        Statics.field3432 = new class58(Statics.field408, Statics.field3453, this.field649);
        if (this.field645 == var1) {
            Insets var3 = this.field645.getInsets();
            this.field649.setLocation(this.field642 + var3.left, this.field643 + var3.top);
        } else {
            this.field649.setLocation(this.field642, this.field643);
        }
        this.field650 = true;
        this.method741();
    }

    @ObfuscatedName("bn.l(B)V")
    public void method742() {
        int var1 = this.field642;
        int var2 = this.field643;
        int var3 = this.field657 - Statics.field408 - var1;
        int var4 = this.field641 - Statics.field3453 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method763();
            int var6 = 0;
            int var7 = 0;
            if (this.field645 == var5) {
                Insets var8 = this.field645.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field641);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field657, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field657 + var6 - var3, var7, var3, this.field641);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field641 + var7 - var4, this.field657, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bn.f(I)V")
    public final void method738() {
        Canvas var1 = this.field649;
        var1.removeKeyListener(class51.field584);
        var1.removeFocusListener(class51.field584);
        class51.field589 = -1;
        class60.method2366(this.field649);
        if (this.field652 != null) {
            this.field652.method636(this.field649);
        }
        this.method836();
        Canvas var2 = this.field649;
        var2.setFocusTraversalKeysEnabled(false);
        var2.addKeyListener(class51.field584);
        var2.addFocusListener(class51.field584);
        class60.method63(this.field649);
        if (this.field652 != null) {
            this.field652.method635(this.field649);
        }
        this.method862();
    }

    @ObfuscatedName("bn.k(IIIB)V")
    public final void method744(int arg0, int arg1, int arg2) {
        try {
            if (field628 != null) {
                field629++;
                if (field629 >= 3) {
                    this.method762("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field628 = this;
            Statics.field408 = arg0;
            Statics.field3453 = arg1;
            Statics.field2100 = arg2;
            Statics.field2102 = this;
            if (Statics.field655 == null) {
                Statics.field655 = new class157();
            }
            Statics.field655.method2873(this, 1);
        } catch (Exception var5) {
            class155.method1770((String) null, var5);
            this.method762("crash");
        }
    }

    @ObfuscatedName("bn.e(I)V")
    public final synchronized void method836() {
        Container var1 = this.method763();
        if (this.field649 != null) {
            this.field649.removeFocusListener(this);
            var1.remove(this.field649);
        }
        Statics.field408 = Math.max(var1.getWidth(), this.field644);
        Statics.field3453 = Math.max(var1.getHeight(), this.field648);
        if (this.field645 != null) {
            Insets var2 = this.field645.getInsets();
            Statics.field408 -= var2.right + var2.left;
            Statics.field3453 -= var2.top + var2.bottom;
        }
        this.field649 = new class54(this);
        var1.add(this.field649);
        this.field649.setSize(Statics.field408, Statics.field3453);
        this.field649.setVisible(true);
        this.field649.setBackground(Color.BLACK);
        if (this.field645 == var1) {
            Insets var3 = this.field645.getInsets();
            this.field649.setLocation(this.field642 + var3.left, this.field643 + var3.top);
        } else {
            this.field649.setLocation(this.field642, this.field643);
        }
        this.field649.addFocusListener(this);
        this.field649.requestFocus();
        this.field650 = true;
        if (Statics.field3432 != null && Statics.field408 == Statics.field3432.field3858 && Statics.field3453 == Statics.field3432.field3860) {
            ((class58) Statics.field3432).method720(this.field649);
            Statics.field3432.method712(0, 0);
        } else {
            Statics.field3432 = new class58(Statics.field408, Statics.field3453, this.field649);
        }
        this.field630 = false;
        this.field653 = class187.method35();
    }

    @ObfuscatedName("bn.u(I)Z")
    public final boolean method746() {
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
                this.method762("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2532 != null) {
                String var1 = Statics.field2532.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2083;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method762("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length(); var3++) {
                            char var4 = var2.charAt(var3);
                            boolean var5 = var4 >= '0' && var4 <= '9';
                            if (!var5) {
                                break;
                            }
                        }
                        String var6 = var2.substring(6, var3);
                        boolean var7 = false;
                        boolean var8 = false;
                        int var9 = 0;
                        int var10 = var6.length();
                        int var11 = 0;
                        boolean var13;
                        while (true) {
                            if (var11 >= var10) {
                                var13 = var8;
                                break;
                            }
                            label177: {
                                char var12 = var6.charAt(var11);
                                if (var11 == 0) {
                                    if (var12 == '-') {
                                        var7 = true;
                                        break label177;
                                    }
                                    if (var12 == '+') {
                                        break label177;
                                    }
                                }
                                int var20;
                                if (var12 >= '0' && var12 <= '9') {
                                    var20 = var12 - '0';
                                } else if (var12 >= 'A' && var12 <= 'Z') {
                                    var20 = var12 - '7';
                                } else {
                                    if (var12 < 'a' || var12 > 'z') {
                                        var13 = false;
                                        break;
                                    }
                                    var20 = var12 - 'W';
                                }
                                if (var20 >= 10) {
                                    var13 = false;
                                    break;
                                }
                                if (var7) {
                                    var20 = -var20;
                                }
                                int var14 = var9 * 10 + var20;
                                if (var14 / 10 != var9) {
                                    var13 = false;
                                    break;
                                }
                                var9 = var14;
                                var8 = true;
                            }
                            var11++;
                        }
                        if (var13) {
                            int var16 = class294.method66(var6, 10, true);
                            if (var16 < 10) {
                                this.method762("wrongjava");
                                return;
                            }
                        }
                    }
                    field635 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method836();
            this.method756();
            Statics.field3900 = class163.method980();
            while (field638 == 0L || class187.method35() < field638) {
                Statics.field633 = Statics.field3900.method2831(field634, field635);
                for (int var17 = 0; var17 < Statics.field633; var17++) {
                    this.method861();
                }
                this.method748();
                this.method734(this.field649);
            }
        } catch (Exception var19) {
            class155.method1770((String) null, var19);
            this.method762("crash");
        }
        this.method751();
    }

    @ObfuscatedName("bn.z(B)V")
    public void method861() {
        long var1 = class187.method35();
        long var3 = field639[Statics.field2591];
        field639[Statics.field2591] = var1;
        Statics.field2591 = Statics.field2591 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field306 = field658;
        }
        this.method758();
    }

    @ObfuscatedName("bn.b(I)V")
    public void method748() {
        Container var1 = this.method763();
        long var2 = class187.method35();
        long var4 = field637[Statics.field640];
        field637[Statics.field640] = var2;
        Statics.field640 = Statics.field640 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field636 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field651 - 1 > 50) {
            field651 -= 50;
            this.field650 = true;
            this.field649.setSize(Statics.field408, Statics.field3453);
            this.field649.setVisible(true);
            if (this.field645 == var1) {
                Insets var7 = this.field645.getInsets();
                this.field649.setLocation(this.field642 + var7.left, this.field643 + var7.top);
            } else {
                this.field649.setLocation(this.field642, this.field643);
            }
        }
        if (this.field630) {
            this.method738();
        }
        this.method749();
        this.method745(this.field650);
        if (this.field650) {
            this.method742();
        }
        this.field650 = false;
    }

    @ObfuscatedName("bn.c(I)V")
    public final void method749() {
        class303 var1 = this.method764();
        if (this.field657 != var1.field3834 || this.field641 != var1.field3835 || this.field631) {
            this.method827();
            this.field631 = false;
        }
    }

    @ObfuscatedName("bn.aa(I)V")
    public final void method862() {
        this.field631 = true;
    }

    @ObfuscatedName("bn.ax(I)V")
    public final synchronized void method751() {
        if (field654) {
            return;
        }
        field654 = true;
        try {
            this.field649.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method759();
        } catch (Exception var7) {
        }
        if (this.field645 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field655 != null) {
            try {
                Statics.field655.method2868();
            } catch (Exception var5) {
            }
        }
        this.method825();
    }

    @ObfuscatedName("bs.ae(B)V")
    public static final void method981() {
        Statics.field3900.method2834();
        for (int var0 = 0; var0 < 32; var0++) {
            field637[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field639[var1] = 0L;
        }
        Statics.field633 = 0;
    }

    public final void start() {
        if (field628 == this && !field654) {
            field638 = 0L;
        }
    }

    public final void stop() {
        if (field628 == this && !field654) {
            field638 = class187.method35() + 4000L;
        }
    }

    public final void destroy() {
        if (field628 == this && !field654) {
            field638 = class187.method35();
            class193.method4(5000L);
            this.method751();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field628 != this || field654) {
            return;
        }
        this.field650 = true;
        if (class187.method35() - this.field653 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field408 && var2.height >= Statics.field3453) {
                this.field630 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field658 = true;
        this.field650 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field658 = false;
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

    @ObfuscatedName("bn.af(ILjava/lang/String;ZI)V")
    public final void method760(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field649.getGraphics();
            if (Statics.field2922 == null) {
                Statics.field2922 = new Font("Helvetica", 1, 13);
                Statics.field239 = this.field649.getFontMetrics(Statics.field2922);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field408, Statics.field3453);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field2517 == null) {
                    Statics.field2517 = this.field649.createImage(304, 34);
                }
                Graphics var6 = Statics.field2517.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field2922);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field239.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field2517, Statics.field408 / 2 - 152, Statics.field3453 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field408 / 2 - 152;
                int var9 = Statics.field3453 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field2922);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field239.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field649.repaint();
        }
    }

    @ObfuscatedName("bn.an(I)V")
    public final void method761() {
        Statics.field2517 = null;
        Statics.field2922 = null;
        Statics.field239 = null;
    }

    @ObfuscatedName("bn.ag(Ljava/lang/String;I)V")
    public void method762(String arg0) {
        if (this.field632) {
            return;
        }
        this.field632 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bn.av(I)Ljava/awt/Container;")
    public Container method763() {
        return this.field645 == null ? this : this.field645;
    }

    @ObfuscatedName("bn.aw(B)Lkw;")
    public class303 method764() {
        Container var1 = this.method763();
        int var2 = Math.max(var1.getWidth(), this.field644);
        int var3 = Math.max(var1.getHeight(), this.field648);
        if (this.field645 != null) {
            Insets var4 = this.field645.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class303(var2, var3);
    }

    @ObfuscatedName("bn.ad(I)Z")
    public final boolean method765() {
        return this.field645 != null;
    }

    @ObfuscatedName("go.ab(I)I")
    public static int method3402() {
        int var0 = 0;
        if (Statics.field2069 == null || !Statics.field2069.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field2069 = var2;
                        field660 = -1L;
                        field659 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field2069 != null) {
            long var4 = class187.method35();
            long var6 = Statics.field2069.getCollectionTime();
            if (field659 != -1L) {
                long var8 = var6 - field659;
                long var10 = var4 - field660;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field659 = var6;
            field660 = var4;
        }
        return var0;
    }

    @ObfuscatedName("bn.d(B)V")
    public abstract void method741();

    @ObfuscatedName("bn.au(ZI)V")
    public abstract void method745(boolean arg0);

    public abstract void init();

    @ObfuscatedName("bn.ah(I)V")
    public abstract void method756();

    @ObfuscatedName("bn.ai(I)V")
    public abstract void method758();

    @ObfuscatedName("bn.am(I)V")
    public abstract void method759();

    @ObfuscatedName("bn.aq(I)V")
    public abstract void method825();
}
