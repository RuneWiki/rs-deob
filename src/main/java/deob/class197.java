package deob;

@ObfuscatedName("gb")
public final class class197 {

    @ObfuscatedName("gb.i")
    public class208 field3138 = new class208();

    @ObfuscatedName("gb.h")
    public int field3141;

    @ObfuscatedName("gb.e")
    public int field3139;

    @ObfuscatedName("gb.g")
    public class200 field3137;

    @ObfuscatedName("gb.n")
    public class207 field3140 = new class207();

    public class197(int arg0) {
        this.field3141 = arg0;
        this.field3139 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3137 = new class200(var2);
    }

    @ObfuscatedName("gb.i(J)Lgw;")
    public class208 method3541(long arg0) {
        class208 var3 = (class208) this.field3137.method3564(arg0);
        if (var3 != null) {
            this.field3140.method3655(var3);
        }
        return var3;
    }

    @ObfuscatedName("gb.h(J)V")
    public void method3531(long arg0) {
        class208 var3 = (class208) this.field3137.method3564(arg0);
        if (var3 != null) {
            var3.method3706();
            var3.method3676();
            this.field3139++;
        }
    }

    @ObfuscatedName("gb.e(Lgw;J)V")
    public void method3532(class208 arg0, long arg1) {
        if (this.field3139 == 0) {
            class208 var4 = this.field3140.method3661();
            var4.method3706();
            var4.method3676();
            if (this.field3138 == var4) {
                class208 var5 = this.field3140.method3661();
                var5.method3706();
                var5.method3676();
            }
        } else {
            this.field3139--;
        }
        this.field3137.method3565(arg0, arg1);
        this.field3140.method3655(arg0);
    }

    @ObfuscatedName("gb.g()V")
    public void method3533() {
        this.field3140.method3660();
        this.field3137.method3572();
        this.field3138 = new class208();
        this.field3139 = this.field3141;
    }
}
