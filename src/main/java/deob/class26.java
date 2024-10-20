package deob;

@ObfuscatedName("o")
public class class26 {

    @ObfuscatedName("o.k")
    public class33[] field647 = new class33[100];

    @ObfuscatedName("o.g")
    public int field648;

    @ObfuscatedName("o.y(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lan;")
    public class33 method578(int arg0, String arg1, String arg2, String arg3) {
        class33 var5 = this.field647[99];
        for (int var6 = this.field648; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field647[var6] = this.field647[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class33(arg0, arg1, arg3, arg2);
        } else {
            var5.method3482();
            var5.method3461();
            var5.method643(arg0, arg1, arg3, arg2);
        }
        this.field647[0] = var5;
        if (this.field648 < 100) {
            this.field648++;
        }
        return var5;
    }

    @ObfuscatedName("o.k(IB)Lan;")
    public class33 method579(int arg0) {
        return arg0 >= 0 && arg0 < this.field648 ? this.field647[arg0] : null;
    }

    @ObfuscatedName("o.g(S)I")
    public int method580() {
        return this.field648;
    }
}
