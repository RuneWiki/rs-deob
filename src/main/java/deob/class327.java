package deob;

import java.util.Iterator;

@ObfuscatedName("la")
public final class class327 implements Iterable {

    @ObfuscatedName("la.h")
    public int field3868;

    @ObfuscatedName("la.v")
    public class190[] field3865;

    @ObfuscatedName("la.x")
    public class190 field3864;

    @ObfuscatedName("la.w")
    public class190 field3867;

    @ObfuscatedName("la.t")
    public int field3866 = 0;

    public class327(int arg0) {
        this.field3868 = arg0;
        this.field3865 = new class190[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class190 var3 = this.field3865[var2] = new class190();
            var3.field2137 = var3;
            var3.field2139 = var3;
        }
    }

    @ObfuscatedName("la.h(J)Lgu;")
    public class190 method5494(long arg0) {
        class190 var3 = this.field3865[(int) (arg0 & (long) (this.field3868 - 1))];
        for (this.field3864 = var3.field2137; this.field3864 != var3; this.field3864 = this.field3864.field2137) {
            if (this.field3864.field2138 == arg0) {
                class190 var4 = this.field3864;
                this.field3864 = this.field3864.field2137;
                return var4;
            }
        }
        this.field3864 = null;
        return null;
    }

    @ObfuscatedName("la.v(Lgu;J)V")
    public void method5503(class190 arg0, long arg1) {
        if (arg0.field2139 != null) {
            arg0.method3359();
        }
        class190 var4 = this.field3865[(int) (arg1 & (long) (this.field3868 - 1))];
        arg0.field2139 = var4.field2139;
        arg0.field2137 = var4;
        arg0.field2139.field2137 = arg0;
        arg0.field2137.field2139 = arg0;
        arg0.field2138 = arg1;
    }

    @ObfuscatedName("la.x()V")
    public void method5495() {
        for (int var1 = 0; var1 < this.field3868; var1++) {
            class190 var2 = this.field3865[var1];
            while (true) {
                class190 var3 = var2.field2137;
                if (var2 == var3) {
                    break;
                }
                var3.method3359();
            }
        }
        this.field3864 = null;
        this.field3867 = null;
    }

    @ObfuscatedName("la.w()Lgu;")
    public class190 method5508() {
        this.field3866 = 0;
        return this.method5497();
    }

    @ObfuscatedName("la.t()Lgu;")
    public class190 method5497() {
        if (this.field3866 > 0 && this.field3865[this.field3866 - 1] != this.field3867) {
            class190 var1 = this.field3867;
            this.field3867 = var1.field2137;
            return var1;
        }
        class190 var2;
        do {
            if (this.field3866 >= this.field3868) {
                return null;
            }
            var2 = this.field3865[this.field3866++].field2137;
        } while (this.field3865[this.field3866 - 1] == var2);
        this.field3867 = var2.field2137;
        return var2;
    }

    public Iterator iterator() {
        return new class328(this);
    }
}
