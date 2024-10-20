package deob;

@ObfuscatedName("lm")
public final class class318 {

    @ObfuscatedName("lm.s")
    public int field3838;

    @ObfuscatedName("lm.j")
    public class181[] field3835;

    @ObfuscatedName("lm.i")
    public class181 field3837;

    @ObfuscatedName("lm.k")
    public class181 field3836;

    @ObfuscatedName("lm.u")
    public int field3839 = 0;

    public class318(int arg0) {
        this.field3838 = arg0;
        this.field3835 = new class181[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class181 var3 = this.field3835[var2] = new class181();
            var3.field2097 = var3;
            var3.field2095 = var3;
        }
    }

    @ObfuscatedName("lm.s(J)Lfb;")
    public class181 method5434(long arg0) {
        class181 var3 = this.field3835[(int) (arg0 & (long) (this.field3838 - 1))];
        for (this.field3837 = var3.field2097; this.field3837 != var3; this.field3837 = this.field3837.field2097) {
            if (this.field3837.field2096 == arg0) {
                class181 var4 = this.field3837;
                this.field3837 = this.field3837.field2097;
                return var4;
            }
        }
        this.field3837 = null;
        return null;
    }

    @ObfuscatedName("lm.j(Lfb;J)V")
    public void method5429(class181 arg0, long arg1) {
        if (arg0.field2095 != null) {
            arg0.method3304();
        }
        class181 var4 = this.field3835[(int) (arg1 & (long) (this.field3838 - 1))];
        arg0.field2095 = var4.field2095;
        arg0.field2097 = var4;
        arg0.field2095.field2097 = arg0;
        arg0.field2097.field2095 = arg0;
        arg0.field2096 = arg1;
    }

    @ObfuscatedName("lm.i()Lfb;")
    public class181 method5432() {
        this.field3839 = 0;
        return this.method5433();
    }

    @ObfuscatedName("lm.k()Lfb;")
    public class181 method5433() {
        if (this.field3839 > 0 && this.field3835[this.field3839 - 1] != this.field3836) {
            class181 var1 = this.field3836;
            this.field3836 = var1.field2097;
            return var1;
        }
        class181 var2;
        do {
            if (this.field3839 >= this.field3838) {
                return null;
            }
            var2 = this.field3835[this.field3839++].field2097;
        } while (this.field3835[this.field3839 - 1] == var2);
        this.field3836 = var2.field2097;
        return var2;
    }
}
