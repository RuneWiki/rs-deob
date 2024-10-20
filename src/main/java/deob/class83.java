package deob;

@ObfuscatedName("dg")
public class class83 {

    @ObfuscatedName("dg.al")
    public class66[] field1026 = new class66[100];

    @ObfuscatedName("dg.ak")
    public int field1027;

    @ObfuscatedName("dg.ac(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lcr;")
    public class66 method2120(int arg0, String arg1, String arg2, String arg3) {
        class66 var5 = this.field1026[99];
        for (int var6 = this.field1027; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1026[var6] = this.field1026[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class66(arg0, arg1, arg3, arg2);
        } else {
            var5.method7776();
            var5.method7774();
            var5.method1129(arg0, arg1, arg3, arg2);
        }
        this.field1026[0] = var5;
        if (this.field1027 < 100) {
            this.field1027++;
        }
        return var5;
    }

    @ObfuscatedName("dg.al(II)Lcr;")
    public class66 method2121(int arg0) {
        return arg0 >= 0 && arg0 < this.field1027 ? this.field1026[arg0] : null;
    }

    @ObfuscatedName("dg.ak(I)I")
    public int method2129() {
        return this.field1027;
    }
}
