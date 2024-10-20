package deob;

@ObfuscatedName("by")
public final class class72 extends class130 {

    @ObfuscatedName("by.f")
    public int field1064;

    @ObfuscatedName("by.l")
    public int field1063;

    @ObfuscatedName("by.w")
    public int field1075;

    @ObfuscatedName("by.s")
    public int field1065;

    @ObfuscatedName("by.e")
    public int field1066;

    @ObfuscatedName("by.a")
    public int field1067;

    @ObfuscatedName("by.c")
    public class276 field1068;

    @ObfuscatedName("by.p")
    public int field1076 = 0;

    @ObfuscatedName("by.r")
    public int field1071 = 0;

    @ObfuscatedName("by.m")
    public boolean field1073 = false;

    public class72(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1064 = arg0;
        this.field1075 = arg1;
        this.field1065 = arg2;
        this.field1066 = arg3;
        this.field1067 = arg4;
        this.field1063 = arg5 + arg6;
        int var8 = class261.method2403(this.field1064).field3334;
        if (var8 == -1) {
            this.field1073 = true;
        } else {
            this.field1073 = false;
            this.field1068 = class276.method3224(var8);
        }
    }

    @ObfuscatedName("by.f(IS)V")
    public final void method1737(int arg0) {
        if (this.field1073) {
            return;
        }
        this.field1071 += arg0;
        while (this.field1071 > this.field1068.field3617[this.field1076]) {
            this.field1071 -= this.field1068.field3617[this.field1076];
            this.field1076++;
            if (this.field1076 >= this.field1068.field3625.length) {
                this.field1073 = true;
                break;
            }
        }
    }

    @ObfuscatedName("by.m(S)Lds;")
    public final class122 method1042() {
        class261 var1 = class261.method2403(this.field1064);
        class122 var2;
        if (this.field1073) {
            var2 = var1.method4533(-1);
        } else {
            var2 = var1.method4533(this.field1076);
        }
        return var2 == null ? null : var2;
    }
}
