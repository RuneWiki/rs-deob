package deob;

@ObfuscatedName("k")
public class class5 {

    @ObfuscatedName("k.b")
    public byte field37;

    @ObfuscatedName("k.l")
    public int field45;

    @ObfuscatedName("k.i")
    public int field38;

    @ObfuscatedName("k.t")
    public int field39;

    @ObfuscatedName("k.k")
    public int field40;

    @ObfuscatedName("k.h")
    public int field41;

    public class5() {
    }

    public class5(class154 arg0, boolean arg1) {
        this.field37 = arg0.method2679();
        this.field45 = arg0.method2801();
        this.field38 = arg0.method2683();
        this.field39 = arg0.method2683();
        this.field40 = arg0.method2683();
        this.field41 = arg0.method2683();
        if (arg1) {
            this.method46(method2387(arg0));
        }
    }

    @ObfuscatedName("er.b(Leg;I)Ljava/lang/Integer;")
    public static Integer method2387(class154 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2678();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2678();
                if (var4 == 255) {
                    break;
                }
                arg0.field2085--;
                if (arg0.method2801() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2683();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("k.l(Ljava/lang/Integer;B)V")
    public void method46(Integer arg0) {
    }

    @ObfuscatedName("k.i(I)I")
    public int method47() {
        return this.field37 & 0x7;
    }

    @ObfuscatedName("k.t(B)I")
    public int method48() {
        return (this.field37 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("k.k(IS)V")
    public void method49(int arg0) {
        this.field37 &= 0xFFFFFFF8;
        this.field37 = (byte) (this.field37 | arg0 & 0x7);
    }

    @ObfuscatedName("k.x(II)V")
    public void method70(int arg0) {
        this.field37 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field37 = (byte) (this.field37 | 0x8);
        }
    }
}
