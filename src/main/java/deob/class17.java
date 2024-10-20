package deob;

@ObfuscatedName("v")
public class class17 {

    @ObfuscatedName("v.o")
    public byte field315;

    @ObfuscatedName("v.k")
    public int field307;

    @ObfuscatedName("v.t")
    public int field317;

    @ObfuscatedName("v.d")
    public int field310;

    @ObfuscatedName("v.h")
    public int field311;

    @ObfuscatedName("v.m")
    public int field312;

    public class17() {
    }

    public class17(class195 arg0, boolean arg1) {
        this.field315 = arg0.method3210();
        this.field307 = arg0.method3207();
        this.field317 = arg0.method3254();
        this.field310 = arg0.method3254();
        this.field311 = arg0.method3254();
        this.field312 = arg0.method3254();
        if (arg1) {
            this.method101(method1786(arg0));
        }
    }

    @ObfuscatedName("cc.o(Lgc;I)Ljava/lang/Integer;")
    public static Integer method1786(class195 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method3205();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method3205();
                if (var4 == 255) {
                    break;
                }
                arg0.field2575--;
                if (arg0.method3207() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method3254();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("v.k(Ljava/lang/Integer;I)V")
    public void method101(Integer arg0) {
    }

    @ObfuscatedName("v.t(I)I")
    public int method96() {
        return this.field315 & 0x7;
    }

    @ObfuscatedName("v.d(I)I")
    public int method104() {
        return (this.field315 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("v.h(II)V")
    public void method98(int arg0) {
        this.field315 &= 0xFFFFFFF8;
        this.field315 = (byte) (this.field315 | arg0 & 0x7);
    }

    @ObfuscatedName("v.m(IB)V")
    public void method93(int arg0) {
        this.field315 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field315 = (byte) (this.field315 | 0x8);
        }
    }
}
