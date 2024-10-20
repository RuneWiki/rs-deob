package deob;

@ObfuscatedName("qy")
public class class423 {

    @ObfuscatedName("qy.ac")
    public int field4715;

    @ObfuscatedName("qy.ae")
    public int field4710;

    @ObfuscatedName("qy.ag")
    public int field4711;

    @ObfuscatedName("qy.am")
    public int field4713;

    public class423(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class423(int arg0, int arg1, int arg2, int arg3) {
        this.method7269(arg0, arg1);
        this.method7264(arg2, arg3);
    }

    @ObfuscatedName("qy.ac(III)V")
    public void method7269(int arg0, int arg1) {
        this.field4715 = arg0;
        this.field4710 = arg1;
    }

    @ObfuscatedName("qy.ae(IIB)V")
    public void method7264(int arg0, int arg1) {
        this.field4711 = arg0;
        this.field4713 = arg1;
    }

    @ObfuscatedName("qy.ag(III)Z")
    public boolean method7265(int arg0, int arg1) {
        return arg0 >= this.field4715 && arg0 < this.field4715 + this.field4711 && arg1 >= this.field4710 && arg1 < this.field4713 + this.field4710;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("qy.am(Lqy;Lqy;I)V")
    public void method7266(class423 arg0, class423 arg1) {
        this.method7268(arg0, arg1);
        this.method7270(arg0, arg1);
    }

    @ObfuscatedName("qy.ax(Lqy;Lqy;I)V")
    public void method7268(class423 arg0, class423 arg1) {
        arg1.field4715 = this.field4715;
        arg1.field4711 = this.field4711;
        if (this.field4715 < arg0.field4715) {
            arg1.field4711 -= arg0.field4715 - this.field4715;
            arg1.field4715 = arg0.field4715;
        }
        if (arg1.method7289() > arg0.method7289()) {
            arg1.field4711 -= arg1.method7289() - arg0.method7289();
        }
        if (arg1.field4711 < 0) {
            arg1.field4711 = 0;
        }
    }

    @ObfuscatedName("qy.aq(Lqy;Lqy;I)V")
    public void method7270(class423 arg0, class423 arg1) {
        arg1.field4710 = this.field4710;
        arg1.field4713 = this.field4713;
        if (this.field4710 < arg0.field4710) {
            arg1.field4713 -= arg0.field4710 - this.field4710;
            arg1.field4710 = arg0.field4710;
        }
        if (arg1.method7263() > arg0.method7263()) {
            arg1.field4713 -= arg1.method7263() - arg0.method7263();
        }
        if (arg1.field4713 < 0) {
            arg1.field4713 = 0;
        }
    }

    @ObfuscatedName("qy.af(B)I")
    public int method7289() {
        return this.field4715 + this.field4711;
    }

    @ObfuscatedName("qy.at(B)I")
    public int method7263() {
        return this.field4713 + this.field4710;
    }
}
