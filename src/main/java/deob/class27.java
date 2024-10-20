package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("as")
public class class27 implements KeyListener, FocusListener {

    @ObfuscatedName("as.e")
    public Collection field145 = new ArrayList(100);

    @ObfuscatedName("as.v")
    public Collection field146 = new ArrayList(100);

    @ObfuscatedName("as.x")
    public class31[] field144 = new class31[3];

    @ObfuscatedName("as.m")
    public boolean[] field147 = new boolean[112];

    @ObfuscatedName("as.q")
    public volatile int field149 = 0;

    @ObfuscatedName("as.h(Lav;II)V")
    public void method344(class31 arg0, int arg1) {
        this.field144[arg1] = arg0;
    }

    @ObfuscatedName("as.e(I)I")
    public int method345() {
        return this.field149;
    }

    @ObfuscatedName("as.v(Ljava/awt/Component;I)V")
    public void method346(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(this);
        arg0.addFocusListener(this);
    }

    @ObfuscatedName("as.x(Ljava/awt/Component;I)V")
    public synchronized void method343(Component arg0) {
        arg0.removeKeyListener(this);
        arg0.removeFocusListener(this);
        synchronized (this) {
            this.field145.add(new class35(4, 0));
        }
    }

    @ObfuscatedName("as.m(B)V")
    public void method352() {
        this.field149++;
        this.method349();
        Iterator var1 = this.field146.iterator();
        while (var1.hasNext()) {
            class35 var2 = (class35) var1.next();
            for (int var3 = 0; var3 < this.field144.length && !var2.method478(this.field144[var3]); var3++) {
            }
        }
        this.field146.clear();
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        int var5;
        label23: {
            int var2 = arg0.getKeyCode();
            if (var2 >= 0) {
                int var4 = class30.field176.length;
                if (var2 < var4) {
                    var5 = class30.method2908(var2);
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
            this.field147[var5] = true;
            this.field145.add(new class35(1, var5));
            this.field149 = 0;
        }
        arg0.consume();
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        int var5;
        label16: {
            int var2 = arg0.getKeyCode();
            if (var2 >= 0) {
                int var4 = class30.field176.length;
                if (var2 < var4) {
                    var5 = class30.method2908(var2) & 0xFFFFFF7F;
                    break label16;
                }
            }
            var5 = -1;
        }
        if (var5 >= 0) {
            this.field147[var5] = false;
            this.field145.add(new class35(2, var5));
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
                        char[] var4 = class359.field4346;
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
                this.field145.add(new class35(3, var2));
            }
        }
        arg0.consume();
    }

    @ObfuscatedName("as.q(I)V")
    public synchronized void method349() {
        Collection var1 = this.field146;
        this.field146 = this.field145;
        this.field145 = var1;
    }

    public final synchronized void focusGained(FocusEvent arg0) {
        this.field145.add(new class35(4, 1));
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        for (int var2 = 0; var2 < 112; var2++) {
            if (this.field147[var2]) {
                this.field147[var2] = false;
                this.field145.add(new class35(2, var2));
            }
        }
        this.field145.add(new class35(4, 0));
    }
}
