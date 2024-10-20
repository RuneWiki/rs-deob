package deob;

@ObfuscatedName("he")
public class class220 {

    @ObfuscatedName("he.y")
    public byte field3146;

    @ObfuscatedName("he.d")
    public int field3145;

    @ObfuscatedName("he.g")
    public int field3144;

    @ObfuscatedName("he.w")
    public int field3150;

    @ObfuscatedName("he.e")
    public int field3148;

    @ObfuscatedName("he.c")
    public int field3149;

    public class220() {
    }

    public class220(class119 arg0, boolean arg1) {
        this.field3146 = arg0.method2461();
        this.field3145 = arg0.method2525();
        this.field3144 = arg0.method2331();
        this.field3150 = arg0.method2331();
        this.field3148 = arg0.method2331();
        this.field3149 = arg0.method2331();
        if (arg1) {
            this.method3665(method2913(arg0));
        }
    }

    @ObfuscatedName("fe.y(Ldd;B)Ljava/lang/Integer;")
    public static Integer method2913(class119 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2326();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2326();
                if (var4 == 255) {
                    break;
                }
                arg0.field1973--;
                if (arg0.method2525() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2331();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("he.d(Ljava/lang/Integer;B)V")
    public void method3665(Integer arg0) {
    }

    @ObfuscatedName("he.g(I)I")
    public int method3667() {
        return this.field3146 & 0x7;
    }

    @ObfuscatedName("he.w(B)I")
    public int method3668() {
        return (this.field3146 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("he.e(IB)V")
    public void method3669(int arg0) {
        this.field3146 &= 0xFFFFFFF8;
        this.field3146 = (byte) (this.field3146 | arg0 & 0x7);
    }

    @ObfuscatedName("he.c(IB)V")
    public void method3670(int arg0) {
        this.field3146 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3146 = (byte) (this.field3146 | 0x8);
        }
    }
}
