package deob;

@ObfuscatedName("el")
public final class class155 {

    @ObfuscatedName("el.z")
    public class185 field1996 = new class185();

    @ObfuscatedName("el.k")
    public int field1993;

    @ObfuscatedName("el.s")
    public int field1994;

    @ObfuscatedName("el.t")
    public class326 field1995;

    @ObfuscatedName("el.i")
    public class276 field1992 = new class276();

    public class155(int arg0) {
        this.field1993 = arg0;
        this.field1994 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1995 = new class326(var2);
    }

    @ObfuscatedName("el.z(J)Lgs;")
    public class185 method3170(long arg0) {
        class185 var3 = (class185) this.field1995.method5582(arg0);
        if (var3 != null) {
            this.field1992.method4679(var3);
        }
        return var3;
    }

    @ObfuscatedName("el.k(J)V")
    public void method3182(long arg0) {
        class185 var3 = (class185) this.field1995.method5582(arg0);
        if (var3 != null) {
            var3.method3401();
            var3.method3395();
            this.field1994++;
        }
    }

    @ObfuscatedName("el.s(Lgs;J)V")
    public void method3169(class185 arg0, long arg1) {
        if (this.field1994 == 0) {
            class185 var4 = this.field1992.method4681();
            var4.method3401();
            var4.method3395();
            if (this.field1996 == var4) {
                class185 var5 = this.field1992.method4681();
                var5.method3401();
                var5.method3395();
            }
        } else {
            this.field1994--;
        }
        this.field1995.method5583(arg0, arg1);
        this.field1992.method4679(arg0);
    }

    @ObfuscatedName("el.t()V")
    public void method3172() {
        this.field1992.method4691();
        this.field1995.method5584();
        this.field1996 = new class185();
        this.field1994 = this.field1993;
    }
}
