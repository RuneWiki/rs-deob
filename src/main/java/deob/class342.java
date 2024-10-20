package deob;

@ObfuscatedName("mz")
public class class342 {

    @ObfuscatedName("mz.h")
    public byte field4273;

    @ObfuscatedName("mz.e")
    public int field4270;

    @ObfuscatedName("mz.v")
    public int field4271;

    @ObfuscatedName("mz.x")
    public int field4272;

    @ObfuscatedName("mz.m")
    public int field4274;

    @ObfuscatedName("mz.q")
    public int field4269;

    public class342() {
    }

    public class342(class467 arg0, boolean arg1) {
        this.field4273 = arg0.method7793();
        this.field4270 = arg0.method7794();
        this.field4271 = arg0.method7946();
        this.field4272 = arg0.method7946();
        this.field4274 = arg0.method7946();
        this.field4269 = arg0.method7946();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method7792();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method5999(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method7792();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field4915--;
                    if (arg0.method7794() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method7946();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("mz.h(Ljava/lang/Integer;I)V")
    public void method5999(Integer arg0) {
    }

    @ObfuscatedName("mz.e(B)I")
    public int method6000() {
        return this.field4273 & 0x7;
    }

    @ObfuscatedName("mz.v(I)I")
    public int method6006() {
        return (this.field4273 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("mz.x(IB)V")
    public void method6010(int arg0) {
        this.field4273 &= 0xFFFFFFF8;
        this.field4273 = (byte) (this.field4273 | arg0 & 0x7);
    }

    @ObfuscatedName("mz.m(II)V")
    public void method6002(int arg0) {
        this.field4273 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field4273 = (byte) (this.field4273 | 0x8);
        }
    }
}
