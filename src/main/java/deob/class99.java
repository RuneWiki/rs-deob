package deob;

@ObfuscatedName("co")
public class class99 {

    @ObfuscatedName("co.k")
    public class71[] field1479 = new class71[100];

    @ObfuscatedName("co.t")
    public int field1477;

    @ObfuscatedName("co.o(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbv;")
    public class71 method1858(int arg0, String arg1, String arg2, String arg3) {
        class71 var5 = this.field1479[99];
        for (int var6 = this.field1477; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1479[var6] = this.field1479[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class71(arg0, arg1, arg3, arg2);
        } else {
            var5.method3681();
            var5.method3721();
            var5.method1033(arg0, arg1, arg3, arg2);
        }
        this.field1479[0] = var5;
        if (this.field1477 < 100) {
            this.field1477++;
        }
        return var5;
    }

    @ObfuscatedName("co.k(II)Lbv;")
    public class71 method1859(int arg0) {
        return arg0 >= 0 && arg0 < this.field1477 ? this.field1479[arg0] : null;
    }

    @ObfuscatedName("co.t(I)I")
    public int method1861() {
        return this.field1477;
    }
}
