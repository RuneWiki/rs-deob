package deob;

@ObfuscatedName("fl")
public final class class167 {

    @ObfuscatedName("fl.m")
    public class174 field2792 = new class174();

    @ObfuscatedName("fl.k")
    public int field2790;

    @ObfuscatedName("fl.y")
    public int field2791;

    @ObfuscatedName("fl.g")
    public class169 field2793;

    @ObfuscatedName("fl.r")
    public class173 field2794 = new class173();

    public class167(int arg0) {
        this.field2790 = arg0;
        this.field2791 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2793 = new class169(var2);
    }

    @ObfuscatedName("fl.m(J)Lfw;")
    public class174 method3137(long arg0) {
        class174 var3 = (class174) this.field2793.method3159(arg0);
        if (var3 != null) {
            this.field2794.method3209(var3);
        }
        return var3;
    }

    @ObfuscatedName("fl.k(J)V")
    public void method3139(long arg0) {
        class174 var3 = (class174) this.field2793.method3159(arg0);
        if (var3 != null) {
            var3.method3223();
            var3.method3216();
            this.field2791++;
        }
    }

    @ObfuscatedName("fl.y(Lfw;J)V")
    public void method3130(class174 arg0, long arg1) {
        if (this.field2791 == 0) {
            class174 var4 = this.field2794.method3204();
            var4.method3223();
            var4.method3216();
            if (this.field2792 == var4) {
                class174 var5 = this.field2794.method3204();
                var5.method3223();
                var5.method3216();
            }
        } else {
            this.field2791--;
        }
        this.field2793.method3165(arg0, arg1);
        this.field2794.method3209(arg0);
    }

    @ObfuscatedName("fl.g()V")
    public void method3134() {
        this.field2794.method3202();
        this.field2793.method3153();
        this.field2792 = new class174();
        this.field2791 = this.field2790;
    }
}
