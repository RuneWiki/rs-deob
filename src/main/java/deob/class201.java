package deob;

import java.util.Iterator;

@ObfuscatedName("gb")
public class class201 implements Iterable {

    @ObfuscatedName("gb.j")
    public class205 field3109 = new class205();

    public class201() {
        this.field3109.field3113 = this.field3109;
        this.field3109.field3114 = this.field3109;
    }

    @ObfuscatedName("gb.j()V")
    public void method3569() {
        while (this.field3109.field3113 != this.field3109) {
            this.field3109.field3113.method3619();
        }
    }

    @ObfuscatedName("gb.h(Lgt;)V")
    public void method3578(class205 arg0) {
        if (arg0.field3114 != null) {
            arg0.method3619();
        }
        arg0.field3114 = this.field3109.field3114;
        arg0.field3113 = this.field3109;
        arg0.field3114.field3113 = arg0;
        arg0.field3113.field3114 = arg0;
    }

    public Iterator iterator() {
        return new class207(this);
    }
}
