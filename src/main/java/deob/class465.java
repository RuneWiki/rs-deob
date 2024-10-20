package deob;

@ObfuscatedName("rc")
public class class465 {

    @ObfuscatedName("rc.aq")
    public int field4827;

    @ObfuscatedName("rc.aw")
    public int field4825;

    @ObfuscatedName("rc.al")
    public int field4826;

    @ObfuscatedName("rc.ai")
    public int field4824;

    public class465(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class465(int arg0, int arg1, int arg2, int arg3) {
        this.method7747(arg0, arg1);
        this.method7744(arg2, arg3);
    }

    @ObfuscatedName("rc.aq(III)V")
    public void method7747(int arg0, int arg1) {
        this.field4827 = arg0;
        this.field4825 = arg1;
    }

    @ObfuscatedName("rc.aw(III)V")
    public void method7744(int arg0, int arg1) {
        this.field4826 = arg0;
        this.field4824 = arg1;
    }

    @ObfuscatedName("rc.al(III)Z")
    public boolean method7745(int arg0, int arg1) {
        return arg0 >= this.field4827 && arg0 < this.field4827 + this.field4826 && arg1 >= this.field4825 && arg1 < this.field4825 + this.field4824;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("rc.ai(Lrc;Lrc;I)V")
    public void method7743(class465 arg0, class465 arg1) {
        this.method7748(arg0, arg1);
        this.method7749(arg0, arg1);
    }

    @ObfuscatedName("rc.ar(Lrc;Lrc;I)V")
    public void method7748(class465 arg0, class465 arg1) {
        arg1.field4827 = this.field4827;
        arg1.field4826 = this.field4826;
        if (this.field4827 < arg0.field4827) {
            arg1.field4826 -= arg0.field4827 - this.field4827;
            arg1.field4827 = arg0.field4827;
        }
        if (arg1.method7750() > arg0.method7750()) {
            arg1.field4826 -= arg1.method7750() - arg0.method7750();
        }
        if (arg1.field4826 < 0) {
            arg1.field4826 = 0;
        }
    }

    @ObfuscatedName("rc.as(Lrc;Lrc;I)V")
    public void method7749(class465 arg0, class465 arg1) {
        arg1.field4825 = this.field4825;
        arg1.field4824 = this.field4824;
        if (this.field4825 < arg0.field4825) {
            arg1.field4824 -= arg0.field4825 - this.field4825;
            arg1.field4825 = arg0.field4825;
        }
        if (arg1.method7751() > arg0.method7751()) {
            arg1.field4824 -= arg1.method7751() - arg0.method7751();
        }
        if (arg1.field4824 < 0) {
            arg1.field4824 = 0;
        }
    }

    @ObfuscatedName("rc.aa(I)I")
    public int method7750() {
        return this.field4827 + this.field4826;
    }

    @ObfuscatedName("rc.az(I)I")
    public int method7751() {
        return this.field4825 + this.field4824;
    }
}
