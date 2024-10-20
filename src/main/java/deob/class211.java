package deob;

@ObfuscatedName("hh")
public class class211 {

    @ObfuscatedName("hh.n")
    public byte field3069;

    @ObfuscatedName("hh.o")
    public int field3068;

    @ObfuscatedName("hh.a")
    public int field3067;

    @ObfuscatedName("hh.w")
    public int field3070;

    @ObfuscatedName("hh.m")
    public int field3071;

    @ObfuscatedName("hh.h")
    public int field3072;

    public class211() {
    }

    public class211(class111 arg0, boolean arg1) {
        this.field3069 = arg0.method2235();
        this.field3068 = arg0.method2236();
        this.field3067 = arg0.method2239();
        this.field3070 = arg0.method2239();
        this.field3071 = arg0.method2239();
        this.field3072 = arg0.method2239();
        if (arg1) {
            this.method3617(method579(arg0));
        }
    }

    @ObfuscatedName("ag.n(Ldl;I)Ljava/lang/Integer;")
    public static Integer method579(class111 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2234();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2234();
                if (var4 == 255) {
                    break;
                }
                arg0.field1890--;
                if (arg0.method2236() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2239();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("hh.o(Ljava/lang/Integer;S)V")
    public void method3617(Integer arg0) {
    }

    @ObfuscatedName("hh.a(I)I")
    public int method3610() {
        return this.field3069 & 0x7;
    }

    @ObfuscatedName("hh.w(I)I")
    public int method3611() {
        return (this.field3069 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hh.m(IB)V")
    public void method3612(int arg0) {
        this.field3069 &= 0xFFFFFFF8;
        this.field3069 = (byte) (this.field3069 | arg0 & 0x7);
    }

    @ObfuscatedName("hh.h(II)V")
    public void method3625(int arg0) {
        this.field3069 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3069 = (byte) (this.field3069 | 0x8);
        }
    }
}
