package deob;

import java.util.Iterator;

@ObfuscatedName("gh")
public class class183 implements Iterable {

    @ObfuscatedName("gh.x")
    public class189 field2868 = new class189();

    public class183() {
        this.field2868.field2881 = this.field2868;
        this.field2868.field2880 = this.field2868;
    }

    @ObfuscatedName("gh.x(Lgs;)V")
    public void method3289(class189 arg0) {
        if (arg0.field2880 != null) {
            arg0.method3352();
        }
        arg0.field2880 = this.field2868.field2880;
        arg0.field2881 = this.field2868;
        arg0.field2880.field2881 = arg0;
        arg0.field2881.field2880 = arg0;
    }

    @ObfuscatedName("gh.v()Lgs;")
    public class189 method3296() {
        return this.method3291((class189) null);
    }

    @ObfuscatedName("gh.m(Lgs;)Lgs;")
    public class189 method3291(class189 arg0) {
        class189 var2;
        if (arg0 == null) {
            var2 = this.field2868.field2881;
        } else {
            var2 = arg0;
        }
        return this.field2868 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class186(this);
    }
}
