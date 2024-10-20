package deob;

@ObfuscatedName("d")
public final class class26 extends class78 {

    @ObfuscatedName("d.b")
    public int field613;

    @ObfuscatedName("d.u")
    public int field611;

    @ObfuscatedName("d.x")
    public int field622;

    @ObfuscatedName("d.j")
    public int field614;

    @ObfuscatedName("d.o")
    public int field621;

    @ObfuscatedName("d.n")
    public int field615;

    @ObfuscatedName("d.y")
    public class38 field616;

    @ObfuscatedName("d.f")
    public int field617 = 0;

    @ObfuscatedName("d.p")
    public int field618 = 0;

    @ObfuscatedName("d.l")
    public boolean field619 = false;

    public class26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field613 = arg0;
        this.field614 = arg1;
        this.field621 = arg2;
        this.field622 = arg3;
        this.field615 = arg4;
        this.field611 = arg5 + arg6;
        int var8 = class39.method1(this.field613).field932;
        if (var8 == -1) {
            this.field619 = true;
        } else {
            this.field619 = false;
            this.field616 = Statics.method484(var8);
        }
    }

    @ObfuscatedName("d.b(IB)V")
    public final void method530(int arg0) {
        if (this.field619) {
            return;
        }
        this.field618 += arg0;
        while (this.field618 > this.field616.field900[this.field617]) {
            this.field618 -= this.field616.field900[this.field617];
            this.field617++;
            if (this.field617 >= this.field616.field911.length) {
                this.field619 = true;
                break;
            }
        }
    }

    @ObfuscatedName("d.u(I)Lcu;")
    public final class98 method19() {
        class39 var1 = class39.method1(this.field613);
        class98 var2;
        if (this.field619) {
            var2 = var1.method733(-1);
        } else {
            var2 = var1.method733(this.field617);
        }
        return var2 == null ? null : var2;
    }
}
