package deob;

@ObfuscatedName("hk")
public class class224 {

    @ObfuscatedName("hk.f")
    public byte field3222;

    @ObfuscatedName("hk.e")
    public int field3218;

    @ObfuscatedName("hk.n")
    public int field3217;

    @ObfuscatedName("hk.t")
    public int field3221;

    @ObfuscatedName("hk.v")
    public int field3220;

    @ObfuscatedName("hk.b")
    public int field3219;

    public class224() {
    }

    public class224(class123 arg0, boolean arg1) {
        this.field3222 = arg0.method2400();
        this.field3218 = arg0.method2401();
        this.field3217 = arg0.method2404();
        this.field3221 = arg0.method2404();
        this.field3220 = arg0.method2404();
        this.field3219 = arg0.method2404();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method2522();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method3818(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method2522();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field2052--;
                    if (arg0.method2401() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method2404();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("hk.f(Ljava/lang/Integer;I)V")
    public void method3818(Integer arg0) {
    }

    @ObfuscatedName("hk.e(I)I")
    public int method3819() {
        return this.field3222 & 0x7;
    }

    @ObfuscatedName("hk.n(S)I")
    public int method3828() {
        return (this.field3222 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hk.t(II)V")
    public void method3821(int arg0) {
        this.field3222 &= 0xFFFFFFF8;
        this.field3222 = (byte) (this.field3222 | arg0 & 0x7);
    }

    @ObfuscatedName("hk.v(IB)V")
    public void method3823(int arg0) {
        this.field3222 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3222 = (byte) (this.field3222 | 0x8);
        }
    }
}
