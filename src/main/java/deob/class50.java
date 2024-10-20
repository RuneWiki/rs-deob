package deob;

@ObfuscatedName("aw")
public class class50 implements class44 {

    @ObfuscatedName("aw.g")
    public int field599;

    @ObfuscatedName("aw.e")
    public int field596;

    @ObfuscatedName("aw.b")
    public int field597;

    @ObfuscatedName("aw.z")
    public int field595;

    @ObfuscatedName("aw.n")
    public int field602;

    @ObfuscatedName("aw.l")
    public int field600;

    @ObfuscatedName("aw.s")
    public int field603;

    @ObfuscatedName("aw.y")
    public int field598;

    @ObfuscatedName("aw.c")
    public int field601;

    @ObfuscatedName("aw.h")
    public int field604;

    @ObfuscatedName("aw.g(Las;I)V")
    public void method183(class33 arg0) {
        if (arg0.field450 > this.field602) {
            arg0.field450 = this.field602;
        }
        if (arg0.field449 < this.field602) {
            arg0.field449 = this.field602;
        }
        if (arg0.field443 > this.field600) {
            arg0.field443 = this.field600;
        }
        if (arg0.field451 < this.field600) {
            arg0.field451 = this.field600;
        }
    }

    @ObfuscatedName("aw.e(IIII)Z")
    public boolean method185(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field599 && arg0 < this.field599 + this.field596) {
            return arg1 >= (this.field603 << 3) + (this.field597 << 6) && arg1 <= (this.field603 << 3) + (this.field597 << 6) + 7 && arg2 >= (this.field598 << 3) + (this.field595 << 6) && arg2 <= (this.field598 << 3) + (this.field595 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aw.b(III)Z")
    public boolean method204(int arg0, int arg1) {
        return arg0 >= (this.field602 << 6) + (this.field601 << 3) && arg0 <= (this.field602 << 6) + (this.field601 << 3) + 7 && arg1 >= (this.field604 << 3) + (this.field600 << 6) && arg1 <= (this.field604 << 3) + (this.field600 << 6) + 7;
    }

    @ObfuscatedName("aw.z(IIIB)[I")
    public int[] method186(int arg0, int arg1, int arg2) {
        return this.method185(arg0, arg1, arg2) ? new int[] { this.field601 * 8 - this.field603 * 8 + this.field602 * 64 - this.field597 * 64 + arg1, this.field604 * 8 - this.field598 * 8 + this.field600 * 64 - this.field595 * 64 + arg2 } : null;
    }

    @ObfuscatedName("aw.n(IIB)Lio;")
    public class239 method182(int arg0, int arg1) {
        if (this.method204(arg0, arg1)) {
            int var3 = this.field603 * 8 - this.field601 * 8 + this.field597 * 64 - this.field602 * 64 + arg0;
            int var4 = this.field598 * 8 - this.field604 * 8 + this.field595 * 64 - this.field600 * 64 + arg1;
            return new class239(this.field599, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("aw.l(Lgg;B)V")
    public void method188(class195 arg0) {
        this.field599 = arg0.method3332();
        this.field596 = arg0.method3332();
        this.field597 = arg0.method3310();
        this.field603 = arg0.method3332();
        this.field595 = arg0.method3310();
        this.field598 = arg0.method3332();
        this.field602 = arg0.method3310();
        this.field601 = arg0.method3332();
        this.field600 = arg0.method3310();
        this.field604 = arg0.method3332();
        this.method688();
    }

    @ObfuscatedName("aw.s(I)V")
    public void method688() {
    }
}
