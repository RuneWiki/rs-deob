package deob;

@ObfuscatedName("le")
public final class class318 {

    @ObfuscatedName("le.f")
    public int field3833;

    @ObfuscatedName("le.i")
    public class188[] field3830;

    @ObfuscatedName("le.y")
    public class188 field3831;

    @ObfuscatedName("le.w")
    public class188 field3832;

    @ObfuscatedName("le.p")
    public int field3834 = 0;

    public class318(int arg0) {
        this.field3833 = arg0;
        this.field3830 = new class188[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class188 var3 = this.field3830[var2] = new class188();
            var3.field2323 = var3;
            var3.field2324 = var3;
        }
    }

    @ObfuscatedName("le.f(J)Lgk;")
    public class188 method5499(long arg0) {
        class188 var3 = this.field3830[(int) (arg0 & (long) (this.field3833 - 1))];
        for (this.field3831 = var3.field2323; this.field3831 != var3; this.field3831 = this.field3831.field2323) {
            if (this.field3831.field2322 == arg0) {
                class188 var4 = this.field3831;
                this.field3831 = this.field3831.field2323;
                return var4;
            }
        }
        this.field3831 = null;
        return null;
    }

    @ObfuscatedName("le.i(Lgk;J)V")
    public void method5502(class188 arg0, long arg1) {
        if (arg0.field2324 != null) {
            arg0.method3292();
        }
        class188 var4 = this.field3830[(int) (arg1 & (long) (this.field3833 - 1))];
        arg0.field2324 = var4.field2324;
        arg0.field2323 = var4;
        arg0.field2324.field2323 = arg0;
        arg0.field2323.field2324 = arg0;
        arg0.field2322 = arg1;
    }

    @ObfuscatedName("le.y()Lgk;")
    public class188 method5501() {
        this.field3834 = 0;
        return this.method5500();
    }

    @ObfuscatedName("le.w()Lgk;")
    public class188 method5500() {
        if (this.field3834 > 0 && this.field3830[this.field3834 - 1] != this.field3832) {
            class188 var1 = this.field3832;
            this.field3832 = var1.field2323;
            return var1;
        }
        class188 var2;
        do {
            if (this.field3834 >= this.field3833) {
                return null;
            }
            var2 = this.field3830[this.field3834++].field2323;
        } while (this.field3830[this.field3834 - 1] == var2);
        this.field3832 = var2.field2323;
        return var2;
    }
}
