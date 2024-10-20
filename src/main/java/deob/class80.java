package deob;

@ObfuscatedName("cf")
public final class class80 extends class177 {

    @ObfuscatedName("cf.f")
    public int field962;

    @ObfuscatedName("cf.o")
    public int field955;

    @ObfuscatedName("cf.u")
    public int field956;

    @ObfuscatedName("cf.p")
    public int field957;

    @ObfuscatedName("cf.b")
    public int field958;

    @ObfuscatedName("cf.e")
    public int field954;

    @ObfuscatedName("cf.k")
    public class298 field960;

    @ObfuscatedName("cf.g")
    public int field961 = 0;

    @ObfuscatedName("cf.h")
    public int field959 = 0;

    @ObfuscatedName("cf.n")
    public boolean field963 = false;

    public class80(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field962 = arg0;
        this.field956 = arg1;
        this.field957 = arg2;
        this.field958 = arg3;
        this.field954 = arg4;
        this.field955 = arg5 + arg6;
        int var8 = class289.method3663(this.field962).field3528;
        if (var8 == -1) {
            this.field963 = true;
        } else {
            this.field963 = false;
            this.field960 = class298.method3795(var8);
        }
    }

    @ObfuscatedName("cf.f(II)V")
    public final void method1648(int arg0) {
        if (this.field963) {
            return;
        }
        this.field959 += arg0;
        while (this.field959 > this.field960.field3714[this.field961]) {
            this.field959 -= this.field960.field3714[this.field961];
            this.field961++;
            if (this.field961 >= this.field960.field3712.length) {
                this.field963 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cf.o(I)Lgv;")
    public final class183 method1649() {
        class289 var1 = class289.method3663(this.field962);
        class183 var2;
        if (this.field963) {
            var2 = var1.method4473(-1);
        } else {
            var2 = var1.method4473(this.field961);
        }
        return var2 == null ? null : var2;
    }
}
