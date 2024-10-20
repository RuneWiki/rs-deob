package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("af")
public class class26 implements KeyListener, FocusListener {

    @ObfuscatedName("af.ah")
    public Collection field122 = new ArrayList(100);

    @ObfuscatedName("af.ar")
    public Collection field123 = new ArrayList(100);

    @ObfuscatedName("af.ao")
    public class30[] field124 = new class30[3];

    @ObfuscatedName("af.ab")
    public boolean[] field126 = new boolean[112];

    @ObfuscatedName("af.au")
    public volatile int field121 = 0;

    @ObfuscatedName("af.at(Lbi;II)V")
    public void method373(class30 arg0, int arg1) {
        this.field124[arg1] = arg0;
    }

    @ObfuscatedName("af.ah(I)I")
    public int method354() {
        return this.field121;
    }

    @ObfuscatedName("af.ar(Ljava/awt/Component;B)V")
    public void method355(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(this);
        arg0.addFocusListener(this);
    }

    @ObfuscatedName("af.ao(Ljava/awt/Component;B)V")
    public synchronized void method356(Component arg0) {
        arg0.removeKeyListener(this);
        arg0.removeFocusListener(this);
        synchronized (this) {
            this.field122.add(new class34(4, 0));
        }
    }

    @ObfuscatedName("af.ab(I)V")
    public void method352() {
        this.field121++;
        this.method359();
        Iterator var1 = this.field123.iterator();
        while (var1.hasNext()) {
            class34 var2 = (class34) var1.next();
            for (int var3 = 0; var3 < this.field124.length && !var2.method485(this.field124[var3]); var3++) {
            }
        }
        this.field123.clear();
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        int var2 = arg0.getKeyCode();
        int var4;
        if (var2 >= 0 && var2 < class29.method4468()) {
            int var3 = class29.field147[var2];
            var4 = var3;
            boolean var5 = (var3 & 0x80) != 0;
            if (var5) {
                var4 = -1;
            }
        } else {
            var4 = -1;
        }
        if (var4 >= 0) {
            if (!this.field126[var4]) {
                this.field121 = 0;
            }
            this.field126[var4] = true;
            this.field122.add(new class34(1, var4));
        }
        arg0.consume();
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        int var2 = arg0.getKeyCode();
        int var4;
        if (var2 >= 0 && var2 < class29.method4468()) {
            int var3 = class29.field147[var2];
            var4 = var3 & 0xFFFFFF7F;
        } else {
            var4 = -1;
        }
        if (var4 >= 0) {
            this.field126[var4] = false;
            this.field122.add(new class34(2, var4));
        }
        arg0.consume();
    }

    public final synchronized void keyTyped(KeyEvent arg0) {
        char var2 = arg0.getKeyChar();
        if (var2 != 0 && var2 != 65535 && class397.method4200(var2)) {
            this.field122.add(new class34(3, var2));
        }
        arg0.consume();
    }

    @ObfuscatedName("af.au(S)V")
    public synchronized void method359() {
        Collection var1 = this.field123;
        this.field123 = this.field122;
        this.field122 = var1;
    }

    public final synchronized void focusGained(FocusEvent arg0) {
        this.field122.add(new class34(4, 1));
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        for (int var2 = 0; var2 < 112; var2++) {
            if (this.field126[var2]) {
                this.field126[var2] = false;
                this.field122.add(new class34(2, var2));
            }
        }
        this.field122.add(new class34(4, 0));
    }
}
