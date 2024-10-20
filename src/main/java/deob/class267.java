package deob;

import java.util.Iterator;

@ObfuscatedName("jb")
public class class267 implements Iterable {

    @ObfuscatedName("jb.c")
    public class176 field3541 = new class176();

    @ObfuscatedName("jb.t")
    public class176 field3542;

    public class267() {
        this.field3541.field2106 = this.field3541;
        this.field3541.field2107 = this.field3541;
    }

    @ObfuscatedName("jb.c()V")
    public void method4614() {
        while (this.field3541.field2106 != this.field3541) {
            this.field3541.field2106.method3342();
        }
    }

    @ObfuscatedName("jb.t(Lfa;)V")
    public void method4629(class176 arg0) {
        if (arg0.field2107 != null) {
            arg0.method3342();
        }
        arg0.field2107 = this.field3541.field2107;
        arg0.field2106 = this.field3541;
        arg0.field2107.field2106 = arg0;
        arg0.field2106.field2107 = arg0;
    }

    @ObfuscatedName("jb.o(Lfa;Lfa;)V")
    public static void method4616(class176 arg0, class176 arg1) {
        if (arg0.field2107 != null) {
            arg0.method3342();
        }
        arg0.field2107 = arg1;
        arg0.field2106 = arg1.field2106;
        arg0.field2107.field2106 = arg0;
        arg0.field2106.field2107 = arg0;
    }

    @ObfuscatedName("jb.e()Lfa;")
    public class176 method4613() {
        class176 var1 = this.field3541.field2106;
        if (this.field3541 == var1) {
            return null;
        } else {
            var1.method3342();
            return var1;
        }
    }

    @ObfuscatedName("jb.i()Lfa;")
    public class176 method4620() {
        return this.method4617((class176) null);
    }

    @ObfuscatedName("jb.g(Lfa;)Lfa;")
    public class176 method4617(class176 arg0) {
        class176 var2;
        if (arg0 == null) {
            var2 = this.field3541.field2106;
        } else {
            var2 = arg0;
        }
        if (this.field3541 == var2) {
            this.field3542 = null;
            return null;
        } else {
            this.field3542 = var2.field2106;
            return var2;
        }
    }

    @ObfuscatedName("jb.d()Lfa;")
    public class176 method4618() {
        class176 var1 = this.field3542;
        if (this.field3541 == var1) {
            this.field3542 = null;
            return null;
        } else {
            this.field3542 = var1.field2106;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class265(this);
    }
}
