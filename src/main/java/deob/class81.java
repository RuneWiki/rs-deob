package deob;

@ObfuscatedName("dm")
public class class81 {

    @ObfuscatedName("dm.an")
    public class65[] field1011 = new class65[100];

    @ObfuscatedName("dm.av")
    public int field1012;

    @ObfuscatedName("dm.at(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;S)Lcg;")
    public class65 method2058(int arg0, String arg1, String arg2, String arg3) {
        class65 var5 = this.field1011[99];
        for (int var6 = this.field1012; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1011[var6] = this.field1011[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class65(arg0, arg1, arg3, arg2);
        } else {
            var5.method7560();
            var5.method7554();
            var5.method1081(arg0, arg1, arg3, arg2);
        }
        this.field1011[0] = var5;
        if (this.field1012 < 100) {
            this.field1012++;
        }
        return var5;
    }

    @ObfuscatedName("dm.an(II)Lcg;")
    public class65 method2059(int arg0) {
        return arg0 >= 0 && arg0 < this.field1012 ? this.field1011[arg0] : null;
    }

    @ObfuscatedName("dm.av(I)I")
    public int method2057() {
        return this.field1012;
    }
}
