package deob;

@ObfuscatedName("hc")
public class class220 {

    @ObfuscatedName("hc.f")
    public byte field3160;

    @ObfuscatedName("hc.s")
    public int field3156;

    @ObfuscatedName("hc.q")
    public int field3157;

    @ObfuscatedName("hc.g")
    public int field3158;

    @ObfuscatedName("hc.m")
    public int field3159;

    @ObfuscatedName("hc.t")
    public int field3155;

    public class220() {
    }

    public class220(class119 arg0, boolean arg1) {
        this.field3160 = arg0.method2364();
        this.field3156 = arg0.method2353();
        this.field3157 = arg0.method2368();
        this.field3158 = arg0.method2368();
        this.field3159 = arg0.method2368();
        this.field3155 = arg0.method2368();
        if (arg1) {
            this.method3730(method554(arg0));
        }
    }

    @ObfuscatedName("a.f(Ldn;B)Ljava/lang/Integer;")
    public static Integer method554(class119 arg0) {
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
                arg0.field1994--;
                if (arg0.method2353() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2368();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("hc.s(Ljava/lang/Integer;B)V")
    public void method3730(Integer arg0) {
    }

    @ObfuscatedName("hc.q(I)I")
    public int method3737() {
        return this.field3160 & 0x7;
    }

    @ObfuscatedName("hc.g(I)I")
    public int method3732() {
        return (this.field3160 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hc.m(II)V")
    public void method3733(int arg0) {
        this.field3160 &= 0xFFFFFFF8;
        this.field3160 = (byte) (this.field3160 | arg0 & 0x7);
    }

    @ObfuscatedName("hc.t(IB)V")
    public void method3734(int arg0) {
        this.field3160 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3160 = (byte) (this.field3160 | 0x8);
        }
    }
}
