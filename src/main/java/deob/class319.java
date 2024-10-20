package deob;

@ObfuscatedName("ls")
public class class319 {

    @ObfuscatedName("ls.a")
    public int field3830;

    @ObfuscatedName("ls.t")
    public int field3827;

    @ObfuscatedName("ls.n")
    public int field3828;

    @ObfuscatedName("ls.q")
    public int field3826;

    public class319(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class319(int arg0, int arg1, int arg2, int arg3) {
        this.method5542(arg0, arg1);
        this.method5563(arg2, arg3);
    }

    @ObfuscatedName("ls.a(IIB)V")
    public void method5542(int arg0, int arg1) {
        this.field3830 = arg0;
        this.field3827 = arg1;
    }

    @ObfuscatedName("ls.t(IIB)V")
    public void method5563(int arg0, int arg1) {
        this.field3828 = arg0;
        this.field3826 = arg1;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("ls.n(Lls;Lls;I)V")
    public void method5541(class319 arg0, class319 arg1) {
        this.method5557(arg0, arg1);
        this.method5545(arg0, arg1);
    }

    @ObfuscatedName("ls.q(Lls;Lls;I)V")
    public void method5557(class319 arg0, class319 arg1) {
        arg1.field3830 = this.field3830;
        arg1.field3828 = this.field3828;
        if (this.field3830 < arg0.field3830) {
            arg1.field3828 -= arg0.field3830 - this.field3830;
            arg1.field3830 = arg0.field3830;
        }
        if (arg1.method5546() > arg0.method5546()) {
            arg1.field3828 -= arg1.method5546() - arg0.method5546();
        }
        if (arg1.field3828 < 0) {
            arg1.field3828 = 0;
        }
    }

    @ObfuscatedName("ls.v(Lls;Lls;B)V")
    public void method5545(class319 arg0, class319 arg1) {
        arg1.field3827 = this.field3827;
        arg1.field3826 = this.field3826;
        if (this.field3827 < arg0.field3827) {
            arg1.field3826 -= arg0.field3827 - this.field3827;
            arg1.field3827 = arg0.field3827;
        }
        if (arg1.method5547() > arg0.method5547()) {
            arg1.field3826 -= arg1.method5547() - arg0.method5547();
        }
        if (arg1.field3826 < 0) {
            arg1.field3826 = 0;
        }
    }

    @ObfuscatedName("ls.l(B)I")
    public int method5546() {
        return this.field3830 + this.field3828;
    }

    @ObfuscatedName("ls.c(B)I")
    public int method5547() {
        return this.field3827 + this.field3826;
    }
}
