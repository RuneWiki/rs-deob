package deob;

@ObfuscatedName("y")
public class class19 {

    @ObfuscatedName("y.h")
    public byte field84;

    @ObfuscatedName("y.v")
    public int field78;

    @ObfuscatedName("y.x")
    public int field80;

    @ObfuscatedName("y.w")
    public int field79;

    @ObfuscatedName("y.t")
    public int field82;

    @ObfuscatedName("y.j")
    public int field83;

    public class19() {
    }

    public class19(class311 arg0, boolean arg1) {
        this.field84 = arg0.method5148();
        this.field78 = arg0.method5342();
        this.field80 = arg0.method5120();
        this.field79 = arg0.method5120();
        this.field82 = arg0.method5120();
        this.field83 = arg0.method5120();
        if (arg1) {
            this.method159(method4046(arg0));
        }
    }

    @ObfuscatedName("iy.h(Lkj;I)Ljava/lang/Integer;")
    public static Integer method4046(class311 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method5274();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method5274();
                if (var4 == 255) {
                    break;
                }
                arg0.field3752--;
                if (arg0.method5342() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method5120();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("y.v(Ljava/lang/Integer;I)V")
    public void method159(Integer arg0) {
    }

    @ObfuscatedName("y.x(I)I")
    public int method147() {
        return this.field84 & 0x7;
    }

    @ObfuscatedName("y.w(I)I")
    public int method148() {
        return (this.field84 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("y.t(II)V")
    public void method149(int arg0) {
        this.field84 &= 0xFFFFFFF8;
        this.field84 = (byte) (this.field84 | arg0 & 0x7);
    }

    @ObfuscatedName("y.j(II)V")
    public void method154(int arg0) {
        this.field84 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field84 = (byte) (this.field84 | 0x8);
        }
    }
}
