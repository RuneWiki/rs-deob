package deob;

import java.util.Iterator;

@ObfuscatedName("gf")
public class class185 implements Iterable {

    @ObfuscatedName("gf.b")
    public class191 field2892 = new class191();

    public class185() {
        this.field2892.field2904 = this.field2892;
        this.field2892.field2906 = this.field2892;
    }

    @ObfuscatedName("gf.b(Lgx;)V")
    public void method3332(class191 arg0) {
        if (arg0.field2906 != null) {
            arg0.method3392();
        }
        arg0.field2906 = this.field2892.field2906;
        arg0.field2904 = this.field2892;
        arg0.field2906.field2904 = arg0;
        arg0.field2904.field2906 = arg0;
    }

    @ObfuscatedName("gf.e()Lgx;")
    public class191 method3333() {
        return this.method3334((class191) null);
    }

    @ObfuscatedName("gf.i(Lgx;)Lgx;")
    public class191 method3334(class191 arg0) {
        class191 var2;
        if (arg0 == null) {
            var2 = this.field2892.field2904;
        } else {
            var2 = arg0;
        }
        return this.field2892 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class188(this);
    }
}
