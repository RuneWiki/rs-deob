package deob;

@ObfuscatedName("an")
public final class class27 extends class79 {

    @ObfuscatedName("an.b")
    public int field628;

    @ObfuscatedName("an.e")
    public int field620;

    @ObfuscatedName("an.i")
    public int field621;

    @ObfuscatedName("an.k")
    public int field622;

    @ObfuscatedName("an.h")
    public int field623;

    @ObfuscatedName("an.p")
    public int field633;

    @ObfuscatedName("an.n")
    public class39 field634;

    @ObfuscatedName("an.o")
    public int field626 = 0;

    @ObfuscatedName("an.g")
    public int field627 = 0;

    @ObfuscatedName("an.z")
    public boolean field630 = false;

    public class27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field628 = arg0;
        this.field621 = arg1;
        this.field622 = arg2;
        this.field623 = arg3;
        this.field633 = arg4;
        this.field620 = arg5 + arg6;
        int var8 = class40.method1763(this.field628).field929;
        if (var8 == -1) {
            this.field630 = true;
        } else {
            this.field630 = false;
            this.field634 = class39.method1863(var8);
        }
    }

    @ObfuscatedName("an.b(II)V")
    public final void method532(int arg0) {
        if (this.field630) {
            return;
        }
        this.field627 += arg0;
        while (this.field627 > this.field634.field906[this.field626]) {
            this.field627 -= this.field634.field906[this.field626];
            this.field626++;
            if (this.field626 >= this.field634.field904.length) {
                this.field630 = true;
                break;
            }
        }
    }

    @ObfuscatedName("an.e(B)Lcr;")
    public final class99 method15() {
        class40 var1 = class40.method1763(this.field628);
        class99 var2;
        if (this.field630) {
            var2 = var1.method763(-1);
        } else {
            var2 = var1.method763(this.field626);
        }
        return var2 == null ? null : var2;
    }
}
