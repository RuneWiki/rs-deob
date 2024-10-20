package deob;

@ObfuscatedName("eo")
public class class147 extends class129 {

    @ObfuscatedName("eo.i")
    public class104 field2219 = new class104();

    @ObfuscatedName("eo.e")
    public class104 field2217 = new class104();

    @ObfuscatedName("eo.a")
    public int field2218 = 0;

    @ObfuscatedName("eo.g")
    public int field2216 = -1;

    @ObfuscatedName("eo.ak(Ldb;)V")
    public final synchronized void method2172(class129 arg0) {
        this.field2219.method1281(arg0);
    }

    @ObfuscatedName("eo.ap(Ldb;)V")
    public final synchronized void method2181(class129 arg0) {
        arg0.method1307();
    }

    @ObfuscatedName("eo.ai()V")
    public void method2173() {
        if (this.field2218 <= 0) {
            return;
        }
        for (class131 var1 = (class131) this.field2217.method1305(); var1 != null; var1 = (class131) this.field2217.method1287()) {
            var1.field1677 -= this.field2218;
        }
        this.field2216 -= this.field2218;
        this.field2218 = 0;
    }

    @ObfuscatedName("eo.ae(Ldd;Led;)V")
    public void method2177(class106 arg0, class131 arg1) {
        while (this.field2217.field1495 != arg0 && ((class131) arg0).field1677 <= arg1.field1677) {
            arg0 = arg0.field1498;
        }
        class104.method1282(arg1, arg0);
        this.field2216 = ((class131) this.field2217.field1495.field1498).field1677;
    }

    @ObfuscatedName("eo.ad(Led;)V")
    public void method2174(class131 arg0) {
        arg0.method1307();
        arg0.method1540();
        class106 var2 = this.field2217.field1495.field1498;
        if (this.field2217.field1495 == var2) {
            this.field2216 = -1;
        } else {
            this.field2216 = ((class131) var2).field1677;
        }
    }

    @ObfuscatedName("eo.l()Ldb;")
    public class129 method1512() {
        return (class129) this.field2219.method1305();
    }

    @ObfuscatedName("eo.i()Ldb;")
    public class129 method1493() {
        return (class129) this.field2219.method1287();
    }

    @ObfuscatedName("eo.e()I")
    public int method1504() {
        return 0;
    }

    @ObfuscatedName("eo.g([III)V")
    public final synchronized void method1499(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2216 < 0) {
                this.method2171(arg0, arg1, arg2);
                return;
            }
            if (this.field2218 + arg2 < this.field2216) {
                this.field2218 += arg2;
                this.method2171(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2216 - this.field2218;
            this.method2171(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2218 += var4;
            this.method2173();
            class131 var5 = (class131) this.field2217.method1305();
            synchronized (var5) {
                int var7 = var5.method1538(this);
                if (var7 < 0) {
                    var5.field1677 = 0;
                    this.method2174(var5);
                } else {
                    var5.field1677 = var7;
                    this.method2177(var5.field1498, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("eo.am([III)V")
    public void method2171(int[] arg0, int arg1, int arg2) {
        for (class129 var4 = (class129) this.field2219.method1305(); var4 != null; var4 = (class129) this.field2219.method1287()) {
            var4.method1498(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("eo.w(I)V")
    public final synchronized void method1500(int arg0) {
        do {
            if (this.field2216 < 0) {
                this.method2178(arg0);
                return;
            }
            if (this.field2218 + arg0 < this.field2216) {
                this.field2218 += arg0;
                this.method2178(arg0);
                return;
            }
            int var2 = this.field2216 - this.field2218;
            this.method2178(var2);
            arg0 -= var2;
            this.field2218 += var2;
            this.method2173();
            class131 var3 = (class131) this.field2217.method1305();
            synchronized (var3) {
                int var5 = var3.method1538(this);
                if (var5 < 0) {
                    var3.field1677 = 0;
                    this.method2174(var3);
                } else {
                    var3.field1677 = var5;
                    this.method2177(var3.field1498, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("eo.ah(I)V")
    public void method2178(int arg0) {
        for (class129 var2 = (class129) this.field2219.method1305(); var2 != null; var2 = (class129) this.field2219.method1287()) {
            var2.method1500(arg0);
        }
    }
}
