package deob;

@ObfuscatedName("fo")
public final class class171 {

    @ObfuscatedName("fo.e")
    public class182 field2831 = new class182();

    @ObfuscatedName("fo.v")
    public int field2829;

    @ObfuscatedName("fo.i")
    public int field2830;

    @ObfuscatedName("fo.g")
    public class174 field2832;

    @ObfuscatedName("fo.x")
    public class181 field2833 = new class181();

    public class171(int arg0) {
        this.field2829 = arg0;
        this.field2830 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2832 = new class174(var2);
    }

    @ObfuscatedName("fo.e(J)Lfa;")
    public class182 method3136(long arg0) {
        class182 var3 = (class182) this.field2832.method3171(arg0);
        if (var3 != null) {
            this.field2833.method3238(var3);
        }
        return var3;
    }

    @ObfuscatedName("fo.v(J)V")
    public void method3126(long arg0) {
        class182 var3 = (class182) this.field2832.method3171(arg0);
        if (var3 != null) {
            var3.method3273();
            var3.method3254();
            this.field2830++;
        }
    }

    @ObfuscatedName("fo.i(Lfa;J)V")
    public void method3127(class182 arg0, long arg1) {
        if (this.field2830 == 0) {
            class182 var4 = this.field2833.method3241();
            var4.method3273();
            var4.method3254();
            if (this.field2831 == var4) {
                class182 var5 = this.field2833.method3241();
                var5.method3273();
                var5.method3254();
            }
        } else {
            this.field2830--;
        }
        this.field2832.method3168(arg0, arg1);
        this.field2833.method3238(arg0);
    }

    @ObfuscatedName("fo.g()V")
    public void method3128() {
        this.field2833.method3249();
        this.field2832.method3159();
        this.field2831 = new class182();
        this.field2830 = this.field2829;
    }
}
