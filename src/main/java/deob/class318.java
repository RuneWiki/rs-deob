package deob;

@ObfuscatedName("lm")
public final class class318 {

    @ObfuscatedName("lm.c")
    public int field3831;

    @ObfuscatedName("lm.x")
    public class181[] field3828;

    @ObfuscatedName("lm.t")
    public class181 field3830;

    @ObfuscatedName("lm.g")
    public class181 field3829;

    @ObfuscatedName("lm.l")
    public int field3832 = 0;

    public class318(int arg0) {
        this.field3831 = arg0;
        this.field3828 = new class181[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class181 var3 = this.field3828[var2] = new class181();
            var3.field2095 = var3;
            var3.field2094 = var3;
        }
    }

    @ObfuscatedName("lm.c(J)Lfn;")
    public class181 method5524(long arg0) {
        class181 var3 = this.field3828[(int) (arg0 & (long) (this.field3831 - 1))];
        for (this.field3830 = var3.field2095; this.field3830 != var3; this.field3830 = this.field3830.field2095) {
            if (this.field3830.field2096 == arg0) {
                class181 var4 = this.field3830;
                this.field3830 = this.field3830.field2095;
                return var4;
            }
        }
        this.field3830 = null;
        return null;
    }

    @ObfuscatedName("lm.x(Lfn;J)V")
    public void method5517(class181 arg0, long arg1) {
        if (arg0.field2094 != null) {
            arg0.method3326();
        }
        class181 var4 = this.field3828[(int) (arg1 & (long) (this.field3831 - 1))];
        arg0.field2094 = var4.field2094;
        arg0.field2095 = var4;
        arg0.field2094.field2095 = arg0;
        arg0.field2095.field2094 = arg0;
        arg0.field2096 = arg1;
    }

    @ObfuscatedName("lm.t()Lfn;")
    public class181 method5516() {
        this.field3832 = 0;
        return this.method5518();
    }

    @ObfuscatedName("lm.g()Lfn;")
    public class181 method5518() {
        if (this.field3832 > 0 && this.field3828[this.field3832 - 1] != this.field3829) {
            class181 var1 = this.field3829;
            this.field3829 = var1.field2095;
            return var1;
        }
        class181 var2;
        do {
            if (this.field3832 >= this.field3831) {
                return null;
            }
            var2 = this.field3828[this.field3832++].field2095;
        } while (this.field3828[this.field3832 - 1] == var2);
        this.field3829 = var2.field2095;
        return var2;
    }
}
