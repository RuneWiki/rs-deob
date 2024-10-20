package deob;

@ObfuscatedName("el")
public final class class146 {

    @ObfuscatedName("el.q")
    public class176 field1960 = new class176();

    @ObfuscatedName("el.w")
    public int field1962;

    @ObfuscatedName("el.e")
    public int field1961;

    @ObfuscatedName("el.p")
    public class317 field1959;

    @ObfuscatedName("el.k")
    public class266 field1963 = new class266();

    public class146(int arg0) {
        this.field1962 = arg0;
        this.field1961 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1959 = new class317(var2);
    }

    @ObfuscatedName("el.q(J)Lfb;")
    public class176 method3039(long arg0) {
        class176 var3 = (class176) this.field1959.method5451(arg0);
        if (var3 != null) {
            this.field1963.method4565(var3);
        }
        return var3;
    }

    @ObfuscatedName("el.w(J)V")
    public void method3047(long arg0) {
        class176 var3 = (class176) this.field1959.method5451(arg0);
        if (var3 != null) {
            var3.method3286();
            var3.method3276();
            this.field1961++;
        }
    }

    @ObfuscatedName("el.e(Lfb;J)V")
    public void method3041(class176 arg0, long arg1) {
        if (this.field1961 == 0) {
            class176 var4 = this.field1963.method4567();
            var4.method3286();
            var4.method3276();
            if (this.field1960 == var4) {
                class176 var5 = this.field1963.method4567();
                var5.method3286();
                var5.method3276();
            }
        } else {
            this.field1961--;
        }
        this.field1959.method5465(arg0, arg1);
        this.field1963.method4565(arg0);
    }

    @ObfuscatedName("el.p()V")
    public void method3042() {
        this.field1963.method4564();
        this.field1959.method5453();
        this.field1960 = new class176();
        this.field1961 = this.field1962;
    }
}
