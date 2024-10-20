package deob;

@ObfuscatedName("ff")
public final class class177 {

    @ObfuscatedName("ff.i")
    public int field2828;

    @ObfuscatedName("ff.b")
    public class181[] field2831;

    @ObfuscatedName("ff.r")
    public class181 field2830;

    @ObfuscatedName("ff.l")
    public class181 field2829;

    @ObfuscatedName("ff.s")
    public int field2832 = 0;

    public class177(int arg0) {
        this.field2828 = arg0;
        this.field2831 = new class181[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class181 var3 = this.field2831[var2] = new class181();
            var3.field2838 = var3;
            var3.field2840 = var3;
        }
    }

    @ObfuscatedName("ff.i(J)Lfx;")
    public class181 method3315(long arg0) {
        class181 var3 = this.field2831[(int) (arg0 & (long) (this.field2828 - 1))];
        for (this.field2830 = var3.field2838; this.field2830 != var3; this.field2830 = this.field2830.field2838) {
            if (this.field2830.field2839 == arg0) {
                class181 var4 = this.field2830;
                this.field2830 = this.field2830.field2838;
                return var4;
            }
        }
        this.field2830 = null;
        return null;
    }

    @ObfuscatedName("ff.b(Lfx;J)V")
    public void method3329(class181 arg0, long arg1) {
        if (arg0.field2840 != null) {
            arg0.method3363();
        }
        class181 var4 = this.field2831[(int) (arg1 & (long) (this.field2828 - 1))];
        arg0.field2840 = var4.field2840;
        arg0.field2838 = var4;
        arg0.field2840.field2838 = arg0;
        arg0.field2838.field2840 = arg0;
        arg0.field2839 = arg1;
    }

    @ObfuscatedName("ff.r()V")
    public void method3317() {
        for (int var1 = 0; var1 < this.field2828; var1++) {
            class181 var2 = this.field2831[var1];
            while (true) {
                class181 var3 = var2.field2838;
                if (var2 == var3) {
                    break;
                }
                var3.method3363();
            }
        }
        this.field2830 = null;
        this.field2829 = null;
    }

    @ObfuscatedName("ff.l()Lfx;")
    public class181 method3318() {
        this.field2832 = 0;
        return this.method3321();
    }

    @ObfuscatedName("ff.s()Lfx;")
    public class181 method3321() {
        if (this.field2832 > 0 && this.field2831[this.field2832 - 1] != this.field2829) {
            class181 var1 = this.field2829;
            this.field2829 = var1.field2838;
            return var1;
        }
        class181 var2;
        do {
            if (this.field2832 >= this.field2828) {
                return null;
            }
            var2 = this.field2831[this.field2832++].field2838;
        } while (this.field2831[this.field2832 - 1] == var2);
        this.field2829 = var2.field2838;
        return var2;
    }
}
