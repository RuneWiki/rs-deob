package deob;

import java.util.Iterator;

@ObfuscatedName("gj")
public class class203 implements Iterable {

    @ObfuscatedName("gj.i")
    public class196 field2493 = new class196();

    public class203() {
        this.field2493.field2478 = this.field2493;
        this.field2493.field2479 = this.field2493;
    }

    @ObfuscatedName("gj.i()V")
    public void method3481() {
        while (this.field2493.field2478 != this.field2493) {
            this.field2493.field2478.method3445();
        }
    }

    @ObfuscatedName("gj.j(Lgo;)V")
    public void method3480(class196 arg0) {
        if (arg0.field2479 != null) {
            arg0.method3445();
        }
        arg0.field2479 = this.field2493.field2479;
        arg0.field2478 = this.field2493;
        arg0.field2479.field2478 = arg0;
        arg0.field2478.field2479 = arg0;
    }

    public Iterator iterator() {
        return new class202(this);
    }
}
