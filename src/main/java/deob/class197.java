package deob;

@ObfuscatedName("gs")
public final class class197 {

    @ObfuscatedName("gs.a")
    public int field3102;

    @ObfuscatedName("gs.w")
    public class209[] field3103;

    @ObfuscatedName("gs.d")
    public class209 field3101;

    @ObfuscatedName("gs.c")
    public class209 field3100;

    @ObfuscatedName("gs.y")
    public int field3099 = 0;

    public class197(int arg0) {
        this.field3102 = arg0;
        this.field3103 = new class209[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class209 var3 = this.field3103[var2] = new class209();
            var3.field3125 = var3;
            var3.field3124 = var3;
        }
    }

    @ObfuscatedName("gs.a(J)Lha;")
    public class209 method3607(long arg0) {
        class209 var3 = this.field3103[(int) (arg0 & (long) (this.field3102 - 1))];
        for (this.field3101 = var3.field3125; this.field3101 != var3; this.field3101 = this.field3101.field3125) {
            if (this.field3101.field3126 == arg0) {
                class209 var4 = this.field3101;
                this.field3101 = this.field3101.field3125;
                return var4;
            }
        }
        this.field3101 = null;
        return null;
    }

    @ObfuscatedName("gs.w(Lha;J)V")
    public void method3614(class209 arg0, long arg1) {
        if (arg0.field3124 != null) {
            arg0.method3737();
        }
        class209 var4 = this.field3103[(int) (arg1 & (long) (this.field3102 - 1))];
        arg0.field3124 = var4.field3124;
        arg0.field3125 = var4;
        arg0.field3124.field3125 = arg0;
        arg0.field3125.field3124 = arg0;
        arg0.field3126 = arg1;
    }

    @ObfuscatedName("gs.d()V")
    public void method3609() {
        for (int var1 = 0; var1 < this.field3102; var1++) {
            class209 var2 = this.field3103[var1];
            while (true) {
                class209 var3 = var2.field3125;
                if (var2 == var3) {
                    break;
                }
                var3.method3737();
            }
        }
        this.field3101 = null;
        this.field3100 = null;
    }

    @ObfuscatedName("gs.c()Lha;")
    public class209 method3610() {
        this.field3099 = 0;
        return this.method3606();
    }

    @ObfuscatedName("gs.y()Lha;")
    public class209 method3606() {
        if (this.field3099 > 0 && this.field3103[this.field3099 - 1] != this.field3100) {
            class209 var1 = this.field3100;
            this.field3100 = var1.field3125;
            return var1;
        }
        class209 var2;
        do {
            if (this.field3099 >= this.field3102) {
                return null;
            }
            var2 = this.field3103[this.field3099++].field3125;
        } while (this.field3103[this.field3099 - 1] == var2);
        this.field3100 = var2.field3125;
        return var2;
    }
}
