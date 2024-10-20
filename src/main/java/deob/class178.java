package deob;

import java.util.Iterator;

@ObfuscatedName("fe")
public class class178 implements Iterable {

    @ObfuscatedName("fe.k")
    public class182 field2852 = new class182();

    public class178() {
        this.field2852.field2856 = this.field2852;
        this.field2852.field2857 = this.field2852;
    }

    @ObfuscatedName("fe.k()V")
    public void method3256() {
        while (this.field2852.field2856 != this.field2852) {
            this.field2852.field2856.method3302();
        }
    }

    @ObfuscatedName("fe.b(Lfl;)V")
    public void method3257(class182 arg0) {
        if (arg0.field2857 != null) {
            arg0.method3302();
        }
        arg0.field2857 = this.field2852.field2857;
        arg0.field2856 = this.field2852;
        arg0.field2857.field2856 = arg0;
        arg0.field2856.field2857 = arg0;
    }

    public Iterator iterator() {
        return new class184(this);
    }
}
