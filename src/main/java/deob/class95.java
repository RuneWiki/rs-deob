package deob;

@ObfuscatedName("cc")
public class class95 {

    @ObfuscatedName("cc.n")
    public class65[] field1288 = new class65[100];

    @ObfuscatedName("cc.v")
    public int field1287;

    @ObfuscatedName("cc.z(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lbe;")
    public class65 method2025(int arg0, String arg1, String arg2, String arg3) {
        class65 var5 = this.field1288[99];
        for (int var6 = this.field1287; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1288[var6] = this.field1288[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class65(arg0, arg1, arg3, arg2);
        } else {
            var5.method3249();
            var5.method3240();
            var5.method1060(arg0, arg1, arg3, arg2);
        }
        this.field1288[0] = var5;
        if (this.field1287 < 100) {
            this.field1287++;
        }
        return var5;
    }

    @ObfuscatedName("cc.n(II)Lbe;")
    public class65 method2033(int arg0) {
        return arg0 >= 0 && arg0 < this.field1287 ? this.field1288[arg0] : null;
    }

    @ObfuscatedName("cc.v(I)I")
    public int method2027() {
        return this.field1287;
    }
}
