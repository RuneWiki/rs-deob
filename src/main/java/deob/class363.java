package deob;

import java.util.Iterator;

@ObfuscatedName("mc")
public final class class363 implements Iterable {

    @ObfuscatedName("mc.s")
    public int field4104;

    @ObfuscatedName("mc.t")
    public class354[] field4102;

    @ObfuscatedName("mc.v")
    public class354 field4103;

    @ObfuscatedName("mc.j")
    public class354 field4101;

    @ObfuscatedName("mc.l")
    public int field4105 = 0;

    public class363(int arg0) {
        this.field4104 = arg0;
        this.field4102 = new class354[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class354 var3 = this.field4102[var2] = new class354();
            var3.field3965 = var3;
            var3.field3967 = var3;
        }
    }

    @ObfuscatedName("mc.s(J)Lml;")
    public class354 method5726(long arg0) {
        class354 var3 = this.field4102[(int) (arg0 & (long) (this.field4104 - 1))];
        for (this.field4103 = var3.field3965; this.field4103 != var3; this.field4103 = this.field4103.field3965) {
            if (this.field4103.field3966 == arg0) {
                class354 var4 = this.field4103;
                this.field4103 = this.field4103.field3965;
                return var4;
            }
        }
        this.field4103 = null;
        return null;
    }

    @ObfuscatedName("mc.t(Lml;J)V")
    public void method5737(class354 arg0, long arg1) {
        if (arg0.field3967 != null) {
            arg0.method5447();
        }
        class354 var4 = this.field4102[(int) (arg1 & (long) (this.field4104 - 1))];
        arg0.field3967 = var4.field3967;
        arg0.field3965 = var4;
        arg0.field3967.field3965 = arg0;
        arg0.field3965.field3967 = arg0;
        arg0.field3966 = arg1;
    }

    @ObfuscatedName("mc.v()V")
    public void method5725() {
        for (int var1 = 0; var1 < this.field4104; var1++) {
            class354 var2 = this.field4102[var1];
            while (true) {
                class354 var3 = var2.field3965;
                if (var2 == var3) {
                    break;
                }
                var3.method5447();
            }
        }
        this.field4103 = null;
        this.field4101 = null;
    }

    @ObfuscatedName("mc.j()Lml;")
    public class354 method5729() {
        this.field4105 = 0;
        return this.method5730();
    }

    @ObfuscatedName("mc.l()Lml;")
    public class354 method5730() {
        if (this.field4105 > 0 && this.field4102[this.field4105 - 1] != this.field4101) {
            class354 var1 = this.field4101;
            this.field4101 = var1.field3965;
            return var1;
        }
        class354 var2;
        do {
            if (this.field4105 >= this.field4104) {
                return null;
            }
            var2 = this.field4102[this.field4105++].field3965;
        } while (this.field4102[this.field4105 - 1] == var2);
        this.field4101 = var2.field3965;
        return var2;
    }

    public Iterator iterator() {
        return new class362(this);
    }
}
