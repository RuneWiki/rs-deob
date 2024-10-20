package deob;

@ObfuscatedName("fq")
public final class class169 {

    @ObfuscatedName("fq.z")
    public int field2807;

    @ObfuscatedName("fq.n")
    public class176[] field2804;

    @ObfuscatedName("fq.u")
    public class176 field2805;

    @ObfuscatedName("fq.t")
    public class176 field2806;

    @ObfuscatedName("fq.e")
    public int field2803 = 0;

    public class169(int arg0) {
        this.field2807 = arg0;
        this.field2804 = new class176[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class176 var3 = this.field2804[var2] = new class176();
            var3.field2818 = var3;
            var3.field2819 = var3;
        }
    }

    @ObfuscatedName("fq.z(J)Lfs;")
    public class176 method3208(long arg0) {
        class176 var3 = this.field2804[(int) (arg0 & (long) (this.field2807 - 1))];
        for (this.field2805 = var3.field2818; this.field2805 != var3; this.field2805 = this.field2805.field2818) {
            if (this.field2805.field2817 == arg0) {
                class176 var4 = this.field2805;
                this.field2805 = this.field2805.field2818;
                return var4;
            }
        }
        this.field2805 = null;
        return null;
    }

    @ObfuscatedName("fq.n(Lfs;J)V")
    public void method3210(class176 arg0, long arg1) {
        if (arg0.field2819 != null) {
            arg0.method3288();
        }
        class176 var4 = this.field2804[(int) (arg1 & (long) (this.field2807 - 1))];
        arg0.field2819 = var4.field2819;
        arg0.field2818 = var4;
        arg0.field2819.field2818 = arg0;
        arg0.field2818.field2819 = arg0;
        arg0.field2817 = arg1;
    }

    @ObfuscatedName("fq.u()V")
    public void method3218() {
        for (int var1 = 0; var1 < this.field2807; var1++) {
            class176 var2 = this.field2804[var1];
            while (true) {
                class176 var3 = var2.field2818;
                if (var2 == var3) {
                    break;
                }
                var3.method3288();
            }
        }
        this.field2805 = null;
        this.field2806 = null;
    }

    @ObfuscatedName("fq.t()Lfs;")
    public class176 method3211() {
        this.field2803 = 0;
        return this.method3212();
    }

    @ObfuscatedName("fq.e()Lfs;")
    public class176 method3212() {
        if (this.field2803 > 0 && this.field2804[this.field2803 - 1] != this.field2806) {
            class176 var1 = this.field2806;
            this.field2806 = var1.field2818;
            return var1;
        }
        class176 var2;
        do {
            if (this.field2803 >= this.field2807) {
                return null;
            }
            var2 = this.field2804[this.field2803++].field2818;
        } while (this.field2804[this.field2803 - 1] == var2);
        this.field2806 = var2.field2818;
        return var2;
    }
}
