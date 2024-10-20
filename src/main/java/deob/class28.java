package deob;

@ObfuscatedName("ak")
public final class class28 extends class80 {

    @ObfuscatedName("ak.n")
    public int field644;

    @ObfuscatedName("ak.d")
    public int field636;

    @ObfuscatedName("ak.z")
    public int field640;

    @ObfuscatedName("ak.y")
    public class40 field641;

    @ObfuscatedName("ak.e")
    public int field637;

    @ObfuscatedName("ak.g")
    public int field638;

    @ObfuscatedName("ak.f")
    public int field639;

    @ObfuscatedName("ak.m")
    public int field642 = 0;

    @ObfuscatedName("ak.a")
    public int field649 = 0;

    @ObfuscatedName("ak.h")
    public boolean field635 = false;

    public class28(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field644 = arg0;
        this.field637 = arg1;
        this.field638 = arg2;
        this.field639 = arg3;
        this.field640 = arg4;
        this.field636 = arg5 + arg6;
        int var8 = class41.method116(this.field644).field955;
        if (var8 == -1) {
            this.field635 = true;
        } else {
            this.field635 = false;
            this.field641 = class40.method3092(var8);
        }
    }

    @ObfuscatedName("ak.n(II)V")
    public final void method606(int arg0) {
        if (this.field635) {
            return;
        }
        this.field649 += arg0;
        while (this.field649 > this.field641.field934[this.field642]) {
            this.field649 -= this.field641.field934[this.field642];
            this.field642++;
            if (this.field642 >= this.field641.field939.length) {
                this.field635 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ak.d(B)Lcg;")
    public final class100 method25() {
        class41 var1 = class41.method116(this.field644);
        class100 var2;
        if (this.field635) {
            var2 = var1.method808(-1);
        } else {
            var2 = var1.method808(this.field642);
        }
        return var2 == null ? null : var2;
    }
}
