package deob;

@ObfuscatedName("c")
public class class5 {

    @ObfuscatedName("c.g")
    public byte field41;

    @ObfuscatedName("c.r")
    public int field31;

    @ObfuscatedName("c.e")
    public int field32;

    @ObfuscatedName("c.q")
    public int field34;

    @ObfuscatedName("c.c")
    public int field39;

    @ObfuscatedName("c.l")
    public int field36;

    public class5() {
    }

    public class5(class185 arg0, boolean arg1) {
        this.field41 = arg0.method3627();
        this.field31 = arg0.method3467();
        this.field32 = arg0.method3588();
        this.field34 = arg0.method3588();
        this.field39 = arg0.method3588();
        this.field36 = arg0.method3588();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method3679();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method40(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method3679();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field2406--;
                    if (arg0.method3467() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method3588();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("c.g(Ljava/lang/Integer;I)V")
    public void method40(Integer arg0) {
    }

    @ObfuscatedName("c.r(B)I")
    public int method41() {
        return this.field41 & 0x7;
    }

    @ObfuscatedName("c.e(I)I")
    public int method42() {
        return (this.field41 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("c.q(II)V")
    public void method57(int arg0) {
        this.field41 &= 0xFFFFFFF8;
        this.field41 = (byte) (this.field41 | arg0 & 0x7);
    }

    @ObfuscatedName("c.c(IB)V")
    public void method39(int arg0) {
        this.field41 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field41 = (byte) (this.field41 | 0x8);
        }
    }
}
