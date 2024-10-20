package deob;

@ObfuscatedName("am")
public final class class27 extends class79 {

    @ObfuscatedName("am.g")
    public int field616;

    @ObfuscatedName("am.j")
    public int field617;

    @ObfuscatedName("am.z")
    public int field621;

    @ObfuscatedName("am.b")
    public int field628;

    @ObfuscatedName("am.k")
    public int field619;

    @ObfuscatedName("am.c")
    public int field618;

    @ObfuscatedName("am.w")
    public class39 field627;

    @ObfuscatedName("am.l")
    public int field623 = 0;

    @ObfuscatedName("am.n")
    public int field620 = 0;

    @ObfuscatedName("am.d")
    public boolean field625 = false;

    public class27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field616 = arg0;
        this.field628 = arg1;
        this.field619 = arg2;
        this.field618 = arg3;
        this.field621 = arg4;
        this.field617 = arg5 + arg6;
        int var8 = class40.method2523(this.field616).field953;
        if (var8 == -1) {
            this.field625 = true;
        } else {
            this.field625 = false;
            this.field627 = class39.method2627(var8);
        }
    }

    @ObfuscatedName("am.g(IB)V")
    public final void method513(int arg0) {
        if (this.field625) {
            return;
        }
        this.field620 += arg0;
        while (this.field620 > this.field627.field918[this.field623]) {
            this.field620 -= this.field627.field918[this.field623];
            this.field623++;
            if (this.field623 >= this.field627.field920.length) {
                this.field625 = true;
                break;
            }
        }
    }

    @ObfuscatedName("am.j(I)Lcx;")
    public final class99 method15() {
        class40 var1 = class40.method2523(this.field616);
        class99 var2;
        if (this.field625) {
            var2 = var1.method720(-1);
        } else {
            var2 = var1.method720(this.field623);
        }
        return var2 == null ? null : var2;
    }
}
