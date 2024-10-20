package deob;

@ObfuscatedName("g")
public class class26 {

    @ObfuscatedName("g.o")
    public class33[] field645 = new class33[100];

    @ObfuscatedName("g.a")
    public int field646;

    @ObfuscatedName("g.n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lax;")
    public class33 method560(int arg0, String arg1, String arg2, String arg3) {
        class33 var5 = this.field645[99];
        for (int var6 = this.field646; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field645[var6] = this.field645[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class33(arg0, arg1, arg3, arg2);
        } else {
            var5.method3540();
            var5.method3518();
            var5.method622(arg0, arg1, arg3, arg2);
        }
        this.field645[0] = var5;
        if (this.field646 < 100) {
            this.field646++;
        }
        return var5;
    }

    @ObfuscatedName("g.o(IB)Lax;")
    public class33 method561(int arg0) {
        return arg0 >= 0 && arg0 < this.field646 ? this.field645[arg0] : null;
    }

    @ObfuscatedName("g.a(I)I")
    public int method562() {
        return this.field646;
    }
}
