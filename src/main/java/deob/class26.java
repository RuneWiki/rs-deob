package deob;

@ObfuscatedName("r")
public class class26 {

    @ObfuscatedName("r.s")
    public class33[] field617 = new class33[100];

    @ObfuscatedName("r.h")
    public int field619;

    @ObfuscatedName("r.q(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lam;")
    public class33 method521(int arg0, String arg1, String arg2, String arg3) {
        class33 var5 = this.field617[99];
        for (int var6 = this.field619; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field617[var6] = this.field617[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class33(arg0, arg1, arg3, arg2);
        } else {
            var5.method3404();
            var5.method3386();
            var5.method584(arg0, arg1, arg3, arg2);
        }
        this.field617[0] = var5;
        if (this.field619 < 100) {
            this.field619++;
        }
        return var5;
    }

    @ObfuscatedName("r.s(II)Lam;")
    public class33 method523(int arg0) {
        return arg0 >= 0 && arg0 < this.field619 ? this.field617[arg0] : null;
    }

    @ObfuscatedName("r.h(I)I")
    public int method534() {
        return this.field619;
    }
}
