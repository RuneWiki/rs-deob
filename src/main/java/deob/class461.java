package deob;

@ObfuscatedName("rx")
public class class461 {

    @ObfuscatedName("rx.ac")
    public int field4764;

    @ObfuscatedName("rx.al")
    public int field4766;

    @ObfuscatedName("rx.ak")
    public int field4763;

    @ObfuscatedName("rx.ax")
    public int field4765;

    public class461(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class461(int arg0, int arg1, int arg2, int arg3) {
        this.method7518(arg0, arg1);
        this.method7519(arg2, arg3);
    }

    @ObfuscatedName("rx.ac(III)V")
    public void method7518(int arg0, int arg1) {
        this.field4764 = arg0;
        this.field4766 = arg1;
    }

    @ObfuscatedName("rx.al(III)V")
    public void method7519(int arg0, int arg1) {
        this.field4763 = arg0;
        this.field4765 = arg1;
    }

    @ObfuscatedName("rx.ak(IIB)Z")
    public boolean method7530(int arg0, int arg1) {
        return arg0 >= this.field4764 && arg0 < this.field4764 + this.field4763 && arg1 >= this.field4766 && arg1 < this.field4766 + this.field4765;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("rx.ax(Lrx;Lrx;I)V")
    public void method7552(class461 arg0, class461 arg1) {
        this.method7522(arg0, arg1);
        this.method7523(arg0, arg1);
    }

    @ObfuscatedName("rx.ao(Lrx;Lrx;B)V")
    public void method7522(class461 arg0, class461 arg1) {
        arg1.field4764 = this.field4764;
        arg1.field4763 = this.field4763;
        if (this.field4764 < arg0.field4764) {
            arg1.field4763 -= arg0.field4764 - this.field4764;
            arg1.field4764 = arg0.field4764;
        }
        if (arg1.method7543() > arg0.method7543()) {
            arg1.field4763 -= arg1.method7543() - arg0.method7543();
        }
        if (arg1.field4763 < 0) {
            arg1.field4763 = 0;
        }
    }

    @ObfuscatedName("rx.ah(Lrx;Lrx;I)V")
    public void method7523(class461 arg0, class461 arg1) {
        arg1.field4766 = this.field4766;
        arg1.field4765 = this.field4765;
        if (this.field4766 < arg0.field4766) {
            arg1.field4765 -= arg0.field4766 - this.field4766;
            arg1.field4766 = arg0.field4766;
        }
        if (arg1.method7525() > arg0.method7525()) {
            arg1.field4765 -= arg1.method7525() - arg0.method7525();
        }
        if (arg1.field4765 < 0) {
            arg1.field4765 = 0;
        }
    }

    @ObfuscatedName("rx.ar(I)I")
    public int method7543() {
        return this.field4764 + this.field4763;
    }

    @ObfuscatedName("rx.ab(B)I")
    public int method7525() {
        return this.field4766 + this.field4765;
    }
}
