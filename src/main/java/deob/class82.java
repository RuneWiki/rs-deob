package deob;

@ObfuscatedName("df")
public class class82 {

    @ObfuscatedName("df.ah")
    public class65[] field1022 = new class65[100];

    @ObfuscatedName("df.af")
    public int field1026;

    @ObfuscatedName("df.az(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;S)Lcn;")
    public class65 method2110(int arg0, String arg1, String arg2, String arg3) {
        class65 var5 = this.field1022[99];
        for (int var6 = this.field1026; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1022[var6] = this.field1022[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class65(arg0, arg1, arg3, arg2);
        } else {
            var5.method7855();
            var5.method7853();
            var5.method1084(arg0, arg1, arg3, arg2);
        }
        this.field1022[0] = var5;
        if (this.field1026 < 100) {
            this.field1026++;
        }
        return var5;
    }

    @ObfuscatedName("df.ah(II)Lcn;")
    public class65 method2113(int arg0) {
        return arg0 >= 0 && arg0 < this.field1026 ? this.field1022[arg0] : null;
    }

    @ObfuscatedName("df.af(S)I")
    public int method2109() {
        return this.field1026;
    }
}
