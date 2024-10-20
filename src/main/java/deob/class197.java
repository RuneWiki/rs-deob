package deob;

@ObfuscatedName("gt")
public final class class197 {

    @ObfuscatedName("gt.w")
    public int field3103;

    @ObfuscatedName("gt.x")
    public class209[] field3099;

    @ObfuscatedName("gt.t")
    public class209 field3101;

    @ObfuscatedName("gt.p")
    public class209 field3102;

    @ObfuscatedName("gt.e")
    public int field3100 = 0;

    public class197(int arg0) {
        this.field3103 = arg0;
        this.field3099 = new class209[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class209 var3 = this.field3099[var2] = new class209();
            var3.field3125 = var3;
            var3.field3126 = var3;
        }
    }

    @ObfuscatedName("gt.w(J)Lhl;")
    public class209 method3555(long arg0) {
        class209 var3 = this.field3099[(int) (arg0 & (long) (this.field3103 - 1))];
        for (this.field3101 = var3.field3125; this.field3101 != var3; this.field3101 = this.field3101.field3125) {
            if (this.field3101.field3124 == arg0) {
                class209 var4 = this.field3101;
                this.field3101 = this.field3101.field3125;
                return var4;
            }
        }
        this.field3101 = null;
        return null;
    }

    @ObfuscatedName("gt.x(Lhl;J)V")
    public void method3556(class209 arg0, long arg1) {
        if (arg0.field3126 != null) {
            arg0.method3684();
        }
        class209 var4 = this.field3099[(int) (arg1 & (long) (this.field3103 - 1))];
        arg0.field3126 = var4.field3126;
        arg0.field3125 = var4;
        arg0.field3126.field3125 = arg0;
        arg0.field3125.field3126 = arg0;
        arg0.field3124 = arg1;
    }

    @ObfuscatedName("gt.t()V")
    public void method3557() {
        for (int var1 = 0; var1 < this.field3103; var1++) {
            class209 var2 = this.field3099[var1];
            while (true) {
                class209 var3 = var2.field3125;
                if (var2 == var3) {
                    break;
                }
                var3.method3684();
            }
        }
        this.field3101 = null;
        this.field3102 = null;
    }

    @ObfuscatedName("gt.p()Lhl;")
    public class209 method3554() {
        this.field3100 = 0;
        return this.method3558();
    }

    @ObfuscatedName("gt.e()Lhl;")
    public class209 method3558() {
        if (this.field3100 > 0 && this.field3099[this.field3100 - 1] != this.field3102) {
            class209 var1 = this.field3102;
            this.field3102 = var1.field3125;
            return var1;
        }
        class209 var2;
        do {
            if (this.field3100 >= this.field3103) {
                return null;
            }
            var2 = this.field3099[this.field3100++].field3125;
        } while (this.field3099[this.field3100 - 1] == var2);
        this.field3102 = var2.field3125;
        return var2;
    }
}
