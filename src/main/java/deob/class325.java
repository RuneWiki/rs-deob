package deob;

@ObfuscatedName("ly")
public class class325 {

    @ObfuscatedName("ly.o")
    public byte field4096;

    @ObfuscatedName("ly.q")
    public int field4093;

    @ObfuscatedName("ly.l")
    public int field4094;

    @ObfuscatedName("ly.k")
    public int field4095;

    @ObfuscatedName("ly.a")
    public int field4097;

    @ObfuscatedName("ly.m")
    public int field4092;

    public class325() {
    }

    public class325(class440 arg0, boolean arg1) {
        this.field4096 = arg0.method7034();
        this.field4093 = arg0.method7082();
        this.field4094 = arg0.method6898();
        this.field4095 = arg0.method6898();
        this.field4097 = arg0.method6898();
        this.field4092 = arg0.method6898();
        if (arg1) {
            this.method5338(method4407(arg0));
        }
    }

    @ObfuscatedName("ib.o(Lpx;I)Ljava/lang/Integer;")
    public static Integer method4407(class440 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method7071();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method7071();
                if (var4 == 255) {
                    break;
                }
                arg0.field4678--;
                if (arg0.method7082() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method6898();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("ly.q(Ljava/lang/Integer;I)V")
    public void method5338(Integer arg0) {
    }

    @ObfuscatedName("ly.l(I)I")
    public int method5339() {
        return this.field4096 & 0x7;
    }

    @ObfuscatedName("ly.k(B)I")
    public int method5340() {
        return (this.field4096 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("ly.a(II)V")
    public void method5341(int arg0) {
        this.field4096 &= 0xFFFFFFF8;
        this.field4096 = (byte) (this.field4096 | arg0 & 0x7);
    }

    @ObfuscatedName("ly.m(II)V")
    public void method5344(int arg0) {
        this.field4096 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field4096 = (byte) (this.field4096 | 0x8);
        }
    }
}
