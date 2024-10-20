package deob;

@ObfuscatedName("bf")
public final class class71 extends class128 {

    @ObfuscatedName("bf.w")
    public int field1033;

    @ObfuscatedName("bf.m")
    public int field1034;

    @ObfuscatedName("bf.q")
    public int field1035;

    @ObfuscatedName("bf.b")
    public int field1036;

    @ObfuscatedName("bf.f")
    public int field1045;

    @ObfuscatedName("bf.n")
    public int field1038;

    @ObfuscatedName("bf.h")
    public class274 field1039;

    @ObfuscatedName("bf.x")
    public int field1040 = 0;

    @ObfuscatedName("bf.j")
    public int field1041 = 0;

    @ObfuscatedName("bf.a")
    public boolean field1042 = false;

    public class71(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1033 = arg0;
        this.field1035 = arg1;
        this.field1036 = arg2;
        this.field1045 = arg3;
        this.field1038 = arg4;
        this.field1034 = arg5 + arg6;
        int var8 = class259.method973(this.field1033).field3293;
        if (var8 == -1) {
            this.field1042 = true;
        } else {
            this.field1042 = false;
            this.field1039 = class274.method2918(var8);
        }
    }

    @ObfuscatedName("bf.w(II)V")
    public final void method1691(int arg0) {
        if (this.field1042) {
            return;
        }
        this.field1041 += arg0;
        while (this.field1041 > this.field1039.field3563[this.field1040]) {
            this.field1041 -= this.field1039.field3563[this.field1040];
            this.field1040++;
            if (this.field1040 >= this.field1039.field3554.length) {
                this.field1042 = true;
                break;
            }
        }
    }

    @ObfuscatedName("bf.s(B)Ldk;")
    public final class120 method1048() {
        class259 var1 = class259.method973(this.field1033);
        class120 var2;
        if (this.field1042) {
            var2 = var1.method4477(-1);
        } else {
            var2 = var1.method4477(this.field1040);
        }
        return var2 == null ? null : var2;
    }
}
