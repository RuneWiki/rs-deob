package deob;

@ObfuscatedName("ba")
public final class class72 extends class130 {

    @ObfuscatedName("ba.f")
    public int field1054;

    @ObfuscatedName("ba.h")
    public int field1049;

    @ObfuscatedName("ba.e")
    public int field1050;

    @ObfuscatedName("ba.b")
    public int field1051;

    @ObfuscatedName("ba.l")
    public int field1052;

    @ObfuscatedName("ba.w")
    public int field1058;

    @ObfuscatedName("ba.d")
    public class276 field1061;

    @ObfuscatedName("ba.n")
    public int field1048 = 0;

    @ObfuscatedName("ba.s")
    public int field1056 = 0;

    @ObfuscatedName("ba.g")
    public boolean field1057 = false;

    public class72(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1054 = arg0;
        this.field1050 = arg1;
        this.field1051 = arg2;
        this.field1052 = arg3;
        this.field1058 = arg4;
        this.field1049 = arg5 + arg6;
        int var8 = class261.method2874(this.field1054).field3321;
        if (var8 == -1) {
            this.field1057 = true;
        } else {
            this.field1057 = false;
            this.field1061 = class276.method2865(var8);
        }
    }

    @ObfuscatedName("ba.f(IB)V")
    public final void method1688(int arg0) {
        if (this.field1057) {
            return;
        }
        this.field1056 += arg0;
        while (this.field1056 > this.field1061.field3599[this.field1048]) {
            this.field1056 -= this.field1061.field3599[this.field1048];
            this.field1048++;
            if (this.field1048 >= this.field1061.field3597.length) {
                this.field1057 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ba.s(B)Lds;")
    public final class122 method1038() {
        class261 var1 = class261.method2874(this.field1054);
        class122 var2;
        if (this.field1057) {
            var2 = var1.method4493(-1);
        } else {
            var2 = var1.method4493(this.field1048);
        }
        return var2 == null ? null : var2;
    }
}
