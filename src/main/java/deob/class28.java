package deob;

@ObfuscatedName("aq")
public class class28 {

    @ObfuscatedName("aq.h")
    public class36[] field649 = new class36[100];

    @ObfuscatedName("aq.m")
    public int field650;

    @ObfuscatedName("aq.j(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Las;")
    public class36 method628(int arg0, String arg1, String arg2, String arg3) {
        class36 var5 = this.field649[99];
        for (int var6 = this.field650; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field649[var6] = this.field649[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class36(arg0, arg1, arg3, arg2);
        } else {
            var5.method3639();
            var5.method3619();
            var5.method718(arg0, arg1, arg3, arg2);
        }
        this.field649[0] = var5;
        if (this.field650 < 100) {
            this.field650++;
        }
        return var5;
    }

    @ObfuscatedName("aq.h(IS)Las;")
    public class36 method629(int arg0) {
        return arg0 >= 0 && arg0 < this.field650 ? this.field649[arg0] : null;
    }

    @ObfuscatedName("aq.m(I)I")
    public int method633() {
        return this.field650;
    }
}
