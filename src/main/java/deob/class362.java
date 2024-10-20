package deob;

@ObfuscatedName("md")
public final class class362 {

    @ObfuscatedName("md.v")
    public int field4074;

    @ObfuscatedName("md.n")
    public class352[] field4075;

    @ObfuscatedName("md.f")
    public class352 field4073;

    @ObfuscatedName("md.y")
    public class352 field4076;

    @ObfuscatedName("md.p")
    public int field4077 = 0;

    public class362(int arg0) {
        this.field4074 = arg0;
        this.field4075 = new class352[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class352 var3 = this.field4075[var2] = new class352();
            var3.field3939 = var3;
            var3.field3940 = var3;
        }
    }

    @ObfuscatedName("md.v(J)Lmw;")
    public class352 method5766(long arg0) {
        class352 var3 = this.field4075[(int) (arg0 & (long) (this.field4074 - 1))];
        for (this.field4073 = var3.field3939; this.field4073 != var3; this.field4073 = this.field4073.field3939) {
            if (this.field4073.field3938 == arg0) {
                class352 var4 = this.field4073;
                this.field4073 = this.field4073.field3939;
                return var4;
            }
        }
        this.field4073 = null;
        return null;
    }

    @ObfuscatedName("md.n(Lmw;J)V")
    public void method5768(class352 arg0, long arg1) {
        if (arg0.field3940 != null) {
            arg0.method5496();
        }
        class352 var4 = this.field4075[(int) (arg1 & (long) (this.field4074 - 1))];
        arg0.field3940 = var4.field3940;
        arg0.field3939 = var4;
        arg0.field3940.field3939 = arg0;
        arg0.field3939.field3940 = arg0;
        arg0.field3938 = arg1;
    }

    @ObfuscatedName("md.f()Lmw;")
    public class352 method5774() {
        this.field4077 = 0;
        return this.method5770();
    }

    @ObfuscatedName("md.y()Lmw;")
    public class352 method5770() {
        if (this.field4077 > 0 && this.field4075[this.field4077 - 1] != this.field4076) {
            class352 var1 = this.field4076;
            this.field4076 = var1.field3939;
            return var1;
        }
        class352 var2;
        do {
            if (this.field4077 >= this.field4074) {
                return null;
            }
            var2 = this.field4075[this.field4077++].field3939;
        } while (this.field4075[this.field4077 - 1] == var2);
        this.field4076 = var2.field3939;
        return var2;
    }
}
