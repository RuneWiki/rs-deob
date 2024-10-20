package deob;

@ObfuscatedName("d")
public class class24 {

    @ObfuscatedName("d.u")
    public class31[] field596 = new class31[100];

    @ObfuscatedName("d.k")
    public int field597;

    @ObfuscatedName("d.y(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lah;")
    public class31 method481(int arg0, String arg1, String arg2, String arg3) {
        class31 var5 = this.field596[99];
        for (int var6 = this.field597; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field596[var6] = this.field596[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class31(arg0, arg1, arg3, arg2);
        } else {
            var5.method3268();
            var5.method3260();
            var5.method553(arg0, arg1, arg3, arg2);
        }
        this.field596[0] = var5;
        if (this.field597 < 100) {
            this.field597++;
        }
        return var5;
    }

    @ObfuscatedName("d.u(IB)Lah;")
    public class31 method486(int arg0) {
        return arg0 >= 0 && arg0 < this.field597 ? this.field596[arg0] : null;
    }

    @ObfuscatedName("d.k(I)I")
    public int method485() {
        return this.field597;
    }
}
