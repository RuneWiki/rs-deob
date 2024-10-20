package deob;

@ObfuscatedName("co")
public class class87 {

    @ObfuscatedName("co.m")
    public class59[] field1239 = new class59[100];

    @ObfuscatedName("co.q")
    public int field1237;

    @ObfuscatedName("co.w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbn;")
    public class59 method1864(int arg0, String arg1, String arg2, String arg3) {
        class59 var5 = this.field1239[99];
        for (int var6 = this.field1237; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1239[var6] = this.field1239[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class59(arg0, arg1, arg3, arg2);
        } else {
            var5.method3782();
            var5.method3819();
            var5.method1015(arg0, arg1, arg3, arg2);
        }
        this.field1239[0] = var5;
        if (this.field1237 < 100) {
            this.field1237++;
        }
        return var5;
    }

    @ObfuscatedName("co.m(IB)Lbn;")
    public class59 method1867(int arg0) {
        return arg0 >= 0 && arg0 < this.field1237 ? this.field1239[arg0] : null;
    }

    @ObfuscatedName("co.q(I)I")
    public int method1865() {
        return this.field1237;
    }
}
