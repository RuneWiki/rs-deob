package deob;

@ObfuscatedName("hd")
public class class211 {

    @ObfuscatedName("hd.p")
    public byte field3074;

    @ObfuscatedName("hd.k")
    public int field3072;

    @ObfuscatedName("hd.e")
    public int field3071;

    @ObfuscatedName("hd.f")
    public int field3073;

    @ObfuscatedName("hd.w")
    public int field3075;

    @ObfuscatedName("hd.t")
    public int field3076;

    public class211() {
    }

    public class211(class111 arg0, boolean arg1) {
        this.field3074 = arg0.method2176();
        this.field3072 = arg0.method2177();
        this.field3071 = arg0.method2350();
        this.field3073 = arg0.method2350();
        this.field3075 = arg0.method2350();
        this.field3076 = arg0.method2350();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method2314();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method3615(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method2314();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field1885--;
                    if (arg0.method2177() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method2350();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("hd.p(Ljava/lang/Integer;I)V")
    public void method3615(Integer arg0) {
    }

    @ObfuscatedName("hd.k(I)I")
    public int method3602() {
        return this.field3074 & 0x7;
    }

    @ObfuscatedName("hd.e(I)I")
    public int method3610() {
        return (this.field3074 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hd.f(II)V")
    public void method3604(int arg0) {
        this.field3074 &= 0xFFFFFFF8;
        this.field3074 = (byte) (this.field3074 | arg0 & 0x7);
    }

    @ObfuscatedName("hd.w(IB)V")
    public void method3605(int arg0) {
        this.field3074 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3074 = (byte) (this.field3074 | 0x8);
        }
    }
}
