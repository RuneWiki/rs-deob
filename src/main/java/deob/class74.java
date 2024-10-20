package deob;

@ObfuscatedName("bx")
public class class74 {

    @ObfuscatedName("bx.v")
    public class58[] field992 = new class58[100];

    @ObfuscatedName("bx.q")
    public int field991;

    @ObfuscatedName("bx.c(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbr;")
    public class58 method1905(int arg0, String arg1, String arg2, String arg3) {
        class58 var5 = this.field992[99];
        for (int var6 = this.field991; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field992[var6] = this.field992[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class58(arg0, arg1, arg3, arg2);
        } else {
            var5.method6497();
            var5.method6493();
            var5.method985(arg0, arg1, arg3, arg2);
        }
        this.field992[0] = var5;
        if (this.field991 < 100) {
            this.field991++;
        }
        return var5;
    }

    @ObfuscatedName("bx.v(II)Lbr;")
    public class58 method1900(int arg0) {
        return arg0 >= 0 && arg0 < this.field991 ? this.field992[arg0] : null;
    }

    @ObfuscatedName("bx.q(I)I")
    public int method1902() {
        return this.field991;
    }
}
