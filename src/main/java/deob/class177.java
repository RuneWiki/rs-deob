package deob;

@ObfuscatedName("fu")
public final class class177 {

    @ObfuscatedName("fu.e")
    public int field2830;

    @ObfuscatedName("fu.i")
    public class181[] field2832;

    @ObfuscatedName("fu.k")
    public class181 field2831;

    @ObfuscatedName("fu.q")
    public class181 field2833;

    @ObfuscatedName("fu.j")
    public int field2829 = 0;

    public class177(int arg0) {
        this.field2830 = arg0;
        this.field2832 = new class181[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class181 var3 = this.field2832[var2] = new class181();
            var3.field2840 = var3;
            var3.field2841 = var3;
        }
    }

    @ObfuscatedName("fu.e(J)Lfz;")
    public class181 method3314(long arg0) {
        class181 var3 = this.field2832[(int) (arg0 & (long) (this.field2830 - 1))];
        for (this.field2831 = var3.field2840; this.field2831 != var3; this.field2831 = this.field2831.field2840) {
            if (this.field2831.field2839 == arg0) {
                class181 var4 = this.field2831;
                this.field2831 = this.field2831.field2840;
                return var4;
            }
        }
        this.field2831 = null;
        return null;
    }

    @ObfuscatedName("fu.i(Lfz;J)V")
    public void method3311(class181 arg0, long arg1) {
        if (arg0.field2841 != null) {
            arg0.method3366();
        }
        class181 var4 = this.field2832[(int) (arg1 & (long) (this.field2830 - 1))];
        arg0.field2841 = var4.field2841;
        arg0.field2840 = var4;
        arg0.field2841.field2840 = arg0;
        arg0.field2840.field2841 = arg0;
        arg0.field2839 = arg1;
    }

    @ObfuscatedName("fu.k()V")
    public void method3312() {
        for (int var1 = 0; var1 < this.field2830; var1++) {
            class181 var2 = this.field2832[var1];
            while (true) {
                class181 var3 = var2.field2840;
                if (var2 == var3) {
                    break;
                }
                var3.method3366();
            }
        }
        this.field2831 = null;
        this.field2833 = null;
    }

    @ObfuscatedName("fu.q()Lfz;")
    public class181 method3313() {
        this.field2829 = 0;
        return this.method3323();
    }

    @ObfuscatedName("fu.j()Lfz;")
    public class181 method3323() {
        if (this.field2829 > 0 && this.field2832[this.field2829 - 1] != this.field2833) {
            class181 var1 = this.field2833;
            this.field2833 = var1.field2840;
            return var1;
        }
        class181 var2;
        do {
            if (this.field2829 >= this.field2830) {
                return null;
            }
            var2 = this.field2832[this.field2829++].field2840;
        } while (this.field2832[this.field2829 - 1] == var2);
        this.field2833 = var2.field2840;
        return var2;
    }
}
