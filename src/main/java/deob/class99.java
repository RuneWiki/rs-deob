package deob;

@ObfuscatedName("cz")
public class class99 {

    @ObfuscatedName("cz.q")
    public class71[] field1451 = new class71[100];

    @ObfuscatedName("cz.i")
    public int field1450;

    @ObfuscatedName("cz.t(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lbo;")
    public class71 method1899(int arg0, String arg1, String arg2, String arg3) {
        class71 var5 = this.field1451[99];
        for (int var6 = this.field1450; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1451[var6] = this.field1451[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class71(arg0, arg1, arg3, arg2);
        } else {
            var5.method3721();
            var5.method3761();
            var5.method1054(arg0, arg1, arg3, arg2);
        }
        this.field1451[0] = var5;
        if (this.field1450 < 100) {
            this.field1450++;
        }
        return var5;
    }

    @ObfuscatedName("cz.q(II)Lbo;")
    public class71 method1905(int arg0) {
        return arg0 >= 0 && arg0 < this.field1450 ? this.field1451[arg0] : null;
    }

    @ObfuscatedName("cz.i(I)I")
    public int method1898() {
        return this.field1450;
    }
}
