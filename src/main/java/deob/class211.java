package deob;

@ObfuscatedName("hz")
public class class211 {

    @ObfuscatedName("hz.n")
    public byte field3069;

    @ObfuscatedName("hz.w")
    public int field3068;

    @ObfuscatedName("hz.i")
    public int field3067;

    @ObfuscatedName("hz.e")
    public int field3070;

    @ObfuscatedName("hz.h")
    public int field3071;

    @ObfuscatedName("hz.q")
    public int field3072;

    public class211() {
    }

    public class211(class111 arg0, boolean arg1) {
        this.field3069 = arg0.method2173();
        this.field3068 = arg0.method2157();
        this.field3067 = arg0.method2160();
        this.field3070 = arg0.method2160();
        this.field3071 = arg0.method2160();
        this.field3072 = arg0.method2160();
        if (arg1) {
            this.method3550(method3289(arg0));
        }
    }

    @ObfuscatedName("fk.n(Ldo;I)Ljava/lang/Integer;")
    public static Integer method3289(class111 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2155();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2155();
                if (var4 == 255) {
                    break;
                }
                arg0.field1888--;
                if (arg0.method2157() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2160();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("hz.w(Ljava/lang/Integer;B)V")
    public void method3550(Integer arg0) {
    }

    @ObfuscatedName("hz.i(I)I")
    public int method3555() {
        return this.field3069 & 0x7;
    }

    @ObfuscatedName("hz.e(I)I")
    public int method3552() {
        return (this.field3069 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hz.h(IB)V")
    public void method3553(int arg0) {
        this.field3069 &= 0xFFFFFFF8;
        this.field3069 = (byte) (this.field3069 | arg0 & 0x7);
    }

    @ObfuscatedName("hz.q(II)V")
    public void method3554(int arg0) {
        this.field3069 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3069 = (byte) (this.field3069 | 0x8);
        }
    }
}
