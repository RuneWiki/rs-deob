package deob;

import java.util.Iterator;

@ObfuscatedName("fq")
public class class180 implements Iterable {

    @ObfuscatedName("fq.e")
    public class186 field2853 = new class186();

    public class180() {
        this.field2853.field2865 = this.field2853;
        this.field2853.field2866 = this.field2853;
    }

    @ObfuscatedName("fq.e(Lgc;)V")
    public void method3229(class186 arg0) {
        if (arg0.field2866 != null) {
            arg0.method3273();
        }
        arg0.field2866 = this.field2853.field2866;
        arg0.field2865 = this.field2853;
        arg0.field2866.field2865 = arg0;
        arg0.field2865.field2866 = arg0;
    }

    @ObfuscatedName("fq.v()Lgc;")
    public class186 method3228() {
        return this.method3231((class186) null);
    }

    @ObfuscatedName("fq.i(Lgc;)Lgc;")
    public class186 method3231(class186 arg0) {
        class186 var2;
        if (arg0 == null) {
            var2 = this.field2853.field2865;
        } else {
            var2 = arg0;
        }
        return this.field2853 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class183(this);
    }
}
