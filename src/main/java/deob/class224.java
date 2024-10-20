package deob;

@ObfuscatedName("he")
public class class224 {

    @ObfuscatedName("he.x")
    public byte field3219;

    @ObfuscatedName("he.r")
    public int field3222;

    @ObfuscatedName("he.j")
    public int field3220;

    @ObfuscatedName("he.z")
    public int field3221;

    @ObfuscatedName("he.i")
    public int field3223;

    @ObfuscatedName("he.b")
    public int field3224;

    public class224() {
    }

    public class224(class123 arg0, boolean arg1) {
        this.field3219 = arg0.method2409();
        this.field3222 = arg0.method2403();
        this.field3220 = arg0.method2413();
        this.field3221 = arg0.method2413();
        this.field3223 = arg0.method2413();
        this.field3224 = arg0.method2413();
        if (arg1) {
            this.method3762(method544(arg0));
        }
    }

    @ObfuscatedName("n.x(Ldp;I)Ljava/lang/Integer;")
    public static Integer method544(class123 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2408();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2408();
                if (var4 == 255) {
                    break;
                }
                arg0.field2057--;
                if (arg0.method2403() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2413();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("he.r(Ljava/lang/Integer;I)V")
    public void method3762(Integer arg0) {
    }

    @ObfuscatedName("he.j(I)I")
    public int method3763() {
        return this.field3219 & 0x7;
    }

    @ObfuscatedName("he.z(B)I")
    public int method3764() {
        return (this.field3219 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("he.i(II)V")
    public void method3765(int arg0) {
        this.field3219 &= 0xFFFFFFF8;
        this.field3219 = (byte) (this.field3219 | arg0 & 0x7);
    }

    @ObfuscatedName("he.b(II)V")
    public void method3760(int arg0) {
        this.field3219 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3219 = (byte) (this.field3219 | 0x8);
        }
    }
}
