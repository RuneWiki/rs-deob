package deob;

@ObfuscatedName("ln")
public final class class319 {

    @ObfuscatedName("ln.c")
    public int field3833;

    @ObfuscatedName("ln.t")
    public class181[] field3831;

    @ObfuscatedName("ln.o")
    public class181 field3832;

    @ObfuscatedName("ln.e")
    public class181 field3834;

    @ObfuscatedName("ln.i")
    public int field3835 = 0;

    public class319(int arg0) {
        this.field3833 = arg0;
        this.field3831 = new class181[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class181 var3 = this.field3831[var2] = new class181();
            var3.field2114 = var3;
            var3.field2113 = var3;
        }
    }

    @ObfuscatedName("ln.c(J)Lft;")
    public class181 method5527(long arg0) {
        class181 var3 = this.field3831[(int) (arg0 & (long) (this.field3833 - 1))];
        for (this.field3832 = var3.field2114; this.field3832 != var3; this.field3832 = this.field3832.field2114) {
            if (this.field3832.field2115 == arg0) {
                class181 var4 = this.field3832;
                this.field3832 = this.field3832.field2114;
                return var4;
            }
        }
        this.field3832 = null;
        return null;
    }

    @ObfuscatedName("ln.t(Lft;J)V")
    public void method5535(class181 arg0, long arg1) {
        if (arg0.field2113 != null) {
            arg0.method3351();
        }
        class181 var4 = this.field3831[(int) (arg1 & (long) (this.field3833 - 1))];
        arg0.field2113 = var4.field2113;
        arg0.field2114 = var4;
        arg0.field2113.field2114 = arg0;
        arg0.field2114.field2113 = arg0;
        arg0.field2115 = arg1;
    }

    @ObfuscatedName("ln.o()Lft;")
    public class181 method5529() {
        this.field3835 = 0;
        return this.method5530();
    }

    @ObfuscatedName("ln.e()Lft;")
    public class181 method5530() {
        if (this.field3835 > 0 && this.field3831[this.field3835 - 1] != this.field3834) {
            class181 var1 = this.field3834;
            this.field3834 = var1.field2114;
            return var1;
        }
        class181 var2;
        do {
            if (this.field3835 >= this.field3833) {
                return null;
            }
            var2 = this.field3831[this.field3835++].field2114;
        } while (this.field3831[this.field3835 - 1] == var2);
        this.field3834 = var2.field2114;
        return var2;
    }
}
