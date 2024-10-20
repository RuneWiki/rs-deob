package deob;

@ObfuscatedName("by")
public final class class71 extends class128 {

    @ObfuscatedName("by.z")
    public int field1018;

    @ObfuscatedName("by.w")
    public int field1024;

    @ObfuscatedName("by.s")
    public int field1013;

    @ObfuscatedName("by.l")
    public int field1015;

    @ObfuscatedName("by.u")
    public int field1016;

    @ObfuscatedName("by.q")
    public int field1017;

    @ObfuscatedName("by.k")
    public class274 field1019;

    @ObfuscatedName("by.i")
    public int field1020 = 0;

    @ObfuscatedName("by.x")
    public int field1021 = 0;

    @ObfuscatedName("by.e")
    public boolean field1022 = false;

    public class71(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1024 = arg0;
        this.field1015 = arg1;
        this.field1016 = arg2;
        this.field1017 = arg3;
        this.field1018 = arg4;
        this.field1013 = arg5 + arg6;
        int var8 = class259.method956(this.field1024).field3272;
        if (var8 == -1) {
            this.field1022 = true;
        } else {
            this.field1022 = false;
            this.field1019 = class274.method26(var8);
        }
    }

    @ObfuscatedName("by.z(IB)V")
    public final void method1660(int arg0) {
        if (this.field1022) {
            return;
        }
        this.field1021 += arg0;
        while (this.field1021 > this.field1019.field3542[this.field1020]) {
            this.field1021 -= this.field1019.field3542[this.field1020];
            this.field1020++;
            if (this.field1020 >= this.field1019.field3541.length) {
                this.field1022 = true;
                break;
            }
        }
    }

    @ObfuscatedName("by.e(I)Ldc;")
    public final class120 method1010() {
        class259 var1 = class259.method956(this.field1024);
        class120 var2;
        if (this.field1022) {
            var2 = var1.method4475(-1);
        } else {
            var2 = var1.method4475(this.field1020);
        }
        return var2 == null ? null : var2;
    }
}
