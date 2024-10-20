package deob;

@ObfuscatedName("cq")
public class class95 {

    @ObfuscatedName("cq.t")
    public class65[] field1291 = new class65[100];

    @ObfuscatedName("cq.o")
    public int field1289;

    @ObfuscatedName("cq.c(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lbn;")
    public class65 method2098(int arg0, String arg1, String arg2, String arg3) {
        class65 var5 = this.field1291[99];
        for (int var6 = this.field1289; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1291[var6] = this.field1291[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class65(arg0, arg1, arg3, arg2);
        } else {
            var5.method3351();
            var5.method3342();
            var5.method1066(arg0, arg1, arg3, arg2);
        }
        this.field1291[0] = var5;
        if (this.field1289 < 100) {
            this.field1289++;
        }
        return var5;
    }

    @ObfuscatedName("cq.t(II)Lbn;")
    public class65 method2101(int arg0) {
        return arg0 >= 0 && arg0 < this.field1289 ? this.field1291[arg0] : null;
    }

    @ObfuscatedName("cq.o(B)I")
    public int method2100() {
        return this.field1289;
    }
}
