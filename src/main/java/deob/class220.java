package deob;

@ObfuscatedName("hp")
public class class220 {

    @ObfuscatedName("hp.a")
    public byte field3169;

    @ObfuscatedName("hp.r")
    public int field3164;

    @ObfuscatedName("hp.f")
    public int field3165;

    @ObfuscatedName("hp.s")
    public int field3163;

    @ObfuscatedName("hp.y")
    public int field3166;

    @ObfuscatedName("hp.e")
    public int field3168;

    public class220() {
    }

    public class220(class119 arg0, boolean arg1) {
        this.field3169 = arg0.method2540();
        this.field3164 = arg0.method2347();
        this.field3165 = arg0.method2350();
        this.field3163 = arg0.method2350();
        this.field3166 = arg0.method2350();
        this.field3168 = arg0.method2350();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method2412();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method3758(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method2412();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field1980--;
                    if (arg0.method2347() != 0) {
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

    @ObfuscatedName("hp.a(Ljava/lang/Integer;B)V")
    public void method3758(Integer arg0) {
    }

    @ObfuscatedName("hp.r(I)I")
    public int method3743() {
        return this.field3169 & 0x7;
    }

    @ObfuscatedName("hp.f(I)I")
    public int method3744() {
        return (this.field3169 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hp.s(II)V")
    public void method3745(int arg0) {
        this.field3169 &= 0xFFFFFFF8;
        this.field3169 = (byte) (this.field3169 | arg0 & 0x7);
    }

    @ObfuscatedName("hp.y(II)V")
    public void method3746(int arg0) {
        this.field3169 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3169 = (byte) (this.field3169 | 0x8);
        }
    }
}
