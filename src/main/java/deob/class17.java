package deob;

@ObfuscatedName("a")
public class class17 {

    @ObfuscatedName("a.n")
    public byte field296;

    @ObfuscatedName("a.v")
    public int field290;

    @ObfuscatedName("a.y")
    public int field291;

    @ObfuscatedName("a.r")
    public int field292;

    @ObfuscatedName("a.h")
    public int field293;

    @ObfuscatedName("a.d")
    public int field294;

    public class17() {
    }

    public class17(class185 arg0, boolean arg1) {
        this.field296 = arg0.method3022();
        this.field290 = arg0.method3015();
        this.field291 = arg0.method3026();
        this.field292 = arg0.method3026();
        this.field293 = arg0.method3026();
        this.field294 = arg0.method3026();
        if (arg1) {
            this.method92(method100(arg0));
        }
    }

    @ObfuscatedName("a.n(Lgv;B)Ljava/lang/Integer;")
    public static Integer method100(class185 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method3021();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method3021();
                if (var4 == 255) {
                    break;
                }
                arg0.field2529--;
                if (arg0.method3015() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method3026();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("a.v(Ljava/lang/Integer;I)V")
    public void method92(Integer arg0) {
    }

    @ObfuscatedName("a.y(B)I")
    public int method93() {
        return this.field296 & 0x7;
    }

    @ObfuscatedName("a.r(I)I")
    public int method94() {
        return (this.field296 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("a.h(II)V")
    public void method95(int arg0) {
        this.field296 &= 0xFFFFFFF8;
        this.field296 = (byte) (this.field296 | arg0 & 0x7);
    }

    @ObfuscatedName("a.d(II)V")
    public void method98(int arg0) {
        this.field296 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field296 = (byte) (this.field296 | 0x8);
        }
    }
}
