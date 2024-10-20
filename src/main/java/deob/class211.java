package deob;

@ObfuscatedName("hl")
public class class211 {

    @ObfuscatedName("hl.n")
    public byte field3067;

    @ObfuscatedName("hl.d")
    public int field3071;

    @ObfuscatedName("hl.z")
    public int field3068;

    @ObfuscatedName("hl.y")
    public int field3066;

    @ObfuscatedName("hl.e")
    public int field3070;

    @ObfuscatedName("hl.g")
    public int field3069;

    public class211() {
    }

    public class211(class111 arg0, boolean arg1) {
        this.field3067 = arg0.method2409();
        this.field3071 = arg0.method2231();
        this.field3068 = arg0.method2233();
        this.field3066 = arg0.method2233();
        this.field3070 = arg0.method2233();
        this.field3069 = arg0.method2233();
        if (arg1) {
            this.method3628(method2854(arg0));
        }
    }

    @ObfuscatedName("eb.n(Ldl;S)Ljava/lang/Integer;")
    public static Integer method2854(class111 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2228();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2228();
                if (var4 == 255) {
                    break;
                }
                arg0.field1889--;
                if (arg0.method2231() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2233();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("hl.d(Ljava/lang/Integer;B)V")
    public void method3628(Integer arg0) {
    }

    @ObfuscatedName("hl.z(I)I")
    public int method3640() {
        return this.field3067 & 0x7;
    }

    @ObfuscatedName("hl.y(I)I")
    public int method3634() {
        return (this.field3067 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hl.e(IB)V")
    public void method3630(int arg0) {
        this.field3067 &= 0xFFFFFFF8;
        this.field3067 = (byte) (this.field3067 | arg0 & 0x7);
    }

    @ObfuscatedName("hl.g(II)V")
    public void method3631(int arg0) {
        this.field3067 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3067 = (byte) (this.field3067 | 0x8);
        }
    }
}
