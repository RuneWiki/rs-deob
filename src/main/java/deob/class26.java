package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("ah")
public class class26 implements KeyListener, FocusListener {

    @ObfuscatedName("ah.aw")
    public Collection field98 = new ArrayList(100);

    @ObfuscatedName("ah.ak")
    public Collection field99 = new ArrayList(100);

    @ObfuscatedName("ah.aj")
    public class30[] field100 = new class30[3];

    @ObfuscatedName("ah.ai")
    public boolean[] field97 = new boolean[112];

    @ObfuscatedName("ah.ay")
    public volatile int field102 = 0;

    @ObfuscatedName("ah.ap(Lbx;IS)V")
    public void method351(class30 arg0, int arg1) {
        this.field100[arg1] = arg0;
    }

    @ObfuscatedName("ah.aw(I)I")
    public int method352() {
        return this.field102;
    }

    @ObfuscatedName("ah.ak(Ljava/awt/Component;I)V")
    public void method371(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(this);
        arg0.addFocusListener(this);
    }

    @ObfuscatedName("ah.aj(Ljava/awt/Component;I)V")
    public synchronized void method354(Component arg0) {
        arg0.removeKeyListener(this);
        arg0.removeFocusListener(this);
        synchronized (this) {
            this.field98.add(new class34(4, 0));
        }
    }

    @ObfuscatedName("ah.ai(I)V")
    public void method372() {
        this.field102++;
        this.method356();
        Iterator var1 = this.field99.iterator();
        while (var1.hasNext()) {
            class34 var2 = (class34) var1.next();
            for (int var3 = 0; var3 < this.field100.length && !var2.method485(this.field100[var3]); var3++) {
            }
        }
        this.field99.clear();
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class29.method2605()) {
            var3 = class29.method4132(var2);
            boolean var4 = (var3 & 0x80) != 0;
            if (var4) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (var3 >= 0) {
            if (!this.field97[var3]) {
                this.field102 = 0;
            }
            this.field97[var3] = true;
            this.field98.add(new class34(1, var3));
        }
        arg0.consume();
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class29.method2605()) {
            var3 = class29.method4132(var2) & 0xFFFFFF7F;
        } else {
            var3 = -1;
        }
        if (var3 >= 0) {
            this.field97[var3] = false;
            this.field98.add(new class34(2, var3));
        }
        arg0.consume();
    }

    public final synchronized void keyTyped(KeyEvent arg0) {
        char var2 = arg0.getKeyChar();
        if (var2 != 0 && var2 != 65535 && class418.method5806(var2)) {
            this.field98.add(new class34(3, var2));
        }
        arg0.consume();
    }

    @ObfuscatedName("ah.ay(I)V")
    public synchronized void method356() {
        Collection var1 = this.field99;
        this.field99 = this.field98;
        this.field98 = var1;
    }

    public final synchronized void focusGained(FocusEvent arg0) {
        this.field98.add(new class34(4, 1));
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        for (int var2 = 0; var2 < 112; var2++) {
            if (this.field97[var2]) {
                this.field97[var2] = false;
                this.field98.add(new class34(2, var2));
            }
        }
        this.field98.add(new class34(4, 0));
    }
}
