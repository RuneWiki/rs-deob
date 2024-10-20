package deob;

@ObfuscatedName("ci")
public class class99 {

    @ObfuscatedName("ci.e")
    public class71[] field1452 = new class71[100];

    @ObfuscatedName("ci.b")
    public int field1453;

    @ObfuscatedName("ci.g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbn;")
    public class71 method1991(int arg0, String arg1, String arg2, String arg3) {
        class71 var5 = this.field1452[99];
        for (int var6 = this.field1453; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1452[var6] = this.field1452[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class71(arg0, arg1, arg3, arg2);
        } else {
            var5.method3796();
            var5.method3840();
            var5.method1073(arg0, arg1, arg3, arg2);
        }
        this.field1452[0] = var5;
        if (this.field1453 < 100) {
            this.field1453++;
        }
        return var5;
    }

    @ObfuscatedName("ci.e(II)Lbn;")
    public class71 method1987(int arg0) {
        return arg0 >= 0 && arg0 < this.field1453 ? this.field1452[arg0] : null;
    }

    @ObfuscatedName("ci.b(B)I")
    public int method1982() {
        return this.field1453;
    }
}
