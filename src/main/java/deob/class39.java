package deob;

@ObfuscatedName("ae")
public class class39 implements class43 {

    @ObfuscatedName("ae.i")
    public int field520;

    @ObfuscatedName("ae.c")
    public int field517;

    @ObfuscatedName("ae.e")
    public int field518;

    @ObfuscatedName("ae.v")
    public int field519;

    @ObfuscatedName("ae.b")
    public int field524;

    @ObfuscatedName("ae.y")
    public int field521;

    @ObfuscatedName("ae.i(Lai;B)V")
    public void method165(class33 arg0) {
        if (arg0.field459 > this.field524) {
            arg0.field459 = this.field524;
        }
        if (arg0.field466 < this.field524) {
            arg0.field466 = this.field524;
        }
        if (arg0.field457 > this.field521) {
            arg0.field457 = this.field521;
        }
        if (arg0.field462 < this.field521) {
            arg0.field462 = this.field521;
        }
    }

    @ObfuscatedName("ae.c(IIII)Z")
    public boolean method166(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field520 && arg0 < this.field520 + this.field517) {
            return arg1 >> 6 == this.field518 && arg2 >> 6 == this.field519;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ae.e(III)Z")
    public boolean method167(int arg0, int arg1) {
        return arg0 >> 6 == this.field524 && arg1 >> 6 == this.field521;
    }

    @ObfuscatedName("ae.v(IIII)[I")
    public int[] method168(int arg0, int arg1, int arg2) {
        return this.method166(arg0, arg1, arg2) ? new int[] { this.field524 * 64 - this.field518 * 64 + arg1, this.field521 * 64 - this.field519 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ae.b(III)Lhh;")
    public class213 method186(int arg0, int arg1) {
        if (this.method167(arg0, arg1)) {
            int var3 = this.field518 * 64 - this.field524 * 64 + arg0;
            int var4 = this.field519 * 64 - this.field521 * 64 + arg1;
            return new class213(this.field520, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ae.y(Lfx;B)V")
    public void method174(class174 arg0) {
        this.field520 = arg0.method2870();
        this.field517 = arg0.method2870();
        this.field518 = arg0.method2872();
        this.field519 = arg0.method2872();
        this.field524 = arg0.method2872();
        this.field521 = arg0.method2872();
        this.method460();
    }

    @ObfuscatedName("ae.h(I)V")
    public void method460() {
    }
}
