package deob;

@ObfuscatedName("kp")
public class class299 {

    @ObfuscatedName("kp.l")
    public byte field3762;

    @ObfuscatedName("kp.q")
    public int field3765;

    @ObfuscatedName("kp.f")
    public int field3764;

    @ObfuscatedName("kp.j")
    public int field3763;

    @ObfuscatedName("kp.m")
    public int field3766;

    @ObfuscatedName("kp.k")
    public int field3767;

    public class299() {
    }

    public class299(class401 arg0, boolean arg1) {
        this.field3762 = arg0.method6273();
        this.field3765 = arg0.method6284();
        this.field3764 = arg0.method6277();
        this.field3763 = arg0.method6277();
        this.field3766 = arg0.method6277();
        this.field3767 = arg0.method6277();
        if (arg1) {
            this.method4930(Statics.method4283(arg0));
        }
    }

    @ObfuscatedName("kp.q(Ljava/lang/Integer;I)V")
    public void method4930(Integer arg0) {
    }

    @ObfuscatedName("kp.f(I)I")
    public int method4929() {
        return this.field3762 & 0x7;
    }

    @ObfuscatedName("kp.j(I)I")
    public int method4946() {
        return (this.field3762 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("kp.m(II)V")
    public void method4933(int arg0) {
        this.field3762 &= 0xFFFFFFF8;
        this.field3762 = (byte) (this.field3762 | arg0 & 0x7);
    }

    @ObfuscatedName("kp.k(IB)V")
    public void method4931(int arg0) {
        this.field3762 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3762 = (byte) (this.field3762 | 0x8);
        }
    }
}
