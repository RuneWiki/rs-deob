package deob;

@ObfuscatedName("m")
public class class24 {

    @ObfuscatedName("m.g")
    public class31[] field606 = new class31[100];

    @ObfuscatedName("m.x")
    public int field607;

    @ObfuscatedName("m.p(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Las;")
    public class31 method524(int arg0, String arg1, String arg2, String arg3) {
        class31 var5 = this.field606[99];
        for (int var6 = this.field607; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field606[var6] = this.field606[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class31(arg0, arg1, arg3, arg2);
        } else {
            var5.method3378();
            var5.method3356();
            var5.method594(arg0, arg1, arg3, arg2);
        }
        this.field606[0] = var5;
        if (this.field607 < 100) {
            this.field607++;
        }
        return var5;
    }

    @ObfuscatedName("m.g(II)Las;")
    public class31 method526(int arg0) {
        return arg0 >= 0 && arg0 < this.field607 ? this.field606[arg0] : null;
    }

    @ObfuscatedName("m.x(B)I")
    public int method527() {
        return this.field607;
    }
}
