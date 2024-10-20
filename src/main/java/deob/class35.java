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

@ObfuscatedName("by")
public abstract class class35 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("by.ap")
    public static class35 field185 = null;

    @ObfuscatedName("by.af")
    public static int field186 = 0;

    @ObfuscatedName("by.aj")
    public static long field201 = 0L;

    @ObfuscatedName("by.aq")
    public static boolean field188 = false;

    @ObfuscatedName("by.ar")
    public boolean field189 = false;

    @ObfuscatedName("by.ao")
    public static int field190 = 20;

    @ObfuscatedName("by.ae")
    public static int field193 = 1;

    @ObfuscatedName("by.aa")
    public static int field211 = 0;

    @ObfuscatedName("by.ad")
    public static long[] field217 = new long[32];

    @ObfuscatedName("by.aw")
    public static long[] field194 = new long[32];

    @ObfuscatedName("by.av")
    public int field195;

    @ObfuscatedName("by.ak")
    public int field196;

    @ObfuscatedName("by.ay")
    public int field209 = 0;

    @ObfuscatedName("by.as")
    public int field197 = 0;

    @ObfuscatedName("by.ai")
    public int field200;

    @ObfuscatedName("by.ac")
    public int field216;

    @ObfuscatedName("by.al")
    public int field202;

    @ObfuscatedName("by.at")
    public int field203;

    @ObfuscatedName("by.bj")
    public boolean field204 = false;

    @ObfuscatedName("by.bt")
    public Frame field205;

    @ObfuscatedName("by.br")
    public Canvas field206;

    @ObfuscatedName("by.ba")
    public volatile boolean field207 = true;

    @ObfuscatedName("by.bn")
    public static int field191 = 500;

    @ObfuscatedName("by.by")
    public boolean field187 = false;

    @ObfuscatedName("by.bc")
    public volatile boolean field210 = false;

    @ObfuscatedName("by.bx")
    public volatile long field184 = 0L;

    @ObfuscatedName("by.bv")
    public class22 field218;

    @ObfuscatedName("by.bm")
    public Clipboard field213;

    @ObfuscatedName("by.bq")
    public final EventQueue field214;

    @ObfuscatedName("by.bb")
    public static volatile boolean field215 = true;

    @ObfuscatedName("by.bw")
    public static class26 field192 = new class26();

    @ObfuscatedName("by.bu")
    public static long field212 = -1L;

    @ObfuscatedName("by.be")
    public static long field208 = -1L;

    public class35() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field214 = var1;
        class23 var3 = new class23();
        Statics.field3109 = var3;
    }

    @ObfuscatedName("by.aq(III)V")
    public final void method492(int arg0, int arg1) {
        if (this.field202 != arg0 || this.field203 != arg1) {
            this.method533();
        }
        this.field202 = arg0;
        this.field203 = arg1;
    }

    @ObfuscatedName("by.ar(Ljava/lang/Object;I)V")
    public final void method559(Object arg0) {
        if (this.field214 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field214.peekEvent() != null; var2++) {
            class317.method2871(1L);
        }
        if (arg0 != null) {
            this.field214.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("by.ag(I)Lip;")
    public class214 method494() {
        if (this.field218 == null) {
            this.field218 = new class22();
            this.field218.method309(this.field206);
        }
        return this.field218;
    }

    @ObfuscatedName("by.ao(I)V")
    public void method495() {
        this.field213 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("by.ae(Ljava/lang/String;B)V")
    public void method614(String arg0) {
        this.field213.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("by.aa(I)Ljava/awt/datatransfer/Clipboard;")
    public Clipboard method497() {
        return this.field213;
    }

    @ObfuscatedName("by.au(B)V")
    public final void method526() {
        if (Statics.field2467.toLowerCase().indexOf("microsoft") == -1) {
            class29.field153[44] = 71;
            class29.field153[45] = 26;
            class29.field153[46] = 72;
            class29.field153[47] = 73;
            class29.field153[59] = 57;
            class29.field153[61] = 27;
            class29.field153[91] = 42;
            class29.field153[92] = 74;
            class29.field153[93] = 43;
            class29.field153[192] = 28;
            class29.field153[222] = 58;
            class29.field153[520] = 59;
        } else {
            class29.field153[186] = 57;
            class29.field153[187] = 27;
            class29.field153[188] = 71;
            class29.field153[189] = 26;
            class29.field153[190] = 72;
            class29.field153[191] = 73;
            class29.field153[192] = 58;
            class29.field153[219] = 42;
            class29.field153[220] = 74;
            class29.field153[221] = 43;
            class29.field153[222] = 59;
            class29.field153[223] = 28;
        }
        field192.method354(this.field206);
    }

    @ObfuscatedName("gi.an(I)I")
    public static final int method3253() {
        return field192.method353();
    }

    @ObfuscatedName("by.ad(B)V")
    public final void method499() {
        field192.method374();
    }

    @ObfuscatedName("by.ax(Lbt;IB)V")
    public void method627(class30 arg0, int arg1) {
        field192.method352(arg0, arg1);
    }

    @ObfuscatedName("by.aw(I)V")
    public final void method601() {
        Canvas var1 = this.field206;
        var1.addMouseListener(class36.field224);
        var1.addMouseMotionListener(class36.field224);
        var1.addFocusListener(class36.field224);
    }

    @ObfuscatedName("by.az(I)V")
    public final void method502() {
        Container var1 = this.method583();
        if (var1 == null) {
            return;
        }
        class462 var2 = this.method549();
        this.field195 = Math.max(var2.field4791, this.field200);
        this.field196 = Math.max(var2.field4792, this.field216);
        if (this.field195 <= 0) {
            this.field195 = 1;
        }
        if (this.field196 <= 0) {
            this.field196 = 1;
        }
        Statics.field5134 = Math.min(this.field195, this.field202);
        Statics.field199 = Math.min(this.field196, this.field203);
        this.field209 = (this.field195 - Statics.field5134) / 2;
        this.field197 = 0;
        this.field206.setSize(Statics.field5134, Statics.field199);
        Statics.field2556 = new class33(Statics.field5134, Statics.field199, this.field206, this.field204);
        if (this.field205 == var1) {
            Insets var3 = this.field205.getInsets();
            this.field206.setLocation(this.field209 + var3.left, this.field197 + var3.top);
        } else {
            this.field206.setLocation(this.field209, this.field197);
        }
        this.field207 = true;
        this.method558();
    }

    @ObfuscatedName("by.ak(B)V")
    public void method570() {
        int var1 = this.field209;
        int var2 = this.field197;
        int var3 = this.field195 - Statics.field5134 - var1;
        int var4 = this.field196 - Statics.field199 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method583();
            int var6 = 0;
            int var7 = 0;
            if (this.field205 == var5) {
                Insets var8 = this.field205.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field196);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field195, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field195 + var6 - var3, var7, var3, this.field196);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field196 + var7 - var4, this.field195, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("by.ay(I)V")
    public final void method505() {
        field192.method355(this.field206);
        class36.method3557(this.field206);
        if (this.field218 != null) {
            this.field218.method310(this.field206);
        }
        this.method507();
        field192.method354(this.field206);
        Canvas var1 = this.field206;
        var1.addMouseListener(class36.field224);
        var1.addMouseMotionListener(class36.field224);
        var1.addFocusListener(class36.field224);
        if (this.field218 != null) {
            this.field218.method309(this.field206);
        }
        this.method533();
    }

    @ObfuscatedName("by.as(IIIII)V")
    public final void method506(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (field185 != null) {
                field186++;
                if (field186 >= 3) {
                    this.method525("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field185 = this;
            Statics.field5134 = arg0;
            Statics.field199 = arg1;
            Statics.field5338 = arg2;
            Statics.field4949 = arg3;
            Statics.field5337 = this;
            if (Statics.field198 == null) {
                Statics.field198 = new class211();
            }
            Statics.field198.method3903(this, 1);
        } catch (Exception var6) {
            class557.method6332((String) null, var6);
            this.method525("crash");
        }
    }

    @ObfuscatedName("by.ab(B)V")
    public final synchronized void method507() {
        Container var1 = this.method583();
        if (this.field206 != null) {
            this.field206.removeFocusListener(this);
            var1.remove(this.field206);
        }
        Statics.field5134 = Math.max(var1.getWidth(), this.field200);
        Statics.field199 = Math.max(var1.getHeight(), this.field216);
        if (this.field205 != null) {
            Insets var2 = this.field205.getInsets();
            Statics.field5134 -= var2.right + var2.left;
            Statics.field199 -= var2.top + var2.bottom;
        }
        this.field206 = new class24(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field206);
        this.field206.setSize(Statics.field5134, Statics.field199);
        this.field206.setVisible(true);
        this.field206.setBackground(Color.BLACK);
        if (this.field205 == var1) {
            Insets var3 = this.field205.getInsets();
            this.field206.setLocation(this.field209 + var3.left, this.field197 + var3.top);
        } else {
            this.field206.setLocation(this.field209, this.field197);
        }
        this.field206.addFocusListener(this);
        this.field206.requestFocus();
        this.field207 = true;
        if (Statics.field2556 != null && Statics.field5134 == Statics.field2556.field5259 && Statics.field199 == Statics.field2556.field5257) {
            ((class33) Statics.field2556).method464(this.field206);
            Statics.field2556.method466(0, 0);
        } else {
            Statics.field2556 = new class33(Statics.field5134, Statics.field199, this.field206, this.field204);
        }
        this.field210 = false;
        this.field184 = Statics.method2852();
    }

    @ObfuscatedName("by.ah(ZB)V")
    public void method508(boolean arg0) {
        if (this.field204 != arg0) {
            this.field204 = arg0;
            Statics.field2556.method8956(arg0);
            Statics.field2556.method8954();
        }
    }

    @ObfuscatedName("by.ai(B)Z")
    public final boolean method509() {
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
                this.method525("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2467 != null) {
                String var1 = Statics.field2467.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2293;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method525("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class403.method1144(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class403.method2128(var4) && class403.method2543(var4) < 10) {
                            this.method525("wrongjava");
                            return;
                        }
                    }
                    field193 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method507();
            this.method520();
            class224 var5;
            try {
                var5 = new class207();
            } catch (Throwable var9) {
                var5 = new class216();
            }
            Statics.field3683 = var5;
            while (field201 == 0L || Statics.method2852() < field201) {
                Statics.field2043 = Statics.field3683.method3804(field190, field193);
                for (int var7 = 0; var7 < Statics.field2043; var7++) {
                    this.method510();
                }
                this.method512();
                this.method559(this.field206);
            }
        } catch (Exception var10) {
            class557.method6332((String) null, var10);
            this.method525("crash");
        }
        this.method514();
    }

    @ObfuscatedName("by.ac(I)V")
    public void method510() {
        long var1 = Statics.method2852();
        long var3 = field194[Statics.field4411];
        field194[Statics.field4411] = var1;
        Statics.field4411 = Statics.field4411 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field161 = field215;
        }
        this.method521();
    }

    @ObfuscatedName("by.al(I)V")
    public final void method511() {
        this.field207 = true;
    }

    @ObfuscatedName("by.at(B)V")
    public void method512() {
        Container var1 = this.method583();
        long var2 = Statics.method2852();
        long var4 = field217[Statics.field4855];
        field217[Statics.field4855] = var2;
        Statics.field4855 = Statics.field4855 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field211 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field191 - 1 > 50) {
            field191 -= 50;
            this.field207 = true;
            this.field206.setSize(Statics.field5134, Statics.field199);
            this.field206.setVisible(true);
            if (this.field205 == var1) {
                Insets var7 = this.field205.getInsets();
                this.field206.setLocation(this.field209 + var7.left, this.field197 + var7.top);
            } else {
                this.field206.setLocation(this.field209, this.field197);
            }
        }
        if (this.field210) {
            this.method505();
        }
        this.method513();
        this.method522(this.field207);
        if (this.field207) {
            this.method570();
        }
        this.field207 = false;
    }

    @ObfuscatedName("by.br(I)V")
    public final void method513() {
        class462 var1 = this.method549();
        if (this.field195 != var1.field4791 || this.field196 != var1.field4792 || this.field187) {
            this.method502();
            this.field187 = false;
        }
    }

    @ObfuscatedName("by.ba(I)V")
    public final void method533() {
        this.field187 = true;
    }

    @ObfuscatedName("by.bk(I)V")
    public final synchronized void method514() {
        if (field188) {
            return;
        }
        field188 = true;
        try {
            this.field206.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method523();
        } catch (Exception var7) {
        }
        if (this.field205 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field198 != null) {
            try {
                Statics.field198.method3887();
            } catch (Exception var5) {
            }
        }
        this.method528();
    }

    @ObfuscatedName("jm.bn(I)V")
    public static final void method4223() {
        Statics.field3683.method3802();
        for (int var0 = 0; var0 < 32; var0++) {
            field217[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field194[var1] = 0L;
        }
        Statics.field2043 = 0;
    }

    public final void start() {
        if (field185 == this && !field188) {
            field201 = 0L;
        }
    }

    public final void stop() {
        if (field185 == this && !field188) {
            field201 = Statics.method2852() + 4000L;
        }
    }

    public final void destroy() {
        if (field185 == this && !field188) {
            field201 = Statics.method2852();
            class317.method2871(5000L);
            this.method514();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field185 != this || field188) {
            return;
        }
        this.field207 = true;
        if (Statics.method2852() - this.field184 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field5134 && var2.height >= Statics.field199) {
                this.field210 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field215 = true;
        this.field207 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field215 = false;
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

    @ObfuscatedName("by.bp(ILjava/lang/String;ZI)V")
    public final void method524(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field206.getGraphics();
            if (Statics.field1620 == null) {
                Statics.field1620 = new Font("Helvetica", 1, 13);
                Statics.field3949 = this.field206.getFontMetrics(Statics.field1620);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field5134, Statics.field199);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field4580 == null) {
                    Statics.field4580 = this.field206.createImage(304, 34);
                }
                Graphics var6 = Statics.field4580.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field1620);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field3949.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field4580, Statics.field5134 / 2 - 152, Statics.field199 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field5134 / 2 - 152;
                int var9 = Statics.field199 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1620);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field3949.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field206.repaint();
        }
    }

    @ObfuscatedName("by.bv(I)V")
    public final void method552() {
        Statics.field4580 = null;
        Statics.field1620 = null;
        Statics.field3949 = null;
    }

    @ObfuscatedName("by.bm(Ljava/lang/String;B)V")
    public void method525(String arg0) {
        if (this.field189) {
            return;
        }
        this.field189 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("by.bq(I)Ljava/awt/Container;")
    public Container method583() {
        return this.field205 == null ? this : this.field205;
    }

    @ObfuscatedName("by.bb(B)Lry;")
    public class462 method549() {
        Container var1 = this.method583();
        int var2 = Math.max(var1.getWidth(), this.field200);
        int var3 = Math.max(var1.getHeight(), this.field216);
        if (this.field205 != null) {
            Insets var4 = this.field205.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class462(var2, var3);
    }

    @ObfuscatedName("by.bh(I)Z")
    public final boolean method527() {
        return this.field205 != null;
    }

    @ObfuscatedName("ge.bw(I)I")
    public static int method3345() {
        int var0 = 0;
        if (Statics.field28 == null || !Statics.field28.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field28 = var2;
                        field208 = -1L;
                        field212 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field28 != null) {
            long var4 = Statics.method2852();
            long var6 = Statics.field28.getCollectionTime();
            if (field212 != -1L) {
                long var8 = var6 - field212;
                long var10 = var4 - field208;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field212 = var6;
            field208 = var4;
        }
        return var0;
    }

    public abstract void init();

    @ObfuscatedName("by.by(I)V")
    public abstract void method520();

    @ObfuscatedName("by.bc(B)V")
    public abstract void method521();

    @ObfuscatedName("by.bx(ZI)V")
    public abstract void method522(boolean arg0);

    @ObfuscatedName("by.bf(I)V")
    public abstract void method523();

    @ObfuscatedName("by.bi(I)V")
    public abstract void method528();

    @ObfuscatedName("by.av(B)V")
    public abstract void method558();
}
