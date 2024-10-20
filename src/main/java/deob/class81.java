package deob;

@ObfuscatedName("dg")
public class class81 {

    @ObfuscatedName("dg.ay")
    public class65[] field1017 = new class65[100];

    @ObfuscatedName("dg.ar")
    public int field1016;

    @ObfuscatedName("dg.aw(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lcx;")
    public class65 method2095(int arg0, String arg1, String arg2, String arg3) {
        class65 var5 = this.field1017[99];
        for (int var6 = this.field1016; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1017[var6] = this.field1017[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class65(arg0, arg1, arg3, arg2);
        } else {
            var5.method7662();
            var5.method7660();
            var5.method1152(arg0, arg1, arg3, arg2);
        }
        this.field1017[0] = var5;
        if (this.field1016 < 100) {
            this.field1016++;
        }
        return var5;
    }

    @ObfuscatedName("dg.ay(II)Lcx;")
    public class65 method2083(int arg0) {
        return arg0 >= 0 && arg0 < this.field1016 ? this.field1017[arg0] : null;
    }

    @ObfuscatedName("dg.ar(I)I")
    public int method2082() {
        return this.field1016;
    }
}
