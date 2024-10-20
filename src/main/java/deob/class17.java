package deob;

@ObfuscatedName("f")
public class class17 {

    @ObfuscatedName("f.d")
    public byte field295;

    @ObfuscatedName("f.x")
    public int field296;

    @ObfuscatedName("f.k")
    public int field293;

    @ObfuscatedName("f.z")
    public int field294;

    @ObfuscatedName("f.v")
    public int field297;

    @ObfuscatedName("f.m")
    public int field298;

    public class17() {
    }

    public class17(class181 arg0, boolean arg1) {
        this.field295 = arg0.method3236();
        this.field296 = arg0.method3179();
        this.field293 = arg0.method3041();
        this.field294 = arg0.method3041();
        this.field297 = arg0.method3041();
        this.field298 = arg0.method3041();
        if (arg1) {
            this.method99(method46(arg0));
        }
    }

    @ObfuscatedName("p.d(Lfr;I)Ljava/lang/Integer;")
    public static Integer method46(class181 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method3204();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method3204();
                if (var4 == 255) {
                    break;
                }
                arg0.field2498--;
                if (arg0.method3179() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method3041();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("f.x(Ljava/lang/Integer;B)V")
    public void method99(Integer arg0) {
    }

    @ObfuscatedName("f.k(I)I")
    public int method100() {
        return this.field295 & 0x7;
    }

    @ObfuscatedName("f.z(S)I")
    public int method101() {
        return (this.field295 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("f.v(II)V")
    public void method102(int arg0) {
        this.field295 &= 0xFFFFFFF8;
        this.field295 = (byte) (this.field295 | arg0 & 0x7);
    }

    @ObfuscatedName("f.m(IB)V")
    public void method103(int arg0) {
        this.field295 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field295 = (byte) (this.field295 | 0x8);
        }
    }
}
