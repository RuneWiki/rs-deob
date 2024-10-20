package deob;

@ObfuscatedName("hr")
public class class224 {

    @ObfuscatedName("hr.e")
    public byte field3217;

    @ObfuscatedName("hr.l")
    public int field3215;

    @ObfuscatedName("hr.c")
    public int field3216;

    @ObfuscatedName("hr.h")
    public int field3214;

    @ObfuscatedName("hr.r")
    public int field3218;

    @ObfuscatedName("hr.a")
    public int field3219;

    public class224() {
    }

    public class224(class123 arg0, boolean arg1) {
        this.field3217 = arg0.method2465();
        this.field3215 = arg0.method2466();
        this.field3216 = arg0.method2468();
        this.field3214 = arg0.method2468();
        this.field3218 = arg0.method2468();
        this.field3219 = arg0.method2468();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method2464();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method3838(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method2464();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field2062--;
                    if (arg0.method2466() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method2468();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("hr.e(Ljava/lang/Integer;B)V")
    public void method3838(Integer arg0) {
    }

    @ObfuscatedName("hr.l(I)I")
    public int method3850() {
        return this.field3217 & 0x7;
    }

    @ObfuscatedName("hr.c(I)I")
    public int method3840() {
        return (this.field3217 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hr.h(II)V")
    public void method3839(int arg0) {
        this.field3217 &= 0xFFFFFFF8;
        this.field3217 = (byte) (this.field3217 | arg0 & 0x7);
    }

    @ObfuscatedName("hr.r(II)V")
    public void method3845(int arg0) {
        this.field3217 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3217 = (byte) (this.field3217 | 0x8);
        }
    }
}
