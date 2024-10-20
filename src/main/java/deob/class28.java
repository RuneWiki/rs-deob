package deob;

@ObfuscatedName("am")
public class class28 {

    @ObfuscatedName("am.x")
    public class36[] field675 = new class36[100];

    @ObfuscatedName("am.t")
    public int field676;

    @ObfuscatedName("am.w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lae;")
    public class36 method644(int arg0, String arg1, String arg2, String arg3) {
        class36 var5 = this.field675[99];
        for (int var6 = this.field676; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field675[var6] = this.field675[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class36(arg0, arg1, arg3, arg2);
        } else {
            var5.method3684();
            var5.method3658();
            var5.method736(arg0, arg1, arg3, arg2);
        }
        this.field675[0] = var5;
        if (this.field676 < 100) {
            this.field676++;
        }
        return var5;
    }

    @ObfuscatedName("am.x(IB)Lae;")
    public class36 method646(int arg0) {
        return arg0 >= 0 && arg0 < this.field676 ? this.field675[arg0] : null;
    }

    @ObfuscatedName("am.t(I)I")
    public int method647() {
        return this.field676;
    }
}
