package deob;

@ObfuscatedName("cz")
public final class class85 extends class142 {

    @ObfuscatedName("cz.p")
    public int field1347;

    @ObfuscatedName("cz.m")
    public int field1344;

    @ObfuscatedName("cz.e")
    public int field1345;

    @ObfuscatedName("cz.t")
    public int field1346;

    @ObfuscatedName("cz.w")
    public int field1351;

    @ObfuscatedName("cz.z")
    public int field1348;

    @ObfuscatedName("cz.j")
    public class261 field1349;

    @ObfuscatedName("cz.i")
    public int field1352 = 0;

    @ObfuscatedName("cz.f")
    public int field1350 = 0;

    @ObfuscatedName("cz.c")
    public boolean field1343 = false;

    public class85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1347 = arg0;
        this.field1345 = arg1;
        this.field1346 = arg2;
        this.field1351 = arg3;
        this.field1348 = arg4;
        this.field1344 = arg5 + arg6;
        int var8 = class246.method3873(this.field1347).field3336;
        if (var8 == -1) {
            this.field1343 = true;
        } else {
            this.field1343 = false;
            this.field1349 = class261.method790(var8);
        }
    }

    @ObfuscatedName("cz.p(II)V")
    public final void method1467(int arg0) {
        if (this.field1343) {
            return;
        }
        this.field1350 += arg0;
        while (this.field1350 > this.field1349.field3606[this.field1352]) {
            this.field1350 -= this.field1349.field3606[this.field1352];
            this.field1352++;
            if (this.field1352 >= this.field1349.field3608.length) {
                this.field1343 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cz.e(I)Les;")
    public final class134 method1001() {
        class246 var1 = class246.method3873(this.field1347);
        class134 var2;
        if (this.field1343) {
            var2 = var1.method3910(-1);
        } else {
            var2 = var1.method3910(this.field1352);
        }
        return var2 == null ? null : var2;
    }
}
