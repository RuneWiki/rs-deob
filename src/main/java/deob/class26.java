package deob;

@ObfuscatedName("z")
public final class class26 extends class78 {

    @ObfuscatedName("z.k")
    public int field622;

    @ObfuscatedName("z.r")
    public int field615;

    @ObfuscatedName("z.y")
    public class38 field614;

    @ObfuscatedName("z.w")
    public int field616;

    @ObfuscatedName("z.m")
    public int field617;

    @ObfuscatedName("z.j")
    public int field627;

    @ObfuscatedName("z.g")
    public int field619;

    @ObfuscatedName("z.p")
    public int field621 = 0;

    @ObfuscatedName("z.o")
    public int field620 = 0;

    @ObfuscatedName("z.b")
    public boolean field623 = false;

    public class26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field622 = arg0;
        this.field616 = arg1;
        this.field617 = arg2;
        this.field627 = arg3;
        this.field619 = arg4;
        this.field615 = arg5 + arg6;
        int var8 = class39.method1416(this.field622).field930;
        if (var8 == -1) {
            this.field623 = true;
        } else {
            this.field623 = false;
            this.field614 = class38.method102(var8);
        }
    }

    @ObfuscatedName("z.k(II)V")
    public final void method510(int arg0) {
        if (this.field623) {
            return;
        }
        this.field620 += arg0;
        while (this.field620 > this.field614.field905[this.field621]) {
            this.field620 -= this.field614.field905[this.field621];
            this.field621++;
            if (this.field621 >= this.field614.field900.length) {
                this.field623 = true;
                break;
            }
        }
    }

    @ObfuscatedName("z.r(I)Lcp;")
    public final class98 method24() {
        class39 var1 = class39.method1416(this.field622);
        class98 var2;
        if (this.field623) {
            var2 = var1.method746(-1);
        } else {
            var2 = var1.method746(this.field621);
        }
        return var2 == null ? null : var2;
    }
}
