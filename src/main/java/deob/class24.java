package deob;

@ObfuscatedName("s")
public class class24 {

    @ObfuscatedName("s.u")
    public class31[] field597 = new class31[100];

    @ObfuscatedName("s.x")
    public int field602;

    @ObfuscatedName("s.b(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lai;")
    public class31 method520(int arg0, String arg1, String arg2, String arg3) {
        class31 var5 = this.field597[99];
        for (int var6 = this.field602; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field597[var6] = this.field597[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class31(arg0, arg1, arg3, arg2);
        } else {
            var5.method3260();
            var5.method3243();
            var5.method569(arg0, arg1, arg3, arg2);
        }
        this.field597[0] = var5;
        if (this.field602 < 100) {
            this.field602++;
        }
        return var5;
    }

    @ObfuscatedName("s.u(II)Lai;")
    public class31 method517(int arg0) {
        return arg0 >= 0 && arg0 < this.field602 ? this.field597[arg0] : null;
    }

    @ObfuscatedName("s.x(I)I")
    public int method516() {
        return this.field602;
    }
}
