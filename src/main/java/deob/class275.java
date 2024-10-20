package deob;

@ObfuscatedName("jr")
public class class275 extends class276 {

    @ObfuscatedName("jr.m")
    public final class314 field3705;

    public class275(class314 arg0) {
        super(400);
        this.field3705 = arg0;
    }

    @ObfuscatedName("jr.s(I)Ljq;")
    public class274 method4826() {
        return new class277();
    }

    @ObfuscatedName("jr.g(II)[Ljq;")
    public class274[] method4830(int arg0) {
        return new class277[arg0];
    }

    @ObfuscatedName("jr.m(Lgy;II)V")
    public void method4828(class185 arg0, int arg1) {
        while (true) {
            if (arg0.field2514 < arg1) {
                int var3 = arg0.method3239();
                boolean var4 = (var3 & 0x1) == 1;
                class281 var5 = new class281(arg0.method3248(), this.field3705);
                class281 var6 = new class281(arg0.method3248(), this.field3705);
                arg0.method3248();
                if (var5 != null && var5.method4923()) {
                    class277 var7 = (class277) this.method4842(var4 ? var6 : var5);
                    if (var7 != null) {
                        this.method4885(var7, var5, var6);
                        continue;
                    }
                    if (this.method4838() < 400) {
                        class277 var8 = (class277) this.method4847(var5, var6);
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
