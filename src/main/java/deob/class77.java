package deob;

@ObfuscatedName("bg")
public final class class77 extends class135 {

    @ObfuscatedName("bg.n")
    public int field1072;

    @ObfuscatedName("bg.h")
    public int field1068;

    @ObfuscatedName("bg.l")
    public int field1073;

    @ObfuscatedName("bg.g")
    public int field1070;

    @ObfuscatedName("bg.b")
    public int field1071;

    @ObfuscatedName("bg.a")
    public int field1074;

    @ObfuscatedName("bg.c")
    public class279 field1077;

    @ObfuscatedName("bg.z")
    public int field1067 = 0;

    @ObfuscatedName("bg.j")
    public int field1075 = 0;

    @ObfuscatedName("bg.d")
    public boolean field1076 = false;

    public class77(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1072 = arg0;
        this.field1073 = arg1;
        this.field1070 = arg2;
        this.field1071 = arg3;
        this.field1074 = arg4;
        this.field1068 = arg5 + arg6;
        int var8 = class264.method2268(this.field1072).field3345;
        if (var8 == -1) {
            this.field1076 = true;
        } else {
            this.field1076 = false;
            this.field1077 = class279.method2783(var8);
        }
    }

    @ObfuscatedName("bg.n(IB)V")
    public final void method1818(int arg0) {
        if (this.field1076) {
            return;
        }
        this.field1075 += arg0;
        while (this.field1075 > this.field1077.field3603[this.field1067]) {
            this.field1075 -= this.field1077.field3603[this.field1067];
            this.field1067++;
            if (this.field1067 >= this.field1077.field3612.length) {
                this.field1076 = true;
                break;
            }
        }
    }

    @ObfuscatedName("bg.j(I)Ldq;")
    public final class127 method1101() {
        class264 var1 = class264.method2268(this.field1072);
        class127 var2;
        if (this.field1076) {
            var2 = var1.method4686(-1);
        } else {
            var2 = var1.method4686(this.field1067);
        }
        return var2 == null ? null : var2;
    }
}
