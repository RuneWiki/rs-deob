package deob;

@ObfuscatedName("f")
public class class17 {

    @ObfuscatedName("f.g")
    public byte field306;

    @ObfuscatedName("f.e")
    public int field301;

    @ObfuscatedName("f.b")
    public int field302;

    @ObfuscatedName("f.z")
    public int field303;

    @ObfuscatedName("f.n")
    public int field308;

    @ObfuscatedName("f.l")
    public int field305;

    public class17() {
    }

    public class17(class195 arg0, boolean arg1) {
        this.field306 = arg0.method3309();
        this.field301 = arg0.method3310();
        this.field302 = arg0.method3472();
        this.field303 = arg0.method3472();
        this.field308 = arg0.method3472();
        this.field305 = arg0.method3472();
        if (arg1) {
            this.method100(method2481(arg0));
        }
    }

    @ObfuscatedName("dx.g(Lgg;B)Ljava/lang/Integer;")
    public static Integer method2481(class195 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method3332();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method3332();
                if (var4 == 255) {
                    break;
                }
                arg0.field2562--;
                if (arg0.method3310() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method3472();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("f.e(Ljava/lang/Integer;B)V")
    public void method100(Integer arg0) {
    }

    @ObfuscatedName("f.b(I)I")
    public int method101() {
        return this.field306 & 0x7;
    }

    @ObfuscatedName("f.z(B)I")
    public int method104() {
        return (this.field306 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("f.n(IS)V")
    public void method103(int arg0) {
        this.field306 &= 0xFFFFFFF8;
        this.field306 = (byte) (this.field306 | arg0 & 0x7);
    }

    @ObfuscatedName("f.l(II)V")
    public void method102(int arg0) {
        this.field306 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field306 = (byte) (this.field306 | 0x8);
        }
    }
}
