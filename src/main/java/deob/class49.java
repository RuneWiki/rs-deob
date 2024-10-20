package deob;

@ObfuscatedName("ai")
public class class49 implements class43 {

    @ObfuscatedName("ai.w")
    public int field631;

    @ObfuscatedName("ai.s")
    public int field628;

    @ObfuscatedName("ai.q")
    public int field629;

    @ObfuscatedName("ai.o")
    public int field635;

    @ObfuscatedName("ai.g")
    public int field627;

    @ObfuscatedName("ai.v")
    public int field632;

    @ObfuscatedName("ai.p")
    public int field633;

    @ObfuscatedName("ai.e")
    public int field634;

    @ObfuscatedName("ai.d")
    public int field630;

    @ObfuscatedName("ai.x")
    public int field636;

    @ObfuscatedName("ai.w(Lat;I)V")
    public void method180(class33 arg0) {
        if (arg0.field465 > this.field627) {
            arg0.field465 = this.field627;
        }
        if (arg0.field469 < this.field627) {
            arg0.field469 = this.field627;
        }
        if (arg0.field470 > this.field632) {
            arg0.field470 = this.field632;
        }
        if (arg0.field462 < this.field632) {
            arg0.field462 = this.field632;
        }
    }

    @ObfuscatedName("ai.s(IIII)Z")
    public boolean method181(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field631 && arg0 < this.field631 + this.field628) {
            return arg1 >= (this.field633 << 3) + (this.field629 << 6) && arg1 <= (this.field633 << 3) + (this.field629 << 6) + 7 && arg2 >= (this.field635 << 6) + (this.field634 << 3) && arg2 <= (this.field635 << 6) + (this.field634 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ai.q(III)Z")
    public boolean method182(int arg0, int arg1) {
        return arg0 >= (this.field630 << 3) + (this.field627 << 6) && arg0 <= (this.field630 << 3) + (this.field627 << 6) + 7 && arg1 >= (this.field636 << 3) + (this.field632 << 6) && arg1 <= (this.field636 << 3) + (this.field632 << 6) + 7;
    }

    @ObfuscatedName("ai.o(IIII)[I")
    public int[] method179(int arg0, int arg1, int arg2) {
        return this.method181(arg0, arg1, arg2) ? new int[] { this.field630 * 8 - this.field633 * 8 + this.field627 * 64 - this.field629 * 64 + arg1, this.field636 * 8 - this.field634 * 8 + this.field632 * 64 - this.field635 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ai.g(III)Lhg;")
    public class213 method190(int arg0, int arg1) {
        if (this.method182(arg0, arg1)) {
            int var3 = this.field633 * 8 - this.field630 * 8 + this.field629 * 64 - this.field627 * 64 + arg0;
            int var4 = this.field634 * 8 - this.field636 * 8 + this.field635 * 64 - this.field632 * 64 + arg1;
            return new class213(this.field631, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ai.v(Lfz;B)V")
    public void method185(class174 arg0) {
        this.field631 = arg0.method2971();
        this.field628 = arg0.method2971();
        this.field629 = arg0.method3178();
        this.field633 = arg0.method2971();
        this.field635 = arg0.method3178();
        this.field634 = arg0.method2971();
        this.field627 = arg0.method3178();
        this.field630 = arg0.method2971();
        this.field632 = arg0.method3178();
        this.field636 = arg0.method2971();
        this.method628();
    }

    @ObfuscatedName("ai.p(B)V")
    public void method628() {
    }
}
