package deob;

@ObfuscatedName("du")
public class class79 {

    @ObfuscatedName("du.al")
    public class62[] field988 = new class62[100];

    @ObfuscatedName("du.ac")
    public int field989;

    @ObfuscatedName("du.aj(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lct;")
    public class62 method2059(int arg0, String arg1, String arg2, String arg3) {
        class62 var5 = this.field988[99];
        for (int var6 = this.field989; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field988[var6] = this.field988[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class62(arg0, arg1, arg3, arg2);
        } else {
            var5.method7335();
            var5.method7331();
            var5.method1098(arg0, arg1, arg3, arg2);
        }
        this.field988[0] = var5;
        if (this.field989 < 100) {
            this.field989++;
        }
        return var5;
    }

    @ObfuscatedName("du.al(IB)Lct;")
    public class62 method2045(int arg0) {
        return arg0 >= 0 && arg0 < this.field989 ? this.field988[arg0] : null;
    }

    @ObfuscatedName("du.ac(I)I")
    public int method2057() {
        return this.field989;
    }
}
