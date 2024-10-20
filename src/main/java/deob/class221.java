package deob;

@ObfuscatedName("hp")
public class class221 {

    @ObfuscatedName("hp.b")
    public byte field3177;

    @ObfuscatedName("hp.g")
    public int field3174;

    @ObfuscatedName("hp.j")
    public int field3173;

    @ObfuscatedName("hp.d")
    public int field3176;

    @ObfuscatedName("hp.x")
    public int field3175;

    @ObfuscatedName("hp.y")
    public int field3178;

    public class221() {
    }

    public class221(class120 arg0, boolean arg1) {
        this.field3177 = arg0.method2345();
        this.field3174 = arg0.method2346();
        this.field3173 = arg0.method2349();
        this.field3176 = arg0.method2349();
        this.field3175 = arg0.method2349();
        this.field3178 = arg0.method2349();
        if (arg1) {
            this.method3735(method3694(arg0));
        }
    }

    @ObfuscatedName("ho.b(Lds;B)Ljava/lang/Integer;")
    public static Integer method3694(class120 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2344();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2344();
                if (var4 == 255) {
                    break;
                }
                arg0.field1977--;
                if (arg0.method2346() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2349();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("hp.g(Ljava/lang/Integer;I)V")
    public void method3735(Integer arg0) {
    }

    @ObfuscatedName("hp.j(I)I")
    public int method3737() {
        return this.field3177 & 0x7;
    }

    @ObfuscatedName("hp.d(I)I")
    public int method3729() {
        return (this.field3177 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hp.x(IS)V")
    public void method3730(int arg0) {
        this.field3177 &= 0xFFFFFFF8;
        this.field3177 = (byte) (this.field3177 | arg0 & 0x7);
    }

    @ObfuscatedName("hp.y(II)V")
    public void method3731(int arg0) {
        this.field3177 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3177 = (byte) (this.field3177 | 0x8);
        }
    }
}
