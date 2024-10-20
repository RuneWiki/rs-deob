package deob;

@ObfuscatedName("p")
public class class24 {

    @ObfuscatedName("p.i")
    public class31[] field615 = new class31[100];

    @ObfuscatedName("p.k")
    public int field610;

    @ObfuscatedName("p.g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Laj;")
    public class31 method491(int arg0, String arg1, String arg2, String arg3) {
        class31 var5 = this.field615[99];
        for (int var6 = this.field610; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field615[var6] = this.field615[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class31(arg0, arg1, arg3, arg2);
        } else {
            var5.method3304();
            var5.method3272();
            var5.method553(arg0, arg1, arg3, arg2);
        }
        this.field615[0] = var5;
        if (this.field610 < 100) {
            this.field610++;
        }
        return var5;
    }

    @ObfuscatedName("p.i(II)Laj;")
    public class31 method498(int arg0) {
        return arg0 >= 0 && arg0 < this.field610 ? this.field615[arg0] : null;
    }

    @ObfuscatedName("p.k(I)I")
    public int method492() {
        return this.field610;
    }
}
