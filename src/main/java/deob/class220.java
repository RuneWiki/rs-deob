package deob;

@ObfuscatedName("hw")
public class class220 {

    @ObfuscatedName("hw.i")
    public byte field3157;

    @ObfuscatedName("hw.v")
    public int field3153;

    @ObfuscatedName("hw.r")
    public int field3154;

    @ObfuscatedName("hw.n")
    public int field3155;

    @ObfuscatedName("hw.x")
    public int field3156;

    @ObfuscatedName("hw.q")
    public int field3152;

    public class220() {
    }

    public class220(class119 arg0, boolean arg1) {
        this.field3157 = arg0.method2346();
        this.field3153 = arg0.method2347();
        this.field3154 = arg0.method2350();
        this.field3155 = arg0.method2350();
        this.field3156 = arg0.method2350();
        this.field3152 = arg0.method2350();
        if (arg1) {
            this.method3697(method52(arg0));
        }
    }

    @ObfuscatedName("x.i(Ldx;I)Ljava/lang/Integer;")
    public static Integer method52(class119 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2380();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2380();
                if (var4 == 255) {
                    break;
                }
                arg0.field1980--;
                if (arg0.method2347() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2350();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("hw.v(Ljava/lang/Integer;B)V")
    public void method3697(Integer arg0) {
    }

    @ObfuscatedName("hw.r(I)I")
    public int method3711() {
        return this.field3157 & 0x7;
    }

    @ObfuscatedName("hw.n(I)I")
    public int method3696() {
        return (this.field3157 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hw.x(II)V")
    public void method3700(int arg0) {
        this.field3157 &= 0xFFFFFFF8;
        this.field3157 = (byte) (this.field3157 | arg0 & 0x7);
    }

    @ObfuscatedName("hw.q(II)V")
    public void method3701(int arg0) {
        this.field3157 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3157 = (byte) (this.field3157 | 0x8);
        }
    }
}
