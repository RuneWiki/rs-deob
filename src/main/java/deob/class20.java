package deob;

@ObfuscatedName("a")
public final class class20 extends class94 {

    @ObfuscatedName("a.q")
    public int field303;

    @ObfuscatedName("a.c")
    public int field297;

    @ObfuscatedName("a.p")
    public int field289;

    @ObfuscatedName("a.z")
    public int field292;

    @ObfuscatedName("a.m")
    public int field288;

    @ObfuscatedName("a.k")
    public int field290;

    @ObfuscatedName("a.v")
    public class34 field293;

    @ObfuscatedName("a.y")
    public int field294 = 0;

    @ObfuscatedName("a.d")
    public int field287 = 0;

    @ObfuscatedName("a.l")
    public boolean field296 = false;

    public class20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field303 = arg0;
        this.field289 = arg1;
        this.field288 = arg2;
        this.field290 = arg3;
        this.field292 = arg4;
        this.field297 = arg5 + arg6;
        int var8 = class35.method131(this.field303).field906;
        if (var8 == -1) {
            this.field296 = true;
        } else {
            this.field296 = false;
            this.field293 = class34.method2178(var8);
        }
    }

    @ObfuscatedName("a.q(IB)V")
    public final void method167(int arg0) {
        if (this.field296) {
            return;
        }
        this.field287 += arg0;
        while (this.field287 > this.field293.field889[this.field294]) {
            this.field287 -= this.field293.field889[this.field294];
            this.field294++;
            if (this.field294 >= this.field293.field881.length) {
                this.field296 = true;
                break;
            }
        }
    }

    @ObfuscatedName("a.c(I)Ldn;")
    public final class112 method17() {
        class35 var1 = class35.method131(this.field303);
        class112 var2;
        if (this.field296) {
            var2 = var1.method742(-1);
        } else {
            var2 = var1.method742(this.field294);
        }
        return var2 == null ? null : var2;
    }
}
