package deob;

@ObfuscatedName("bd")
public final class class72 extends class130 {

    @ObfuscatedName("bd.c")
    public int field1074;

    @ObfuscatedName("bd.q")
    public int field1069;

    @ObfuscatedName("bd.m")
    public int field1070;

    @ObfuscatedName("bd.j")
    public int field1076;

    @ObfuscatedName("bd.g")
    public int field1072;

    @ObfuscatedName("bd.i")
    public int field1073;

    @ObfuscatedName("bd.h")
    public class276 field1078;

    @ObfuscatedName("bd.l")
    public int field1075 = 0;

    @ObfuscatedName("bd.d")
    public int field1068 = 0;

    @ObfuscatedName("bd.o")
    public boolean field1077 = false;

    public class72(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1074 = arg0;
        this.field1070 = arg1;
        this.field1076 = arg2;
        this.field1072 = arg3;
        this.field1073 = arg4;
        this.field1069 = arg5 + arg6;
        int var8 = class261.method34(this.field1074).field3308;
        if (var8 == -1) {
            this.field1077 = true;
        } else {
            this.field1077 = false;
            this.field1078 = class276.method2826(var8);
        }
    }

    @ObfuscatedName("bd.c(II)V")
    public final void method1641(int arg0) {
        if (this.field1077) {
            return;
        }
        this.field1068 += arg0;
        while (this.field1068 > this.field1078.field3587[this.field1075]) {
            this.field1068 -= this.field1078.field3587[this.field1075];
            this.field1075++;
            if (this.field1075 >= this.field1078.field3585.length) {
                this.field1077 = true;
                break;
            }
        }
    }

    @ObfuscatedName("bd.o(B)Ldx;")
    public final class122 method1063() {
        class261 var1 = class261.method34(this.field1074);
        class122 var2;
        if (this.field1077) {
            var2 = var1.method4477(-1);
        } else {
            var2 = var1.method4477(this.field1075);
        }
        return var2 == null ? null : var2;
    }
}
