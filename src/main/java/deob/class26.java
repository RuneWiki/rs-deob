package deob;

@ObfuscatedName("q")
public final class class26 extends class78 {

    @ObfuscatedName("q.t")
    public int field614;

    @ObfuscatedName("q.o")
    public int field612;

    @ObfuscatedName("q.i")
    public int field615;

    @ObfuscatedName("q.p")
    public int field613;

    @ObfuscatedName("q.c")
    public int field610;

    @ObfuscatedName("q.y")
    public class38 field611;

    @ObfuscatedName("q.g")
    public int field616;

    @ObfuscatedName("q.l")
    public int field617 = 0;

    @ObfuscatedName("q.h")
    public int field618 = 0;

    @ObfuscatedName("q.n")
    public boolean field619 = false;

    public class26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field614 = arg0;
        this.field615 = arg1;
        this.field613 = arg2;
        this.field610 = arg3;
        this.field616 = arg4;
        this.field612 = arg5 + arg6;
        int var8 = class39.method2654(this.field614).field912;
        if (var8 == -1) {
            this.field619 = true;
        } else {
            this.field619 = false;
            this.field611 = class38.method1579(var8);
        }
    }

    @ObfuscatedName("q.t(IB)V")
    public final void method520(int arg0) {
        if (this.field619) {
            return;
        }
        this.field618 += arg0;
        while (this.field618 > this.field611.field905[this.field617]) {
            this.field618 -= this.field611.field905[this.field617];
            this.field617++;
            if (this.field617 >= this.field611.field896.length) {
                this.field619 = true;
                break;
            }
        }
    }

    @ObfuscatedName("q.o(I)Lcx;")
    public final class98 method21() {
        class39 var1 = class39.method2654(this.field614);
        class98 var2;
        if (this.field619) {
            var2 = var1.method744(-1);
        } else {
            var2 = var1.method744(this.field617);
        }
        return var2 == null ? null : var2;
    }
}
