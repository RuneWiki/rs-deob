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
import java.net.URL;

@ObfuscatedName("aa")
public abstract class class48 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("aa.q")
    public static class48 field392 = null;

    @ObfuscatedName("aa.b")
    public static int field383 = 0;

    @ObfuscatedName("aa.f")
    public static long field384 = 0L;

    @ObfuscatedName("aa.n")
    public static boolean field385 = false;

    @ObfuscatedName("aa.h")
    public boolean field386 = false;

    @ObfuscatedName("aa.a")
    public static int field387 = 20;

    @ObfuscatedName("aa.l")
    public static int field388 = 1;

    @ObfuscatedName("aa.d")
    public static int field389 = 0;

    @ObfuscatedName("aa.g")
    public static long[] field391 = new long[32];

    @ObfuscatedName("aa.e")
    public static long[] field398 = new long[32];

    @ObfuscatedName("aa.u")
    public int field394;

    @ObfuscatedName("aa.i")
    public int field416;

    @ObfuscatedName("aa.z")
    public int field396 = 0;

    @ObfuscatedName("aa.k")
    public int field397 = 0;

    @ObfuscatedName("aa.o")
    public int field393;

    @ObfuscatedName("aa.ai")
    public int field399;

    @ObfuscatedName("aa.at")
    public int field406;

    @ObfuscatedName("aa.ad")
    public int field408;

    @ObfuscatedName("aa.an")
    public Frame field402;

    @ObfuscatedName("aa.as")
    public Canvas field403;

    @ObfuscatedName("aa.aw")
    public volatile boolean field404 = true;

    @ObfuscatedName("aa.ah")
    public static int field401 = 500;

    @ObfuscatedName("aa.az")
    public boolean field382 = false;

    @ObfuscatedName("aa.ao")
    public volatile boolean field407 = false;

    @ObfuscatedName("aa.ap")
    public volatile long field395 = 0L;

    @ObfuscatedName("aa.aq")
    public class39 field409;

    @ObfuscatedName("aa.aj")
    public Clipboard field412;

    @ObfuscatedName("aa.ae")
    public final EventQueue field411;

    @ObfuscatedName("aa.au")
    public static volatile boolean field400 = true;

    @ObfuscatedName("aa.aa")
    public static long field413 = -1L;

    @ObfuscatedName("aa.ar")
    public static long field381 = -1L;

    public class48() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field411 = var1;
        class96.method4228(new class41());
    }

    @ObfuscatedName("aa.d(IIB)V")
    public final void method805(int arg0, int arg1) {
        if (this.field406 != arg0 || this.field408 != arg1) {
            this.method745();
        }
        this.field406 = arg0;
        this.field408 = arg1;
    }

    @ObfuscatedName("aa.s(Ljava/lang/Object;I)V")
    public final void method753(Object arg0) {
        if (this.field411 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field411.peekEvent() != null; var2++) {
            class192.method196(1L);
        }
        if (arg0 != null) {
            this.field411.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("aa.p(B)Lfp;")
    public class157 method747() {
        if (this.field409 == null) {
            this.field409 = new class39();
            this.field409.method632(this.field403);
        }
        return this.field409;
    }

    @ObfuscatedName("aa.g(I)V")
    public void method748() {
        this.field412 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("aa.y(Ljava/lang/String;I)V")
    public void method838(String arg0) {
        this.field412.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("aa.c(I)V")
    public final void method882() {
        class40.method4553();
        Canvas var1 = this.field403;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class40.field351);
        var1.addFocusListener(class40.field351);
    }

    @ObfuscatedName("aa.e(S)V")
    public final void method746() {
        Canvas var1 = this.field403;
        var1.addMouseListener(class49.field420);
        var1.addMouseMotionListener(class49.field420);
        var1.addFocusListener(class49.field420);
    }

    @ObfuscatedName("aa.t(I)V")
    public final void method797() {
        Container var1 = this.method765();
        if (var1 == null) {
            return;
        }
        class311 var2 = this.method769();
        this.field394 = Math.max(var2.field3751, this.field393);
        this.field416 = Math.max(var2.field3752, this.field399);
        if (this.field394 <= 0) {
            this.field394 = 1;
        }
        if (this.field416 <= 0) {
            this.field416 = 1;
        }
        Statics.field71 = Math.min(this.field394, this.field406);
        Statics.field327 = Math.min(this.field416, this.field408);
        this.field396 = (this.field394 - Statics.field71) / 2;
        this.field397 = 0;
        this.field403.setSize(Statics.field71, Statics.field327);
        Statics.field456 = new class47(Statics.field71, Statics.field327, this.field403);
        if (this.field402 == var1) {
            Insets var3 = this.field402.getInsets();
            this.field403.setLocation(this.field396 + var3.left, this.field397 + var3.top);
        } else {
            this.field403.setLocation(this.field396, this.field397);
        }
        this.field404 = true;
        this.method781();
    }

    @ObfuscatedName("aa.i(I)V")
    public void method754() {
        int var1 = this.field396;
        int var2 = this.field397;
        int var3 = this.field394 - Statics.field71 - var1;
        int var4 = this.field416 - Statics.field327 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method765();
            int var6 = 0;
            int var7 = 0;
            if (this.field402 == var5) {
                Insets var8 = this.field402.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field416);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field394, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field394 + var6 - var3, var7, var3, this.field416);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field416 + var7 - var4, this.field394, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("aa.r(I)V")
    public final void method768() {
        class40.method54(this.field403);
        Canvas var1 = this.field403;
        var1.removeMouseListener(class49.field420);
        var1.removeMouseMotionListener(class49.field420);
        var1.removeFocusListener(class49.field420);
        class49.field421 = 0;
        if (this.field409 != null) {
            this.field409.method631(this.field403);
        }
        this.method757();
        Canvas var2 = this.field403;
        var2.setFocusTraversalKeysEnabled(false);
        var2.addKeyListener(class40.field351);
        var2.addFocusListener(class40.field351);
        Canvas var3 = this.field403;
        var3.addMouseListener(class49.field420);
        var3.addMouseMotionListener(class49.field420);
        var3.addFocusListener(class49.field420);
        if (this.field409 != null) {
            this.field409.method632(this.field403);
        }
        this.method745();
    }

    @ObfuscatedName("aa.v(IIIB)V")
    public final void method756(int arg0, int arg1, int arg2) {
        try {
            if (field392 != null) {
                field383++;
                if (field383 >= 3) {
                    this.method776("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field392 = this;
            Statics.field71 = arg0;
            Statics.field327 = arg1;
            Statics.field486 = arg2;
            Statics.field1958 = this;
            if (Statics.field410 == null) {
                Statics.field410 = new class155();
            }
            Statics.field410.method3011(this, 1);
        } catch (Exception var5) {
            class153.method695((String) null, var5);
            this.method776("crash");
        }
    }

    @ObfuscatedName("aa.o(I)V")
    public final synchronized void method757() {
        Container var1 = this.method765();
        if (this.field403 != null) {
            this.field403.removeFocusListener(this);
            var1.remove(this.field403);
        }
        Statics.field71 = Math.max(var1.getWidth(), this.field393);
        Statics.field327 = Math.max(var1.getHeight(), this.field399);
        if (this.field402 != null) {
            Insets var2 = this.field402.getInsets();
            Statics.field71 -= var2.right + var2.left;
            Statics.field327 -= var2.top + var2.bottom;
        }
        this.field403 = new class43(this);
        var1.add(this.field403);
        this.field403.setSize(Statics.field71, Statics.field327);
        this.field403.setVisible(true);
        this.field403.setBackground(Color.BLACK);
        if (this.field402 == var1) {
            Insets var3 = this.field402.getInsets();
            this.field403.setLocation(this.field396 + var3.left, this.field397 + var3.top);
        } else {
            this.field403.setLocation(this.field396, this.field397);
        }
        this.field403.addFocusListener(this);
        this.field403.requestFocus();
        this.field404 = true;
        if (Statics.field456 != null && Statics.field71 == Statics.field456.field3775 && Statics.field327 == Statics.field456.field3776) {
            ((class47) Statics.field456).method741(this.field403);
            Statics.field456.method731(0, 0);
        } else {
            Statics.field456 = new class47(Statics.field71, Statics.field327, this.field403);
        }
        this.field407 = false;
        this.field395 = class185.method3151();
    }

    @ObfuscatedName("aa.ai(I)Z")
    public final boolean method758() {
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
                this.method776("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1973 != null) {
                String var1 = Statics.field1973.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1972;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method776("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class306.method3524(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        boolean var5 = false;
                        boolean var6 = false;
                        int var7 = 0;
                        int var8 = var4.length();
                        int var9 = 0;
                        boolean var11;
                        while (true) {
                            if (var9 >= var8) {
                                var11 = var6;
                                break;
                            }
                            label171: {
                                char var10 = var4.charAt(var9);
                                if (var9 == 0) {
                                    if (var10 == '-') {
                                        var5 = true;
                                        break label171;
                                    }
                                    if (var10 == '+') {
                                        break label171;
                                    }
                                }
                                int var21;
                                if (var10 >= '0' && var10 <= '9') {
                                    var21 = var10 - '0';
                                } else if (var10 >= 'A' && var10 <= 'Z') {
                                    var21 = var10 - '7';
                                } else {
                                    if (var10 < 'a' || var10 > 'z') {
                                        var11 = false;
                                        break;
                                    }
                                    var21 = var10 - 'W';
                                }
                                if (var21 >= 10) {
                                    var11 = false;
                                    break;
                                }
                                if (var5) {
                                    var21 = -var21;
                                }
                                int var12 = var7 * 10 + var21;
                                if (var12 / 10 != var7) {
                                    var11 = false;
                                    break;
                                }
                                var7 = var12;
                                var6 = true;
                            }
                            var9++;
                        }
                        if (var11) {
                            int var14 = class306.method14(var4, 10, true);
                            if (var14 < 10) {
                                this.method776("wrongjava");
                                return;
                            }
                        }
                    }
                    field388 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method757();
            this.method770();
            class161 var15;
            try {
                var15 = new class150();
            } catch (Throwable var19) {
                var15 = new class151();
            }
            Statics.field390 = var15;
            while (field384 == 0L || class185.method3151() < field384) {
                Statics.field3646 = Statics.field390.method2974(field387, field388);
                for (int var17 = 0; var17 < Statics.field3646; var17++) {
                    this.method760();
                }
                this.method823();
                this.method753(this.field403);
            }
        } catch (Exception var20) {
            class153.method695((String) null, var20);
            this.method776("crash");
        }
        this.method764();
    }

    @ObfuscatedName("aa.at(I)V")
    public void method760() {
        long var1 = class185.method3151();
        long var3 = field398[Statics.field414];
        field398[Statics.field414] = var1;
        Statics.field414 = Statics.field414 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field979 = field400;
        }
        this.method771();
    }

    @ObfuscatedName("aa.ad(I)V")
    public void method823() {
        Container var1 = this.method765();
        long var2 = class185.method3151();
        long var4 = field391[Statics.field36];
        field391[Statics.field36] = var2;
        Statics.field36 = Statics.field36 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field389 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field401 - 1 > 50) {
            field401 -= 50;
            this.field404 = true;
            this.field403.setSize(Statics.field71, Statics.field327);
            this.field403.setVisible(true);
            if (this.field402 == var1) {
                Insets var7 = this.field402.getInsets();
                this.field403.setLocation(this.field396 + var7.left, this.field397 + var7.top);
            } else {
                this.field403.setLocation(this.field396, this.field397);
            }
        }
        if (this.field407) {
            this.method768();
        }
        this.method762();
        this.method772(this.field404);
        if (this.field404) {
            this.method754();
        }
        this.field404 = false;
    }

    @ObfuscatedName("aa.ac(I)V")
    public final void method762() {
        class311 var1 = this.method769();
        if (this.field394 != var1.field3751 || this.field416 != var1.field3752 || this.field382) {
            this.method797();
            this.field382 = false;
        }
    }

    @ObfuscatedName("aa.aw(I)V")
    public final void method745() {
        this.field382 = true;
    }

    @ObfuscatedName("aa.ag(I)V")
    public final synchronized void method764() {
        if (field385) {
            return;
        }
        field385 = true;
        try {
            this.field403.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method773();
        } catch (Exception var7) {
        }
        if (this.field402 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field410 != null) {
            try {
                Statics.field410.method3000();
            } catch (Exception var5) {
            }
        }
        this.method780();
    }

    @ObfuscatedName("dw.ah(B)V")
    public static final void method2366() {
        Statics.field390.method2972();
        for (int var0 = 0; var0 < 32; var0++) {
            field391[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field398[var1] = 0L;
        }
        Statics.field3646 = 0;
    }

    public final void start() {
        if (field392 == this && !field385) {
            field384 = 0L;
        }
    }

    public final void stop() {
        if (field392 == this && !field385) {
            field384 = class185.method3151() + 4000L;
        }
    }

    public final void destroy() {
        if (field392 == this && !field385) {
            field384 = class185.method3151();
            class192.method196(5000L);
            this.method764();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field392 != this || field385) {
            return;
        }
        this.field404 = true;
        if (class185.method3151() - this.field395 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field71 && var2.height >= Statics.field327) {
                this.field407 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field400 = true;
        this.field404 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field400 = false;
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

    @ObfuscatedName("aa.am(ILjava/lang/String;ZI)V")
    public final void method807(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field403.getGraphics();
            if (Statics.field1456 == null) {
                Statics.field1456 = new Font("Helvetica", 1, 13);
                Statics.field323 = this.field403.getFontMetrics(Statics.field1456);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field71, Statics.field327);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field2800 == null) {
                    Statics.field2800 = this.field403.createImage(304, 34);
                }
                Graphics var6 = Statics.field2800.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field1456);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field323.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field2800, Statics.field71 / 2 - 152, Statics.field327 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field71 / 2 - 152;
                int var9 = Statics.field327 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1456);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field323.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field403.repaint();
        }
    }

    @ObfuscatedName("aa.aq(I)V")
    public final void method775() {
        Statics.field2800 = null;
        Statics.field1456 = null;
        Statics.field323 = null;
    }

    @ObfuscatedName("aa.aj(Ljava/lang/String;S)V")
    public void method776(String arg0) {
        if (this.field386) {
            return;
        }
        this.field386 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("aa.ae(I)Ljava/awt/Container;")
    public Container method765() {
        return this.field402 == null ? this : this.field402;
    }

    @ObfuscatedName("aa.au(I)Lka;")
    public class311 method769() {
        Container var1 = this.method765();
        int var2 = Math.max(var1.getWidth(), this.field393);
        int var3 = Math.max(var1.getHeight(), this.field399);
        if (this.field402 != null) {
            Insets var4 = this.field402.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class311(var2, var3);
    }

    @ObfuscatedName("aa.av(I)Z")
    public final boolean method888() {
        return this.field402 != null;
    }

    @ObfuscatedName("aa.az(I)V")
    public abstract void method770();

    @ObfuscatedName("aa.ao(I)V")
    public abstract void method771();

    @ObfuscatedName("aa.ap(ZI)V")
    public abstract void method772(boolean arg0);

    @ObfuscatedName("aa.af(I)V")
    public abstract void method773();

    @ObfuscatedName("aa.ab(I)V")
    public abstract void method780();

    @ObfuscatedName("aa.u(B)V")
    public abstract void method781();

    public abstract void init();
}
