package deob;

@ObfuscatedName("dk")
public class class81 {

    @ObfuscatedName("dk.ah")
    public class65[] field999 = new class65[100];

    @ObfuscatedName("dk.ar")
    public int field998;

    @ObfuscatedName("dk.at(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lco;")
    public class65 method2131(int arg0, String arg1, String arg2, String arg3) {
        class65 var5 = this.field999[99];
        for (int var6 = this.field998; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field999[var6] = this.field999[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class65(arg0, arg1, arg3, arg2);
        } else {
            var5.method7828();
            var5.method7825();
            var5.method1135(arg0, arg1, arg3, arg2);
        }
        this.field999[0] = var5;
        if (this.field998 < 100) {
            this.field998++;
        }
        return var5;
    }

    @ObfuscatedName("dk.ah(II)Lco;")
    public class65 method2132(int arg0) {
        return arg0 >= 0 && arg0 < this.field998 ? this.field999[arg0] : null;
    }

    @ObfuscatedName("dk.ar(I)I")
    public int method2130() {
        return this.field998;
    }
}
