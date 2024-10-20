package deob;

@ObfuscatedName("ld")
public final class class289 {

    @ObfuscatedName("ld.aw")
    public class470 field3077 = new class470();

    @ObfuscatedName("ld.ay")
    public int field3075;

    @ObfuscatedName("ld.ar")
    public int field3076;

    @ObfuscatedName("ld.am")
    public class489 field3074;

    @ObfuscatedName("ld.as")
    public class384 field3078 = new class384();

    public class289(int arg0) {
        this.field3075 = arg0;
        this.field3076 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3074 = new class489(var2);
    }

    @ObfuscatedName("ld.aw(J)Lsh;")
    public class470 method5152(long arg0) {
        class470 var3 = (class470) this.field3074.method7961(arg0);
        if (var3 != null) {
            this.field3078.method6512(var3);
        }
        return var3;
    }

    @ObfuscatedName("ld.ay(J)V")
    public void method5148(long arg0) {
        class470 var3 = (class470) this.field3074.method7961(arg0);
        if (var3 != null) {
            var3.method7662();
            var3.method7660();
            this.field3076++;
        }
    }

    @ObfuscatedName("ld.ar(Lsh;J)V")
    public void method5149(class470 arg0, long arg1) {
        if (this.field3076 == 0) {
            class470 var4 = this.field3078.method6521();
            var4.method7662();
            var4.method7660();
            if (this.field3077 == var4) {
                class470 var5 = this.field3078.method6521();
                var5.method7662();
                var5.method7660();
            }
        } else {
            this.field3076--;
        }
        this.field3074.method7962(arg0, arg1);
        this.field3078.method6512(arg0);
    }

    @ObfuscatedName("ld.am()V")
    public void method5146() {
        this.field3078.method6511();
        this.field3074.method7963();
        this.field3077 = new class470();
        this.field3076 = this.field3075;
    }
}
