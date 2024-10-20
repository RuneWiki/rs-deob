package deob;

@ObfuscatedName("lr")
public class class326 {

    @ObfuscatedName("lr.c")
    public byte field4116;

    @ObfuscatedName("lr.p")
    public int field4108;

    @ObfuscatedName("lr.f")
    public int field4110;

    @ObfuscatedName("lr.n")
    public int field4111;

    @ObfuscatedName("lr.k")
    public int field4112;

    @ObfuscatedName("lr.w")
    public int field4113;

    public class326() {
    }

    public class326(class445 arg0, boolean arg1) {
        this.field4116 = arg0.method7197();
        this.field4108 = arg0.method7198();
        this.field4110 = arg0.method7201();
        this.field4111 = arg0.method7201();
        this.field4112 = arg0.method7201();
        this.field4113 = arg0.method7201();
        if (arg1) {
            this.method5573(method3269(arg0));
        }
    }

    @ObfuscatedName("fy.c(Lqq;I)Ljava/lang/Integer;")
    public static Integer method3269(class445 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method7196();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method7196();
                if (var4 == 255) {
                    break;
                }
                arg0.field4735--;
                if (arg0.method7198() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method7201();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("lr.p(Ljava/lang/Integer;B)V")
    public void method5573(Integer arg0) {
    }

    @ObfuscatedName("lr.f(B)I")
    public int method5574() {
        return this.field4116 & 0x7;
    }

    @ObfuscatedName("lr.n(I)I")
    public int method5575() {
        return (this.field4116 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("lr.k(IB)V")
    public void method5576(int arg0) {
        this.field4116 &= 0xFFFFFFF8;
        this.field4116 = (byte) (this.field4116 | arg0 & 0x7);
    }

    @ObfuscatedName("lr.w(IS)V")
    public void method5571(int arg0) {
        this.field4116 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field4116 = (byte) (this.field4116 | 0x8);
        }
    }
}
