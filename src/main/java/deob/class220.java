package deob;

@ObfuscatedName("hd")
public class class220 {

    @ObfuscatedName("hd.n")
    public byte field3148;

    @ObfuscatedName("hd.d")
    public int field3146;

    @ObfuscatedName("hd.s")
    public int field3147;

    @ObfuscatedName("hd.q")
    public int field3149;

    @ObfuscatedName("hd.j")
    public int field3150;

    @ObfuscatedName("hd.k")
    public int field3151;

    public class220() {
    }

    public class220(class119 arg0, boolean arg1) {
        this.field3148 = arg0.method2330();
        this.field3146 = arg0.method2377();
        this.field3147 = arg0.method2343();
        this.field3149 = arg0.method2343();
        this.field3150 = arg0.method2343();
        this.field3151 = arg0.method2343();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method2338();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method3736(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method2338();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field1977--;
                    if (arg0.method2377() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method2343();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("hd.n(Ljava/lang/Integer;B)V")
    public void method3736(Integer arg0) {
    }

    @ObfuscatedName("hd.d(I)I")
    public int method3746() {
        return this.field3148 & 0x7;
    }

    @ObfuscatedName("hd.s(I)I")
    public int method3738() {
        return (this.field3148 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hd.q(II)V")
    public void method3743(int arg0) {
        this.field3148 &= 0xFFFFFFF8;
        this.field3148 = (byte) (this.field3148 | arg0 & 0x7);
    }

    @ObfuscatedName("hd.j(II)V")
    public void method3740(int arg0) {
        this.field3148 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3148 = (byte) (this.field3148 | 0x8);
        }
    }
}
