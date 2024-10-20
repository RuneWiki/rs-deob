package deob;

@ObfuscatedName("cr")
public class class98 {

    @ObfuscatedName("cr.g")
    public class70[] field1444 = new class70[100];

    @ObfuscatedName("cr.m")
    public int field1442;

    @ObfuscatedName("cr.s(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbx;")
    public class70 method1894(int arg0, String arg1, String arg2, String arg3) {
        class70 var5 = this.field1444[99];
        for (int var6 = this.field1442; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1444[var6] = this.field1444[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class70(arg0, arg1, arg3, arg2);
        } else {
            var5.method3740();
            var5.method3781();
            var5.method993(arg0, arg1, arg3, arg2);
        }
        this.field1444[0] = var5;
        if (this.field1442 < 100) {
            this.field1442++;
        }
        return var5;
    }

    @ObfuscatedName("cr.g(II)Lbx;")
    public class70 method1901(int arg0) {
        return arg0 >= 0 && arg0 < this.field1442 ? this.field1444[arg0] : null;
    }

    @ObfuscatedName("cr.m(I)I")
    public int method1896() {
        return this.field1442;
    }
}
