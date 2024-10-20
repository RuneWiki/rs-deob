package deob;

@ObfuscatedName("ec")
public final class class155 {

    @ObfuscatedName("ec.m")
    public class185 field1979 = new class185();

    @ObfuscatedName("ec.o")
    public int field1978;

    @ObfuscatedName("ec.q")
    public int field1980;

    @ObfuscatedName("ec.j")
    public class326 field1981;

    @ObfuscatedName("ec.p")
    public class276 field1977 = new class276();

    public class155(int arg0) {
        this.field1978 = arg0;
        this.field1980 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1981 = new class326(var2);
    }

    @ObfuscatedName("ec.m(J)Lgf;")
    public class185 method3127(long arg0) {
        class185 var3 = (class185) this.field1981.method5615(arg0);
        if (var3 != null) {
            this.field1977.method4705(var3);
        }
        return var3;
    }

    @ObfuscatedName("ec.o(J)V")
    public void method3128(long arg0) {
        class185 var3 = (class185) this.field1981.method5615(arg0);
        if (var3 != null) {
            var3.method3388();
            var3.method3379();
            this.field1980++;
        }
    }

    @ObfuscatedName("ec.q(Lgf;J)V")
    public void method3137(class185 arg0, long arg1) {
        if (this.field1980 == 0) {
            class185 var4 = this.field1977.method4707();
            var4.method3388();
            var4.method3379();
            if (this.field1979 == var4) {
                class185 var5 = this.field1977.method4707();
                var5.method3388();
                var5.method3379();
            }
        } else {
            this.field1980--;
        }
        this.field1981.method5614(arg0, arg1);
        this.field1977.method4705(arg0);
    }

    @ObfuscatedName("ec.j()V")
    public void method3130() {
        this.field1977.method4713();
        this.field1981.method5617();
        this.field1979 = new class185();
        this.field1980 = this.field1978;
    }
}
