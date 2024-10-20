package deob;

@ObfuscatedName("cj")
public final class class83 extends class140 {

    @ObfuscatedName("cj.w")
    public int field1350;

    @ObfuscatedName("cj.s")
    public int field1344;

    @ObfuscatedName("cj.q")
    public int field1349;

    @ObfuscatedName("cj.o")
    public int field1345;

    @ObfuscatedName("cj.g")
    public int field1346;

    @ObfuscatedName("cj.v")
    public int field1348;

    @ObfuscatedName("cj.p")
    public class261 field1342;

    @ObfuscatedName("cj.e")
    public int field1347 = 0;

    @ObfuscatedName("cj.d")
    public int field1343 = 0;

    @ObfuscatedName("cj.x")
    public boolean field1351 = false;

    public class83(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1350 = arg0;
        this.field1349 = arg1;
        this.field1345 = arg2;
        this.field1346 = arg3;
        this.field1348 = arg4;
        this.field1344 = arg5 + arg6;
        int var8 = class246.method4062(this.field1350).field3326;
        if (var8 == -1) {
            this.field1351 = true;
        } else {
            this.field1351 = false;
            this.field1342 = class261.method4424(var8);
        }
    }

    @ObfuscatedName("cj.w(II)V")
    public final void method1558(int arg0) {
        if (this.field1351) {
            return;
        }
        this.field1343 += arg0;
        while (this.field1343 > this.field1342.field3609[this.field1347]) {
            this.field1343 -= this.field1342.field3609[this.field1347];
            this.field1347++;
            if (this.field1347 >= this.field1342.field3607.length) {
                this.field1351 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cj.q(B)Leh;")
    public final class132 method1030() {
        class246 var1 = class246.method4062(this.field1350);
        class132 var2;
        if (this.field1351) {
            var2 = var1.method4074(-1);
        } else {
            var2 = var1.method4074(this.field1347);
        }
        return var2 == null ? null : var2;
    }
}
