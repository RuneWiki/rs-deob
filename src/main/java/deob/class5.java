package deob;

@ObfuscatedName("l")
public class class5 {

    @ObfuscatedName("l.f")
    public byte field37;

    @ObfuscatedName("l.h")
    public int field32;

    @ObfuscatedName("l.e")
    public int field31;

    @ObfuscatedName("l.b")
    public int field29;

    @ObfuscatedName("l.l")
    public int field33;

    @ObfuscatedName("l.w")
    public int field34;

    public class5() {
    }

    public class5(class185 arg0, boolean arg1) {
        this.field37 = arg0.method3324();
        this.field32 = arg0.method3325();
        this.field31 = arg0.method3328();
        this.field29 = arg0.method3328();
        this.field33 = arg0.method3328();
        this.field34 = arg0.method3328();
        if (arg1) {
            this.method43(method1687(arg0));
        }
    }

    @ObfuscatedName("ba.f(Lgx;I)Ljava/lang/Integer;")
    public static Integer method1687(class185 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method3323();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method3323();
                if (var4 == 255) {
                    break;
                }
                arg0.field2397--;
                if (arg0.method3325() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method3328();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("l.h(Ljava/lang/Integer;I)V")
    public void method43(Integer arg0) {
    }

    @ObfuscatedName("l.e(B)I")
    public int method44() {
        return this.field37 & 0x7;
    }

    @ObfuscatedName("l.b(B)I")
    public int method50() {
        return (this.field37 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("l.l(IB)V")
    public void method46(int arg0) {
        this.field37 &= 0xFFFFFFF8;
        this.field37 = (byte) (this.field37 | arg0 & 0x7);
    }

    @ObfuscatedName("l.w(II)V")
    public void method47(int arg0) {
        this.field37 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field37 = (byte) (this.field37 | 0x8);
        }
    }
}
