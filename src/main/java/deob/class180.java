package deob;

import java.util.Iterator;

@ObfuscatedName("fh")
public class class180 implements Iterable {

    @ObfuscatedName("fh.e")
    public class186 field2860 = new class186();

    public class180() {
        this.field2860.field2873 = this.field2860;
        this.field2860.field2872 = this.field2860;
    }

    @ObfuscatedName("fh.e(Lgm;)V")
    public void method3157(class186 arg0) {
        if (arg0.field2872 != null) {
            arg0.method3204();
        }
        arg0.field2872 = this.field2860.field2872;
        arg0.field2873 = this.field2860;
        arg0.field2872.field2873 = arg0;
        arg0.field2873.field2872 = arg0;
    }

    @ObfuscatedName("fh.o()Lgm;")
    public class186 method3161() {
        return this.method3159((class186) null);
    }

    @ObfuscatedName("fh.y(Lgm;)Lgm;")
    public class186 method3159(class186 arg0) {
        class186 var2;
        if (arg0 == null) {
            var2 = this.field2860.field2873;
        } else {
            var2 = arg0;
        }
        return this.field2860 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class183(this);
    }
}
