package deob;

@ObfuscatedName("g")
public class class19 {

    @ObfuscatedName("g.n")
    public byte field94;

    @ObfuscatedName("g.v")
    public int field98;

    @ObfuscatedName("g.d")
    public int field95;

    @ObfuscatedName("g.c")
    public int field96;

    @ObfuscatedName("g.y")
    public int field97;

    @ObfuscatedName("g.h")
    public int field102;

    public class19() {
    }

    public class19(class311 arg0, boolean arg1) {
        this.field94 = arg0.method5293();
        this.field98 = arg0.method5247();
        this.field95 = arg0.method5455();
        this.field96 = arg0.method5455();
        this.field97 = arg0.method5455();
        this.field102 = arg0.method5455();
        if (arg1) {
            this.method163(method2017(arg0));
        }
    }

    @ObfuscatedName("cz.n(Lkx;I)Ljava/lang/Integer;")
    public static Integer method2017(class311 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method5310();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method5310();
                if (var4 == 255) {
                    break;
                }
                arg0.field3747--;
                if (arg0.method5247() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method5455();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("g.v(Ljava/lang/Integer;I)V")
    public void method163(Integer arg0) {
    }

    @ObfuscatedName("g.d(B)I")
    public int method142() {
        return this.field94 & 0x7;
    }

    @ObfuscatedName("g.c(I)I")
    public int method155() {
        return (this.field94 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("g.y(II)V")
    public void method143(int arg0) {
        this.field94 &= 0xFFFFFFF8;
        this.field94 = (byte) (this.field94 | arg0 & 0x7);
    }

    @ObfuscatedName("g.h(II)V")
    public void method145(int arg0) {
        this.field94 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field94 = (byte) (this.field94 | 0x8);
        }
    }
}
