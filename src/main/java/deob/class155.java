package deob;

@ObfuscatedName("ev")
public final class class155 {

    @ObfuscatedName("ev.f")
    public class185 field1979 = new class185();

    @ObfuscatedName("ev.b")
    public int field1977;

    @ObfuscatedName("ev.l")
    public int field1978;

    @ObfuscatedName("ev.m")
    public class327 field1980;

    @ObfuscatedName("ev.z")
    public class277 field1976 = new class277();

    public class155(int arg0) {
        this.field1977 = arg0;
        this.field1978 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1980 = new class327(var2);
    }

    @ObfuscatedName("ev.f(J)Lgp;")
    public class185 method3155(long arg0) {
        class185 var3 = (class185) this.field1980.method5561(arg0);
        if (var3 != null) {
            this.field1976.method4694(var3);
        }
        return var3;
    }

    @ObfuscatedName("ev.b(J)V")
    public void method3154(long arg0) {
        class185 var3 = (class185) this.field1980.method5561(arg0);
        if (var3 != null) {
            var3.method3407();
            var3.method3400();
            this.field1978++;
        }
    }

    @ObfuscatedName("ev.l(Lgp;J)V")
    public void method3157(class185 arg0, long arg1) {
        if (this.field1978 == 0) {
            class185 var4 = this.field1976.method4696();
            var4.method3407();
            var4.method3400();
            if (this.field1979 == var4) {
                class185 var5 = this.field1976.method4696();
                var5.method3407();
                var5.method3400();
            }
        } else {
            this.field1978--;
        }
        this.field1980.method5576(arg0, arg1);
        this.field1976.method4694(arg0);
    }

    @ObfuscatedName("ev.m()V")
    public void method3158() {
        this.field1976.method4693();
        this.field1980.method5563();
        this.field1979 = new class185();
        this.field1978 = this.field1977;
    }
}
