package deob;

@ObfuscatedName("po")
public final class class419 {

    @ObfuscatedName("po.v")
    public int field4544;

    @ObfuscatedName("po.c")
    public class409[] field4545;

    @ObfuscatedName("po.i")
    public class409 field4543;

    @ObfuscatedName("po.f")
    public class409 field4542;

    @ObfuscatedName("po.b")
    public int field4541 = 0;

    public class419(int arg0) {
        this.field4544 = arg0;
        this.field4545 = new class409[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class409 var3 = this.field4545[var2] = new class409();
            var3.field4411 = var3;
            var3.field4412 = var3;
        }
    }

    @ObfuscatedName("po.v(J)Loq;")
    public class409 method6772(long arg0) {
        class409 var3 = this.field4545[(int) (arg0 & (long) (this.field4544 - 1))];
        for (this.field4543 = var3.field4411; this.field4543 != var3; this.field4543 = this.field4543.field4411) {
            if (this.field4543.field4410 == arg0) {
                class409 var4 = this.field4543;
                this.field4543 = this.field4543.field4411;
                return var4;
            }
        }
        this.field4543 = null;
        return null;
    }

    @ObfuscatedName("po.c(Loq;J)V")
    public void method6773(class409 arg0, long arg1) {
        if (arg0.field4412 != null) {
            arg0.method6503();
        }
        class409 var4 = this.field4545[(int) (arg1 & (long) (this.field4544 - 1))];
        arg0.field4412 = var4.field4412;
        arg0.field4411 = var4;
        arg0.field4412.field4411 = arg0;
        arg0.field4411.field4412 = arg0;
        arg0.field4410 = arg1;
    }

    @ObfuscatedName("po.i()Loq;")
    public class409 method6774() {
        this.field4541 = 0;
        return this.method6775();
    }

    @ObfuscatedName("po.f()Loq;")
    public class409 method6775() {
        if (this.field4541 > 0 && this.field4545[this.field4541 - 1] != this.field4542) {
            class409 var1 = this.field4542;
            this.field4542 = var1.field4411;
            return var1;
        }
        class409 var2;
        do {
            if (this.field4541 >= this.field4544) {
                return null;
            }
            var2 = this.field4545[this.field4541++].field4411;
        } while (this.field4545[this.field4541 - 1] == var2);
        this.field4542 = var2.field4411;
        return var2;
    }
}
