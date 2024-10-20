package deob;

@ObfuscatedName("lc")
public class class330 {

    @ObfuscatedName("lc.h")
    public int field3882;

    @ObfuscatedName("lc.v")
    public int field3879;

    @ObfuscatedName("lc.x")
    public int field3880;

    @ObfuscatedName("lc.w")
    public int field3881;

    public class330(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class330(int arg0, int arg1, int arg2, int arg3) {
        this.method5544(arg0, arg1);
        this.method5545(arg2, arg3);
    }

    @ObfuscatedName("lc.h(III)V")
    public void method5544(int arg0, int arg1) {
        this.field3882 = arg0;
        this.field3879 = arg1;
    }

    @ObfuscatedName("lc.v(III)V")
    public void method5545(int arg0, int arg1) {
        this.field3880 = arg0;
        this.field3881 = arg1;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("lc.x(Llc;Llc;I)V")
    public void method5546(class330 arg0, class330 arg1) {
        this.method5547(arg0, arg1);
        this.method5556(arg0, arg1);
    }

    @ObfuscatedName("lc.w(Llc;Llc;I)V")
    public void method5547(class330 arg0, class330 arg1) {
        arg1.field3882 = this.field3882;
        arg1.field3880 = this.field3880;
        if (this.field3882 < arg0.field3882) {
            arg1.field3880 -= arg0.field3882 - this.field3882;
            arg1.field3882 = arg0.field3882;
        }
        if (arg1.method5549() > arg0.method5549()) {
            arg1.field3880 -= arg1.method5549() - arg0.method5549();
        }
        if (arg1.field3880 < 0) {
            arg1.field3880 = 0;
        }
    }

    @ObfuscatedName("lc.t(Llc;Llc;I)V")
    public void method5556(class330 arg0, class330 arg1) {
        arg1.field3879 = this.field3879;
        arg1.field3881 = this.field3881;
        if (this.field3879 < arg0.field3879) {
            arg1.field3881 -= arg0.field3879 - this.field3879;
            arg1.field3879 = arg0.field3879;
        }
        if (arg1.method5550() > arg0.method5550()) {
            arg1.field3881 -= arg1.method5550() - arg0.method5550();
        }
        if (arg1.field3881 < 0) {
            arg1.field3881 = 0;
        }
    }

    @ObfuscatedName("lc.j(I)I")
    public int method5549() {
        return this.field3882 + this.field3880;
    }

    @ObfuscatedName("lc.n(I)I")
    public int method5550() {
        return this.field3881 + this.field3879;
    }
}
