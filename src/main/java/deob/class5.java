package deob;

@ObfuscatedName("g")
public class class5 {

    @ObfuscatedName("g.i")
    public byte field37;

    @ObfuscatedName("g.e")
    public int field44;

    @ObfuscatedName("g.f")
    public int field38;

    @ObfuscatedName("g.k")
    public int field39;

    @ObfuscatedName("g.g")
    public int field40;

    @ObfuscatedName("g.n")
    public int field41;

    public class5() {
    }

    public class5(class154 arg0, boolean arg1) {
        this.field37 = arg0.method2574();
        this.field44 = arg0.method2575();
        this.field38 = arg0.method2658();
        this.field39 = arg0.method2658();
        this.field40 = arg0.method2658();
        this.field41 = arg0.method2658();
        if (arg1) {
            this.method40(method1099(arg0));
        }
    }

    @ObfuscatedName("bp.i(Let;B)Ljava/lang/Integer;")
    public static Integer method1099(class154 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2573();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2573();
                if (var4 == 255) {
                    break;
                }
                arg0.field2091--;
                if (arg0.method2575() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2658();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("g.e(Ljava/lang/Integer;B)V")
    public void method40(Integer arg0) {
    }

    @ObfuscatedName("g.f(I)I")
    public int method41() {
        return this.field37 & 0x7;
    }

    @ObfuscatedName("g.k(I)I")
    public int method42() {
        return (this.field37 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("g.a(IS)V")
    public void method43(int arg0) {
        this.field37 &= 0xFFFFFFF8;
        this.field37 = (byte) (this.field37 | arg0 & 0x7);
    }

    @ObfuscatedName("g.q(II)V")
    public void method44(int arg0) {
        this.field37 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field37 = (byte) (this.field37 | 0x8);
        }
    }
}
