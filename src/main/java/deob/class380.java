package deob;

@ObfuscatedName("ni")
public final class class380 {

    @ObfuscatedName("ni.l")
    public int field4214;

    @ObfuscatedName("ni.q")
    public class370[] field4212;

    @ObfuscatedName("ni.f")
    public class370 field4213;

    @ObfuscatedName("ni.j")
    public class370 field4215;

    @ObfuscatedName("ni.m")
    public int field4211 = 0;

    public class380(int arg0) {
        this.field4214 = arg0;
        this.field4212 = new class370[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class370 var3 = this.field4212[var2] = new class370();
            var3.field4076 = var3;
            var3.field4077 = var3;
        }
    }

    @ObfuscatedName("ni.l(J)Lnv;")
    public class370 method6061(long arg0) {
        class370 var3 = this.field4212[(int) (arg0 & (long) (this.field4214 - 1))];
        for (this.field4213 = var3.field4076; this.field4213 != var3; this.field4213 = this.field4213.field4076) {
            if (this.field4213.field4075 == arg0) {
                class370 var4 = this.field4213;
                this.field4213 = this.field4213.field4076;
                return var4;
            }
        }
        this.field4213 = null;
        return null;
    }

    @ObfuscatedName("ni.q(Lnv;J)V")
    public void method6065(class370 arg0, long arg1) {
        if (arg0.field4077 != null) {
            arg0.method5775();
        }
        class370 var4 = this.field4212[(int) (arg1 & (long) (this.field4214 - 1))];
        arg0.field4077 = var4.field4077;
        arg0.field4076 = var4;
        arg0.field4077.field4076 = arg0;
        arg0.field4076.field4077 = arg0;
        arg0.field4075 = arg1;
    }

    @ObfuscatedName("ni.f()Lnv;")
    public class370 method6062() {
        this.field4211 = 0;
        return this.method6060();
    }

    @ObfuscatedName("ni.j()Lnv;")
    public class370 method6060() {
        if (this.field4211 > 0 && this.field4212[this.field4211 - 1] != this.field4215) {
            class370 var1 = this.field4215;
            this.field4215 = var1.field4076;
            return var1;
        }
        class370 var2;
        do {
            if (this.field4211 >= this.field4214) {
                return null;
            }
            var2 = this.field4212[this.field4211++].field4076;
        } while (this.field4212[this.field4211 - 1] == var2);
        this.field4215 = var2.field4076;
        return var2;
    }
}
