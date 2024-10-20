package deob;

@ObfuscatedName("fd")
public final class class175 {

    @ObfuscatedName("fd.p")
    public int field2811;

    @ObfuscatedName("fd.l")
    public class179[] field2810;

    @ObfuscatedName("fd.d")
    public class179 field2809;

    @ObfuscatedName("fd.x")
    public class179 field2812;

    @ObfuscatedName("fd.o")
    public int field2813 = 0;

    public class175(int arg0) {
        this.field2811 = arg0;
        this.field2810 = new class179[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class179 var3 = this.field2810[var2] = new class179();
            var3.field2820 = var3;
            var3.field2819 = var3;
        }
    }

    @ObfuscatedName("fd.p(J)Lfn;")
    public class179 method3405(long arg0) {
        class179 var3 = this.field2810[(int) (arg0 & (long) (this.field2811 - 1))];
        for (this.field2809 = var3.field2820; this.field2809 != var3; this.field2809 = this.field2809.field2820) {
            if (this.field2809.field2821 == arg0) {
                class179 var4 = this.field2809;
                this.field2809 = this.field2809.field2820;
                return var4;
            }
        }
        this.field2809 = null;
        return null;
    }

    @ObfuscatedName("fd.l(Lfn;J)V")
    public void method3406(class179 arg0, long arg1) {
        if (arg0.field2819 != null) {
            arg0.method3455();
        }
        class179 var4 = this.field2810[(int) (arg1 & (long) (this.field2811 - 1))];
        arg0.field2819 = var4.field2819;
        arg0.field2820 = var4;
        arg0.field2819.field2820 = arg0;
        arg0.field2820.field2819 = arg0;
        arg0.field2821 = arg1;
    }

    @ObfuscatedName("fd.d()V")
    public void method3407() {
        for (int var1 = 0; var1 < this.field2811; var1++) {
            class179 var2 = this.field2810[var1];
            while (true) {
                class179 var3 = var2.field2820;
                if (var2 == var3) {
                    break;
                }
                var3.method3455();
            }
        }
        this.field2809 = null;
        this.field2812 = null;
    }

    @ObfuscatedName("fd.x()Lfn;")
    public class179 method3408() {
        this.field2813 = 0;
        return this.method3415();
    }

    @ObfuscatedName("fd.o()Lfn;")
    public class179 method3415() {
        if (this.field2813 > 0 && this.field2810[this.field2813 - 1] != this.field2812) {
            class179 var1 = this.field2812;
            this.field2812 = var1.field2820;
            return var1;
        }
        class179 var2;
        do {
            if (this.field2813 >= this.field2811) {
                return null;
            }
            var2 = this.field2810[this.field2813++].field2820;
        } while (this.field2810[this.field2813 - 1] == var2);
        this.field2812 = var2.field2820;
        return var2;
    }
}
