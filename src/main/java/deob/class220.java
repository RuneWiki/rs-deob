package deob;

@ObfuscatedName("hz")
public class class220 {

    @ObfuscatedName("hz.j")
    public byte field3167;

    @ObfuscatedName("hz.l")
    public int field3166;

    @ObfuscatedName("hz.a")
    public int field3170;

    @ObfuscatedName("hz.i")
    public int field3168;

    @ObfuscatedName("hz.f")
    public int field3169;

    @ObfuscatedName("hz.m")
    public int field3165;

    public class220() {
    }

    public class220(class119 arg0, boolean arg1) {
        this.field3167 = arg0.method2317();
        this.field3166 = arg0.method2318();
        this.field3170 = arg0.method2321();
        this.field3168 = arg0.method2321();
        this.field3169 = arg0.method2321();
        this.field3165 = arg0.method2321();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method2316();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method3683(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method2316();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field1999--;
                    if (arg0.method2318() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method2321();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("hz.j(Ljava/lang/Integer;I)V")
    public void method3683(Integer arg0) {
    }

    @ObfuscatedName("hz.l(I)I")
    public int method3690() {
        return this.field3167 & 0x7;
    }

    @ObfuscatedName("hz.a(I)I")
    public int method3684() {
        return (this.field3167 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hz.i(II)V")
    public void method3686(int arg0) {
        this.field3167 &= 0xFFFFFFF8;
        this.field3167 = (byte) (this.field3167 | arg0 & 0x7);
    }

    @ObfuscatedName("hz.f(II)V")
    public void method3687(int arg0) {
        this.field3167 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3167 = (byte) (this.field3167 | 0x8);
        }
    }
}
