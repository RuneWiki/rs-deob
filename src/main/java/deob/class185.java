package deob;

import java.util.Iterator;

@ObfuscatedName("gl")
public class class185 implements Iterable {

    @ObfuscatedName("gl.p")
    public class191 field2889 = new class191();

    public class185() {
        this.field2889.field2902 = this.field2889;
        this.field2889.field2901 = this.field2889;
    }

    @ObfuscatedName("gl.p(Lgu;)V")
    public void method3304(class191 arg0) {
        if (arg0.field2901 != null) {
            arg0.method3358();
        }
        arg0.field2901 = this.field2889.field2901;
        arg0.field2902 = this.field2889;
        arg0.field2901.field2902 = arg0;
        arg0.field2902.field2901 = arg0;
    }

    @ObfuscatedName("gl.y()Lgu;")
    public class191 method3308() {
        return this.method3305((class191) null);
    }

    @ObfuscatedName("gl.d(Lgu;)Lgu;")
    public class191 method3305(class191 arg0) {
        class191 var2;
        if (arg0 == null) {
            var2 = this.field2889.field2902;
        } else {
            var2 = arg0;
        }
        return this.field2889 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class188(this);
    }
}
