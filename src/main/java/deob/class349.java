package deob;

@ObfuscatedName("nd")
public class class349 {

    @ObfuscatedName("nd.aj")
    public byte field4261;

    @ObfuscatedName("nd.al")
    public int field4265;

    @ObfuscatedName("nd.ac")
    public int field4263;

    @ObfuscatedName("nd.ab")
    public int field4264;

    @ObfuscatedName("nd.an")
    public int field4262;

    @ObfuscatedName("nd.ao")
    public int field4266;

    public class349() {
    }

    public class349(class478 arg0, boolean arg1) {
        this.field4261 = arg0.method8163();
        this.field4265 = arg0.method7905();
        this.field4263 = arg0.method7908();
        this.field4264 = arg0.method7908();
        this.field4262 = arg0.method7908();
        this.field4266 = arg0.method7908();
        if (arg1) {
            this.method5992(method4199(arg0));
        }
    }

    @ObfuscatedName("if.aj(Lsy;S)Ljava/lang/Integer;")
    public static Integer method4199(class478 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method7909();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method7909();
                if (var4 == 255) {
                    break;
                }
                arg0.field4904--;
                if (arg0.method7905() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method7908();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("nd.al(Ljava/lang/Integer;I)V")
    public void method5992(Integer arg0) {
    }

    @ObfuscatedName("nd.ac(B)I")
    public int method5993() {
        return this.field4261 & 0x7;
    }

    @ObfuscatedName("nd.ab(I)I")
    public int method5994() {
        return (this.field4261 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("nd.an(II)V")
    public void method5995(int arg0) {
        this.field4261 &= 0xFFFFFFF8;
        this.field4261 = (byte) (this.field4261 | arg0 & 0x7);
    }

    @ObfuscatedName("nd.ao(II)V")
    public void method6003(int arg0) {
        this.field4261 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field4261 = (byte) (this.field4261 | 0x8);
        }
    }
}
