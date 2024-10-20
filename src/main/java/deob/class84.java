package deob;

@ObfuscatedName("dl")
public class class84 {

    @ObfuscatedName("dl.ae")
    public class65[] field1052 = new class65[100];

    @ObfuscatedName("dl.ag")
    public int field1053;

    @ObfuscatedName("dl.ac(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lct;")
    public class65 method2293(int arg0, String arg1, String arg2, String arg3) {
        class65 var5 = this.field1052[99];
        for (int var6 = this.field1053; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1052[var6] = this.field1052[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class65(arg0, arg1, arg3, arg2);
        } else {
            var5.method8362();
            var5.method8359();
            var5.method1159(arg0, arg1, arg3, arg2);
        }
        this.field1052[0] = var5;
        if (this.field1053 < 100) {
            this.field1053++;
        }
        return var5;
    }

    @ObfuscatedName("dl.ae(II)Lct;")
    public class65 method2294(int arg0) {
        return arg0 >= 0 && arg0 < this.field1053 ? this.field1052[arg0] : null;
    }

    @ObfuscatedName("dl.ag(I)I")
    public int method2295() {
        return this.field1053;
    }
}
