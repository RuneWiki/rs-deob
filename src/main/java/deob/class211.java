package deob;

@ObfuscatedName("hk")
public class class211 {

    @ObfuscatedName("hk.b")
    public byte field3068;

    @ObfuscatedName("hk.e")
    public int field3065;

    @ObfuscatedName("hk.a")
    public int field3067;

    @ObfuscatedName("hk.k")
    public int field3069;

    @ObfuscatedName("hk.p")
    public int field3066;

    @ObfuscatedName("hk.l")
    public int field3064;

    public class211() {
    }

    public class211(class111 arg0, boolean arg1) {
        this.field3068 = arg0.method2267();
        this.field3065 = arg0.method2129();
        this.field3067 = arg0.method2194();
        this.field3069 = arg0.method2194();
        this.field3066 = arg0.method2194();
        this.field3064 = arg0.method2194();
        if (arg1) {
            this.method3497(method1581(arg0));
        }
    }

    @ObfuscatedName("cg.b(Ldj;I)Ljava/lang/Integer;")
    public static Integer method1581(class111 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2127();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2127();
                if (var4 == 255) {
                    break;
                }
                arg0.field1894--;
                if (arg0.method2129() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2194();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("hk.e(Ljava/lang/Integer;I)V")
    public void method3497(Integer arg0) {
    }

    @ObfuscatedName("hk.a(I)I")
    public int method3515() {
        return this.field3068 & 0x7;
    }

    @ObfuscatedName("hk.k(I)I")
    public int method3499() {
        return (this.field3068 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hk.p(IB)V")
    public void method3519(int arg0) {
        this.field3068 &= 0xFFFFFFF8;
        this.field3068 = (byte) (this.field3068 | arg0 & 0x7);
    }

    @ObfuscatedName("hk.l(II)V")
    public void method3501(int arg0) {
        this.field3068 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3068 = (byte) (this.field3068 | 0x8);
        }
    }
}
