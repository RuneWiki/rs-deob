package deob;

@ObfuscatedName("d")
public class class24 {

    @ObfuscatedName("d.j")
    public class31[] field572 = new class31[100];

    @ObfuscatedName("d.a")
    public int field576;

    @ObfuscatedName("d.z(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lad;")
    public class31 method501(int arg0, String arg1, String arg2, String arg3) {
        class31 var5 = this.field572[99];
        for (int var6 = this.field576; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field572[var6] = this.field572[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class31(arg0, arg1, arg3, arg2);
        } else {
            var5.method3311();
            var5.method3294();
            var5.method571(arg0, arg1, arg3, arg2);
        }
        this.field572[0] = var5;
        if (this.field576 < 100) {
            this.field576++;
        }
        return var5;
    }

    @ObfuscatedName("d.j(IB)Lad;")
    public class31 method509(int arg0) {
        return arg0 >= 0 && arg0 < this.field576 ? this.field572[arg0] : null;
    }

    @ObfuscatedName("d.a(I)I")
    public int method503() {
        return this.field576;
    }
}
