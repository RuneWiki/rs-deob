package deob;

@ObfuscatedName("u")
public class class5 {

    @ObfuscatedName("u.z")
    public byte field32;

    @ObfuscatedName("u.w")
    public int field30;

    @ObfuscatedName("u.s")
    public int field31;

    @ObfuscatedName("u.l")
    public int field34;

    @ObfuscatedName("u.u")
    public int field33;

    @ObfuscatedName("u.q")
    public int field29;

    public class5() {
    }

    public class5(class183 arg0, boolean arg1) {
        this.field32 = arg0.method3384();
        this.field30 = arg0.method3253();
        this.field31 = arg0.method3374();
        this.field34 = arg0.method3374();
        this.field33 = arg0.method3374();
        this.field29 = arg0.method3374();
        if (arg1) {
            this.method38(method1494(arg0));
        }
    }

    @ObfuscatedName("bb.z(Lgk;I)Ljava/lang/Integer;")
    public static Integer method1494(class183 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method3247();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method3247();
                if (var4 == 255) {
                    break;
                }
                arg0.field2340--;
                if (arg0.method3253() != 0) {
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

    @ObfuscatedName("u.w(Ljava/lang/Integer;I)V")
    public void method38(Integer arg0) {
    }

    @ObfuscatedName("u.s(I)I")
    public int method39() {
        return this.field32 & 0x7;
    }

    @ObfuscatedName("u.l(B)I")
    public int method40() {
        return (this.field32 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("u.u(II)V")
    public void method45(int arg0) {
        this.field32 &= 0xFFFFFFF8;
        this.field32 = (byte) (this.field32 | arg0 & 0x7);
    }

    @ObfuscatedName("u.q(II)V")
    public void method41(int arg0) {
        this.field32 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field32 = (byte) (this.field32 | 0x8);
        }
    }
}
