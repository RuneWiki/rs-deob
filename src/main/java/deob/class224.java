package deob;

@ObfuscatedName("hm")
public class class224 {

    @ObfuscatedName("hm.s")
    public byte field3221;

    @ObfuscatedName("hm.z")
    public int field3220;

    @ObfuscatedName("hm.t")
    public int field3222;

    @ObfuscatedName("hm.y")
    public int field3219;

    @ObfuscatedName("hm.p")
    public int field3223;

    @ObfuscatedName("hm.g")
    public int field3224;

    public class224() {
    }

    public class224(class123 arg0, boolean arg1) {
        this.field3221 = arg0.method2483();
        this.field3220 = arg0.method2550();
        this.field3222 = arg0.method2408();
        this.field3219 = arg0.method2408();
        this.field3223 = arg0.method2408();
        this.field3224 = arg0.method2408();
        if (arg1) {
            this.method3780(method2852(arg0));
        }
    }

    @ObfuscatedName("eu.s(Ldy;I)Ljava/lang/Integer;")
    public static Integer method2852(class123 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2363();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2363();
                if (var4 == 255) {
                    break;
                }
                arg0.field2028--;
                if (arg0.method2550() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2408();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("hm.z(Ljava/lang/Integer;I)V")
    public void method3780(Integer arg0) {
    }

    @ObfuscatedName("hm.t(I)I")
    public int method3764() {
        return this.field3221 & 0x7;
    }

    @ObfuscatedName("hm.y(B)I")
    public int method3769() {
        return (this.field3221 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hm.p(II)V")
    public void method3785(int arg0) {
        this.field3221 &= 0xFFFFFFF8;
        this.field3221 = (byte) (this.field3221 | arg0 & 0x7);
    }

    @ObfuscatedName("hm.g(II)V")
    public void method3770(int arg0) {
        this.field3221 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3221 = (byte) (this.field3221 | 0x8);
        }
    }
}
