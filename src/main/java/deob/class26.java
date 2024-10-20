package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("ap")
public class class26 implements KeyListener, FocusListener {

    @ObfuscatedName("ap.aw")
    public Collection field115 = new ArrayList(100);

    @ObfuscatedName("ap.al")
    public Collection field117 = new ArrayList(100);

    @ObfuscatedName("ap.ai")
    public class30[] field116 = new class30[3];

    @ObfuscatedName("ap.ar")
    public boolean[] field118 = new boolean[112];

    @ObfuscatedName("ap.as")
    public volatile int field114 = 0;

    @ObfuscatedName("ap.aq(Lbi;II)V")
    public void method332(class30 arg0, int arg1) {
        this.field116[arg1] = arg0;
    }

    @ObfuscatedName("ap.aw(I)I")
    public int method318() {
        return this.field114;
    }

    @ObfuscatedName("ap.al(Ljava/awt/Component;B)V")
    public void method319(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(this);
        arg0.addFocusListener(this);
    }

    @ObfuscatedName("ap.ai(Ljava/awt/Component;I)V")
    public synchronized void method320(Component arg0) {
        arg0.removeKeyListener(this);
        arg0.removeFocusListener(this);
        synchronized (this) {
            this.field115.add(new class34(4, 0));
        }
    }

    @ObfuscatedName("ap.ar(B)V")
    public void method321() {
        this.field114++;
        this.method347();
        Iterator var1 = this.field117.iterator();
        while (var1.hasNext()) {
            class34 var2 = (class34) var1.next();
            for (int var3 = 0; var3 < this.field116.length && !var2.method446(this.field116[var3]); var3++) {
            }
        }
        this.field117.clear();
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        int var6;
        label27: {
            int var2 = arg0.getKeyCode();
            if (var2 >= 0) {
                int var4 = class29.field148.length;
                if (var2 < var4) {
                    int var5 = class29.field148[var2];
                    var6 = var5;
                    boolean var7 = (var5 & 0x80) != 0;
                    if (var7) {
                        var6 = -1;
                    }
                    break label27;
                }
            }
            var6 = -1;
        }
        if (var6 >= 0) {
            if (!this.field118[var6]) {
                this.field114 = 0;
            }
            this.field118[var6] = true;
            this.field115.add(new class34(1, var6));
        }
        arg0.consume();
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        int var6;
        label16: {
            int var2 = arg0.getKeyCode();
            if (var2 >= 0) {
                int var4 = class29.field148.length;
                if (var2 < var4) {
                    int var5 = class29.field148[var2];
                    var6 = var5 & 0xFFFFFF7F;
                    break label16;
                }
            }
            var6 = -1;
        }
        if (var6 >= 0) {
            this.field118[var6] = false;
            this.field115.add(new class34(2, var6));
        }
        arg0.consume();
    }

    public final synchronized void keyTyped(KeyEvent arg0) {
        char var2 = arg0.getKeyChar();
        if (var2 != 0 && var2 != 65535 && class404.method4205(var2)) {
            this.field115.add(new class34(3, var2));
        }
        arg0.consume();
    }

    @ObfuscatedName("ap.as(I)V")
    public synchronized void method347() {
        Collection var1 = this.field117;
        this.field117 = this.field115;
        this.field115 = var1;
    }

    public final synchronized void focusGained(FocusEvent arg0) {
        this.field115.add(new class34(4, 1));
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        for (int var2 = 0; var2 < 112; var2++) {
            if (this.field118[var2]) {
                this.field118[var2] = false;
                this.field115.add(new class34(2, var2));
            }
        }
        this.field115.add(new class34(4, 0));
    }
}
