package deob;

@ObfuscatedName("cp")
public class class99 {

    @ObfuscatedName("cp.i")
    public class71[] field1467 = new class71[100];

    @ObfuscatedName("cp.o")
    public int field1468;

    @ObfuscatedName("cp.c(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbk;")
    public class71 method1874(int arg0, String arg1, String arg2, String arg3) {
        class71 var5 = this.field1467[99];
        for (int var6 = this.field1468; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1467[var6] = this.field1467[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class71(arg0, arg1, arg3, arg2);
        } else {
            var5.method3710();
            var5.method3747();
            var5.method1003(arg0, arg1, arg3, arg2);
        }
        this.field1467[0] = var5;
        if (this.field1468 < 100) {
            this.field1468++;
        }
        return var5;
    }

    @ObfuscatedName("cp.i(IB)Lbk;")
    public class71 method1873(int arg0) {
        return arg0 >= 0 && arg0 < this.field1468 ? this.field1467[arg0] : null;
    }

    @ObfuscatedName("cp.o(I)I")
    public int method1880() {
        return this.field1468;
    }
}
