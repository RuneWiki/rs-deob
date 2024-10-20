package deob;

@ObfuscatedName("fh")
public final class class175 {

    @ObfuscatedName("fh.i")
    public int field2808;

    @ObfuscatedName("fh.w")
    public class179[] field2807;

    @ObfuscatedName("fh.f")
    public class179 field2806;

    @ObfuscatedName("fh.e")
    public class179 field2809;

    @ObfuscatedName("fh.t")
    public int field2810 = 0;

    public class175(int arg0) {
        this.field2808 = arg0;
        this.field2807 = new class179[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class179 var3 = this.field2807[var2] = new class179();
            var3.field2816 = var3;
            var3.field2818 = var3;
        }
    }

    @ObfuscatedName("fh.i(J)Lft;")
    public class179 method3273(long arg0) {
        class179 var3 = this.field2807[(int) (arg0 & (long) (this.field2808 - 1))];
        for (this.field2806 = var3.field2816; this.field2806 != var3; this.field2806 = this.field2806.field2816) {
            if (this.field2806.field2817 == arg0) {
                class179 var4 = this.field2806;
                this.field2806 = this.field2806.field2816;
                return var4;
            }
        }
        this.field2806 = null;
        return null;
    }

    @ObfuscatedName("fh.w(Lft;J)V")
    public void method3278(class179 arg0, long arg1) {
        if (arg0.field2818 != null) {
            arg0.method3328();
        }
        class179 var4 = this.field2807[(int) (arg1 & (long) (this.field2808 - 1))];
        arg0.field2818 = var4.field2818;
        arg0.field2816 = var4;
        arg0.field2818.field2816 = arg0;
        arg0.field2816.field2818 = arg0;
        arg0.field2817 = arg1;
    }

    @ObfuscatedName("fh.f()V")
    public void method3275() {
        for (int var1 = 0; var1 < this.field2808; var1++) {
            class179 var2 = this.field2807[var1];
            while (true) {
                class179 var3 = var2.field2816;
                if (var2 == var3) {
                    break;
                }
                var3.method3328();
            }
        }
        this.field2806 = null;
        this.field2809 = null;
    }

    @ObfuscatedName("fh.e()Lft;")
    public class179 method3276() {
        this.field2810 = 0;
        return this.method3277();
    }

    @ObfuscatedName("fh.t()Lft;")
    public class179 method3277() {
        if (this.field2810 > 0 && this.field2807[this.field2810 - 1] != this.field2809) {
            class179 var1 = this.field2809;
            this.field2809 = var1.field2816;
            return var1;
        }
        class179 var2;
        do {
            if (this.field2810 >= this.field2808) {
                return null;
            }
            var2 = this.field2807[this.field2810++].field2816;
        } while (this.field2807[this.field2810 - 1] == var2);
        this.field2809 = var2.field2816;
        return var2;
    }
}
