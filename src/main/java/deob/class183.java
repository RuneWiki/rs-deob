package deob;

import java.util.Iterator;

@ObfuscatedName("gl")
public class class183 implements Iterable {

    @ObfuscatedName("gl.e")
    public class189 field2882 = new class189();

    public class183() {
        this.field2882.field2895 = this.field2882;
        this.field2882.field2896 = this.field2882;
    }

    @ObfuscatedName("gl.e(Lgp;)V")
    public void method3274(class189 arg0) {
        if (arg0.field2896 != null) {
            arg0.method3324();
        }
        arg0.field2896 = this.field2882.field2896;
        arg0.field2895 = this.field2882;
        arg0.field2896.field2895 = arg0;
        arg0.field2895.field2896 = arg0;
    }

    @ObfuscatedName("gl.v()Lgp;")
    public class189 method3276() {
        return this.method3267((class189) null);
    }

    @ObfuscatedName("gl.k(Lgp;)Lgp;")
    public class189 method3267(class189 arg0) {
        class189 var2;
        if (arg0 == null) {
            var2 = this.field2882.field2895;
        } else {
            var2 = arg0;
        }
        return this.field2882 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class186(this);
    }
}
