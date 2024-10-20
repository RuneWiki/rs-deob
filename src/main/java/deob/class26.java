package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("ak")
public class class26 implements KeyListener, FocusListener {

    @ObfuscatedName("ak.ah")
    public Collection field115 = new ArrayList(100);

    @ObfuscatedName("ak.af")
    public Collection field112 = new ArrayList(100);

    @ObfuscatedName("ak.at")
    public class30[] field113 = new class30[3];

    @ObfuscatedName("ak.an")
    public boolean[] field114 = new boolean[112];

    @ObfuscatedName("ak.ao")
    public volatile int field111 = 0;

    @ObfuscatedName("ak.az(Lbf;IB)V")
    public void method317(class30 arg0, int arg1) {
        this.field113[arg1] = arg0;
    }

    @ObfuscatedName("ak.ah(B)I")
    public int method348() {
        return this.field111;
    }

    @ObfuscatedName("ak.af(Ljava/awt/Component;B)V")
    public void method319(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(this);
        arg0.addFocusListener(this);
    }

    @ObfuscatedName("ak.at(Ljava/awt/Component;I)V")
    public synchronized void method327(Component arg0) {
        arg0.removeKeyListener(this);
        arg0.removeFocusListener(this);
        synchronized (this) {
            this.field115.add(new class34(4, 0));
        }
    }

    @ObfuscatedName("ak.an(I)V")
    public void method349() {
        this.field111++;
        this.method323();
        Iterator var1 = this.field112.iterator();
        while (var1.hasNext()) {
            class34 var2 = (class34) var1.next();
            for (int var3 = 0; var3 < this.field113.length && !var2.method451(this.field113[var3]); var3++) {
            }
        }
        this.field112.clear();
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        int var5;
        label22: {
            int var2 = arg0.getKeyCode();
            if (var2 >= 0) {
                int var4 = class29.field142.length;
                if (var2 < var4) {
                    var5 = class29.method7876(var2);
                    if (class29.method3881(var5)) {
                        var5 = -1;
                    }
                    break label22;
                }
            }
            var5 = -1;
        }
        if (var5 >= 0) {
            if (!this.field114[var5]) {
                this.field111 = 0;
            }
            this.field114[var5] = true;
            this.field115.add(new class34(1, var5));
        }
        arg0.consume();
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        int var5;
        label16: {
            int var2 = arg0.getKeyCode();
            if (var2 >= 0) {
                int var4 = class29.field142.length;
                if (var2 < var4) {
                    var5 = class29.method7876(var2) & 0xFFFFFF7F;
                    break label16;
                }
            }
            var5 = -1;
        }
        if (var5 >= 0) {
            this.field114[var5] = false;
            this.field115.add(new class34(2, var5));
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
                        char[] var4 = class405.field4560;
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
                this.field115.add(new class34(3, var2));
            }
        }
        arg0.consume();
    }

    @ObfuscatedName("ak.ao(I)V")
    public synchronized void method323() {
        Collection var1 = this.field112;
        this.field112 = this.field115;
        this.field115 = var1;
    }

    public final synchronized void focusGained(FocusEvent arg0) {
        this.field115.add(new class34(4, 1));
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        for (int var2 = 0; var2 < 112; var2++) {
            if (this.field114[var2]) {
                this.field114[var2] = false;
                this.field115.add(new class34(2, var2));
            }
        }
        this.field115.add(new class34(4, 0));
    }
}
