package deob;

@ObfuscatedName("cl")
public final class class86 extends class143 {

    @ObfuscatedName("cl.e")
    public int field1350;

    @ObfuscatedName("cl.n")
    public int field1344;

    @ObfuscatedName("cl.g")
    public int field1345;

    @ObfuscatedName("cl.y")
    public class262 field1349;

    @ObfuscatedName("cl.w")
    public int field1346;

    @ObfuscatedName("cl.k")
    public int field1347;

    @ObfuscatedName("cl.v")
    public int field1348;

    @ObfuscatedName("cl.z")
    public int field1353 = 0;

    @ObfuscatedName("cl.r")
    public int field1351 = 0;

    @ObfuscatedName("cl.u")
    public boolean field1352 = false;

    public class86(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1350 = arg0;
        this.field1345 = arg1;
        this.field1346 = arg2;
        this.field1347 = arg3;
        this.field1348 = arg4;
        this.field1344 = arg5 + arg6;
        int var8 = class247.method891(this.field1350).field3332;
        if (var8 == -1) {
            this.field1352 = true;
        } else {
            this.field1352 = false;
            this.field1349 = class262.method1025(var8);
        }
    }

    @ObfuscatedName("cl.e(II)V")
    public final void method1566(int arg0) {
        if (this.field1352) {
            return;
        }
        this.field1351 += arg0;
        while (this.field1351 > this.field1349.field3599[this.field1353]) {
            this.field1351 -= this.field1349.field3599[this.field1353];
            this.field1353++;
            if (this.field1353 >= this.field1349.field3596.length) {
                this.field1352 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cl.g(I)Lew;")
    public final class135 method1081() {
        class247 var1 = class247.method891(this.field1350);
        class135 var2;
        if (this.field1352) {
            var2 = var1.method4024(-1);
        } else {
            var2 = var1.method4024(this.field1353);
        }
        return var2 == null ? null : var2;
    }
}
