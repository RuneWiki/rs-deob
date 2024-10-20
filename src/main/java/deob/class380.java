package deob;

@ObfuscatedName("nq")
public final class class380 {

    @ObfuscatedName("nq.i")
    public int field4214;

    @ObfuscatedName("nq.w")
    public class370[] field4215;

    @ObfuscatedName("nq.s")
    public class370 field4216;

    @ObfuscatedName("nq.a")
    public class370 field4217;

    @ObfuscatedName("nq.o")
    public int field4218 = 0;

    public class380(int arg0) {
        this.field4214 = arg0;
        this.field4215 = new class370[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class370 var3 = this.field4215[var2] = new class370();
            var3.field4074 = var3;
            var3.field4076 = var3;
        }
    }

    @ObfuscatedName("nq.i(J)Lns;")
    public class370 method6034(long arg0) {
        class370 var3 = this.field4215[(int) (arg0 & (long) (this.field4214 - 1))];
        for (this.field4216 = var3.field4074; this.field4216 != var3; this.field4216 = this.field4216.field4074) {
            if (this.field4216.field4075 == arg0) {
                class370 var4 = this.field4216;
                this.field4216 = this.field4216.field4074;
                return var4;
            }
        }
        this.field4216 = null;
        return null;
    }

    @ObfuscatedName("nq.w(Lns;J)V")
    public void method6027(class370 arg0, long arg1) {
        if (arg0.field4076 != null) {
            arg0.method5752();
        }
        class370 var4 = this.field4215[(int) (arg1 & (long) (this.field4214 - 1))];
        arg0.field4076 = var4.field4076;
        arg0.field4074 = var4;
        arg0.field4076.field4074 = arg0;
        arg0.field4074.field4076 = arg0;
        arg0.field4075 = arg1;
    }

    @ObfuscatedName("nq.s()Lns;")
    public class370 method6028() {
        this.field4218 = 0;
        return this.method6029();
    }

    @ObfuscatedName("nq.a()Lns;")
    public class370 method6029() {
        if (this.field4218 > 0 && this.field4215[this.field4218 - 1] != this.field4217) {
            class370 var1 = this.field4217;
            this.field4217 = var1.field4074;
            return var1;
        }
        class370 var2;
        do {
            if (this.field4218 >= this.field4214) {
                return null;
            }
            var2 = this.field4215[this.field4218++].field4074;
        } while (this.field4215[this.field4218 - 1] == var2);
        this.field4217 = var2.field4074;
        return var2;
    }
}
