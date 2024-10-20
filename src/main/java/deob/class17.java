package deob;

@ObfuscatedName("x")
public class class17 {

    @ObfuscatedName("x.s")
    public byte field303;

    @ObfuscatedName("x.g")
    public int field298;

    @ObfuscatedName("x.m")
    public int field301;

    @ObfuscatedName("x.h")
    public int field306;

    @ObfuscatedName("x.i")
    public int field300;

    @ObfuscatedName("x.w")
    public int field299;

    public class17() {
    }

    public class17(class185 arg0, boolean arg1) {
        this.field303 = arg0.method3240();
        this.field298 = arg0.method3241();
        this.field301 = arg0.method3292();
        this.field306 = arg0.method3292();
        this.field300 = arg0.method3292();
        this.field299 = arg0.method3292();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method3239();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method98(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method3239();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field2514--;
                    if (arg0.method3241() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method3292();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("x.s(Ljava/lang/Integer;I)V")
    public void method98(Integer arg0) {
    }

    @ObfuscatedName("x.g(I)I")
    public int method99() {
        return this.field303 & 0x7;
    }

    @ObfuscatedName("x.m(B)I")
    public int method111() {
        return (this.field303 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("x.h(IS)V")
    public void method101(int arg0) {
        this.field303 &= 0xFFFFFFF8;
        this.field303 = (byte) (this.field303 | arg0 & 0x7);
    }

    @ObfuscatedName("x.i(II)V")
    public void method97(int arg0) {
        this.field303 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field303 = (byte) (this.field303 | 0x8);
        }
    }
}
