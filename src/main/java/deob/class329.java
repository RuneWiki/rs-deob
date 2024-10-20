package deob;

@ObfuscatedName("ld")
public class class329 {

    @ObfuscatedName("ld.x")
    public int field3854;

    @ObfuscatedName("ld.m")
    public int field3858;

    @ObfuscatedName("ld.k")
    public int field3856;

    @ObfuscatedName("ld.d")
    public int field3857;

    public class329(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class329(int arg0, int arg1, int arg2, int arg3) {
        this.method5565(arg0, arg1);
        this.method5566(arg2, arg3);
    }

    @ObfuscatedName("ld.x(III)V")
    public void method5565(int arg0, int arg1) {
        this.field3858 = arg0;
        this.field3854 = arg1;
    }

    @ObfuscatedName("ld.m(III)V")
    public void method5566(int arg0, int arg1) {
        this.field3856 = arg0;
        this.field3857 = arg1;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("ld.k(Lld;Lld;B)V")
    public void method5564(class329 arg0, class329 arg1) {
        this.method5568(arg0, arg1);
        this.method5569(arg0, arg1);
    }

    @ObfuscatedName("ld.d(Lld;Lld;I)V")
    public void method5568(class329 arg0, class329 arg1) {
        arg1.field3858 = this.field3858;
        arg1.field3856 = this.field3856;
        if (this.field3858 < arg0.field3858) {
            arg1.field3856 -= arg0.field3858 - this.field3858;
            arg1.field3858 = arg0.field3858;
        }
        if (arg1.method5570() > arg0.method5570()) {
            arg1.field3856 -= arg1.method5570() - arg0.method5570();
        }
        if (arg1.field3856 < 0) {
            arg1.field3856 = 0;
        }
    }

    @ObfuscatedName("ld.w(Lld;Lld;I)V")
    public void method5569(class329 arg0, class329 arg1) {
        arg1.field3854 = this.field3854;
        arg1.field3857 = this.field3857;
        if (this.field3854 < arg0.field3854) {
            arg1.field3857 -= arg0.field3854 - this.field3854;
            arg1.field3854 = arg0.field3854;
        }
        if (arg1.method5567() > arg0.method5567()) {
            arg1.field3857 -= arg1.method5567() - arg0.method5567();
        }
        if (arg1.field3857 < 0) {
            arg1.field3857 = 0;
        }
    }

    @ObfuscatedName("ld.v(B)I")
    public int method5570() {
        return this.field3858 + this.field3856;
    }

    @ObfuscatedName("ld.q(I)I")
    public int method5567() {
        return this.field3857 + this.field3854;
    }
}
