package deob;

@ObfuscatedName("f")
public final class class20 extends class94 {

    @ObfuscatedName("f.g")
    public int field298;

    @ObfuscatedName("f.h")
    public int field296;

    @ObfuscatedName("f.s")
    public int field306;

    @ObfuscatedName("f.o")
    public int field297;

    @ObfuscatedName("f.p")
    public int field307;

    @ObfuscatedName("f.x")
    public int field300;

    @ObfuscatedName("f.k")
    public class34 field299;

    @ObfuscatedName("f.r")
    public int field302 = 0;

    @ObfuscatedName("f.z")
    public int field303 = 0;

    @ObfuscatedName("f.n")
    public boolean field304 = false;

    public class20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field298 = arg0;
        this.field306 = arg1;
        this.field297 = arg2;
        this.field307 = arg3;
        this.field300 = arg4;
        this.field296 = arg5 + arg6;
        int var8 = class35.method3034(this.field298).field912;
        if (var8 == -1) {
            this.field304 = true;
        } else {
            this.field304 = false;
            this.field299 = class34.method152(var8);
        }
    }

    @ObfuscatedName("f.g(IB)V")
    public final void method188(int arg0) {
        if (this.field304) {
            return;
        }
        this.field303 += arg0;
        while (this.field303 > this.field299.field901[this.field302]) {
            this.field303 -= this.field299.field901[this.field302];
            this.field302++;
            if (this.field302 >= this.field299.field887.length) {
                this.field304 = true;
                break;
            }
        }
    }

    @ObfuscatedName("f.h(I)Ldn;")
    public final class112 method18() {
        class35 var1 = class35.method3034(this.field298);
        class112 var2;
        if (this.field304) {
            var2 = var1.method750(-1);
        } else {
            var2 = var1.method750(this.field302);
        }
        return var2 == null ? null : var2;
    }
}
