package deob;

@ObfuscatedName("fb")
public final class class175 {

    @ObfuscatedName("fb.j")
    public int field2800;

    @ObfuscatedName("fb.r")
    public class179[] field2799;

    @ObfuscatedName("fb.v")
    public class179 field2798;

    @ObfuscatedName("fb.p")
    public class179 field2801;

    @ObfuscatedName("fb.e")
    public int field2802 = 0;

    public class175(int arg0) {
        this.field2800 = arg0;
        this.field2799 = new class179[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class179 var3 = this.field2799[var2] = new class179();
            var3.field2808 = var3;
            var3.field2810 = var3;
        }
    }

    @ObfuscatedName("fb.j(J)Lfi;")
    public class179 method3302(long arg0) {
        class179 var3 = this.field2799[(int) (arg0 & (long) (this.field2800 - 1))];
        for (this.field2798 = var3.field2808; this.field2798 != var3; this.field2798 = this.field2798.field2808) {
            if (this.field2798.field2809 == arg0) {
                class179 var4 = this.field2798;
                this.field2798 = this.field2798.field2808;
                return var4;
            }
        }
        this.field2798 = null;
        return null;
    }

    @ObfuscatedName("fb.r(Lfi;J)V")
    public void method3318(class179 arg0, long arg1) {
        if (arg0.field2810 != null) {
            arg0.method3359();
        }
        class179 var4 = this.field2799[(int) (arg1 & (long) (this.field2800 - 1))];
        arg0.field2810 = var4.field2810;
        arg0.field2808 = var4;
        arg0.field2810.field2808 = arg0;
        arg0.field2808.field2810 = arg0;
        arg0.field2809 = arg1;
    }

    @ObfuscatedName("fb.v()V")
    public void method3304() {
        for (int var1 = 0; var1 < this.field2800; var1++) {
            class179 var2 = this.field2799[var1];
            while (true) {
                class179 var3 = var2.field2808;
                if (var2 == var3) {
                    break;
                }
                var3.method3359();
            }
        }
        this.field2798 = null;
        this.field2801 = null;
    }

    @ObfuscatedName("fb.p()Lfi;")
    public class179 method3316() {
        this.field2802 = 0;
        return this.method3306();
    }

    @ObfuscatedName("fb.e()Lfi;")
    public class179 method3306() {
        if (this.field2802 > 0 && this.field2799[this.field2802 - 1] != this.field2801) {
            class179 var1 = this.field2801;
            this.field2801 = var1.field2808;
            return var1;
        }
        class179 var2;
        do {
            if (this.field2802 >= this.field2800) {
                return null;
            }
            var2 = this.field2799[this.field2802++].field2808;
        } while (this.field2799[this.field2802 - 1] == var2);
        this.field2801 = var2.field2808;
        return var2;
    }
}
