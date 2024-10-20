package deob;

@ObfuscatedName("ns")
public class class384 {

    @ObfuscatedName("ns.c")
    public int field4382;

    @ObfuscatedName("ns.v")
    public int field4379;

    @ObfuscatedName("ns.q")
    public int field4380;

    @ObfuscatedName("ns.f")
    public int field4381;

    public class384(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class384(int arg0, int arg1, int arg2, int arg3) {
        this.method6264(arg0, arg1);
        this.method6265(arg2, arg3);
    }

    @ObfuscatedName("ns.c(III)V")
    public void method6264(int arg0, int arg1) {
        this.field4382 = arg0;
        this.field4379 = arg1;
    }

    @ObfuscatedName("ns.v(III)V")
    public void method6265(int arg0, int arg1) {
        this.field4380 = arg0;
        this.field4381 = arg1;
    }

    @ObfuscatedName("ns.q(IIB)Z")
    public boolean method6266(int arg0, int arg1) {
        return arg0 >= this.field4382 && arg0 < this.field4382 + this.field4380 && arg1 >= this.field4379 && arg1 < this.field4381 + this.field4379;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("ns.f(Lns;Lns;I)V")
    public void method6267(class384 arg0, class384 arg1) {
        this.method6281(arg0, arg1);
        this.method6290(arg0, arg1);
    }

    @ObfuscatedName("ns.j(Lns;Lns;I)V")
    public void method6281(class384 arg0, class384 arg1) {
        arg1.field4382 = this.field4382;
        arg1.field4380 = this.field4380;
        if (this.field4382 < arg0.field4382) {
            arg1.field4380 -= arg0.field4382 - this.field4382;
            arg1.field4382 = arg0.field4382;
        }
        if (arg1.method6270() > arg0.method6270()) {
            arg1.field4380 -= arg1.method6270() - arg0.method6270();
        }
        if (arg1.field4380 < 0) {
            arg1.field4380 = 0;
        }
    }

    @ObfuscatedName("ns.e(Lns;Lns;I)V")
    public void method6290(class384 arg0, class384 arg1) {
        arg1.field4379 = this.field4379;
        arg1.field4381 = this.field4381;
        if (this.field4379 < arg0.field4379) {
            arg1.field4381 -= arg0.field4379 - this.field4379;
            arg1.field4379 = arg0.field4379;
        }
        if (arg1.method6275() > arg0.method6275()) {
            arg1.field4381 -= arg1.method6275() - arg0.method6275();
        }
        if (arg1.field4381 < 0) {
            arg1.field4381 = 0;
        }
    }

    @ObfuscatedName("ns.g(B)I")
    public int method6270() {
        return this.field4382 + this.field4380;
    }

    @ObfuscatedName("ns.w(B)I")
    public int method6275() {
        return this.field4381 + this.field4379;
    }
}
