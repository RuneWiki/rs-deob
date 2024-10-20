package deob;

import java.util.Iterator;

@ObfuscatedName("gv")
public class class202 implements Iterable {

    @ObfuscatedName("gv.h")
    public class208 field3088 = new class208();

    public class202() {
        this.field3088.field3101 = this.field3088;
        this.field3088.field3102 = this.field3088;
    }

    @ObfuscatedName("gv.h(Lgr;)V")
    public void method3585(class208 arg0) {
        if (arg0.field3102 != null) {
            arg0.method3625();
        }
        arg0.field3102 = this.field3088.field3102;
        arg0.field3101 = this.field3088;
        arg0.field3102.field3101 = arg0;
        arg0.field3101.field3102 = arg0;
    }

    @ObfuscatedName("gv.m()Lgr;")
    public class208 method3580() {
        return this.method3581((class208) null);
    }

    @ObfuscatedName("gv.i(Lgr;)Lgr;")
    public class208 method3581(class208 arg0) {
        class208 var2;
        if (arg0 == null) {
            var2 = this.field3088.field3101;
        } else {
            var2 = arg0;
        }
        return this.field3088 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class205(this);
    }
}
