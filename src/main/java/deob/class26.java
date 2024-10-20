package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("az")
public class class26 implements KeyListener, FocusListener {

    @ObfuscatedName("az.ay")
    public Collection field102 = new ArrayList(100);

    @ObfuscatedName("az.an")
    public Collection field103 = new ArrayList(100);

    @ObfuscatedName("az.au")
    public class30[] field104 = new class30[3];

    @ObfuscatedName("az.ax")
    public boolean[] field107 = new boolean[112];

    @ObfuscatedName("az.ao")
    public volatile int field109 = 0;

    @ObfuscatedName("az.ab(Lbc;II)V")
    public void method322(class30 arg0, int arg1) {
        this.field104[arg1] = arg0;
    }

    @ObfuscatedName("az.ay(I)I")
    public int method317() {
        return this.field109;
    }

    @ObfuscatedName("az.an(Ljava/awt/Component;I)V")
    public void method318(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(this);
        arg0.addFocusListener(this);
    }

    @ObfuscatedName("az.au(Ljava/awt/Component;I)V")
    public synchronized void method319(Component arg0) {
        arg0.removeKeyListener(this);
        arg0.removeFocusListener(this);
        synchronized (this) {
            this.field102.add(new class34(4, 0));
        }
    }

    @ObfuscatedName("az.ax(I)V")
    public void method349() {
        this.field109++;
        this.method331();
        Iterator var1 = this.field103.iterator();
        while (var1.hasNext()) {
            class34 var2 = (class34) var1.next();
            for (int var3 = 0; var3 < this.field104.length && !var2.method446(this.field104[var3]); var3++) {
            }
        }
        this.field103.clear();
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        int var2 = arg0.getKeyCode();
        int var4;
        if (var2 >= 0 && var2 < class29.method2701()) {
            int var3 = class29.field123[var2];
            var4 = var3;
            boolean var5 = (var3 & 0x80) != 0;
            if (var5) {
                var4 = -1;
            }
        } else {
            var4 = -1;
        }
        if (var4 >= 0) {
            if (!this.field107[var4]) {
                this.field109 = 0;
            }
            this.field107[var4] = true;
            this.field102.add(new class34(1, var4));
        }
        arg0.consume();
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        int var2 = arg0.getKeyCode();
        int var4;
        if (var2 >= 0 && var2 < class29.method2701()) {
            int var3 = class29.field123[var2];
            var4 = var3 & 0xFFFFFF7F;
        } else {
            var4 = -1;
        }
        if (var4 >= 0) {
            this.field107[var4] = false;
            this.field102.add(new class34(2, var4));
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
                        char[] var4 = class415.field4643;
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
                this.field102.add(new class34(3, var2));
            }
        }
        arg0.consume();
    }

    @ObfuscatedName("az.ao(I)V")
    public synchronized void method331() {
        Collection var1 = this.field103;
        this.field103 = this.field102;
        this.field102 = var1;
    }

    public final synchronized void focusGained(FocusEvent arg0) {
        this.field102.add(new class34(4, 1));
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        for (int var2 = 0; var2 < 112; var2++) {
            if (this.field107[var2]) {
                this.field107[var2] = false;
                this.field102.add(new class34(2, var2));
            }
        }
        this.field102.add(new class34(4, 0));
    }
}
