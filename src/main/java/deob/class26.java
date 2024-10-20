package deob;

@ObfuscatedName("u")
public final class class26 extends class78 {

    @ObfuscatedName("u.g")
    public int field624;

    @ObfuscatedName("u.s")
    public int field626;

    @ObfuscatedName("u.v")
    public int field615;

    @ObfuscatedName("u.o")
    public int field616;

    @ObfuscatedName("u.k")
    public int field617;

    @ObfuscatedName("u.m")
    public int field618;

    @ObfuscatedName("u.i")
    public class38 field620;

    @ObfuscatedName("u.t")
    public int field619 = 0;

    @ObfuscatedName("u.l")
    public int field614 = 0;

    @ObfuscatedName("u.p")
    public boolean field622 = false;

    public class26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field624 = arg0;
        this.field615 = arg1;
        this.field616 = arg2;
        this.field617 = arg3;
        this.field618 = arg4;
        this.field626 = arg5 + arg6;
        int var8 = class39.method612(this.field624).field921;
        if (var8 == -1) {
            this.field622 = true;
        } else {
            this.field622 = false;
            this.field620 = class38.method1935(var8);
        }
    }

    @ObfuscatedName("u.g(II)V")
    public final void method515(int arg0) {
        if (this.field622) {
            return;
        }
        this.field614 += arg0;
        while (this.field614 > this.field620.field894[this.field619]) {
            this.field614 -= this.field620.field894[this.field619];
            this.field619++;
            if (this.field619 >= this.field620.field898.length) {
                this.field622 = true;
                break;
            }
        }
    }

    @ObfuscatedName("u.s(I)Lcg;")
    public final class98 method17() {
        class39 var1 = class39.method612(this.field624);
        class98 var2;
        if (this.field622) {
            var2 = var1.method745(-1);
        } else {
            var2 = var1.method745(this.field619);
        }
        return var2 == null ? null : var2;
    }
}
