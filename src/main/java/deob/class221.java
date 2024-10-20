package deob;

@ObfuscatedName("hu")
public class class221 {

    @ObfuscatedName("hu.t")
    public byte field3174;

    @ObfuscatedName("hu.i")
    public int field3173;

    @ObfuscatedName("hu.g")
    public int field3177;

    @ObfuscatedName("hu.h")
    public int field3175;

    @ObfuscatedName("hu.z")
    public int field3172;

    @ObfuscatedName("hu.r")
    public int field3176;

    public class221() {
    }

    public class221(class120 arg0, boolean arg1) {
        this.field3174 = arg0.method2309();
        this.field3173 = arg0.method2310();
        this.field3177 = arg0.method2345();
        this.field3175 = arg0.method2345();
        this.field3172 = arg0.method2345();
        this.field3176 = arg0.method2345();
        if (arg1) {
            this.method3662(method2628(arg0));
        }
    }

    @ObfuscatedName("eg.t(Ldr;I)Ljava/lang/Integer;")
    public static Integer method2628(class120 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2334();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2334();
                if (var4 == 255) {
                    break;
                }
                arg0.field2001--;
                if (arg0.method2310() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2345();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("hu.i(Ljava/lang/Integer;I)V")
    public void method3662(Integer arg0) {
    }

    @ObfuscatedName("hu.g(S)I")
    public int method3674() {
        return this.field3174 & 0x7;
    }

    @ObfuscatedName("hu.h(I)I")
    public int method3661() {
        return (this.field3174 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hu.z(II)V")
    public void method3664(int arg0) {
        this.field3174 &= 0xFFFFFFF8;
        this.field3174 = (byte) (this.field3174 | arg0 & 0x7);
    }

    @ObfuscatedName("hu.r(IS)V")
    public void method3668(int arg0) {
        this.field3174 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3174 = (byte) (this.field3174 | 0x8);
        }
    }
}
