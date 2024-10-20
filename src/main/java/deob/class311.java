package deob;

@ObfuscatedName("kb")
public class class311 {

    @ObfuscatedName("kb.c")
    public byte field3901;

    @ObfuscatedName("kb.b")
    public int field3906;

    @ObfuscatedName("kb.p")
    public int field3900;

    @ObfuscatedName("kb.m")
    public int field3902;

    @ObfuscatedName("kb.t")
    public int field3904;

    @ObfuscatedName("kb.s")
    public int field3905;

    public class311() {
    }

    public class311(class419 arg0, boolean arg1) {
        this.field3901 = arg0.method6846();
        this.field3906 = arg0.method6672();
        this.field3900 = arg0.method6675();
        this.field3902 = arg0.method6675();
        this.field3904 = arg0.method6675();
        this.field3905 = arg0.method6675();
        if (arg1) {
            this.method5214(method4827(arg0));
        }
    }

    @ObfuscatedName("jr.c(Lpi;I)Ljava/lang/Integer;")
    public static Integer method4827(class419 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method6781();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method6781();
                if (var4 == 255) {
                    break;
                }
                arg0.field4475--;
                if (arg0.method6672() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method6675();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("kb.b(Ljava/lang/Integer;I)V")
    public void method5214(Integer arg0) {
    }

    @ObfuscatedName("kb.p(B)I")
    public int method5215() {
        return this.field3901 & 0x7;
    }

    @ObfuscatedName("kb.m(I)I")
    public int method5216() {
        return (this.field3901 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("kb.t(II)V")
    public void method5217(int arg0) {
        this.field3901 &= 0xFFFFFFF8;
        this.field3901 = (byte) (this.field3901 | arg0 & 0x7);
    }

    @ObfuscatedName("kb.s(II)V")
    public void method5218(int arg0) {
        this.field3901 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3901 = (byte) (this.field3901 | 0x8);
        }
    }
}
