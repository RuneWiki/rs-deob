package deob;

import java.util.Iterator;

@ObfuscatedName("hb")
public class class218 implements Iterable {

    @ObfuscatedName("hb.v")
    public class209 field2487 = new class209();

    @ObfuscatedName("hb.s")
    public class209 field2486;

    public class218() {
        this.field2487.field2469 = this.field2487;
        this.field2487.field2470 = this.field2487;
    }

    @ObfuscatedName("hb.v()V")
    public void method3875() {
        while (this.field2487.field2469 != this.field2487) {
            this.field2487.field2469.method3826();
        }
    }

    @ObfuscatedName("hb.s(Lhl;)V")
    public void method3860(class209 arg0) {
        if (arg0.field2470 != null) {
            arg0.method3826();
        }
        arg0.field2470 = this.field2487.field2470;
        arg0.field2469 = this.field2487;
        arg0.field2470.field2469 = arg0;
        arg0.field2469.field2470 = arg0;
    }

    @ObfuscatedName("hb.o()Lhl;")
    public class209 method3862() {
        class209 var1 = this.field2487.field2469;
        if (this.field2487 == var1) {
            return null;
        } else {
            var1.method3826();
            return var1;
        }
    }

    @ObfuscatedName("hb.k()Lhl;")
    public class209 method3863() {
        return this.method3859((class209) null);
    }

    @ObfuscatedName("hb.u(Lhl;)Lhl;")
    public class209 method3859(class209 arg0) {
        class209 var2;
        if (arg0 == null) {
            var2 = this.field2487.field2469;
        } else {
            var2 = arg0;
        }
        if (this.field2487 == var2) {
            this.field2486 = null;
            return null;
        } else {
            this.field2486 = var2.field2469;
            return var2;
        }
    }

    @ObfuscatedName("hb.i()Lhl;")
    public class209 method3867() {
        class209 var1 = this.field2486;
        if (this.field2487 == var1) {
            this.field2486 = null;
            return null;
        } else {
            this.field2486 = var1.field2469;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class217(this);
    }
}
