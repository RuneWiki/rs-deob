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

@ObfuscatedName("ap")
public abstract class class48 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ap.s")
    public static class48 field426 = null;

    @ObfuscatedName("ap.o")
    public static int field415 = 0;

    @ObfuscatedName("ap.k")
    public static long field446 = 0L;

    @ObfuscatedName("ap.u")
    public static boolean field440 = false;

    @ObfuscatedName("ap.i")
    public boolean field418 = false;

    @ObfuscatedName("ap.p")
    public static int field420 = 20;

    @ObfuscatedName("ap.l")
    public static int field421 = 1;

    @ObfuscatedName("ap.b")
    public static int field422 = 0;

    @ObfuscatedName("ap.a")
    public static long[] field423 = new long[32];

    @ObfuscatedName("ap.e")
    public static long[] field416 = new long[32];

    @ObfuscatedName("ap.j")
    public int field435;

    @ObfuscatedName("ap.m")
    public int field427;

    @ObfuscatedName("ap.h")
    public int field414 = 0;

    @ObfuscatedName("ap.f")
    public int field429 = 0;

    @ObfuscatedName("ap.g")
    public int field430;

    @ObfuscatedName("ap.ac")
    public int field431;

    @ObfuscatedName("ap.ab")
    public int field432;

    @ObfuscatedName("ap.ao")
    public int field434;

    @ObfuscatedName("ap.av")
    public Frame field417;

    @ObfuscatedName("ap.af")
    public Canvas field413;

    @ObfuscatedName("ap.ar")
    public volatile boolean field436 = true;

    @ObfuscatedName("ap.aj")
    public static int field437 = 500;

    @ObfuscatedName("ap.aq")
    public boolean field438 = false;

    @ObfuscatedName("ap.ak")
    public volatile boolean field439 = false;

    @ObfuscatedName("ap.ax")
    public volatile long field424 = 0L;

    @ObfuscatedName("ap.ad")
    public class39 field441;

    @ObfuscatedName("ap.ah")
    public Clipboard field442;

    @ObfuscatedName("ap.as")
    public final EventQueue field443;

    @ObfuscatedName("ap.ag")
    public static volatile boolean field444 = true;

    @ObfuscatedName("ap.ap")
    public static long field445 = -1L;

    @ObfuscatedName("ap.ai")
    public static long field433 = -1L;

    public class48() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field443 = var1;
        class98.method1069(new class41());
    }

    @ObfuscatedName("ap.i(IIB)V")
    public final void method731(int arg0, int arg1) {
        if (this.field432 != arg0 || this.field434 != arg1) {
            this.method738();
        }
        this.field432 = arg0;
        this.field434 = arg1;
    }

    @ObfuscatedName("ap.t(Ljava/lang/Object;I)V")
    public final void method722(Object arg0) {
        if (this.field443 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field443.peekEvent() != null; var2++) {
            class194.method668(1L);
        }
        if (arg0 != null) {
            this.field443.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("ap.c(S)Lfy;")
    public class159 method723() {
        if (this.field441 == null) {
            this.field441 = new class39();
            this.field441.method628(this.field413);
        }
        return this.field441;
    }

    @ObfuscatedName("ap.w(I)V")
    public void method840() {
        this.field442 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("ap.a(Ljava/lang/String;I)V")
    public void method725(String arg0) {
        this.field442.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("ap.z(I)V")
    public final void method726() {
        if (Statics.field1998.toLowerCase().indexOf("microsoft") == -1) {
            class40.field374[44] = 71;
            class40.field374[45] = 26;
            class40.field374[46] = 72;
            class40.field374[47] = 73;
            class40.field374[59] = 57;
            class40.field374[61] = 27;
            class40.field374[91] = 42;
            class40.field374[92] = 74;
            class40.field374[93] = 43;
            class40.field374[192] = 28;
            class40.field374[222] = 58;
            class40.field374[520] = 59;
        } else {
            class40.field374[186] = 57;
            class40.field374[187] = 27;
            class40.field374[188] = 71;
            class40.field374[189] = 26;
            class40.field374[190] = 72;
            class40.field374[191] = 73;
            class40.field374[192] = 58;
            class40.field374[219] = 42;
            class40.field374[220] = 74;
            class40.field374[221] = 43;
            class40.field374[222] = 59;
            class40.field374[223] = 28;
        }
        class40.method2948(this.field413);
    }

    @ObfuscatedName("ap.e(I)V")
    public final void method727() {
        class49.method617(this.field413);
    }

    @ObfuscatedName("ap.q(I)V")
    public final void method760() {
        Container var1 = this.method792();
        if (var1 == null) {
            return;
        }
        class314 var2 = this.method752();
        this.field435 = Math.max(var2.field3783, this.field430);
        this.field427 = Math.max(var2.field3784, this.field431);
        if (this.field435 <= 0) {
            this.field435 = 1;
        }
        if (this.field427 <= 0) {
            this.field427 = 1;
        }
        Statics.field2428 = Math.min(this.field435, this.field432);
        Statics.field117 = Math.min(this.field427, this.field434);
        this.field414 = (this.field435 - Statics.field2428) / 2;
        this.field429 = 0;
        this.field413.setSize(Statics.field2428, Statics.field117);
        Statics.field195 = new class47(Statics.field2428, Statics.field117, this.field413);
        if (this.field417 == var1) {
            Insets var3 = this.field417.getInsets();
            this.field413.setLocation(this.field414 + var3.left, this.field429 + var3.top);
        } else {
            this.field413.setLocation(this.field414, this.field429);
        }
        this.field436 = true;
        this.method729();
    }

    @ObfuscatedName("ap.f(I)V")
    public void method730() {
        int var1 = this.field414;
        int var2 = this.field429;
        int var3 = this.field435 - Statics.field2428 - var1;
        int var4 = this.field427 - Statics.field117 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method792();
            int var6 = 0;
            int var7 = 0;
            if (this.field417 == var5) {
                Insets var8 = this.field417.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field427);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field435, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field435 + var6 - var3, var7, var3, this.field427);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field427 + var7 - var4, this.field435, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("ap.r(I)V")
    public final void method744() {
        Canvas var1 = this.field413;
        var1.removeKeyListener(class40.field376);
        var1.removeFocusListener(class40.field376);
        class40.field365 = -1;
        class49.method2376(this.field413);
        if (this.field441 != null) {
            this.field441.method627(this.field413);
        }
        this.method802();
        class40.method2948(this.field413);
        class49.method617(this.field413);
        if (this.field441 != null) {
            this.field441.method628(this.field413);
        }
        this.method738();
    }

    @ObfuscatedName("ap.n(IIIB)V")
    public final void method838(int arg0, int arg1, int arg2) {
        try {
            if (field426 != null) {
                field415++;
                if (field415 >= 3) {
                    this.method837("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field426 = this;
            Statics.field2428 = arg0;
            Statics.field117 = arg1;
            Statics.field1982 = arg2;
            Statics.field1984 = this;
            if (Statics.field425 == null) {
                Statics.field425 = new class157();
            }
            Statics.field425.method3004(this, 1);
        } catch (Exception var5) {
            class155.method2337((String) null, var5);
            this.method837("crash");
        }
    }

    @ObfuscatedName("ap.g(I)V")
    public final synchronized void method802() {
        Container var1 = this.method792();
        if (this.field413 != null) {
            this.field413.removeFocusListener(this);
            var1.remove(this.field413);
        }
        Statics.field2428 = Math.max(var1.getWidth(), this.field430);
        Statics.field117 = Math.max(var1.getHeight(), this.field431);
        if (this.field417 != null) {
            Insets var2 = this.field417.getInsets();
            Statics.field2428 -= var2.right + var2.left;
            Statics.field117 -= var2.top + var2.bottom;
        }
        this.field413 = new class43(this);
        var1.add(this.field413);
        this.field413.setSize(Statics.field2428, Statics.field117);
        this.field413.setVisible(true);
        this.field413.setBackground(Color.BLACK);
        if (this.field417 == var1) {
            Insets var3 = this.field417.getInsets();
            this.field413.setLocation(this.field414 + var3.left, this.field429 + var3.top);
        } else {
            this.field413.setLocation(this.field414, this.field429);
        }
        this.field413.addFocusListener(this);
        this.field413.requestFocus();
        this.field436 = true;
        if (Statics.field195 != null && Statics.field2428 == Statics.field195.field3805 && Statics.field117 == Statics.field195.field3807) {
            ((class47) Statics.field195).method701(this.field413);
            Statics.field195.method700(0, 0);
        } else {
            Statics.field195 = new class47(Statics.field2428, Statics.field117, this.field413);
        }
        this.field439 = false;
        this.field424 = class187.method3154();
    }

    @ObfuscatedName("ap.ab(I)Z")
    public final boolean method749() {
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
                this.method837("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1998 != null) {
                String var1 = Statics.field1998.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1920;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method837("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && Statics.method3887(var2.charAt(var3)); var3++) {
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
                            int var14 = class308.method2351(var4, 10, true);
                            if (var14 < 10) {
                                this.method837("wrongjava");
                                return;
                            }
                        }
                    }
                    field421 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method802();
            this.method721();
            class163 var15;
            try {
                var15 = new class152();
            } catch (Throwable var19) {
                var15 = new class153();
            }
            Statics.field2291 = var15;
            while (field446 == 0L || class187.method3154() < field446) {
                Statics.field419 = Statics.field2291.method2960(field420, field421);
                for (int var17 = 0; var17 < Statics.field419; var17++) {
                    this.method724();
                }
                this.method736();
                this.method722(this.field413);
            }
        } catch (Exception var20) {
            class155.method2337((String) null, var20);
            this.method837("crash");
        }
        this.method739();
    }

    @ObfuscatedName("ap.ao(I)V")
    public void method724() {
        long var1 = class187.method3154();
        long var3 = field416[Statics.field60];
        field416[Statics.field60] = var1;
        Statics.field60 = Statics.field60 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field121 = field444;
        }
        this.method732();
    }

    @ObfuscatedName("ap.an(I)V")
    public void method736() {
        Container var1 = this.method792();
        long var2 = class187.method3154();
        long var4 = field423[Statics.field428];
        field423[Statics.field428] = var2;
        Statics.field428 = Statics.field428 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field422 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field437 - 1 > 50) {
            field437 -= 50;
            this.field436 = true;
            this.field413.setSize(Statics.field2428, Statics.field117);
            this.field413.setVisible(true);
            if (this.field417 == var1) {
                Insets var7 = this.field417.getInsets();
                this.field413.setLocation(this.field414 + var7.left, this.field429 + var7.top);
            } else {
                this.field413.setLocation(this.field414, this.field429);
            }
        }
        if (this.field439) {
            this.method744();
        }
        this.method733();
        this.method803(this.field436);
        if (this.field436) {
            this.method730();
        }
        this.field436 = false;
    }

    @ObfuscatedName("ap.ay(B)V")
    public final void method733() {
        class314 var1 = this.method752();
        if (this.field435 != var1.field3783 || this.field427 != var1.field3784 || this.field438) {
            this.method760();
            this.field438 = false;
        }
    }

    @ObfuscatedName("ap.av(I)V")
    public final void method738() {
        this.field438 = true;
    }

    @ObfuscatedName("ap.af(B)V")
    public final synchronized void method739() {
        if (field440) {
            return;
        }
        field440 = true;
        try {
            this.field413.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method747();
        } catch (Exception var7) {
        }
        if (this.field417 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field425 != null) {
            try {
                Statics.field425.method3000();
            } catch (Exception var5) {
            }
        }
        this.method847();
    }

    @ObfuscatedName("o.ar(I)V")
    public static final void method22() {
        Statics.field2291.method2959();
        for (int var0 = 0; var0 < 32; var0++) {
            field423[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field416[var1] = 0L;
        }
        Statics.field419 = 0;
    }

    public final void start() {
        if (field426 == this && !field440) {
            field446 = 0L;
        }
    }

    public final void stop() {
        if (field426 == this && !field440) {
            field446 = class187.method3154() + 4000L;
        }
    }

    public final void destroy() {
        if (field426 == this && !field440) {
            field446 = class187.method3154();
            class194.method668(5000L);
            this.method739();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field426 != this || field440) {
            return;
        }
        this.field436 = true;
        if (class187.method3154() - this.field424 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field2428 && var2.height >= Statics.field117) {
                this.field439 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field444 = true;
        this.field436 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field444 = false;
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

    @ObfuscatedName("ap.ax(ILjava/lang/String;ZI)V")
    public final void method748(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field413.getGraphics();
            if (Statics.field3259 == null) {
                Statics.field3259 = new Font("Helvetica", 1, 13);
                Statics.field3179 = this.field413.getFontMetrics(Statics.field3259);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field2428, Statics.field117);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field3661 == null) {
                    Statics.field3661 = this.field413.createImage(304, 34);
                }
                Graphics var6 = Statics.field3661.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field3259);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field3179.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field3661, Statics.field2428 / 2 - 152, Statics.field117 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field2428 / 2 - 152;
                int var9 = Statics.field117 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field3259);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field3179.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field413.repaint();
        }
    }

    @ObfuscatedName("ap.aw(I)V")
    public final void method818() {
        Statics.field3661 = null;
        Statics.field3259 = null;
        Statics.field3179 = null;
    }

    @ObfuscatedName("ap.au(Ljava/lang/String;I)V")
    public void method837(String arg0) {
        if (this.field418) {
            return;
        }
        this.field418 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ap.ad(B)Ljava/awt/Container;")
    public Container method792() {
        return this.field417 == null ? this : this.field417;
    }

    @ObfuscatedName("ap.ah(I)Llw;")
    public class314 method752() {
        Container var1 = this.method792();
        int var2 = Math.max(var1.getWidth(), this.field430);
        int var3 = Math.max(var1.getHeight(), this.field431);
        if (this.field417 != null) {
            Insets var4 = this.field417.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class314(var2, var3);
    }

    @ObfuscatedName("ap.as(B)Z")
    public final boolean method753() {
        return this.field417 != null;
    }

    @ObfuscatedName("ap.am(I)V")
    public abstract void method721();

    @ObfuscatedName("ap.j(S)V")
    public abstract void method729();

    @ObfuscatedName("ap.aj(I)V")
    public abstract void method732();

    public abstract void init();

    @ObfuscatedName("ap.ak(I)V")
    public abstract void method747();

    @ObfuscatedName("ap.aq(ZB)V")
    public abstract void method803(boolean arg0);

    @ObfuscatedName("ap.ag(I)V")
    public abstract void method847();
}
