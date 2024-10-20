package deob;

@ObfuscatedName("d")
public class class17 {

    @ObfuscatedName("d.p")
    public byte field291;

    @ObfuscatedName("d.i")
    public int field287;

    @ObfuscatedName("d.w")
    public int field288;

    @ObfuscatedName("d.s")
    public int field292;

    @ObfuscatedName("d.j")
    public int field290;

    @ObfuscatedName("d.a")
    public int field286;

    public class17() {
    }

    public class17(class185 arg0, boolean arg1) {
        this.field291 = arg0.method3123();
        this.field287 = arg0.method3124();
        this.field288 = arg0.method3127();
        this.field292 = arg0.method3127();
        this.field290 = arg0.method3127();
        this.field286 = arg0.method3127();
        if (arg1) {
            this.method104(method982(arg0));
        }
    }

    @ObfuscatedName("be.p(Lgj;I)Ljava/lang/Integer;")
    public static Integer method982(class185 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method3197();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method3197();
                if (var4 == 255) {
                    break;
                }
                arg0.field2488--;
                if (arg0.method3124() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method3127();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("d.i(Ljava/lang/Integer;I)V")
    public void method104(Integer arg0) {
    }

    @ObfuscatedName("d.w(I)I")
    public int method105() {
        return this.field291 & 0x7;
    }

    @ObfuscatedName("d.s(B)I")
    public int method106() {
        return (this.field291 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("d.j(II)V")
    public void method118(int arg0) {
        this.field291 &= 0xFFFFFFF8;
        this.field291 = (byte) (this.field291 | arg0 & 0x7);
    }

    @ObfuscatedName("d.a(IB)V")
    public void method103(int arg0) {
        this.field291 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field291 = (byte) (this.field291 | 0x8);
        }
    }
}
