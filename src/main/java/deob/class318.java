package deob;

@ObfuscatedName("lq")
public final class class318 {

    @ObfuscatedName("lq.z")
    public int field3836;

    @ObfuscatedName("lq.n")
    public class181[] field3832;

    @ObfuscatedName("lq.v")
    public class181 field3833;

    @ObfuscatedName("lq.u")
    public class181 field3835;

    @ObfuscatedName("lq.r")
    public int field3834 = 0;

    public class318(int arg0) {
        this.field3836 = arg0;
        this.field3832 = new class181[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class181 var3 = this.field3832[var2] = new class181();
            var3.field2093 = var3;
            var3.field2095 = var3;
        }
    }

    @ObfuscatedName("lq.z(J)Lfx;")
    public class181 method5393(long arg0) {
        class181 var3 = this.field3832[(int) (arg0 & (long) (this.field3836 - 1))];
        for (this.field3833 = var3.field2093; this.field3833 != var3; this.field3833 = this.field3833.field2093) {
            if (this.field3833.field2094 == arg0) {
                class181 var4 = this.field3833;
                this.field3833 = this.field3833.field2093;
                return var4;
            }
        }
        this.field3833 = null;
        return null;
    }

    @ObfuscatedName("lq.n(Lfx;J)V")
    public void method5394(class181 arg0, long arg1) {
        if (arg0.field2095 != null) {
            arg0.method3249();
        }
        class181 var4 = this.field3832[(int) (arg1 & (long) (this.field3836 - 1))];
        arg0.field2095 = var4.field2095;
        arg0.field2093 = var4;
        arg0.field2095.field2093 = arg0;
        arg0.field2093.field2095 = arg0;
        arg0.field2094 = arg1;
    }

    @ObfuscatedName("lq.v()Lfx;")
    public class181 method5395() {
        this.field3834 = 0;
        return this.method5392();
    }

    @ObfuscatedName("lq.u()Lfx;")
    public class181 method5392() {
        if (this.field3834 > 0 && this.field3832[this.field3834 - 1] != this.field3835) {
            class181 var1 = this.field3835;
            this.field3835 = var1.field2093;
            return var1;
        }
        class181 var2;
        do {
            if (this.field3834 >= this.field3836) {
                return null;
            }
            var2 = this.field3832[this.field3834++].field2093;
        } while (this.field3832[this.field3834 - 1] == var2);
        this.field3835 = var2.field2093;
        return var2;
    }
}
