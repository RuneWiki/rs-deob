package deob;

@ObfuscatedName("oj")
public class class414 {

    @ObfuscatedName("oj.f")
    public int field4628;

    @ObfuscatedName("oj.w")
    public int field4627;

    @ObfuscatedName("oj.v")
    public int field4626;

    @ObfuscatedName("oj.s")
    public int field4629;

    public class414(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class414(int arg0, int arg1, int arg2, int arg3) {
        this.method7220(arg0, arg1);
        this.method7219(arg2, arg3);
    }

    @ObfuscatedName("oj.f(IIB)V")
    public void method7220(int arg0, int arg1) {
        this.field4628 = arg0;
        this.field4627 = arg1;
    }

    @ObfuscatedName("oj.w(III)V")
    public void method7219(int arg0, int arg1) {
        this.field4626 = arg0;
        this.field4629 = arg1;
    }

    @ObfuscatedName("oj.v(III)Z")
    public boolean method7222(int arg0, int arg1) {
        return arg0 >= this.field4628 && arg0 < this.field4628 + this.field4626 && arg1 >= this.field4627 && arg1 < this.field4629 + this.field4627;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("oj.s(Loj;Loj;I)V")
    public void method7224(class414 arg0, class414 arg1) {
        this.method7236(arg0, arg1);
        this.method7239(arg0, arg1);
    }

    @ObfuscatedName("oj.z(Loj;Loj;I)V")
    public void method7236(class414 arg0, class414 arg1) {
        arg1.field4628 = this.field4628;
        arg1.field4626 = this.field4626;
        if (this.field4628 < arg0.field4628) {
            arg1.field4626 -= arg0.field4628 - this.field4628;
            arg1.field4628 = arg0.field4628;
        }
        if (arg1.method7227() > arg0.method7227()) {
            arg1.field4626 -= arg1.method7227() - arg0.method7227();
        }
        if (arg1.field4626 < 0) {
            arg1.field4626 = 0;
        }
    }

    @ObfuscatedName("oj.j(Loj;Loj;I)V")
    public void method7239(class414 arg0, class414 arg1) {
        arg1.field4627 = this.field4627;
        arg1.field4629 = this.field4629;
        if (this.field4627 < arg0.field4627) {
            arg1.field4629 -= arg0.field4627 - this.field4627;
            arg1.field4627 = arg0.field4627;
        }
        if (arg1.method7228() > arg0.method7228()) {
            arg1.field4629 -= arg1.method7228() - arg0.method7228();
        }
        if (arg1.field4629 < 0) {
            arg1.field4629 = 0;
        }
    }

    @ObfuscatedName("oj.i(I)I")
    public int method7227() {
        return this.field4628 + this.field4626;
    }

    @ObfuscatedName("oj.n(I)I")
    public int method7228() {
        return this.field4629 + this.field4627;
    }
}
