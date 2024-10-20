package deob;

@ObfuscatedName("ha")
public class class224 {

    @ObfuscatedName("ha.i")
    public byte field3226;

    @ObfuscatedName("ha.h")
    public int field3227;

    @ObfuscatedName("ha.e")
    public int field3228;

    @ObfuscatedName("ha.g")
    public int field3225;

    @ObfuscatedName("ha.n")
    public int field3229;

    @ObfuscatedName("ha.u")
    public int field3230;

    public class224() {
    }

    public class224(class123 arg0, boolean arg1) {
        this.field3226 = arg0.method2405();
        this.field3227 = arg0.method2406();
        this.field3228 = arg0.method2409();
        this.field3225 = arg0.method2409();
        this.field3229 = arg0.method2409();
        this.field3230 = arg0.method2409();
        if (arg1) {
            this.method3777(method2891(arg0));
        }
    }

    @ObfuscatedName("em.i(Ldn;B)Ljava/lang/Integer;")
    public static Integer method2891(class123 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2404();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2404();
                if (var4 == 255) {
                    break;
                }
                arg0.field2046--;
                if (arg0.method2406() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2409();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("ha.h(Ljava/lang/Integer;I)V")
    public void method3777(Integer arg0) {
    }

    @ObfuscatedName("ha.e(B)I")
    public int method3778() {
        return this.field3226 & 0x7;
    }

    @ObfuscatedName("ha.g(S)I")
    public int method3779() {
        return (this.field3226 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("ha.n(II)V")
    public void method3780(int arg0) {
        this.field3226 &= 0xFFFFFFF8;
        this.field3226 = (byte) (this.field3226 | arg0 & 0x7);
    }

    @ObfuscatedName("ha.u(IB)V")
    public void method3786(int arg0) {
        this.field3226 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3226 = (byte) (this.field3226 | 0x8);
        }
    }
}
