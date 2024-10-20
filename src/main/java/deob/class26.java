package deob;

@ObfuscatedName("e")
public final class class26 extends class78 {

    @ObfuscatedName("e.y")
    public class38 field618;

    @ObfuscatedName("e.u")
    public int field623;

    @ObfuscatedName("e.k")
    public int field613;

    @ObfuscatedName("e.v")
    public int field620;

    @ObfuscatedName("e.l")
    public int field615;

    @ObfuscatedName("e.g")
    public int field616;

    @ObfuscatedName("e.a")
    public int field624;

    @ObfuscatedName("e.x")
    public int field619 = 0;

    @ObfuscatedName("e.r")
    public int field617 = 0;

    @ObfuscatedName("e.w")
    public boolean field621 = false;

    public class26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field623 = arg0;
        this.field620 = arg1;
        this.field615 = arg2;
        this.field616 = arg3;
        this.field624 = arg4;
        this.field613 = arg5 + arg6;
        int var8 = class39.method2683(this.field623).field905;
        if (var8 == -1) {
            this.field621 = true;
        } else {
            this.field621 = false;
            this.field618 = class38.method1866(var8);
        }
    }

    @ObfuscatedName("e.y(II)V")
    public final void method498(int arg0) {
        if (this.field621) {
            return;
        }
        this.field617 += arg0;
        while (this.field617 > this.field618.field881[this.field619]) {
            this.field617 -= this.field618.field881[this.field619];
            this.field619++;
            if (this.field619 >= this.field618.field886.length) {
                this.field621 = true;
                break;
            }
        }
    }

    @ObfuscatedName("e.u(I)Lcz;")
    public final class98 method14() {
        class39 var1 = class39.method2683(this.field623);
        class98 var2;
        if (this.field621) {
            var2 = var1.method739(-1);
        } else {
            var2 = var1.method739(this.field619);
        }
        return var2 == null ? null : var2;
    }
}
