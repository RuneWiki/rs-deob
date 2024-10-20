package deob;

@ObfuscatedName("cs")
public class class89 {

    @ObfuscatedName("cs.n")
    public class73[] field1115 = new class73[100];

    @ObfuscatedName("cs.f")
    public int field1112;

    @ObfuscatedName("cs.v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbi;")
    public class73 method1815(int arg0, String arg1, String arg2, String arg3) {
        class73 var5 = this.field1115[99];
        for (int var6 = this.field1112; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1115[var6] = this.field1115[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class73(arg0, arg1, arg3, arg2);
        } else {
            var5.method5496();
            var5.method5487();
            var5.method969(arg0, arg1, arg3, arg2);
        }
        this.field1115[0] = var5;
        if (this.field1112 < 100) {
            this.field1112++;
        }
        return var5;
    }

    @ObfuscatedName("cs.n(II)Lbi;")
    public class73 method1816(int arg0) {
        return arg0 >= 0 && arg0 < this.field1112 ? this.field1115[arg0] : null;
    }

    @ObfuscatedName("cs.f(B)I")
    public int method1814() {
        return this.field1112;
    }
}
