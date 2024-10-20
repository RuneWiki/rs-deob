package deob;

@ObfuscatedName("ca")
public class class89 {

    @ObfuscatedName("ca.o")
    public class73[] field1084 = new class73[100];

    @ObfuscatedName("ca.u")
    public int field1089;

    @ObfuscatedName("ca.f(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lbs;")
    public class73 method1753(int arg0, String arg1, String arg2, String arg3) {
        class73 var5 = this.field1084[99];
        for (int var6 = this.field1089; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1084[var6] = this.field1084[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class73(arg0, arg1, arg3, arg2);
        } else {
            var5.method5354();
            var5.method5349();
            var5.method940(arg0, arg1, arg3, arg2);
        }
        this.field1084[0] = var5;
        if (this.field1089 < 100) {
            this.field1089++;
        }
        return var5;
    }

    @ObfuscatedName("ca.o(II)Lbs;")
    public class73 method1750(int arg0) {
        return arg0 >= 0 && arg0 < this.field1089 ? this.field1084[arg0] : null;
    }

    @ObfuscatedName("ca.u(S)I")
    public int method1751() {
        return this.field1089;
    }
}
