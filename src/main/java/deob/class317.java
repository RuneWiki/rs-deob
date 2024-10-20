package deob;

@ObfuscatedName("ml")
public final class class317 {

    @ObfuscatedName("ml.ac")
    public class504 field3289 = new class504();

    @ObfuscatedName("ml.ae")
    public int field3290;

    @ObfuscatedName("ml.ag")
    public int field3291;

    @ObfuscatedName("ml.am")
    public class523 field3293;

    @ObfuscatedName("ml.ax")
    public class415 field3292 = new class415();

    public class317(int arg0) {
        this.field3290 = arg0;
        this.field3291 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3293 = new class523(var2);
    }

    @ObfuscatedName("ml.ac(J)Ltr;")
    public class504 method5733(long arg0) {
        class504 var3 = (class504) this.field3293.method8666(arg0);
        if (var3 != null) {
            this.field3292.method7157(var3);
        }
        return var3;
    }

    @ObfuscatedName("ml.ae(J)V")
    public void method5732(long arg0) {
        class504 var3 = (class504) this.field3293.method8666(arg0);
        if (var3 != null) {
            var3.method8362();
            var3.method8359();
            this.field3291++;
        }
    }

    @ObfuscatedName("ml.ag(Ltr;J)V")
    public void method5735(class504 arg0, long arg1) {
        if (this.field3291 == 0) {
            class504 var4 = this.field3292.method7163();
            var4.method8362();
            var4.method8359();
            if (this.field3289 == var4) {
                class504 var5 = this.field3292.method7163();
                var5.method8362();
                var5.method8359();
            }
        } else {
            this.field3291--;
        }
        this.field3293.method8663(arg0, arg1);
        this.field3292.method7157(arg0);
    }

    @ObfuscatedName("ml.am()V")
    public void method5736() {
        this.field3292.method7165();
        this.field3293.method8664();
        this.field3289 = new class504();
        this.field3291 = this.field3290;
    }
}
