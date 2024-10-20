package deob;

@ObfuscatedName("rv")
public class class458 {

    @ObfuscatedName("rv.at")
    public int field4756;

    @ObfuscatedName("rv.ah")
    public int field4753;

    @ObfuscatedName("rv.ar")
    public int field4755;

    @ObfuscatedName("rv.ao")
    public int field4757;

    public class458(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class458(int arg0, int arg1, int arg2, int arg3) {
        this.method7600(arg0, arg1);
        this.method7601(arg2, arg3);
    }

    @ObfuscatedName("rv.at(IIB)V")
    public void method7600(int arg0, int arg1) {
        this.field4756 = arg0;
        this.field4753 = arg1;
    }

    @ObfuscatedName("rv.ah(III)V")
    public void method7601(int arg0, int arg1) {
        this.field4755 = arg0;
        this.field4757 = arg1;
    }

    @ObfuscatedName("rv.ar(III)Z")
    public boolean method7602(int arg0, int arg1) {
        return arg0 >= this.field4756 && arg0 < this.field4756 + this.field4755 && arg1 >= this.field4753 && arg1 < this.field4757 + this.field4753;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("rv.ao(Lrv;Lrv;I)V")
    public void method7604(class458 arg0, class458 arg1) {
        this.method7605(arg0, arg1);
        this.method7606(arg0, arg1);
    }

    @ObfuscatedName("rv.ab(Lrv;Lrv;I)V")
    public void method7605(class458 arg0, class458 arg1) {
        arg1.field4756 = this.field4756;
        arg1.field4755 = this.field4755;
        if (this.field4756 < arg0.field4756) {
            arg1.field4755 -= arg0.field4756 - this.field4756;
            arg1.field4756 = arg0.field4756;
        }
        if (arg1.method7618() > arg0.method7618()) {
            arg1.field4755 -= arg1.method7618() - arg0.method7618();
        }
        if (arg1.field4755 < 0) {
            arg1.field4755 = 0;
        }
    }

    @ObfuscatedName("rv.au(Lrv;Lrv;I)V")
    public void method7606(class458 arg0, class458 arg1) {
        arg1.field4753 = this.field4753;
        arg1.field4757 = this.field4757;
        if (this.field4753 < arg0.field4753) {
            arg1.field4757 -= arg0.field4753 - this.field4753;
            arg1.field4753 = arg0.field4753;
        }
        if (arg1.method7608() > arg0.method7608()) {
            arg1.field4757 -= arg1.method7608() - arg0.method7608();
        }
        if (arg1.field4757 < 0) {
            arg1.field4757 = 0;
        }
    }

    @ObfuscatedName("rv.aa(I)I")
    public int method7618() {
        return this.field4756 + this.field4755;
    }

    @ObfuscatedName("rv.ac(I)I")
    public int method7608() {
        return this.field4757 + this.field4753;
    }
}
