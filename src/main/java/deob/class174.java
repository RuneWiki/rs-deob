package deob;

@ObfuscatedName("fl")
public final class class174 {

    @ObfuscatedName("fl.e")
    public class185 field2859 = new class185();

    @ObfuscatedName("fl.v")
    public int field2858;

    @ObfuscatedName("fl.k")
    public int field2860;

    @ObfuscatedName("fl.g")
    public class177 field2861;

    @ObfuscatedName("fl.q")
    public class184 field2862 = new class184();

    public class174(int arg0) {
        this.field2858 = arg0;
        this.field2860 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2861 = new class177(var2);
    }

    @ObfuscatedName("fl.e(J)Lgr;")
    public class185 method3154(long arg0) {
        class185 var3 = (class185) this.field2861.method3192(arg0);
        if (var3 != null) {
            this.field2862.method3285(var3);
        }
        return var3;
    }

    @ObfuscatedName("fl.v(J)V")
    public void method3155(long arg0) {
        class185 var3 = (class185) this.field2861.method3192(arg0);
        if (var3 != null) {
            var3.method3324();
            var3.method3299();
            this.field2860++;
        }
    }

    @ObfuscatedName("fl.k(Lgr;J)V")
    public void method3156(class185 arg0, long arg1) {
        if (this.field2860 == 0) {
            class185 var4 = this.field2862.method3284();
            var4.method3324();
            var4.method3299();
            if (this.field2859 == var4) {
                class185 var5 = this.field2862.method3284();
                var5.method3324();
                var5.method3299();
            }
        } else {
            this.field2860--;
        }
        this.field2861.method3193(arg0, arg1);
        this.field2862.method3285(arg0);
    }

    @ObfuscatedName("fl.g()V")
    public void method3157() {
        this.field2862.method3286();
        this.field2861.method3194();
        this.field2859 = new class185();
        this.field2860 = this.field2858;
    }
}
