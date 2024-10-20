package deob;

import java.util.Iterator;

@ObfuscatedName("mc")
public class class361 implements Iterable {

    @ObfuscatedName("mc.f")
    public class435 field4356 = new class435();

    @ObfuscatedName("mc.w")
    public class435 field4357;

    public class361() {
        this.field4356.field4702 = this.field4356;
        this.field4356.field4703 = this.field4356;
    }

    @ObfuscatedName("mc.f()V")
    public void method6370() {
        while (this.field4356.field4702 != this.field4356) {
            this.field4356.field4702.method7429();
        }
    }

    @ObfuscatedName("mc.w(Lpi;)V")
    public void method6371(class435 arg0) {
        if (arg0.field4703 != null) {
            arg0.method7429();
        }
        arg0.field4703 = this.field4356.field4703;
        arg0.field4702 = this.field4356;
        arg0.field4703.field4702 = arg0;
        arg0.field4702.field4703 = arg0;
    }

    @ObfuscatedName("mc.v(Lpi;Lpi;)V")
    public static void method6372(class435 arg0, class435 arg1) {
        if (arg0.field4703 != null) {
            arg0.method7429();
        }
        arg0.field4703 = arg1;
        arg0.field4702 = arg1.field4702;
        arg0.field4703.field4702 = arg0;
        arg0.field4702.field4703 = arg0;
    }

    @ObfuscatedName("mc.s()Lpi;")
    public class435 method6373() {
        class435 var1 = this.field4356.field4702;
        if (this.field4356 == var1) {
            return null;
        } else {
            var1.method7429();
            return var1;
        }
    }

    @ObfuscatedName("mc.z()Lpi;")
    public class435 method6374() {
        return this.method6380((class435) null);
    }

    @ObfuscatedName("mc.j(Lpi;)Lpi;")
    public class435 method6380(class435 arg0) {
        class435 var2;
        if (arg0 == null) {
            var2 = this.field4356.field4702;
        } else {
            var2 = arg0;
        }
        if (this.field4356 == var2) {
            this.field4357 = null;
            return null;
        } else {
            this.field4357 = var2.field4702;
            return var2;
        }
    }

    @ObfuscatedName("mc.i()Lpi;")
    public class435 method6376() {
        class435 var1 = this.field4357;
        if (this.field4356 == var1) {
            this.field4357 = null;
            return null;
        } else {
            this.field4357 = var1.field4702;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class360(this);
    }
}
