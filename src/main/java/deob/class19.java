package deob;

@ObfuscatedName("d")
public class class19 {

    @ObfuscatedName("d.m")
    public byte field87;

    @ObfuscatedName("d.o")
    public int field85;

    @ObfuscatedName("d.q")
    public int field81;

    @ObfuscatedName("d.j")
    public int field83;

    @ObfuscatedName("d.p")
    public int field84;

    @ObfuscatedName("d.g")
    public int field86;

    public class19() {
    }

    public class19(class310 arg0, boolean arg1) {
        this.field87 = arg0.method5228();
        this.field85 = arg0.method5283();
        this.field81 = arg0.method5209();
        this.field83 = arg0.method5209();
        this.field84 = arg0.method5209();
        this.field86 = arg0.method5209();
        if (arg1) {
            this.method149(method572(arg0));
        }
    }

    @ObfuscatedName("at.m(Lkn;I)Ljava/lang/Integer;")
    public static Integer method572(class310 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method5227();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method5227();
                if (var4 == 255) {
                    break;
                }
                arg0.field3734--;
                if (arg0.method5283() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method5209();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("d.o(Ljava/lang/Integer;I)V")
    public void method149(Integer arg0) {
    }

    @ObfuscatedName("d.q(I)I")
    public int method141() {
        return this.field87 & 0x7;
    }

    @ObfuscatedName("d.j(I)I")
    public int method145() {
        return (this.field87 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("d.p(II)V")
    public void method143(int arg0) {
        this.field87 &= 0xFFFFFFF8;
        this.field87 = (byte) (this.field87 | arg0 & 0x7);
    }

    @ObfuscatedName("d.g(IB)V")
    public void method144(int arg0) {
        this.field87 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field87 = (byte) (this.field87 | 0x8);
        }
    }
}
