package deob;

@ObfuscatedName("ms")
public final class class315 {

    @ObfuscatedName("ms.ab")
    public class502 field3246 = new class502();

    @ObfuscatedName("ms.ay")
    public int field3245;

    @ObfuscatedName("ms.an")
    public int field3243;

    @ObfuscatedName("ms.au")
    public class521 field3244;

    @ObfuscatedName("ms.ax")
    public class413 field3247 = new class413();

    public class315(int arg0) {
        this.field3245 = arg0;
        this.field3243 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3244 = new class521(var2);
    }

    @ObfuscatedName("ms.ab(J)Lta;")
    public class502 method5586(long arg0) {
        class502 var3 = (class502) this.field3244.method8512(arg0);
        if (var3 != null) {
            this.field3247.method7043(var3);
        }
        return var3;
    }

    @ObfuscatedName("ms.ay(J)V")
    public void method5587(long arg0) {
        class502 var3 = (class502) this.field3244.method8512(arg0);
        if (var3 != null) {
            var3.method8218();
            var3.method8217();
            this.field3243++;
        }
    }

    @ObfuscatedName("ms.an(Lta;J)V")
    public void method5589(class502 arg0, long arg1) {
        if (this.field3243 == 0) {
            class502 var4 = this.field3247.method7032();
            var4.method8218();
            var4.method8217();
            if (this.field3246 == var4) {
                class502 var5 = this.field3247.method7032();
                var5.method8218();
                var5.method8217();
            }
        } else {
            this.field3243--;
        }
        this.field3244.method8513(arg0, arg1);
        this.field3247.method7043(arg0);
    }

    @ObfuscatedName("ms.au()V")
    public void method5588() {
        this.field3247.method7029();
        this.field3244.method8530();
        this.field3246 = new class502();
        this.field3243 = this.field3245;
    }
}
