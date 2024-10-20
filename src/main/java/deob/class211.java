package deob;

@ObfuscatedName("hm")
public class class211 {

    @ObfuscatedName("hm.o")
    public byte field3069;

    @ObfuscatedName("hm.l")
    public int field3071;

    @ObfuscatedName("hm.g")
    public int field3068;

    @ObfuscatedName("hm.u")
    public int field3073;

    @ObfuscatedName("hm.q")
    public int field3072;

    @ObfuscatedName("hm.r")
    public int field3070;

    public class211() {
    }

    public class211(class111 arg0, boolean arg1) {
        this.field3069 = arg0.method2220();
        this.field3071 = arg0.method2397();
        this.field3068 = arg0.method2273();
        this.field3073 = arg0.method2273();
        this.field3072 = arg0.method2273();
        this.field3070 = arg0.method2273();
        if (arg1) {
            this.method3637(Statics.method1482(arg0));
        }
    }

    @ObfuscatedName("hm.l(Ljava/lang/Integer;B)V")
    public void method3637(Integer arg0) {
    }

    @ObfuscatedName("hm.g(I)I")
    public int method3638() {
        return this.field3069 & 0x7;
    }

    @ObfuscatedName("hm.u(I)I")
    public int method3626() {
        return (this.field3069 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hm.q(IB)V")
    public void method3627(int arg0) {
        this.field3069 &= 0xFFFFFFF8;
        this.field3069 = (byte) (this.field3069 | arg0 & 0x7);
    }

    @ObfuscatedName("hm.r(II)V")
    public void method3628(int arg0) {
        this.field3069 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3069 = (byte) (this.field3069 | 0x8);
        }
    }
}
