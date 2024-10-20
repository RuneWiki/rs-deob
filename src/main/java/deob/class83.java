package deob;

@ObfuscatedName("dn")
public class class83 {

    @ObfuscatedName("dn.ad")
    public class65[] field1028 = new class65[100];

    @ObfuscatedName("dn.ag")
    public int field1027;

    @ObfuscatedName("dn.aq(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;S)Lck;")
    public class65 method2173(int arg0, String arg1, String arg2, String arg3) {
        class65 var5 = this.field1028[99];
        for (int var6 = this.field1027; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1028[var6] = this.field1028[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class65(arg0, arg1, arg3, arg2);
        } else {
            var5.method8130();
            var5.method8125();
            var5.method1138(arg0, arg1, arg3, arg2);
        }
        this.field1028[0] = var5;
        if (this.field1027 < 100) {
            this.field1027++;
        }
        return var5;
    }

    @ObfuscatedName("dn.ad(II)Lck;")
    public class65 method2169(int arg0) {
        return arg0 >= 0 && arg0 < this.field1027 ? this.field1028[arg0] : null;
    }

    @ObfuscatedName("dn.ag(B)I")
    public int method2170() {
        return this.field1027;
    }
}
