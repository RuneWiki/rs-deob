package deob;

@ObfuscatedName("z")
public class class17 {

    @ObfuscatedName("z.i")
    public byte field317;

    @ObfuscatedName("z.j")
    public int field311;

    @ObfuscatedName("z.a")
    public int field309;

    @ObfuscatedName("z.r")
    public int field310;

    @ObfuscatedName("z.o")
    public int field314;

    @ObfuscatedName("z.n")
    public int field312;

    public class17() {
    }

    public class17(class175 arg0, boolean arg1) {
        this.field317 = arg0.method3172();
        this.field311 = arg0.method2995();
        this.field309 = arg0.method2998();
        this.field310 = arg0.method2998();
        this.field314 = arg0.method2998();
        this.field312 = arg0.method2998();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method2999();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method98(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method2999();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field2395--;
                    if (arg0.method2995() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method2998();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("z.i(Ljava/lang/Integer;I)V")
    public void method98(Integer arg0) {
    }

    @ObfuscatedName("z.j(I)I")
    public int method105() {
        return this.field317 & 0x7;
    }

    @ObfuscatedName("z.a(B)I")
    public int method101() {
        return (this.field317 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("z.r(IB)V")
    public void method114(int arg0) {
        this.field317 &= 0xFFFFFFF8;
        this.field317 = (byte) (this.field317 | arg0 & 0x7);
    }

    @ObfuscatedName("z.o(II)V")
    public void method102(int arg0) {
        this.field317 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field317 = (byte) (this.field317 | 0x8);
        }
    }
}
