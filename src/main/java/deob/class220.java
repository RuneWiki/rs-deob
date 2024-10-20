package deob;

@ObfuscatedName("hp")
public class class220 {

    @ObfuscatedName("hp.k")
    public byte field3157;

    @ObfuscatedName("hp.h")
    public int field3155;

    @ObfuscatedName("hp.o")
    public int field3161;

    @ObfuscatedName("hp.z")
    public int field3156;

    @ObfuscatedName("hp.c")
    public int field3159;

    @ObfuscatedName("hp.d")
    public int field3160;

    public class220() {
    }

    public class220(class119 arg0, boolean arg1) {
        this.field3157 = arg0.method2413();
        this.field3155 = arg0.method2332();
        this.field3161 = arg0.method2415();
        this.field3156 = arg0.method2415();
        this.field3159 = arg0.method2415();
        this.field3160 = arg0.method2415();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method2330();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method3752(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method2330();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field1949--;
                    if (arg0.method2332() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method2415();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("hp.k(Ljava/lang/Integer;I)V")
    public void method3752(Integer arg0) {
    }

    @ObfuscatedName("hp.h(I)I")
    public int method3753() {
        return this.field3157 & 0x7;
    }

    @ObfuscatedName("hp.o(I)I")
    public int method3754() {
        return (this.field3157 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hp.z(II)V")
    public void method3755(int arg0) {
        this.field3157 &= 0xFFFFFFF8;
        this.field3157 = (byte) (this.field3157 | arg0 & 0x7);
    }

    @ObfuscatedName("hp.c(IB)V")
    public void method3756(int arg0) {
        this.field3157 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3157 = (byte) (this.field3157 | 0x8);
        }
    }
}
