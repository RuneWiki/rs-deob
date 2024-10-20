package deob;

@ObfuscatedName("y")
public class class5 {

    @ObfuscatedName("y.x")
    public byte field29;

    @ObfuscatedName("y.n")
    public int field26;

    @ObfuscatedName("y.g")
    public int field27;

    @ObfuscatedName("y.v")
    public int field28;

    @ObfuscatedName("y.y")
    public int field30;

    @ObfuscatedName("y.p")
    public int field36;

    public class5() {
    }

    public class5(class154 arg0, boolean arg1) {
        this.field29 = arg0.method2788();
        this.field26 = arg0.method2833();
        this.field27 = arg0.method2803();
        this.field28 = arg0.method2803();
        this.field30 = arg0.method2803();
        this.field36 = arg0.method2803();
        if (arg1) {
            this.method47(method163(arg0));
        }
    }

    @ObfuscatedName("k.x(Leq;B)Ljava/lang/Integer;")
    public static Integer method163(class154 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2878();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2878();
                if (var4 == 255) {
                    break;
                }
                arg0.field2087--;
                if (arg0.method2833() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2803();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("y.n(Ljava/lang/Integer;B)V")
    public void method47(Integer arg0) {
    }

    @ObfuscatedName("y.g(I)I")
    public int method55() {
        return this.field29 & 0x7;
    }

    @ObfuscatedName("y.v(I)I")
    public int method51() {
        return (this.field29 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("y.y(II)V")
    public void method52(int arg0) {
        this.field29 &= 0xFFFFFFF8;
        this.field29 = (byte) (this.field29 | arg0 & 0x7);
    }

    @ObfuscatedName("y.p(II)V")
    public void method71(int arg0) {
        this.field29 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field29 = (byte) (this.field29 | 0x8);
        }
    }
}
