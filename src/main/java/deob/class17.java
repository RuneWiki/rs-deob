package deob;

@ObfuscatedName("r")
public class class17 {

    @ObfuscatedName("r.a")
    public byte field289;

    @ObfuscatedName("r.w")
    public int field293;

    @ObfuscatedName("r.e")
    public int field290;

    @ObfuscatedName("r.k")
    public int field291;

    @ObfuscatedName("r.u")
    public int field295;

    @ObfuscatedName("r.z")
    public int field288;

    public class17() {
    }

    public class17(class185 arg0, boolean arg1) {
        this.field289 = arg0.method3015();
        this.field293 = arg0.method3194();
        this.field290 = arg0.method2967();
        this.field291 = arg0.method2967();
        this.field295 = arg0.method2967();
        this.field288 = arg0.method2967();
        if (arg1) {
            this.method85(Statics.method948(arg0));
        }
    }

    @ObfuscatedName("r.w(Ljava/lang/Integer;B)V")
    public void method85(Integer arg0) {
    }

    @ObfuscatedName("r.e(I)I")
    public int method86() {
        return this.field289 & 0x7;
    }

    @ObfuscatedName("r.k(B)I")
    public int method89() {
        return (this.field289 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("r.u(IB)V")
    public void method88(int arg0) {
        this.field289 &= 0xFFFFFFF8;
        this.field289 = (byte) (this.field289 | arg0 & 0x7);
    }

    @ObfuscatedName("r.z(II)V")
    public void method84(int arg0) {
        this.field289 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field289 = (byte) (this.field289 | 0x8);
        }
    }
}
