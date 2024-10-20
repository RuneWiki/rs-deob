package deob;

import java.util.Iterator;

@ObfuscatedName("go")
public class class202 implements Iterable {

    @ObfuscatedName("go.y")
    public class208 field3079 = new class208();

    public class202() {
        this.field3079.field3092 = this.field3079;
        this.field3079.field3093 = this.field3079;
    }

    @ObfuscatedName("go.y(Lgx;)V")
    public void method3533(class208 arg0) {
        if (arg0.field3093 != null) {
            arg0.method3588();
        }
        arg0.field3093 = this.field3079.field3093;
        arg0.field3092 = this.field3079;
        arg0.field3093.field3092 = arg0;
        arg0.field3092.field3093 = arg0;
    }

    @ObfuscatedName("go.d()Lgx;")
    public class208 method3540() {
        return this.method3535((class208) null);
    }

    @ObfuscatedName("go.g(Lgx;)Lgx;")
    public class208 method3535(class208 arg0) {
        class208 var2;
        if (arg0 == null) {
            var2 = this.field3079.field3092;
        } else {
            var2 = arg0;
        }
        return this.field3079 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class205(this);
    }
}
