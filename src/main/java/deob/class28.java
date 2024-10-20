package deob;

@ObfuscatedName("ap")
public final class class28 extends class80 {

    @ObfuscatedName("ap.e")
    public int field628;

    @ObfuscatedName("ap.a")
    public int field622;

    @ObfuscatedName("ap.l")
    public int field630;

    @ObfuscatedName("ap.c")
    public int field623;

    @ObfuscatedName("ap.u")
    public int field625;

    @ObfuscatedName("ap.w")
    public int field626;

    @ObfuscatedName("ap.i")
    public class40 field627;

    @ObfuscatedName("ap.r")
    public int field621 = 0;

    @ObfuscatedName("ap.f")
    public int field629 = 0;

    @ObfuscatedName("ap.g")
    public boolean field624 = false;

    public class28(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field628 = arg0;
        this.field630 = arg1;
        this.field623 = arg2;
        this.field625 = arg3;
        this.field626 = arg4;
        this.field622 = arg5 + arg6;
        int var8 = class41.method2784(this.field628).field932;
        if (var8 == -1) {
            this.field624 = true;
        } else {
            this.field624 = false;
            this.field627 = class40.method1826(var8);
        }
    }

    @ObfuscatedName("ap.e(II)V")
    public final void method569(int arg0) {
        if (this.field624) {
            return;
        }
        this.field629 += arg0;
        while (this.field629 > this.field627.field894[this.field621]) {
            this.field629 -= this.field627.field894[this.field621];
            this.field621++;
            if (this.field621 >= this.field627.field898.length) {
                this.field624 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ap.a(I)Lcy;")
    public final class100 method30() {
        class41 var1 = class41.method2784(this.field628);
        class100 var2;
        if (this.field624) {
            var2 = var1.method776(-1);
        } else {
            var2 = var1.method776(this.field621);
        }
        return var2 == null ? null : var2;
    }
}
