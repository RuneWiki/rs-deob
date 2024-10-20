package deob;

@ObfuscatedName("hr")
public class class210 {

    @ObfuscatedName("hr.e")
    public byte field3027;

    @ObfuscatedName("hr.a")
    public int field3032;

    @ObfuscatedName("hr.l")
    public int field3026;

    @ObfuscatedName("hr.c")
    public int field3029;

    @ObfuscatedName("hr.u")
    public int field3030;

    @ObfuscatedName("hr.w")
    public int field3031;

    public class210() {
    }

    public class210(class111 arg0, boolean arg1) {
        this.field3027 = arg0.method2162();
        this.field3032 = arg0.method2178();
        this.field3026 = arg0.method2378();
        this.field3029 = arg0.method2378();
        this.field3030 = arg0.method2378();
        this.field3031 = arg0.method2378();
        if (arg1) {
            this.method3551(method41(arg0));
        }
    }

    @ObfuscatedName("u.e(Ldh;I)Ljava/lang/Integer;")
    public static Integer method41(class111 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2176();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2176();
                if (var4 == 255) {
                    break;
                }
                arg0.field1834--;
                if (arg0.method2178() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2378();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("hr.a(Ljava/lang/Integer;I)V")
    public void method3551(Integer arg0) {
    }

    @ObfuscatedName("hr.l(I)I")
    public int method3539() {
        return this.field3027 & 0x7;
    }

    @ObfuscatedName("hr.c(B)I")
    public int method3542() {
        return (this.field3027 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hr.u(II)V")
    public void method3543(int arg0) {
        this.field3027 &= 0xFFFFFFF8;
        this.field3027 = (byte) (this.field3027 | arg0 & 0x7);
    }

    @ObfuscatedName("hr.w(II)V")
    public void method3544(int arg0) {
        this.field3027 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3027 = (byte) (this.field3027 | 0x8);
        }
    }
}
