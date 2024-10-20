package deob;

@ObfuscatedName("qu")
public class class421 {

    @ObfuscatedName("qu.af")
    public int field4650;

    @ObfuscatedName("qu.an")
    public int field4649;

    @ObfuscatedName("qu.aw")
    public int field4648;

    @ObfuscatedName("qu.ac")
    public int field4651;

    public class421(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class421(int arg0, int arg1, int arg2, int arg3) {
        this.method7371(arg0, arg1);
        this.method7369(arg2, arg3);
    }

    @ObfuscatedName("qu.af(IIB)V")
    public void method7371(int arg0, int arg1) {
        this.field4650 = arg0;
        this.field4649 = arg1;
    }

    @ObfuscatedName("qu.an(IIB)V")
    public void method7369(int arg0, int arg1) {
        this.field4648 = arg0;
        this.field4651 = arg1;
    }

    @ObfuscatedName("qu.aw(III)Z")
    public boolean method7372(int arg0, int arg1) {
        return arg0 >= this.field4650 && arg0 < this.field4650 + this.field4648 && arg1 >= this.field4649 && arg1 < this.field4651 + this.field4649;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("qu.ac(Lqu;Lqu;I)V")
    public void method7388(class421 arg0, class421 arg1) {
        this.method7374(arg0, arg1);
        this.method7375(arg0, arg1);
    }

    @ObfuscatedName("qu.au(Lqu;Lqu;B)V")
    public void method7374(class421 arg0, class421 arg1) {
        arg1.field4650 = this.field4650;
        arg1.field4648 = this.field4648;
        if (this.field4650 < arg0.field4650) {
            arg1.field4648 -= arg0.field4650 - this.field4650;
            arg1.field4650 = arg0.field4650;
        }
        if (arg1.method7378() > arg0.method7378()) {
            arg1.field4648 -= arg1.method7378() - arg0.method7378();
        }
        if (arg1.field4648 < 0) {
            arg1.field4648 = 0;
        }
    }

    @ObfuscatedName("qu.ab(Lqu;Lqu;I)V")
    public void method7375(class421 arg0, class421 arg1) {
        arg1.field4649 = this.field4649;
        arg1.field4651 = this.field4651;
        if (this.field4649 < arg0.field4649) {
            arg1.field4651 -= arg0.field4649 - this.field4649;
            arg1.field4649 = arg0.field4649;
        }
        if (arg1.method7399() > arg0.method7399()) {
            arg1.field4651 -= arg1.method7399() - arg0.method7399();
        }
        if (arg1.field4651 < 0) {
            arg1.field4651 = 0;
        }
    }

    @ObfuscatedName("qu.aq(I)I")
    public int method7378() {
        return this.field4650 + this.field4648;
    }

    @ObfuscatedName("qu.al(I)I")
    public int method7399() {
        return this.field4651 + this.field4649;
    }
}
