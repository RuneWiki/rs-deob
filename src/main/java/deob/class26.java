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
    public Collection field136 = new ArrayList(100);

    @ObfuscatedName("ad.ac")
    public Collection field137 = new ArrayList(100);

    @ObfuscatedName("ad.ab")
    public class30[] field138 = new class30[3];

    @ObfuscatedName("ad.an")
    public boolean[] field135 = new boolean[112];

    @ObfuscatedName("ad.ao")
    public volatile int field140 = 0;

    @ObfuscatedName("ad.aj(Lbs;II)V")
    public void method336(class30 arg0, int arg1) {
        this.field138[arg1] = arg0;
    }

    @ObfuscatedName("ad.al(I)I")
    public int method337() {
        return this.field140;
    }

    @ObfuscatedName("ad.ac(Ljava/awt/Component;I)V")
    public void method338(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(this);
        arg0.addFocusListener(this);
    }

    @ObfuscatedName("ad.ab(Ljava/awt/Component;I)V")
    public synchronized void method342(Component arg0) {
        arg0.removeKeyListener(this);
        arg0.removeFocusListener(this);
        synchronized (this) {
            this.field136.add(new class34(4, 0));
        }
    }

    @ObfuscatedName("ad.an(B)V")
    public void method340() {
        this.field140++;
        this.method358();
        Iterator var1 = this.field137.iterator();
        while (var1.hasNext()) {
            class34 var2 = (class34) var1.next();
            for (int var3 = 0; var3 < this.field138.length && !var2.method466(this.field138[var3]); var3++) {
            }
        }
        this.field137.clear();
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        int var2 = arg0.getKeyCode();
        int var4;
        if (var2 >= 0 && var2 < class29.method6274()) {
            int var3 = class29.field149[var2];
            var4 = var3;
            if (class29.method6745(var3)) {
                var4 = -1;
            }
        } else {
            var4 = -1;
        }
        if (var4 >= 0) {
            this.field135[var4] = true;
            this.field136.add(new class34(1, var4));
            this.field140 = 0;
        }
        arg0.consume();
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        int var2 = arg0.getKeyCode();
        int var4;
        if (var2 >= 0 && var2 < class29.method6274()) {
            int var3 = class29.field149[var2];
            var4 = var3 & 0xFFFFFF7F;
        } else {
            var4 = -1;
        }
        if (var4 >= 0) {
            this.field135[var4] = false;
            this.field136.add(new class34(2, var4));
        }
        arg0.consume();
    }

    public final synchronized void keyTyped(KeyEvent arg0) {
        char var2 = arg0.getKeyChar();
        if (var2 != 0 && var2 != 65535 && class366.method4455(var2)) {
            this.field136.add(new class34(3, var2));
        }
        arg0.consume();
    }

    @ObfuscatedName("ad.ao(I)V")
    public synchronized void method358() {
        Collection var1 = this.field137;
        this.field137 = this.field136;
        this.field136 = var1;
    }

    public final synchronized void focusGained(FocusEvent arg0) {
        this.field136.add(new class34(4, 1));
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        for (int var2 = 0; var2 < 112; var2++) {
            if (this.field135[var2]) {
                this.field135[var2] = false;
                this.field136.add(new class34(2, var2));
            }
        }
        this.field136.add(new class34(4, 0));
    }
}
