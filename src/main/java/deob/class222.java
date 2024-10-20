package deob;

import java.util.Iterator;

@ObfuscatedName("ha")
public class class222 implements Iterable {

    @ObfuscatedName("ha.b")
    public class215 field2631 = new class215();

    public class222() {
        this.field2631.field2616 = this.field2631;
        this.field2631.field2617 = this.field2631;
    }

    @ObfuscatedName("ha.b()V")
    public void method3800() {
        while (this.field2631.field2616 != this.field2631) {
            this.field2631.field2616.method3766();
        }
    }

    @ObfuscatedName("ha.q(Lht;)V")
    public void method3801(class215 arg0) {
        if (arg0.field2617 != null) {
            arg0.method3766();
        }
        arg0.field2617 = this.field2631.field2617;
        arg0.field2616 = this.field2631;
        arg0.field2617.field2616 = arg0;
        arg0.field2616.field2617 = arg0;
    }

    public Iterator iterator() {
        return new class221(this);
    }
}
