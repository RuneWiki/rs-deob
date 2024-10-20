package deob;

@ObfuscatedName("cb")
public class class95 {

    @ObfuscatedName("cb.t")
    public class65[] field1276 = new class65[100];

    @ObfuscatedName("cb.n")
    public int field1277;

    @ObfuscatedName("cb.a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbt;")
    public class65 method2159(int arg0, String arg1, String arg2, String arg3) {
        class65 var5 = this.field1276[99];
        for (int var6 = this.field1277; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1276[var6] = this.field1276[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class65(arg0, arg1, arg3, arg2);
        } else {
            var5.method3386();
            var5.method3378();
            var5.method1128(arg0, arg1, arg3, arg2);
        }
        this.field1276[0] = var5;
        if (this.field1277 < 100) {
            this.field1277++;
        }
        return var5;
    }

    @ObfuscatedName("cb.t(II)Lbt;")
    public class65 method2160(int arg0) {
        return arg0 >= 0 && arg0 < this.field1277 ? this.field1276[arg0] : null;
    }

    @ObfuscatedName("cb.n(B)I")
    public int method2161() {
        return this.field1277;
    }
}
