package deob;

@ObfuscatedName("j")
public class class17 {

    @ObfuscatedName("j.d")
    public byte field318;

    @ObfuscatedName("j.k")
    public int field316;

    @ObfuscatedName("j.e")
    public int field310;

    @ObfuscatedName("j.p")
    public int field311;

    @ObfuscatedName("j.q")
    public int field312;

    @ObfuscatedName("j.s")
    public int field313;

    public class17() {
    }

    public class17(class174 arg0, boolean arg1) {
        this.field318 = arg0.method2956();
        this.field316 = arg0.method3035();
        this.field310 = arg0.method2960();
        this.field311 = arg0.method2960();
        this.field312 = arg0.method2960();
        this.field313 = arg0.method2960();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method2955();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method101(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method2955();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field2405--;
                    if (arg0.method3035() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method2960();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("j.d(Ljava/lang/Integer;I)V")
    public void method101(Integer arg0) {
    }

    @ObfuscatedName("j.k(I)I")
    public int method92() {
        return this.field318 & 0x7;
    }

    @ObfuscatedName("j.e(I)I")
    public int method94() {
        return (this.field318 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("j.p(II)V")
    public void method110(int arg0) {
        this.field318 &= 0xFFFFFFF8;
        this.field318 = (byte) (this.field318 | arg0 & 0x7);
    }

    @ObfuscatedName("j.q(II)V")
    public void method96(int arg0) {
        this.field318 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field318 = (byte) (this.field318 | 0x8);
        }
    }
}
