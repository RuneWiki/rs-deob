package deob;

import java.util.Iterator;

@ObfuscatedName("gy")
public class class183 implements Iterable {

    @ObfuscatedName("gy.g")
    public class189 field2873 = new class189();

    public class183() {
        this.field2873.field2886 = this.field2873;
        this.field2873.field2885 = this.field2873;
    }

    @ObfuscatedName("gy.g(Lgn;)V")
    public void method3212(class189 arg0) {
        if (arg0.field2885 != null) {
            arg0.method3259();
        }
        arg0.field2885 = this.field2873.field2885;
        arg0.field2886 = this.field2873;
        arg0.field2885.field2886 = arg0;
        arg0.field2886.field2885 = arg0;
    }

    @ObfuscatedName("gy.j()Lgn;")
    public class189 method3213() {
        return this.method3216((class189) null);
    }

    @ObfuscatedName("gy.z(Lgn;)Lgn;")
    public class189 method3216(class189 arg0) {
        class189 var2;
        if (arg0 == null) {
            var2 = this.field2873.field2886;
        } else {
            var2 = arg0;
        }
        return this.field2873 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class186(this);
    }
}
