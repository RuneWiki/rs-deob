package deob;

@ObfuscatedName("fl")
public final class class169 {

    @ObfuscatedName("fl.v")
    public class173 field2795 = new class173();

    @ObfuscatedName("fl.f")
    public int field2793;

    @ObfuscatedName("fl.n")
    public int field2791;

    @ObfuscatedName("fl.c")
    public class174 field2794;

    @ObfuscatedName("fl.r")
    public class171 field2792 = new class171();

    public class169(int arg0) {
        this.field2793 = arg0;
        this.field2791 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2794 = new class174(var2);
    }

    @ObfuscatedName("fl.v(J)Lfv;")
    public class173 method3224(long arg0) {
        class173 var3 = (class173) this.field2794.method3270(arg0);
        if (var3 != null) {
            this.field2792.method3235(var3);
        }
        return var3;
    }

    @ObfuscatedName("fl.f(J)V")
    public void method3225(long arg0) {
        class173 var3 = (class173) this.field2794.method3270(arg0);
        if (var3 != null) {
            var3.method3320();
            var3.method3265();
            this.field2791++;
        }
    }

    @ObfuscatedName("fl.n(Lfv;J)V")
    public void method3231(class173 arg0, long arg1) {
        if (this.field2791 == 0) {
            class173 var4 = this.field2792.method3244();
            var4.method3320();
            var4.method3265();
            if (this.field2795 == var4) {
                class173 var5 = this.field2792.method3244();
                var5.method3320();
                var5.method3265();
            }
        } else {
            this.field2791--;
        }
        this.field2794.method3284(arg0, arg1);
        this.field2792.method3235(arg0);
    }

    @ObfuscatedName("fl.c()V")
    public void method3227() {
        this.field2792.method3238();
        this.field2794.method3283();
        this.field2795 = new class173();
        this.field2791 = this.field2793;
    }
}
