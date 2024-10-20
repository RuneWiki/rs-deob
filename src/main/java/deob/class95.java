package deob;

@ObfuscatedName("cs")
public class class95 {

    @ObfuscatedName("cs.f")
    public class65[] field1298 = new class65[100];

    @ObfuscatedName("cs.b")
    public int field1299;

    @ObfuscatedName("cs.u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lba;")
    public class65 method2066(int arg0, String arg1, String arg2, String arg3) {
        class65 var5 = this.field1298[99];
        for (int var6 = this.field1299; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1298[var6] = this.field1298[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class65(arg0, arg1, arg3, arg2);
        } else {
            var5.method3332();
            var5.method3319();
            var5.method1073(arg0, arg1, arg3, arg2);
        }
        this.field1298[0] = var5;
        if (this.field1299 < 100) {
            this.field1299++;
        }
        return var5;
    }

    @ObfuscatedName("cs.f(IB)Lba;")
    public class65 method2059(int arg0) {
        return arg0 >= 0 && arg0 < this.field1299 ? this.field1298[arg0] : null;
    }

    @ObfuscatedName("cs.b(B)I")
    public int method2060() {
        return this.field1299;
    }
}
