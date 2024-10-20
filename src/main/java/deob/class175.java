package deob;

@ObfuscatedName("fg")
public final class class175 {

    @ObfuscatedName("fg.a")
    public int field2805;

    @ObfuscatedName("fg.x")
    public class179[] field2806;

    @ObfuscatedName("fg.e")
    public class179 field2807;

    @ObfuscatedName("fg.r")
    public class179 field2808;

    @ObfuscatedName("fg.p")
    public int field2809 = 0;

    public class175(int arg0) {
        this.field2805 = arg0;
        this.field2806 = new class179[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class179 var3 = this.field2806[var2] = new class179();
            var3.field2815 = var3;
            var3.field2817 = var3;
        }
    }

    @ObfuscatedName("fg.a(J)Lfp;")
    public class179 method3242(long arg0) {
        class179 var3 = this.field2806[(int) (arg0 & (long) (this.field2805 - 1))];
        for (this.field2807 = var3.field2815; this.field2807 != var3; this.field2807 = this.field2807.field2815) {
            if (this.field2807.field2816 == arg0) {
                class179 var4 = this.field2807;
                this.field2807 = this.field2807.field2815;
                return var4;
            }
        }
        this.field2807 = null;
        return null;
    }

    @ObfuscatedName("fg.x(Lfp;J)V")
    public void method3234(class179 arg0, long arg1) {
        if (arg0.field2817 != null) {
            arg0.method3288();
        }
        class179 var4 = this.field2806[(int) (arg1 & (long) (this.field2805 - 1))];
        arg0.field2817 = var4.field2817;
        arg0.field2815 = var4;
        arg0.field2817.field2815 = arg0;
        arg0.field2815.field2817 = arg0;
        arg0.field2816 = arg1;
    }

    @ObfuscatedName("fg.e()V")
    public void method3229() {
        for (int var1 = 0; var1 < this.field2805; var1++) {
            class179 var2 = this.field2806[var1];
            while (true) {
                class179 var3 = var2.field2815;
                if (var2 == var3) {
                    break;
                }
                var3.method3288();
            }
        }
        this.field2807 = null;
        this.field2808 = null;
    }

    @ObfuscatedName("fg.r()Lfp;")
    public class179 method3232() {
        this.field2809 = 0;
        return this.method3233();
    }

    @ObfuscatedName("fg.p()Lfp;")
    public class179 method3233() {
        if (this.field2809 > 0 && this.field2806[this.field2809 - 1] != this.field2808) {
            class179 var1 = this.field2808;
            this.field2808 = var1.field2815;
            return var1;
        }
        class179 var2;
        do {
            if (this.field2809 >= this.field2805) {
                return null;
            }
            var2 = this.field2806[this.field2809++].field2815;
        } while (this.field2806[this.field2809 - 1] == var2);
        this.field2808 = var2.field2815;
        return var2;
    }
}
