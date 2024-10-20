package deob;

@ObfuscatedName("bs")
public class class78 {

    @ObfuscatedName("bs.f")
    public class62[] field991 = new class62[100];

    @ObfuscatedName("bs.c")
    public int field988;

    @ObfuscatedName("bs.a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbk;")
    public class62 method2052(int arg0, String arg1, String arg2, String arg3) {
        class62 var5 = this.field991[99];
        for (int var6 = this.field988; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field991[var6] = this.field991[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class62(arg0, arg1, arg3, arg2);
        } else {
            var5.method7170();
            var5.method7169();
            var5.method1078(arg0, arg1, arg3, arg2);
        }
        this.field991[0] = var5;
        if (this.field988 < 100) {
            this.field988++;
        }
        return var5;
    }

    @ObfuscatedName("bs.f(II)Lbk;")
    public class62 method2046(int arg0) {
        return arg0 >= 0 && arg0 < this.field988 ? this.field991[arg0] : null;
    }

    @ObfuscatedName("bs.c(B)I")
    public int method2047() {
        return this.field988;
    }
}
