package deob;

@ObfuscatedName("f")
public class class17 {

    @ObfuscatedName("f.b")
    public byte field284;

    @ObfuscatedName("f.q")
    public int field285;

    @ObfuscatedName("f.o")
    public int field292;

    @ObfuscatedName("f.p")
    public int field287;

    @ObfuscatedName("f.a")
    public int field288;

    @ObfuscatedName("f.h")
    public int field289;

    public class17() {
    }

    public class17(class194 arg0, boolean arg1) {
        this.field284 = arg0.method3248();
        this.field285 = arg0.method3249();
        this.field292 = arg0.method3261();
        this.field287 = arg0.method3261();
        this.field288 = arg0.method3261();
        this.field289 = arg0.method3261();
        if (arg1) {
            this.method91(method2471(arg0));
        }
    }

    @ObfuscatedName("dd.b(Lgn;I)Ljava/lang/Integer;")
    public static Integer method2471(class194 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method3247();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method3247();
                if (var4 == 255) {
                    break;
                }
                arg0.field2538--;
                if (arg0.method3249() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method3261();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("f.q(Ljava/lang/Integer;I)V")
    public void method91(Integer arg0) {
    }

    @ObfuscatedName("f.o(I)I")
    public int method92() {
        return this.field284 & 0x7;
    }

    @ObfuscatedName("f.p(I)I")
    public int method93() {
        return (this.field284 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("f.a(II)V")
    public void method94(int arg0) {
        this.field284 &= 0xFFFFFFF8;
        this.field284 = (byte) (this.field284 | arg0 & 0x7);
    }

    @ObfuscatedName("f.h(II)V")
    public void method95(int arg0) {
        this.field284 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field284 = (byte) (this.field284 | 0x8);
        }
    }
}
