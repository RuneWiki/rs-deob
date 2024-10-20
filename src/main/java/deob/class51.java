package deob;

@ObfuscatedName("am")
public class class51 {

    @ObfuscatedName("am.n")
    public class22[] field979 = new class22[100];

    @ObfuscatedName("am.g")
    public int field976;

    @ObfuscatedName("am.x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Le;")
    public class22 method972(int arg0, String arg1, String arg2, String arg3) {
        class22 var5 = this.field979[99];
        for (int var6 = this.field976; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field979[var6] = this.field979[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class22(arg0, arg1, arg3, arg2);
        } else {
            var5.method2327();
            var5.method2362();
            var5.method218(arg0, arg1, arg3, arg2);
        }
        this.field979[0] = var5;
        if (this.field976 < 100) {
            this.field976++;
        }
        return var5;
    }

    @ObfuscatedName("am.n(II)Le;")
    public class22 method961(int arg0) {
        return arg0 >= 0 && arg0 < this.field976 ? this.field979[arg0] : null;
    }

    @ObfuscatedName("am.g(I)I")
    public int method962() {
        return this.field976;
    }
}
