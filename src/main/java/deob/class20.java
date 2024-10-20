package deob;

@ObfuscatedName("z")
public final class class20 extends class94 {

    @ObfuscatedName("z.y")
    public class34 field291;

    @ObfuscatedName("z.m")
    public int field287;

    @ObfuscatedName("z.d")
    public int field292;

    @ObfuscatedName("z.k")
    public int field290;

    @ObfuscatedName("z.n")
    public int field288;

    @ObfuscatedName("z.s")
    public int field289;

    @ObfuscatedName("z.x")
    public int field293;

    @ObfuscatedName("z.b")
    public int field296 = 0;

    @ObfuscatedName("z.j")
    public int field285 = 0;

    @ObfuscatedName("z.p")
    public boolean field294 = false;

    public class20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field287 = arg0;
        this.field290 = arg1;
        this.field288 = arg2;
        this.field289 = arg3;
        this.field293 = arg4;
        this.field292 = arg5 + arg6;
        int var8 = class35.method1458(this.field287).field892;
        if (var8 == -1) {
            this.field294 = true;
        } else {
            this.field294 = false;
            this.field291 = class34.method540(var8);
        }
    }

    @ObfuscatedName("z.y(IB)V")
    public final void method165(int arg0) {
        if (this.field294) {
            return;
        }
        this.field285 += arg0;
        while (this.field285 > this.field291.field868[this.field296]) {
            this.field285 -= this.field291.field868[this.field296];
            this.field296++;
            if (this.field296 >= this.field291.field863.length) {
                this.field294 = true;
                break;
            }
        }
    }

    @ObfuscatedName("z.m(I)Ldw;")
    public final class112 method20() {
        class35 var1 = class35.method1458(this.field287);
        class112 var2;
        if (this.field294) {
            var2 = var1.method760(-1);
        } else {
            var2 = var1.method760(this.field296);
        }
        return var2 == null ? null : var2;
    }
}
