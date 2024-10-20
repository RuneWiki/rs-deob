package deob;

@ObfuscatedName("an")
public class class49 implements class43 {

    @ObfuscatedName("an.e")
    public int field618;

    @ObfuscatedName("an.o")
    public int field616;

    @ObfuscatedName("an.m")
    public int field613;

    @ObfuscatedName("an.g")
    public int field622;

    @ObfuscatedName("an.d")
    public int field615;

    @ObfuscatedName("an.b")
    public int field620;

    @ObfuscatedName("an.k")
    public int field617;

    @ObfuscatedName("an.f")
    public int field611;

    @ObfuscatedName("an.j")
    public int field619;

    @ObfuscatedName("an.q")
    public int field614;

    @ObfuscatedName("an.e(Lai;I)V")
    public void method175(class33 arg0) {
        if (arg0.field459 > this.field615) {
            arg0.field459 = this.field615;
        }
        if (arg0.field460 < this.field615) {
            arg0.field460 = this.field615;
        }
        if (arg0.field461 > this.field620) {
            arg0.field461 = this.field620;
        }
        if (arg0.field453 < this.field620) {
            arg0.field453 = this.field620;
        }
    }

    @ObfuscatedName("an.o(IIIB)Z")
    public boolean method168(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field618 && arg0 < this.field618 + this.field616) {
            return arg1 >= (this.field617 << 3) + (this.field613 << 6) && arg1 <= (this.field617 << 3) + (this.field613 << 6) + 7 && arg2 >= (this.field622 << 6) + (this.field611 << 3) && arg2 <= (this.field622 << 6) + (this.field611 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("an.m(IIS)Z")
    public boolean method186(int arg0, int arg1) {
        return arg0 >= (this.field619 << 3) + (this.field615 << 6) && arg0 <= (this.field619 << 3) + (this.field615 << 6) + 7 && arg1 >= (this.field620 << 6) + (this.field614 << 3) && arg1 <= (this.field620 << 6) + (this.field614 << 3) + 7;
    }

    @ObfuscatedName("an.g(IIII)[I")
    public int[] method163(int arg0, int arg1, int arg2) {
        return this.method168(arg0, arg1, arg2) ? new int[] { this.field619 * 8 - this.field617 * 8 + this.field615 * 64 - this.field613 * 64 + arg1, this.field614 * 8 - this.field611 * 8 + this.field620 * 64 - this.field622 * 64 + arg2 } : null;
    }

    @ObfuscatedName("an.d(III)Lhh;")
    public class213 method164(int arg0, int arg1) {
        if (this.method186(arg0, arg1)) {
            int var3 = this.field617 * 8 - this.field619 * 8 + this.field613 * 64 - this.field615 * 64 + arg0;
            int var4 = this.field611 * 8 - this.field614 * 8 + this.field622 * 64 - this.field620 * 64 + arg1;
            return new class213(this.field618, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("an.b(Lfw;I)V")
    public void method162(class174 arg0) {
        this.field618 = arg0.method2891();
        this.field616 = arg0.method2891();
        this.field613 = arg0.method2930();
        this.field617 = arg0.method2891();
        this.field622 = arg0.method2930();
        this.field611 = arg0.method2891();
        this.field615 = arg0.method2930();
        this.field619 = arg0.method2891();
        this.field620 = arg0.method2930();
        this.field614 = arg0.method2891();
        this.method630();
    }

    @ObfuscatedName("an.k(I)V")
    public void method630() {
    }
}
