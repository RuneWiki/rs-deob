package deob;

@ObfuscatedName("hy")
public class class220 {

    @ObfuscatedName("hy.l")
    public byte field3157;

    @ObfuscatedName("hy.e")
    public int field3160;

    @ObfuscatedName("hy.q")
    public int field3158;

    @ObfuscatedName("hy.o")
    public int field3159;

    @ObfuscatedName("hy.g")
    public int field3156;

    @ObfuscatedName("hy.m")
    public int field3161;

    public class220() {
    }

    public class220(class119 arg0, boolean arg1) {
        this.field3157 = arg0.method2389();
        this.field3160 = arg0.method2440();
        this.field3158 = arg0.method2393();
        this.field3159 = arg0.method2393();
        this.field3156 = arg0.method2393();
        this.field3161 = arg0.method2393();
        if (arg1) {
            this.method3704(method2163(arg0));
        }
    }

    @ObfuscatedName("cw.l(Ldl;B)Ljava/lang/Integer;")
    public static Integer method2163(class119 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2388();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2388();
                if (var4 == 255) {
                    break;
                }
                arg0.field1988--;
                if (arg0.method2440() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2393();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("hy.e(Ljava/lang/Integer;B)V")
    public void method3704(Integer arg0) {
    }

    @ObfuscatedName("hy.q(B)I")
    public int method3695() {
        return this.field3157 & 0x7;
    }

    @ObfuscatedName("hy.o(I)I")
    public int method3697() {
        return (this.field3157 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hy.g(IB)V")
    public void method3698(int arg0) {
        this.field3157 &= 0xFFFFFFF8;
        this.field3157 = (byte) (this.field3157 | arg0 & 0x7);
    }

    @ObfuscatedName("hy.m(II)V")
    public void method3712(int arg0) {
        this.field3157 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3157 = (byte) (this.field3157 | 0x8);
        }
    }
}
