package deob;

@ObfuscatedName("lu")
public class class324 {

    @ObfuscatedName("lu.c")
    public byte field4073;

    @ObfuscatedName("lu.v")
    public int field4067;

    @ObfuscatedName("lu.q")
    public int field4069;

    @ObfuscatedName("lu.f")
    public int field4070;

    @ObfuscatedName("lu.j")
    public int field4068;

    @ObfuscatedName("lu.e")
    public int field4072;

    public class324() {
    }

    public class324(class443 arg0, boolean arg1) {
        this.field4073 = arg0.method7048();
        this.field4067 = arg0.method7049();
        this.field4069 = arg0.method7052();
        this.field4070 = arg0.method7052();
        this.field4068 = arg0.method7052();
        this.field4072 = arg0.method7052();
        if (arg1) {
            this.method5446(method5401(arg0));
        }
    }

    @ObfuscatedName("lt.c(Lqt;I)Ljava/lang/Integer;")
    public static Integer method5401(class443 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method7047();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method7047();
                if (var4 == 255) {
                    break;
                }
                arg0.field4700--;
                if (arg0.method7049() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method7052();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("lu.v(Ljava/lang/Integer;I)V")
    public void method5446(Integer arg0) {
    }

    @ObfuscatedName("lu.q(I)I")
    public int method5447() {
        return this.field4073 & 0x7;
    }

    @ObfuscatedName("lu.f(I)I")
    public int method5463() {
        return (this.field4073 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("lu.j(II)V")
    public void method5450(int arg0) {
        this.field4073 &= 0xFFFFFFF8;
        this.field4073 = (byte) (this.field4073 | arg0 & 0x7);
    }

    @ObfuscatedName("lu.e(II)V")
    public void method5448(int arg0) {
        this.field4073 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field4073 = (byte) (this.field4073 | 0x8);
        }
    }
}
