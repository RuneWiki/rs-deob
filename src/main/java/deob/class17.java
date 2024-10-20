package deob;

@ObfuscatedName("m")
public class class17 {

    @ObfuscatedName("m.e")
    public byte field307;

    @ObfuscatedName("m.n")
    public int field304;

    @ObfuscatedName("m.g")
    public int field305;

    @ObfuscatedName("m.y")
    public int field306;

    @ObfuscatedName("m.w")
    public int field303;

    @ObfuscatedName("m.k")
    public int field308;

    public class17() {
    }

    public class17(class175 arg0, boolean arg1) {
        this.field307 = arg0.method2998();
        this.field304 = arg0.method3091();
        this.field305 = arg0.method2933();
        this.field306 = arg0.method2933();
        this.field303 = arg0.method2933();
        this.field308 = arg0.method2933();
        if (arg1) {
            this.method89(method584(arg0));
        }
    }

    @ObfuscatedName("ab.e(Lfh;B)Ljava/lang/Integer;")
    public static Integer method584(class175 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2928();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2928();
                if (var4 == 255) {
                    break;
                }
                arg0.field2381--;
                if (arg0.method3091() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2933();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("m.n(Ljava/lang/Integer;B)V")
    public void method89(Integer arg0) {
    }

    @ObfuscatedName("m.g(I)I")
    public int method91() {
        return this.field307 & 0x7;
    }

    @ObfuscatedName("m.y(B)I")
    public int method95() {
        return (this.field307 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("m.w(II)V")
    public void method93(int arg0) {
        this.field307 &= 0xFFFFFFF8;
        this.field307 = (byte) (this.field307 | arg0 & 0x7);
    }

    @ObfuscatedName("m.k(II)V")
    public void method98(int arg0) {
        this.field307 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field307 = (byte) (this.field307 | 0x8);
        }
    }
}
