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
    public Collection field114 = new ArrayList(100);

    @ObfuscatedName("ak.ag")
    public Collection field105 = new ArrayList(100);

    @ObfuscatedName("ak.am")
    public class30[] field108 = new class30[3];

    @ObfuscatedName("ak.ax")
    public boolean[] field107 = new boolean[112];

    @ObfuscatedName("ak.aq")
    public volatile int field109 = 0;

    @ObfuscatedName("ak.ac(Lbx;IB)V")
    public void method354(class30 arg0, int arg1) {
        this.field108[arg1] = arg0;
    }

    @ObfuscatedName("ak.ae(I)I")
    public int method362() {
        return this.field109;
    }

    @ObfuscatedName("ak.ag(Ljava/awt/Component;B)V")
    public void method358(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(this);
        arg0.addFocusListener(this);
    }

    @ObfuscatedName("ak.am(Ljava/awt/Component;B)V")
    public synchronized void method334(Component arg0) {
        arg0.removeKeyListener(this);
        arg0.removeFocusListener(this);
        synchronized (this) {
            this.field114.add(new class34(4, 0));
        }
    }

    @ObfuscatedName("ak.ax(S)V")
    public void method335() {
        this.field109++;
        this.method337();
        Iterator var1 = this.field105.iterator();
        while (var1.hasNext()) {
            class34 var2 = (class34) var1.next();
            for (int var3 = 0; var3 < this.field108.length && !var2.method467(this.field108[var3]); var3++) {
            }
        }
        this.field105.clear();
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        int var2 = arg0.getKeyCode();
        int var4;
        if (var2 >= 0 && var2 < class29.method5603()) {
            int var3 = class29.field132[var2];
            var4 = var3;
            if (class29.method1108(var3)) {
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
            this.field114.add(new class34(1, var4));
        }
        arg0.consume();
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class29.method5603()) {
            var3 = class29.method3073(var2) & 0xFFFFFF7F;
        } else {
            var3 = -1;
        }
        if (var3 >= 0) {
            this.field107[var3] = false;
            this.field114.add(new class34(2, var3));
        }
        arg0.consume();
    }

    public final synchronized void keyTyped(KeyEvent arg0) {
        char var2 = arg0.getKeyChar();
        if (var2 != 0 && var2 != 65535 && class417.method3528(var2)) {
            this.field114.add(new class34(3, var2));
        }
        arg0.consume();
    }

    @ObfuscatedName("ak.aq(I)V")
    public synchronized void method337() {
        Collection var1 = this.field105;
        this.field105 = this.field114;
        this.field114 = var1;
    }

    public final synchronized void focusGained(FocusEvent arg0) {
        this.field114.add(new class34(4, 1));
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        for (int var2 = 0; var2 < 112; var2++) {
            if (this.field107[var2]) {
                this.field107[var2] = false;
                this.field114.add(new class34(2, var2));
            }
        }
        this.field114.add(new class34(4, 0));
    }
}
