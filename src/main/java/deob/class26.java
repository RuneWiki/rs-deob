package deob;

@ObfuscatedName("m")
public final class class26 extends class78 {

    @ObfuscatedName("m.t")
    public int field620;

    @ObfuscatedName("m.s")
    public int field612;

    @ObfuscatedName("m.f")
    public int field611;

    @ObfuscatedName("m.e")
    public int field619;

    @ObfuscatedName("m.d")
    public int field613;

    @ObfuscatedName("m.n")
    public int field614;

    @ObfuscatedName("m.v")
    public class38 field615;

    @ObfuscatedName("m.z")
    public int field616 = 0;

    @ObfuscatedName("m.j")
    public int field617 = 0;

    @ObfuscatedName("m.u")
    public boolean field618 = false;

    public class26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field620 = arg0;
        this.field611 = arg1;
        this.field619 = arg2;
        this.field613 = arg3;
        this.field614 = arg4;
        this.field612 = arg5 + arg6;
        int var8 = class39.method123(this.field620).field916;
        if (var8 == -1) {
            this.field618 = true;
        } else {
            this.field618 = false;
            this.field615 = Statics.method448(var8);
        }
    }

    @ObfuscatedName("m.t(IS)V")
    public final void method502(int arg0) {
        if (this.field618) {
            return;
        }
        this.field617 += arg0;
        while (this.field617 > this.field615.field896[this.field616]) {
            this.field617 -= this.field615.field896[this.field616];
            this.field616++;
            if (this.field616 >= this.field615.field894.length) {
                this.field618 = true;
                break;
            }
        }
    }

    @ObfuscatedName("m.s(I)Lcc;")
    public final class98 method17() {
        class39 var1 = class39.method123(this.field620);
        class98 var2;
        if (this.field618) {
            var2 = var1.method717(-1);
        } else {
            var2 = var1.method717(this.field616);
        }
        return var2 == null ? null : var2;
    }
}
