package deob;

@ObfuscatedName("gc")
public class class203 {

    @ObfuscatedName("gc.p")
    public byte field2960;

    @ObfuscatedName("gc.y")
    public int field2965;

    @ObfuscatedName("gc.d")
    public int field2961;

    @ObfuscatedName("gc.c")
    public int field2963;

    @ObfuscatedName("gc.r")
    public int field2964;

    @ObfuscatedName("gc.f")
    public int field2967;

    public class203() {
    }

    public class203(class110 arg0, boolean arg1) {
        this.field2960 = arg0.method2125();
        this.field2965 = arg0.method2243();
        this.field2961 = arg0.method2164();
        this.field2963 = arg0.method2164();
        this.field2964 = arg0.method2164();
        this.field2967 = arg0.method2164();
        if (arg1) {
            this.method3419(method2860(arg0));
        }
    }

    @ObfuscatedName("er.p(Ldg;B)Ljava/lang/Integer;")
    public static Integer method2860(class110 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2309();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2309();
                if (var4 == 255) {
                    break;
                }
                arg0.field1842--;
                if (arg0.method2243() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2164();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("gc.y(Ljava/lang/Integer;I)V")
    public void method3419(Integer arg0) {
    }

    @ObfuscatedName("gc.d(I)I")
    public int method3421() {
        return this.field2960 & 0x7;
    }

    @ObfuscatedName("gc.c(B)I")
    public int method3436() {
        return (this.field2960 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("gc.r(IS)V")
    public void method3435(int arg0) {
        this.field2960 &= 0xFFFFFFF8;
        this.field2960 = (byte) (this.field2960 | arg0 & 0x7);
    }

    @ObfuscatedName("gc.f(II)V")
    public void method3424(int arg0) {
        this.field2960 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field2960 = (byte) (this.field2960 | 0x8);
        }
    }
}
