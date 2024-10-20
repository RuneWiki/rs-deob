package deob;

import java.util.Iterator;

@ObfuscatedName("gy")
public class class193 implements Iterable {

    @ObfuscatedName("gy.b")
    public class199 field2993 = new class199();

    public class193() {
        this.field2993.field3005 = this.field2993;
        this.field2993.field3007 = this.field2993;
    }

    @ObfuscatedName("gy.b(Lgv;)V")
    public void method3364(class199 arg0) {
        if (arg0.field3007 != null) {
            arg0.method3414();
        }
        arg0.field3007 = this.field2993.field3007;
        arg0.field3005 = this.field2993;
        arg0.field3007.field3005 = arg0;
        arg0.field3005.field3007 = arg0;
    }

    @ObfuscatedName("gy.e()Lgv;")
    public class199 method3365() {
        return this.method3366((class199) null);
    }

    @ObfuscatedName("gy.a(Lgv;)Lgv;")
    public class199 method3366(class199 arg0) {
        class199 var2;
        if (arg0 == null) {
            var2 = this.field2993.field3005;
        } else {
            var2 = arg0;
        }
        return this.field2993 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class196(this);
    }
}
