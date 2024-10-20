package deob;

@ObfuscatedName("kh")
public class class299 {

    @ObfuscatedName("kh.i")
    public byte field3755;

    @ObfuscatedName("kh.w")
    public int field3750;

    @ObfuscatedName("kh.s")
    public int field3752;

    @ObfuscatedName("kh.a")
    public int field3753;

    @ObfuscatedName("kh.o")
    public int field3754;

    @ObfuscatedName("kh.g")
    public int field3756;

    public class299() {
    }

    public class299(class401 arg0, boolean arg1) {
        this.field3755 = arg0.method6241();
        this.field3750 = arg0.method6242();
        this.field3752 = arg0.method6245();
        this.field3753 = arg0.method6245();
        this.field3754 = arg0.method6245();
        this.field3756 = arg0.method6245();
        if (arg1) {
            this.method4882(method2305(arg0));
        }
    }

    @ObfuscatedName("cf.i(Lop;B)Ljava/lang/Integer;")
    public static Integer method2305(class401 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method6240();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method6240();
                if (var4 == 255) {
                    break;
                }
                arg0.field4300--;
                if (arg0.method6242() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method6245();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("kh.w(Ljava/lang/Integer;I)V")
    public void method4882(Integer arg0) {
    }

    @ObfuscatedName("kh.s(I)I")
    public int method4883() {
        return this.field3755 & 0x7;
    }

    @ObfuscatedName("kh.a(I)I")
    public int method4884() {
        return (this.field3755 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("kh.o(II)V")
    public void method4885(int arg0) {
        this.field3755 &= 0xFFFFFFF8;
        this.field3755 = (byte) (this.field3755 | arg0 & 0x7);
    }

    @ObfuscatedName("kh.g(IB)V")
    public void method4886(int arg0) {
        this.field3755 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3755 = (byte) (this.field3755 | 0x8);
        }
    }
}
