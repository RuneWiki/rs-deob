package deob;

import java.util.Iterator;

@ObfuscatedName("fh")
public class class180 implements Iterable {

    @ObfuscatedName("fh.k")
    public class186 field2863 = new class186();

    public class180() {
        this.field2863.field2875 = this.field2863;
        this.field2863.field2876 = this.field2863;
    }

    @ObfuscatedName("fh.k(Lgo;)V")
    public void method3232(class186 arg0) {
        if (arg0.field2876 != null) {
            arg0.method3275();
        }
        arg0.field2876 = this.field2863.field2876;
        arg0.field2875 = this.field2863;
        arg0.field2876.field2875 = arg0;
        arg0.field2875.field2876 = arg0;
    }

    @ObfuscatedName("fh.r()Lgo;")
    public class186 method3233() {
        return this.method3234((class186) null);
    }

    @ObfuscatedName("fh.y(Lgo;)Lgo;")
    public class186 method3234(class186 arg0) {
        class186 var2;
        if (arg0 == null) {
            var2 = this.field2863.field2875;
        } else {
            var2 = arg0;
        }
        return this.field2863 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class183(this);
    }
}
