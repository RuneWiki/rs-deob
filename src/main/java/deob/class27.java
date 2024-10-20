package deob;

@ObfuscatedName("aw")
public final class class27 extends class79 {

    @ObfuscatedName("aw.p")
    public int field606;

    @ObfuscatedName("aw.y")
    public class39 field607;

    @ObfuscatedName("aw.d")
    public int field616;

    @ObfuscatedName("aw.c")
    public int field612;

    @ObfuscatedName("aw.r")
    public int field609;

    @ObfuscatedName("aw.f")
    public int field610;

    @ObfuscatedName("aw.z")
    public int field611;

    @ObfuscatedName("aw.o")
    public int field613 = 0;

    @ObfuscatedName("aw.k")
    public int field614 = 0;

    @ObfuscatedName("aw.s")
    public boolean field618 = false;

    public class27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field606 = arg0;
        this.field612 = arg1;
        this.field609 = arg2;
        this.field610 = arg3;
        this.field611 = arg4;
        this.field616 = arg5 + arg6;
        int var8 = class40.method761(this.field606).field915;
        if (var8 == -1) {
            this.field618 = true;
        } else {
            this.field618 = false;
            this.field607 = class39.method2920(var8);
        }
    }

    @ObfuscatedName("aw.p(IB)V")
    public final void method551(int arg0) {
        if (this.field618) {
            return;
        }
        this.field614 += arg0;
        while (this.field614 > this.field607.field886[this.field613]) {
            this.field614 -= this.field607.field886[this.field613];
            this.field613++;
            if (this.field613 >= this.field607.field892.length) {
                this.field618 = true;
                break;
            }
        }
    }

    @ObfuscatedName("aw.y(I)Lcy;")
    public final class99 method13() {
        class40 var1 = class40.method761(this.field606);
        class99 var2;
        if (this.field618) {
            var2 = var1.method774(-1);
        } else {
            var2 = var1.method774(this.field613);
        }
        return var2 == null ? null : var2;
    }
}
