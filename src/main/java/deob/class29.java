package deob;

@ObfuscatedName("aa")
public final class class29 extends class83 {

    @ObfuscatedName("aa.j")
    public int field702;

    @ObfuscatedName("aa.y")
    public class41 field686;

    @ObfuscatedName("aa.z")
    public int field690;

    @ObfuscatedName("aa.l")
    public int field687;

    @ObfuscatedName("aa.w")
    public int field688;

    @ObfuscatedName("aa.d")
    public int field689;

    @ObfuscatedName("aa.f")
    public int field697;

    @ObfuscatedName("aa.i")
    public int field693 = 0;

    @ObfuscatedName("aa.a")
    public int field694 = 0;

    @ObfuscatedName("aa.o")
    public boolean field691 = false;

    public class29(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field702 = arg0;
        this.field688 = arg1;
        this.field689 = arg2;
        this.field697 = arg3;
        this.field690 = arg4;
        this.field687 = arg5 + arg6;
        int var8 = class42.method122(this.field702).field991;
        if (var8 == -1) {
            this.field691 = true;
        } else {
            this.field691 = false;
            this.field686 = class41.method1016(var8);
        }
    }

    @ObfuscatedName("aa.j(IB)V")
    public final void method645(int arg0) {
        if (this.field691) {
            return;
        }
        this.field694 += arg0;
        while (this.field694 > this.field686.field963[this.field693]) {
            this.field694 -= this.field686.field963[this.field693];
            this.field693++;
            if (this.field693 >= this.field686.field970.length) {
                this.field691 = true;
                break;
            }
        }
    }

    @ObfuscatedName("aa.y(I)Lcw;")
    public final class103 method14() {
        class42 var1 = class42.method122(this.field702);
        class103 var2;
        if (this.field691) {
            var2 = var1.method888(-1);
        } else {
            var2 = var1.method888(this.field693);
        }
        return var2 == null ? null : var2;
    }
}
