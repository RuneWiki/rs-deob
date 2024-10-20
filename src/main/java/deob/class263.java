package deob;

@ObfuscatedName("jf")
public class class263 {

    @ObfuscatedName("jf.s")
    public class179 field3517 = new class179();

    @ObfuscatedName("jf.j")
    public class179 field3516;

    public class263() {
        this.field3517.field2093 = this.field3517;
        this.field3517.field2092 = this.field3517;
    }

    @ObfuscatedName("jf.s(Lfk;)V")
    public void method4510(class179 arg0) {
        if (arg0.field2092 != null) {
            arg0.method3301();
        }
        arg0.field2092 = this.field3517.field2092;
        arg0.field2093 = this.field3517;
        arg0.field2092.field2093 = arg0;
        arg0.field2093.field2092 = arg0;
    }

    @ObfuscatedName("jf.j()Lfk;")
    public class179 method4515() {
        class179 var1 = this.field3517.field2093;
        if (this.field3517 == var1) {
            this.field3516 = null;
            return null;
        } else {
            this.field3516 = var1.field2093;
            return var1;
        }
    }

    @ObfuscatedName("jf.i()Lfk;")
    public class179 method4509() {
        class179 var1 = this.field3516;
        if (this.field3517 == var1) {
            this.field3516 = null;
            return null;
        } else {
            this.field3516 = var1.field2093;
            return var1;
        }
    }
}
