package deob;

@ObfuscatedName("fu")
public final class class176 {

    @ObfuscatedName("fu.l")
    public int field2827;

    @ObfuscatedName("fu.b")
    public class180[] field2825;

    @ObfuscatedName("fu.o")
    public class180 field2826;

    @ObfuscatedName("fu.w")
    public class180 field2828;

    @ObfuscatedName("fu.r")
    public int field2829 = 0;

    public class176(int arg0) {
        this.field2827 = arg0;
        this.field2825 = new class180[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class180 var3 = this.field2825[var2] = new class180();
            var3.field2836 = var3;
            var3.field2835 = var3;
        }
    }

    @ObfuscatedName("fu.l(J)Lfm;")
    public class180 method3300(long arg0) {
        class180 var3 = this.field2825[(int) (arg0 & (long) (this.field2827 - 1))];
        for (this.field2826 = var3.field2836; this.field2826 != var3; this.field2826 = this.field2826.field2836) {
            if (this.field2826.field2837 == arg0) {
                class180 var4 = this.field2826;
                this.field2826 = this.field2826.field2836;
                return var4;
            }
        }
        this.field2826 = null;
        return null;
    }

    @ObfuscatedName("fu.b(Lfm;J)V")
    public void method3301(class180 arg0, long arg1) {
        if (arg0.field2835 != null) {
            arg0.method3360();
        }
        class180 var4 = this.field2825[(int) (arg1 & (long) (this.field2827 - 1))];
        arg0.field2835 = var4.field2835;
        arg0.field2836 = var4;
        arg0.field2835.field2836 = arg0;
        arg0.field2836.field2835 = arg0;
        arg0.field2837 = arg1;
    }

    @ObfuscatedName("fu.o()V")
    public void method3302() {
        for (int var1 = 0; var1 < this.field2827; var1++) {
            class180 var2 = this.field2825[var1];
            while (true) {
                class180 var3 = var2.field2836;
                if (var2 == var3) {
                    break;
                }
                var3.method3360();
            }
        }
        this.field2826 = null;
        this.field2828 = null;
    }

    @ObfuscatedName("fu.w()Lfm;")
    public class180 method3317() {
        this.field2829 = 0;
        return this.method3299();
    }

    @ObfuscatedName("fu.r()Lfm;")
    public class180 method3299() {
        if (this.field2829 > 0 && this.field2825[this.field2829 - 1] != this.field2828) {
            class180 var1 = this.field2828;
            this.field2828 = var1.field2836;
            return var1;
        }
        class180 var2;
        do {
            if (this.field2829 >= this.field2827) {
                return null;
            }
            var2 = this.field2825[this.field2829++].field2836;
        } while (this.field2825[this.field2829 - 1] == var2);
        this.field2828 = var2.field2836;
        return var2;
    }
}
