package deob;

@ObfuscatedName("k")
public final class class20 extends class94 {

    @ObfuscatedName("k.b")
    public int field300;

    @ObfuscatedName("k.e")
    public int field281;

    @ObfuscatedName("k.g")
    public int field282;

    @ObfuscatedName("k.o")
    public int field284;

    @ObfuscatedName("k.a")
    public int field301;

    @ObfuscatedName("k.h")
    public int field286;

    @ObfuscatedName("k.j")
    public class34 field287;

    @ObfuscatedName("k.f")
    public int field288 = 0;

    @ObfuscatedName("k.q")
    public int field285 = 0;

    @ObfuscatedName("k.l")
    public boolean field290 = false;

    public class20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field300 = arg0;
        this.field282 = arg1;
        this.field284 = arg2;
        this.field301 = arg3;
        this.field286 = arg4;
        this.field281 = arg5 + arg6;
        int var8 = class35.method2850(this.field300).field887;
        if (var8 == -1) {
            this.field290 = true;
        } else {
            this.field290 = false;
            this.field287 = class34.method215(var8);
        }
    }

    @ObfuscatedName("k.b(II)V")
    public final void method162(int arg0) {
        if (this.field290) {
            return;
        }
        this.field285 += arg0;
        while (this.field285 > this.field287.field869[this.field288]) {
            this.field285 -= this.field287.field869[this.field288];
            this.field288++;
            if (this.field288 >= this.field287.field867.length) {
                this.field290 = true;
                break;
            }
        }
    }

    @ObfuscatedName("k.e(I)Ldp;")
    public final class112 method15() {
        class35 var1 = class35.method2850(this.field300);
        class112 var2;
        if (this.field290) {
            var2 = var1.method741(-1);
        } else {
            var2 = var1.method741(this.field288);
        }
        return var2 == null ? null : var2;
    }
}
