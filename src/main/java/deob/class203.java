package deob;

import java.util.Iterator;

@ObfuscatedName("gt")
public class class203 implements Iterable {

    @ObfuscatedName("gt.j")
    public class196 field2488 = new class196();

    public class203() {
        this.field2488.field2473 = this.field2488;
        this.field2488.field2474 = this.field2488;
    }

    @ObfuscatedName("gt.j()V")
    public void method3380() {
        while (this.field2488.field2473 != this.field2488) {
            this.field2488.field2473.method3350();
        }
    }

    @ObfuscatedName("gt.h(Lge;)V")
    public void method3383(class196 arg0) {
        if (arg0.field2474 != null) {
            arg0.method3350();
        }
        arg0.field2474 = this.field2488.field2474;
        arg0.field2473 = this.field2488;
        arg0.field2474.field2473 = arg0;
        arg0.field2473.field2474 = arg0;
    }

    public Iterator iterator() {
        return new class202(this);
    }
}
