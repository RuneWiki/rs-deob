package deob;

@ObfuscatedName("v")
public final class class20 extends class94 {

    @ObfuscatedName("v.a")
    public int field295;

    @ObfuscatedName("v.x")
    public int field291;

    @ObfuscatedName("v.e")
    public int field293;

    @ObfuscatedName("v.r")
    public int field304;

    @ObfuscatedName("v.p")
    public int field288;

    @ObfuscatedName("v.n")
    public int field292;

    @ObfuscatedName("v.o")
    public class34 field300;

    @ObfuscatedName("v.l")
    public int field287 = 0;

    @ObfuscatedName("v.t")
    public int field301 = 0;

    @ObfuscatedName("v.q")
    public boolean field296 = false;

    public class20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field295 = arg0;
        this.field304 = arg1;
        this.field288 = arg2;
        this.field291 = arg3;
        this.field292 = arg4;
        this.field293 = arg5 + arg6;
        int var8 = class35.method2175(this.field295).field920;
        if (var8 == -1) {
            this.field296 = true;
        } else {
            this.field296 = false;
            this.field300 = class34.method57(var8);
        }
    }

    @ObfuscatedName("v.a(IB)V")
    public final void method197(int arg0) {
        if (this.field296) {
            return;
        }
        this.field301 += arg0;
        while (this.field301 > this.field300.field900[this.field287]) {
            this.field301 -= this.field300.field900[this.field287];
            this.field287++;
            if (this.field287 >= this.field300.field898.length) {
                this.field296 = true;
                break;
            }
        }
    }

    @ObfuscatedName("v.x(B)Ldd;")
    public final class112 method15() {
        class35 var1 = class35.method2175(this.field295);
        class112 var2;
        if (this.field296) {
            var2 = var1.method751(-1);
        } else {
            var2 = var1.method751(this.field287);
        }
        return var2 == null ? null : var2;
    }
}
