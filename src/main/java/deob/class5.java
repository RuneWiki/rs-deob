package deob;

@ObfuscatedName("d")
public class class5 {

    @ObfuscatedName("d.p")
    public byte field45;

    @ObfuscatedName("d.g")
    public int field41;

    @ObfuscatedName("d.x")
    public int field42;

    @ObfuscatedName("d.q")
    public int field43;

    @ObfuscatedName("d.d")
    public int field46;

    @ObfuscatedName("d.k")
    public int field40;

    public class5() {
    }

    public class5(class154 arg0, boolean arg1) {
        this.field45 = arg0.method2631();
        this.field41 = arg0.method2595();
        this.field42 = arg0.method2598();
        this.field43 = arg0.method2598();
        this.field46 = arg0.method2598();
        this.field40 = arg0.method2598();
        if (arg1) {
            this.method56(method451(arg0));
        }
    }

    @ObfuscatedName("client.p(Lev;B)Ljava/lang/Integer;")
    public static Integer method451(class154 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2593();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2593();
                if (var4 == 255) {
                    break;
                }
                arg0.field2098--;
                if (arg0.method2595() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2598();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("d.g(Ljava/lang/Integer;I)V")
    public void method56(Integer arg0) {
    }

    @ObfuscatedName("d.x(I)I")
    public int method46() {
        return this.field45 & 0x7;
    }

    @ObfuscatedName("d.q(I)I")
    public int method49() {
        return (this.field45 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("d.d(II)V")
    public void method64(int arg0) {
        this.field45 &= 0xFFFFFFF8;
        this.field45 = (byte) (this.field45 | arg0 & 0x7);
    }

    @ObfuscatedName("d.k(IB)V")
    public void method51(int arg0) {
        this.field45 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field45 = (byte) (this.field45 | 0x8);
        }
    }
}
