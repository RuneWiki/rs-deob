package deob;

@ObfuscatedName("w")
public class class5 {

    @ObfuscatedName("w.k")
    public byte field42;

    @ObfuscatedName("w.y")
    public int field39;

    @ObfuscatedName("w.o")
    public int field46;

    @ObfuscatedName("w.r")
    public int field41;

    @ObfuscatedName("w.w")
    public int field38;

    @ObfuscatedName("w.j")
    public int field43;

    public class5() {
    }

    public class5(class161 arg0, boolean arg1) {
        this.field42 = arg0.method2734();
        this.field39 = arg0.method2735();
        this.field46 = arg0.method2868();
        this.field41 = arg0.method2868();
        this.field38 = arg0.method2868();
        this.field43 = arg0.method2868();
        if (arg1) {
            this.method51(method1123(arg0));
        }
    }

    @ObfuscatedName("bp.k(Lfm;I)Ljava/lang/Integer;")
    public static Integer method1123(class161 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2733();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2733();
                if (var4 == 255) {
                    break;
                }
                arg0.field2267--;
                if (arg0.method2735() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2868();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("w.y(Ljava/lang/Integer;I)V")
    public void method51(Integer arg0) {
    }

    @ObfuscatedName("w.o(I)I")
    public int method63() {
        return this.field42 & 0x7;
    }

    @ObfuscatedName("w.r(B)I")
    public int method52() {
        return (this.field42 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("w.w(II)V")
    public void method73(int arg0) {
        this.field42 &= 0xFFFFFFF8;
        this.field42 = (byte) (this.field42 | arg0 & 0x7);
    }

    @ObfuscatedName("w.j(II)V")
    public void method54(int arg0) {
        this.field42 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field42 = (byte) (this.field42 | 0x8);
        }
    }
}
