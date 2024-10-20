package deob;

@ObfuscatedName("h")
public class class5 {

    @ObfuscatedName("h.o")
    public byte field38;

    @ObfuscatedName("h.m")
    public int field29;

    @ObfuscatedName("h.b")
    public int field31;

    @ObfuscatedName("h.g")
    public int field32;

    @ObfuscatedName("h.h")
    public int field30;

    @ObfuscatedName("h.v")
    public int field34;

    public class5() {
    }

    public class5(class154 arg0, boolean arg1) {
        this.field38 = arg0.method2553();
        this.field29 = arg0.method2554();
        this.field31 = arg0.method2557();
        this.field32 = arg0.method2557();
        this.field30 = arg0.method2557();
        this.field34 = arg0.method2557();
        if (arg1) {
            this.method43(method67(arg0));
        }
    }

    @ObfuscatedName("l.o(Lez;I)Ljava/lang/Integer;")
    public static Integer method67(class154 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2552();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2552();
                if (var4 == 255) {
                    break;
                }
                arg0.field2105--;
                if (arg0.method2554() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2557();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("h.m(Ljava/lang/Integer;I)V")
    public void method43(Integer arg0) {
    }

    @ObfuscatedName("h.b(I)I")
    public int method44() {
        return this.field38 & 0x7;
    }

    @ObfuscatedName("h.g(I)I")
    public int method45() {
        return (this.field38 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("h.l(II)V")
    public void method56(int arg0) {
        this.field38 &= 0xFFFFFFF8;
        this.field38 = (byte) (this.field38 | arg0 & 0x7);
    }

    @ObfuscatedName("h.c(II)V")
    public void method47(int arg0) {
        this.field38 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field38 = (byte) (this.field38 | 0x8);
        }
    }
}
