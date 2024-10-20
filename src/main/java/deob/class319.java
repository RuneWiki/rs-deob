package deob;

@ObfuscatedName("ll")
public class class319 {

    @ObfuscatedName("ll.z")
    public int field3839;

    @ObfuscatedName("ll.n")
    public int field3838;

    @ObfuscatedName("ll.v")
    public int field3837;

    @ObfuscatedName("ll.u")
    public int field3840;

    public class319(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class319(int arg0, int arg1, int arg2, int arg3) {
        this.method5404(arg0, arg1);
        this.method5405(arg2, arg3);
    }

    @ObfuscatedName("ll.z(III)V")
    public void method5404(int arg0, int arg1) {
        this.field3839 = arg0;
        this.field3838 = arg1;
    }

    @ObfuscatedName("ll.n(III)V")
    public void method5405(int arg0, int arg1) {
        this.field3837 = arg0;
        this.field3840 = arg1;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("ll.v(Lll;Lll;I)V")
    public void method5407(class319 arg0, class319 arg1) {
        this.method5421(arg0, arg1);
        this.method5408(arg0, arg1);
    }

    @ObfuscatedName("ll.u(Lll;Lll;B)V")
    public void method5421(class319 arg0, class319 arg1) {
        arg1.field3839 = this.field3839;
        arg1.field3837 = this.field3837;
        if (this.field3839 < arg0.field3839) {
            arg1.field3837 -= arg0.field3839 - this.field3839;
            arg1.field3839 = arg0.field3839;
        }
        if (arg1.method5410() > arg0.method5410()) {
            arg1.field3837 -= arg1.method5410() - arg0.method5410();
        }
        if (arg1.field3837 < 0) {
            arg1.field3837 = 0;
        }
    }

    @ObfuscatedName("ll.r(Lll;Lll;I)V")
    public void method5408(class319 arg0, class319 arg1) {
        arg1.field3838 = this.field3838;
        arg1.field3840 = this.field3840;
        if (this.field3838 < arg0.field3838) {
            arg1.field3840 -= arg0.field3838 - this.field3838;
            arg1.field3838 = arg0.field3838;
        }
        if (arg1.method5406() > arg0.method5406()) {
            arg1.field3840 -= arg1.method5406() - arg0.method5406();
        }
        if (arg1.field3840 < 0) {
            arg1.field3840 = 0;
        }
    }

    @ObfuscatedName("ll.p(I)I")
    public int method5410() {
        return this.field3839 + this.field3837;
    }

    @ObfuscatedName("ll.q(B)I")
    public int method5406() {
        return this.field3840 + this.field3838;
    }
}
