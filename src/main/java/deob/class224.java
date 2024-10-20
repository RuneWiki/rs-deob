package deob;

@ObfuscatedName("hs")
public class class224 {

    @ObfuscatedName("hs.k")
    public byte field3220;

    @ObfuscatedName("hs.q")
    public int field3219;

    @ObfuscatedName("hs.f")
    public int field3221;

    @ObfuscatedName("hs.c")
    public int field3222;

    @ObfuscatedName("hs.v")
    public int field3223;

    @ObfuscatedName("hs.j")
    public int field3224;

    public class224() {
    }

    public class224(class123 arg0, boolean arg1) {
        this.field3220 = arg0.method2428();
        this.field3219 = arg0.method2547();
        this.field3221 = arg0.method2432();
        this.field3222 = arg0.method2432();
        this.field3223 = arg0.method2432();
        this.field3224 = arg0.method2432();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method2427();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method3768(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method2427();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field2060--;
                    if (arg0.method2547() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method2432();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("hs.k(Ljava/lang/Integer;I)V")
    public void method3768(Integer arg0) {
    }

    @ObfuscatedName("hs.q(I)I")
    public int method3781() {
        return this.field3220 & 0x7;
    }

    @ObfuscatedName("hs.f(B)I")
    public int method3770() {
        return (this.field3220 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hs.c(II)V")
    public void method3771(int arg0) {
        this.field3220 &= 0xFFFFFFF8;
        this.field3220 = (byte) (this.field3220 | arg0 & 0x7);
    }

    @ObfuscatedName("hs.v(II)V")
    public void method3772(int arg0) {
        this.field3220 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3220 = (byte) (this.field3220 | 0x8);
        }
    }
}
