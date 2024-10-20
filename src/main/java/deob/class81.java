package deob;

@ObfuscatedName("di")
public class class81 {

    @ObfuscatedName("di.ae")
    public class65[] field1032 = new class65[100];

    @ObfuscatedName("di.ao")
    public int field1031;

    @ObfuscatedName("di.au(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lco;")
    public class65 method2097(int arg0, String arg1, String arg2, String arg3) {
        class65 var5 = this.field1032[99];
        for (int var6 = this.field1031; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1032[var6] = this.field1032[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class65(arg0, arg1, arg3, arg2);
        } else {
            var5.method7700();
            var5.method7697();
            var5.method1130(arg0, arg1, arg3, arg2);
        }
        this.field1032[0] = var5;
        if (this.field1031 < 100) {
            this.field1031++;
        }
        return var5;
    }

    @ObfuscatedName("di.ae(II)Lco;")
    public class65 method2098(int arg0) {
        return arg0 >= 0 && arg0 < this.field1031 ? this.field1032[arg0] : null;
    }

    @ObfuscatedName("di.ao(I)I")
    public int method2096() {
        return this.field1031;
    }
}
