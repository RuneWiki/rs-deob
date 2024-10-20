package deob;

@ObfuscatedName("r")
public class class5 {

    @ObfuscatedName("r.f")
    public byte field44;

    @ObfuscatedName("r.i")
    public int field39;

    @ObfuscatedName("r.u")
    public int field36;

    @ObfuscatedName("r.h")
    public int field38;

    @ObfuscatedName("r.r")
    public int field45;

    @ObfuscatedName("r.o")
    public int field37;

    public class5() {
    }

    public class5(class154 arg0, boolean arg1) {
        this.field44 = arg0.method2667();
        this.field39 = arg0.method2668();
        this.field36 = arg0.method2695();
        this.field38 = arg0.method2695();
        this.field45 = arg0.method2695();
        this.field37 = arg0.method2695();
        if (arg1) {
            this.method43(method587(arg0));
        }
    }

    @ObfuscatedName("aq.f(Leo;I)Ljava/lang/Integer;")
    public static Integer method587(class154 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2666();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2666();
                if (var4 == 255) {
                    break;
                }
                arg0.field2111--;
                if (arg0.method2668() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2695();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("r.i(Ljava/lang/Integer;I)V")
    public void method43(Integer arg0) {
    }

    @ObfuscatedName("r.u(B)I")
    public int method32() {
        return this.field44 & 0x7;
    }

    @ObfuscatedName("r.r(I)I")
    public int method46() {
        return (this.field44 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("r.o(II)V")
    public void method34(int arg0) {
        this.field44 &= 0xFFFFFFF8;
        this.field44 = (byte) (this.field44 | arg0 & 0x7);
    }

    @ObfuscatedName("r.l(II)V")
    public void method35(int arg0) {
        this.field44 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field44 = (byte) (this.field44 | 0x8);
        }
    }
}
