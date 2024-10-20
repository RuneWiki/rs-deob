package deob;

import java.util.Iterator;

@ObfuscatedName("fe")
public class class180 implements Iterable {

    @ObfuscatedName("fe.g")
    public class186 field2863 = new class186();

    public class180() {
        this.field2863.field2876 = this.field2863;
        this.field2863.field2877 = this.field2863;
    }

    @ObfuscatedName("fe.g(Lgc;)V")
    public void method3268(class186 arg0) {
        if (arg0.field2877 != null) {
            arg0.method3322();
        }
        arg0.field2877 = this.field2863.field2877;
        arg0.field2876 = this.field2863;
        arg0.field2877.field2876 = arg0;
        arg0.field2876.field2877 = arg0;
    }

    @ObfuscatedName("fe.v()Lgc;")
    public class186 method3270() {
        return this.method3271((class186) null);
    }

    @ObfuscatedName("fe.z(Lgc;)Lgc;")
    public class186 method3271(class186 arg0) {
        class186 var2;
        if (arg0 == null) {
            var2 = this.field2863.field2876;
        } else {
            var2 = arg0;
        }
        return this.field2863 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class183(this);
    }
}
