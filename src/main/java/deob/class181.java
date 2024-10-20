package deob;

import java.util.Iterator;

@ObfuscatedName("fd")
public class class181 implements Iterable {

    @ObfuscatedName("fd.k")
    public class187 field2865 = new class187();

    public class181() {
        this.field2865.field2878 = this.field2865;
        this.field2865.field2877 = this.field2865;
    }

    @ObfuscatedName("fd.k(Lgk;)V")
    public void method3318(class187 arg0) {
        if (arg0.field2877 != null) {
            arg0.method3365();
        }
        arg0.field2877 = this.field2865.field2877;
        arg0.field2878 = this.field2865;
        arg0.field2877.field2878 = arg0;
        arg0.field2878.field2877 = arg0;
    }

    @ObfuscatedName("fd.y()Lgk;")
    public class187 method3319() {
        return this.method3325((class187) null);
    }

    @ObfuscatedName("fd.s(Lgk;)Lgk;")
    public class187 method3325(class187 arg0) {
        class187 var2;
        if (arg0 == null) {
            var2 = this.field2865.field2878;
        } else {
            var2 = arg0;
        }
        return this.field2865 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class184(this);
    }
}
