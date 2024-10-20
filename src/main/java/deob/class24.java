package deob;

@ObfuscatedName("p")
public class class24 {

    @ObfuscatedName("p.x")
    public class31[] field611 = new class31[100];

    @ObfuscatedName("p.k")
    public int field612;

    @ObfuscatedName("p.n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lay;")
    public class31 method524(int arg0, String arg1, String arg2, String arg3) {
        class31 var5 = this.field611[99];
        for (int var6 = this.field612; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field611[var6] = this.field611[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class31(arg0, arg1, arg3, arg2);
        } else {
            var5.method3277();
            var5.method3253();
            var5.method591(arg0, arg1, arg3, arg2);
        }
        this.field611[0] = var5;
        if (this.field612 < 100) {
            this.field612++;
        }
        return var5;
    }

    @ObfuscatedName("p.x(IB)Lay;")
    public class31 method525(int arg0) {
        return arg0 >= 0 && arg0 < this.field612 ? this.field611[arg0] : null;
    }

    @ObfuscatedName("p.k(I)I")
    public int method528() {
        return this.field612;
    }
}
