package deob;

@ObfuscatedName("gl")
public final class class190 {

    @ObfuscatedName("gl.d")
    public class195 field2476 = new class195();

    @ObfuscatedName("gl.k")
    public int field2473;

    @ObfuscatedName("gl.e")
    public int field2475;

    @ObfuscatedName("gl.p")
    public class191 field2474;

    @ObfuscatedName("gl.q")
    public class185 field2477 = new class185();

    public class190(int arg0) {
        this.field2473 = arg0;
        this.field2475 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2474 = new class191(var2);
    }

    @ObfuscatedName("gl.d(J)Lgg;")
    public class195 method3341(long arg0) {
        class195 var3 = (class195) this.field2474.method3352(arg0);
        if (var3 != null) {
            this.field2477.method3309(var3);
        }
        return var3;
    }

    @ObfuscatedName("gl.k(J)V")
    public void method3342(long arg0) {
        class195 var3 = (class195) this.field2474.method3352(arg0);
        if (var3 != null) {
            var3.method3407();
            var3.method3449();
            this.field2475++;
        }
    }

    @ObfuscatedName("gl.e(Lgg;J)V")
    public void method3343(class195 arg0, long arg1) {
        if (this.field2475 == 0) {
            class195 var4 = this.field2477.method3297();
            var4.method3407();
            var4.method3449();
            if (this.field2476 == var4) {
                class195 var5 = this.field2477.method3297();
                var5.method3407();
                var5.method3449();
            }
        } else {
            this.field2475--;
        }
        this.field2474.method3358(arg0, arg1);
        this.field2477.method3309(arg0);
    }

    @ObfuscatedName("gl.p()V")
    public void method3345() {
        this.field2477.method3299();
        this.field2474.method3354();
        this.field2476 = new class195();
        this.field2475 = this.field2473;
    }
}
