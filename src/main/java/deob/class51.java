package deob;

@ObfuscatedName("ak")
public class class51 {

    @ObfuscatedName("ak.y")
    public class22[] field966 = new class22[100];

    @ObfuscatedName("ak.o")
    public int field968;

    @ObfuscatedName("ak.k(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lb;")
    public class22 method877(int arg0, String arg1, String arg2, String arg3) {
        class22 var5 = this.field966[99];
        for (int var6 = this.field968; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field966[var6] = this.field966[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class22(arg0, arg1, arg3, arg2);
        } else {
            var5.method2214();
            var5.method2251();
            var5.method221(arg0, arg1, arg3, arg2);
        }
        this.field966[0] = var5;
        if (this.field968 < 100) {
            this.field968++;
        }
        return var5;
    }

    @ObfuscatedName("ak.y(IB)Lb;")
    public class22 method878(int arg0) {
        return arg0 >= 0 && arg0 < this.field968 ? this.field966[arg0] : null;
    }

    @ObfuscatedName("ak.o(I)I")
    public int method879() {
        return this.field968;
    }
}
