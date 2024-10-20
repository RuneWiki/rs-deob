package deob;

import java.util.Iterator;

@ObfuscatedName("gx")
public class class202 implements Iterable {

    @ObfuscatedName("gx.h")
    public class208 field3081 = new class208();

    public class202() {
        this.field3081.field3094 = this.field3081;
        this.field3081.field3095 = this.field3081;
    }

    @ObfuscatedName("gx.h(Lgm;)V")
    public void method3654(class208 arg0) {
        if (arg0.field3095 != null) {
            arg0.method3711();
        }
        arg0.field3095 = this.field3081.field3095;
        arg0.field3094 = this.field3081;
        arg0.field3095.field3094 = arg0;
        arg0.field3094.field3095 = arg0;
    }

    @ObfuscatedName("gx.q()Lgm;")
    public class208 method3656() {
        return this.method3660((class208) null);
    }

    @ObfuscatedName("gx.v(Lgm;)Lgm;")
    public class208 method3660(class208 arg0) {
        class208 var2;
        if (arg0 == null) {
            var2 = this.field3081.field3094;
        } else {
            var2 = arg0;
        }
        return this.field3081 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class205(this);
    }
}
