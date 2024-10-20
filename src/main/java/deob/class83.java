package deob;

@ObfuscatedName("cp")
public final class class83 extends class140 {

    @ObfuscatedName("cp.g")
    public int field1285;

    @ObfuscatedName("cp.e")
    public int field1281;

    @ObfuscatedName("cp.b")
    public int field1282;

    @ObfuscatedName("cp.z")
    public int field1280;

    @ObfuscatedName("cp.n")
    public int field1286;

    @ObfuscatedName("cp.l")
    public int field1284;

    @ObfuscatedName("cp.s")
    public class288 field1283;

    @ObfuscatedName("cp.y")
    public int field1287 = 0;

    @ObfuscatedName("cp.c")
    public int field1288 = 0;

    @ObfuscatedName("cp.h")
    public boolean field1289 = false;

    public class83(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1285 = arg0;
        this.field1282 = arg1;
        this.field1286 = arg2;
        this.field1284 = arg3;
        this.field1280 = arg4;
        this.field1281 = arg5 + arg6;
        int var8 = class273.method1058(this.field1285).field3496;
        if (var8 == -1) {
            this.field1289 = true;
        } else {
            this.field1289 = false;
            this.field1283 = class288.method1825(var8);
        }
    }

    @ObfuscatedName("cp.g(II)V")
    public final void method1795(int arg0) {
        if (this.field1289) {
            return;
        }
        this.field1288 += arg0;
        while (this.field1288 > this.field1283.field3757[this.field1287]) {
            this.field1288 -= this.field1283.field3757[this.field1287];
            this.field1287++;
            if (this.field1287 >= this.field1283.field3762.length) {
                this.field1289 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cp.c(I)Lee;")
    public final class132 method1120() {
        class273 var1 = class273.method1058(this.field1285);
        class132 var2;
        if (this.field1289) {
            var2 = var1.method4518(-1);
        } else {
            var2 = var1.method4518(this.field1287);
        }
        return var2 == null ? null : var2;
    }
}
