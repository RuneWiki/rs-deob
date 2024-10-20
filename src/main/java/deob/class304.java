package deob;

@ObfuscatedName("ll")
public final class class304 {

    @ObfuscatedName("ll.aq")
    public class488 field3160 = new class488();

    @ObfuscatedName("ll.aw")
    public int field3159;

    @ObfuscatedName("ll.al")
    public int field3158;

    @ObfuscatedName("ll.ai")
    public class507 field3161;

    @ObfuscatedName("ll.ar")
    public class402 field3162 = new class402();

    public class304(int arg0) {
        this.field3159 = arg0;
        this.field3158 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3161 = new class507(var2);
    }

    @ObfuscatedName("ll.aq(J)Lsm;")
    public class488 method5414(long arg0) {
        class488 var3 = (class488) this.field3161.method8299(arg0);
        if (var3 != null) {
            this.field3162.method6836(var3);
        }
        return var3;
    }

    @ObfuscatedName("ll.aw(J)V")
    public void method5416(long arg0) {
        class488 var3 = (class488) this.field3161.method8299(arg0);
        if (var3 != null) {
            var3.method7996();
            var3.method7989();
            this.field3158++;
        }
    }

    @ObfuscatedName("ll.al(Lsm;J)V")
    public void method5421(class488 arg0, long arg1) {
        if (this.field3158 == 0) {
            class488 var4 = this.field3162.method6838();
            var4.method7996();
            var4.method7989();
            if (this.field3160 == var4) {
                class488 var5 = this.field3162.method6838();
                var5.method7996();
                var5.method7989();
            }
        } else {
            this.field3158--;
        }
        this.field3161.method8319(arg0, arg1);
        this.field3162.method6836(arg0);
    }

    @ObfuscatedName("ll.ai()V")
    public void method5418() {
        this.field3162.method6835();
        this.field3161.method8308();
        this.field3160 = new class488();
        this.field3158 = this.field3159;
    }
}
