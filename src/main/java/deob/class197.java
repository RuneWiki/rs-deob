package deob;

@ObfuscatedName("gc")
public final class class197 {

    @ObfuscatedName("gc.j")
    public int field3100;

    @ObfuscatedName("gc.h")
    public class209[] field3099;

    @ObfuscatedName("gc.m")
    public class209 field3098;

    @ObfuscatedName("gc.z")
    public class209 field3101;

    @ObfuscatedName("gc.x")
    public int field3102 = 0;

    public class197(int arg0) {
        this.field3100 = arg0;
        this.field3099 = new class209[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class209 var3 = this.field3099[var2] = new class209();
            var3.field3124 = var3;
            var3.field3125 = var3;
        }
    }

    @ObfuscatedName("gc.j(J)Lhc;")
    public class209 method3498(long arg0) {
        class209 var3 = this.field3099[(int) (arg0 & (long) (this.field3100 - 1))];
        for (this.field3098 = var3.field3124; this.field3098 != var3; this.field3098 = this.field3098.field3124) {
            if (this.field3098.field3123 == arg0) {
                class209 var4 = this.field3098;
                this.field3098 = this.field3098.field3124;
                return var4;
            }
        }
        this.field3098 = null;
        return null;
    }

    @ObfuscatedName("gc.h(Lhc;J)V")
    public void method3499(class209 arg0, long arg1) {
        if (arg0.field3125 != null) {
            arg0.method3639();
        }
        class209 var4 = this.field3099[(int) (arg1 & (long) (this.field3100 - 1))];
        arg0.field3125 = var4.field3125;
        arg0.field3124 = var4;
        arg0.field3125.field3124 = arg0;
        arg0.field3124.field3125 = arg0;
        arg0.field3123 = arg1;
    }

    @ObfuscatedName("gc.m()V")
    public void method3500() {
        for (int var1 = 0; var1 < this.field3100; var1++) {
            class209 var2 = this.field3099[var1];
            while (true) {
                class209 var3 = var2.field3124;
                if (var2 == var3) {
                    break;
                }
                var3.method3639();
            }
        }
        this.field3098 = null;
        this.field3101 = null;
    }

    @ObfuscatedName("gc.z()Lhc;")
    public class209 method3501() {
        this.field3102 = 0;
        return this.method3502();
    }

    @ObfuscatedName("gc.x()Lhc;")
    public class209 method3502() {
        if (this.field3102 > 0 && this.field3099[this.field3102 - 1] != this.field3101) {
            class209 var1 = this.field3101;
            this.field3101 = var1.field3124;
            return var1;
        }
        class209 var2;
        do {
            if (this.field3102 >= this.field3100) {
                return null;
            }
            var2 = this.field3099[this.field3102++].field3124;
        } while (this.field3099[this.field3102 - 1] == var2);
        this.field3101 = var2.field3124;
        return var2;
    }
}
