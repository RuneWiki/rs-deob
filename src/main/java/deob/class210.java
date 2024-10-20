package deob;

@ObfuscatedName("hm")
public class class210 {

    @ObfuscatedName("hm.q")
    public byte field3022;

    @ObfuscatedName("hm.s")
    public int field3018;

    @ObfuscatedName("hm.h")
    public int field3023;

    @ObfuscatedName("hm.e")
    public int field3025;

    @ObfuscatedName("hm.n")
    public int field3021;

    @ObfuscatedName("hm.t")
    public int field3020;

    public class210() {
    }

    public class210(class111 arg0, boolean arg1) {
        this.field3022 = arg0.method2149();
        this.field3018 = arg0.method2307();
        this.field3023 = arg0.method2153();
        this.field3025 = arg0.method2153();
        this.field3021 = arg0.method2153();
        this.field3020 = arg0.method2153();
        if (arg1) {
            this.method3461(method2532(arg0));
        }
    }

    @ObfuscatedName("di.q(Ldx;S)Ljava/lang/Integer;")
    public static Integer method2532(class111 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2231();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2231();
                if (var4 == 255) {
                    break;
                }
                arg0.field1852--;
                if (arg0.method2307() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2153();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("hm.s(Ljava/lang/Integer;I)V")
    public void method3461(Integer arg0) {
    }

    @ObfuscatedName("hm.h(B)I")
    public int method3474() {
        return this.field3022 & 0x7;
    }

    @ObfuscatedName("hm.e(B)I")
    public int method3463() {
        return (this.field3022 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hm.n(II)V")
    public void method3473(int arg0) {
        this.field3022 &= 0xFFFFFFF8;
        this.field3022 = (byte) (this.field3022 | arg0 & 0x7);
    }

    @ObfuscatedName("hm.t(II)V")
    public void method3464(int arg0) {
        this.field3022 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3022 = (byte) (this.field3022 | 0x8);
        }
    }
}
