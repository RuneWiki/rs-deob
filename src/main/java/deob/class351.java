package deob;

@ObfuscatedName("me")
public class class351 {

    @ObfuscatedName("me.l")
    public int field4028;

    @ObfuscatedName("me.q")
    public int field4027;

    @ObfuscatedName("me.f")
    public int field4030;

    @ObfuscatedName("me.j")
    public int field4029;

    public class351(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class351(int arg0, int arg1, int arg2, int arg3) {
        this.method5693(arg0, arg1);
        this.method5676(arg2, arg3);
    }

    @ObfuscatedName("me.l(IIB)V")
    public void method5693(int arg0, int arg1) {
        this.field4028 = arg0;
        this.field4027 = arg1;
    }

    @ObfuscatedName("me.q(III)V")
    public void method5676(int arg0, int arg1) {
        this.field4030 = arg0;
        this.field4029 = arg1;
    }

    @ObfuscatedName("me.f(IIB)Z")
    public boolean method5677(int arg0, int arg1) {
        return arg0 >= this.field4028 && arg0 < this.field4030 + this.field4028 && arg1 >= this.field4027 && arg1 < this.field4029 + this.field4027;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("me.j(Lme;Lme;B)V")
    public void method5678(class351 arg0, class351 arg1) {
        this.method5679(arg0, arg1);
        this.method5680(arg0, arg1);
    }

    @ObfuscatedName("me.m(Lme;Lme;I)V")
    public void method5679(class351 arg0, class351 arg1) {
        arg1.field4028 = this.field4028;
        arg1.field4030 = this.field4030;
        if (this.field4028 < arg0.field4028) {
            arg1.field4030 -= arg0.field4028 - this.field4028;
            arg1.field4028 = arg0.field4028;
        }
        if (arg1.method5686() > arg0.method5686()) {
            arg1.field4030 -= arg1.method5686() - arg0.method5686();
        }
        if (arg1.field4030 < 0) {
            arg1.field4030 = 0;
        }
    }

    @ObfuscatedName("me.k(Lme;Lme;I)V")
    public void method5680(class351 arg0, class351 arg1) {
        arg1.field4027 = this.field4027;
        arg1.field4029 = this.field4029;
        if (this.field4027 < arg0.field4027) {
            arg1.field4029 -= arg0.field4027 - this.field4027;
            arg1.field4027 = arg0.field4027;
        }
        if (arg1.method5682() > arg0.method5682()) {
            arg1.field4029 -= arg1.method5682() - arg0.method5682();
        }
        if (arg1.field4029 < 0) {
            arg1.field4029 = 0;
        }
    }

    @ObfuscatedName("me.t(I)I")
    public int method5686() {
        return this.field4030 + this.field4028;
    }

    @ObfuscatedName("me.a(B)I")
    public int method5682() {
        return this.field4029 + this.field4027;
    }
}
