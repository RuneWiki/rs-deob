package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("ar")
public class class26 implements KeyListener, FocusListener {

    @ObfuscatedName("ar.ad")
    public Collection field112 = new ArrayList(100);

    @ObfuscatedName("ar.ag")
    public Collection field113 = new ArrayList(100);

    @ObfuscatedName("ar.ak")
    public class30[] field114 = new class30[3];

    @ObfuscatedName("ar.ap")
    public boolean[] field118 = new boolean[112];

    @ObfuscatedName("ar.an")
    public volatile int field116 = 0;

    @ObfuscatedName("ar.aq(Lbm;II)V")
    public void method349(class30 arg0, int arg1) {
        this.field114[arg1] = arg0;
    }

    @ObfuscatedName("ar.ad(I)I")
    public int method350() {
        return this.field116;
    }

    @ObfuscatedName("ar.ag(Ljava/awt/Component;B)V")
    public void method373(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(this);
        arg0.addFocusListener(this);
    }

    @ObfuscatedName("ar.ak(Ljava/awt/Component;I)V")
    public synchronized void method352(Component arg0) {
        arg0.removeKeyListener(this);
        arg0.removeFocusListener(this);
        synchronized (this) {
            this.field112.add(new class34(4, 0));
        }
    }

    @ObfuscatedName("ar.ap(I)V")
    public void method383() {
        this.field116++;
        this.method354();
        Iterator var1 = this.field113.iterator();
        while (var1.hasNext()) {
            class34 var2 = (class34) var1.next();
            for (int var3 = 0; var3 < this.field114.length && !var2.method473(this.field114[var3]); var3++) {
            }
        }
        this.field113.clear();
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        int var6;
        label27: {
            int var2 = arg0.getKeyCode();
            if (var2 >= 0) {
                int var4 = class29.field139.length;
                if (var2 < var4) {
                    int var5 = class29.field139[var2];
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
                this.field116 = 0;
            }
            this.field118[var6] = true;
            this.field112.add(new class34(1, var6));
        }
        arg0.consume();
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        int var6;
        label16: {
            int var2 = arg0.getKeyCode();
            if (var2 >= 0) {
                int var4 = class29.field139.length;
                if (var2 < var4) {
                    int var5 = class29.field139[var2];
                    var6 = var5 & 0xFFFFFF7F;
                    break label16;
                }
            }
            var6 = -1;
        }
        if (var6 >= 0) {
            this.field118[var6] = false;
            this.field112.add(new class34(2, var6));
        }
        arg0.consume();
    }

    public final synchronized void keyTyped(KeyEvent arg0) {
        char var2 = arg0.getKeyChar();
        if (var2 != 0 && var2 != 65535 && class414.method5913(var2)) {
            this.field112.add(new class34(3, var2));
        }
        arg0.consume();
    }

    @ObfuscatedName("ar.an(I)V")
    public synchronized void method354() {
        Collection var1 = this.field113;
        this.field113 = this.field112;
        this.field112 = var1;
    }

    public final synchronized void focusGained(FocusEvent arg0) {
        this.field112.add(new class34(4, 1));
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        for (int var2 = 0; var2 < 112; var2++) {
            if (this.field118[var2]) {
                this.field118[var2] = false;
                this.field112.add(new class34(2, var2));
            }
        }
        this.field112.add(new class34(4, 0));
    }
}
