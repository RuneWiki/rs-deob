package deob;

@ObfuscatedName("gr")
public final class class184 {

    @ObfuscatedName("gr.t")
    public class195 field2981 = new class195();

    @ObfuscatedName("gr.b")
    public int field2979;

    @ObfuscatedName("gr.p")
    public int field2978;

    @ObfuscatedName("gr.e")
    public class187 field2982;

    @ObfuscatedName("gr.i")
    public class194 field2980 = new class194();

    public class184(int arg0) {
        this.field2979 = arg0;
        this.field2978 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2982 = new class187(var2);
    }

    @ObfuscatedName("gr.t(J)Lgl;")
    public class195 method3339(long arg0) {
        class195 var3 = (class195) this.field2982.method3382(arg0);
        if (var3 != null) {
            this.field2980.method3472(var3);
        }
        return var3;
    }

    @ObfuscatedName("gr.b(J)V")
    public void method3340(long arg0) {
        class195 var3 = (class195) this.field2982.method3382(arg0);
        if (var3 != null) {
            var3.method3506();
            var3.method3484();
            this.field2978++;
        }
    }

    @ObfuscatedName("gr.p(Lgl;J)V")
    public void method3341(class195 arg0, long arg1) {
        if (this.field2978 == 0) {
            class195 var4 = this.field2980.method3471();
            var4.method3506();
            var4.method3484();
            if (this.field2981 == var4) {
                class195 var5 = this.field2980.method3471();
                var5.method3506();
                var5.method3484();
            }
        } else {
            this.field2978--;
        }
        this.field2982.method3391(arg0, arg1);
        this.field2980.method3472(arg0);
    }

    @ObfuscatedName("gr.e()V")
    public void method3342() {
        this.field2980.method3473();
        this.field2982.method3380();
        this.field2981 = new class195();
        this.field2978 = this.field2979;
    }
}
