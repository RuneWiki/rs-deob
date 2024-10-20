package deob;

@ObfuscatedName("ju")
public class class285 {

    @ObfuscatedName("ju.f")
    public byte field3655;

    @ObfuscatedName("ju.e")
    public int field3660;

    @ObfuscatedName("ju.v")
    public int field3656;

    @ObfuscatedName("ju.y")
    public int field3657;

    @ObfuscatedName("ju.j")
    public int field3658;

    @ObfuscatedName("ju.o")
    public int field3659;

    public class285() {
    }

    public class285(class384 arg0, boolean arg1) {
        this.field3655 = arg0.method5968();
        this.field3660 = arg0.method5899();
        this.field3656 = arg0.method5965();
        this.field3657 = arg0.method5965();
        this.field3658 = arg0.method5965();
        this.field3659 = arg0.method5965();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method5902();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method4654(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method5902();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field4161--;
                    if (arg0.method5899() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method5965();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("ju.f(Ljava/lang/Integer;I)V")
    public void method4654(Integer arg0) {
    }

    @ObfuscatedName("ju.e(B)I")
    public int method4651() {
        return this.field3655 & 0x7;
    }

    @ObfuscatedName("ju.v(B)I")
    public int method4653() {
        return (this.field3655 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("ju.y(IB)V")
    public void method4650(int arg0) {
        this.field3655 &= 0xFFFFFFF8;
        this.field3655 = (byte) (this.field3655 | arg0 & 0x7);
    }

    @ObfuscatedName("ju.j(II)V")
    public void method4655(int arg0) {
        this.field3655 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3655 = (byte) (this.field3655 | 0x8);
        }
    }
}
