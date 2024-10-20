package deob;

@ObfuscatedName("o")
public class class17 {

    @ObfuscatedName("o.a")
    public byte field306;

    @ObfuscatedName("o.j")
    public int field303;

    @ObfuscatedName("o.n")
    public int field305;

    @ObfuscatedName("o.r")
    public int field311;

    @ObfuscatedName("o.v")
    public int field307;

    @ObfuscatedName("o.e")
    public int field304;

    public class17() {
    }

    public class17(class174 arg0, boolean arg1) {
        this.field306 = arg0.method2872();
        this.field303 = arg0.method2873();
        this.field305 = arg0.method2876();
        this.field311 = arg0.method2876();
        this.field307 = arg0.method2876();
        this.field304 = arg0.method2876();
        if (arg1) {
            this.method89(method157(arg0));
        }
    }

    @ObfuscatedName("d.a(Lfe;I)Ljava/lang/Integer;")
    public static Integer method157(class174 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2871();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2871();
                if (var4 == 255) {
                    break;
                }
                arg0.field2394--;
                if (arg0.method2873() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2876();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("o.j(Ljava/lang/Integer;I)V")
    public void method89(Integer arg0) {
    }

    @ObfuscatedName("o.n(I)I")
    public int method88() {
        return this.field306 & 0x7;
    }

    @ObfuscatedName("o.r(I)I")
    public int method91() {
        return (this.field306 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("o.v(II)V")
    public void method107(int arg0) {
        this.field306 &= 0xFFFFFFF8;
        this.field306 = (byte) (this.field306 | arg0 & 0x7);
    }

    @ObfuscatedName("o.e(II)V")
    public void method104(int arg0) {
        this.field306 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field306 = (byte) (this.field306 | 0x8);
        }
    }
}
