package deob;

@ObfuscatedName("cz")
public class class99 {

    @ObfuscatedName("cz.z")
    public class71[] field1462 = new class71[100];

    @ObfuscatedName("cz.n")
    public int field1463;

    @ObfuscatedName("cz.d(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbv;")
    public class71 method1905(int arg0, String arg1, String arg2, String arg3) {
        class71 var5 = this.field1462[99];
        for (int var6 = this.field1463; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1462[var6] = this.field1462[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class71(arg0, arg1, arg3, arg2);
        } else {
            var5.method3785();
            var5.method3828();
            var5.method999(arg0, arg1, arg3, arg2);
        }
        this.field1462[0] = var5;
        if (this.field1463 < 100) {
            this.field1463++;
        }
        return var5;
    }

    @ObfuscatedName("cz.z(II)Lbv;")
    public class71 method1907(int arg0) {
        return arg0 >= 0 && arg0 < this.field1463 ? this.field1462[arg0] : null;
    }

    @ObfuscatedName("cz.n(I)I")
    public int method1909() {
        return this.field1463;
    }
}
