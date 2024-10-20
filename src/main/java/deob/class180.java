package deob;

import java.util.Iterator;

@ObfuscatedName("fs")
public class class180 implements Iterable {

    @ObfuscatedName("fs.t")
    public class186 field2851 = new class186();

    public class180() {
        this.field2851.field2863 = this.field2851;
        this.field2851.field2865 = this.field2851;
    }

    @ObfuscatedName("fs.t(Lgm;)V")
    public void method3279(class186 arg0) {
        if (arg0.field2865 != null) {
            arg0.method3316();
        }
        arg0.field2865 = this.field2851.field2865;
        arg0.field2863 = this.field2851;
        arg0.field2865.field2863 = arg0;
        arg0.field2863.field2865 = arg0;
    }

    @ObfuscatedName("fs.s()Lgm;")
    public class186 method3274() {
        return this.method3275((class186) null);
    }

    @ObfuscatedName("fs.f(Lgm;)Lgm;")
    public class186 method3275(class186 arg0) {
        class186 var2;
        if (arg0 == null) {
            var2 = this.field2851.field2863;
        } else {
            var2 = arg0;
        }
        return this.field2851 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class183(this);
    }
}
