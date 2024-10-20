package deob;

import java.util.Iterator;

@ObfuscatedName("go")
public class class183 implements Iterable {

    @ObfuscatedName("go.l")
    public class189 field2873 = new class189();

    public class183() {
        this.field2873.field2885 = this.field2873;
        this.field2873.field2887 = this.field2873;
    }

    @ObfuscatedName("go.l(Lgv;)V")
    public void method3322(class189 arg0) {
        if (arg0.field2887 != null) {
            arg0.method3375();
        }
        arg0.field2887 = this.field2873.field2887;
        arg0.field2885 = this.field2873;
        arg0.field2887.field2885 = arg0;
        arg0.field2885.field2887 = arg0;
    }

    @ObfuscatedName("go.y()Lgv;")
    public class189 method3331() {
        return this.method3324((class189) null);
    }

    @ObfuscatedName("go.g(Lgv;)Lgv;")
    public class189 method3324(class189 arg0) {
        class189 var2;
        if (arg0 == null) {
            var2 = this.field2873.field2885;
        } else {
            var2 = arg0;
        }
        return this.field2873 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class186(this);
    }
}
