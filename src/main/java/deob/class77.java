package deob;

@ObfuscatedName("ba")
public final class class77 extends class135 {

    @ObfuscatedName("ba.a")
    public int field1091;

    @ObfuscatedName("ba.s")
    public int field1086;

    @ObfuscatedName("ba.g")
    public int field1093;

    @ObfuscatedName("ba.x")
    public int field1085;

    @ObfuscatedName("ba.h")
    public int field1088;

    @ObfuscatedName("ba.f")
    public int field1090;

    @ObfuscatedName("ba.p")
    public class280 field1089;

    @ObfuscatedName("ba.m")
    public int field1092 = 0;

    @ObfuscatedName("ba.q")
    public int field1087 = 0;

    @ObfuscatedName("ba.b")
    public boolean field1094 = false;

    public class77(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1091 = arg0;
        this.field1093 = arg1;
        this.field1088 = arg2;
        this.field1085 = arg3;
        this.field1090 = arg4;
        this.field1086 = arg5 + arg6;
        int var8 = class265.method2303(this.field1091).field3359;
        if (var8 == -1) {
            this.field1094 = true;
        } else {
            this.field1094 = false;
            this.field1089 = class280.method3173(var8);
        }
    }

    @ObfuscatedName("ba.a(II)V")
    public final void method1881(int arg0) {
        if (this.field1094) {
            return;
        }
        this.field1087 += arg0;
        while (this.field1087 > this.field1089.field3622[this.field1092]) {
            this.field1087 -= this.field1089.field3622[this.field1092];
            this.field1092++;
            if (this.field1092 >= this.field1089.field3620.length) {
                this.field1094 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ba.q(I)Ldv;")
    public final class127 method1112() {
        class265 var1 = class265.method2303(this.field1091);
        class127 var2;
        if (this.field1094) {
            var2 = var1.method4644(-1);
        } else {
            var2 = var1.method4644(this.field1092);
        }
        return var2 == null ? null : var2;
    }
}
