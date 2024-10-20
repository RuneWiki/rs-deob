package deob;

@ObfuscatedName("k")
public class class17 {

    @ObfuscatedName("k.t")
    public byte field290;

    @ObfuscatedName("k.q")
    public int field286;

    @ObfuscatedName("k.i")
    public int field288;

    @ObfuscatedName("k.a")
    public int field294;

    @ObfuscatedName("k.l")
    public int field289;

    @ObfuscatedName("k.b")
    public int field287;

    public class17() {
    }

    public class17(class195 arg0, boolean arg1) {
        this.field290 = arg0.method3237();
        this.field286 = arg0.method3238();
        this.field288 = arg0.method3241();
        this.field294 = arg0.method3241();
        this.field289 = arg0.method3241();
        this.field287 = arg0.method3241();
        if (arg1) {
            this.method91(method4717(arg0));
        }
    }

    @ObfuscatedName("jm.t(Lgb;I)Ljava/lang/Integer;")
    public static Integer method4717(class195 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method3236();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method3236();
                if (var4 == 255) {
                    break;
                }
                arg0.field2545--;
                if (arg0.method3238() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method3241();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("k.q(Ljava/lang/Integer;I)V")
    public void method91(Integer arg0) {
    }

    @ObfuscatedName("k.i(I)I")
    public int method100() {
        return this.field290 & 0x7;
    }

    @ObfuscatedName("k.a(I)I")
    public int method93() {
        return (this.field290 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("k.l(II)V")
    public void method94(int arg0) {
        this.field290 &= 0xFFFFFFF8;
        this.field290 = (byte) (this.field290 | arg0 & 0x7);
    }

    @ObfuscatedName("k.b(II)V")
    public void method95(int arg0) {
        this.field290 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field290 = (byte) (this.field290 | 0x8);
        }
    }
}
