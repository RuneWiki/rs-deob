package deob;

@ObfuscatedName("i")
public class class5 {

    @ObfuscatedName("i.y")
    public byte field31;

    @ObfuscatedName("i.c")
    public int field28;

    @ObfuscatedName("i.n")
    public int field34;

    @ObfuscatedName("i.u")
    public int field38;

    @ObfuscatedName("i.i")
    public int field29;

    @ObfuscatedName("i.r")
    public int field32;

    public class5() {
    }

    public class5(class185 arg0, boolean arg1) {
        this.field31 = arg0.method3319();
        this.field28 = arg0.method3280();
        this.field34 = arg0.method3374();
        this.field38 = arg0.method3374();
        this.field29 = arg0.method3374();
        this.field32 = arg0.method3374();
        if (arg1) {
            this.method35(method3231(arg0));
        }
    }

    @ObfuscatedName("fd.y(Lge;B)Ljava/lang/Integer;")
    public static Integer method3231(class185 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method3299();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method3299();
                if (var4 == 255) {
                    break;
                }
                arg0.field2374--;
                if (arg0.method3280() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method3374();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("i.c(Ljava/lang/Integer;B)V")
    public void method35(Integer arg0) {
    }

    @ObfuscatedName("i.n(B)I")
    public int method36() {
        return this.field31 & 0x7;
    }

    @ObfuscatedName("i.u(I)I")
    public int method37() {
        return (this.field31 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("i.i(II)V")
    public void method54(int arg0) {
        this.field31 &= 0xFFFFFFF8;
        this.field31 = (byte) (this.field31 | arg0 & 0x7);
    }

    @ObfuscatedName("i.p(II)V")
    public void method39(int arg0) {
        this.field31 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field31 = (byte) (this.field31 | 0x8);
        }
    }
}
