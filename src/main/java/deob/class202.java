package deob;

import java.util.Iterator;

@ObfuscatedName("gq")
public class class202 implements Iterable {

    @ObfuscatedName("gq.z")
    public class208 field3089 = new class208();

    public class202() {
        this.field3089.field3101 = this.field3089;
        this.field3089.field3103 = this.field3089;
    }

    @ObfuscatedName("gq.z(Lgk;)V")
    public void method3535(class208 arg0) {
        if (arg0.field3103 != null) {
            arg0.method3583();
        }
        arg0.field3103 = this.field3089.field3103;
        arg0.field3101 = this.field3089;
        arg0.field3103.field3101 = arg0;
        arg0.field3101.field3103 = arg0;
    }

    @ObfuscatedName("gq.q()Lgk;")
    public class208 method3541() {
        return this.method3536((class208) null);
    }

    @ObfuscatedName("gq.k(Lgk;)Lgk;")
    public class208 method3536(class208 arg0) {
        class208 var2;
        if (arg0 == null) {
            var2 = this.field3089.field3101;
        } else {
            var2 = arg0;
        }
        return this.field3089 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class205(this);
    }
}
