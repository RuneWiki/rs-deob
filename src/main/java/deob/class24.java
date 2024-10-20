package deob;

@ObfuscatedName("z")
public class class24 {

    @ObfuscatedName("z.s")
    public class31[] field598 = new class31[100];

    @ObfuscatedName("z.h")
    public int field597;

    @ObfuscatedName("z.g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lar;")
    public class31 method518(int arg0, String arg1, String arg2, String arg3) {
        class31 var5 = this.field598[99];
        for (int var6 = this.field597; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field598[var6] = this.field598[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class31(arg0, arg1, arg3, arg2);
        } else {
            var5.method3280();
            var5.method3260();
            var5.method576(arg0, arg1, arg3, arg2);
        }
        this.field598[0] = var5;
        if (this.field597 < 100) {
            this.field597++;
        }
        return var5;
    }

    @ObfuscatedName("z.s(IB)Lar;")
    public class31 method519(int arg0) {
        return arg0 >= 0 && arg0 < this.field597 ? this.field598[arg0] : null;
    }

    @ObfuscatedName("z.h(B)I")
    public int method520() {
        return this.field597;
    }
}
