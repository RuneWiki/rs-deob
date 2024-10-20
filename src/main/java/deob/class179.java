package deob;

import java.util.Iterator;

@ObfuscatedName("fb")
public class class179 implements Iterable {

    @ObfuscatedName("fb.g")
    public class183 field2871 = new class183();

    public class179() {
        this.field2871.field2876 = this.field2871;
        this.field2871.field2875 = this.field2871;
    }

    @ObfuscatedName("fb.g()V")
    public void method3234() {
        while (this.field2871.field2876 != this.field2871) {
            this.field2871.field2876.method3272();
        }
    }

    @ObfuscatedName("fb.i(Lgy;)V")
    public void method3233(class183 arg0) {
        if (arg0.field2875 != null) {
            arg0.method3272();
        }
        arg0.field2875 = this.field2871.field2875;
        arg0.field2876 = this.field2871;
        arg0.field2875.field2876 = arg0;
        arg0.field2876.field2875 = arg0;
    }

    public Iterator iterator() {
        return new class185(this);
    }
}
