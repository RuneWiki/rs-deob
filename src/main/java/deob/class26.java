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

    @ObfuscatedName("ap.an")
    public Collection field133 = new ArrayList(100);

    @ObfuscatedName("ap.aw")
    public Collection field132 = new ArrayList(100);

    @ObfuscatedName("ap.ac")
    public class30[] field136 = new class30[3];

    @ObfuscatedName("ap.au")
    public boolean[] field135 = new boolean[112];

    @ObfuscatedName("ap.ab")
    public volatile int field134 = 0;

    @ObfuscatedName("ap.af(Lbe;II)V")
    public void method346(class30 arg0, int arg1) {
        this.field136[arg1] = arg0;
    }

    @ObfuscatedName("ap.an(B)I")
    public int method347() {
        return this.field134;
    }

    @ObfuscatedName("ap.aw(Ljava/awt/Component;B)V")
    public void method348(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(this);
        arg0.addFocusListener(this);
    }

    @ObfuscatedName("ap.ac(Ljava/awt/Component;I)V")
    public synchronized void method363(Component arg0) {
        arg0.removeKeyListener(this);
        arg0.removeFocusListener(this);
        synchronized (this) {
            this.field133.add(new class34(4, 0));
        }
    }

    @ObfuscatedName("ap.au(I)V")
    public void method350() {
        this.field134++;
        this.method353();
        Iterator var1 = this.field132.iterator();
        while (var1.hasNext()) {
            class34 var2 = (class34) var1.next();
            for (int var3 = 0; var3 < this.field136.length && !var2.method492(this.field136[var3]); var3++) {
            }
        }
        this.field132.clear();
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        int var5;
        label23: {
            int var2 = arg0.getKeyCode();
            if (var2 >= 0) {
                int var4 = class29.field156.length;
                if (var2 < var4) {
                    var5 = class29.method4547(var2);
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
            this.field135[var5] = true;
            this.field133.add(new class34(1, var5));
            this.field134 = 0;
        }
        arg0.consume();
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        int var5;
        label16: {
            int var2 = arg0.getKeyCode();
            if (var2 >= 0) {
                int var4 = class29.field156.length;
                if (var2 < var4) {
                    var5 = class29.method4547(var2) & 0xFFFFFF7F;
                    break label16;
                }
            }
            var5 = -1;
        }
        if (var5 >= 0) {
            this.field135[var5] = false;
            this.field133.add(new class34(2, var5));
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
                        char[] var4 = class370.field4373;
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
                this.field133.add(new class34(3, var2));
            }
        }
        arg0.consume();
    }

    @ObfuscatedName("ap.ab(B)V")
    public synchronized void method353() {
        Collection var1 = this.field132;
        this.field132 = this.field133;
        this.field133 = var1;
    }

    public final synchronized void focusGained(FocusEvent arg0) {
        this.field133.add(new class34(4, 1));
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        for (int var2 = 0; var2 < 112; var2++) {
            if (this.field135[var2]) {
                this.field135[var2] = false;
                this.field133.add(new class34(2, var2));
            }
        }
        this.field133.add(new class34(4, 0));
    }
}
