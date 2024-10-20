package deob;

@ObfuscatedName("co")
public class class89 {

    @ObfuscatedName("co.l")
    public class60[] field1274 = new class60[100];

    @ObfuscatedName("co.w")
    public int field1271;

    @ObfuscatedName("co.f(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbm;")
    public class60 method1933(int arg0, String arg1, String arg2, String arg3) {
        class60 var5 = this.field1274[99];
        for (int var6 = this.field1271; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1274[var6] = this.field1274[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class60(arg0, arg1, arg3, arg2);
        } else {
            var5.method3818();
            var5.method3851();
            var5.method1003(arg0, arg1, arg3, arg2);
        }
        this.field1274[0] = var5;
        if (this.field1271 < 100) {
            this.field1271++;
        }
        return var5;
    }

    @ObfuscatedName("co.l(IS)Lbm;")
    public class60 method1929(int arg0) {
        return arg0 >= 0 && arg0 < this.field1271 ? this.field1274[arg0] : null;
    }

    @ObfuscatedName("co.w(I)I")
    public int method1932() {
        return this.field1271;
    }
}
