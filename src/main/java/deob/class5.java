package deob;

@ObfuscatedName("u")
public class class5 {

    @ObfuscatedName("u.v")
    public byte field37;

    @ObfuscatedName("u.s")
    public int field33;

    @ObfuscatedName("u.o")
    public int field34;

    @ObfuscatedName("u.k")
    public int field38;

    @ObfuscatedName("u.u")
    public int field35;

    @ObfuscatedName("u.i")
    public int field36;

    public class5() {
    }

    public class5(class185 arg0, boolean arg1) {
        this.field37 = arg0.method3275();
        this.field33 = arg0.method3276();
        this.field34 = arg0.method3279();
        this.field38 = arg0.method3279();
        this.field35 = arg0.method3279();
        this.field36 = arg0.method3279();
        if (arg1) {
            this.method45(method1713(arg0));
        }
    }

    @ObfuscatedName("bc.v(Lgx;I)Ljava/lang/Integer;")
    public static Integer method1713(class185 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method3274();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method3274();
                if (var4 == 255) {
                    break;
                }
                arg0.field2386--;
                if (arg0.method3276() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method3279();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("u.s(Ljava/lang/Integer;I)V")
    public void method45(Integer arg0) {
    }

    @ObfuscatedName("u.o(I)I")
    public int method47() {
        return this.field37 & 0x7;
    }

    @ObfuscatedName("u.k(I)I")
    public int method48() {
        return (this.field37 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("u.u(IB)V")
    public void method62(int arg0) {
        this.field37 &= 0xFFFFFFF8;
        this.field37 = (byte) (this.field37 | arg0 & 0x7);
    }

    @ObfuscatedName("u.i(II)V")
    public void method50(int arg0) {
        this.field37 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field37 = (byte) (this.field37 | 0x8);
        }
    }
}
