package deob;

@ObfuscatedName("c")
public class class17 {

    @ObfuscatedName("c.w")
    public byte field321;

    @ObfuscatedName("c.o")
    public int field317;

    @ObfuscatedName("c.x")
    public int field318;

    @ObfuscatedName("c.k")
    public int field319;

    @ObfuscatedName("c.f")
    public int field323;

    @ObfuscatedName("c.i")
    public int field320;

    public class17() {
    }

    public class17(class177 arg0, boolean arg1) {
        this.field321 = arg0.method2885();
        this.field317 = arg0.method2886();
        this.field318 = arg0.method2904();
        this.field319 = arg0.method2904();
        this.field323 = arg0.method2904();
        this.field320 = arg0.method2904();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method2931();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method85(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method2931();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field2412--;
                    if (arg0.method2886() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method2904();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("c.w(Ljava/lang/Integer;I)V")
    public void method85(Integer arg0) {
    }

    @ObfuscatedName("c.o(I)I")
    public int method84() {
        return this.field321 & 0x7;
    }

    @ObfuscatedName("c.x(B)I")
    public int method87() {
        return (this.field321 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("c.k(II)V")
    public void method91(int arg0) {
        this.field321 &= 0xFFFFFFF8;
        this.field321 = (byte) (this.field321 | arg0 & 0x7);
    }

    @ObfuscatedName("c.f(II)V")
    public void method89(int arg0) {
        this.field321 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field321 = (byte) (this.field321 | 0x8);
        }
    }
}
