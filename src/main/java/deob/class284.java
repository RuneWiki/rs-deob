package deob;

@ObfuscatedName("ju")
public class class284 {

    @ObfuscatedName("ju.v")
    public byte field3656;

    @ObfuscatedName("ju.n")
    public int field3655;

    @ObfuscatedName("ju.f")
    public int field3659;

    @ObfuscatedName("ju.y")
    public int field3657;

    @ObfuscatedName("ju.p")
    public int field3654;

    @ObfuscatedName("ju.j")
    public int field3658;

    public class284() {
    }

    public class284(class383 arg0, boolean arg1) {
        this.field3656 = arg0.method5966();
        this.field3655 = arg0.method5967();
        this.field3659 = arg0.method5970();
        this.field3657 = arg0.method5970();
        this.field3654 = arg0.method5970();
        this.field3658 = arg0.method5970();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method5965();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method4631(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method5965();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field4158--;
                    if (arg0.method5967() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method5970();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("ju.v(Ljava/lang/Integer;I)V")
    public void method4631(Integer arg0) {
    }

    @ObfuscatedName("ju.n(I)I")
    public int method4634() {
        return this.field3656 & 0x7;
    }

    @ObfuscatedName("ju.f(I)I")
    public int method4635() {
        return (this.field3656 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("ju.y(II)V")
    public void method4636(int arg0) {
        this.field3656 &= 0xFFFFFFF8;
        this.field3656 = (byte) (this.field3656 | arg0 & 0x7);
    }

    @ObfuscatedName("ju.p(IB)V")
    public void method4646(int arg0) {
        this.field3656 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3656 = (byte) (this.field3656 | 0x8);
        }
    }
}
