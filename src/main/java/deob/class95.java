package deob;

@ObfuscatedName("ct")
public class class95 {

    @ObfuscatedName("ct.i")
    public class65[] field1289 = new class65[100];

    @ObfuscatedName("ct.y")
    public int field1286;

    @ObfuscatedName("ct.f(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbs;")
    public class65 method2068(int arg0, String arg1, String arg2, String arg3) {
        class65 var5 = this.field1289[99];
        for (int var6 = this.field1286; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1289[var6] = this.field1289[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class65(arg0, arg1, arg3, arg2);
        } else {
            var5.method3292();
            var5.method3286();
            var5.method1050(arg0, arg1, arg3, arg2);
        }
        this.field1289[0] = var5;
        if (this.field1286 < 100) {
            this.field1286++;
        }
        return var5;
    }

    @ObfuscatedName("ct.i(II)Lbs;")
    public class65 method2077(int arg0) {
        return arg0 >= 0 && arg0 < this.field1286 ? this.field1289[arg0] : null;
    }

    @ObfuscatedName("ct.y(I)I")
    public int method2070() {
        return this.field1286;
    }
}
