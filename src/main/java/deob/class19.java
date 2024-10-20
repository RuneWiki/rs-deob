package deob;

@ObfuscatedName("v")
public class class19 {

    @ObfuscatedName("v.z")
    public byte field98;

    @ObfuscatedName("v.k")
    public int field90;

    @ObfuscatedName("v.s")
    public int field91;

    @ObfuscatedName("v.t")
    public int field99;

    @ObfuscatedName("v.i")
    public int field93;

    @ObfuscatedName("v.o")
    public int field94;

    public class19() {
    }

    public class19(class310 arg0, boolean arg1) {
        this.field98 = arg0.method5194();
        this.field90 = arg0.method5195();
        this.field91 = arg0.method5270();
        this.field99 = arg0.method5270();
        this.field93 = arg0.method5270();
        this.field94 = arg0.method5270();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method5193();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method146(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method5193();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field3734--;
                    if (arg0.method5195() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method5270();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("v.z(Ljava/lang/Integer;B)V")
    public void method146(Integer arg0) {
    }

    @ObfuscatedName("v.k(I)I")
    public int method174() {
        return this.field98 & 0x7;
    }

    @ObfuscatedName("v.s(I)I")
    public int method148() {
        return (this.field98 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("v.t(II)V")
    public void method155(int arg0) {
        this.field98 &= 0xFFFFFFF8;
        this.field98 = (byte) (this.field98 | arg0 & 0x7);
    }

    @ObfuscatedName("v.i(II)V")
    public void method150(int arg0) {
        this.field98 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field98 = (byte) (this.field98 | 0x8);
        }
    }
}
