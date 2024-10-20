package deob;

@ObfuscatedName("lo")
public class class325 {

    @ObfuscatedName("lo.s")
    public byte field4073;

    @ObfuscatedName("lo.h")
    public int field4072;

    @ObfuscatedName("lo.w")
    public int field4074;

    @ObfuscatedName("lo.v")
    public int field4075;

    @ObfuscatedName("lo.c")
    public int field4076;

    @ObfuscatedName("lo.q")
    public int field4077;

    public class325() {
    }

    public class325(class444 arg0, boolean arg1) {
        this.field4073 = arg0.method6930();
        this.field4072 = arg0.method7120();
        this.field4074 = arg0.method6934();
        this.field4075 = arg0.method6934();
        this.field4076 = arg0.method6934();
        this.field4077 = arg0.method6934();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method6929();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method5349(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method6929();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field4708--;
                    if (arg0.method7120() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method6934();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("lo.s(Ljava/lang/Integer;I)V")
    public void method5349(Integer arg0) {
    }

    @ObfuscatedName("lo.h(B)I")
    public int method5350() {
        return this.field4073 & 0x7;
    }

    @ObfuscatedName("lo.w(I)I")
    public int method5364() {
        return (this.field4073 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("lo.v(II)V")
    public void method5352(int arg0) {
        this.field4073 &= 0xFFFFFFF8;
        this.field4073 = (byte) (this.field4073 | arg0 & 0x7);
    }

    @ObfuscatedName("lo.c(IB)V")
    public void method5359(int arg0) {
        this.field4073 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field4073 = (byte) (this.field4073 | 0x8);
        }
    }
}
