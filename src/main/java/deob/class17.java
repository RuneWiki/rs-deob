package deob;

@ObfuscatedName("h")
public class class17 {

    @ObfuscatedName("h.w")
    public byte field312;

    @ObfuscatedName("h.s")
    public int field318;

    @ObfuscatedName("h.q")
    public int field320;

    @ObfuscatedName("h.o")
    public int field315;

    @ObfuscatedName("h.g")
    public int field314;

    @ObfuscatedName("h.v")
    public int field317;

    public class17() {
    }

    public class17(class174 arg0, boolean arg1) {
        this.field312 = arg0.method2972();
        this.field318 = arg0.method3178();
        this.field320 = arg0.method3131();
        this.field315 = arg0.method3131();
        this.field314 = arg0.method3131();
        this.field317 = arg0.method3131();
        if (arg1) {
            this.method87(method976(arg0));
        }
    }

    @ObfuscatedName("bn.w(Lfz;I)Ljava/lang/Integer;")
    public static Integer method976(class174 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2971();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2971();
                if (var4 == 255) {
                    break;
                }
                arg0.field2390--;
                if (arg0.method3178() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method3131();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("h.s(Ljava/lang/Integer;B)V")
    public void method87(Integer arg0) {
    }

    @ObfuscatedName("h.q(I)I")
    public int method88() {
        return this.field312 & 0x7;
    }

    @ObfuscatedName("h.o(I)I")
    public int method89() {
        return (this.field312 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("h.g(II)V")
    public void method90(int arg0) {
        this.field312 &= 0xFFFFFFF8;
        this.field312 = (byte) (this.field312 | arg0 & 0x7);
    }

    @ObfuscatedName("h.v(II)V")
    public void method91(int arg0) {
        this.field312 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field312 = (byte) (this.field312 | 0x8);
        }
    }
}
