package deob;

@ObfuscatedName("l")
public class class17 {

    @ObfuscatedName("l.s")
    public byte field313;

    @ObfuscatedName("l.c")
    public int field318;

    @ObfuscatedName("l.f")
    public int field314;

    @ObfuscatedName("l.m")
    public int field315;

    @ObfuscatedName("l.h")
    public int field316;

    @ObfuscatedName("l.t")
    public int field317;

    public class17() {
    }

    public class17(class177 arg0, boolean arg1) {
        this.field313 = arg0.method2966();
        this.field318 = arg0.method2967();
        this.field314 = arg0.method2970();
        this.field315 = arg0.method2970();
        this.field316 = arg0.method2970();
        this.field317 = arg0.method2970();
        if (arg1) {
            this.method99(method1463(arg0));
        }
    }

    @ObfuscatedName("cu.s(Lfs;B)Ljava/lang/Integer;")
    public static Integer method1463(class177 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2965();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2965();
                if (var4 == 255) {
                    break;
                }
                arg0.field2402--;
                if (arg0.method2967() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2970();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("l.c(Ljava/lang/Integer;S)V")
    public void method99(Integer arg0) {
    }

    @ObfuscatedName("l.f(B)I")
    public int method102() {
        return this.field313 & 0x7;
    }

    @ObfuscatedName("l.m(I)I")
    public int method100() {
        return (this.field313 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("l.h(IB)V")
    public void method108(int arg0) {
        this.field313 &= 0xFFFFFFF8;
        this.field313 = (byte) (this.field313 | arg0 & 0x7);
    }

    @ObfuscatedName("l.t(II)V")
    public void method113(int arg0) {
        this.field313 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field313 = (byte) (this.field313 | 0x8);
        }
    }
}
