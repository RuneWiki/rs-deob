package deob;

@ObfuscatedName("ca")
public class class89 {

    @ObfuscatedName("ca.r")
    public class60[] field1274 = new class60[100];

    @ObfuscatedName("ca.e")
    public int field1276;

    @ObfuscatedName("ca.g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbw;")
    public class60 method2041(int arg0, String arg1, String arg2, String arg3) {
        class60 var5 = this.field1274[99];
        for (int var6 = this.field1276; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1274[var6] = this.field1274[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class60(arg0, arg1, arg3, arg2);
        } else {
            var5.method3952();
            var5.method3989();
            var5.method1055(arg0, arg1, arg3, arg2);
        }
        this.field1274[0] = var5;
        if (this.field1276 < 100) {
            this.field1276++;
        }
        return var5;
    }

    @ObfuscatedName("ca.r(II)Lbw;")
    public class60 method2043(int arg0) {
        return arg0 >= 0 && arg0 < this.field1276 ? this.field1274[arg0] : null;
    }

    @ObfuscatedName("ca.e(I)I")
    public int method2047() {
        return this.field1276;
    }
}
