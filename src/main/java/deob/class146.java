package deob;

@ObfuscatedName("eh")
public final class class146 {

    @ObfuscatedName("eh.c")
    public class176 field1951 = new class176();

    @ObfuscatedName("eh.t")
    public int field1948;

    @ObfuscatedName("eh.o")
    public int field1949;

    @ObfuscatedName("eh.e")
    public class317 field1950;

    @ObfuscatedName("eh.i")
    public class267 field1947 = new class267();

    public class146(int arg0) {
        this.field1948 = arg0;
        this.field1949 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1950 = new class317(var2);
    }

    @ObfuscatedName("eh.c(J)Lfa;")
    public class176 method3100(long arg0) {
        class176 var3 = (class176) this.field1950.method5510(arg0);
        if (var3 != null) {
            this.field1947.method4629(var3);
        }
        return var3;
    }

    @ObfuscatedName("eh.t(J)V")
    public void method3101(long arg0) {
        class176 var3 = (class176) this.field1950.method5510(arg0);
        if (var3 != null) {
            var3.method3351();
            var3.method3342();
            this.field1949++;
        }
    }

    @ObfuscatedName("eh.o(Lfa;J)V")
    public void method3102(class176 arg0, long arg1) {
        if (this.field1949 == 0) {
            class176 var4 = this.field1947.method4613();
            var4.method3351();
            var4.method3342();
            if (this.field1951 == var4) {
                class176 var5 = this.field1947.method4613();
                var5.method3351();
                var5.method3342();
            }
        } else {
            this.field1949--;
        }
        this.field1950.method5496(arg0, arg1);
        this.field1947.method4629(arg0);
    }

    @ObfuscatedName("eh.e()V")
    public void method3103() {
        this.field1947.method4614();
        this.field1950.method5497();
        this.field1951 = new class176();
        this.field1949 = this.field1948;
    }
}
