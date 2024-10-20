package deob;

@ObfuscatedName("lh")
public class class325 {

    @ObfuscatedName("lh.v")
    public byte field4030;

    @ObfuscatedName("lh.c")
    public int field4028;

    @ObfuscatedName("lh.i")
    public int field4027;

    @ObfuscatedName("lh.f")
    public int field4033;

    @ObfuscatedName("lh.b")
    public int field4029;

    @ObfuscatedName("lh.n")
    public int field4031;

    public class325() {
    }

    public class325(class438 arg0, boolean arg1) {
        this.field4030 = arg0.method7093();
        this.field4028 = arg0.method7148();
        this.field4027 = arg0.method6976();
        this.field4033 = arg0.method6976();
        this.field4029 = arg0.method6976();
        this.field4031 = arg0.method6976();
        if (arg1) {
            this.method5437(method2238(arg0));
        }
    }

    @ObfuscatedName("ci.v(Lpi;B)Ljava/lang/Integer;")
    public static Integer method2238(class438 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method6971();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method6971();
                if (var4 == 255) {
                    break;
                }
                arg0.field4621--;
                if (arg0.method7148() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method6976();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("lh.c(Ljava/lang/Integer;I)V")
    public void method5437(Integer arg0) {
    }

    @ObfuscatedName("lh.i(S)I")
    public int method5438() {
        return this.field4030 & 0x7;
    }

    @ObfuscatedName("lh.f(B)I")
    public int method5446() {
        return (this.field4030 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("lh.b(II)V")
    public void method5441(int arg0) {
        this.field4030 &= 0xFFFFFFF8;
        this.field4030 = (byte) (this.field4030 | arg0 & 0x7);
    }

    @ObfuscatedName("lh.n(II)V")
    public void method5448(int arg0) {
        this.field4030 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field4030 = (byte) (this.field4030 | 0x8);
        }
    }
}
