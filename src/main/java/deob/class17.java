package deob;

@ObfuscatedName("a")
public class class17 {

    @ObfuscatedName("a.j")
    public byte field305;

    @ObfuscatedName("a.h")
    public int field304;

    @ObfuscatedName("a.f")
    public int field309;

    @ObfuscatedName("a.p")
    public int field310;

    @ObfuscatedName("a.x")
    public int field307;

    @ObfuscatedName("a.g")
    public int field308;

    public class17() {
    }

    public class17(class175 arg0, boolean arg1) {
        this.field305 = arg0.method2980();
        this.field304 = arg0.method3023();
        this.field309 = arg0.method2908();
        this.field310 = arg0.method2908();
        this.field307 = arg0.method2908();
        this.field308 = arg0.method2908();
        if (arg1) {
            this.method88(method3759(arg0));
        }
    }

    @ObfuscatedName("hb.j(Lfb;I)Ljava/lang/Integer;")
    public static Integer method3759(class175 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2903();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2903();
                if (var4 == 255) {
                    break;
                }
                arg0.field2394--;
                if (arg0.method3023() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2908();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("a.h(Ljava/lang/Integer;I)V")
    public void method88(Integer arg0) {
    }

    @ObfuscatedName("a.f(B)I")
    public int method89() {
        return this.field305 & 0x7;
    }

    @ObfuscatedName("a.p(B)I")
    public int method90() {
        return (this.field305 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("a.x(IB)V")
    public void method91(int arg0) {
        this.field305 &= 0xFFFFFFF8;
        this.field305 = (byte) (this.field305 | arg0 & 0x7);
    }

    @ObfuscatedName("a.g(II)V")
    public void method92(int arg0) {
        this.field305 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field305 = (byte) (this.field305 | 0x8);
        }
    }
}
