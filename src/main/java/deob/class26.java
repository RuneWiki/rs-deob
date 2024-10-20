package deob;

@ObfuscatedName("f")
public final class class26 extends class78 {

    @ObfuscatedName("f.k")
    public int field616;

    @ObfuscatedName("f.y")
    public class38 field614;

    @ObfuscatedName("f.s")
    public int field610;

    @ObfuscatedName("f.g")
    public int field611;

    @ObfuscatedName("f.h")
    public int field613;

    @ObfuscatedName("f.l")
    public int field609;

    @ObfuscatedName("f.e")
    public int field617;

    @ObfuscatedName("f.u")
    public int field612 = 0;

    @ObfuscatedName("f.j")
    public int field615 = 0;

    @ObfuscatedName("f.c")
    public boolean field618 = false;

    public class26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field616 = arg0;
        this.field611 = arg1;
        this.field613 = arg2;
        this.field609 = arg3;
        this.field617 = arg4;
        this.field610 = arg5 + arg6;
        int var8 = class39.method2666(this.field616).field916;
        if (var8 == -1) {
            this.field618 = true;
        } else {
            this.field618 = false;
            this.field614 = class38.method29(var8);
        }
    }

    @ObfuscatedName("f.k(IB)V")
    public final void method485(int arg0) {
        if (this.field618) {
            return;
        }
        this.field615 += arg0;
        while (this.field615 > this.field614.field892[this.field612]) {
            this.field615 -= this.field614.field892[this.field612];
            this.field612++;
            if (this.field612 >= this.field614.field890.length) {
                this.field618 = true;
                break;
            }
        }
    }

    @ObfuscatedName("f.y(I)Lck;")
    public final class98 method19() {
        class39 var1 = class39.method2666(this.field616);
        class98 var2;
        if (this.field618) {
            var2 = var1.method722(-1);
        } else {
            var2 = var1.method722(this.field612);
        }
        return var2 == null ? null : var2;
    }
}
