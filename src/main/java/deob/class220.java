package deob;

@ObfuscatedName("ht")
public class class220 {

    @ObfuscatedName("ht.g")
    public byte field3156;

    @ObfuscatedName("ht.b")
    public int field3153;

    @ObfuscatedName("ht.w")
    public int field3152;

    @ObfuscatedName("ht.d")
    public int field3151;

    @ObfuscatedName("ht.z")
    public int field3154;

    @ObfuscatedName("ht.l")
    public int field3150;

    public class220() {
    }

    public class220(class119 arg0, boolean arg1) {
        this.field3156 = arg0.method2391();
        this.field3153 = arg0.method2376();
        this.field3152 = arg0.method2367();
        this.field3151 = arg0.method2367();
        this.field3154 = arg0.method2367();
        this.field3150 = arg0.method2367();
        if (arg1) {
            this.method3785(method2609(arg0));
        }
    }

    @ObfuscatedName("dv.g(Ldm;I)Ljava/lang/Integer;")
    public static Integer method2609(class119 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2362();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2362();
                if (var4 == 255) {
                    break;
                }
                arg0.field1977--;
                if (arg0.method2376() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2367();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("ht.b(Ljava/lang/Integer;B)V")
    public void method3785(Integer arg0) {
    }

    @ObfuscatedName("ht.w(I)I")
    public int method3771() {
        return this.field3156 & 0x7;
    }

    @ObfuscatedName("ht.d(I)I")
    public int method3772() {
        return (this.field3156 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("ht.z(IB)V")
    public void method3773(int arg0) {
        this.field3156 &= 0xFFFFFFF8;
        this.field3156 = (byte) (this.field3156 | arg0 & 0x7);
    }

    @ObfuscatedName("ht.l(II)V")
    public void method3774(int arg0) {
        this.field3156 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3156 = (byte) (this.field3156 | 0x8);
        }
    }
}
