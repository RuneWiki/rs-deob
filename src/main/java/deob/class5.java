package deob;

@ObfuscatedName("a")
public class class5 {

    @ObfuscatedName("a.s")
    public byte field51;

    @ObfuscatedName("a.c")
    public int field46;

    @ObfuscatedName("a.f")
    public int field50;

    @ObfuscatedName("a.h")
    public int field48;

    @ObfuscatedName("a.a")
    public int field49;

    @ObfuscatedName("a.g")
    public int field45;

    public class5() {
    }

    public class5(class154 arg0, boolean arg1) {
        this.field51 = arg0.method2657();
        this.field46 = arg0.method2541();
        this.field50 = arg0.method2550();
        this.field48 = arg0.method2550();
        this.field49 = arg0.method2550();
        this.field45 = arg0.method2550();
        if (arg1) {
            this.method50(method2847(arg0));
        }
    }

    @ObfuscatedName("fn.s(Lea;B)Ljava/lang/Integer;")
    public static Integer method2847(class154 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2545();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2545();
                if (var4 == 255) {
                    break;
                }
                arg0.field2098--;
                if (arg0.method2541() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2550();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("a.c(Ljava/lang/Integer;I)V")
    public void method50(Integer arg0) {
    }

    @ObfuscatedName("a.f(I)I")
    public int method59() {
        return this.field51 & 0x7;
    }

    @ObfuscatedName("a.g(S)I")
    public int method44() {
        return (this.field51 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("a.k(II)V")
    public void method45(int arg0) {
        this.field51 &= 0xFFFFFFF8;
        this.field51 = (byte) (this.field51 | arg0 & 0x7);
    }

    @ObfuscatedName("a.u(IB)V")
    public void method47(int arg0) {
        this.field51 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field51 = (byte) (this.field51 | 0x8);
        }
    }
}
