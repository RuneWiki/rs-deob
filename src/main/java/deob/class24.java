package deob;

@ObfuscatedName("w")
public final class class24 extends class75 {

    @ObfuscatedName("w.z")
    public int field619;

    @ObfuscatedName("w.n")
    public int field624;

    @ObfuscatedName("w.u")
    public int field620;

    @ObfuscatedName("w.t")
    public int field621;

    @ObfuscatedName("w.e")
    public int field622;

    @ObfuscatedName("w.a")
    public int field623;

    @ObfuscatedName("w.l")
    public class35 field626;

    @ObfuscatedName("w.v")
    public int field627 = 0;

    @ObfuscatedName("w.j")
    public int field625 = 0;

    @ObfuscatedName("w.k")
    public boolean field628 = false;

    public class24(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field624 = arg0;
        this.field621 = arg1;
        this.field622 = arg2;
        this.field623 = arg3;
        this.field619 = arg4;
        this.field620 = arg5 + arg6;
        int var8 = class36.method2724(this.field624).field902;
        if (var8 == -1) {
            this.field628 = true;
        } else {
            this.field628 = false;
            this.field626 = class35.method2065(var8);
        }
    }

    @ObfuscatedName("w.z(II)V")
    public final void method548(int arg0) {
        if (this.field628) {
            return;
        }
        this.field625 += arg0;
        while (this.field625 > this.field626.field877[this.field627]) {
            this.field625 -= this.field626.field877[this.field627];
            this.field627++;
            if (this.field627 >= this.field626.field876.length) {
                this.field628 = true;
                break;
            }
        }
    }

    @ObfuscatedName("w.n(I)Lcp;")
    public final class95 method19() {
        class36 var1 = class36.method2724(this.field624);
        class95 var2;
        if (this.field628) {
            var2 = var1.method752(-1);
        } else {
            var2 = var1.method752(this.field627);
        }
        return var2 == null ? null : var2;
    }
}
