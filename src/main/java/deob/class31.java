package deob;

@ObfuscatedName("aw")
public class class31 implements class43 {

    @ObfuscatedName("aw.w")
    public int field448;

    @ObfuscatedName("aw.s")
    public int field440;

    @ObfuscatedName("aw.q")
    public int field451;

    @ObfuscatedName("aw.o")
    public int field443;

    @ObfuscatedName("aw.g")
    public int field454;

    @ObfuscatedName("aw.v")
    public int field444;

    @ObfuscatedName("aw.p")
    public int field445;

    @ObfuscatedName("aw.e")
    public int field446;

    @ObfuscatedName("aw.d")
    public int field441;

    @ObfuscatedName("aw.x")
    public int field442;

    @ObfuscatedName("aw.w(Lat;I)V")
    public void method180(class33 arg0) {
        if (arg0.field465 > this.field445) {
            arg0.field465 = this.field445;
        }
        if (arg0.field469 < this.field441) {
            arg0.field469 = this.field441;
        }
        if (arg0.field470 > this.field446) {
            arg0.field470 = this.field446;
        }
        if (arg0.field462 < this.field442) {
            arg0.field462 = this.field442;
        }
    }

    @ObfuscatedName("aw.s(IIII)Z")
    public boolean method181(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field448 && arg0 < this.field448 + this.field440) {
            return arg1 >> 6 >= this.field451 && arg1 >> 6 <= this.field454 && arg2 >> 6 >= this.field443 && arg2 >> 6 <= this.field444;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aw.q(III)Z")
    public boolean method182(int arg0, int arg1) {
        return arg0 >> 6 >= this.field445 && arg0 >> 6 <= this.field441 && arg1 >> 6 >= this.field446 && arg1 >> 6 <= this.field442;
    }

    @ObfuscatedName("aw.o(IIII)[I")
    public int[] method179(int arg0, int arg1, int arg2) {
        return this.method181(arg0, arg1, arg2) ? new int[] { this.field445 * 64 - this.field451 * 64 + arg1, this.field446 * 64 - this.field443 * 64 + arg2 } : null;
    }

    @ObfuscatedName("aw.g(III)Lhg;")
    public class213 method190(int arg0, int arg1) {
        if (this.method182(arg0, arg1)) {
            int var3 = this.field451 * 64 - this.field445 * 64 + arg0;
            int var4 = this.field443 * 64 - this.field446 * 64 + arg1;
            return new class213(this.field448, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("aw.v(Lfz;B)V")
    public void method185(class174 arg0) {
        this.field448 = arg0.method2971();
        this.field440 = arg0.method2971();
        this.field451 = arg0.method3178();
        this.field443 = arg0.method3178();
        this.field454 = arg0.method3178();
        this.field444 = arg0.method3178();
        this.field445 = arg0.method3178();
        this.field446 = arg0.method3178();
        this.field441 = arg0.method3178();
        this.field442 = arg0.method3178();
        this.method235();
    }

    @ObfuscatedName("aw.p(I)V")
    public void method235() {
    }
}
