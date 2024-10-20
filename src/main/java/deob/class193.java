package deob;

import java.util.Iterator;

@ObfuscatedName("gj")
public class class193 implements Iterable {

    @ObfuscatedName("gj.p")
    public class199 field3002 = new class199();

    public class193() {
        this.field3002.field3014 = this.field3002;
        this.field3002.field3016 = this.field3002;
    }

    @ObfuscatedName("gj.p(Lgl;)V")
    public void method3492(class199 arg0) {
        if (arg0.field3016 != null) {
            arg0.method3533();
        }
        arg0.field3016 = this.field3002.field3016;
        arg0.field3014 = this.field3002;
        arg0.field3016.field3014 = arg0;
        arg0.field3014.field3016 = arg0;
    }

    @ObfuscatedName("gj.k()Lgl;")
    public class199 method3485() {
        return this.method3484((class199) null);
    }

    @ObfuscatedName("gj.e(Lgl;)Lgl;")
    public class199 method3484(class199 arg0) {
        class199 var2;
        if (arg0 == null) {
            var2 = this.field3002.field3014;
        } else {
            var2 = arg0;
        }
        return this.field3002 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class196(this);
    }
}
