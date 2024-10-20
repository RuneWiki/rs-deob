package deob;

@ObfuscatedName("hh")
public class class220 {

    @ObfuscatedName("hh.n")
    public byte field3163;

    @ObfuscatedName("hh.q")
    public int field3160;

    @ObfuscatedName("hh.c")
    public int field3161;

    @ObfuscatedName("hh.l")
    public int field3164;

    @ObfuscatedName("hh.r")
    public int field3159;

    @ObfuscatedName("hh.u")
    public int field3162;

    public class220() {
    }

    public class220(class119 arg0, boolean arg1) {
        this.field3163 = arg0.method2512();
        this.field3160 = arg0.method2430();
        this.field3161 = arg0.method2365();
        this.field3164 = arg0.method2365();
        this.field3159 = arg0.method2365();
        this.field3162 = arg0.method2365();
        if (arg1) {
            this.method3723(method3277(arg0));
        }
    }

    @ObfuscatedName("fk.n(Ldc;B)Ljava/lang/Integer;")
    public static Integer method3277(class119 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2360();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2360();
                if (var4 == 255) {
                    break;
                }
                arg0.field1982--;
                if (arg0.method2430() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2365();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("hh.q(Ljava/lang/Integer;I)V")
    public void method3723(Integer arg0) {
    }

    @ObfuscatedName("hh.c(S)I")
    public int method3727() {
        return this.field3163 & 0x7;
    }

    @ObfuscatedName("hh.l(B)I")
    public int method3724() {
        return (this.field3163 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hh.r(II)V")
    public void method3725(int arg0) {
        this.field3163 &= 0xFFFFFFF8;
        this.field3163 = (byte) (this.field3163 | arg0 & 0x7);
    }

    @ObfuscatedName("hh.u(IB)V")
    public void method3726(int arg0) {
        this.field3163 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3163 = (byte) (this.field3163 | 0x8);
        }
    }
}
