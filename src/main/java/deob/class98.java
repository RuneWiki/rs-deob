package deob;

@ObfuscatedName("ck")
public class class98 {

    @ObfuscatedName("ck.i")
    public class70[] field1433 = new class70[100];

    @ObfuscatedName("ck.w")
    public int field1432;

    @ObfuscatedName("ck.p(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbl;")
    public class70 method1865(int arg0, String arg1, String arg2, String arg3) {
        class70 var5 = this.field1433[99];
        for (int var6 = this.field1432; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1433[var6] = this.field1433[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class70(arg0, arg1, arg3, arg2);
        } else {
            var5.method3561();
            var5.method3604();
            var5.method1006(arg0, arg1, arg3, arg2);
        }
        this.field1433[0] = var5;
        if (this.field1432 < 100) {
            this.field1432++;
        }
        return var5;
    }

    @ObfuscatedName("ck.i(IB)Lbl;")
    public class70 method1870(int arg0) {
        return arg0 >= 0 && arg0 < this.field1432 ? this.field1433[arg0] : null;
    }

    @ObfuscatedName("ck.w(S)I")
    public int method1866() {
        return this.field1432;
    }
}
