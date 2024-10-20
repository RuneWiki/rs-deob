package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("ak")
public class class26 implements KeyListener, FocusListener {

    @ObfuscatedName("ak.ae")
    public Collection field134 = new ArrayList(100);

    @ObfuscatedName("ak.ao")
    public Collection field126 = new ArrayList(100);

    @ObfuscatedName("ak.at")
    public class30[] field127 = new class30[3];

    @ObfuscatedName("ak.ac")
    public boolean[] field128 = new boolean[112];

    @ObfuscatedName("ak.ai")
    public volatile int field129 = 0;

    @ObfuscatedName("ak.au(Lbv;II)V")
    public void method338(class30 arg0, int arg1) {
        this.field127[arg1] = arg0;
    }

    @ObfuscatedName("ak.ae(I)I")
    public int method339() {
        return this.field129;
    }

    @ObfuscatedName("ak.ao(Ljava/awt/Component;B)V")
    public void method337(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(this);
        arg0.addFocusListener(this);
    }

    @ObfuscatedName("ak.at(Ljava/awt/Component;B)V")
    public synchronized void method341(Component arg0) {
        arg0.removeKeyListener(this);
        arg0.removeFocusListener(this);
        synchronized (this) {
            this.field134.add(new class34(4, 0));
        }
    }

    @ObfuscatedName("ak.ac(I)V")
    public void method342() {
        this.field129++;
        this.method368();
        Iterator var1 = this.field126.iterator();
        while (var1.hasNext()) {
            class34 var2 = (class34) var1.next();
            for (int var3 = 0; var3 < this.field127.length && !var2.method485(this.field127[var3]); var3++) {
            }
        }
        this.field126.clear();
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class29.method8()) {
            var3 = class29.method3242(var2);
            boolean var4 = (var3 & 0x80) != 0;
            if (var4) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (var3 >= 0) {
            this.field128[var3] = true;
            this.field134.add(new class34(1, var3));
            this.field129 = 0;
        }
        arg0.consume();
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        int var5;
        label16: {
            int var2 = arg0.getKeyCode();
            if (var2 >= 0) {
                int var4 = class29.field159.length;
                if (var2 < var4) {
                    var5 = class29.method3242(var2) & 0xFFFFFF7F;
                    break label16;
                }
            }
            var5 = -1;
        }
        if (var5 >= 0) {
            this.field128[var5] = false;
            this.field134.add(new class34(2, var5));
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
                        char[] var4 = class385.field4425;
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
                this.field134.add(new class34(3, var2));
            }
        }
        arg0.consume();
    }

    @ObfuscatedName("ak.ai(I)V")
    public synchronized void method368() {
        Collection var1 = this.field126;
        this.field126 = this.field134;
        this.field134 = var1;
    }

    public final synchronized void focusGained(FocusEvent arg0) {
        this.field134.add(new class34(4, 1));
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        for (int var2 = 0; var2 < 112; var2++) {
            if (this.field128[var2]) {
                this.field128[var2] = false;
                this.field134.add(new class34(2, var2));
            }
        }
        this.field134.add(new class34(4, 0));
    }
}
