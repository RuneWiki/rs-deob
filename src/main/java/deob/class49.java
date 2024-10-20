package deob;

@ObfuscatedName("ay")
public class class49 implements class43 {

    @ObfuscatedName("ay.i")
    public int field618;

    @ObfuscatedName("ay.c")
    public int field622;

    @ObfuscatedName("ay.e")
    public int field619;

    @ObfuscatedName("ay.v")
    public int field617;

    @ObfuscatedName("ay.b")
    public int field621;

    @ObfuscatedName("ay.y")
    public int field628;

    @ObfuscatedName("ay.h")
    public int field623;

    @ObfuscatedName("ay.x")
    public int field624;

    @ObfuscatedName("ay.f")
    public int field625;

    @ObfuscatedName("ay.n")
    public int field626;

    @ObfuscatedName("ay.i(Lai;B)V")
    public void method165(class33 arg0) {
        if (arg0.field459 > this.field621) {
            arg0.field459 = this.field621;
        }
        if (arg0.field466 < this.field621) {
            arg0.field466 = this.field621;
        }
        if (arg0.field457 > this.field628) {
            arg0.field457 = this.field628;
        }
        if (arg0.field462 < this.field628) {
            arg0.field462 = this.field628;
        }
    }

    @ObfuscatedName("ay.c(IIII)Z")
    public boolean method166(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field618 && arg0 < this.field622 + this.field618) {
            return arg1 >= (this.field623 << 3) + (this.field619 << 6) && arg1 <= (this.field623 << 3) + (this.field619 << 6) + 7 && arg2 >= (this.field624 << 3) + (this.field617 << 6) && arg2 <= (this.field624 << 3) + (this.field617 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ay.e(III)Z")
    public boolean method167(int arg0, int arg1) {
        return arg0 >= (this.field625 << 3) + (this.field621 << 6) && arg0 <= (this.field625 << 3) + (this.field621 << 6) + 7 && arg1 >= (this.field628 << 6) + (this.field626 << 3) && arg1 <= (this.field628 << 6) + (this.field626 << 3) + 7;
    }

    @ObfuscatedName("ay.v(IIII)[I")
    public int[] method168(int arg0, int arg1, int arg2) {
        return this.method166(arg0, arg1, arg2) ? new int[] { this.field625 * 8 - this.field623 * 8 + this.field621 * 64 - this.field619 * 64 + arg1, this.field626 * 8 - this.field624 * 8 + this.field628 * 64 - this.field617 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ay.b(III)Lhh;")
    public class213 method186(int arg0, int arg1) {
        if (this.method167(arg0, arg1)) {
            int var3 = this.field623 * 8 - this.field625 * 8 + this.field619 * 64 - this.field621 * 64 + arg0;
            int var4 = this.field624 * 8 - this.field626 * 8 + this.field617 * 64 - this.field628 * 64 + arg1;
            return new class213(this.field618, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ay.y(Lfx;B)V")
    public void method174(class174 arg0) {
        this.field618 = arg0.method2870();
        this.field622 = arg0.method2870();
        this.field619 = arg0.method2872();
        this.field623 = arg0.method2870();
        this.field617 = arg0.method2872();
        this.field624 = arg0.method2870();
        this.field621 = arg0.method2872();
        this.field625 = arg0.method2870();
        this.field628 = arg0.method2872();
        this.field626 = arg0.method2870();
        this.method610();
    }

    @ObfuscatedName("ay.h(I)V")
    public void method610() {
    }
}
