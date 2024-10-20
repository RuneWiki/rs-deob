package deob;

@ObfuscatedName("cg")
public final class class83 extends class140 {

    @ObfuscatedName("cg.o")
    public int field1304;

    @ObfuscatedName("cg.k")
    public int field1294;

    @ObfuscatedName("cg.t")
    public int field1295;

    @ObfuscatedName("cg.d")
    public int field1296;

    @ObfuscatedName("cg.h")
    public int field1297;

    @ObfuscatedName("cg.m")
    public int field1298;

    @ObfuscatedName("cg.z")
    public class288 field1299;

    @ObfuscatedName("cg.i")
    public int field1293 = 0;

    @ObfuscatedName("cg.u")
    public int field1305 = 0;

    @ObfuscatedName("cg.x")
    public boolean field1300 = false;

    public class83(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1304 = arg0;
        this.field1295 = arg1;
        this.field1296 = arg2;
        this.field1297 = arg3;
        this.field1298 = arg4;
        this.field1294 = arg5 + arg6;
        int var8 = class273.method1734(this.field1304).field3498;
        if (var8 == -1) {
            this.field1300 = true;
        } else {
            this.field1300 = false;
            this.field1299 = class288.method1535(var8);
        }
    }

    @ObfuscatedName("cg.o(IB)V")
    public final void method1705(int arg0) {
        if (this.field1300) {
            return;
        }
        this.field1305 += arg0;
        while (this.field1305 > this.field1299.field3764[this.field1293]) {
            this.field1305 -= this.field1299.field3764[this.field1293];
            this.field1293++;
            if (this.field1293 >= this.field1299.field3758.length) {
                this.field1300 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cg.u(I)Lei;")
    public final class132 method1081() {
        class273 var1 = class273.method1734(this.field1304);
        class132 var2;
        if (this.field1300) {
            var2 = var1.method4416(-1);
        } else {
            var2 = var1.method4416(this.field1293);
        }
        return var2 == null ? null : var2;
    }
}
