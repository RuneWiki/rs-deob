package deob;

@ObfuscatedName("cp")
public class class98 {

    @ObfuscatedName("cp.q")
    public class70[] field1428 = new class70[100];

    @ObfuscatedName("cp.o")
    public int field1427;

    @ObfuscatedName("cp.b(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbd;")
    public class70 method1872(int arg0, String arg1, String arg2, String arg3) {
        class70 var5 = this.field1428[99];
        for (int var6 = this.field1427; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1428[var6] = this.field1428[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class70(arg0, arg1, arg3, arg2);
        } else {
            var5.method3726();
            var5.method3766();
            var5.method1051(arg0, arg1, arg3, arg2);
        }
        this.field1428[0] = var5;
        if (this.field1427 < 100) {
            this.field1427++;
        }
        return var5;
    }

    @ObfuscatedName("cp.q(IB)Lbd;")
    public class70 method1873(int arg0) {
        return arg0 >= 0 && arg0 < this.field1427 ? this.field1428[arg0] : null;
    }

    @ObfuscatedName("cp.o(I)I")
    public int method1874() {
        return this.field1427;
    }
}
