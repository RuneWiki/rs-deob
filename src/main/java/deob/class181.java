package deob;

import java.util.Iterator;

@ObfuscatedName("fk")
public class class181 implements Iterable {

    @ObfuscatedName("fk.g")
    public class187 field2870 = new class187();

    public class181() {
        this.field2870.field2883 = this.field2870;
        this.field2870.field2882 = this.field2870;
    }

    @ObfuscatedName("fk.g(Lgz;)V")
    public void method3228(class187 arg0) {
        if (arg0.field2882 != null) {
            arg0.method3285();
        }
        arg0.field2882 = this.field2870.field2882;
        arg0.field2883 = this.field2870;
        arg0.field2882.field2883 = arg0;
        arg0.field2883.field2882 = arg0;
    }

    @ObfuscatedName("fk.s()Lgz;")
    public class187 method3227() {
        return this.method3230((class187) null);
    }

    @ObfuscatedName("fk.v(Lgz;)Lgz;")
    public class187 method3230(class187 arg0) {
        class187 var2;
        if (arg0 == null) {
            var2 = this.field2870.field2883;
        } else {
            var2 = arg0;
        }
        return this.field2870 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class184(this);
    }
}
