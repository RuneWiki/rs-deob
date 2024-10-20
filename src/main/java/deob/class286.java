package deob;

@ObfuscatedName("jk")
public class class286 {

    @ObfuscatedName("jk.s")
    public byte field3655;

    @ObfuscatedName("jk.t")
    public int field3654;

    @ObfuscatedName("jk.v")
    public int field3656;

    @ObfuscatedName("jk.j")
    public int field3653;

    @ObfuscatedName("jk.l")
    public int field3657;

    @ObfuscatedName("jk.n")
    public int field3659;

    public class286() {
    }

    public class286(class385 arg0, boolean arg1) {
        this.field3655 = arg0.method5959();
        this.field3654 = arg0.method6053();
        this.field3656 = arg0.method6182();
        this.field3653 = arg0.method6182();
        this.field3657 = arg0.method6182();
        this.field3659 = arg0.method6182();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method5958();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method4607(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method5958();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field4182--;
                    if (arg0.method6053() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method6182();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("jk.s(Ljava/lang/Integer;I)V")
    public void method4607(Integer arg0) {
    }

    @ObfuscatedName("jk.t(I)I")
    public int method4609() {
        return this.field3655 & 0x7;
    }

    @ObfuscatedName("jk.v(B)I")
    public int method4612() {
        return (this.field3655 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("jk.j(II)V")
    public void method4610(int arg0) {
        this.field3655 &= 0xFFFFFFF8;
        this.field3655 = (byte) (this.field3655 | arg0 & 0x7);
    }

    @ObfuscatedName("jk.l(IB)V")
    public void method4611(int arg0) {
        this.field3655 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3655 = (byte) (this.field3655 | 0x8);
        }
    }
}
