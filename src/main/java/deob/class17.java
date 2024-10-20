package deob;

@ObfuscatedName("b")
public class class17 {

    @ObfuscatedName("b.i")
    public byte field312;

    @ObfuscatedName("b.w")
    public int field305;

    @ObfuscatedName("b.a")
    public int field306;

    @ObfuscatedName("b.t")
    public int field304;

    @ObfuscatedName("b.s")
    public int field307;

    @ObfuscatedName("b.r")
    public int field309;

    public class17() {
    }

    public class17(class174 arg0, boolean arg1) {
        this.field312 = arg0.method2930();
        this.field305 = arg0.method2882();
        this.field306 = arg0.method2885();
        this.field304 = arg0.method2885();
        this.field307 = arg0.method2885();
        this.field309 = arg0.method2885();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method3061();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method80(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method3061();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field2399--;
                    if (arg0.method2882() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method2885();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("b.i(Ljava/lang/Integer;I)V")
    public void method80(Integer arg0) {
    }

    @ObfuscatedName("b.w(I)I")
    public int method79() {
        return this.field312 & 0x7;
    }

    @ObfuscatedName("b.a(B)I")
    public int method83() {
        return (this.field312 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("b.t(IB)V")
    public void method81(int arg0) {
        this.field312 &= 0xFFFFFFF8;
        this.field312 = (byte) (this.field312 | arg0 & 0x7);
    }

    @ObfuscatedName("b.s(IB)V")
    public void method84(int arg0) {
        this.field312 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field312 = (byte) (this.field312 | 0x8);
        }
    }
}
