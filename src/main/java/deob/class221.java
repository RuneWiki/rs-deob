package deob;

@ObfuscatedName("hp")
public class class221 {

    @ObfuscatedName("hp.w")
    public byte field3176;

    @ObfuscatedName("hp.x")
    public int field3173;

    @ObfuscatedName("hp.t")
    public int field3174;

    @ObfuscatedName("hp.p")
    public int field3175;

    @ObfuscatedName("hp.e")
    public int field3172;

    @ObfuscatedName("hp.y")
    public int field3177;

    public class221() {
    }

    public class221(class120 arg0, boolean arg1) {
        this.field3176 = arg0.method2381();
        this.field3173 = arg0.method2365();
        this.field3174 = arg0.method2368();
        this.field3175 = arg0.method2368();
        this.field3172 = arg0.method2368();
        this.field3177 = arg0.method2368();
        if (arg1) {
            this.method3750(method2308(arg0));
        }
    }

    @ObfuscatedName("dc.w(Lde;I)Ljava/lang/Integer;")
    public static Integer method2308(class120 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2363();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2363();
                if (var4 == 255) {
                    break;
                }
                arg0.field2012--;
                if (arg0.method2365() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2368();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("hp.x(Ljava/lang/Integer;I)V")
    public void method3750(Integer arg0) {
    }

    @ObfuscatedName("hp.t(I)I")
    public int method3749() {
        return this.field3176 & 0x7;
    }

    @ObfuscatedName("hp.p(B)I")
    public int method3752() {
        return (this.field3176 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hp.e(IB)V")
    public void method3751(int arg0) {
        this.field3176 &= 0xFFFFFFF8;
        this.field3176 = (byte) (this.field3176 | arg0 & 0x7);
    }

    @ObfuscatedName("hp.y(II)V")
    public void method3747(int arg0) {
        this.field3176 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3176 = (byte) (this.field3176 | 0x8);
        }
    }
}
