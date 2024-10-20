package deob;

@ObfuscatedName("lx")
public class class324 {

    @ObfuscatedName("lx.o")
    public int field3944;

    @ObfuscatedName("lx.k")
    public int field3942;

    @ObfuscatedName("lx.t")
    public int field3943;

    @ObfuscatedName("lx.d")
    public int field3945;

    public class324(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class324(int arg0, int arg1, int arg2, int arg3) {
        this.method5248(arg0, arg1);
        this.method5249(arg2, arg3);
    }

    @ObfuscatedName("lx.o(III)V")
    public void method5248(int arg0, int arg1) {
        this.field3944 = arg0;
        this.field3942 = arg1;
    }

    @ObfuscatedName("lx.k(III)V")
    public void method5249(int arg0, int arg1) {
        this.field3943 = arg0;
        this.field3945 = arg1;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("lx.t(Llx;Llx;I)V")
    public void method5253(class324 arg0, class324 arg1) {
        this.method5251(arg0, arg1);
        this.method5267(arg0, arg1);
    }

    @ObfuscatedName("lx.d(Llx;Llx;I)V")
    public void method5251(class324 arg0, class324 arg1) {
        arg1.field3944 = this.field3944;
        arg1.field3943 = this.field3943;
        if (this.field3944 < arg0.field3944) {
            arg1.field3943 -= arg0.field3944 - this.field3944;
            arg1.field3944 = arg0.field3944;
        }
        if (arg1.method5256() > arg0.method5256()) {
            arg1.field3943 -= arg1.method5256() - arg0.method5256();
        }
        if (arg1.field3943 < 0) {
            arg1.field3943 = 0;
        }
    }

    @ObfuscatedName("lx.h(Llx;Llx;B)V")
    public void method5267(class324 arg0, class324 arg1) {
        arg1.field3942 = this.field3942;
        arg1.field3945 = this.field3945;
        if (this.field3942 < arg0.field3942) {
            arg1.field3945 -= arg0.field3942 - this.field3942;
            arg1.field3942 = arg0.field3942;
        }
        if (arg1.method5254() > arg0.method5254()) {
            arg1.field3945 -= arg1.method5254() - arg0.method5254();
        }
        if (arg1.field3945 < 0) {
            arg1.field3945 = 0;
        }
    }

    @ObfuscatedName("lx.m(B)I")
    public int method5256() {
        return this.field3944 + this.field3943;
    }

    @ObfuscatedName("lx.z(I)I")
    public int method5254() {
        return this.field3945 + this.field3942;
    }
}
