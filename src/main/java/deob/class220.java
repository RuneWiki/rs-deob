package deob;

@ObfuscatedName("hs")
public class class220 {

    @ObfuscatedName("hs.j")
    public byte field3150;

    @ObfuscatedName("hs.m")
    public int field3151;

    @ObfuscatedName("hs.f")
    public int field3152;

    @ObfuscatedName("hs.l")
    public int field3153;

    @ObfuscatedName("hs.u")
    public int field3154;

    @ObfuscatedName("hs.a")
    public int field3155;

    public class220() {
    }

    public class220(class119 arg0, boolean arg1) {
        this.field3150 = arg0.method2373();
        this.field3151 = arg0.method2374();
        this.field3152 = arg0.method2377();
        this.field3153 = arg0.method2377();
        this.field3154 = arg0.method2377();
        this.field3155 = arg0.method2377();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method2372();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method3777(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method2372();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field1982--;
                    if (arg0.method2374() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method2377();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("hs.j(Ljava/lang/Integer;I)V")
    public void method3777(Integer arg0) {
    }

    @ObfuscatedName("hs.m(I)I")
    public int method3778() {
        return this.field3150 & 0x7;
    }

    @ObfuscatedName("hs.f(I)I")
    public int method3779() {
        return (this.field3150 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hs.l(IB)V")
    public void method3780(int arg0) {
        this.field3150 &= 0xFFFFFFF8;
        this.field3150 = (byte) (this.field3150 | arg0 & 0x7);
    }

    @ObfuscatedName("hs.u(II)V")
    public void method3776(int arg0) {
        this.field3150 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3150 = (byte) (this.field3150 | 0x8);
        }
    }
}
