package deob;

@ObfuscatedName("fj")
public final class class173 {

    @ObfuscatedName("fj.z")
    public int field2747;

    @ObfuscatedName("fj.h")
    public class177[] field2744;

    @ObfuscatedName("fj.c")
    public class177 field2746;

    @ObfuscatedName("fj.p")
    public class177 field2745;

    @ObfuscatedName("fj.i")
    public int field2748 = 0;

    public class173(int arg0) {
        this.field2747 = arg0;
        this.field2744 = new class177[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class177 var3 = this.field2744[var2] = new class177();
            var3.field2754 = var3;
            var3.field2756 = var3;
        }
    }

    @ObfuscatedName("fj.z(J)Lfk;")
    public class177 method3281(long arg0) {
        class177 var3 = this.field2744[(int) (arg0 & (long) (this.field2747 - 1))];
        for (this.field2746 = var3.field2754; this.field2746 != var3; this.field2746 = this.field2746.field2754) {
            if (this.field2746.field2755 == arg0) {
                class177 var4 = this.field2746;
                this.field2746 = this.field2746.field2754;
                return var4;
            }
        }
        this.field2746 = null;
        return null;
    }

    @ObfuscatedName("fj.h(Lfk;J)V")
    public void method3283(class177 arg0, long arg1) {
        if (arg0.field2756 != null) {
            arg0.method3346();
        }
        class177 var4 = this.field2744[(int) (arg1 & (long) (this.field2747 - 1))];
        arg0.field2756 = var4.field2756;
        arg0.field2754 = var4;
        arg0.field2756.field2754 = arg0;
        arg0.field2754.field2756 = arg0;
        arg0.field2755 = arg1;
    }

    @ObfuscatedName("fj.c()V")
    public void method3284() {
        for (int var1 = 0; var1 < this.field2747; var1++) {
            class177 var2 = this.field2744[var1];
            while (true) {
                class177 var3 = var2.field2754;
                if (var2 == var3) {
                    break;
                }
                var3.method3346();
            }
        }
        this.field2746 = null;
        this.field2745 = null;
    }

    @ObfuscatedName("fj.p()Lfk;")
    public class177 method3285() {
        this.field2748 = 0;
        return this.method3286();
    }

    @ObfuscatedName("fj.i()Lfk;")
    public class177 method3286() {
        if (this.field2748 > 0 && this.field2744[this.field2748 - 1] != this.field2745) {
            class177 var1 = this.field2745;
            this.field2745 = var1.field2754;
            return var1;
        }
        class177 var2;
        do {
            if (this.field2748 >= this.field2747) {
                return null;
            }
            var2 = this.field2744[this.field2748++].field2754;
        } while (this.field2744[this.field2748 - 1] == var2);
        this.field2745 = var2.field2754;
        return var2;
    }
}
