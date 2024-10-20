package deob;

@ObfuscatedName("qg")
public class class424 {

    @ObfuscatedName("qg.ap")
    public int field4758;

    @ObfuscatedName("qg.aw")
    public int field4759;

    @ObfuscatedName("qg.ak")
    public int field4760;

    @ObfuscatedName("qg.aj")
    public int field4761;

    public class424(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class424(int arg0, int arg1, int arg2, int arg3) {
        this.method7506(arg0, arg1);
        this.method7507(arg2, arg3);
    }

    @ObfuscatedName("qg.ap(III)V")
    public void method7506(int arg0, int arg1) {
        this.field4758 = arg0;
        this.field4759 = arg1;
    }

    @ObfuscatedName("qg.aw(III)V")
    public void method7507(int arg0, int arg1) {
        this.field4760 = arg0;
        this.field4761 = arg1;
    }

    @ObfuscatedName("qg.ak(III)Z")
    public boolean method7508(int arg0, int arg1) {
        return arg0 >= this.field4758 && arg0 < this.field4760 + this.field4758 && arg1 >= this.field4759 && arg1 < this.field4761 + this.field4759;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("qg.aj(Lqg;Lqg;I)V")
    public void method7520(class424 arg0, class424 arg1) {
        this.method7511(arg0, arg1);
        this.method7512(arg0, arg1);
    }

    @ObfuscatedName("qg.ai(Lqg;Lqg;S)V")
    public void method7511(class424 arg0, class424 arg1) {
        arg1.field4758 = this.field4758;
        arg1.field4760 = this.field4760;
        if (this.field4758 < arg0.field4758) {
            arg1.field4760 -= arg0.field4758 - this.field4758;
            arg1.field4758 = arg0.field4758;
        }
        if (arg1.method7509() > arg0.method7509()) {
            arg1.field4760 -= arg1.method7509() - arg0.method7509();
        }
        if (arg1.field4760 < 0) {
            arg1.field4760 = 0;
        }
    }

    @ObfuscatedName("qg.ay(Lqg;Lqg;I)V")
    public void method7512(class424 arg0, class424 arg1) {
        arg1.field4759 = this.field4759;
        arg1.field4761 = this.field4761;
        if (this.field4759 < arg0.field4759) {
            arg1.field4761 -= arg0.field4759 - this.field4759;
            arg1.field4759 = arg0.field4759;
        }
        if (arg1.method7513() > arg0.method7513()) {
            arg1.field4761 -= arg1.method7513() - arg0.method7513();
        }
        if (arg1.field4761 < 0) {
            arg1.field4761 = 0;
        }
    }

    @ObfuscatedName("qg.as(B)I")
    public int method7509() {
        return this.field4760 + this.field4758;
    }

    @ObfuscatedName("qg.ae(B)I")
    public int method7513() {
        return this.field4761 + this.field4759;
    }
}
