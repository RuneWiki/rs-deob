package deob;

@ObfuscatedName("db")
public class class83 {

    @ObfuscatedName("db.al")
    public class65[] field1043 = new class65[100];

    @ObfuscatedName("db.aj")
    public int field1044;

    @ObfuscatedName("db.ak(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lco;")
    public class65 method2133(int arg0, String arg1, String arg2, String arg3) {
        class65 var5 = this.field1043[99];
        for (int var6 = this.field1044; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1043[var6] = this.field1043[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class65(arg0, arg1, arg3, arg2);
        } else {
            var5.method8189();
            var5.method8183();
            var5.method1101(arg0, arg1, arg3, arg2);
        }
        this.field1043[0] = var5;
        if (this.field1044 < 100) {
            this.field1044++;
        }
        return var5;
    }

    @ObfuscatedName("db.al(II)Lco;")
    public class65 method2140(int arg0) {
        return arg0 >= 0 && arg0 < this.field1044 ? this.field1043[arg0] : null;
    }

    @ObfuscatedName("db.aj(I)I")
    public int method2134() {
        return this.field1044;
    }
}
