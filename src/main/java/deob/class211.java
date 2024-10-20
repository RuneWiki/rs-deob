package deob;

@ObfuscatedName("hf")
public class class211 {

    @ObfuscatedName("hf.n")
    public byte field3077;

    @ObfuscatedName("hf.g")
    public int field3072;

    @ObfuscatedName("hf.a")
    public int field3073;

    @ObfuscatedName("hf.m")
    public int field3074;

    @ObfuscatedName("hf.s")
    public int field3075;

    @ObfuscatedName("hf.j")
    public int field3076;

    public class211() {
    }

    public class211(class111 arg0, boolean arg1) {
        this.field3077 = arg0.method2217();
        this.field3072 = arg0.method2395();
        this.field3073 = arg0.method2366();
        this.field3074 = arg0.method2366();
        this.field3075 = arg0.method2366();
        this.field3076 = arg0.method2366();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method2211();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method3635(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method2211();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field1896--;
                    if (arg0.method2395() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method2366();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("hf.n(Ljava/lang/Integer;I)V")
    public void method3635(Integer arg0) {
    }

    @ObfuscatedName("hf.g(I)I")
    public int method3618() {
        return this.field3077 & 0x7;
    }

    @ObfuscatedName("hf.a(B)I")
    public int method3638() {
        return (this.field3077 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hf.m(IB)V")
    public void method3620(int arg0) {
        this.field3077 &= 0xFFFFFFF8;
        this.field3077 = (byte) (this.field3077 | arg0 & 0x7);
    }

    @ObfuscatedName("hf.s(II)V")
    public void method3640(int arg0) {
        this.field3077 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3077 = (byte) (this.field3077 | 0x8);
        }
    }
}
