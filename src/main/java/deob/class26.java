package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("ag")
public class class26 implements KeyListener, FocusListener {

    @ObfuscatedName("ag.al")
    public Collection field131 = new ArrayList(100);

    @ObfuscatedName("ag.aj")
    public Collection field130 = new ArrayList(100);

    @ObfuscatedName("ag.az")
    public class30[] field129 = new class30[3];

    @ObfuscatedName("ag.af")
    public boolean[] field132 = new boolean[112];

    @ObfuscatedName("ag.aa")
    public volatile int field135 = 0;

    @ObfuscatedName("ag.ak(Lbi;II)V")
    public void method335(class30 arg0, int arg1) {
        this.field129[arg1] = arg0;
    }

    @ObfuscatedName("ag.al(B)I")
    public int method334() {
        return this.field135;
    }

    @ObfuscatedName("ag.aj(Ljava/awt/Component;B)V")
    public void method339(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(this);
        arg0.addFocusListener(this);
    }

    @ObfuscatedName("ag.az(Ljava/awt/Component;B)V")
    public synchronized void method344(Component arg0) {
        arg0.removeKeyListener(this);
        arg0.removeFocusListener(this);
        synchronized (this) {
            this.field131.add(new class34(4, 0));
        }
    }

    @ObfuscatedName("ag.af(I)V")
    public void method354() {
        this.field135++;
        this.method337();
        Iterator var1 = this.field130.iterator();
        while (var1.hasNext()) {
            class34 var2 = (class34) var1.next();
            for (int var3 = 0; var3 < this.field129.length && !var2.method471(this.field129[var3]); var3++) {
            }
        }
        this.field130.clear();
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        int var5;
        label22: {
            int var2 = arg0.getKeyCode();
            if (var2 >= 0) {
                int var4 = class29.field153.length;
                if (var2 < var4) {
                    var5 = class29.method8162(var2);
                    if (class29.method6458(var5)) {
                        var5 = -1;
                    }
                    break label22;
                }
            }
            var5 = -1;
        }
        if (var5 >= 0) {
            if (!this.field132[var5]) {
                this.field135 = 0;
            }
            this.field132[var5] = true;
            this.field131.add(new class34(1, var5));
        }
        arg0.consume();
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        int var5;
        label16: {
            int var2 = arg0.getKeyCode();
            if (var2 >= 0) {
                int var4 = class29.field153.length;
                if (var2 < var4) {
                    var5 = class29.method8162(var2) & 0xFFFFFF7F;
                    break label16;
                }
            }
            var5 = -1;
        }
        if (var5 >= 0) {
            this.field132[var5] = false;
            this.field131.add(new class34(2, var5));
        }
        arg0.consume();
    }

    public final synchronized void keyTyped(KeyEvent arg0) {
        char var2 = arg0.getKeyChar();
        if (var2 != 0 && var2 != 65535 && class413.method1143(var2)) {
            this.field131.add(new class34(3, var2));
        }
        arg0.consume();
    }

    @ObfuscatedName("ag.aa(I)V")
    public synchronized void method337() {
        Collection var1 = this.field130;
        this.field130 = this.field131;
        this.field131 = var1;
    }

    public final synchronized void focusGained(FocusEvent arg0) {
        this.field131.add(new class34(4, 1));
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        for (int var2 = 0; var2 < 112; var2++) {
            if (this.field132[var2]) {
                this.field132[var2] = false;
                this.field131.add(new class34(2, var2));
            }
        }
        this.field131.add(new class34(4, 0));
    }
}
