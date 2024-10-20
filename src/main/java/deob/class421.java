package deob;

@ObfuscatedName("qw")
public class class421 {

    @ObfuscatedName("qw.ab")
    public int field4663;

    @ObfuscatedName("qw.ay")
    public int field4662;

    @ObfuscatedName("qw.an")
    public int field4661;

    @ObfuscatedName("qw.au")
    public int field4664;

    public class421(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class421(int arg0, int arg1, int arg2, int arg3) {
        this.method7142(arg0, arg1);
        this.method7169(arg2, arg3);
    }

    @ObfuscatedName("qw.ab(IIB)V")
    public void method7142(int arg0, int arg1) {
        this.field4663 = arg0;
        this.field4662 = arg1;
    }

    @ObfuscatedName("qw.ay(III)V")
    public void method7169(int arg0, int arg1) {
        this.field4661 = arg0;
        this.field4664 = arg1;
    }

    @ObfuscatedName("qw.an(IIB)Z")
    public boolean method7144(int arg0, int arg1) {
        return arg0 >= this.field4663 && arg0 < this.field4663 + this.field4661 && arg1 >= this.field4662 && arg1 < this.field4664 + this.field4662;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("qw.au(Lqw;Lqw;I)V")
    public void method7146(class421 arg0, class421 arg1) {
        this.method7162(arg0, arg1);
        this.method7147(arg0, arg1);
    }

    @ObfuscatedName("qw.ax(Lqw;Lqw;I)V")
    public void method7162(class421 arg0, class421 arg1) {
        arg1.field4663 = this.field4663;
        arg1.field4661 = this.field4661;
        if (this.field4663 < arg0.field4663) {
            arg1.field4661 -= arg0.field4663 - this.field4663;
            arg1.field4663 = arg0.field4663;
        }
        if (arg1.method7149() > arg0.method7149()) {
            arg1.field4661 -= arg1.method7149() - arg0.method7149();
        }
        if (arg1.field4661 < 0) {
            arg1.field4661 = 0;
        }
    }

    @ObfuscatedName("qw.ao(Lqw;Lqw;I)V")
    public void method7147(class421 arg0, class421 arg1) {
        arg1.field4662 = this.field4662;
        arg1.field4664 = this.field4664;
        if (this.field4662 < arg0.field4662) {
            arg1.field4664 -= arg0.field4662 - this.field4662;
            arg1.field4662 = arg0.field4662;
        }
        if (arg1.method7172() > arg0.method7172()) {
            arg1.field4664 -= arg1.method7172() - arg0.method7172();
        }
        if (arg1.field4664 < 0) {
            arg1.field4664 = 0;
        }
    }

    @ObfuscatedName("qw.am(B)I")
    public int method7149() {
        return this.field4663 + this.field4661;
    }

    @ObfuscatedName("qw.ac(I)I")
    public int method7172() {
        return this.field4664 + this.field4662;
    }
}
