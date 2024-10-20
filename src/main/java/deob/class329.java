package deob;

@ObfuscatedName("ls")
public final class class329 {

    @ObfuscatedName("ls.h")
    public int field3875;

    @ObfuscatedName("ls.v")
    public class190[] field3874;

    @ObfuscatedName("ls.x")
    public class190 field3873;

    @ObfuscatedName("ls.w")
    public class190 field3876;

    @ObfuscatedName("ls.t")
    public int field3877 = 0;

    public class329(int arg0) {
        this.field3875 = arg0;
        this.field3874 = new class190[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class190 var3 = this.field3874[var2] = new class190();
            var3.field2137 = var3;
            var3.field2139 = var3;
        }
    }

    @ObfuscatedName("ls.h(J)Lgu;")
    public class190 method5543(long arg0) {
        class190 var3 = this.field3874[(int) (arg0 & (long) (this.field3875 - 1))];
        for (this.field3873 = var3.field2137; this.field3873 != var3; this.field3873 = this.field3873.field2137) {
            if (this.field3873.field2138 == arg0) {
                class190 var4 = this.field3873;
                this.field3873 = this.field3873.field2137;
                return var4;
            }
        }
        this.field3873 = null;
        return null;
    }

    @ObfuscatedName("ls.v(Lgu;J)V")
    public void method5531(class190 arg0, long arg1) {
        if (arg0.field2139 != null) {
            arg0.method3359();
        }
        class190 var4 = this.field3874[(int) (arg1 & (long) (this.field3875 - 1))];
        arg0.field2139 = var4.field2139;
        arg0.field2137 = var4;
        arg0.field2139.field2137 = arg0;
        arg0.field2137.field2139 = arg0;
        arg0.field2138 = arg1;
    }

    @ObfuscatedName("ls.x()Lgu;")
    public class190 method5537() {
        this.field3877 = 0;
        return this.method5532();
    }

    @ObfuscatedName("ls.w()Lgu;")
    public class190 method5532() {
        if (this.field3877 > 0 && this.field3874[this.field3877 - 1] != this.field3876) {
            class190 var1 = this.field3876;
            this.field3876 = var1.field2137;
            return var1;
        }
        class190 var2;
        do {
            if (this.field3877 >= this.field3875) {
                return null;
            }
            var2 = this.field3874[this.field3877++].field2137;
        } while (this.field3874[this.field3877 - 1] == var2);
        this.field3876 = var2.field2137;
        return var2;
    }
}
