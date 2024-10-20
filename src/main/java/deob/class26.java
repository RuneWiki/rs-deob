package deob;

@ObfuscatedName("k")
public class class26 {

    @ObfuscatedName("k.a")
    public class33[] field602 = new class33[100];

    @ObfuscatedName("k.l")
    public int field603;

    @ObfuscatedName("k.e(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lau;")
    public class33 method556(int arg0, String arg1, String arg2, String arg3) {
        class33 var5 = this.field602[99];
        for (int var6 = this.field603; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field602[var6] = this.field602[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class33(arg0, arg1, arg3, arg2);
        } else {
            var5.method3463();
            var5.method3440();
            var5.method621(arg0, arg1, arg3, arg2);
        }
        this.field602[0] = var5;
        if (this.field603 < 100) {
            this.field603++;
        }
        return var5;
    }

    @ObfuscatedName("k.a(II)Lau;")
    public class33 method552(int arg0) {
        return arg0 >= 0 && arg0 < this.field603 ? this.field602[arg0] : null;
    }

    @ObfuscatedName("k.l(I)I")
    public int method557() {
        return this.field603;
    }
}
