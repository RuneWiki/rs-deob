package deob;

@ObfuscatedName("aj")
public class class51 {

    @ObfuscatedName("aj.d")
    public class22[] field965 = new class22[100];

    @ObfuscatedName("aj.m")
    public int field962;

    @ObfuscatedName("aj.n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lj;")
    public class22 method872(int arg0, String arg1, String arg2, String arg3) {
        class22 var5 = this.field965[99];
        for (int var6 = this.field962; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field965[var6] = this.field965[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class22(arg0, arg1, arg3, arg2);
        } else {
            var5.method2273();
            var5.method2307();
            var5.method216(arg0, arg1, arg3, arg2);
        }
        this.field965[0] = var5;
        if (this.field962 < 100) {
            this.field962++;
        }
        return var5;
    }

    @ObfuscatedName("aj.d(II)Lj;")
    public class22 method869(int arg0) {
        return arg0 >= 0 && arg0 < this.field962 ? this.field965[arg0] : null;
    }

    @ObfuscatedName("aj.m(I)I")
    public int method870() {
        return this.field962;
    }
}
