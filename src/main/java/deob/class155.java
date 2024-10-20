package deob;

@ObfuscatedName("ex")
public final class class155 {

    @ObfuscatedName("ex.n")
    public class185 field1969 = new class185();

    @ObfuscatedName("ex.v")
    public int field1967;

    @ObfuscatedName("ex.d")
    public int field1968;

    @ObfuscatedName("ex.c")
    public class327 field1966;

    @ObfuscatedName("ex.y")
    public class277 field1970 = new class277();

    public class155(int arg0) {
        this.field1967 = arg0;
        this.field1968 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1966 = new class327(var2);
    }

    @ObfuscatedName("ex.n(J)Lgj;")
    public class185 method3220(long arg0) {
        class185 var3 = (class185) this.field1966.method5648(arg0);
        if (var3 != null) {
            this.field1970.method4772(var3);
        }
        return var3;
    }

    @ObfuscatedName("ex.v(J)V")
    public void method3216(long arg0) {
        class185 var3 = (class185) this.field1966.method5648(arg0);
        if (var3 != null) {
            var3.method3486();
            var3.method3481();
            this.field1968++;
        }
    }

    @ObfuscatedName("ex.d(Lgj;J)V")
    public void method3217(class185 arg0, long arg1) {
        if (this.field1968 == 0) {
            class185 var4 = this.field1970.method4768();
            var4.method3486();
            var4.method3481();
            if (this.field1969 == var4) {
                class185 var5 = this.field1970.method4768();
                var5.method3486();
                var5.method3481();
            }
        } else {
            this.field1968--;
        }
        this.field1966.method5649(arg0, arg1);
        this.field1970.method4772(arg0);
    }

    @ObfuscatedName("ex.c()V")
    public void method3218() {
        this.field1970.method4785();
        this.field1966.method5650();
        this.field1969 = new class185();
        this.field1968 = this.field1967;
    }
}
