package deob;

@ObfuscatedName("dh")
public class class84 {

    @ObfuscatedName("dh.aw")
    public class65[] field1030 = new class65[100];

    @ObfuscatedName("dh.ak")
    public int field1031;

    @ObfuscatedName("dh.ap(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lce;")
    public class65 method2375(int arg0, String arg1, String arg2, String arg3) {
        class65 var5 = this.field1030[99];
        for (int var6 = this.field1031; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1030[var6] = this.field1030[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class65(arg0, arg1, arg3, arg2);
        } else {
            var5.method8667();
            var5.method8665();
            var5.method1166(arg0, arg1, arg3, arg2);
        }
        this.field1030[0] = var5;
        if (this.field1031 < 100) {
            this.field1031++;
        }
        return var5;
    }

    @ObfuscatedName("dh.aw(IB)Lce;")
    public class65 method2376(int arg0) {
        return arg0 >= 0 && arg0 < this.field1031 ? this.field1030[arg0] : null;
    }

    @ObfuscatedName("dh.ak(I)I")
    public int method2377() {
        return this.field1031;
    }
}
