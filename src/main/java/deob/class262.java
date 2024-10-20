package deob;

@ObfuscatedName("jn")
public class class262 {

    @ObfuscatedName("jn.f")
    public byte field3328;

    @ObfuscatedName("jn.o")
    public int field3327;

    @ObfuscatedName("jn.u")
    public int field3329;

    @ObfuscatedName("jn.p")
    public int field3330;

    @ObfuscatedName("jn.b")
    public int field3331;

    @ObfuscatedName("jn.e")
    public int field3332;

    public class262() {
    }

    public class262(class382 arg0, boolean arg1) {
        this.field3328 = arg0.method6045();
        this.field3327 = arg0.method5858();
        this.field3329 = arg0.method5861();
        this.field3330 = arg0.method5861();
        this.field3331 = arg0.method5861();
        this.field3332 = arg0.method5861();
        if (arg1) {
            this.method4075(method4336(arg0));
        }
    }

    @ObfuscatedName("je.f(Lnu;I)Ljava/lang/Integer;")
    public static Integer method4336(class382 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method5856();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method5856();
                if (var4 == 255) {
                    break;
                }
                arg0.field4155--;
                if (arg0.method5858() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method5861();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("jn.o(Ljava/lang/Integer;I)V")
    public void method4075(Integer arg0) {
    }

    @ObfuscatedName("jn.u(B)I")
    public int method4073() {
        return this.field3328 & 0x7;
    }

    @ObfuscatedName("jn.p(B)I")
    public int method4077() {
        return (this.field3328 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("jn.b(IB)V")
    public void method4078(int arg0) {
        this.field3328 &= 0xFFFFFFF8;
        this.field3328 = (byte) (this.field3328 | arg0 & 0x7);
    }

    @ObfuscatedName("jn.e(II)V")
    public void method4079(int arg0) {
        this.field3328 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3328 = (byte) (this.field3328 | 0x8);
        }
    }
}
