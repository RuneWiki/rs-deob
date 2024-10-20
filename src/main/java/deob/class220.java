package deob;

@ObfuscatedName("hy")
public class class220 {

    @ObfuscatedName("hy.v")
    public byte field3165;

    @ObfuscatedName("hy.f")
    public int field3163;

    @ObfuscatedName("hy.i")
    public int field3162;

    @ObfuscatedName("hy.d")
    public int field3164;

    @ObfuscatedName("hy.o")
    public int field3161;

    @ObfuscatedName("hy.c")
    public int field3166;

    public class220() {
    }

    public class220(class119 arg0, boolean arg1) {
        this.field3165 = arg0.method2350();
        this.field3163 = arg0.method2334();
        this.field3162 = arg0.method2354();
        this.field3164 = arg0.method2354();
        this.field3161 = arg0.method2354();
        this.field3166 = arg0.method2354();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method2400();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method3737(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method2400();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field1984--;
                    if (arg0.method2334() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method2354();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("hy.v(Ljava/lang/Integer;I)V")
    public void method3737(Integer arg0) {
    }

    @ObfuscatedName("hy.f(I)I")
    public int method3731() {
        return this.field3165 & 0x7;
    }

    @ObfuscatedName("hy.i(I)I")
    public int method3732() {
        return (this.field3165 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hy.d(II)V")
    public void method3733(int arg0) {
        this.field3165 &= 0xFFFFFFF8;
        this.field3165 = (byte) (this.field3165 | arg0 & 0x7);
    }

    @ObfuscatedName("hy.o(II)V")
    public void method3742(int arg0) {
        this.field3165 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3165 = (byte) (this.field3165 | 0x8);
        }
    }
}
