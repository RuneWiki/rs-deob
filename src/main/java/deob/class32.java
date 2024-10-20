package deob;

@ObfuscatedName("aq")
public final class class32 extends class89 {

    @ObfuscatedName("aq.l")
    public int field723;

    @ObfuscatedName("aq.g")
    public int field718;

    @ObfuscatedName("aq.r")
    public int field719;

    @ObfuscatedName("aq.e")
    public int field720;

    @ObfuscatedName("aq.h")
    public int field728;

    @ObfuscatedName("aq.s")
    public int field729;

    @ObfuscatedName("aq.k")
    public class45 field721;

    @ObfuscatedName("aq.u")
    public int field724 = 0;

    @ObfuscatedName("aq.n")
    public int field725 = 0;

    @ObfuscatedName("aq.b")
    public boolean field726 = false;

    public class32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field723 = arg0;
        this.field719 = arg1;
        this.field720 = arg2;
        this.field728 = arg3;
        this.field729 = arg4;
        this.field718 = arg5 + arg6;
        int var8 = class46.method2351(this.field723).field1043;
        if (var8 == -1) {
            this.field726 = true;
        } else {
            this.field726 = false;
            this.field721 = class45.method578(var8);
        }
    }

    @ObfuscatedName("aq.l(II)V")
    public final void method677(int arg0) {
        if (this.field726) {
            return;
        }
        this.field725 += arg0;
        while (this.field725 > this.field721.field1019[this.field724]) {
            this.field725 -= this.field721.field1019[this.field724];
            this.field724++;
            if (this.field724 >= this.field721.field1031.length) {
                this.field726 = true;
                break;
            }
        }
    }

    @ObfuscatedName("aq.r(I)Ldv;")
    public final class109 method18() {
        class46 var1 = class46.method2351(this.field723);
        class109 var2;
        if (this.field726) {
            var2 = var1.method927(-1);
        } else {
            var2 = var1.method927(this.field724);
        }
        return var2 == null ? null : var2;
    }
}
