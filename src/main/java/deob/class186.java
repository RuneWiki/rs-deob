package deob;

@ObfuscatedName("gr")
public abstract class class186 {

    @ObfuscatedName("gr.w")
    public final class245 field2110;

    @ObfuscatedName("gr.f")
    public final class245 field2111;

    @ObfuscatedName("gr.o")
    public int field2112;

    @ObfuscatedName("gr.x")
    public int field2109;

    public class186(class245 arg0, class245 arg1) {
        this.field2111 = arg0;
        this.field2110 = arg1;
    }

    @ObfuscatedName("gr.d(IIB)Z")
    public boolean method3282(int arg0, int arg1) {
        if (this.method3285(arg0, arg1)) {
            return true;
        } else {
            return this.method3293(arg0, arg1);
        }
    }

    @ObfuscatedName("gr.y(I)Z")
    public boolean method3284() {
        return this.method2921() >= 0;
    }

    @ObfuscatedName("gr.g(IIB)Z")
    public boolean method3285(int arg0, int arg1) {
        if (!this.method3284()) {
            return false;
        }
        class141 var3 = class141.method1794(this.method2921());
        int var4 = this.method2923();
        int var5 = this.method2940();
        switch(var3.field1540.field1611) {
            case 0:
                if (arg0 >= this.field2112 - var4 / 2 && arg0 <= var4 / 2 + this.field2112) {
                    break;
                }
                return false;
            case 1:
                if (arg0 >= this.field2112 && arg0 < this.field2112 + var4) {
                    break;
                }
                return false;
            case 2:
                if (arg0 <= this.field2112 - var4 || arg0 > this.field2112) {
                    return false;
                }
        }
        switch(var3.field1550.field1658) {
            case 0:
                if (arg1 >= this.field2109 - var5 / 2 && arg1 <= var5 / 2 + this.field2109) {
                    break;
                }
                return false;
            case 1:
                if (arg1 <= this.field2109 - var5 || arg1 > this.field2109) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field2109 || arg1 >= this.field2109 + var5) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("gr.ae(III)Z")
    public boolean method3293(int arg0, int arg1) {
        class181 var3 = this.method2922();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field2112 - var3.field2079 / 2 && arg0 <= var3.field2079 / 2 + this.field2112) {
            return arg1 >= this.field2109 && arg1 <= this.field2109 + var3.field2085;
        } else {
            return false;
        }
    }

    @ObfuscatedName("gr.t(I)I")
    public abstract int method2921();

    @ObfuscatedName("gr.v(B)Lff;")
    public abstract class181 method2922();

    @ObfuscatedName("gr.l(I)I")
    public abstract int method2940();

    @ObfuscatedName("gr.j(I)I")
    public abstract int method2923();
}
