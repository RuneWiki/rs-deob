package deob;

@ObfuscatedName("g")
public class class5 {

    @ObfuscatedName("g.c")
    public byte field38;

    @ObfuscatedName("g.q")
    public int field27;

    @ObfuscatedName("g.m")
    public int field28;

    @ObfuscatedName("g.j")
    public int field29;

    @ObfuscatedName("g.g")
    public int field30;

    @ObfuscatedName("g.i")
    public int field33;

    public class5() {
    }

    public class5(class185 arg0, boolean arg1) {
        this.field38 = arg0.method3244();
        this.field27 = arg0.method3245();
        this.field28 = arg0.method3323();
        this.field29 = arg0.method3323();
        this.field30 = arg0.method3323();
        this.field33 = arg0.method3323();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method3243();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method48(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method3243();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field2386--;
                    if (arg0.method3245() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method3323();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("g.c(Ljava/lang/Integer;I)V")
    public void method48(Integer arg0) {
    }

    @ObfuscatedName("g.q(I)I")
    public int method49() {
        return this.field38 & 0x7;
    }

    @ObfuscatedName("g.m(I)I")
    public int method52() {
        return (this.field38 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("g.j(IB)V")
    public void method56(int arg0) {
        this.field38 &= 0xFFFFFFF8;
        this.field38 = (byte) (this.field38 | arg0 & 0x7);
    }

    @ObfuscatedName("g.g(IB)V")
    public void method51(int arg0) {
        this.field38 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field38 = (byte) (this.field38 | 0x8);
        }
    }
}
