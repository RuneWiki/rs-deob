package deob;

@ObfuscatedName("gl")
public class class195 {

    @ObfuscatedName("gl.j")
    public class207 field3084 = new class207();

    @ObfuscatedName("gl.l")
    public class207 field3085;

    public class195() {
        this.field3084.field3110 = this.field3084;
        this.field3084.field3109 = this.field3084;
    }

    @ObfuscatedName("gl.j(Lgs;)V")
    public void method3489(class207 arg0) {
        if (arg0.field3109 != null) {
            arg0.method3605();
        }
        arg0.field3109 = this.field3084.field3109;
        arg0.field3110 = this.field3084;
        arg0.field3109.field3110 = arg0;
        arg0.field3110.field3109 = arg0;
    }

    @ObfuscatedName("gl.l()Lgs;")
    public class207 method3495() {
        class207 var1 = this.field3084.field3110;
        if (this.field3084 == var1) {
            this.field3085 = null;
            return null;
        } else {
            this.field3085 = var1.field3110;
            return var1;
        }
    }

    @ObfuscatedName("gl.a()Lgs;")
    public class207 method3491() {
        class207 var1 = this.field3085;
        if (this.field3084 == var1) {
            this.field3085 = null;
            return null;
        } else {
            this.field3085 = var1.field3110;
            return var1;
        }
    }
}
