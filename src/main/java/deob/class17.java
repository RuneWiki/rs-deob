package deob;

@ObfuscatedName("b")
public class class17 {

    @ObfuscatedName("b.c")
    public byte field286;

    @ObfuscatedName("b.i")
    public int field285;

    @ObfuscatedName("b.o")
    public int field291;

    @ObfuscatedName("b.j")
    public int field287;

    @ObfuscatedName("b.k")
    public int field288;

    @ObfuscatedName("b.x")
    public int field284;

    public class17() {
    }

    public class17(class195 arg0, boolean arg1) {
        this.field286 = arg0.method3226();
        this.field285 = arg0.method3218();
        this.field291 = arg0.method3230();
        this.field287 = arg0.method3230();
        this.field288 = arg0.method3230();
        this.field284 = arg0.method3230();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method3429();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method100(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method3429();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field2566--;
                    if (arg0.method3218() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method3230();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("b.c(Ljava/lang/Integer;B)V")
    public void method100(Integer arg0) {
    }

    @ObfuscatedName("b.i(I)I")
    public int method102() {
        return this.field286 & 0x7;
    }

    @ObfuscatedName("b.o(B)I")
    public int method103() {
        return (this.field286 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("b.j(IB)V")
    public void method104(int arg0) {
        this.field286 &= 0xFFFFFFF8;
        this.field286 = (byte) (this.field286 | arg0 & 0x7);
    }

    @ObfuscatedName("b.k(II)V")
    public void method105(int arg0) {
        this.field286 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field286 = (byte) (this.field286 | 0x8);
        }
    }
}
