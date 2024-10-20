package deob;

@ObfuscatedName("hg")
public class class220 {

    @ObfuscatedName("hg.h")
    public byte field3151;

    @ObfuscatedName("hg.m")
    public int field3147;

    @ObfuscatedName("hg.i")
    public int field3148;

    @ObfuscatedName("hg.q")
    public int field3146;

    @ObfuscatedName("hg.p")
    public int field3150;

    @ObfuscatedName("hg.c")
    public int field3149;

    public class220() {
    }

    public class220(class119 arg0, boolean arg1) {
        this.field3151 = arg0.method2425();
        this.field3147 = arg0.method2322();
        this.field3148 = arg0.method2324();
        this.field3146 = arg0.method2324();
        this.field3150 = arg0.method2324();
        this.field3149 = arg0.method2324();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method2320();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method3700(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method2320();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field1988--;
                    if (arg0.method2322() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method2324();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("hg.h(Ljava/lang/Integer;B)V")
    public void method3700(Integer arg0) {
    }

    @ObfuscatedName("hg.m(B)I")
    public int method3701() {
        return this.field3151 & 0x7;
    }

    @ObfuscatedName("hg.i(I)I")
    public int method3702() {
        return (this.field3151 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hg.q(II)V")
    public void method3699(int arg0) {
        this.field3151 &= 0xFFFFFFF8;
        this.field3151 = (byte) (this.field3151 | arg0 & 0x7);
    }

    @ObfuscatedName("hg.p(II)V")
    public void method3710(int arg0) {
        this.field3151 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3151 = (byte) (this.field3151 | 0x8);
        }
    }
}
