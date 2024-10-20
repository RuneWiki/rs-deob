package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("at")
public class class26 implements KeyListener, FocusListener {

    @ObfuscatedName("at.ap")
    public Collection field131 = new ArrayList(100);

    @ObfuscatedName("at.af")
    public Collection field128 = new ArrayList(100);

    @ObfuscatedName("at.aj")
    public class30[] field134 = new class30[3];

    @ObfuscatedName("at.aq")
    public boolean[] field130 = new boolean[112];

    @ObfuscatedName("at.ar")
    public volatile int field129 = 0;

    @ObfuscatedName("at.am(Lbt;II)V")
    public void method352(class30 arg0, int arg1) {
        this.field134[arg1] = arg0;
    }

    @ObfuscatedName("at.ap(I)I")
    public int method353() {
        return this.field129;
    }

    @ObfuscatedName("at.af(Ljava/awt/Component;S)V")
    public void method354(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(this);
        arg0.addFocusListener(this);
    }

    @ObfuscatedName("at.aj(Ljava/awt/Component;I)V")
    public synchronized void method355(Component arg0) {
        arg0.removeKeyListener(this);
        arg0.removeFocusListener(this);
        synchronized (this) {
            this.field131.add(new class34(4, 0));
        }
    }

    @ObfuscatedName("at.aq(I)V")
    public void method374() {
        this.field129++;
        this.method357();
        Iterator var1 = this.field128.iterator();
        while (var1.hasNext()) {
            class34 var2 = (class34) var1.next();
            for (int var3 = 0; var3 < this.field134.length && !var2.method485(this.field134[var3]); var3++) {
            }
        }
        this.field128.clear();
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class29.method2648()) {
            var3 = class29.method3800(var2);
            if (class29.method3521(var3)) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (var3 >= 0) {
            if (!this.field130[var3]) {
                this.field129 = 0;
            }
            this.field130[var3] = true;
            this.field131.add(new class34(1, var3));
        }
        arg0.consume();
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class29.method2648()) {
            var3 = class29.method3800(var2) & 0xFFFFFF7F;
        } else {
            var3 = -1;
        }
        if (var3 >= 0) {
            this.field130[var3] = false;
            this.field131.add(new class34(2, var3));
        }
        arg0.consume();
    }

    public final synchronized void keyTyped(KeyEvent arg0) {
        char var2 = arg0.getKeyChar();
        if (var2 != 0 && var2 != 65535 && class401.method1174(var2)) {
            this.field131.add(new class34(3, var2));
        }
        arg0.consume();
    }

    @ObfuscatedName("at.ar(B)V")
    public synchronized void method357() {
        Collection var1 = this.field128;
        this.field128 = this.field131;
        this.field131 = var1;
    }

    public final synchronized void focusGained(FocusEvent arg0) {
        this.field131.add(new class34(4, 1));
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        for (int var2 = 0; var2 < 112; var2++) {
            if (this.field130[var2]) {
                this.field130[var2] = false;
                this.field131.add(new class34(2, var2));
            }
        }
        this.field131.add(new class34(4, 0));
    }
}
