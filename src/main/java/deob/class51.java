package deob;

@ObfuscatedName("as")
public class class51 {

    @ObfuscatedName("as.m")
    public class22[] field968 = new class22[100];

    @ObfuscatedName("as.b")
    public int field970;

    @ObfuscatedName("as.o(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lq;")
    public class22 method867(int arg0, String arg1, String arg2, String arg3) {
        class22 var5 = this.field968[99];
        for (int var6 = this.field970; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field968[var6] = this.field968[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class22(arg0, arg1, arg3, arg2);
        } else {
            var5.method2189();
            var5.method2232();
            var5.method200(arg0, arg1, arg3, arg2);
        }
        this.field968[0] = var5;
        if (this.field970 < 100) {
            this.field970++;
        }
        return var5;
    }

    @ObfuscatedName("as.m(II)Lq;")
    public class22 method872(int arg0) {
        return arg0 >= 0 && arg0 < this.field970 ? this.field968[arg0] : null;
    }

    @ObfuscatedName("as.b(I)I")
    public int method866() {
        return this.field970;
    }
}
