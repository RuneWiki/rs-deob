package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("y")
public class class26 implements KeyListener, FocusListener {

    @ObfuscatedName("y.w")
    public Collection field147 = new ArrayList(100);

    @ObfuscatedName("y.v")
    public Collection field154 = new ArrayList(100);

    @ObfuscatedName("y.s")
    public class30[] field152 = new class30[3];

    @ObfuscatedName("y.z")
    public boolean[] field150 = new boolean[112];

    @ObfuscatedName("y.j")
    public volatile int field146 = 0;

    @ObfuscatedName("y.f(Lag;IB)V")
    public void method345(class30 arg0, int arg1) {
        this.field152[arg1] = arg0;
    }

    @ObfuscatedName("y.w(I)I")
    public int method346() {
        return this.field146;
    }

    @ObfuscatedName("y.v(Ljava/awt/Component;I)V")
    public void method347(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(this);
        arg0.addFocusListener(this);
    }

    @ObfuscatedName("y.s(Ljava/awt/Component;I)V")
    public synchronized void method365(Component arg0) {
        arg0.removeKeyListener(this);
        arg0.removeFocusListener(this);
        synchronized (this) {
            this.field147.add(new class34(4, 0));
        }
    }

    @ObfuscatedName("y.z(B)V")
    public void method349() {
        this.field146++;
        this.method344();
        Iterator var1 = this.field154.iterator();
        while (var1.hasNext()) {
            class34 var2 = (class34) var1.next();
            for (int var3 = 0; var3 < this.field152.length && !var2.method487(this.field152[var3]); var3++) {
            }
        }
        this.field154.clear();
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class29.method801()) {
            var3 = class29.method6170(var2);
            if (class29.method3809(var3)) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (var3 >= 0) {
            this.field150[var3] = true;
            this.field147.add(new class34(1, var3));
            this.field146 = 0;
        }
        arg0.consume();
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class29.method801()) {
            var3 = class29.method6170(var2) & 0xFFFFFF7F;
        } else {
            var3 = -1;
        }
        if (var3 >= 0) {
            this.field150[var3] = false;
            this.field147.add(new class34(2, var3));
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
                        char[] var4 = class363.field4361;
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
                this.field147.add(new class34(3, var2));
            }
        }
        arg0.consume();
    }

    @ObfuscatedName("y.j(I)V")
    public synchronized void method344() {
        Collection var1 = this.field154;
        this.field154 = this.field147;
        this.field147 = var1;
    }

    public final synchronized void focusGained(FocusEvent arg0) {
        this.field147.add(new class34(4, 1));
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        for (int var2 = 0; var2 < 112; var2++) {
            if (this.field150[var2]) {
                this.field150[var2] = false;
                this.field147.add(new class34(2, var2));
            }
        }
        this.field147.add(new class34(4, 0));
    }
}
