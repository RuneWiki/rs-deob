package deob;

import java.util.Iterator;

@ObfuscatedName("gz")
public class class193 implements Iterable {

    @ObfuscatedName("gz.n")
    public class199 field2995 = new class199();

    public class193() {
        this.field2995.field3008 = this.field2995;
        this.field2995.field3009 = this.field2995;
    }

    @ObfuscatedName("gz.n(Lga;)V")
    public void method3519(class199 arg0) {
        if (arg0.field3009 != null) {
            arg0.method3562();
        }
        arg0.field3009 = this.field2995.field3009;
        arg0.field3008 = this.field2995;
        arg0.field3009.field3008 = arg0;
        arg0.field3008.field3009 = arg0;
    }

    @ObfuscatedName("gz.d()Lga;")
    public class199 method3514() {
        return this.method3515((class199) null);
    }

    @ObfuscatedName("gz.z(Lga;)Lga;")
    public class199 method3515(class199 arg0) {
        class199 var2;
        if (arg0 == null) {
            var2 = this.field2995.field3008;
        } else {
            var2 = arg0;
        }
        return this.field2995 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class196(this);
    }
}
