package deob;

import java.util.Iterator;

@ObfuscatedName("ff")
public class class179 implements Iterable {

    @ObfuscatedName("ff.g")
    public class183 field2858 = new class183();

    public class179() {
        this.field2858.field2863 = this.field2858;
        this.field2858.field2862 = this.field2858;
    }

    @ObfuscatedName("ff.g()V")
    public void method3219() {
        while (this.field2858.field2863 != this.field2858) {
            this.field2858.field2863.method3260();
        }
    }

    @ObfuscatedName("ff.s(Lgc;)V")
    public void method3220(class183 arg0) {
        if (arg0.field2862 != null) {
            arg0.method3260();
        }
        arg0.field2862 = this.field2858.field2862;
        arg0.field2863 = this.field2858;
        arg0.field2862.field2863 = arg0;
        arg0.field2863.field2862 = arg0;
    }

    public Iterator iterator() {
        return new class185(this);
    }
}
