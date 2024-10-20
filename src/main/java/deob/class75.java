package deob;

@ObfuscatedName("cb")
public final class class75 extends class248 {

    @ObfuscatedName("cb.ac")
    public int field907;

    @ObfuscatedName("cb.ae")
    public int field906;

    @ObfuscatedName("cb.ag")
    public int field908;

    @ObfuscatedName("cb.am")
    public int field917;

    @ObfuscatedName("cb.ax")
    public int field905;

    @ObfuscatedName("cb.aq")
    public int field909;

    @ObfuscatedName("cb.af")
    public class213 field910;

    @ObfuscatedName("cb.at")
    public int field911 = 0;

    @ObfuscatedName("cb.au")
    public int field912 = 0;

    @ObfuscatedName("cb.ar")
    public boolean field913 = false;

    public class75(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field907 = arg0;
        this.field908 = arg1;
        this.field917 = arg2;
        this.field905 = arg3;
        this.field909 = arg4;
        this.field906 = arg5 + arg6;
        int var8 = class200.method3501(this.field907).field2091;
        if (var8 == -1) {
            this.field913 = true;
        } else {
            this.field913 = false;
            this.field910 = class213.method2555(var8);
        }
    }

    @ObfuscatedName("cb.ac(IB)V")
    public final void method2181(int arg0) {
        if (this.field913) {
            return;
        }
        this.field912 += arg0;
        if (this.field910.method3954()) {
            this.field911 += arg0;
            if (this.field911 >= this.field910.method3999()) {
                this.field913 = true;
            } else {
                client.method311(this.field910, this.field911, this.field917, this.field905, false);
            }
            return;
        }
        while (this.field912 > this.field910.field2316[this.field911]) {
            this.field912 -= this.field910.field2316[this.field911];
            this.field911++;
            if (this.field911 >= this.field910.field2314.length) {
                this.field913 = true;
                break;
            }
            client.method2422(this.field910, this.field911, this.field917, this.field905, false);
        }
    }

    @ObfuscatedName("cb.ad(B)Ljm;")
    public final class256 method2182() {
        class200 var1 = class200.method3501(this.field907);
        class256 var2;
        if (this.field913) {
            var2 = var1.method3676(-1);
        } else {
            var2 = var1.method3676(this.field911);
        }
        return var2 == null ? null : var2;
    }
}
