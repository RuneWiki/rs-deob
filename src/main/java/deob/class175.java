package deob;

@ObfuscatedName("fy")
public final class class175 {

    @ObfuscatedName("fy.q")
    public int field2820;

    @ObfuscatedName("fy.c")
    public class179[] field2823;

    @ObfuscatedName("fy.p")
    public class179 field2819;

    @ObfuscatedName("fy.z")
    public class179 field2822;

    @ObfuscatedName("fy.m")
    public int field2821 = 0;

    public class175(int arg0) {
        this.field2820 = arg0;
        this.field2823 = new class179[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class179 var3 = this.field2823[var2] = new class179();
            var3.field2829 = var3;
            var3.field2831 = var3;
        }
    }

    @ObfuscatedName("fy.q(J)Lft;")
    public class179 method3260(long arg0) {
        class179 var3 = this.field2823[(int) (arg0 & (long) (this.field2820 - 1))];
        for (this.field2819 = var3.field2829; this.field2819 != var3; this.field2819 = this.field2819.field2829) {
            if (this.field2819.field2830 == arg0) {
                class179 var4 = this.field2819;
                this.field2819 = this.field2819.field2829;
                return var4;
            }
        }
        this.field2819 = null;
        return null;
    }

    @ObfuscatedName("fy.c(Lft;J)V")
    public void method3261(class179 arg0, long arg1) {
        if (arg0.field2831 != null) {
            arg0.method3309();
        }
        class179 var4 = this.field2823[(int) (arg1 & (long) (this.field2820 - 1))];
        arg0.field2831 = var4.field2831;
        arg0.field2829 = var4;
        arg0.field2831.field2829 = arg0;
        arg0.field2829.field2831 = arg0;
        arg0.field2830 = arg1;
    }

    @ObfuscatedName("fy.p()V")
    public void method3272() {
        for (int var1 = 0; var1 < this.field2820; var1++) {
            class179 var2 = this.field2823[var1];
            while (true) {
                class179 var3 = var2.field2829;
                if (var2 == var3) {
                    break;
                }
                var3.method3309();
            }
        }
        this.field2819 = null;
        this.field2822 = null;
    }

    @ObfuscatedName("fy.z()Lft;")
    public class179 method3262() {
        this.field2821 = 0;
        return this.method3265();
    }

    @ObfuscatedName("fy.m()Lft;")
    public class179 method3265() {
        if (this.field2821 > 0 && this.field2823[this.field2821 - 1] != this.field2822) {
            class179 var1 = this.field2822;
            this.field2822 = var1.field2829;
            return var1;
        }
        class179 var2;
        do {
            if (this.field2821 >= this.field2820) {
                return null;
            }
            var2 = this.field2823[this.field2821++].field2829;
        } while (this.field2823[this.field2821 - 1] == var2);
        this.field2822 = var2.field2829;
        return var2;
    }
}
