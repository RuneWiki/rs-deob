package deob;

import java.util.Iterator;

@ObfuscatedName("gn")
public class class202 implements Iterable {

    @ObfuscatedName("gn.d")
    public class208 field3093 = new class208();

    public class202() {
        this.field3093.field3105 = this.field3093;
        this.field3093.field3106 = this.field3093;
    }

    @ObfuscatedName("gn.d(Lgj;)V")
    public void method3650(class208 arg0) {
        if (arg0.field3106 != null) {
            arg0.method3715();
        }
        arg0.field3106 = this.field3093.field3106;
        arg0.field3105 = this.field3093;
        arg0.field3106.field3105 = arg0;
        arg0.field3105.field3106 = arg0;
    }

    @ObfuscatedName("gn.p()Lgj;")
    public class208 method3651() {
        return this.method3652((class208) null);
    }

    @ObfuscatedName("gn.v(Lgj;)Lgj;")
    public class208 method3652(class208 arg0) {
        class208 var2;
        if (arg0 == null) {
            var2 = this.field3093.field3105;
        } else {
            var2 = arg0;
        }
        return this.field3093 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class205(this);
    }
}
