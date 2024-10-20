package deob;

@ObfuscatedName("kq")
public class class299 {

    @ObfuscatedName("kq.n")
    public byte field3767;

    @ObfuscatedName("kq.c")
    public int field3765;

    @ObfuscatedName("kq.m")
    public int field3766;

    @ObfuscatedName("kq.k")
    public int field3769;

    @ObfuscatedName("kq.o")
    public int field3768;

    @ObfuscatedName("kq.g")
    public int field3764;

    public class299() {
    }

    public class299(class400 arg0, boolean arg1) {
        this.field3767 = arg0.method6218();
        this.field3765 = arg0.method6219();
        this.field3766 = arg0.method6222();
        this.field3769 = arg0.method6222();
        this.field3768 = arg0.method6222();
        this.field3764 = arg0.method6222();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method6217();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method4887(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method6217();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field4272--;
                    if (arg0.method6219() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method6222();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("kq.n(Ljava/lang/Integer;I)V")
    public void method4887(Integer arg0) {
    }

    @ObfuscatedName("kq.c(I)I")
    public int method4885() {
        return this.field3767 & 0x7;
    }

    @ObfuscatedName("kq.m(B)I")
    public int method4876() {
        return (this.field3767 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("kq.k(IB)V")
    public void method4878(int arg0) {
        this.field3767 &= 0xFFFFFFF8;
        this.field3767 = (byte) (this.field3767 | arg0 & 0x7);
    }

    @ObfuscatedName("kq.o(II)V")
    public void method4879(int arg0) {
        this.field3767 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3767 = (byte) (this.field3767 | 0x8);
        }
    }
}
