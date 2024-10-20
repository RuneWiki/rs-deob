package deob;

@ObfuscatedName("ao")
public class class51 {

    @ObfuscatedName("ao.l")
    public class22[] field954 = new class22[100];

    @ObfuscatedName("ao.i")
    public int field956;

    @ObfuscatedName("ao.b(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lv;")
    public class22 method945(int arg0, String arg1, String arg2, String arg3) {
        class22 var5 = this.field954[99];
        for (int var6 = this.field956; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field954[var6] = this.field954[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class22(arg0, arg1, arg3, arg2);
        } else {
            var5.method2313();
            var5.method2349();
            var5.method217(arg0, arg1, arg3, arg2);
        }
        this.field954[0] = var5;
        if (this.field956 < 100) {
            this.field956++;
        }
        return var5;
    }

    @ObfuscatedName("ao.l(II)Lv;")
    public class22 method946(int arg0) {
        return arg0 >= 0 && arg0 < this.field956 ? this.field954[arg0] : null;
    }

    @ObfuscatedName("ao.i(I)I")
    public int method947() {
        return this.field956;
    }
}
