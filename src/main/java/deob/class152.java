package deob;

@ObfuscatedName("ek")
public class class152 {

    @ObfuscatedName("ek.d")
    public class153 field2040 = new class153();

    @ObfuscatedName("ek.c")
    public class153 field2039;

    public class152() {
        this.field2040.field2042 = this.field2040;
        this.field2040.field2041 = this.field2040;
    }

    @ObfuscatedName("ek.d(Leo;)V")
    public void method2694(class153 arg0) {
        if (arg0.field2041 != null) {
            arg0.method2703();
        }
        arg0.field2041 = this.field2040.field2041;
        arg0.field2042 = this.field2040;
        arg0.field2041.field2042 = arg0;
        arg0.field2042.field2041 = arg0;
    }

    @ObfuscatedName("ek.c()Leo;")
    public class153 method2695() {
        class153 var1 = this.field2040.field2042;
        if (this.field2040 == var1) {
            this.field2039 = null;
            return null;
        } else {
            this.field2039 = var1.field2042;
            return var1;
        }
    }

    @ObfuscatedName("ek.n()Leo;")
    public class153 method2696() {
        class153 var1 = this.field2039;
        if (this.field2040 == var1) {
            this.field2039 = null;
            return null;
        } else {
            this.field2039 = var1.field2042;
            return var1;
        }
    }
}
