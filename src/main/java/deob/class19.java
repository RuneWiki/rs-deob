package deob;

@ObfuscatedName("b")
public class class19 {

    @ObfuscatedName("b.x")
    public byte field99;

    @ObfuscatedName("b.m")
    public int field96;

    @ObfuscatedName("b.k")
    public int field98;

    @ObfuscatedName("b.d")
    public int field101;

    @ObfuscatedName("b.w")
    public int field97;

    @ObfuscatedName("b.v")
    public int field100;

    public class19() {
    }

    public class19(class310 arg0, boolean arg1) {
        this.field99 = arg0.method5138();
        this.field96 = arg0.method5139();
        this.field98 = arg0.method5142();
        this.field101 = arg0.method5142();
        this.field97 = arg0.method5142();
        this.field100 = arg0.method5142();
        if (arg1) {
            this.method154(method651(arg0));
        }
    }

    @ObfuscatedName("ad.x(Lkb;I)Ljava/lang/Integer;")
    public static Integer method651(class310 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method5137();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method5137();
                if (var4 == 255) {
                    break;
                }
                arg0.field3711--;
                if (arg0.method5139() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method5142();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("b.m(Ljava/lang/Integer;I)V")
    public void method154(Integer arg0) {
    }

    @ObfuscatedName("b.k(I)I")
    public int method155() {
        return this.field99 & 0x7;
    }

    @ObfuscatedName("b.d(I)I")
    public int method156() {
        return (this.field99 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("b.w(II)V")
    public void method181(int arg0) {
        this.field99 &= 0xFFFFFFF8;
        this.field99 = (byte) (this.field99 | arg0 & 0x7);
    }

    @ObfuscatedName("b.v(II)V")
    public void method157(int arg0) {
        this.field99 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field99 = (byte) (this.field99 | 0x8);
        }
    }
}
