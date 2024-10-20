package deob;

@ObfuscatedName("hw")
public final class class223 {

    @ObfuscatedName("hw.s")
    public class349 field2560 = new class349();

    @ObfuscatedName("hw.t")
    public int field2557;

    @ObfuscatedName("hw.v")
    public int field2558;

    @ObfuscatedName("hw.j")
    public class363 field2556;

    @ObfuscatedName("hw.l")
    public class301 field2559 = new class301();

    public class223(int arg0) {
        this.field2557 = arg0;
        this.field2558 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2556 = new class363(var2);
    }

    @ObfuscatedName("hw.s(J)Lmw;")
    public class349 method3927(long arg0) {
        class349 var3 = (class349) this.field2556.method5726(arg0);
        if (var3 != null) {
            this.field2559.method4845(var3);
        }
        return var3;
    }

    @ObfuscatedName("hw.t(J)V")
    public void method3936(long arg0) {
        class349 var3 = (class349) this.field2556.method5726(arg0);
        if (var3 != null) {
            var3.method5447();
            var3.method5445();
            this.field2558++;
        }
    }

    @ObfuscatedName("hw.v(Lmw;J)V")
    public void method3929(class349 arg0, long arg1) {
        if (this.field2558 == 0) {
            class349 var4 = this.field2559.method4847();
            var4.method5447();
            var4.method5445();
            if (this.field2560 == var4) {
                class349 var5 = this.field2559.method4847();
                var5.method5447();
                var5.method5445();
            }
        } else {
            this.field2558--;
        }
        this.field2556.method5737(arg0, arg1);
        this.field2559.method4845(arg0);
    }

    @ObfuscatedName("hw.j()V")
    public void method3930() {
        this.field2559.method4844();
        this.field2556.method5725();
        this.field2560 = new class349();
        this.field2558 = this.field2557;
    }
}
