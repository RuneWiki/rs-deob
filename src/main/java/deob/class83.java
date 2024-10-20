package deob;

@ObfuscatedName("dl")
public class class83 {

    @ObfuscatedName("dl.ay")
    public class65[] field1014 = new class65[100];

    @ObfuscatedName("dl.an")
    public int field1010;

    @ObfuscatedName("dl.ab(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lci;")
    public class65 method2225(int arg0, String arg1, String arg2, String arg3) {
        class65 var5 = this.field1014[99];
        for (int var6 = this.field1010; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1014[var6] = this.field1014[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class65(arg0, arg1, arg3, arg2);
        } else {
            var5.method8218();
            var5.method8217();
            var5.method1105(arg0, arg1, arg3, arg2);
        }
        this.field1014[0] = var5;
        if (this.field1010 < 100) {
            this.field1010++;
        }
        return var5;
    }

    @ObfuscatedName("dl.ay(II)Lci;")
    public class65 method2218(int arg0) {
        return arg0 >= 0 && arg0 < this.field1010 ? this.field1014[arg0] : null;
    }

    @ObfuscatedName("dl.an(B)I")
    public int method2231() {
        return this.field1010;
    }
}
