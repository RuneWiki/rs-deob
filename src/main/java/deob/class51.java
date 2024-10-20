package deob;

@ObfuscatedName("ao")
public class class51 {

    @ObfuscatedName("ao.x")
    public class22[] field958 = new class22[100];

    @ObfuscatedName("ao.i")
    public int field959;

    @ObfuscatedName("ao.u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ls;")
    public class22 method860(int arg0, String arg1, String arg2, String arg3) {
        class22 var5 = this.field958[99];
        for (int var6 = this.field959; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field958[var6] = this.field958[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class22(arg0, arg1, arg3, arg2);
        } else {
            var5.method2228();
            var5.method2264();
            var5.method196(arg0, arg1, arg3, arg2);
        }
        this.field958[0] = var5;
        if (this.field959 < 100) {
            this.field959++;
        }
        return var5;
    }

    @ObfuscatedName("ao.x(IB)Ls;")
    public class22 method861(int arg0) {
        return arg0 >= 0 && arg0 < this.field959 ? this.field958[arg0] : null;
    }

    @ObfuscatedName("ao.i(I)I")
    public int method862() {
        return this.field959;
    }
}
