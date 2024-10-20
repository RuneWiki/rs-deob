package deob;

@ObfuscatedName("hu")
public class class224 {

    @ObfuscatedName("hu.a")
    public byte field3222;

    @ObfuscatedName("hu.d")
    public int field3219;

    @ObfuscatedName("hu.v")
    public int field3220;

    @ObfuscatedName("hu.r")
    public int field3218;

    @ObfuscatedName("hu.z")
    public int field3223;

    @ObfuscatedName("hu.t")
    public int field3221;

    public class224() {
    }

    public class224(class123 arg0, boolean arg1) {
        this.field3222 = arg0.method2396();
        this.field3219 = arg0.method2584();
        this.field3220 = arg0.method2400();
        this.field3218 = arg0.method2400();
        this.field3223 = arg0.method2400();
        this.field3221 = arg0.method2400();
        if (arg1) {
            this.method3804(method764(arg0));
        }
    }

    @ObfuscatedName("aw.a(Ldb;B)Ljava/lang/Integer;")
    public static Integer method764(class123 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2395();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2395();
                if (var4 == 255) {
                    break;
                }
                arg0.field2071--;
                if (arg0.method2584() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2400();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("hu.d(Ljava/lang/Integer;I)V")
    public void method3804(Integer arg0) {
    }

    @ObfuscatedName("hu.v(I)I")
    public int method3805() {
        return this.field3222 & 0x7;
    }

    @ObfuscatedName("hu.r(I)I")
    public int method3807() {
        return (this.field3222 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hu.z(IB)V")
    public void method3818(int arg0) {
        this.field3222 &= 0xFFFFFFF8;
        this.field3222 = (byte) (this.field3222 | arg0 & 0x7);
    }

    @ObfuscatedName("hu.t(II)V")
    public void method3806(int arg0) {
        this.field3222 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3222 = (byte) (this.field3222 | 0x8);
        }
    }
}
