package deob;

import java.util.Iterator;

@ObfuscatedName("fm")
public class class180 implements Iterable {

    @ObfuscatedName("fm.k")
    public class186 field2854 = new class186();

    public class180() {
        this.field2854.field2866 = this.field2854;
        this.field2854.field2868 = this.field2854;
    }

    @ObfuscatedName("fm.k(Lgy;)V")
    public void method3278(class186 arg0) {
        if (arg0.field2868 != null) {
            arg0.method3321();
        }
        arg0.field2868 = this.field2854.field2868;
        arg0.field2866 = this.field2854;
        arg0.field2868.field2866 = arg0;
        arg0.field2866.field2868 = arg0;
    }

    @ObfuscatedName("fm.b()Lgy;")
    public class186 method3266() {
        return this.method3267((class186) null);
    }

    @ObfuscatedName("fm.e(Lgy;)Lgy;")
    public class186 method3267(class186 arg0) {
        class186 var2;
        if (arg0 == null) {
            var2 = this.field2854.field2866;
        } else {
            var2 = arg0;
        }
        return this.field2854 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class183(this);
    }
}
