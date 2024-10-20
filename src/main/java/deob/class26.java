package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("ad")
public class class26 implements KeyListener, FocusListener {

    @ObfuscatedName("ad.al")
    public Collection field127 = new ArrayList(100);

    @ObfuscatedName("ad.ak")
    public Collection field132 = new ArrayList(100);

    @ObfuscatedName("ad.ax")
    public class30[] field128 = new class30[3];

    @ObfuscatedName("ad.ao")
    public boolean[] field129 = new boolean[112];

    @ObfuscatedName("ad.ah")
    public volatile int field125 = 0;

    @ObfuscatedName("ad.ac(Lbd;IB)V")
    public void method338(class30 arg0, int arg1) {
        this.field128[arg1] = arg0;
    }

    @ObfuscatedName("ad.al(B)I")
    public int method336() {
        return this.field125;
    }

    @ObfuscatedName("ad.ak(Ljava/awt/Component;B)V")
    public void method334(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(this);
        arg0.addFocusListener(this);
    }

    @ObfuscatedName("ad.ax(Ljava/awt/Component;B)V")
    public synchronized void method348(Component arg0) {
        arg0.removeKeyListener(this);
        arg0.removeFocusListener(this);
        synchronized (this) {
            this.field127.add(new class34(4, 0));
        }
    }

    @ObfuscatedName("ad.ao(I)V")
    public void method339() {
        this.field125++;
        this.method351();
        Iterator var1 = this.field132.iterator();
        while (var1.hasNext()) {
            class34 var2 = (class34) var1.next();
            for (int var3 = 0; var3 < this.field128.length && !var2.method466(this.field128[var3]); var3++) {
            }
        }
        this.field132.clear();
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        int var5;
        label23: {
            int var2 = arg0.getKeyCode();
            if (var2 >= 0) {
                int var4 = class29.field153.length;
                if (var2 < var4) {
                    var5 = class29.method2238(var2);
                    boolean var6 = (var5 & 0x80) != 0;
                    if (var6) {
                        var5 = -1;
                    }
                    break label23;
                }
            }
            var5 = -1;
        }
        if (var5 >= 0) {
            this.field129[var5] = true;
            this.field127.add(new class34(1, var5));
            this.field125 = 0;
        }
        arg0.consume();
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        int var5;
        label16: {
            int var2 = arg0.getKeyCode();
            if (var2 >= 0) {
                int var4 = class29.field153.length;
                if (var2 < var4) {
                    var5 = class29.method2238(var2) & 0xFFFFFF7F;
                    break label16;
                }
            }
            var5 = -1;
        }
        if (var5 >= 0) {
            this.field129[var5] = false;
            this.field127.add(new class34(2, var5));
        }
        arg0.consume();
    }

    public final synchronized void keyTyped(KeyEvent arg0) {
        char var2 = arg0.getKeyChar();
        if (var2 != 0 && var2 != 65535) {
            boolean var3;
            if ((var2 <= 0 || var2 >= 128) && (var2 < 160 || var2 > 255)) {
                label47: {
                    if (var2 != 0) {
                        char[] var4 = class400.field4475;
                        for (int var5 = 0; var5 < var4.length; var5++) {
                            char var6 = var4[var5];
                            if (var2 == var6) {
                                var3 = true;
                                break label47;
                            }
                        }
                    }
                    var3 = false;
                }
            } else {
                var3 = true;
            }
            if (var3) {
                this.field127.add(new class34(3, var2));
            }
        }
        arg0.consume();
    }

    @ObfuscatedName("ad.ah(B)V")
    public synchronized void method351() {
        Collection var1 = this.field132;
        this.field132 = this.field127;
        this.field127 = var1;
    }

    public final synchronized void focusGained(FocusEvent arg0) {
        this.field127.add(new class34(4, 1));
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        for (int var2 = 0; var2 < 112; var2++) {
            if (this.field129[var2]) {
                this.field129[var2] = false;
                this.field127.add(new class34(2, var2));
            }
        }
        this.field127.add(new class34(4, 0));
    }
}
