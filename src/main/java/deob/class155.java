package deob;

@ObfuscatedName("eg")
public final class class155 {

    @ObfuscatedName("eg.x")
    public class185 field1974 = new class185();

    @ObfuscatedName("eg.m")
    public int field1970;

    @ObfuscatedName("eg.k")
    public int field1972;

    @ObfuscatedName("eg.d")
    public class326 field1973;

    @ObfuscatedName("eg.w")
    public class276 field1971 = new class276();

    public class155(int arg0) {
        this.field1970 = arg0;
        this.field1972 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1973 = new class326(var2);
    }

    @ObfuscatedName("eg.x(J)Lge;")
    public class185 method3146(long arg0) {
        class185 var3 = (class185) this.field1973.method5519(arg0);
        if (var3 != null) {
            this.field1971.method4627(var3);
        }
        return var3;
    }

    @ObfuscatedName("eg.m(J)V")
    public void method3139(long arg0) {
        class185 var3 = (class185) this.field1973.method5519(arg0);
        if (var3 != null) {
            var3.method3355();
            var3.method3351();
            this.field1972++;
        }
    }

    @ObfuscatedName("eg.k(Lge;J)V")
    public void method3152(class185 arg0, long arg1) {
        if (this.field1972 == 0) {
            class185 var4 = this.field1971.method4621();
            var4.method3355();
            var4.method3351();
            if (this.field1974 == var4) {
                class185 var5 = this.field1971.method4621();
                var5.method3355();
                var5.method3351();
            }
        } else {
            this.field1972--;
        }
        this.field1973.method5514(arg0, arg1);
        this.field1971.method4627(arg0);
    }

    @ObfuscatedName("eg.d()V")
    public void method3141() {
        this.field1971.method4638();
        this.field1973.method5515();
        this.field1974 = new class185();
        this.field1972 = this.field1970;
    }
}
