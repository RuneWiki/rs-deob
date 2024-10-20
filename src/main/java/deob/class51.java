package deob;

@ObfuscatedName("ac")
public class class51 {

    @ObfuscatedName("ac.i")
    public class22[] field985 = new class22[100];

    @ObfuscatedName("ac.u")
    public int field986;

    @ObfuscatedName("ac.f(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lb;")
    public class22 method908(int arg0, String arg1, String arg2, String arg3) {
        class22 var5 = this.field985[99];
        for (int var6 = this.field986; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field985[var6] = this.field985[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class22(arg0, arg1, arg3, arg2);
        } else {
            var5.method2289();
            var5.method2332();
            var5.method191(arg0, arg1, arg3, arg2);
        }
        this.field985[0] = var5;
        if (this.field986 < 100) {
            this.field986++;
        }
        return var5;
    }

    @ObfuscatedName("ac.i(II)Lb;")
    public class22 method912(int arg0) {
        return arg0 >= 0 && arg0 < this.field986 ? this.field985[arg0] : null;
    }

    @ObfuscatedName("ac.u(I)I")
    public int method910() {
        return this.field986;
    }
}
