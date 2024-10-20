package deob;

@ObfuscatedName("ac")
public class class51 {

    @ObfuscatedName("ac.e")
    public class22[] field974 = new class22[100];

    @ObfuscatedName("ac.c")
    public int field980;

    @ObfuscatedName("ac.b(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lw;")
    public class22 method905(int arg0, String arg1, String arg2, String arg3) {
        class22 var5 = this.field974[99];
        for (int var6 = this.field980; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field974[var6] = this.field974[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class22(arg0, arg1, arg3, arg2);
        } else {
            var5.method2298();
            var5.method2343();
            var5.method233(arg0, arg1, arg3, arg2);
        }
        this.field974[0] = var5;
        if (this.field980 < 100) {
            this.field980++;
        }
        return var5;
    }

    @ObfuscatedName("ac.e(II)Lw;")
    public class22 method913(int arg0) {
        return arg0 >= 0 && arg0 < this.field980 ? this.field974[arg0] : null;
    }

    @ObfuscatedName("ac.c(B)I")
    public int method907() {
        return this.field980;
    }
}
