package deob;

import java.util.Iterator;

@ObfuscatedName("fe")
public class class180 implements Iterable {

    @ObfuscatedName("fe.t")
    public class186 field2852 = new class186();

    public class180() {
        this.field2852.field2864 = this.field2852;
        this.field2852.field2865 = this.field2852;
    }

    @ObfuscatedName("fe.t(Lgh;)V")
    public void method3213(class186 arg0) {
        if (arg0.field2865 != null) {
            arg0.method3261();
        }
        arg0.field2865 = this.field2852.field2865;
        arg0.field2864 = this.field2852;
        arg0.field2865.field2864 = arg0;
        arg0.field2864.field2865 = arg0;
    }

    @ObfuscatedName("fe.o()Lgh;")
    public class186 method3222() {
        return this.method3215((class186) null);
    }

    @ObfuscatedName("fe.i(Lgh;)Lgh;")
    public class186 method3215(class186 arg0) {
        class186 var2;
        if (arg0 == null) {
            var2 = this.field2852.field2864;
        } else {
            var2 = arg0;
        }
        return this.field2852 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class183(this);
    }
}
