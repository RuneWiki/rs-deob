package deob;

@ObfuscatedName("hx")
public class class221 {

    @ObfuscatedName("hx.a")
    public byte field3174;

    @ObfuscatedName("hx.w")
    public int field3171;

    @ObfuscatedName("hx.d")
    public int field3172;

    @ObfuscatedName("hx.c")
    public int field3173;

    @ObfuscatedName("hx.y")
    public int field3170;

    @ObfuscatedName("hx.k")
    public int field3175;

    public class221() {
    }

    public class221(class120 arg0, boolean arg1) {
        this.field3174 = arg0.method2548();
        this.field3171 = arg0.method2464();
        this.field3172 = arg0.method2467();
        this.field3173 = arg0.method2467();
        this.field3170 = arg0.method2467();
        this.field3175 = arg0.method2467();
        if (arg1) {
            this.method3827(method2711(arg0));
        }
    }

    @ObfuscatedName("ds.a(Ldx;B)Ljava/lang/Integer;")
    public static Integer method2711(class120 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2462();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2462();
                if (var4 == 255) {
                    break;
                }
                arg0.field1993--;
                if (arg0.method2464() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2467();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("hx.w(Ljava/lang/Integer;B)V")
    public void method3827(Integer arg0) {
    }

    @ObfuscatedName("hx.d(I)I")
    public int method3817() {
        return this.field3174 & 0x7;
    }

    @ObfuscatedName("hx.c(I)I")
    public int method3818() {
        return (this.field3174 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hx.y(IB)V")
    public void method3814(int arg0) {
        this.field3174 &= 0xFFFFFFF8;
        this.field3174 = (byte) (this.field3174 | arg0 & 0x7);
    }

    @ObfuscatedName("hx.k(II)V")
    public void method3820(int arg0) {
        this.field3174 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3174 = (byte) (this.field3174 | 0x8);
        }
    }
}
