package deob;

import java.util.Iterator;

@ObfuscatedName("fh")
public class class180 implements Iterable {

    @ObfuscatedName("fh.i")
    public class186 field2857 = new class186();

    public class180() {
        this.field2857.field2870 = this.field2857;
        this.field2857.field2869 = this.field2857;
    }

    @ObfuscatedName("fh.i(Lgq;)V")
    public void method3283(class186 arg0) {
        if (arg0.field2869 != null) {
            arg0.method3334();
        }
        arg0.field2869 = this.field2857.field2869;
        arg0.field2870 = this.field2857;
        arg0.field2869.field2870 = arg0;
        arg0.field2870.field2869 = arg0;
    }

    @ObfuscatedName("fh.c()Lgq;")
    public class186 method3284() {
        return this.method3285((class186) null);
    }

    @ObfuscatedName("fh.h(Lgq;)Lgq;")
    public class186 method3285(class186 arg0) {
        class186 var2;
        if (arg0 == null) {
            var2 = this.field2857.field2870;
        } else {
            var2 = arg0;
        }
        return this.field2857 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class183(this);
    }
}
