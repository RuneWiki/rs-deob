package deob;

@ObfuscatedName("mt")
public class class350 {

    @ObfuscatedName("mt.n")
    public int field4013;

    @ObfuscatedName("mt.c")
    public int field4014;

    @ObfuscatedName("mt.m")
    public int field4015;

    @ObfuscatedName("mt.k")
    public int field4012;

    public class350(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class350(int arg0, int arg1, int arg2, int arg3) {
        this.method5645(arg0, arg1);
        this.method5636(arg2, arg3);
    }

    @ObfuscatedName("mt.n(III)V")
    public void method5645(int arg0, int arg1) {
        this.field4013 = arg0;
        this.field4014 = arg1;
    }

    @ObfuscatedName("mt.c(III)V")
    public void method5636(int arg0, int arg1) {
        this.field4015 = arg0;
        this.field4012 = arg1;
    }

    @ObfuscatedName("mt.m(III)Z")
    public boolean method5634(int arg0, int arg1) {
        return arg0 >= this.field4013 && arg0 < this.field4015 + this.field4013 && arg1 >= this.field4014 && arg1 < this.field4014 + this.field4012;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("mt.k(Lmt;Lmt;I)V")
    public void method5639(class350 arg0, class350 arg1) {
        this.method5640(arg0, arg1);
        this.method5644(arg0, arg1);
    }

    @ObfuscatedName("mt.o(Lmt;Lmt;I)V")
    public void method5640(class350 arg0, class350 arg1) {
        arg1.field4013 = this.field4013;
        arg1.field4015 = this.field4015;
        if (this.field4013 < arg0.field4013) {
            arg1.field4015 -= arg0.field4013 - this.field4013;
            arg1.field4013 = arg0.field4013;
        }
        if (arg1.method5643() > arg0.method5643()) {
            arg1.field4015 -= arg1.method5643() - arg0.method5643();
        }
        if (arg1.field4015 < 0) {
            arg1.field4015 = 0;
        }
    }

    @ObfuscatedName("mt.g(Lmt;Lmt;I)V")
    public void method5644(class350 arg0, class350 arg1) {
        arg1.field4014 = this.field4014;
        arg1.field4012 = this.field4012;
        if (this.field4014 < arg0.field4014) {
            arg1.field4012 -= arg0.field4014 - this.field4014;
            arg1.field4014 = arg0.field4014;
        }
        if (arg1.method5642() > arg0.method5642()) {
            arg1.field4012 -= arg1.method5642() - arg0.method5642();
        }
        if (arg1.field4012 < 0) {
            arg1.field4012 = 0;
        }
    }

    @ObfuscatedName("mt.z(I)I")
    public int method5643() {
        return this.field4015 + this.field4013;
    }

    @ObfuscatedName("mt.a(S)I")
    public int method5642() {
        return this.field4014 + this.field4012;
    }
}
