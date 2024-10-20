package deob;

@ObfuscatedName("o")
public final class class20 extends class94 {

    @ObfuscatedName("o.c")
    public int field309;

    @ObfuscatedName("o.q")
    public int field299;

    @ObfuscatedName("o.y")
    public class34 field295;

    @ObfuscatedName("o.v")
    public int field302;

    @ObfuscatedName("o.g")
    public int field297;

    @ObfuscatedName("o.x")
    public int field298;

    @ObfuscatedName("o.u")
    public int field296;

    @ObfuscatedName("o.l")
    public int field311 = 0;

    @ObfuscatedName("o.a")
    public int field301 = 0;

    @ObfuscatedName("o.h")
    public boolean field303 = false;

    public class20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field309 = arg0;
        this.field302 = arg1;
        this.field297 = arg2;
        this.field298 = arg3;
        this.field296 = arg4;
        this.field299 = arg5 + arg6;
        int var8 = class35.method743(this.field309).field926;
        if (var8 == -1) {
            this.field303 = true;
        } else {
            this.field303 = false;
            this.field295 = Statics.method1425(var8);
        }
    }

    @ObfuscatedName("o.c(II)V")
    public final void method157(int arg0) {
        if (this.field303) {
            return;
        }
        this.field301 += arg0;
        while (this.field301 > this.field295.field906[this.field311]) {
            this.field301 -= this.field295.field906[this.field311];
            this.field311++;
            if (this.field311 >= this.field295.field899.length) {
                this.field303 = true;
                break;
            }
        }
    }

    @ObfuscatedName("o.q(B)Ldl;")
    public final class112 method13() {
        class35 var1 = class35.method743(this.field309);
        class112 var2;
        if (this.field303) {
            var2 = var1.method720(-1);
        } else {
            var2 = var1.method720(this.field311);
        }
        return var2 == null ? null : var2;
    }
}
