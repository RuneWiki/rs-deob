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

@ObfuscatedName("bm")
public abstract class class35 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bm.aw")
    public static class35 field209 = null;

    @ObfuscatedName("bm.al")
    public static int field183 = 0;

    @ObfuscatedName("bm.ai")
    public static long field181 = 0L;

    @ObfuscatedName("bm.ar")
    public static boolean field192 = false;

    @ObfuscatedName("bm.as")
    public boolean field185 = false;

    @ObfuscatedName("bm.az")
    public static int field186 = 20;

    @ObfuscatedName("bm.ao")
    public static int field187 = 1;

    @ObfuscatedName("bm.au")
    public static int field188 = 0;

    @ObfuscatedName("bm.aj")
    public static long[] field212 = new long[32];

    @ObfuscatedName("bm.ax")
    public static long[] field191 = new long[32];

    @ObfuscatedName("bm.ag")
    public int field215;

    @ObfuscatedName("bm.am")
    public int field193;

    @ObfuscatedName("bm.ad")
    public int field194 = 0;

    @ObfuscatedName("bm.at")
    public int field195 = 0;

    @ObfuscatedName("bm.ac")
    public int field197;

    @ObfuscatedName("bm.ab")
    public int field198;

    @ObfuscatedName("bm.av")
    public int field180;

    @ObfuscatedName("bm.ap")
    public int field200;

    @ObfuscatedName("bm.bu")
    public boolean field201 = false;

    @ObfuscatedName("bm.bi")
    public Frame field202;

    @ObfuscatedName("bm.bq")
    public Canvas field203;

    @ObfuscatedName("bm.ba")
    public volatile boolean field206 = true;

    @ObfuscatedName("bm.bk")
    public static int field205 = 500;

    @ObfuscatedName("bm.bm")
    public boolean field196 = false;

    @ObfuscatedName("bm.bw")
    public volatile boolean field207 = false;

    @ObfuscatedName("bm.bv")
    public volatile long field208 = 0L;

    @ObfuscatedName("bm.bn")
    public class22 field182;

    @ObfuscatedName("bm.br")
    public Clipboard field210;

    @ObfuscatedName("bm.bp")
    public final EventQueue field190;

    @ObfuscatedName("bm.bf")
    public static volatile boolean field184 = true;

    @ObfuscatedName("bm.be")
    public static class26 field213 = new class26();

    @ObfuscatedName("bm.bz")
    public static long field214 = -1L;

    @ObfuscatedName("bm.bh")
    public static long field204 = -1L;

    public class35() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field190 = var1;
        class23 var3 = new class23();
        Statics.field172 = var3;
    }

    @ObfuscatedName("bm.aa(IIB)V")
    public final void method451(int arg0, int arg1) {
        if (this.field180 != arg0 || this.field200 != arg1) {
            this.method472();
        }
        this.field180 = arg0;
        this.field200 = arg1;
    }

    @ObfuscatedName("bm.az(Ljava/lang/Object;I)V")
    public final void method452(Object arg0) {
        if (this.field190 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field190.peekEvent() != null; var2++) {
            class319.method3040(1L);
        }
        if (arg0 != null) {
            this.field190.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bm.ao(I)Lij;")
    public class216 method453() {
        if (this.field182 == null) {
            this.field182 = new class22();
            this.field182.method273(this.field203);
        }
        return this.field182;
    }

    @ObfuscatedName("bm.au(I)V")
    public void method454() {
        this.field210 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bm.ak(Ljava/lang/String;I)V")
    public void method458(String arg0) {
        this.field210.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bm.ah(I)Ljava/awt/datatransfer/Clipboard;")
    public Clipboard method455() {
        return this.field210;
    }

    @ObfuscatedName("bm.aj(B)V")
    public final void method468() {
        if (Statics.field4466.toLowerCase().indexOf("microsoft") == -1) {
            class29.field148[44] = 71;
            class29.field148[45] = 26;
            class29.field148[46] = 72;
            class29.field148[47] = 73;
            class29.field148[59] = 57;
            class29.field148[61] = 27;
            class29.field148[91] = 42;
            class29.field148[92] = 74;
            class29.field148[93] = 43;
            class29.field148[192] = 28;
            class29.field148[222] = 58;
            class29.field148[520] = 59;
        } else {
            class29.field148[186] = 57;
            class29.field148[187] = 27;
            class29.field148[188] = 71;
            class29.field148[189] = 26;
            class29.field148[190] = 72;
            class29.field148[191] = 73;
            class29.field148[192] = 58;
            class29.field148[219] = 42;
            class29.field148[220] = 74;
            class29.field148[221] = 43;
            class29.field148[222] = 59;
            class29.field148[223] = 28;
        }
        field213.method319(this.field203);
    }

    @ObfuscatedName("qq.af(I)I")
    public static final int method7354() {
        return field213.method318();
    }

    @ObfuscatedName("bm.ax(I)V")
    public final void method527() {
        field213.method321();
    }

    @ObfuscatedName("bm.an(Lbi;II)V")
    public void method541(class30 arg0, int arg1) {
        field213.method332(arg0, arg1);
    }

    @ObfuscatedName("bm.ag(I)V")
    public final void method480() {
        Canvas var1 = this.field203;
        var1.addMouseListener(class36.field219);
        var1.addMouseMotionListener(class36.field219);
        var1.addFocusListener(class36.field219);
    }

    @ObfuscatedName("bm.am(I)V")
    public final void method559() {
        Container var1 = this.method462();
        if (var1 == null) {
            return;
        }
        class465 var2 = this.method488();
        this.field215 = Math.max(var2.field4826, this.field197);
        this.field193 = Math.max(var2.field4824, this.field198);
        if (this.field215 <= 0) {
            this.field215 = 1;
        }
        if (this.field193 <= 0) {
            this.field193 = 1;
        }
        Statics.field199 = Math.min(this.field215, this.field180);
        Statics.field2531 = Math.min(this.field193, this.field200);
        this.field194 = (this.field215 - Statics.field199) / 2;
        this.field195 = 0;
        this.field203.setSize(Statics.field199, Statics.field2531);
        Statics.field1455 = new class33(Statics.field199, Statics.field2531, this.field203, this.field201);
        if (this.field202 == var1) {
            Insets var3 = this.field202.getInsets();
            this.field203.setLocation(this.field194 + var3.left, this.field195 + var3.top);
        } else {
            this.field203.setLocation(this.field194, this.field195);
        }
        this.field206 = true;
        this.method461();
    }

    @ObfuscatedName("bm.at(I)V")
    public void method459() {
        int var1 = this.field194;
        int var2 = this.field195;
        int var3 = this.field215 - Statics.field199 - var1;
        int var4 = this.field193 - Statics.field2531 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method462();
            int var6 = 0;
            int var7 = 0;
            if (this.field202 == var5) {
                Insets var8 = this.field202.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field193);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field215, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field215 + var6 - var3, var7, var3, this.field193);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field193 + var7 - var4, this.field215, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bm.ay(I)V")
    public final void method463() {
        field213.method320(this.field203);
        Canvas var1 = this.field203;
        var1.removeMouseListener(class36.field219);
        var1.removeMouseMotionListener(class36.field219);
        var1.removeFocusListener(class36.field219);
        class36.field236 = 0;
        if (this.field182 != null) {
            this.field182.method269(this.field203);
        }
        this.method560();
        field213.method319(this.field203);
        Canvas var2 = this.field203;
        var2.addMouseListener(class36.field219);
        var2.addMouseMotionListener(class36.field219);
        var2.addFocusListener(class36.field219);
        if (this.field182 != null) {
            this.field182.method273(this.field203);
        }
        this.method472();
    }

    @ObfuscatedName("bm.ae(IIIIB)V")
    public final void method465(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (field209 != null) {
                field183++;
                if (field183 >= 3) {
                    this.method486("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field209 = this;
            Statics.field199 = arg0;
            Statics.field2531 = arg1;
            Statics.field5369 = arg2;
            Statics.field5367 = arg3;
            Statics.field5366 = this;
            if (Statics.field217 == null) {
                Statics.field217 = new class213();
            }
            Statics.field217.method3858(this, 1);
        } catch (Exception var6) {
            Statics.method5453((String) null, var6);
            this.method486("crash");
        }
    }

    @ObfuscatedName("bm.ac(I)V")
    public final synchronized void method560() {
        Container var1 = this.method462();
        if (this.field203 != null) {
            this.field203.removeFocusListener(this);
            var1.remove(this.field203);
        }
        Statics.field199 = Math.max(var1.getWidth(), this.field197);
        Statics.field2531 = Math.max(var1.getHeight(), this.field198);
        if (this.field202 != null) {
            Insets var2 = this.field202.getInsets();
            Statics.field199 -= var2.right + var2.left;
            Statics.field2531 -= var2.top + var2.bottom;
        }
        this.field203 = new class24(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field203);
        this.field203.setSize(Statics.field199, Statics.field2531);
        this.field203.setVisible(true);
        this.field203.setBackground(Color.BLACK);
        if (this.field202 == var1) {
            Insets var3 = this.field202.getInsets();
            this.field203.setLocation(this.field194 + var3.left, this.field195 + var3.top);
        } else {
            this.field203.setLocation(this.field194, this.field195);
        }
        this.field203.addFocusListener(this);
        this.field203.requestFocus();
        this.field206 = true;
        if (Statics.field1455 != null && Statics.field199 == Statics.field1455.field5279 && Statics.field2531 == Statics.field1455.field5280) {
            ((class33) Statics.field1455).method438(this.field203);
            Statics.field1455.method428(0, 0);
        } else {
            Statics.field1455 = new class33(Statics.field199, Statics.field2531, this.field203, this.field201);
        }
        this.field207 = false;
        this.field208 = class318.method2218();
    }

    @ObfuscatedName("bm.ab(ZB)V")
    public void method466(boolean arg0) {
        if (this.field201 != arg0) {
            this.field201 = arg0;
            Statics.field1455.method8972(arg0);
            Statics.field1455.method8970();
        }
    }

    @ObfuscatedName("bm.av(I)Z")
    public final boolean method467() {
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
                this.method486("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field4466 != null) {
                String var1 = Statics.field4466.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2317;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method486("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class406.method4207(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class406.method5371(var4) && class406.method2922(var4) < 10) {
                            this.method486("wrongjava");
                            return;
                        }
                    }
                    field187 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method560();
            this.method481();
            Statics.field55 = class226.method3890();
            while (field181 == 0L || class318.method2218() < field181) {
                Statics.field4972 = Statics.field55.method3777(field186, field187);
                for (int var5 = 0; var5 < Statics.field4972; var5++) {
                    this.method469();
                }
                this.method470();
                this.method452(this.field203);
            }
        } catch (Exception var7) {
            Statics.method5453((String) null, var7);
            this.method486("crash");
        }
        this.method602();
    }

    @ObfuscatedName("bm.ap(I)V")
    public void method469() {
        long var1 = class318.method2218();
        long var3 = field191[Statics.field3168];
        field191[Statics.field3168] = var1;
        Statics.field3168 = Statics.field3168 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field4621 = field184;
        }
        this.method479();
    }

    @ObfuscatedName("bm.bu(I)V")
    public final void method485() {
        this.field206 = true;
    }

    @ObfuscatedName("bm.bo(I)V")
    public void method470() {
        Container var1 = this.method462();
        long var2 = class318.method2218();
        long var4 = field212[Statics.field1797];
        field212[Statics.field1797] = var2;
        Statics.field1797 = Statics.field1797 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field188 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field205 - 1 > 50) {
            field205 -= 50;
            this.field206 = true;
            this.field203.setSize(Statics.field199, Statics.field2531);
            this.field203.setVisible(true);
            if (this.field202 == var1) {
                Insets var7 = this.field202.getInsets();
                this.field203.setLocation(this.field194 + var7.left, this.field195 + var7.top);
            } else {
                this.field203.setLocation(this.field194, this.field195);
            }
        }
        if (this.field207) {
            this.method463();
        }
        this.method471();
        this.method483(this.field206);
        if (this.field206) {
            this.method459();
        }
        this.field206 = false;
    }

    @ObfuscatedName("bm.bd(I)V")
    public final void method471() {
        class465 var1 = this.method488();
        if (this.field215 != var1.field4826 || this.field193 != var1.field4824 || this.field196) {
            this.method559();
            this.field196 = false;
        }
    }

    @ObfuscatedName("bm.bm(I)V")
    public final void method472() {
        this.field196 = true;
    }

    @ObfuscatedName("bm.bw(B)V")
    public final synchronized void method602() {
        if (field192) {
            return;
        }
        field192 = true;
        try {
            this.field203.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method484();
        } catch (Exception var7) {
        }
        if (this.field202 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field217 != null) {
            try {
                Statics.field217.method3857();
            } catch (Exception var5) {
            }
        }
        this.method490();
    }

    @ObfuscatedName("mt.bv(B)V")
    public static final void method5539() {
        Statics.field55.method3776();
        for (int var0 = 0; var0 < 32; var0++) {
            field212[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field191[var1] = 0L;
        }
        Statics.field4972 = 0;
    }

    public final void start() {
        if (field209 == this && !field192) {
            field181 = 0L;
        }
    }

    public final void stop() {
        if (field209 == this && !field192) {
            field181 = class318.method2218() + 4000L;
        }
    }

    public final void destroy() {
        if (field209 == this && !field192) {
            field181 = class318.method2218();
            class319.method3040(5000L);
            this.method602();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field209 != this || field192) {
            return;
        }
        this.field206 = true;
        if (class318.method2218() - this.field208 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field199 && var2.height >= Statics.field2531) {
                this.field207 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field184 = true;
        this.field206 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field184 = false;
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

    @ObfuscatedName("bm.bp(ILjava/lang/String;ZZI)V")
    public final void method474(int arg0, String arg1, boolean arg2, boolean arg3) {
        try {
            Graphics var5 = this.field203.getGraphics();
            if (Statics.field4482 == null) {
                Statics.field4482 = new Font("Helvetica", 1, 13);
                Statics.field3897 = this.field203.getFontMetrics(Statics.field4482);
            }
            if (arg2 && !arg3) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, Statics.field199, Statics.field2531);
            }
            Color var6 = new Color(140, 17, 17);
            try {
                if (Statics.field52 == null) {
                    Statics.field52 = this.field203.createImage(304, 34);
                }
                Graphics var7 = Statics.field52.getGraphics();
                var7.setColor(var6);
                var7.drawRect(0, 0, 303, 33);
                var7.fillRect(2, 2, arg0 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(1, 1, 301, 31);
                var7.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var7.setFont(Statics.field4482);
                var7.setColor(Color.white);
                var7.drawString(arg1, (304 - Statics.field3897.stringWidth(arg1)) / 2, 22);
                var5.drawImage(Statics.field52, Statics.field199 / 2 - 152, Statics.field2531 / 2 + (arg3 ? 50 : -18), (ImageObserver) null);
            } catch (Exception var12) {
                int var9 = Statics.field199 / 2 - 152;
                int var10 = Statics.field2531 / 2 - 18;
                var5.setColor(var6);
                var5.drawRect(var9, var10, 303, 33);
                var5.fillRect(var9 + 2, var10 + 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var9 + 1, var10 + 1, 301, 31);
                var5.fillRect(arg0 * 3 + var9 + 2, var10 + 2, 300 - arg0 * 3, 30);
                var5.setFont(Statics.field4482);
                var5.setColor(Color.white);
                var5.drawString(arg1, var9 + (304 - Statics.field3897.stringWidth(arg1)) / 2, var10 + 22);
            }
        } catch (Exception var13) {
            this.field203.repaint();
        }
    }

    @ObfuscatedName("bm.bf(B)V")
    public final void method566() {
        Statics.field52 = null;
        Statics.field4482 = null;
        Statics.field3897 = null;
    }

    @ObfuscatedName("bm.bg(Ljava/lang/String;I)V")
    public void method486(String arg0) {
        if (this.field185) {
            return;
        }
        this.field185 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bm.be(S)Ljava/awt/Container;")
    public Container method462() {
        return this.field202 == null ? this : this.field202;
    }

    @ObfuscatedName("bm.bc(I)Lrc;")
    public class465 method488() {
        Container var1 = this.method462();
        int var2 = Math.max(var1.getWidth(), this.field197);
        int var3 = Math.max(var1.getHeight(), this.field198);
        if (this.field202 != null) {
            Insets var4 = this.field202.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class465(var2, var3);
    }

    @ObfuscatedName("bm.bz(I)Z")
    public final boolean method489() {
        return this.field202 != null;
    }

    @ObfuscatedName("hs.bh(I)I")
    public static int method3733() {
        int var0 = 0;
        if (Statics.field73 == null || !Statics.field73.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field73 = var2;
                        field204 = -1L;
                        field214 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field73 != null) {
            long var4 = class318.method2218();
            long var6 = Statics.field73.getCollectionTime();
            if (field214 != -1L) {
                long var8 = var6 - field214;
                long var10 = var4 - field204;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field214 = var6;
            field204 = var4;
        }
        return var0;
    }

    @ObfuscatedName("bm.ad(B)V")
    public abstract void method461();

    @ObfuscatedName("bm.bb(I)V")
    public abstract void method479();

    public abstract void init();

    @ObfuscatedName("bm.by(I)V")
    public abstract void method481();

    @ObfuscatedName("bm.bn(ZI)V")
    public abstract void method483(boolean arg0);

    @ObfuscatedName("bm.br(I)V")
    public abstract void method484();

    @ObfuscatedName("bm.bs(B)V")
    public abstract void method490();
}
