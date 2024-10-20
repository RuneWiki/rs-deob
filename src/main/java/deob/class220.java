package deob;

@ObfuscatedName("hm")
public class class220 {

    @ObfuscatedName("hm.m")
    public byte field3147;

    @ObfuscatedName("hm.l")
    public int field3145;

    @ObfuscatedName("hm.y")
    public int field3149;

    @ObfuscatedName("hm.u")
    public int field3146;

    @ObfuscatedName("hm.k")
    public int field3148;

    @ObfuscatedName("hm.j")
    public int field3144;

    public class220() {
    }

    public class220(class119 arg0, boolean arg1) {
        this.field3147 = arg0.method2382();
        this.field3145 = arg0.method2541();
        this.field3149 = arg0.method2386();
        this.field3146 = arg0.method2386();
        this.field3148 = arg0.method2386();
        this.field3144 = arg0.method2386();
        if (arg1) {
            this.method3786(Statics.method12(arg0));
        }
    }

    @ObfuscatedName("hm.l(Ljava/lang/Integer;I)V")
    public void method3786(Integer arg0) {
    }

    @ObfuscatedName("hm.y(I)I")
    public int method3787() {
        return this.field3147 & 0x7;
    }

    @ObfuscatedName("hm.u(I)I")
    public int method3788() {
        return (this.field3147 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hm.k(II)V")
    public void method3789(int arg0) {
        this.field3147 &= 0xFFFFFFF8;
        this.field3147 = (byte) (this.field3147 | arg0 & 0x7);
    }

    @ObfuscatedName("hm.j(IB)V")
    public void method3790(int arg0) {
        this.field3147 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3147 = (byte) (this.field3147 | 0x8);
        }
    }
}
