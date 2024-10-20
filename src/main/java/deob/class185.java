package deob;

import java.util.Iterator;

@ObfuscatedName("gg")
public class class185 implements Iterable {

    @ObfuscatedName("gg.v")
    public class191 field2899 = new class191();

    public class185() {
        this.field2899.field2912 = this.field2899;
        this.field2899.field2913 = this.field2899;
    }

    @ObfuscatedName("gg.v(Lgu;)V")
    public void method3342(class191 arg0) {
        if (arg0.field2913 != null) {
            arg0.method3392();
        }
        arg0.field2913 = this.field2899.field2913;
        arg0.field2912 = this.field2899;
        arg0.field2913.field2912 = arg0;
        arg0.field2912.field2913 = arg0;
    }

    @ObfuscatedName("gg.t()Lgu;")
    public class191 method3343() {
        return this.method3344((class191) null);
    }

    @ObfuscatedName("gg.f(Lgu;)Lgu;")
    public class191 method3344(class191 arg0) {
        class191 var2;
        if (arg0 == null) {
            var2 = this.field2899.field2912;
        } else {
            var2 = arg0;
        }
        return this.field2899 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class188(this);
    }
}
