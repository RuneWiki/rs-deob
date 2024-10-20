package deob;

@ObfuscatedName("z")
public final class class26 extends class78 {

    @ObfuscatedName("z.e")
    public int field636;

    @ObfuscatedName("z.v")
    public int field625;

    @ObfuscatedName("z.i")
    public int field626;

    @ObfuscatedName("z.g")
    public int field627;

    @ObfuscatedName("z.x")
    public int field632;

    @ObfuscatedName("z.b")
    public int field624;

    @ObfuscatedName("z.q")
    public class38 field629;

    @ObfuscatedName("z.l")
    public int field631 = 0;

    @ObfuscatedName("z.m")
    public int field633 = 0;

    @ObfuscatedName("z.u")
    public boolean field630 = false;

    public class26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field636 = arg0;
        this.field626 = arg1;
        this.field627 = arg2;
        this.field632 = arg3;
        this.field624 = arg4;
        this.field625 = arg5 + arg6;
        int var8 = Statics.method1958(this.field636).field925;
        if (var8 == -1) {
            this.field630 = true;
        } else {
            this.field630 = false;
            this.field629 = class38.method730(var8);
        }
    }

    @ObfuscatedName("z.e(IB)V")
    public final void method514(int arg0) {
        if (this.field630) {
            return;
        }
        this.field633 += arg0;
        while (this.field633 > this.field629.field899[this.field631]) {
            this.field633 -= this.field629.field899[this.field631];
            this.field631++;
            if (this.field631 >= this.field629.field897.length) {
                this.field630 = true;
                break;
            }
        }
    }

    @ObfuscatedName("z.v(I)Lcz;")
    public final class98 method17() {
        class39 var1 = Statics.method1958(this.field636);
        class98 var2;
        if (this.field630) {
            var2 = var1.method736(-1);
        } else {
            var2 = var1.method736(this.field631);
        }
        return var2 == null ? null : var2;
    }
}
