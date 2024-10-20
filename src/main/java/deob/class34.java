package deob;

@ObfuscatedName("aj")
public final class class34 extends class90 {

    @ObfuscatedName("aj.d")
    public int field740;

    @ObfuscatedName("aj.c")
    public int field735;

    @ObfuscatedName("aj.n")
    public int field736;

    @ObfuscatedName("aj.q")
    public int field737;

    @ObfuscatedName("aj.t")
    public int field743;

    @ObfuscatedName("aj.p")
    public int field738;

    @ObfuscatedName("aj.u")
    public class207 field744;

    @ObfuscatedName("aj.z")
    public int field746 = 0;

    @ObfuscatedName("aj.l")
    public int field742 = 0;

    @ObfuscatedName("aj.v")
    public boolean field741 = false;

    public class34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field740 = arg0;
        this.field736 = arg1;
        this.field737 = arg2;
        this.field743 = arg3;
        this.field738 = arg4;
        this.field735 = arg5 + arg6;
        int var8 = class193.method3249(this.field740).field2812;
        if (var8 == -1) {
            this.field741 = true;
        } else {
            this.field741 = false;
            this.field744 = class207.method3621(var8);
        }
    }

    @ObfuscatedName("aj.d(II)V")
    public final void method714(int arg0) {
        if (this.field741) {
            return;
        }
        this.field742 += arg0;
        while (this.field742 > this.field744.field3092[this.field746]) {
            this.field742 -= this.field744.field3092[this.field746];
            this.field746++;
            if (this.field746 >= this.field744.field3093.length) {
                this.field741 = true;
                break;
            }
        }
    }

    @ObfuscatedName("aj.n(B)Lcf;")
    public final class83 method230() {
        class193 var1 = class193.method3249(this.field740);
        class83 var2;
        if (this.field741) {
            var2 = var1.method3265(-1);
        } else {
            var2 = var1.method3265(this.field746);
        }
        return var2 == null ? null : var2;
    }
}
