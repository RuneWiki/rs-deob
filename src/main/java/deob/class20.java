package deob;

@ObfuscatedName("s")
public final class class20 extends class94 {

    @ObfuscatedName("s.p")
    public int field289;

    @ObfuscatedName("s.e")
    public int field288;

    @ObfuscatedName("s.a")
    public int field297;

    @ObfuscatedName("s.h")
    public int field287;

    @ObfuscatedName("s.y")
    public class34 field293;

    @ObfuscatedName("s.j")
    public int field291;

    @ObfuscatedName("s.l")
    public int field292;

    @ObfuscatedName("s.f")
    public int field294 = 0;

    @ObfuscatedName("s.n")
    public int field295 = 0;

    @ObfuscatedName("s.k")
    public boolean field296 = false;

    public class20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field289 = arg0;
        this.field297 = arg1;
        this.field287 = arg2;
        this.field291 = arg3;
        this.field292 = arg4;
        this.field288 = arg5 + arg6;
        int var8 = class35.method163(this.field289).field891;
        if (var8 == -1) {
            this.field296 = true;
        } else {
            this.field296 = false;
            this.field293 = Statics.method1204(var8);
        }
    }

    @ObfuscatedName("s.p(IB)V")
    public final void method180(int arg0) {
        if (this.field296) {
            return;
        }
        this.field295 += arg0;
        while (this.field295 > this.field293.field878[this.field294]) {
            this.field295 -= this.field293.field878[this.field294];
            this.field294++;
            if (this.field294 >= this.field293.field888.length) {
                this.field296 = true;
                break;
            }
        }
    }

    @ObfuscatedName("s.e(I)Lds;")
    public final class112 method19() {
        class35 var1 = class35.method163(this.field289);
        class112 var2;
        if (this.field296) {
            var2 = var1.method760(-1);
        } else {
            var2 = var1.method760(this.field294);
        }
        return var2 == null ? null : var2;
    }
}
