package deob;

@ObfuscatedName("e")
public class class5 {

    @ObfuscatedName("e.f")
    public byte field38;

    @ObfuscatedName("e.l")
    public int field30;

    @ObfuscatedName("e.w")
    public int field37;

    @ObfuscatedName("e.s")
    public int field32;

    @ObfuscatedName("e.e")
    public int field33;

    @ObfuscatedName("e.a")
    public int field34;

    public class5() {
    }

    public class5(class185 arg0, boolean arg1) {
        this.field38 = arg0.method3345();
        this.field30 = arg0.method3346();
        this.field37 = arg0.method3432();
        this.field32 = arg0.method3432();
        this.field33 = arg0.method3432();
        this.field34 = arg0.method3432();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method3344();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method37(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method3344();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field2414--;
                    if (arg0.method3346() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method3432();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("e.f(Ljava/lang/Integer;I)V")
    public void method37(Integer arg0) {
    }

    @ObfuscatedName("e.l(I)I")
    public int method38() {
        return this.field38 & 0x7;
    }

    @ObfuscatedName("e.w(B)I")
    public int method39() {
        return (this.field38 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("e.s(II)V")
    public void method36(int arg0) {
        this.field38 &= 0xFFFFFFF8;
        this.field38 = (byte) (this.field38 | arg0 & 0x7);
    }

    @ObfuscatedName("e.e(II)V")
    public void method41(int arg0) {
        this.field38 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field38 = (byte) (this.field38 | 0x8);
        }
    }
}
