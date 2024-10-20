package deob;

@ObfuscatedName("hn")
public class class220 {

    @ObfuscatedName("hn.c")
    public byte field3147;

    @ObfuscatedName("hn.h")
    public int field3143;

    @ObfuscatedName("hn.k")
    public int field3144;

    @ObfuscatedName("hn.t")
    public int field3145;

    @ObfuscatedName("hn.g")
    public int field3142;

    @ObfuscatedName("hn.o")
    public int field3149;

    public class220() {
    }

    public class220(class119 arg0, boolean arg1) {
        this.field3147 = arg0.method2292();
        this.field3143 = arg0.method2293();
        this.field3144 = arg0.method2296();
        this.field3145 = arg0.method2296();
        this.field3142 = arg0.method2296();
        this.field3149 = arg0.method2296();
        if (arg1) {
            this.method3708(method133(arg0));
        }
    }

    @ObfuscatedName("y.c(Ldf;B)Ljava/lang/Integer;")
    public static Integer method133(class119 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2291();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2291();
                if (var4 == 255) {
                    break;
                }
                arg0.field1955--;
                if (arg0.method2293() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2296();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("hn.h(Ljava/lang/Integer;I)V")
    public void method3708(Integer arg0) {
    }

    @ObfuscatedName("hn.k(I)I")
    public int method3722() {
        return this.field3147 & 0x7;
    }

    @ObfuscatedName("hn.t(B)I")
    public int method3709() {
        return (this.field3147 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hn.g(II)V")
    public void method3712(int arg0) {
        this.field3147 &= 0xFFFFFFF8;
        this.field3147 = (byte) (this.field3147 | arg0 & 0x7);
    }

    @ObfuscatedName("hn.o(IB)V")
    public void method3719(int arg0) {
        this.field3147 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3147 = (byte) (this.field3147 | 0x8);
        }
    }
}
