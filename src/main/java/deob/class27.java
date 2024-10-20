package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("aj")
public class class27 implements KeyListener, FocusListener {

    @ObfuscatedName("aj.f")
    public Collection field144 = new ArrayList(100);

    @ObfuscatedName("aj.c")
    public Collection field137 = new ArrayList(100);

    @ObfuscatedName("aj.x")
    public class31[] field135 = new class31[3];

    @ObfuscatedName("aj.h")
    public boolean[] field138 = new boolean[112];

    @ObfuscatedName("aj.j")
    public volatile int field140 = 0;

    @ObfuscatedName("aj.a(Lac;II)V")
    public void method379(class31 arg0, int arg1) {
        this.field135[arg1] = arg0;
    }

    @ObfuscatedName("aj.f(I)I")
    public int method348() {
        return this.field140;
    }

    @ObfuscatedName("aj.c(Ljava/awt/Component;I)V")
    public void method349(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(this);
        arg0.addFocusListener(this);
    }

    @ObfuscatedName("aj.x(Ljava/awt/Component;I)V")
    public synchronized void method350(Component arg0) {
        arg0.removeKeyListener(this);
        arg0.removeFocusListener(this);
        synchronized (this) {
            this.field144.add(new class35(4, 0));
        }
    }

    @ObfuscatedName("aj.h(I)V")
    public void method351() {
        this.field140++;
        this.method353();
        Iterator var1 = this.field137.iterator();
        while (var1.hasNext()) {
            class35 var2 = (class35) var1.next();
            for (int var3 = 0; var3 < this.field135.length && !var2.method496(this.field135[var3]); var3++) {
            }
        }
        this.field137.clear();
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        int var6;
        label23: {
            int var2 = arg0.getKeyCode();
            if (var2 >= 0) {
                int var4 = class30.field157.length;
                if (var2 < var4) {
                    int var5 = class30.field157[var2];
                    var6 = var5;
                    boolean var7 = (var5 & 0x80) != 0;
                    if (var7) {
                        var6 = -1;
                    }
                    break label23;
                }
            }
            var6 = -1;
        }
        if (var6 >= 0) {
            this.field138[var6] = true;
            this.field144.add(new class35(1, var6));
            this.field140 = 0;
        }
        arg0.consume();
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        int var6;
        label16: {
            int var2 = arg0.getKeyCode();
            if (var2 >= 0) {
                int var4 = class30.field157.length;
                if (var2 < var4) {
                    int var5 = class30.field157[var2];
                    var6 = var5 & 0xFFFFFF7F;
                    break label16;
                }
            }
            var6 = -1;
        }
        if (var6 >= 0) {
            this.field138[var6] = false;
            this.field144.add(new class35(2, var6));
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
                        char[] var4 = class356.field4294;
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
                this.field144.add(new class35(3, var2));
            }
        }
        arg0.consume();
    }

    @ObfuscatedName("aj.j(I)V")
    public synchronized void method353() {
        Collection var1 = this.field137;
        this.field137 = this.field144;
        this.field144 = var1;
    }

    public final synchronized void focusGained(FocusEvent arg0) {
        this.field144.add(new class35(4, 1));
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        for (int var2 = 0; var2 < 112; var2++) {
            if (this.field138[var2]) {
                this.field138[var2] = false;
                this.field144.add(new class35(2, var2));
            }
        }
        this.field144.add(new class35(4, 0));
    }
}
