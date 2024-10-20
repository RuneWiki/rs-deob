package deob;

@ObfuscatedName("ht")
public class class211 {

    @ObfuscatedName("ht.t")
    public byte field3072;

    @ObfuscatedName("ht.b")
    public int field3067;

    @ObfuscatedName("ht.p")
    public int field3068;

    @ObfuscatedName("ht.e")
    public int field3071;

    @ObfuscatedName("ht.i")
    public int field3069;

    @ObfuscatedName("ht.o")
    public int field3066;

    public class211() {
    }

    public class211(class111 arg0, boolean arg1) {
        this.field3072 = arg0.method2358();
        this.field3067 = arg0.method2255();
        this.field3068 = arg0.method2177();
        this.field3071 = arg0.method2177();
        this.field3069 = arg0.method2177();
        this.field3066 = arg0.method2177();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method2172();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method3581(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method2172();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field1867--;
                    if (arg0.method2255() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method2177();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("ht.t(Ljava/lang/Integer;I)V")
    public void method3581(Integer arg0) {
    }

    @ObfuscatedName("ht.b(I)I")
    public int method3582() {
        return this.field3072 & 0x7;
    }

    @ObfuscatedName("ht.p(I)I")
    public int method3591() {
        return (this.field3072 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("ht.e(IB)V")
    public void method3585(int arg0) {
        this.field3072 &= 0xFFFFFFF8;
        this.field3072 = (byte) (this.field3072 | arg0 & 0x7);
    }

    @ObfuscatedName("ht.i(IB)V")
    public void method3580(int arg0) {
        this.field3072 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3072 = (byte) (this.field3072 | 0x8);
        }
    }
}
