package deob;

@ObfuscatedName("u")
public final class class26 extends class78 {

    @ObfuscatedName("u.g")
    public int field626;

    @ObfuscatedName("u.v")
    public int field620;

    @ObfuscatedName("u.z")
    public int field624;

    @ObfuscatedName("u.h")
    public int field621;

    @ObfuscatedName("u.k")
    public int field627;

    @ObfuscatedName("u.l")
    public int field623;

    @ObfuscatedName("u.e")
    public class38 field619;

    @ObfuscatedName("u.j")
    public int field628 = 0;

    @ObfuscatedName("u.n")
    public int field622 = 0;

    @ObfuscatedName("u.f")
    public boolean field630 = false;

    public class26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field626 = arg0;
        this.field621 = arg1;
        this.field627 = arg2;
        this.field623 = arg3;
        this.field624 = arg4;
        this.field620 = arg5 + arg6;
        int var8 = class39.method563(this.field626).field925;
        if (var8 == -1) {
            this.field630 = true;
        } else {
            this.field630 = false;
            this.field619 = class38.method1996(var8);
        }
    }

    @ObfuscatedName("u.g(II)V")
    public final void method517(int arg0) {
        if (this.field630) {
            return;
        }
        this.field622 += arg0;
        while (this.field622 > this.field619.field903[this.field628]) {
            this.field622 -= this.field619.field903[this.field628];
            this.field628++;
            if (this.field628 >= this.field619.field901.length) {
                this.field630 = true;
                break;
            }
        }
    }

    @ObfuscatedName("u.v(B)Lce;")
    public final class98 method25() {
        class39 var1 = class39.method563(this.field626);
        class98 var2;
        if (this.field630) {
            var2 = var1.method751(-1);
        } else {
            var2 = var1.method751(this.field628);
        }
        return var2 == null ? null : var2;
    }
}
