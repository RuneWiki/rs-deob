package deob;

@ObfuscatedName("hb")
public class class220 {

    @ObfuscatedName("hb.i")
    public byte field3153;

    @ObfuscatedName("hb.v")
    public int field3149;

    @ObfuscatedName("hb.f")
    public int field3154;

    @ObfuscatedName("hb.h")
    public int field3150;

    @ObfuscatedName("hb.a")
    public int field3152;

    @ObfuscatedName("hb.s")
    public int field3155;

    public class220() {
    }

    public class220(class119 arg0, boolean arg1) {
        this.field3153 = arg0.method2311();
        this.field3149 = arg0.method2312();
        this.field3154 = arg0.method2315();
        this.field3150 = arg0.method2315();
        this.field3152 = arg0.method2315();
        this.field3155 = arg0.method2315();
        if (arg1) {
            this.method3693(method860(arg0));
        }
    }

    @ObfuscatedName("am.i(Ldj;I)Ljava/lang/Integer;")
    public static Integer method860(class119 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2310();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2310();
                if (var4 == 255) {
                    break;
                }
                arg0.field1984--;
                if (arg0.method2312() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2315();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("hb.v(Ljava/lang/Integer;I)V")
    public void method3693(Integer arg0) {
    }

    @ObfuscatedName("hb.f(I)I")
    public int method3695() {
        return this.field3153 & 0x7;
    }

    @ObfuscatedName("hb.h(I)I")
    public int method3709() {
        return (this.field3153 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hb.a(IB)V")
    public void method3699(int arg0) {
        this.field3153 &= 0xFFFFFFF8;
        this.field3153 = (byte) (this.field3153 | arg0 & 0x7);
    }

    @ObfuscatedName("hb.s(IB)V")
    public void method3697(int arg0) {
        this.field3153 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3153 = (byte) (this.field3153 | 0x8);
        }
    }
}
