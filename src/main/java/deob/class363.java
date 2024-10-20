package deob;

@ObfuscatedName("me")
public class class363 {

    @ObfuscatedName("me.c")
    public int field4178;

    @ObfuscatedName("me.b")
    public int field4176;

    @ObfuscatedName("me.p")
    public int field4177;

    @ObfuscatedName("me.m")
    public int field4175;

    public class363(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class363(int arg0, int arg1, int arg2, int arg3) {
        this.method5948(arg0, arg1);
        this.method5933(arg2, arg3);
    }

    @ObfuscatedName("me.c(III)V")
    public void method5948(int arg0, int arg1) {
        this.field4178 = arg0;
        this.field4176 = arg1;
    }

    @ObfuscatedName("me.b(IIS)V")
    public void method5933(int arg0, int arg1) {
        this.field4177 = arg0;
        this.field4175 = arg1;
    }

    @ObfuscatedName("me.p(III)Z")
    public boolean method5934(int arg0, int arg1) {
        return arg0 >= this.field4178 && arg0 < this.field4178 + this.field4177 && arg1 >= this.field4176 && arg1 < this.field4176 + this.field4175;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("me.m(Lme;Lme;S)V")
    public void method5935(class363 arg0, class363 arg1) {
        this.method5936(arg0, arg1);
        this.method5931(arg0, arg1);
    }

    @ObfuscatedName("me.t(Lme;Lme;S)V")
    public void method5936(class363 arg0, class363 arg1) {
        arg1.field4178 = this.field4178;
        arg1.field4177 = this.field4177;
        if (this.field4178 < arg0.field4178) {
            arg1.field4177 -= arg0.field4178 - this.field4178;
            arg1.field4178 = arg0.field4178;
        }
        if (arg1.method5938() > arg0.method5938()) {
            arg1.field4177 -= arg1.method5938() - arg0.method5938();
        }
        if (arg1.field4177 < 0) {
            arg1.field4177 = 0;
        }
    }

    @ObfuscatedName("me.s(Lme;Lme;I)V")
    public void method5931(class363 arg0, class363 arg1) {
        arg1.field4176 = this.field4176;
        arg1.field4175 = this.field4175;
        if (this.field4176 < arg0.field4176) {
            arg1.field4175 -= arg0.field4176 - this.field4176;
            arg1.field4176 = arg0.field4176;
        }
        if (arg1.method5939() > arg0.method5939()) {
            arg1.field4175 -= arg1.method5939() - arg0.method5939();
        }
        if (arg1.field4175 < 0) {
            arg1.field4175 = 0;
        }
    }

    @ObfuscatedName("me.j(I)I")
    public int method5938() {
        return this.field4178 + this.field4177;
    }

    @ObfuscatedName("me.w(B)I")
    public int method5939() {
        return this.field4176 + this.field4175;
    }
}
