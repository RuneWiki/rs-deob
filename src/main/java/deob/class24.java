package deob;

@ObfuscatedName("f")
public class class24 {

    @ObfuscatedName("f.r")
    public class31[] field601 = new class31[100];

    @ObfuscatedName("f.y")
    public int field602;

    @ObfuscatedName("f.k(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lai;")
    public class31 method503(int arg0, String arg1, String arg2, String arg3) {
        class31 var5 = this.field601[99];
        for (int var6 = this.field602; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field601[var6] = this.field601[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class31(arg0, arg1, arg3, arg2);
        } else {
            var5.method3275();
            var5.method3256();
            var5.method571(arg0, arg1, arg3, arg2);
        }
        this.field601[0] = var5;
        if (this.field602 < 100) {
            this.field602++;
        }
        return var5;
    }

    @ObfuscatedName("f.r(IB)Lai;")
    public class31 method493(int arg0) {
        return arg0 >= 0 && arg0 < this.field602 ? this.field601[arg0] : null;
    }

    @ObfuscatedName("f.y(B)I")
    public int method494() {
        return this.field602;
    }
}
