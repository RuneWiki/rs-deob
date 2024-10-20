package deob;

@ObfuscatedName("rb")
public class class446 {

    @ObfuscatedName("rb.au")
    public int field4720;

    @ObfuscatedName("rb.ae")
    public int field4718;

    @ObfuscatedName("rb.ao")
    public int field4719;

    @ObfuscatedName("rb.at")
    public int field4717;

    public class446(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class446(int arg0, int arg1, int arg2, int arg3) {
        this.method7446(arg0, arg1);
        this.method7447(arg2, arg3);
    }

    @ObfuscatedName("rb.au(IIB)V")
    public void method7446(int arg0, int arg1) {
        this.field4720 = arg0;
        this.field4718 = arg1;
    }

    @ObfuscatedName("rb.ae(IIB)V")
    public void method7447(int arg0, int arg1) {
        this.field4719 = arg0;
        this.field4717 = arg1;
    }

    @ObfuscatedName("rb.ao(IIB)Z")
    public boolean method7448(int arg0, int arg1) {
        return arg0 >= this.field4720 && arg0 < this.field4720 + this.field4719 && arg1 >= this.field4718 && arg1 < this.field4718 + this.field4717;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("rb.at(Lrb;Lrb;I)V")
    public void method7449(class446 arg0, class446 arg1) {
        this.method7450(arg0, arg1);
        this.method7451(arg0, arg1);
    }

    @ObfuscatedName("rb.ac(Lrb;Lrb;I)V")
    public void method7450(class446 arg0, class446 arg1) {
        arg1.field4720 = this.field4720;
        arg1.field4719 = this.field4719;
        if (this.field4720 < arg0.field4720) {
            arg1.field4719 -= arg0.field4720 - this.field4720;
            arg1.field4720 = arg0.field4720;
        }
        if (arg1.method7452() > arg0.method7452()) {
            arg1.field4719 -= arg1.method7452() - arg0.method7452();
        }
        if (arg1.field4719 < 0) {
            arg1.field4719 = 0;
        }
    }

    @ObfuscatedName("rb.ai(Lrb;Lrb;B)V")
    public void method7451(class446 arg0, class446 arg1) {
        arg1.field4718 = this.field4718;
        arg1.field4717 = this.field4717;
        if (this.field4718 < arg0.field4718) {
            arg1.field4717 -= arg0.field4718 - this.field4718;
            arg1.field4718 = arg0.field4718;
        }
        if (arg1.method7477() > arg0.method7477()) {
            arg1.field4717 -= arg1.method7477() - arg0.method7477();
        }
        if (arg1.field4717 < 0) {
            arg1.field4717 = 0;
        }
    }

    @ObfuscatedName("rb.az(B)I")
    public int method7452() {
        return this.field4720 + this.field4719;
    }

    @ObfuscatedName("rb.ap(I)I")
    public int method7477() {
        return this.field4718 + this.field4717;
    }
}
