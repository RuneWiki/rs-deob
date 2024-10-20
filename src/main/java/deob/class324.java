package deob;

@ObfuscatedName("lb")
public class class324 {

    @ObfuscatedName("lb.t")
    public int field3942;

    @ObfuscatedName("lb.q")
    public int field3943;

    @ObfuscatedName("lb.i")
    public int field3944;

    @ObfuscatedName("lb.a")
    public int field3945;

    public class324(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class324(int arg0, int arg1, int arg2, int arg3) {
        this.method5246(arg0, arg1);
        this.method5237(arg2, arg3);
    }

    @ObfuscatedName("lb.t(III)V")
    public void method5246(int arg0, int arg1) {
        this.field3942 = arg0;
        this.field3943 = arg1;
    }

    @ObfuscatedName("lb.q(III)V")
    public void method5237(int arg0, int arg1) {
        this.field3944 = arg0;
        this.field3945 = arg1;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("lb.i(Llb;Llb;I)V")
    public void method5233(class324 arg0, class324 arg1) {
        this.method5232(arg0, arg1);
        this.method5230(arg0, arg1);
    }

    @ObfuscatedName("lb.a(Llb;Llb;B)V")
    public void method5232(class324 arg0, class324 arg1) {
        arg1.field3942 = this.field3942;
        arg1.field3944 = this.field3944;
        if (this.field3942 < arg0.field3942) {
            arg1.field3944 -= arg0.field3942 - this.field3942;
            arg1.field3942 = arg0.field3942;
        }
        if (arg1.method5234() > arg0.method5234()) {
            arg1.field3944 -= arg1.method5234() - arg0.method5234();
        }
        if (arg1.field3944 < 0) {
            arg1.field3944 = 0;
        }
    }

    @ObfuscatedName("lb.l(Llb;Llb;I)V")
    public void method5230(class324 arg0, class324 arg1) {
        arg1.field3943 = this.field3943;
        arg1.field3945 = this.field3945;
        if (this.field3943 < arg0.field3943) {
            arg1.field3945 -= arg0.field3943 - this.field3943;
            arg1.field3943 = arg0.field3943;
        }
        if (arg1.method5235() > arg0.method5235()) {
            arg1.field3945 -= arg1.method5235() - arg0.method5235();
        }
        if (arg1.field3945 < 0) {
            arg1.field3945 = 0;
        }
    }

    @ObfuscatedName("lb.b(B)I")
    public int method5234() {
        return this.field3944 + this.field3942;
    }

    @ObfuscatedName("lb.e(S)I")
    public int method5235() {
        return this.field3945 + this.field3943;
    }
}
