package deob;

@ObfuscatedName("gg")
public final class class200 {

    @ObfuscatedName("gg.m")
    public int field3141;

    @ObfuscatedName("gg.w")
    public class212[] field3145;

    @ObfuscatedName("gg.e")
    public class212 field3143;

    @ObfuscatedName("gg.o")
    public class212 field3144;

    @ObfuscatedName("gg.g")
    public int field3142 = 0;

    public class200(int arg0) {
        this.field3141 = arg0;
        this.field3145 = new class212[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class212 var3 = this.field3145[var2] = new class212();
            var3.field3169 = var3;
            var3.field3167 = var3;
        }
    }

    @ObfuscatedName("gg.m(J)Lhf;")
    public class212 method3595(long arg0) {
        class212 var3 = this.field3145[(int) (arg0 & (long) (this.field3141 - 1))];
        for (this.field3143 = var3.field3169; this.field3143 != var3; this.field3143 = this.field3143.field3169) {
            if (this.field3143.field3168 == arg0) {
                class212 var4 = this.field3143;
                this.field3143 = this.field3143.field3169;
                return var4;
            }
        }
        this.field3143 = null;
        return null;
    }

    @ObfuscatedName("gg.w(Lhf;J)V")
    public void method3588(class212 arg0, long arg1) {
        if (arg0.field3167 != null) {
            arg0.method3729();
        }
        class212 var4 = this.field3145[(int) (arg1 & (long) (this.field3141 - 1))];
        arg0.field3167 = var4.field3167;
        arg0.field3169 = var4;
        arg0.field3167.field3169 = arg0;
        arg0.field3169.field3167 = arg0;
        arg0.field3168 = arg1;
    }

    @ObfuscatedName("gg.e()V")
    public void method3590() {
        for (int var1 = 0; var1 < this.field3141; var1++) {
            class212 var2 = this.field3145[var1];
            while (true) {
                class212 var3 = var2.field3169;
                if (var2 == var3) {
                    break;
                }
                var3.method3729();
            }
        }
        this.field3143 = null;
        this.field3144 = null;
    }

    @ObfuscatedName("gg.o()Lhf;")
    public class212 method3586() {
        this.field3142 = 0;
        return this.method3591();
    }

    @ObfuscatedName("gg.g()Lhf;")
    public class212 method3591() {
        if (this.field3142 > 0 && this.field3145[this.field3142 - 1] != this.field3144) {
            class212 var1 = this.field3144;
            this.field3144 = var1.field3169;
            return var1;
        }
        class212 var2;
        do {
            if (this.field3142 >= this.field3141) {
                return null;
            }
            var2 = this.field3145[this.field3142++].field3169;
        } while (this.field3145[this.field3142 - 1] == var2);
        this.field3144 = var2.field3169;
        return var2;
    }
}
