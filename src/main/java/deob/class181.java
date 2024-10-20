package deob;

import java.util.Iterator;

@ObfuscatedName("ff")
public class class181 implements Iterable {

    @ObfuscatedName("ff.g")
    public class187 field2873 = new class187();

    public class181() {
        this.field2873.field2886 = this.field2873;
        this.field2873.field2887 = this.field2873;
    }

    @ObfuscatedName("ff.g(Lgf;)V")
    public void method3248(class187 arg0) {
        if (arg0.field2887 != null) {
            arg0.method3304();
        }
        arg0.field2887 = this.field2873.field2887;
        arg0.field2886 = this.field2873;
        arg0.field2887.field2886 = arg0;
        arg0.field2886.field2887 = arg0;
    }

    @ObfuscatedName("ff.i()Lgf;")
    public class187 method3243() {
        return this.method3244((class187) null);
    }

    @ObfuscatedName("ff.k(Lgf;)Lgf;")
    public class187 method3244(class187 arg0) {
        class187 var2;
        if (arg0 == null) {
            var2 = this.field2873.field2886;
        } else {
            var2 = arg0;
        }
        return this.field2873 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class184(this);
    }
}
