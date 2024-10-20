package deob;

@ObfuscatedName("fd")
public final class class177 {

    @ObfuscatedName("fd.x")
    public int field2855;

    @ObfuscatedName("fd.v")
    public class189[] field2856;

    @ObfuscatedName("fd.m")
    public class189 field2857;

    @ObfuscatedName("fd.e")
    public class189 field2859;

    @ObfuscatedName("fd.h")
    public int field2858 = 0;

    public class177(int arg0) {
        this.field2855 = arg0;
        this.field2856 = new class189[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class189 var3 = this.field2856[var2] = new class189();
            var3.field2881 = var3;
            var3.field2880 = var3;
        }
    }

    @ObfuscatedName("fd.x(J)Lgs;")
    public class189 method3214(long arg0) {
        class189 var3 = this.field2856[(int) (arg0 & (long) (this.field2855 - 1))];
        for (this.field2857 = var3.field2881; this.field2857 != var3; this.field2857 = this.field2857.field2881) {
            if (this.field2857.field2882 == arg0) {
                class189 var4 = this.field2857;
                this.field2857 = this.field2857.field2881;
                return var4;
            }
        }
        this.field2857 = null;
        return null;
    }

    @ObfuscatedName("fd.v(Lgs;J)V")
    public void method3215(class189 arg0, long arg1) {
        if (arg0.field2880 != null) {
            arg0.method3352();
        }
        class189 var4 = this.field2856[(int) (arg1 & (long) (this.field2855 - 1))];
        arg0.field2880 = var4.field2880;
        arg0.field2881 = var4;
        arg0.field2880.field2881 = arg0;
        arg0.field2881.field2880 = arg0;
        arg0.field2882 = arg1;
    }

    @ObfuscatedName("fd.m()V")
    public void method3220() {
        for (int var1 = 0; var1 < this.field2855; var1++) {
            class189 var2 = this.field2856[var1];
            while (true) {
                class189 var3 = var2.field2881;
                if (var2 == var3) {
                    break;
                }
                var3.method3352();
            }
        }
        this.field2857 = null;
        this.field2859 = null;
    }

    @ObfuscatedName("fd.e()Lgs;")
    public class189 method3217() {
        this.field2858 = 0;
        return this.method3218();
    }

    @ObfuscatedName("fd.h()Lgs;")
    public class189 method3218() {
        if (this.field2858 > 0 && this.field2856[this.field2858 - 1] != this.field2859) {
            class189 var1 = this.field2859;
            this.field2859 = var1.field2881;
            return var1;
        }
        class189 var2;
        do {
            if (this.field2858 >= this.field2855) {
                return null;
            }
            var2 = this.field2856[this.field2858++].field2881;
        } while (this.field2856[this.field2858 - 1] == var2);
        this.field2859 = var2.field2881;
        return var2;
    }
}
