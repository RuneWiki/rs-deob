package deob;

@ObfuscatedName("cp")
public final class class85 extends class142 {

    @ObfuscatedName("cp.c")
    public int field1340;

    @ObfuscatedName("cp.o")
    public int field1338;

    @ObfuscatedName("cp.i")
    public int field1337;

    @ObfuscatedName("cp.u")
    public int field1347;

    @ObfuscatedName("cp.g")
    public int field1341;

    @ObfuscatedName("cp.m")
    public int field1342;

    @ObfuscatedName("cp.s")
    public class261 field1339;

    @ObfuscatedName("cp.x")
    public int field1344 = 0;

    @ObfuscatedName("cp.p")
    public int field1345 = 0;

    @ObfuscatedName("cp.k")
    public boolean field1346 = false;

    public class85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1340 = arg0;
        this.field1337 = arg1;
        this.field1347 = arg2;
        this.field1341 = arg3;
        this.field1342 = arg4;
        this.field1338 = arg5 + arg6;
        int var8 = class246.method3494(this.field1340).field3300;
        if (var8 == -1) {
            this.field1346 = true;
        } else {
            this.field1346 = false;
            this.field1339 = Statics.method240(var8);
        }
    }

    @ObfuscatedName("cp.c(IB)V")
    public final void method1495(int arg0) {
        if (this.field1346) {
            return;
        }
        this.field1345 += arg0;
        while (this.field1345 > this.field1339.field3586[this.field1344]) {
            this.field1345 -= this.field1339.field3586[this.field1344];
            this.field1344++;
            if (this.field1344 >= this.field1339.field3584.length) {
                this.field1346 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cp.i(B)Leo;")
    public final class134 method983() {
        class246 var1 = class246.method3494(this.field1340);
        class134 var2;
        if (this.field1346) {
            var2 = var1.method3925(-1);
        } else {
            var2 = var1.method3925(this.field1344);
        }
        return var2 == null ? null : var2;
    }
}
