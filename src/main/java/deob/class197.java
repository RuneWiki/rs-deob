package deob;

@ObfuscatedName("gc")
public final class class197 {

    @ObfuscatedName("gc.t")
    public int field3100;

    @ObfuscatedName("gc.i")
    public class209[] field3101;

    @ObfuscatedName("gc.g")
    public class209 field3102;

    @ObfuscatedName("gc.h")
    public class209 field3103;

    @ObfuscatedName("gc.z")
    public int field3104 = 0;

    public class197(int arg0) {
        this.field3100 = arg0;
        this.field3101 = new class209[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class209 var3 = this.field3101[var2] = new class209();
            var3.field3127 = var3;
            var3.field3125 = var3;
        }
    }

    @ObfuscatedName("gc.t(J)Lhe;")
    public class209 method3485(long arg0) {
        class209 var3 = this.field3101[(int) (arg0 & (long) (this.field3100 - 1))];
        for (this.field3102 = var3.field3127; this.field3102 != var3; this.field3102 = this.field3102.field3127) {
            if (this.field3102.field3126 == arg0) {
                class209 var4 = this.field3102;
                this.field3102 = this.field3102.field3127;
                return var4;
            }
        }
        this.field3102 = null;
        return null;
    }

    @ObfuscatedName("gc.i(Lhe;J)V")
    public void method3486(class209 arg0, long arg1) {
        if (arg0.field3125 != null) {
            arg0.method3607();
        }
        class209 var4 = this.field3101[(int) (arg1 & (long) (this.field3100 - 1))];
        arg0.field3125 = var4.field3125;
        arg0.field3127 = var4;
        arg0.field3125.field3127 = arg0;
        arg0.field3127.field3125 = arg0;
        arg0.field3126 = arg1;
    }

    @ObfuscatedName("gc.g()V")
    public void method3487() {
        for (int var1 = 0; var1 < this.field3100; var1++) {
            class209 var2 = this.field3101[var1];
            while (true) {
                class209 var3 = var2.field3127;
                if (var2 == var3) {
                    break;
                }
                var3.method3607();
            }
        }
        this.field3102 = null;
        this.field3103 = null;
    }

    @ObfuscatedName("gc.h()Lhe;")
    public class209 method3488() {
        this.field3104 = 0;
        return this.method3489();
    }

    @ObfuscatedName("gc.z()Lhe;")
    public class209 method3489() {
        if (this.field3104 > 0 && this.field3101[this.field3104 - 1] != this.field3103) {
            class209 var1 = this.field3103;
            this.field3103 = var1.field3127;
            return var1;
        }
        class209 var2;
        do {
            if (this.field3104 >= this.field3100) {
                return null;
            }
            var2 = this.field3101[this.field3104++].field3127;
        } while (this.field3101[this.field3104 - 1] == var2);
        this.field3103 = var2.field3127;
        return var2;
    }
}
