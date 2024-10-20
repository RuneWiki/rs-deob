package deob;

import java.util.Iterator;

@ObfuscatedName("ge")
public class class196 implements Iterable {

    @ObfuscatedName("ge.j")
    public class202 field3031 = new class202();

    public class196() {
        this.field3031.field3044 = this.field3031;
        this.field3031.field3045 = this.field3031;
    }

    @ObfuscatedName("ge.j(Lgz;)V")
    public void method3526(class202 arg0) {
        if (arg0.field3045 != null) {
            arg0.method3563();
        }
        arg0.field3045 = this.field3031.field3045;
        arg0.field3044 = this.field3031;
        arg0.field3045.field3044 = arg0;
        arg0.field3044.field3045 = arg0;
    }

    @ObfuscatedName("ge.y()Lgz;")
    public class202 method3528() {
        return this.method3529((class202) null);
    }

    @ObfuscatedName("ge.z(Lgz;)Lgz;")
    public class202 method3529(class202 arg0) {
        class202 var2;
        if (arg0 == null) {
            var2 = this.field3031.field3044;
        } else {
            var2 = arg0;
        }
        return this.field3031 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class199(this);
    }
}
