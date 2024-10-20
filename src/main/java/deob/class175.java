package deob;

@ObfuscatedName("fk")
public final class class175 {

    @ObfuscatedName("fk.a")
    public int field2806;

    @ObfuscatedName("fk.r")
    public class179[] field2809;

    @ObfuscatedName("fk.u")
    public class179 field2805;

    @ObfuscatedName("fk.t")
    public class179 field2808;

    @ObfuscatedName("fk.k")
    public int field2807 = 0;

    public class175(int arg0) {
        this.field2806 = arg0;
        this.field2809 = new class179[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class179 var3 = this.field2809[var2] = new class179();
            var3.field2816 = var3;
            var3.field2815 = var3;
        }
    }

    @ObfuscatedName("fk.a(J)Lfs;")
    public class179 method3252(long arg0) {
        class179 var3 = this.field2809[(int) (arg0 & (long) (this.field2806 - 1))];
        for (this.field2805 = var3.field2816; this.field2805 != var3; this.field2805 = this.field2805.field2816) {
            if (this.field2805.field2817 == arg0) {
                class179 var4 = this.field2805;
                this.field2805 = this.field2805.field2816;
                return var4;
            }
        }
        this.field2805 = null;
        return null;
    }

    @ObfuscatedName("fk.r(Lfs;J)V")
    public void method3254(class179 arg0, long arg1) {
        if (arg0.field2815 != null) {
            arg0.method3311();
        }
        class179 var4 = this.field2809[(int) (arg1 & (long) (this.field2806 - 1))];
        arg0.field2815 = var4.field2815;
        arg0.field2816 = var4;
        arg0.field2815.field2816 = arg0;
        arg0.field2816.field2815 = arg0;
        arg0.field2817 = arg1;
    }

    @ObfuscatedName("fk.u()V")
    public void method3251() {
        for (int var1 = 0; var1 < this.field2806; var1++) {
            class179 var2 = this.field2809[var1];
            while (true) {
                class179 var3 = var2.field2816;
                if (var2 == var3) {
                    break;
                }
                var3.method3311();
            }
        }
        this.field2805 = null;
        this.field2808 = null;
    }

    @ObfuscatedName("fk.t()Lfs;")
    public class179 method3255() {
        this.field2807 = 0;
        return this.method3256();
    }

    @ObfuscatedName("fk.k()Lfs;")
    public class179 method3256() {
        if (this.field2807 > 0 && this.field2809[this.field2807 - 1] != this.field2808) {
            class179 var1 = this.field2808;
            this.field2808 = var1.field2816;
            return var1;
        }
        class179 var2;
        do {
            if (this.field2807 >= this.field2806) {
                return null;
            }
            var2 = this.field2809[this.field2807++].field2816;
        } while (this.field2809[this.field2807 - 1] == var2);
        this.field2808 = var2.field2816;
        return var2;
    }
}
