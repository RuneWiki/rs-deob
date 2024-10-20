package deob;

@ObfuscatedName("dv")
public class class82 {

    @ObfuscatedName("dv.aw")
    public class65[] field1043 = new class65[100];

    @ObfuscatedName("dv.al")
    public int field1044;

    @ObfuscatedName("dv.aq(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcy;")
    public class65 method2148(int arg0, String arg1, String arg2, String arg3) {
        class65 var5 = this.field1043[99];
        for (int var6 = this.field1044; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1043[var6] = this.field1043[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class65(arg0, arg1, arg3, arg2);
        } else {
            var5.method7996();
            var5.method7989();
            var5.method1091(arg0, arg1, arg3, arg2);
        }
        this.field1043[0] = var5;
        if (this.field1044 < 100) {
            this.field1044++;
        }
        return var5;
    }

    @ObfuscatedName("dv.aw(IB)Lcy;")
    public class65 method2149(int arg0) {
        return arg0 >= 0 && arg0 < this.field1044 ? this.field1043[arg0] : null;
    }

    @ObfuscatedName("dv.al(B)I")
    public int method2150() {
        return this.field1044;
    }
}
