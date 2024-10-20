package deob;

@ObfuscatedName("f")
public class class5 {

    @ObfuscatedName("f.u")
    public byte field36;

    @ObfuscatedName("f.x")
    public int field33;

    @ObfuscatedName("f.i")
    public int field34;

    @ObfuscatedName("f.a")
    public int field35;

    @ObfuscatedName("f.f")
    public int field39;

    @ObfuscatedName("f.c")
    public int field37;

    public class5() {
    }

    public class5(class154 arg0, boolean arg1) {
        this.field36 = arg0.method2754();
        this.field33 = arg0.method2581();
        this.field34 = arg0.method2593();
        this.field35 = arg0.method2593();
        this.field39 = arg0.method2593();
        this.field37 = arg0.method2593();
        if (arg1) {
            this.method47(method1263(arg0));
        }
    }

    @ObfuscatedName("bh.u(Len;I)Ljava/lang/Integer;")
    public static Integer method1263(class154 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2708();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2708();
                if (var4 == 255) {
                    break;
                }
                arg0.field2073--;
                if (arg0.method2581() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2593();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("f.x(Ljava/lang/Integer;I)V")
    public void method47(Integer arg0) {
    }

    @ObfuscatedName("f.i(B)I")
    public int method45() {
        return this.field36 & 0x7;
    }

    @ObfuscatedName("f.a(I)I")
    public int method52() {
        return (this.field36 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("f.c(II)V")
    public void method63(int arg0) {
        this.field36 &= 0xFFFFFFF8;
        this.field36 = (byte) (this.field36 | arg0 & 0x7);
    }

    @ObfuscatedName("f.g(II)V")
    public void method48(int arg0) {
        this.field36 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field36 = (byte) (this.field36 | 0x8);
        }
    }
}
