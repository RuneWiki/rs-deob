package deob;

@ObfuscatedName("j")
public class class19 {

    @ObfuscatedName("j.f")
    public byte field94;

    @ObfuscatedName("j.b")
    public int field85;

    @ObfuscatedName("j.l")
    public int field84;

    @ObfuscatedName("j.m")
    public int field87;

    @ObfuscatedName("j.z")
    public int field90;

    @ObfuscatedName("j.q")
    public int field89;

    public class19() {
    }

    public class19(class311 arg0, boolean arg1) {
        this.field94 = arg0.method5181();
        this.field85 = arg0.method5163();
        this.field84 = arg0.method5330();
        this.field87 = arg0.method5330();
        this.field90 = arg0.method5330();
        this.field89 = arg0.method5330();
        if (arg1) {
            this.method154(method2949(arg0));
        }
    }

    @ObfuscatedName("ei.f(Lkb;I)Ljava/lang/Integer;")
    public static Integer method2949(class311 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method5276();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method5276();
                if (var4 == 255) {
                    break;
                }
                arg0.field3741--;
                if (arg0.method5163() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method5330();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("j.b(Ljava/lang/Integer;I)V")
    public void method154(Integer arg0) {
    }

    @ObfuscatedName("j.l(I)I")
    public int method155() {
        return this.field94 & 0x7;
    }

    @ObfuscatedName("j.m(I)I")
    public int method156() {
        return (this.field94 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("j.z(II)V")
    public void method157(int arg0) {
        this.field94 &= 0xFFFFFFF8;
        this.field94 = (byte) (this.field94 | arg0 & 0x7);
    }

    @ObfuscatedName("j.q(II)V")
    public void method174(int arg0) {
        this.field94 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field94 = (byte) (this.field94 | 0x8);
        }
    }
}
